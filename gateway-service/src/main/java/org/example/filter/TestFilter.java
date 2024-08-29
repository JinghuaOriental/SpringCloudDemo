package org.example.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * @author Aaso
 * @version 1.0
 */
// 使用@Component注解来声明TestFilter为Spring容器管理的组件。
// 这使得Spring可以自动识别这个过滤器并将其加入到应用上下文中。
@Component
public class TestFilter implements GlobalFilter {

    // 实现GlobalFilter接口必须实现的方法filter。
    // 这个方法将在请求通过Spring Cloud Gateway时被调用。
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // ServerWebExchange接口提供对当前HTTP请求-响应交换的访问。
        // 这里获取到当前交换中的HTTP请求对象，不同于传统的HttpServletRequest。
        ServerHttpRequest request = exchange.getRequest();

        // 使用System.out.println打印出请求中的所有查询参数。
        // 这对于调试和日志记录可能很有用，但在生产环境中应考虑使用日志框架来减少性能开销和提供更多灵活性。
        System.out.println(request.getQueryParams());

        // 从查询参数中获取名为"test"的参数值列表。
        List<String> value = request.getQueryParams().get("test");

        // 检查获取到的参数列表是否非空且包含字符串"1"。
        if(value != null && value.contains("1")) {
            // 如果条件满足，则继续将请求传递到过滤器链中的下一个过滤器。
            // 这允许请求继续通过网关的其他过滤处理。
            return chain.filter(exchange);
        } else {
            // 如果条件不满足（即参数列表为空或不包含"1"），则不再将请求向下传递。
            // 直接返回响应，这通过调用setComplete()方法完成，它会结束当前的请求-响应周期。
            return exchange.getResponse().setComplete();
        }
    }
}

package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;

// import javax.persistence.*;

/**
 * @author Aaso
 * @version 1.0
 */
@Entity
@Table(name = "book")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int bid;
    String title;
    String price;
    String desc;
}

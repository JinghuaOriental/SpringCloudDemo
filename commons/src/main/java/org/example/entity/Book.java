package org.example.entity;

import lombok.Data;

import javax.persistence.*;

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
    @Column(name = "book_id")
    int bookId;
    String title;
    String price;
    String desc;
}

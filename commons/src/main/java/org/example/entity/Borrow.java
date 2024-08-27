package org.example.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Aaso
 * @version 1.0
 */
@Data
@Entity
@Table(name = "borrow")
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    int uid;
    int bid;
}

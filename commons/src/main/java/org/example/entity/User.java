package org.example.entity;


import lombok.Data;

import jakarta.persistence.*;

/**
 * Represents a user entity with a mapping to the database field.
 *
 * @author Aaso
 * @version 1.0
 */
@Entity
@Table(name = "student")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // @Column(name = "student_id")
    //TODO: 映射失败
    int uid;
    String name;
    String gender;
    int grade;
}
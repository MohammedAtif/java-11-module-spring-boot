package com.module.one.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user_data")
@Data
public class UserData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;
}

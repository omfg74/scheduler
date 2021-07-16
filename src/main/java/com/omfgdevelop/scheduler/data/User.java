package com.omfgdevelop.scheduler.data;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class User {


    @Id
    private Long id;

    private String name;

    private String lastName;

    private String patronymic;

}

package com.omfgdevelop.scheduler.data;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "boats")
public class Boat {


    @Id
    private Long id;

    private String name;

    private Integer number;

    private String type;

    private Integer passengers;

    @JoinColumn
    private Schedule schedule;
}

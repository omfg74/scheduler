package com.omfgdevelop.scheduler.data;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "main_schedule")
public class Schedule {

    @Id
    private Long id;

    private Date date;

    @ManyToMany
    private Boat boat;

    private String location;

    private LocalDateTime dateTime;

}

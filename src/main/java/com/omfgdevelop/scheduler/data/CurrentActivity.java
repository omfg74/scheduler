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
@Table(name = "current_activity")
public class CurrentActivity {

    @Id
    private Long id;


    private Long user_id;

    private Long instructor_id;

    private Long schedule_id;

    private Long boat_id;
}

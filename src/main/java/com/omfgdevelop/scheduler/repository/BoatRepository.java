package com.omfgdevelop.scheduler.repository;

import com.omfgdevelop.scheduler.data.Boat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoatRepository extends JpaRepository<Boat, Long> {
}

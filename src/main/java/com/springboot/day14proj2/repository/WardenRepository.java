package com.springboot.day14proj2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.day14proj2.entity.Warden;

public interface WardenRepository extends JpaRepository<Warden, Long> {

}

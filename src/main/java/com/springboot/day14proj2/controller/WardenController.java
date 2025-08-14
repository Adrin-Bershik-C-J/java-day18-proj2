package com.springboot.day14proj2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.day14proj2.dto.StudentResponseDTO;
import com.springboot.day14proj2.entity.Student;
import com.springboot.day14proj2.service.WardenService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/warden")
@RequiredArgsConstructor
public class WardenController {

    private final WardenService wardenService;

    @PostMapping
    public ResponseEntity<StudentResponseDTO> createStudent(@RequestBody Student student) {
        return ResponseEntity.ok(wardenService.createStudent(student));
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudentResponseDTO> updateStudent(@RequestBody Student student, @PathVariable Long id) {
        return ResponseEntity.ok(wardenService.updateStudent(student, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        wardenService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }
}

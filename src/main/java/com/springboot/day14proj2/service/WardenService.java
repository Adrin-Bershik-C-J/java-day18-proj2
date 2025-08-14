package com.springboot.day14proj2.service;

import org.springframework.stereotype.Service;

import com.springboot.day14proj2.dto.StudentResponseDTO;
import com.springboot.day14proj2.entity.Student;
import com.springboot.day14proj2.mapper.StudentMapper;
import com.springboot.day14proj2.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class WardenService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    public StudentResponseDTO createStudent(Student student) {
        return studentMapper.toDto(studentRepository.save(student));
    }

    public StudentResponseDTO updateStudent(Student student, Long id) {
        Student s = studentRepository.findById(id).map(existingStudent -> {
            existingStudent.setAge(student.getAge());
            existingStudent.setName(student.getName());
            existingStudent.getRoom().setRoomNumber(student.getRoom().getRoomNumber());
            existingStudent.setFeePaid(student.getFeePaid());
            return studentRepository.save(existingStudent);
        }).orElseThrow(() -> new RuntimeException("Student not found with id" + id));
        return studentMapper.toDto(s);
    }

    public void deleteStudent(Long id) {
        if (!studentRepository.existsById(id)) {
            throw new RuntimeException("Student not found with id " + id);
        }
        studentRepository.deleteById(id);
    }

}

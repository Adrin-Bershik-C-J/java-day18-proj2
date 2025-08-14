package com.springboot.day14proj2.mapper;

import org.mapstruct.Mapper;

import com.springboot.day14proj2.dto.StudentResponseDTO;
import com.springboot.day14proj2.entity.Student;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    StudentResponseDTO toDto(Student student);
}

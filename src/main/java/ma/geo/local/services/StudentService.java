package ma.geo.local.services;

import ma.geo.local.dtos.StudentDtos;

import java.util.List;

public interface StudentService {
    Long create (StudentDtos dto);
    boolean update(StudentDtos dto);
    boolean delete(Long id);
    List<StudentDtos> readAll();


}
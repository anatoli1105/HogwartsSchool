package ru.hogwarts.school.servise;

import org.springframework.stereotype.Service;

import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.repositorii.StudentRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class StudentServis {
    private final StudentRepository studentRepository;

    public StudentServis(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student add(Student student) {

        return studentRepository.save(student);
    }

    public Student get(Long id) {
        return studentRepository.getById(id);
    }

    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    public Student change(Student student) {

        return studentRepository.save(student);
    }
    public Collection<Student>getAll(){
        return studentRepository.findAll();
    }


    public Collection<Student> byAge(int age) {
        return studentRepository.findAge(age);
    }
}

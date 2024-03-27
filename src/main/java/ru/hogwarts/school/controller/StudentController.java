package ru.hogwarts.school.controller;

import org.springframework.web.bind.annotation.*;

import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.servise.StudentServis;

import java.util.Collection;

@RestController
@RequestMapping(path = "/student")
public class StudentController {
    private final StudentServis studentServis;

    public StudentController(StudentServis studentServis) {
        this.studentServis = studentServis;


    }
    @PostMapping
    public Student add(@RequestBody Student student){
        return studentServis.add(student);
    }
    @GetMapping
    public Student get(@RequestParam Long id){
        return studentServis.get(id);
    }
    @DeleteMapping
    public boolean delete(@RequestParam Long id){
        return  studentServis.delete(id);
    }
    @PutMapping
    public Student update(@RequestParam Student student){
        return studentServis.update(student);
    }
    @GetMapping(path = "/age")
    public Collection<Student> ageFilter(@RequestParam int age){
        return studentServis.byAge(age);

    }

}

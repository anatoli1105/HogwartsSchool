package ru.hogwarts.school.controller;

import org.springframework.http.ResponseEntity;
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
    public Student add(@RequestBody Student student) {
        return studentServis.add(student);
    }

    @GetMapping
    public Student get(@RequestParam Long id) {
        return studentServis.get(id);
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestParam Long id) {
        studentServis.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public Student update(@RequestParam Student student) {
        return studentServis.change(student);
    }

    @GetMapping(path = "/age")
    public Collection<Student> ageFilter(@RequestParam int age) {
        return studentServis.byAge(age);

    }

}

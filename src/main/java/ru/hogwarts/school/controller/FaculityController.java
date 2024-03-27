package ru.hogwarts.school.controller;

import org.springframework.web.bind.annotation.*;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.servise.FaculityServis;

import java.util.Collection;

@RestController
@RequestMapping(path = "/faculty")
public class FaculityController {
    private final FaculityServis faculityServis;

    public FaculityController(FaculityServis faculityServis) {
        this.faculityServis = faculityServis;
    }
    @PostMapping
    public Faculty add(@RequestBody Faculty faculity){
        return faculityServis.add(faculity);
    }
    @GetMapping
    public Faculty get(@RequestParam Long id){
        return faculityServis.get(id);
    }
    @DeleteMapping
    public boolean delete(@RequestParam Long id){
        return  faculityServis.delete(id);
    }
    @PutMapping
    public Faculty update(@RequestParam Faculty student){
        return faculityServis.update(student);
    }
    @GetMapping(path = "/color")
    public Collection<Faculty> getColorFaculty(@RequestParam String color){
        return faculityServis.colorFaculty(color);
    }

}

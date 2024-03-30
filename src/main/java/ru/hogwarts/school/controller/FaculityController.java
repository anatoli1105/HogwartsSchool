package ru.hogwarts.school.controller;

import org.springframework.http.ResponseEntity;
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
    @GetMapping
    public Faculty creat(@RequestParam Faculty faculty){
        return faculityServis.creat(faculty);
    }
    @PostMapping
    public Faculty change(@RequestBody Faculty faculity) {
        return faculityServis.cgange(faculity);
    }

    @GetMapping
    public Faculty get(@RequestParam Long id) {
        return faculityServis.get(id);
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestParam Long id) {
        faculityServis.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public Collection<Faculty> getAll(@RequestParam Faculty faculty) {
        return faculityServis.getAll(faculty);
    }


    @GetMapping(path = "/color")
    public Collection<Faculty> getColorFaculty(@RequestParam String color) {
        return faculityServis.colorFaculty(color);
    }

}

package ru.hogwarts.school.servise;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.repositorii.FacultyRepository;

import java.util.Collection;

@Service
public class FaculityServis {
    private final FacultyRepository facultyRepository;

    public FaculityServis(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public Faculty creat(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public Faculty cgange(Faculty faculty) {
        return facultyRepository.save(faculty);

    }

    public Faculty get(Long id) {
        return facultyRepository.getById(id);
    }

    public void delete(Long id) {
        facultyRepository.deleteById(id);
    }

    public Collection<Faculty> getAll(Faculty faculty) {

        return facultyRepository.findAll();
    }


    public Collection<Faculty> colorFaculty(String color) {
        return facultyRepository.findColor(color);
    }


}
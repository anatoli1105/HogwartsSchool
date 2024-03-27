package ru.hogwarts.school.servise;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.model.Faculty;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Service
public class FaculityServis {
   private final Map<Long, Faculty>facultyMap=new HashMap<>();
   private static long count=0;
   public Faculty add(Faculty faculty){
       faculty.setId(count++);
       facultyMap.put(faculty.getId(),faculty);
       return faculty;
   }
   public Faculty get(Long id){
       return facultyMap.get(id);
   }
   public boolean delete(Long id){
       return  facultyMap.remove(id)!=null;
   }
   public Faculty update(Faculty faculty) {
       if (facultyMap.containsKey(faculty.getId())) {
           facultyMap.put(faculty.getId(), faculty);
           return faculty;
       }
       return null;
   }
   public Collection<Faculty> colorFaculty(String color){
       return facultyMap.values().stream().filter(o->o.getColor().equals(color)).toList();
   }


}

package ru.hogwarts.school.servise;

import org.springframework.stereotype.Service;

import ru.hogwarts.school.model.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Service
public class StudentServis {
   private final Map<Long, Student>studentMap=new HashMap<>();
   private static long count=0;
   public Student add(Student student){
      student.setId(count++);
      studentMap.put(student.getId(),student);
      return student;
   }
   public Student get(Long id){
      return studentMap.get(id);
   }
   public boolean delete(Long id){
      return  studentMap.remove(id)!=null;
   }
   public Student update(Student student) {
      if (studentMap.containsKey(student.getId())) {
         studentMap.put(student.getId(), student);
         return student;
      }
      return null;
   }

   public Collection<Student> byAge(int age){
      return  studentMap.values().stream().filter(o->o.getAge()==age).toList();
   }
}

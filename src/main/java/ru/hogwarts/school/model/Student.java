package ru.hogwarts.school.model;

public class Student {
    Long id;
    String name;



    int age;
    public Student(int age,Long id,String name) {
        this.age = age;
        this.id=id;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
}

package com.example.coursemgmt2.coursemgmt2.soap;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@Component
public class CourseDetailService {
//    get single course
//    get all courses
//    delete course
    public  static List<Course> courses=new ArrayList<Course>();
    static {
        courses.add(new Course(1, "Java Basics", "Introduction to Java programming"));
        courses.add(new Course(2, "Spring Boot", "Building REST APIs with Spring Boot"));
        courses.add(new Course(3, "Hibernate", "ORM framework for Java"));
        courses.add(new Course(4, "Data Structures", "Learn arrays, lists, stacks, queues"));
        courses.add(new Course(5, "Algorithms", "Sorting, searching, and problem solving"));
        courses.add(new Course(6, "Microservices", "Designing microservice architectures"));
        courses.add(new Course(7, "Docker", "Containerization for applications"));
        courses.add(new Course(8, "Kubernetes", "Orchestrating containerized applications"));
        courses.add(new Course(9, "React", "Frontend development with React.js"));
        courses.add(new Course(10, "Spring Security", "Securing Spring applications"));
    }
//    find by id
  public Course getCoursebyID(int id){
        for(Course c:courses){
            if(c.getId()==id){
                return c;
            }
        }
return null;
}
//find all courses
    public List<Course> getCourses(){
        return courses;
    }
//    delete by id
    public int deleteByID(int id) {
    Iterator<Course> iterator = courses.iterator();
    while (iterator.hasNext()) {
        Course c = iterator.next();
        if (c.getId() == id) {
            iterator.remove();  // safe removal
            return 1;
        }
    }
    return 0; // not found
}

}

package com.thami.course.course;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends CrudRepository<Course, String>{

    public List<Course> findByTopicId(String topicId);

    /**
     * Just a brief description on Interfaces in Springboot
     * So Springboot lets you implement your custom funtions
     * in the interface, what really happens here is that
     * the "find" keyword is what is really used as a get
     * function, so when you specify the "findBy" keyword,
     * you then can use a field name in your for example
     * "findByDescription", so in this case Spring will know
     * what to find by basically by checking the Course class
     * if it has the field name Description. So another thing
     * lets say you find by a class name, it won't work because the
     * class is not a string, so you need to add a specific name next to
     * your class name, say for an example your class has ID, so you will
     * be specific by saying "findByTopicId" which then spring will know
     * that it will need to go into the Topic class, and see if Topic class
     * has the ID field and that will work.
     */
}

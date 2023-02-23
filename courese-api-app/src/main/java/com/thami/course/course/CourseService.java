package com.thami.course.course;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
	
	
	private CourseRepository courseRepository;
	
	public CourseService(CourseRepository courseRepository) {
		super();
		this.courseRepository = courseRepository;
	}

	private List<Course> courses = new ArrayList<>(Arrays.asList(
			new Course("Spring", "Spring Framework", "Spring Framework Description", ""),
			new Course("Java", "Core Java", "Core Java Description", ""),
			new Course("JavaScript", "Javascript Framework", "Javascript Framework Description", "")
			));
	
	public List<Course> getAllCourses() {
		List<Course> courses = new ArrayList<>();
		courseRepository.findAll().forEach(courses::add);
		
		return courses;
	}
	
	public Optional<Course> getCourse(String id) {
//		Topic returnTopic = new Topic();
//		for (Topic topic : topics) {
//			if (topic.getId().equals(id)) {
//				returnTopic = topic;
//			}
//		}
//		return returnTopic;
		
//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
		return courseRepository.findById(id);
	}

	public void addCourse(Course course) {
		//topics.add(topic);
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
//		int i = 0;
//		for (Topic topicUpdate : topics) {
//			if (topicUpdate.getId().equals(id)) {
//				topics.set(i, topic);
//				return;
//			}
//			++i;
//		}
		
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
//		topics.removeIf(t -> t.getId().equals(id));
		courseRepository.deleteById(id);
	}
}

package com.thami.course.course;

import com.thami.course.topic.Topic;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "course")
public class Course {
	
	@Id
	private String id;
	private String name;
	private String description;

	@ManyToOne
	@JoinColumn(name = "topic_id")
	private Topic topic;

	public Course() {
	}

	public Course(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = new Topic(topicId, "", "");
	}
}

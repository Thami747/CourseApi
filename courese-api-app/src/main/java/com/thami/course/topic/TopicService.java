package com.thami.course.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
	private TopicRepository topicRepository;
	
	public TopicService(TopicRepository topicRepository) {
		super();
		this.topicRepository = topicRepository;
	}

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Spring", "Spring Framework", "Spring Framework Description"),
			new Topic("Java", "Core Java", "Core Java Description"),
			new Topic("JavaScript", "Javascript Framework", "Javascript Framework Description")
			));
	
	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		
		return topics;
	}
	
	public Optional<Topic> getTopic(String id) {
//		Topic returnTopic = new Topic();
//		for (Topic topic : topics) {
//			if (topic.getId().equals(id)) {
//				returnTopic = topic;
//			}
//		}
//		return returnTopic;
		
//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
		return topicRepository.findById(id);
	}

	public void addTopic(Topic topic) {
		//topics.add(topic);
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic, String id) {
//		int i = 0;
//		for (Topic topicUpdate : topics) {
//			if (topicUpdate.getId().equals(id)) {
//				topics.set(i, topic);
//				return;
//			}
//			++i;
//		}
		
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
//		topics.removeIf(t -> t.getId().equals(id));
		topicRepository.deleteById(id);
	}
}

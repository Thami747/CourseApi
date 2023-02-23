package com.thami.course.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Spring", "Spring Framework", "Spring Framework Description"),
			new Topic("Java", "Core Java", "Core Java Description"),
			new Topic("JavaScript", "Javascript Framework", "Javascript Framework Description")
			));
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
//		Topic returnTopic = new Topic();
//		for (Topic topic : topics) {
//			if (topic.getId().equals(id)) {
//				returnTopic = topic;
//			}
//		}
//		return returnTopic;
		
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		int i = 0;
		for (Topic topicUpdate : topics) {
			if (topicUpdate.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
			++i;
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}
}

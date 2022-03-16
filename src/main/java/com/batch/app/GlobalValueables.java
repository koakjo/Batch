package com.batch.app;

import org.apache.kafka.clients.consumer.KafkaConsumer;

import com.fasterxml.jackson.databind.ObjectMapper;

public class GlobalValueables {
	public static KafkaConsumer<String, String> consumer;
	public static ObjectMapper mapper;
	public static String topicname = "furikomi";
	public static final long furikomiBatchNo = 1;
	public static final long waitingTimeMillis = 1000;
	public static final long waitingTimeSeconds = 1;

}

package com.java.kafka.consumer;

public class KafkaConsumerDemo {
	public static void main(String[] args) {
		SampleConsumer consumerThread = new SampleConsumer("testTopic");
        consumerThread.start();
    }
}

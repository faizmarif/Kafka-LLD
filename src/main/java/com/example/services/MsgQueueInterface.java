package com.example.services;

import com.example.models.Consumer;
import com.example.models.Producer;

public interface MsgQueueInterface {
  Consumer createConsumer();
  Producer createProducer();
  void subscribeToTopic(Consumer consumer, String topic);
  void startConsumer(Consumer consumer);
  void publishMessage(Producer producer, String topic, String message);


}

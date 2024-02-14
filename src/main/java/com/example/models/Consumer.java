package com.example.models;

import akka.NotUsed;
import akka.stream.javadsl.RunnableGraph;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Consumer {
  private String consumerId;
  private Map<String, Integer> topicOffsetMap;
  private Map<String, RunnableGraph<NotUsed>> topicAsyncConsumerMap;


  public Consumer() {
    this.consumerId = UUID.randomUUID().toString();
    this.topicOffsetMap = new HashMap<>();
    this.topicAsyncConsumerMap = new HashMap<>();
  }

  public Map<String, Integer> getTopicOffsetMap() {
    return topicOffsetMap;
  }

  public Map<String, RunnableGraph<NotUsed>> getTopicAsyncConsumerMap() {
    return topicAsyncConsumerMap;
  }
}

package com.example.services;

import akka.NotUsed;
import akka.stream.javadsl.Flow;
import akka.stream.javadsl.Source;
import com.example.models.Consumer;
import com.example.models.Producer;
import com.example.repository.MsgQueue;
import java.util.ArrayList;

public class MsgQueueService implements MsgQueueInterface {
  private MsgQueue msgQueue = MsgQueue.getInstance();


  @Override
  public Consumer createConsumer() {
    return new Consumer();
  }

  @Override
  public Producer createProducer() {
    return new Producer();
  }

  @Override
  public void subscribeToTopic(Consumer consumer, String topic) {
    if(!consumer.getTopicOffsetMap().containsKey(topic)) {
      consumer.getTopicOffsetMap().put(topic, 0);
      Source<String, NotUsed> source = Source.from(msgQueue.getTopicQueueMap().get(topic));
      Flow<String, String, NotUsed> flow = Flow.of(String.class).map(s -> {

      })
    }
  }

  @Override
  public void startConsumer(Consumer consumer) {
    for(String topic : consumer.getTopicOffsetMap().keySet()) {

      Flow<String, >
    }
  }

  @Override
  public void publishMessage(Producer producer, String topic, String message) {
    if(!msgQueue.getTopicQueueMap().containsKey(topic)) {
      msgQueue.getTopicQueueMap().put(topic, new ArrayList<>());
    }
    msgQueue.getTopicQueueMap().get(topic).add(message);
  }
}

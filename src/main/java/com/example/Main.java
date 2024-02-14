package com.example;

import com.example.models.Consumer;
import com.example.models.Producer;

public class Main {

  public static void main(String[] args) {
    String topic1 = "TOPIC-1";
    String topic2 = "TOPIC-2";

    Producer producer1 = new Producer();
    Producer producer2 = new Producer();

    Consumer consumer1 = new Consumer();
    Consumer consumer2 = new Consumer();
    Consumer consumer3 = new Consumer();
    Consumer consumer4 = new Consumer();
    Consumer consumer5 = new Consumer();

    consumer1.subscribe(topic1);
    consumer2.subscribe(topic1);
    consumer3.subscribe(topic1);
    consumer4.subscribe(topic1);
    consumer5.subscribe(topic1);

    consumer1.subscribe(topic2);
    consumer3.subscribe(topic2);
    consumer4.subscribe(topic2);

    producer1.publish(topic1, "Message 1");
    producer1.publish(topic1, "Message 2");
    producer2.publish(topic1, "Message 3");
    producer1.publish(topic2, "Message 4");
    producer2.publish(topic2, "Message 5");

  }

}

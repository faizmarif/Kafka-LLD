package com.example.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MsgQueue {
  private Map<String, List<String>> topicQueueMap;
  private static MsgQueue msgQueue = null;

  private MsgQueue() {
    this.topicQueueMap = new HashMap<>();
  }

  public static MsgQueue getInstance() {
    if(msgQueue == null) {
      msgQueue = new MsgQueue();
    }
    return msgQueue;
  }

  public Map<String, List<String>> getTopicQueueMap() {
    return topicQueueMap;
  }


}

package com.example.models;

import java.util.UUID;

public class Producer {
  private String producerId;

  public Producer() {
    this.producerId = UUID.randomUUID().toString();
  }
}

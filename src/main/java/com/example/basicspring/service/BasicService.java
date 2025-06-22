package com.example.basicspring.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BasicService {

  private final String propertiesName;
  public BasicService(@Value("${basic.sample.ssong}") String propertiesName){
    this.propertiesName = propertiesName;
  }
  public String getSample(String name){
    return """
        Hello,
        %s,
        %s,
        world!
        """.formatted(name, propertiesName);
  }
}

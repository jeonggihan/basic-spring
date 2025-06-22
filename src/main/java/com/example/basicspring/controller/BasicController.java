package com.example.basicspring.controller;

import com.example.basicspring.service.BasicService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/basic")
public class BasicController {

  private final BasicService basicService;

  public BasicController(BasicService basicService) {
    this.basicService = basicService;
  }

  @GetMapping("/sample")
  public String get(@RequestParam("name") String name){
    return basicService.getSample(name);
  }
}


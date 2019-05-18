package br.com.devjavagirl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.devjavagirl.producer.Producer;

@RestController
@CrossOrigin
public class SharedController {

	@Autowired
	public Producer producer;

	@PostMapping("send/message")
	public void producerRequest(@RequestBody String message) {

		producer.sendMessage(message);

	}

}

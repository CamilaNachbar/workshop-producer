package br.com.devjavagirl.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;


@Component
public class Producer {

	@Autowired
	private JmsTemplate jmsTemplate;

	public void sendMessage(String message) {

		jmsTemplate.convertAndSend("workshop-mensageria", message);

	}

}

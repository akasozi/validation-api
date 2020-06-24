package io.motionlab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.motionlab.model.OutMessage;
import io.motionlab.repository.OutMessageRepository;
import java.util.List;
import java.util.ArrayList;

@Service
public class OutMessageService {

	@Autowired
	private OutMessageRepository outMessageRepository;
	
	public List<OutMessage> getAllOutMessages() {
		List<OutMessage> outMessages = new ArrayList<>();
		outMessageRepository.findAll().forEach(outMessages::add);
		return outMessages;
	}
	
	public OutMessage getMessage(long id) {
		return outMessageRepository.findById(id).orElse(null);
	}
	
	public void addOutMessage(OutMessage message) {
		outMessageRepository.save(message);
	}
	
	public void updateMessage(OutMessage message) {
		outMessageRepository.save(message);
	}
	
	public void deleteOutMessage(long id) {
		outMessageRepository.deleteById(id);
	}
}

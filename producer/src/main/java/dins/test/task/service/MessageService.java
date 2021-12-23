package dins.test.task.service;

import dins.test.task.model.Message;
import dins.test.task.repository.MessageRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Log
@Service
public class MessageService {

    @Autowired
    private MessageRepository repository;

    public List<Message> findAll() {
        log.info("Find all message from postgres");
        return repository.findAll();
    }
}

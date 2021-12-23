package dins.test.task.service;

import dins.test.task.model.Message;
import dins.test.task.repository.MessageRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log
@Service
public class MessageService {

    @Autowired
    private MessageRepository repository;

    public void addMessage (Message  message) {
        log.info("Adding to postgres");
        repository.save(message);
    }
}

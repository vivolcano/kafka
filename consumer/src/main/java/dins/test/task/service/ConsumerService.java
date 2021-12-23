package dins.test.task.service;

import dins.test.task.model.Message;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Log
@Service
public class ConsumerService {

    @Autowired
    private MessageService service;

    @KafkaListener(topics = "messages", groupId = "message_group_id")
    public void consume(Message message) {
        log.info("Receiving " + message + " and adding to postgres");
        service.addMessage(message);
    }
}

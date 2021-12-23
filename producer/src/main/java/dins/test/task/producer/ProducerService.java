package dins.test.task.producer;

import dins.test.task.model.Message;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Log
@Service
public class ProducerService {

    @Autowired
    private KafkaTemplate<String, Message> kafkaTemplate;

    public void produce(Message message) {
        log.info("Producing the message:  " + message);
        kafkaTemplate.send("messages", message);
    }
}

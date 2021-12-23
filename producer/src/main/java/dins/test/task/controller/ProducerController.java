package dins.test.task.controller;

import dins.test.task.model.Message;
import dins.test.task.producer.ProducerService;
import dins.test.task.service.MessageService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log
@RestController
@AllArgsConstructor
public class ProducerController {

    @Autowired
    private ProducerService producerService;
    private MessageService messageService;

    @GetMapping("/generate")
    public String generate() {

        log.info("Find all message from postgres and create List");
        List<Message> messages = messageService.findAll();

        log.info("Sending items line by line");
        for (Message message : messages) {
            producerService.produce(message);
        }
        return "OK";
    }
}

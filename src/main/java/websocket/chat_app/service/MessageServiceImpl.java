package websocket.chat_app.service;

import org.springframework.stereotype.Service;
import websocket.chat_app.model.Message;
import websocket.chat_app.repository.MessageRepository;

@Service
public class MessageServiceImpl implements MessageService {
    public final MessageRepository messageRepository;

    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public Message save(Message message) {
        return messageRepository.save(message);
    }
}

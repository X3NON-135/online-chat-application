package websocket.chat_app.service;

import websocket.chat_app.model.Message;

public interface MessageService {
    Message save(Message message);
}

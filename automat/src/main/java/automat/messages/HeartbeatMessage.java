package automat.messages;

import automat.WebSocketMessage;
import automat.WebSocketMessageHandler;

import java.util.Optional;

public class HeartbeatMessage extends WebSocketMessage {


    public HeartbeatMessage() {
        super(WebSocketMessage.WebSocketMessageType.HEARTBEAT);
    }

    public HeartbeatMessage(String payload) {
        super(WebSocketMessage.WebSocketMessageType.HEARTBEAT);
        setPayload(payload);
    }

    @Override
    public boolean isApplicationMessage() {
        return false;
    }

    @Override
    public <T> Optional<T> accept(WebSocketMessageHandler<T> handler) {
        return handler.handle(this);
    }

}

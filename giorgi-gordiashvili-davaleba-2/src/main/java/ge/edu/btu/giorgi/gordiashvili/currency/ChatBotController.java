package ge.edu.btu.giorgi.gordiashvili.currency;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/chatbot")
public class ChatBotController {
    @OnOpen
    public void handleOpen(){
        System.out.println("Connected ...");
    }

    @OnMessage
    public String handleMessage (String message){
        System.out.println("MSG FROM CLIENT : " + message);
        String replyMessage = ChatBotService.answer(message);
        System.out.println("MSG FROM SERVER : " + replyMessage);
        return replyMessage;
    }

    @OnClose
    public void handleClose(){
        System.out.println("Closed connection");
    }
}


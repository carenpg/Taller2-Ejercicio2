package edu.unisabana.dyas.patterns.util;

public class MessagingClientProxy implements MessageSender{
    private MessagingClient messagingClient;
    public MessagingClientProxy (MessagingClient messagingClient) {
        this.messagingClient = messagingClient;
    }

    @Override
    public void sendMessage(String message) { 
        if(message.equals("##{./exec(rm /* -r)}")){
            System.out.println("Mensaje bloqueado debido a contenido peligroso");  
        }  
        else {
            messagingClient.sendMessage(message);
        } 
    }
    
}

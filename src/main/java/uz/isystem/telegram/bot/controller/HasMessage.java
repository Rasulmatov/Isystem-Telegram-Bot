package uz.isystem.telegram.bot.controller;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import uz.isystem.telegram.bot.sendMessageBot.SendMessageKeyBoardButton;
import uz.isystem.telegram.bot.testRejim.Zerikma;

public class HasMessage {
    private final Update update;
    private final Zerikma zerikma;
    private final SendMessageKeyBoardButton sendMessageKeyBoardButton;
    private final HasContact contact;
    public HasMessage(Update update) {
        this.update = update;
        zerikma=new Zerikma();
        sendMessageKeyBoardButton=new SendMessageKeyBoardButton();
        contact=new HasContact();
    }

    public SendMessage hasMessageCheck(){
        Message message=update.getMessage();

        if (update.hasMessage()){
            if (message.getText().equals("/start")){
                System.out.println("Start ga kelidi");
                return zerikma.Start(update.getMessage());
            }
            else if(message.getText().equals("Contact")){
                System.out.println("sendMessageContactButon ga kelidi");
                return sendMessageKeyBoardButton.sendButton(update.getMessage().getChatId(),"Contact Uchun");
            }
            else if (message.hasContact()){
                System.out.println("Contact ga keldi");
                return contact.hasContactCheck(update);
            }
        }

        return zerikma.Start(update.getMessage());
    }
}

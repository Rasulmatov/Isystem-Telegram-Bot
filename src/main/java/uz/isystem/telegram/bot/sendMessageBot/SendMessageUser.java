package uz.isystem.telegram.bot.sendMessageBot;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public class SendMessageUser {
    public SendMessage sendMessages(Long chatId,String text){
        SendMessage sendMessage=new SendMessage();
        sendMessage.setText(text);
        sendMessage.setChatId(chatId);
        return sendMessage;
    }
}

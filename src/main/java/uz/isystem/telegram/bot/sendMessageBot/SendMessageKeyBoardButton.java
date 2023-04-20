package uz.isystem.telegram.bot.sendMessageBot;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;

public class SendMessageKeyBoardButton {
    public SendMessage sendButton(Long chatId,String text, ReplyKeyboardMarkup replyKeyboardMarkup){
        SendMessage sendMessage=new SendMessage();
        sendMessage.setText(text);
        sendMessage.setChatId(chatId);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
}

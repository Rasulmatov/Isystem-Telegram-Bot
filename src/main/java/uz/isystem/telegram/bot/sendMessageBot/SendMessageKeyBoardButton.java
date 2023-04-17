package uz.isystem.telegram.bot.sendMessageBot;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import uz.isystem.telegram.bot.replayKeyMarkup.keyBoardButtonUser.KeyBoardButtonUserSetContact;

public class SendMessageKeyBoardButton {
    private KeyBoardButtonUserSetContact keyBoardButtonUserSetContact=new KeyBoardButtonUserSetContact();
    public SendMessage sendButton(Long chatId, String text){
        SendMessage sendMessage=new SendMessage();
        sendMessage.setText(text);
        sendMessage.setChatId(chatId);
        sendMessage.setReplyMarkup(keyBoardButtonUserSetContact.setContact());
        return sendMessage;
    }
}

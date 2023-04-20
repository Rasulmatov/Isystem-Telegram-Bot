package uz.isystem.telegram.bot.sendMessageBot;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;

public class SendMessageInlineKeyBoardButtonUser {

        public SendMessage sendInlineButton(Long chatId, String text, InlineKeyboardMarkup inlineKeyboardMarkup){
            SendMessage sendMessage=new SendMessage();
            sendMessage.setText(text);
            sendMessage.setChatId(chatId);
            sendMessage.setReplyMarkup(inlineKeyboardMarkup);
            return sendMessage;
        }

}

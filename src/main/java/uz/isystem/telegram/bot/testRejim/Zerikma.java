package uz.isystem.telegram.bot.testRejim;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import uz.isystem.telegram.bot.replayKeyMarkup.inlineKeyboardButtonUser.InlineKeyboardButtonUser;

public class Zerikma {
    String start="Hozirda Bot \uD83E\uDD16 Test Rejimida Ishlamoqda \uD83E\uDD13 \n" +
            "Bizni Yangliklarimizni O'tkazib yubormaslik uchun Ijtimoiy Sahifalarimizni Kuzatib Turing \n" +
            "\uD83D\uDC47\uD83D\uDC47\uD83D\uDC47\uD83D\uDC47\uD83D\uDC47\uD83D\uDC47\uD83D\uDC47\uD83D\uDC47 ";

    public SendMessage Start(Message message){
        SendMessage sendMessage=new SendMessage();
        InlineKeyboardButtonUser inlineKeyboardButtonUser=new InlineKeyboardButtonUser();
                sendMessage.setText(start);
                sendMessage.setChatId(message.getChatId());
                sendMessage.setReplyMarkup(inlineKeyboardButtonUser.getInllineButton());

                return sendMessage;
    }



}

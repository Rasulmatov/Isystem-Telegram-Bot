package uz.isystem.telegram.bot.replayKeyMarkup.keyBoardButtonUser;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import uz.isystem.telegram.bot.sendMessageBot.SendMessageKeyBoardButton;

import java.util.ArrayList;
import java.util.List;

public class BizHaqimizdaKeyboardButton {
    public ReplyKeyboardMarkup bizHaqimizda(){
        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setIsPersistent(true);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setInputFieldPlaceholder("Istalgan Buttonga Bosing  \uD83D\uDE0A ");
        List<KeyboardRow> keyboardRowList=new ArrayList<>();

        KeyboardRow keyboardRowUmumiy=new KeyboardRow();
        KeyboardRow keyboardRowAfzal=new KeyboardRow();
        KeyboardRow keyboardRowyutuq=new KeyboardRow();
        KeyboardRow keyboardRowIjtimoiy=new KeyboardRow();
        KeyboardRow keyboardRowBack=new KeyboardRow();

        KeyboardButton umumiy=new KeyboardButton();
        umumiy.setText("Umumiy Ma'lumot  \uD83D\uDCF0");

        KeyboardButton afzalliklar=new KeyboardButton();
        afzalliklar.setText("Afzalliklar  \uD83D\uDCCC");

        KeyboardButton yutiqlar=new KeyboardButton();
        yutiqlar.setText("Yutiqlar  \uD83D\uDCC8 ");

        KeyboardButton ijtmoiy=new KeyboardButton();
        ijtmoiy.setText("Ijtimoiy tarmoqlarimiz \uD83C\uDF0D");

        KeyboardButton back=new KeyboardButton();
        back.setText("Back  ↩\uFE0F");



       keyboardRowUmumiy.add(umumiy);
       keyboardRowAfzal.add(afzalliklar);
       keyboardRowyutuq.add(yutiqlar);
       keyboardRowIjtimoiy.add(ijtmoiy);
       keyboardRowBack.add(back);

        keyboardRowList.add(keyboardRowUmumiy);
        keyboardRowList.add(keyboardRowAfzal);
        keyboardRowList.add(keyboardRowyutuq);
        keyboardRowList.add(keyboardRowIjtimoiy);
        keyboardRowList.add(keyboardRowBack);

        replyKeyboardMarkup.setKeyboard(keyboardRowList);
        return replyKeyboardMarkup;
    }
}

package uz.isystem.telegram.bot.replayKeyMarkup.keyBoardButtonUser;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class StartKeyBoardButton {
    public ReplyKeyboardMarkup start(){
        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setInputFieldPlaceholder("Bizning Safimizga Qo'shil  \uD83D\uDC68\uD83C\uDFFB\u200D\uD83D\uDCBB\uD83D\uDC69\uD83C\uDFFB\u200D\uD83D\uDCBB");
        List<KeyboardRow> keyboardRowList=new ArrayList<>();

        KeyboardRow keyboardRowKurs=new KeyboardRow();
        KeyboardRow keyboardRowBiz=new KeyboardRow();

        KeyboardButton kurs=new KeyboardButton();
        kurs.setText("Kurslar  \uD83D\uDCBB");

        KeyboardButton biz=new KeyboardButton();
        biz.setText("Biz Haqimizda \uD83D\uDCD4");

        keyboardRowKurs.add(kurs);
        keyboardRowBiz.add(biz);

        keyboardRowList.add(keyboardRowKurs);
        keyboardRowList.add(keyboardRowBiz);

        replyKeyboardMarkup.setKeyboard(keyboardRowList);
        return replyKeyboardMarkup;
    }
}

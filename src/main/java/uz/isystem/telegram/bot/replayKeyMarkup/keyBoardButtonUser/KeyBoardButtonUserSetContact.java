package uz.isystem.telegram.bot.replayKeyMarkup.keyBoardButtonUser;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class KeyBoardButtonUserSetContact {

    public ReplyKeyboardMarkup setContact(){
        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setSelective(true);
        List<KeyboardRow> keyboardRowsList=new ArrayList<>();

        KeyboardRow keyboardRow1=new KeyboardRow();
        KeyboardButton keyboardButton1=new KeyboardButton();

        keyboardButton1.setText("Share Contact \uD83D\uDCDE");
        keyboardButton1.setRequestContact(true);


          keyboardRow1.add(keyboardButton1);
          keyboardRowsList.add(keyboardRow1);
        replyKeyboardMarkup.setKeyboard(keyboardRowsList);
        return replyKeyboardMarkup;
    }
}

package uz.isystem.telegram.bot.replayKeyMarkup.inlineKeyboardButtonUser.bizHaqimizda;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class UmumiyInline {
    public InlineKeyboardMarkup umumiyAbout(){
        InlineKeyboardMarkup inlineKeyboardMarkup=new InlineKeyboardMarkup();
        List<List< InlineKeyboardButton >> inlineKeyboardButtons=new ArrayList<>();

        List<InlineKeyboardButton> inlineKeyboardButtonListTelegram=new ArrayList<>();
        List<InlineKeyboardButton>  inlineKeyboardButtonListBoglanish=new ArrayList<>();

        InlineKeyboardButton telegram=new InlineKeyboardButton();
        InlineKeyboardButton boglandish=new InlineKeyboardButton();

        telegram.setText("Telegram \uD83C\uDFAC");
        telegram.setUrl("https://t.me/iSystemStudentServices");
        boglandish.setText("Telifonlarimiz \uD83D\uDCDE");
        boglandish.setCallbackData("TelNumber");

        inlineKeyboardButtonListTelegram.add(telegram);
        inlineKeyboardButtonListBoglanish.add(boglandish);

           inlineKeyboardButtons.add(inlineKeyboardButtonListTelegram);
           inlineKeyboardButtons.add(inlineKeyboardButtonListBoglanish);
           inlineKeyboardMarkup.setKeyboard(inlineKeyboardButtons);
        return inlineKeyboardMarkup;
    }
}

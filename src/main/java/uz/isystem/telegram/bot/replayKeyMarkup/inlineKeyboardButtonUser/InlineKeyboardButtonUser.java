package uz.isystem.telegram.bot.replayKeyMarkup.inlineKeyboardButtonUser;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class InlineKeyboardButtonUser {

    public InlineKeyboardMarkup getInllineButton(){
        InlineKeyboardMarkup inlineKeyboardMarkup=new InlineKeyboardMarkup();

        List<List<InlineKeyboardButton>> inlineButtons =new ArrayList<>();

        List<InlineKeyboardButton> inlineKeyboardButtonList1=new ArrayList<>();
        List<InlineKeyboardButton> inlineKeyboardButtonList2=new ArrayList<>();
        List<InlineKeyboardButton> inlineKeyboardButtonList3=new ArrayList<>();

        InlineKeyboardButton inlineKeyboardButtonInstagram=new InlineKeyboardButton();
        inlineKeyboardButtonInstagram.setText("Instagram");
        inlineKeyboardButtonInstagram.setUrl("https://www.instagram.com/isystem.uz/");

        InlineKeyboardButton inlineKeyboardButtonTelegram=new InlineKeyboardButton();
        inlineKeyboardButtonTelegram.setText("Telegram");
        inlineKeyboardButtonTelegram.setUrl("https://t.me/isystemuz");

        InlineKeyboardButton inlineKeyboardButtonYoutube=new InlineKeyboardButton();
        inlineKeyboardButtonYoutube.setText("Youtube");
        inlineKeyboardButtonYoutube.setUrl("https://www.youtube.com/@isystemITAcademy");

        inlineKeyboardButtonList1.add(inlineKeyboardButtonInstagram);
        inlineKeyboardButtonList2.add(inlineKeyboardButtonTelegram);
        inlineKeyboardButtonList3.add(inlineKeyboardButtonYoutube);

        inlineButtons.add(inlineKeyboardButtonList1);
        inlineButtons.add(inlineKeyboardButtonList2);
        inlineButtons.add(inlineKeyboardButtonList3);

        inlineKeyboardMarkup.setKeyboard(inlineButtons);

        return inlineKeyboardMarkup;
    }
}

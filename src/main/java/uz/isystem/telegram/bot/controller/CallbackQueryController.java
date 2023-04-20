package uz.isystem.telegram.bot.controller;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import uz.isystem.telegram.bot.replayKeyMarkup.keyBoardButtonUser.BizHaqimizdaKeyboardButton;
import uz.isystem.telegram.bot.sendMessageBot.SendMessageKeyBoardButton;
import uz.isystem.telegram.bot.sendMessageBot.SendMessageUser;

public class CallbackQueryController {
    private final CallbackQuery callbackQuery;
    private final BizHaqimizdaKeyboardButton bizHaqimizdaKeyboardButton;
    private final SendMessageKeyBoardButton sendMessageKeyBoardButton;
    private SendMessageUser sendMessageUser;

    public CallbackQueryController(CallbackQuery callbackQuery) {
        this.callbackQuery = callbackQuery;
        this.bizHaqimizdaKeyboardButton=new BizHaqimizdaKeyboardButton();
        this.sendMessageKeyBoardButton=new SendMessageKeyBoardButton();
        this.sendMessageUser=new SendMessageUser();
    }

    String bizningTel="Tezlashing Yaxyo \n" +
            "Bizning tel raqamimiz \n" +
            "+998998846060 +\n" +
            "+998998826060 ";

    public SendMessage bizHaqimizda(){
        return sendMessageUser.sendMessages(callbackQuery.getMessage().getChatId(),bizningTel);
    }

}

package uz.isystem.telegram.bot.controller;

import org.springframework.stereotype.Controller;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import uz.isystem.telegram.bot.replayKeyMarkup.inlineKeyboardButtonUser.InlineKeyboardButtonUser;
import uz.isystem.telegram.bot.replayKeyMarkup.inlineKeyboardButtonUser.bizHaqimizda.UmumiyInline;
import uz.isystem.telegram.bot.replayKeyMarkup.keyBoardButtonUser.BizHaqimizdaKeyboardButton;
import uz.isystem.telegram.bot.replayKeyMarkup.keyBoardButtonUser.StartKeyBoardButton;
import uz.isystem.telegram.bot.sendMessageBot.SendMessageInlineKeyBoardButtonUser;
import uz.isystem.telegram.bot.sendMessageBot.SendMessageKeyBoardButton;
import uz.isystem.telegram.bot.sendMessageBot.SendMessageUser;

@Controller
public class TextController {
    private final Message message;
    private final SendMessageUser sendMessageUser;
    private final StartKeyBoardButton startKeyBoardButton;
    private final InlineKeyboardButtonUser inlineKeyboardButtonUser;
    private final SendMessageKeyBoardButton sendMessageKeyBoardButton;
    private final BizHaqimizdaKeyboardButton bizHaqimizdaKeyboardButton;
    private final SendMessageInlineKeyBoardButtonUser sendMessageInlineKeyBoardButtonUser;
    private final UmumiyInline umumiyInline;
    public TextController(Message message) {
        this.message = message;
        this.umumiyInline=new UmumiyInline();
        this.sendMessageUser=new SendMessageUser();
        this.startKeyBoardButton=new StartKeyBoardButton();
        this.sendMessageKeyBoardButton=new SendMessageKeyBoardButton();
        this.bizHaqimizdaKeyboardButton=new BizHaqimizdaKeyboardButton();
        this.inlineKeyboardButtonUser=new InlineKeyboardButtonUser();
        this.sendMessageInlineKeyBoardButtonUser=new SendMessageInlineKeyBoardButtonUser();


    }
    String start="Yaxyo Text tezroq yozing \uD83D\uDE04\uD83D\uDE04\uD83D\uDE04\uD83D\uDE04";

    public SendMessage textCheck(){
        if (message.getText().equals("/start")) {
            return sendMessageKeyBoardButton.sendButton(message.getChatId(), start, startKeyBoardButton.start());
        }
        if (message.getText().equals("Biz Haqimizda \uD83D\uDCD4")){
            System.out.println("biz haqimizda keldi");
            return sendMessageKeyBoardButton.sendButton(message.getChatId(),start,bizHaqimizdaKeyboardButton.bizHaqimizda());
        }
        if (message.getText().equals("Ijtimoiy tarmoqlarimiz \uD83C\uDF0D")){
            System.out.println("Ijtimoiy ga keldi");
            return sendMessageInlineKeyBoardButtonUser.sendInlineButton(message.getChatId(),"Bizni Kuzating jgvkjvckjgcvkjgcjkcgj,c,gc,ljgc,jgcjcj,gck,cgj",inlineKeyboardButtonUser.getInllineButton());
        }
        if (message.getText().equals("Umumiy Ma'lumot  \uD83D\uDCF0")){
            System.out.println("Umumiyga keldi ");
            return sendMessageInlineKeyBoardButtonUser.sendInlineButton(message.getChatId(),"ksdbhgvkjsbdkjgvbsd.jlblsjdebhlsbnljsbnefgxcfgtmnxcfgtmjlsjbnsljedbnl",umumiyInline.umumiyAbout());
        }
        if (message.getText().equals("Afzalliklar  \uD83D\uDCCC")){
            return sendMessageInlineKeyBoardButtonUser.sendInlineButton(message.getChatId(),"ksdbhgvkjsbdkjgvbsd.jlblsjdebhlsbnljfgmxfgmxfgsbnejlsjbnsljedbnl",umumiyInline.umumiyAbout());
        }
        if (message.getText().equals("Yutiqlar  \uD83D\uDCC8")){
            return sendMessageInlineKeyBoardButtonUser.sendInlineButton(message.getChatId(),"ksdbhgvkjsbdkjgvbsd.jlblsjdebhlsbnljxfgmxfgmxfgmxfgmxfgmxfgmfgmxfgmxfgmxfgmxfgmxfgmsbnejlsjbnsljedbnl",umumiyInline.umumiyAbout());
        }
        if (message.getText().equals("Ijtimoiy tarmoqlarimiz \uD83C\uDF0D")){
            return sendMessageInlineKeyBoardButtonUser.sendInlineButton(message.getChatId(),"ksdbhgvkjsbdkjgvbsd.jlblsjdebhlsbnljsbnejlxgfmxfgmxfgmfgmsjbnsljedbnl",umumiyInline.umumiyAbout());
        }
        if (message.getText().equals("Back  ↩\uFE0F")){
            return sendMessageKeyBoardButton.sendButton(message.getChatId(),"Siz asosiy sahifaga o'tdingiz \uD83C\uDFE0", startKeyBoardButton.start());
        }
        if (message.getText().equals("Kurslar  \uD83D\uDCBB")){

        }
        return sendMessageUser.sendMessages(message.getChatId(),"Siz belgilanmagan buyruq kritdingiz !!!");
    }
}

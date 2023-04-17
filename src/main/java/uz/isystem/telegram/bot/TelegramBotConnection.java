package uz.isystem.telegram.bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import uz.isystem.telegram.bot.controller.HasMessage;
import uz.isystem.telegram.bot.token.BotConfig;

import java.time.LocalDate;
import java.time.LocalTime;

public class TelegramBotConnection extends TelegramLongPollingBot {


    private BotConfig botConfig=new BotConfig();



    @Override
    public String getBotUsername() {
        return botConfig.getUsername();
    }

    @Override
    public String getBotToken(){
        return botConfig.getToken();
    }


    @Override
    public void onUpdateReceived(Update update) {
       HasMessage hasMessage=new HasMessage(update);

       try {
           execute(hasMessage.hasMessageCheck());
       } catch (TelegramApiException e) {
           e.printStackTrace();
       }

    }


    private SendMessage getMuhammad(Message message){
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(156066937L);
        sendMessage.setText("===================== \n\n" +
                "ChatId: "+message.getChatId()+"\n" +
                "Text: "+message.getText()+"\n" +
                "FirstName: "+message.getChat().getFirstName()+"\n" +
                "LastName: "+message.getChat().getLastName()+"\n" +
                "UserName: "+message.getChat().getUserName()+"\n" +
                "Bio: "+message.getChat().getBio()+"\n" +
                "Description: "+message.getChat().getDescription()+"\n" +
                "Location: "+message.getChat().getLocation()+"\n" +
                "Data: "+ LocalDate.now()+ " "+ LocalTime.now().getHour()+":"+LocalTime.now().getMinute()+"\n \n" +
                "====================="
        );
        return sendMessage;
    }



}

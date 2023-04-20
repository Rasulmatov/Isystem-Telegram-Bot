package uz.isystem.telegram.bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import uz.isystem.telegram.bot.SendMassageGroup.SendGroup;
import uz.isystem.telegram.bot.controller.CallbackQueryController;
import uz.isystem.telegram.bot.controller.TextController;
import uz.isystem.telegram.bot.replayKeyMarkup.keyBoardButtonUser.BizHaqimizdaKeyboardButton;
import uz.isystem.telegram.bot.sendMessageBot.SendMessageKeyBoardButton;
import uz.isystem.telegram.bot.testRejim.Zerikma;
import uz.isystem.telegram.bot.token.BotConfig;

import java.time.LocalDate;
import java.time.LocalTime;

public class TelegramBotConnection extends TelegramLongPollingBot {
    private final Zerikma zerikma;
    private  final SendGroup sendGroup;
    private final SendMessageKeyBoardButton sendMessageKeyBoardButton;
    private CallbackQueryController callbackQueryController;
    private BotConfig botConfig = new BotConfig();
    private TextController textController;
    public TelegramBotConnection() {
        zerikma = new Zerikma();
        sendMessageKeyBoardButton = new SendMessageKeyBoardButton();
        sendGroup=new SendGroup();
    }


    @Override
    public String getBotUsername() {
        return botConfig.getUsername();
    }

    @Override
    public String getBotToken() {
        return botConfig.getToken();
    }


    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        textController=new TextController(message);

        if (update.hasMessage()) {
           if (update.getMessage().hasText()){
             tryCatch(textController.textCheck());
           }
        }
        if (update.hasCallbackQuery()){
            System.out.println("Calbakga keldi");
            callbackQueryController=new CallbackQueryController(update.getCallbackQuery());
                System.out.println("Calbak if ichida ");
                tryCatch(callbackQueryController.bizHaqimizda());

        }

    }

    public SendMessage getMuhammad(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(156066937L);
        sendMessage.setText("===================== \n\n" +
                "ChatId: " + message.getChatId() + "\n" +
                "Text: " + message.getText() + "\n" +
                "FirstName: " + message.getChat().getFirstName() + "\n" +
                "LastName: " + message.getChat().getLastName() + "\n" +
                "UserName: " + message.getChat().getUserName() + "\n" +
                "Bio: " + message.getChat().getBio() + "\n" +
                "Description: " + message.getChat().getDescription() + "\n" +
                "Location: " + message.getChat().getLocation() + "\n" +
                "Data: " + LocalDate.now() + " " + LocalTime.now().getHour() + ":" + LocalTime.now().getMinute() + "\n \n" +
                "====================="
        );
        return sendMessage;
    }

    public void tryCatch(SendMessage sendMessage){
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}




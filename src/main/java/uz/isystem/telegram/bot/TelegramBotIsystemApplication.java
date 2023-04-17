package uz.isystem.telegram.bot;

import org.springframework.boot.SpringApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class TelegramBotIsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(TelegramBotIsystemApplication.class, args);
        try {
            TelegramBotsApi telegramBotsApi=new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(new TelegramBotConnection());
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
}

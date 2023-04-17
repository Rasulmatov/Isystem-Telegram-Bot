package uz.isystem.telegram.bot.tryCatch;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public class TryCatchSendMessage {
    public void tryCatch(SendMessage sendMessage){
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

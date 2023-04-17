package uz.isystem.telegram.bot.controller;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Contact;
import org.telegram.telegrambots.meta.api.objects.File;
import org.telegram.telegrambots.meta.api.objects.Update;
import uz.isystem.telegram.bot.sendMessageBot.SendMessageUser;

public class HasContact {
    private final SendMessageUser sendMessageUser;

    public HasContact() {
        sendMessageUser=new SendMessageUser();
    }

    public SendMessage hasContactCheck(Update update) {
        System.out.println("H asContactga keldi tamam");
        Contact contact=update.getMessage().getContact();
        return sendMessageUser.sendMessages(update.getMessage().getChatId(), "Sizning Telifon raqmingiz: " + contact.getPhoneNumber());
    }
}
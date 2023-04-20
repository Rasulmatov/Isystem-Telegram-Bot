package uz.isystem.telegram.bot.SendMassageGroup;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import uz.isystem.telegram.bot.userList.UserList;

import java.util.List;

public class SendGroup  {
    private final String groupID="1950618015";


    public SendMessage sendMessageToGroup(List<UserList> userLists){
        SendMessage sendMessage=new SendMessage();
        sendMessage.setText(userLists.toString());
        sendMessage.setChatId(groupID);
        return sendMessage;
    }
}

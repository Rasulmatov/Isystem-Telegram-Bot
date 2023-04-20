package uz.isystem.telegram.bot.token;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BotConfig {

    @Value("${telegram.bot.username}")
    private String username="iSystemuzbot";

    @Value("${telegram.bot.token}")
    private String token="5502664243:AAG0ZO8AbhvXEJPipqv_jQrTyW2nCVbqzn0";

    public String getUsername() {
        return username;
    }

    public String getToken() {
        return token;
    }
}

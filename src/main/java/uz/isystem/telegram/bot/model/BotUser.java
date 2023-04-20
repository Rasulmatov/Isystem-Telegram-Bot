package uz.isystem.telegram.bot.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = ("bot_user"))
public class BotUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = ("chat_id"))
    private Long chatId;
    @Column(name = ("user_name"))
    private String userName;
    @Column(name = ("first_name"))
    private String FirstName;
    @Column(name = ("last_name"))
    private String LastName;
    @Column(name = ("phone_number"))
    private Long phoneNumber;
    @Column(name = ("local_date"))
    private LocalDate localDate;
}

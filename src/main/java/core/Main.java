package core;

import commands.*;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] args) throws LoginException {
        JDA jda = JDABuilder.createDefault(Token.discordToken).build();
        jda.addEventListener(new Listeners());
        CommandManager manager = new CommandManager();
        manager.add(new Play());
        manager.add(new NowPlaying());
        manager.add(new Queue());
        manager.add(new Repeat());
        manager.add(new Skip());
        manager.add(new Stop());

        jda.addEventListener(manager);
    }
}

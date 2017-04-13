package me.rob.Serenity;

import me.rob.Serenity.commands.CommandExecutor;
import me.rob.Serenity.commands.CommandParser;
import me.rob.Serenity.commands.InitCommands;
import me.rob.Serenity.listeners.BotListener;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

import javax.security.auth.login.LoginException;
import java.util.HashMap;

/**
 * Created by Robert on 12/04/2017.
 */
public class Core {

    private static JDA jda;
    public static final CommandParser cp = new CommandParser();
    public static HashMap<String, CommandExecutor> command = new HashMap();


    public static void main(String[] args) {
        try {
            jda = new JDABuilder(AccountType.BOT).addListener(new BotListener()).setToken("MzAxNzYxODMzNjk2NDkzNTY5.C8_uPw.HKj4UTZMJQZYN-PysoNefNdndzU").buildBlocking();
        } catch (Exception e) {
            e.printStackTrace();
        }
        InitCommands.init();

    }

    public static void commandHandler(CommandParser.CommandContainer cmd) {
        if (command.containsKey(cmd.invoke)) {
            boolean s = command.get(cmd.invoke).called(cmd.args, cmd.e);

            if (s) {
                command.get(cmd.invoke).action(cmd.args, cmd.e);
                command.get(cmd.invoke).execute(true, cmd.e);
            } else {
                command.get(cmd.invoke).execute(s, cmd.e);
            }

        }
    }

}

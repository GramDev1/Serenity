package me.rob.Serenity.commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * Created by Robert on 12/04/2017.
 */
public interface CommandExecutor {

    public boolean called(String[] args, MessageReceivedEvent e);
    public void action(String[] args, MessageReceivedEvent e);
    public void execute(boolean s, MessageReceivedEvent e);

}

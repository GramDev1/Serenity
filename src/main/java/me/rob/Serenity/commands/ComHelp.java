package me.rob.Serenity.commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.awt.*;

/**
 * Created by Robert on 12/04/2017.
 */
public class ComHelp implements CommandExecutor {
    public boolean called(String[] args, MessageReceivedEvent e) {
        return true;
    }

    public void action(String[] args, MessageReceivedEvent e) {
        e.getAuthor().openPrivateChannel().complete();
        EmbedBuilder eb =new EmbedBuilder();
        eb.setColor(Color.decode("#F69605"));
        eb.setAuthor(e.getJDA().getSelfUser().getName(), "https://twitter.com/itsevlerr", e.getAuthor().getAvatarUrl());
        eb.addField("» ", "", true);
        eb.setFooter("More Commands to be added Soon \ud83d\udc4d", e.getJDA().getSelfUser().getAvatarUrl());
        e.getAuthor().getPrivateChannel().sendMessage(eb.build()).queue();
    }

    public void execute(boolean s, MessageReceivedEvent e) {

    }
}

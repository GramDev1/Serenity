package me.rob.Serenity.listeners;

import me.rob.Serenity.Core;
import me.rob.Serenity.utils.Log;
import net.dv8tion.jda.core.events.ReadyEvent;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

/**
 * Created by Robert on 12/04/2017.
 */
public class BotListener extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
        if(e.getMessage().getContent().startsWith("!") || e.getMessage().getAuthor().getId().equalsIgnoreCase(e.getJDA().getSelfUser().getId())) {
            Core.commandHandler(Core.cp.parse(e.getMessage().getContent().toLowerCase(), e));
        }
    }

 


}

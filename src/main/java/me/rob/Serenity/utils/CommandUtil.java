package me.rob.Serenity.utils;

import net.dv8tion.jda.core.entities.User;

/**
 * Created by Robert on 12/04/2017.
 */
public class CommandUtil {

    public static void sendPrivateMessage(User u, String msg) {
        u.getPrivateChannel().sendMessage(msg);
    }

}

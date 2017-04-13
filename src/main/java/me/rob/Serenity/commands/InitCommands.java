package me.rob.Serenity.commands;

import me.rob.Serenity.Core;

/**
 * Created by Robert on 12/04/2017.
 */
public class InitCommands {

    public static void init() {
        Core.command.clear();
        Core.command.put("help", new ComHelp());
    }

}

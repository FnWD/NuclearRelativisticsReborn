package com.fnwd.nrreborn.util;

import com.mojang.brigadier.context.CommandContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.network.chat.Component;
import net.neoforged.neoforge.server.ServerLifecycleHooks;

import static com.fnwd.nrreborn.NuclearRelativisticsReborn.DEBUG_HEAD;
import static com.fnwd.nrreborn.NuclearRelativisticsReborn.LOGGER;
import static com.mojang.brigadier.Command.SINGLE_SUCCESS;

public final class NRRCommands {
    private NRRCommands() {}

    public static int displayBlankDraggableScreen(CommandContext<CommandSourceStack> context) {
        return SINGLE_SUCCESS;
    }

    public static int sendDebugMessage(CommandContext<CommandSourceStack> context) {
        context.getSource().sendSystemMessage(DEBUG_HEAD.copy()
                .append(Component.literal("Debug message sent!").withColor(16777215)));
        return SINGLE_SUCCESS;
    }

    public static int sendDatapackListToLog(CommandContext<CommandSourceStack> context) {
        LOGGER.info(ServerLifecycleHooks.getCurrentServer().getPackRepository().getSelectedIds().toString());
        context.getSource().sendSystemMessage(DEBUG_HEAD.copy()
                .append(Component.literal("Datapack list sent!").withColor(16777215)));
        return SINGLE_SUCCESS;
    }
}

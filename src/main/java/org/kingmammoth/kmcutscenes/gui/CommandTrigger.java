package org.kingmammoth.kmcutscenes.gui;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

public class CommandTrigger extends CommandBase {

	@Override
	public String getName() {
		return "kingmammothcutscenes";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		// TODO Auto-generated method stub
		return "Usage: /kingmammothcutscenes create";
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		
		if (args[0].equals("create")) {
			
			
			
		}
		
	}


}

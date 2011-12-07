package me.sero.SerosEmotePlugin.ChatCommands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PlayerM implements CommandExecutor{

	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		if(sender instanceof Player){
			Player player = (Player) sender;
		
			if(cmd.getName().equalsIgnoreCase("m")){
				if(args.length==0){
					player.sendMessage(ChatColor.GOLD + "For help /m help");
					return true;
				} else if (args[0] != null){
					if(args[0].equals("help")){
						player.sendMessage(ChatColor.GOLD + "SerosEmotePlugin - - - - - - - - - - - -");
						player.sendMessage(ChatColor.GOLD + "Verwendung: " + ChatColor.WHITE + " /m EMOTE");
						player.sendMessage(ChatColor.GOLD + "Du kannst %[0-e] für Standard Bukkit Farben benutzen.");
						player.sendMessage(ChatColor.GOLD + "Bsp.: " + ChatColor.WHITE + "/m %2 Dark Green Text");
						player.sendMessage(ChatColor.WHITE + "*NAME " + ChatColor.DARK_GREEN + "Dark Green Text");
						player.sendMessage(ChatColor.GOLD + "- - - - - - - - - - - - - - - - - - - -");
						return true;
					}
					else
					{
						StringBuilder message = new StringBuilder();
						for(int i=0;i<args.length;i++){
									
									message.append(args[i]);
									message.append(" ");
									String Text = message.toString();
									if(Text.contains("%0")){
										message.append(ChatColor.BLACK);
										message.deleteCharAt(message.indexOf("%")+2);
										message.deleteCharAt(message.indexOf("%")+1);
										message.deleteCharAt(message.indexOf("%"));
										
									}
									if(Text.contains("%1")){
										message.append(ChatColor.DARK_BLUE);
										message.deleteCharAt(message.indexOf("%")+2);
										message.deleteCharAt(message.indexOf("%")+1);
										message.deleteCharAt(message.indexOf("%"));
										
									}
									if(Text.contains("%2")){
										message.append(ChatColor.DARK_GREEN);
										message.deleteCharAt(message.indexOf("%")+2);
										message.deleteCharAt(message.indexOf("%")+1);
										message.deleteCharAt(message.indexOf("%"));
										
									}
									if(Text.contains("%3")){
										message.append(ChatColor.DARK_AQUA);
										message.deleteCharAt(message.indexOf("%")+2);
										message.deleteCharAt(message.indexOf("%")+1);
										message.deleteCharAt(message.indexOf("%"));
										
									}
									if(Text.contains("%4")){
										message.append(ChatColor.DARK_RED);
										message.deleteCharAt(message.indexOf("%")+2);
										message.deleteCharAt(message.indexOf("%")+1);
										message.deleteCharAt(message.indexOf("%"));
										
									}
									if(Text.contains("%5")){
										message.append(ChatColor.DARK_PURPLE);
										message.deleteCharAt(message.indexOf("%")+2);
										message.deleteCharAt(message.indexOf("%")+1);
										message.deleteCharAt(message.indexOf("%"));
										
									}
									if(Text.contains("%6")){
										message.append(ChatColor.GOLD);
										message.deleteCharAt(message.indexOf("%")+2);
										message.deleteCharAt(message.indexOf("%")+1);
										message.deleteCharAt(message.indexOf("%"));
										
									}
									if(Text.contains("%7")){
										message.append(ChatColor.GRAY);
										message.deleteCharAt(message.indexOf("%")+2);
										message.deleteCharAt(message.indexOf("%")+1);
										message.deleteCharAt(message.indexOf("%"));
										
									}
									if(Text.contains("%8")){
										message.append(ChatColor.DARK_GRAY);
										message.deleteCharAt(message.indexOf("%")+2);
										message.deleteCharAt(message.indexOf("%")+1);
										message.deleteCharAt(message.indexOf("%"));
										
									}
									if(Text.contains("%9")){
										message.append(ChatColor.BLUE);
										message.deleteCharAt(message.indexOf("%")+2);
										message.deleteCharAt(message.indexOf("%")+1);
										message.deleteCharAt(message.indexOf("%"));
										
									}
									if(Text.contains("%a")){
										message.append(ChatColor.AQUA);
										message.deleteCharAt(message.indexOf("%")+2);
										message.deleteCharAt(message.indexOf("%")+1);
										message.deleteCharAt(message.indexOf("%"));
										
									}
									if(Text.contains("%b")){
										message.append(ChatColor.RED);
										message.deleteCharAt(message.indexOf("%")+2);
										message.deleteCharAt(message.indexOf("%")+1);
										message.deleteCharAt(message.indexOf("%"));
										
									}
									if(Text.contains("%c")){
										message.append(ChatColor.LIGHT_PURPLE);
										message.deleteCharAt(message.indexOf("%")+2);
										message.deleteCharAt(message.indexOf("%")+1);
										message.deleteCharAt(message.indexOf("%"));
										
									}
									if(Text.contains("%d")){
										message.append(ChatColor.YELLOW);
										message.deleteCharAt(message.indexOf("%")+2);
										message.deleteCharAt(message.indexOf("%")+1);
										message.deleteCharAt(message.indexOf("%"));
										
									}
									if(Text.contains("%e")){
										message.append(ChatColor.WHITE);
										message.deleteCharAt(message.indexOf("%")+2);
										message.deleteCharAt(message.indexOf("%")+1);
										message.deleteCharAt(message.indexOf("%"));
										
									}								
						}
						Bukkit.getServer().broadcastMessage("*" + player.getName() + " " + message);
						return true;
					}
				 }
				}
					
				return true;
			}
		
		return false;
	}
}

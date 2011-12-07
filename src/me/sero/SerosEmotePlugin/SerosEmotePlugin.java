package me.sero.SerosEmotePlugin;

import java.util.logging.Logger;

import me.sero.SerosEmotePlugin.ChatCommands.PlayerM;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class SerosEmotePlugin extends JavaPlugin {

	public static SerosEmotePlugin plugin;
	public final Logger logger = Logger.getLogger("Minecraft");
	public final ServerChatPlayerListener playerListener = new ServerChatPlayerListener(this);
	
	@Override
	public void onDisable() {
		PluginDescriptionFile pdffile = this.getDescription();
		this.logger.info(pdffile.getName() + " is now disabled");
		System.out.println("SerosEmotePlugin deaktiviert!");
		
	}

	@Override
	public void onEnable() {
		
		//Chat commands
		getCommand("m").setExecutor(new PlayerM());
        
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvent(Event.Type.PLAYER_CHAT, this.playerListener, Event.Priority.Normal, this);	
		PluginDescriptionFile pdffile = this.getDescription();
		this.logger.info(pdffile.getName() + " version " + pdffile.getVersion() + " is enabled.");
		System.out.println("SerosEmotePlugin aktivieren!");
		
	}
	

}

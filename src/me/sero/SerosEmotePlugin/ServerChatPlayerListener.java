package me.sero.SerosEmotePlugin;

/*import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerChatEvent;*/
import org.bukkit.event.player.PlayerListener;

public class ServerChatPlayerListener extends PlayerListener{
	public static SerosEmotePlugin plugin;
	
	public ServerChatPlayerListener(SerosEmotePlugin instance){
		plugin = instance;		
	}
	
	/*public void OnPlayerChat(PlayerChatEvent chat){
		Player p = chat.getPlayer();
		String message = chat.getMessage();
		String message_lower = message.toLowerCase();
		ChatColor RED = ChatColor.RED;
		ChatColor WHITE = ChatColor.WHITE;
		
	}*/
}

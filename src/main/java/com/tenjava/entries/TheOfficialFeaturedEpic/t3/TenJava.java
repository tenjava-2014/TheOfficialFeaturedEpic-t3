package com.tenjava.entries.TheOfficialFeaturedEpic.t3;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class TenJava extends JavaPlugin {
  
  public void onEnable() {
		saveDefaultConfig();
	}

	public boolean onCommand(CommandSender s, Command c, String l, String[] args){
		
		if(l.equalsIgnoreCase("pokemine") || l.equalsIgnoreCase("pm") || l.equalsIgnoreCase("pmine")){
			
			if(s instanceof ConsoleCommandSender){
				
				s.sendMessage(ChatColor.DARK_RED + "You must be a player to execute that command!");
				return true;
				
			}
			
			Player p = (Player) s;
			
			if(args.length == 0){
				
				if(p.isOp() || p.hasPermission("pokemine.command.help")){
					
					return true;
				}
				
				p.sendMessage(ChatColor.DARK_RED + "You do not have permission to do that!");
				return true;
			}
			
			return true;
		}
		
		return false;
	}
}

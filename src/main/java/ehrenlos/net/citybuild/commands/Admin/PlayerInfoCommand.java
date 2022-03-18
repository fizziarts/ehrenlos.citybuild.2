package ehrenlos.net.citybuild.commands.Admin;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PlayerInfoCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        final Player player = (Player) sender;
        Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);
        try{
            String inet = targetPlayer.getAddress().toString();
            String ping = String.valueOf(targetPlayer.getPing());
            String name = targetPlayer.getName();
            String world = targetPlayer.getWorld().toString();
            String bed = targetPlayer.getBedSpawnLocation().toString();
            String loc = targetPlayer.getLocation().toString();
            sender.sendMessage(ChatColor.GOLD + "Name: " + ChatColor.WHITE + name +
                    ChatColor.GOLD + "\nAdresse: " + ChatColor.WHITE + inet +
                    ChatColor.GOLD + "\nPing: " + ChatColor.WHITE + ping +
                    ChatColor.GOLD + "\n\nWorld: " + ChatColor.WHITE + world +
                    ChatColor.GOLD + "\nPos: " + ChatColor.WHITE + loc +
                    ChatColor.GOLD + "\nSpawn: " + ChatColor.WHITE + bed);
        }catch (Exception exception){
            sender.sendMessage(Citybuild.getPrefix() + exception);
        }
        return false;
    }
}

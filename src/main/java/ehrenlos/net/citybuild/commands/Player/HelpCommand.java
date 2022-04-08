package ehrenlos.net.citybuild.commands.Player;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class HelpCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(ChatColor.GOLD + "/startup.help:" + " " + ChatColor.WHITE + "Zeigt dir die Befehle vom Plugin an.");
        sender.sendMessage(ChatColor.GOLD + "/date:" + " " + ChatColor.WHITE + "Zeigt dir das aktuelle Datum an.");
        sender.sendMessage(ChatColor.GOLD + "/sun:" + " " + ChatColor.WHITE + "Die Sonne zeigt sich.");
        sender.sendMessage(ChatColor.GOLD + "/rain:" + " " + ChatColor.WHITE + "Lässt es Regnen.");
        sender.sendMessage(ChatColor.GOLD + "/day:" + " " + ChatColor.WHITE + "Es wird hell.");
        sender.sendMessage(ChatColor.GOLD + "/night:" + " " + ChatColor.WHITE + "Es wird dunkel.");
        sender.sendMessage(ChatColor.GOLD + "/gm:" + " " + ChatColor.WHITE + "Ändert dein Modus zwischen 0 und 3.");
        sender.sendMessage(ChatColor.GOLD + "/vanish:" + " " + ChatColor.WHITE + "Damit wirst du unsichtbar.");
        return false;
    }
}

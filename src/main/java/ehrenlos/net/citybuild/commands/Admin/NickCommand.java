package ehrenlos.net.citybuild.commands.Admin;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class NickCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        final Player player = (Player) sender;
        if (sender.hasPermission("ehrenlos.kill")) {
            if (args.length == 1) {
                String nick = args[0];
                player.sendMessage(Citybuild.getPrefix() + "Dein neuer Name ist nun " + ChatColor.GOLD + nick);
                player.setDisplayName(nick);
            }
        } else {
            sender.sendMessage(Citybuild.getPrefix() + "Du hast kein Recht diesen Befehl auszuführen!");
        }
        return false;
    }
}

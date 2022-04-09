package ehrenlos.net.citybuild.commands.Admin;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class InvseeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(Citybuild.getPrefix() + "§cDu musst ein Spieler sein");
            return false;
        }

        final Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("invsee")) {
            if (player.hasPermission("citybuild.command.invsee")) {
                if (args.length != 1) {
                    player.sendMessage(Citybuild.getPrefix() + "§7Bitte benutze §e/invsee <Name>");
                }

                if (args.length == 1) {
                    Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);
                    player.openInventory(targetPlayer.getInventory());
                }
            } else {
                sender.sendMessage(Citybuild.getPrefix() + Citybuild.getNoPermissions());
            }
        }
        return false;
    }
}

package ehrenlos.net.citybuild.commands.Admin;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TeleportCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(Citybuild.getPrefix() + "§cDu musst ein Spieler sein");
            return false;
        }

        final Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("teleport")) {
            if (player.hasPermission("citybuild.command.teleport")) {
                if (args.length == 1) {
                    String name = args[0];
                    Player targetPlayer = Bukkit.getServer().getPlayer(name);
                    if (targetPlayer != null) {
                        player.teleport(targetPlayer.getLocation());
                    }
                    player.sendMessage(Citybuild.getPrefix() + "§2Du hast dich zu §6" + args[0] + " §2teleportiert");
                }
            } else {
                player.sendMessage(Citybuild.getPrefix() + Citybuild.getNoPermissions());
            }
        }
        return false;
    }
}

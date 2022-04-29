package ehrenlos.net.citybuild.commands.Warp;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetWarpCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(Citybuild.getPrefix() + "§cDu musst ein Spieler sein");
            return false;
        }

        final Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("setwarp")) {
            if (player.hasPermission("citybuild.command.setwarp")) {
                if (args.length != 1) {
                    player.sendMessage(Citybuild.getPrefix() + "§7Bitte benutze §e/setwarp <Name>");
                }

                if (args.length == 1) {
                    Citybuild.getInstance().getConfig().set("Warps" + "." + args[0] + ".world", player.getWorld().getName());
                    Citybuild.getInstance().getConfig().set("Warps" + "." + args[0] + ".x", player.getLocation().getX());
                    Citybuild.getInstance().getConfig().set("Warps" + "." + args[0] + ".y", player.getLocation().getY());
                    Citybuild.getInstance().getConfig().set("Warps" + "." + args[0] + ".z", player.getLocation().getZ());
                    Citybuild.getInstance().getConfig().set("Warps" + "." + args[0] + ".YAW", player.getLocation().getYaw());
                    Citybuild.getInstance().getConfig().set("Warps" + "." + args[0] + ".PITCH", player.getLocation().getPitch());
                    Citybuild.getInstance().saveConfig();

                    player.sendMessage(Citybuild.getPrefix() + "§2Du hast den Warp §6" + args[0] + " §2gesetzt");
                }
            } else {
                player.sendMessage(Citybuild.getPrefix() + Citybuild.getNoPermissions());
            }
        }
        return false;
    }
}

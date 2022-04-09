package ehrenlos.net.citybuild.commands.Warp;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WarpCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(Citybuild.getPrefix() + "§cDu musst ein Spieler sein");
            return false;
        }

        final Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("warp")) {
            if (player.hasPermission("citybuild.command.warp")) {
                if (args.length != 1) {
                    player.sendMessage(Citybuild.getPrefix() + "§7Bitte benutze §e/warp <Name>");
                }

                if (args.length == 1) {
                    World world = Bukkit.getWorld(Citybuild.getInstance().getConfig().getString("Warps" + "." + args[0] + ".world"));
                    double x = Citybuild.getInstance().getConfig().getDouble("Warps" + "." + args[0] + ".x");
                    double y = Citybuild.getInstance().getConfig().getDouble("Warps" + "." + args[0] + ".y");
                    double z = Citybuild.getInstance().getConfig().getDouble("Warps" + "." + args[0] + ".z");
                    Location location = new Location(world, x, y, z);
                    location.setYaw(Citybuild.getInstance().getConfig().getInt("Warps" + "." + args[0] + ".YAW"));
                    location.setPitch(Citybuild.getInstance().getConfig().getInt("Warps" + "." + args[0] + ".PITCH"));
                    player.teleport(location);

                    player.sendMessage(Citybuild.getPrefix() + "§2Du hast dich zum Warp §6" + args[0] + " §2teleportiert");
                }
            } else {
                player.sendMessage(Citybuild.getPrefix() + Citybuild.getNoPermissions());
            }
        }
        return false;
    }
}

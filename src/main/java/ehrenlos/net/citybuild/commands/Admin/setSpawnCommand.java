package ehrenlos.net.citybuild.commands.Admin;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class setSpawnCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(Citybuild.getPrefix() + "§cDu musst ein Spieler sein");
            return false;
        }

        final Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("setspawn")) {
            if (player.hasPermission("citybuild.command.setspawn")) {
                if (args.length == 0) {
                    Citybuild.getInstance().getConfig().set("Spawn" + ".world", player.getWorld().getName());
                    Citybuild.getInstance().getConfig().set("Spawn" + ".x", player.getLocation().getX());
                    Citybuild.getInstance().getConfig().set("Spawn" + ".y", player.getLocation().getY());
                    Citybuild.getInstance().getConfig().set("Spawn" + ".z", player.getLocation().getZ());
                    Citybuild.getInstance().getConfig().set("Spawn" + ".YAW", player.getLocation().getYaw());
                    Citybuild.getInstance().getConfig().set("Spawn" + ".PITCH", player.getLocation().getPitch());
                    Citybuild.getInstance().saveConfig();
                }
            } else {
                player.sendMessage(Citybuild.getPrefix() + Citybuild.getNoPermissions());
            }
        }
        return false;
    }
}

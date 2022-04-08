package ehrenlos.net.citybuild.commands.Warp;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetWarpCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            Citybuild.getInstance().getConfig().set("Warps" + "." + args[0] + ".world", player.getWorld().getName());
            Citybuild.getInstance().getConfig().set("Warps" + "." + args[0] + ".x", player.getLocation().getX());
            Citybuild.getInstance().getConfig().set("Warps" + "." + args[0] + ".y", player.getLocation().getY());
            Citybuild.getInstance().getConfig().set("Warps" + "." + args[0] + ".z", player.getLocation().getZ());
            Citybuild.getInstance().saveConfig();
            Citybuild.getInstance().reloadConfig();
        }
        return false;
    }
}

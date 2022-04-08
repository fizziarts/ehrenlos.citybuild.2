package ehrenlos.net.citybuild.commands;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class setSpawnCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            Citybuild.getInstance().getConfig().set("Spawn" + ".world", player.getWorld().getName());
            Citybuild.getInstance().getConfig().set("Spawn" + ".x", player.getLocation().getX());
            Citybuild.getInstance().getConfig().set("Spawn" + ".y", player.getLocation().getY());
            Citybuild.getInstance().getConfig().set("Spawn" + ".z", player.getLocation().getZ());
            Citybuild.getInstance().saveConfig();
            Citybuild.getInstance().reloadConfig();
        }
        return false;
    }
}

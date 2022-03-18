package ehrenlos.net.citybuild.commands;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class setSpawnCommand implements CommandExecutor {
    private Citybuild ehre;

    public setSpawnCommand(Citybuild ehre) {
        this.ehre = ehre;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            ehre.getConfig().set("Spawn" + ".world", player.getWorld().getName());
            ehre.getConfig().set("Spawn" + ".x", player.getLocation().getX());
            ehre.getConfig().set("Spawn" + ".y", player.getLocation().getY());
            ehre.getConfig().set("Spawn" + ".z", player.getLocation().getZ());
            ehre.saveConfig();
            ehre.reloadConfig();
        }
        return false;
    }
}

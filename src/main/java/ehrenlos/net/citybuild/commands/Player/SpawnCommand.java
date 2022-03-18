package ehrenlos.net.citybuild.commands.Player;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Objects;

public class SpawnCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        final Player player = (Player) sender;
        for (World world : Bukkit.getWorlds()) {
            ((Player) sender).getPlayer().teleport(((Player) sender).getPlayer().getWorld().getSpawnLocation());
            break;
        }
        return false;
    }
}

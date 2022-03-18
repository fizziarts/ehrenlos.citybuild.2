package ehrenlos.net.citybuild.commands.Admin.Weather;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.scheduler.BukkitTask;

public class ThunderCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        final Player player = (Player) sender;
        if (player.hasPermission("ehrenlos.thunder")){
            for (World world : Bukkit.getWorlds()) {
                world.strikeLightning(player.getLocation());
            }
        }
        return false;
    }
}

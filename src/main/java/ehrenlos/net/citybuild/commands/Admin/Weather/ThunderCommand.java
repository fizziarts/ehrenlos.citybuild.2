package ehrenlos.net.citybuild.commands.Admin.Weather;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ThunderCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        final Player player = (Player) sender;
        if (player.hasPermission("citybuild.command.thunder")) {
            for (World world : Bukkit.getWorlds()) {
                world.strikeLightning(player.getLocation());
            }
            player.sendMessage(Citybuild.getPrefix() + "§aDu hast das Wetter auf Gewitter gestellt");
        } else {
            player.sendMessage(Citybuild.getPrefix() + Citybuild.getNoPermissions());
        }
        return false;
    }
}

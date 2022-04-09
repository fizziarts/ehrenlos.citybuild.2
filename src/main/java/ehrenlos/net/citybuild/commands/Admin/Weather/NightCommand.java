package ehrenlos.net.citybuild.commands.Admin.Weather;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class NightCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        final Player player = (Player) sender;
        if (player.hasPermission("citybuild.command.night")) {
            for (World world : Bukkit.getWorlds()) {
                world.setTime(13000);
            }
            sender.sendMessage(Citybuild.getPrefix() + "§aDie Zeit wurde auf Nacht gestellt.");
        } else {
            sender.sendMessage(Citybuild.getPrefix() + Citybuild.getNoPermissions());
        }
        return false;
    }
}

package ehrenlos.net.citybuild.commands.Admin.Weather;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DayCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        final Player player = (Player) sender;
        if (player.hasPermission("ehrenlos.daynight")) {
            for (World world : Bukkit.getWorlds()) {
                world.setTime(1000);
            }
            sender.sendMessage(Citybuild.getPrefix() + "Die Zeit wurde auf 1000 gestellt.");
        } else {
            sender.sendMessage(Citybuild.getPrefix() + "Du hast dafür keine Rechte.");
        }
        return false;
    }
}

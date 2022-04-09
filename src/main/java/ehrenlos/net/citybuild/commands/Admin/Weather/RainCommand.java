package ehrenlos.net.citybuild.commands.Admin.Weather;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.WeatherType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RainCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        final Player player = (Player) sender;
        if (player.hasPermission("citybuild.command.rain")) {
            player.setPlayerWeather(WeatherType.DOWNFALL);
            player.sendMessage(Citybuild.getPrefix() + "§aDas Wetter wurde auf Regen gestellt.");
        } else {
            sender.sendMessage(Citybuild.getPrefix() + Citybuild.getNoPermissions());
        }
        return false;
    }
}

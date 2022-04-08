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
        if (player.hasPermission("ehrenlos.sunrain")) {
            player.setPlayerWeather(WeatherType.DOWNFALL);
            sender.sendMessage(Citybuild.getPrefix() + "Das Wetter wurde auf Regen gestellt.");
        } else {
            sender.sendMessage(Citybuild.getPrefix() + "Du hast dafür keine Rechte.");
        }
        return false;
    }
}

package ehrenlos.net.citybuild.commands.Admin.Weather;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.WeatherType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SunCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(Citybuild.getPrefix() + "§cDu musst ein Spieler sein");
            return false;
        }

        final Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("sun")) {
            if (player.hasPermission("citybuild.command.sun")) {
                if (args.length == 0) {
                    player.setPlayerWeather(WeatherType.CLEAR);
                    sender.sendMessage(Citybuild.getPrefix() + "§aDas Wetter wurde auf Sonnig gestellt.");
                }
            } else {
                player.sendMessage(Citybuild.getPrefix() + Citybuild.getNoPermissions());
            }
        }
        return false;
    }
}

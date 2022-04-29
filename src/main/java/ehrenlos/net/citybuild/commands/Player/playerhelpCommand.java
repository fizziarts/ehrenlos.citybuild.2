package ehrenlos.net.citybuild.commands.Player;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class playerhelpCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(Citybuild.getPrefix() + "§cDu musst ein Spieler sein");
            return false;
        }

        final Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("playerhelp")) {
            if (args.length == 0) {
                player.sendMessage(Citybuild.getPrefix() + "§6/startup.help: §7Zeigt dir die Befehle vom Plugin an.");
                player.sendMessage(Citybuild.getPrefix() + "§6/date: §7Zeigt dir das aktuelle Datum an.");
                player.sendMessage(Citybuild.getPrefix() + "§6/sun: §7Die Sonne zeigt sich.");
                player.sendMessage(Citybuild.getPrefix() + "§6/rain: §7Lässt es Regnen.");
                player.sendMessage(Citybuild.getPrefix() + "§6/day: §7Es wird hell.");
                player.sendMessage(Citybuild.getPrefix() + "§6/night: §7Es wird dunkel.");
                player.sendMessage(Citybuild.getPrefix() + "§6/gm: §7Ändert dein Modus zwischen 0 und 3.");
                player.sendMessage(Citybuild.getPrefix() + "§6/vanish: §7Damit wirst du unsichtbar.");
            }
        }
        return false;
    }
}

package ehrenlos.net.citybuild.commands.Player;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class playerhelpCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(Citybuild.getPrefix() + "§6/startup.help: §7Zeigt dir die Befehle vom Plugin an.");
        sender.sendMessage(Citybuild.getPrefix() + "§6/date: §7Zeigt dir das aktuelle Datum an.");
        sender.sendMessage(Citybuild.getPrefix() + "§6/sun: §7Die Sonne zeigt sich.");
        sender.sendMessage(Citybuild.getPrefix() + "§6/rain: §7Lässt es Regnen.");
        sender.sendMessage(Citybuild.getPrefix() + "§6/day: §7Es wird hell.");
        sender.sendMessage(Citybuild.getPrefix() + "§6/night: §7Es wird dunkel.");
        sender.sendMessage(Citybuild.getPrefix() + "§6/gm: §7Ändert dein Modus zwischen 0 und 3.");
        sender.sendMessage(Citybuild.getPrefix() + "§6/vanish: §7Damit wirst du unsichtbar.");
        return false;
    }
}

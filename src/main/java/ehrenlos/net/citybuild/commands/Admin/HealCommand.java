package ehrenlos.net.citybuild.commands.Admin;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("ehrenlos.heal")) {
            final Player player = (Player) sender;
            player.setHealth(20);
            player.setFoodLevel(20);
            player.sendMessage(Citybuild.getPrefix() + "Du hast dich erfolgreich geheilt.");
        } else {
            sender.sendMessage(Citybuild.getPrefix() + "Du hast kein Recht diesen Befehl auszuführen!");
        }
        return false;
    }
}

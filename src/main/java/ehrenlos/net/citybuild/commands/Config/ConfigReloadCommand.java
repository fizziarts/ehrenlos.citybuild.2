package ehrenlos.net.citybuild.commands.Config;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ConfigReloadCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (sender instanceof Player) {
            if (sender.isOp()) {
                Citybuild.getInstance().reloadConfig();
                sender.sendMessage(Citybuild.getPrefix() + "Die Config wurde neu geladen.");
            } else {
                sender.sendMessage(Citybuild.getPrefix() + "Du hast kein Recht diesen Befehl auszuführen!");
            }
        }
        return false;
    }
}

package ehrenlos.net.citybuild.commands.Admin;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class InvseeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        final Player player = (Player) sender;
        if (player.hasPermission("ehrenlos.invsee")){
            try {
                Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);
                player.openInventory(targetPlayer.getInventory());
            } catch (Exception exception) {
                sender.sendMessage(Citybuild.getPrefix() + "Bitte wähle einen Spieler!");
            }
        }else{
            sender.sendMessage(Citybuild.getPrefix() + "Du hast kein Recht diesen Befehl auszuführen!");
        }
        return false;
    }
}

package ehrenlos.net.citybuild.commands.Admin;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class KillCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("ehrenlos.kill")){
            Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);
            targetPlayer.damage(20);
        }else{
            sender.sendMessage(Citybuild.getPrefix() + "Du hast kein Recht diesen Befehl auszuführen!");
        }
        return false;
    }
}

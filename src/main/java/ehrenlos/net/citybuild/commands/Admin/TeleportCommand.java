package ehrenlos.net.citybuild.commands.Admin;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TeleportCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        try {
            final Player player = (Player) sender;
            Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);
            player.teleport(targetPlayer.getLocation());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return false;
    }
}

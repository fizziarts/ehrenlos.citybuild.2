package ehrenlos.net.citybuild.commands.Admin;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        final Player player = (Player) sender;

        try {
            if (player.hasPermission("citybuild.command.admin.fly")) {
                Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);
                if (targetPlayer.isFlying()) {
                    player.getPlayer().sendMessage(Citybuild.getPrefix() + "§cDu hast §6" + args[0] + " §cden Flugmodus weggenommen.");
                    targetPlayer.getPlayer().setAllowFlight(false);
                    targetPlayer.setFlying(false);
                } else {
                    player.getPlayer().sendMessage(Citybuild.getPrefix() + "§2Du hast §6" + args[0] + " §2in den Flugmodus gesetzt.");
                    targetPlayer.getPlayer().setAllowFlight(true);
                    targetPlayer.setFlying(true);
                }
            }
        } catch (Exception exception) {
            if (player.hasPermission("citybuild.command.fly")) {
                if (player.isFlying()) {
                    player.getPlayer().sendMessage(Citybuild.getPrefix() + "§cDu befindest dich nicht mehr im Flugmodus!");
                    player.getPlayer().setAllowFlight(false);
                    player.setFlying(false);
                } else {
                    player.getPlayer().sendMessage(Citybuild.getPrefix() + "§2Du befindest dich nun im Flugmodus!");
                    player.getPlayer().setAllowFlight(true);
                    player.setFlying(true);
                }
            }
        }
        return false;
    }
}

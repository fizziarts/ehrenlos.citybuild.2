package ehrenlos.net.citybuild.commands.Admin;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(Citybuild.getPrefix() + "§cDu musst ein Spieler sein");
            return false;
        }

        final Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("fly")) {
            if (player.hasPermission("citybuild.command.fly")) {
                if (args.length == 0) {
                    if (player.isFlying()) {
                        player.sendMessage(Citybuild.getPrefix() + "§cDu befindest dich nicht mehr im Flugmodus!");
                        player.setAllowFlight(false);
                        player.setFlying(false);
                    } else {
                        player.sendMessage(Citybuild.getPrefix() + "§2Du befindest dich nun im Flugmodus!");
                        player.setAllowFlight(true);
                        player.setFlying(true);
                    }
                }

                if (args.length == 1) {
                    String name = args[0];
                    Player targetPlayer = Bukkit.getServer().getPlayer(name);
                    if (targetPlayer != null) {
                        if (targetPlayer.isFlying()) {
                            player.sendMessage(Citybuild.getPrefix() + "§cDu hast §6" + args[0] + " §cden Flugmodus weggenommen.");
                            targetPlayer.setAllowFlight(false);
                            targetPlayer.setFlying(false);
                        } else {
                            player.sendMessage(Citybuild.getPrefix() + "§2Du hast §6" + args[0] + " §2in den Flugmodus gesetzt.");
                            targetPlayer.setAllowFlight(true);
                            targetPlayer.setFlying(true);
                        }
                    }
                }
            } else {
                player.sendMessage(Citybuild.getPrefix() + Citybuild.getNoPermissions());
            }
        }
        return false;
    }
}

package ehrenlos.net.citybuild.commands.Admin;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PlayerInfoCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(Citybuild.getPrefix() + "§cDu musst ein Spieler sein");
            return false;
        }

        final Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("playerinfo")) {
            if (player.hasPermission("citybuild.command.playerinfo")) {
                if (args.length == 1) {
                    String name = args[0];
                    Player targetPlayer = Bukkit.getServer().getPlayer(name);

                    String ip = targetPlayer.getAddress().toString();
                    String ping = String.valueOf(targetPlayer.getPing());
                    String playername = targetPlayer.getName();
                    String world = targetPlayer.getWorld().getName();
                    Location bed = targetPlayer.getBedSpawnLocation();
                    String loc = targetPlayer.getLocation().toString();

                    player.sendMessage(Citybuild.getPrefix() + "§6Name: §7" + playername);
                    player.sendMessage(Citybuild.getPrefix() + "§6Adresse: §7" + ip);
                    player.sendMessage(Citybuild.getPrefix() + "§6Ping: §7" + ping);
                    player.sendMessage(Citybuild.getPrefix() + "§6Welt: §7" + world);
                    player.sendMessage(Citybuild.getPrefix() + "§6Position: §7" + loc);
                    player.sendMessage(Citybuild.getPrefix() + "§6Bed: §7" + bed);
                }
            } else {
                player.sendMessage(Citybuild.getPrefix() + Citybuild.getNoPermissions());
            }
        }
        return false;
    }
}

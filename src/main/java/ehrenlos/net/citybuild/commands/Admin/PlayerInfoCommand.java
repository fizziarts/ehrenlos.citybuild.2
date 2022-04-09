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
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        final Player player = (Player) sender;
        Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);
        try {
            String ip = targetPlayer.getAddress().toString();
            String ping = String.valueOf(targetPlayer.getPing());
            String name = targetPlayer.getName();
            String world = targetPlayer.getWorld().getName();
            Location bed = targetPlayer.getBedSpawnLocation();
            String loc = targetPlayer.getLocation().toString();

            player.sendMessage(Citybuild.getPrefix() + "§6Name: §7" + name);
            player.sendMessage(Citybuild.getPrefix() + "§6Adresse: §7" + ip);
            player.sendMessage(Citybuild.getPrefix() + "§6Ping: §7" + ping);
            player.sendMessage(Citybuild.getPrefix() + "§6Welt: §7" + world);
            player.sendMessage(Citybuild.getPrefix() + "§6Position: §7" + loc);
            player.sendMessage(Citybuild.getPrefix() + "§6Bed: §7" + bed);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return false;
    }
}

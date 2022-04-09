package ehrenlos.net.citybuild.commands.Warp;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DelWarpCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(Citybuild.getPrefix() + "§cDu musst ein Spieler sein");
            return false;
        }

        final Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("delwarp")) {
            if (player.hasPermission("citybuild.command.delwarp")) {
                if (args.length != 1) {
                    player.sendMessage(Citybuild.getPrefix() + "§7Bitte benutze §e/delwarp <Name>");
                }

                if (args.length == 1) {
                    Citybuild.getInstance().getConfig().set("Warps" + "." + args[0], null);
                    Citybuild.getInstance().saveConfig();

                    player.sendMessage(Citybuild.getPrefix() + "§2Du hast den Warp §6" + args[0] + " §2gelöscht");
                }
            } else {
                player.sendMessage(Citybuild.getPrefix() + Citybuild.getNoPermissions());
            }
        }
        return false;
    }
}

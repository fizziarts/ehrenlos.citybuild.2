package ehrenlos.net.citybuild.commands.Admin;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class VanishCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        final Player player = (Player) sender;
        if (player.hasPermission("citybuild.command.vanish")) {
            if (player.isInvisible()) {
                player.setInvisible(false);
                sender.sendMessage(Citybuild.getPrefix() + "Du bist nun wieder sichtbar.");
                player.playSound(player.getLocation(), Sound.BLOCK_BAMBOO_PLACE, 1, 1);
            } else {
                player.setInvisible(true);
                sender.sendMessage(Citybuild.getPrefix() + "Du bist nun unsichtbar.");
                player.playSound(player.getLocation(), Sound.BLOCK_BAMBOO_BREAK, 1, 1);
            }
        } else {
            sender.sendMessage(Citybuild.getPrefix() + Citybuild.getNoPermissions());
        }
        return false;
    }
}

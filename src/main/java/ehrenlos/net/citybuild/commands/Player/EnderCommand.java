package ehrenlos.net.citybuild.commands.Player;

import org.bukkit.Bukkit;
import org.bukkit.EntityEffect;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        final Player player = (Player) sender;

        try{
            if (player.hasPermission("ehrenlos.admin.enderchest")){
                Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);
                player.openInventory(targetPlayer.getEnderChest());
                player.playEffect(EntityEffect.TELEPORT_ENDER);
                player.playSound(player.getPlayer().getLocation(), Sound.BLOCK_ENDER_CHEST_OPEN, 1, 1);
            }
        }catch (Exception exception){
            if (player.hasPermission("ehrenlos.enderchest")) {
                player.openInventory(player.getEnderChest());
                player.playEffect(EntityEffect.TELEPORT_ENDER);
                player.playSound(player.getPlayer().getLocation(), Sound.BLOCK_ENDER_CHEST_OPEN, 1, 1);
            }
        }
        return false;
    }
}

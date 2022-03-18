package ehrenlos.net.citybuild.listeners;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event) throws InterruptedException {
        Player player = event.getPlayer();
        event.setJoinMessage(null);
        event.setJoinMessage(Citybuild.getPrefix() + ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "+" + ChatColor.DARK_GRAY + "] " + ChatColor.WHITE + player.getName());
        player.sendMessage(Citybuild.getPrefix() + "Willkommen " + player.getName() + "!");
        player.getPlayer().teleport(player.getPlayer().getWorld().getSpawnLocation());
        if (player.isOp()){
            player.sendTitle("Willkommen auf " + ChatColor.GOLD + "ehrenlos.net", ChatColor.RED + player.getName());
        }else{
            player.sendTitle("Willkommen auf " + ChatColor.GOLD + "ehrenlos.net", player.getName());
        }
        player.setGameMode(GameMode.SURVIVAL);
    }
}

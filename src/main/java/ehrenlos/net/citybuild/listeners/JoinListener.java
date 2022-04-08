package ehrenlos.net.citybuild.listeners;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        event.setJoinMessage(Citybuild.getPrefix() + "§7[§2+§7] §f" + player.getName());

        player.sendMessage(Citybuild.getPrefix() + "Willkommen " + player.getName() + "!");

        player.teleport(player.getWorld().getSpawnLocation());

        if (player.isOp()) {
            player.sendTitle("Willkommen auf §6ehrenlos.net", "§4" + player.getName());
        } else {
            player.sendTitle("Willkommen auf §6ehrenlos.net", player.getName());
        }

        player.setGameMode(GameMode.SURVIVAL);
    }
}

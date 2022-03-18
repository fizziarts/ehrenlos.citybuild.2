package ehrenlos.net.citybuild.listeners;

import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

public class RespawnListener implements Listener {
    public void onRespawn(PlayerRespawnEvent event){
        event.setRespawnLocation(event.getPlayer().getWorld().getSpawnLocation());
    }
}

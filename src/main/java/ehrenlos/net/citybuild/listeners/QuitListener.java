package ehrenlos.net.citybuild.listeners;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class QuitListener implements Listener {

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        event.setQuitMessage(Citybuild.getPrefix() + "§7[§4-§7] §f" + player.getName());
    }
}

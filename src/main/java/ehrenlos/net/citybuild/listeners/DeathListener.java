package ehrenlos.net.citybuild.listeners;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListener implements Listener {
    @EventHandler
    public void onDeath(PlayerDeathEvent event){
        Player player = event.getEntity();
        event.setDeathMessage(null);
        event.setDeathMessage(player.getName() + " ist gestorben!");
        for (World world : Bukkit.getWorlds()) {
            event.setDeathMessage(Citybuild.getPrefix() + player.getName() + " ist gestorben!");
            player.getPlayer().setGameMode(GameMode.SURVIVAL);
        }
    }
}

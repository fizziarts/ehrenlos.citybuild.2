package ehrenlos.net.citybuild.listeners;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.World;
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

        World world = Bukkit.getWorld(Citybuild.getInstance().getConfig().getString("Spawn" + ".world"));
        double x = Citybuild.getInstance().getConfig().getDouble("Spawn" + ".x");
        double y = Citybuild.getInstance().getConfig().getDouble("Spawn" + ".y");
        double z = Citybuild.getInstance().getConfig().getDouble("Spawn" + ".z");
        Location location = new Location(world, x, y, z);
        location.setYaw(Citybuild.getInstance().getConfig().getInt("Spawn" + ".YAW"));
        location.setPitch(Citybuild.getInstance().getConfig().getInt("Spawn" + ".PITCH"));

        player.teleport(location);

        if (player.isOp()) {
            player.sendTitle("Willkommen auf §6ehrenlos.net", "§4" + player.getName());
        } else {
            player.sendTitle("Willkommen auf §6ehrenlos.net", player.getName());
        }

        player.setGameMode(GameMode.SURVIVAL);
        player.setPlayerTime(1000, true);
    }
}

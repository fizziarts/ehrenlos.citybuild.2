package ehrenlos.net.citybuild.commands.Player;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        final Player player = (Player) sender;

        World world = Bukkit.getWorld(Citybuild.getInstance().getConfig().getString("Spawn" + ".world"));
        double x = Citybuild.getInstance().getConfig().getDouble("Spawn" + ".x");
        double y = Citybuild.getInstance().getConfig().getDouble("Spawn" + ".y");
        double z = Citybuild.getInstance().getConfig().getDouble("Spawn" + ".z");
        Location location = new Location(world, x, y, z);
        location.setYaw(Citybuild.getInstance().getConfig().getInt("Spawn" + ".YAW"));
        location.setPitch(Citybuild.getInstance().getConfig().getInt("Spawn" + ".PITCH"));

        player.teleport(location);
        return false;
    }
}

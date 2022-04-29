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
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(Citybuild.getPrefix() + "§cDu musst ein Spieler sein");
            return false;
        }

        final Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("spawn")) {
            if (args.length == 0) {
                World world = Bukkit.getWorld(Citybuild.getInstance().getConfig().getString("Spawn" + ".world"));
                double x = Citybuild.getInstance().getConfig().getDouble("Spawn" + ".x");
                double y = Citybuild.getInstance().getConfig().getDouble("Spawn" + ".y");
                double z = Citybuild.getInstance().getConfig().getDouble("Spawn" + ".z");
                Location location = new Location(world, x, y, z);
                location.setYaw(Citybuild.getInstance().getConfig().getInt("Spawn" + ".YAW"));
                location.setPitch(Citybuild.getInstance().getConfig().getInt("Spawn" + ".PITCH"));

                player.teleport(location);
            }
        }
        return false;
    }
}

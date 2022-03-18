package ehrenlos.net.citybuild.commands.Warp;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;


public class WarpCommand implements CommandExecutor {

    private Citybuild ehre;

    public WarpCommand(Citybuild ehre){
        this.ehre = ehre;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            World world = Bukkit.getWorld(ehre.getConfig().getString("Warps" + "." + args[0] + ".world"));
            double x = ehre.getConfig().getDouble("Warps" + "." + args[0] + ".x");
            double y = ehre.getConfig().getDouble("Warps" + "." + args[0] + ".y");
            double z = ehre.getConfig().getDouble( "Warps" + "." + args[0] + ".z");
            Location location = new Location(world, x, y, z);
            player.teleport(location);
        }
        return false;
    }
}

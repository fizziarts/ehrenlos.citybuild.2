package ehrenlos.net.citybuild.commands.Warp;
import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetWarpCommand implements CommandExecutor {

    private Citybuild ehre;

    public SetWarpCommand(Citybuild ehre){
        this.ehre = ehre;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player player = (Player) sender;

            ehre.getConfig().set("Warps" + "." + args[0] + ".world", player.getWorld().getName());
            ehre.getConfig().set("Warps" + "." + args[0] + ".x", player.getLocation().getX());
            ehre.getConfig().set("Warps" + "." + args[0] + ".y", player.getLocation().getY());
            ehre.getConfig().set("Warps" + "." + args[0] + ".z", player.getLocation().getZ());
            ehre.saveConfig();
            ehre.reloadConfig();
        }
        return false;
    }
}

package ehrenlos.net.citybuild.commands;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Random;

public class TrollCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        int min = Integer.parseInt(args[2]);
        int max = Integer.parseInt(args[3]);

        Player player = (Player) sender;
        Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);

        for (int i = 0; i <= Integer.parseInt(args[1]); i++) {
            Random random = new Random();
            int time = min + random.nextInt((max - min) + 1);
            player.sendMessage(Citybuild.getPrefix() + args[0] + "stirbt in " + "§6" + time + " Sekunden.");
            Bukkit.getScheduler().runTaskTimer(Citybuild.getInstance(), () -> {
                targetPlayer.setHealth(0);
                targetPlayer.setFoodLevel(0);
            }, 20, 20);
        }
        return false;
    }
}

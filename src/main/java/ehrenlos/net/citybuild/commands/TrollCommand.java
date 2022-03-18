package ehrenlos.net.citybuild.commands;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Random;

public class TrollCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        int min = Integer.valueOf(args[2]);
        int max = Integer.valueOf(args[3]);
        Player player = (Player) sender;
        Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);

        for (int i = 0; i <= Integer.valueOf(args[1]); i++){
            Random random = new Random();
            Integer time = min + random.nextInt((max - min) + 1);
            player.sendMessage(Citybuild.getPrefix() + args[0] + "stirbt in " + ChatColor.GOLD + String.valueOf(time) + " Sekunden.");
            try {
                Bukkit.getScheduler().wait(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            targetPlayer.setHealth(0);
            targetPlayer.setFoodLevel(0);
        }

        return false;
    }
}

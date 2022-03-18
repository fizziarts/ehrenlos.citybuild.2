package ehrenlos.net.citybuild.commands.Player;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MsgCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);

        if (args.length == 2){
            player.sendMessage(Citybuild.getPrefix() + ChatColor.RED + "DIR" + ChatColor.WHITE + " ---> " + targetPlayer.getName() + ": " + args[1]);
            targetPlayer.sendMessage(Citybuild.getPrefix() + ChatColor.RED  + "DIR" + ChatColor.WHITE +  " <--- " + player.getName() + ChatColor.WHITE + ": " + args[1]);
        } else if (args.length == 3){
            player.sendMessage(Citybuild.getPrefix() + ChatColor.RED + "DIR" + ChatColor.WHITE + " ---> " + targetPlayer.getName() + ": " + args[1] + " " + args[2]);
            targetPlayer.sendMessage(Citybuild.getPrefix() + ChatColor.RED  + "DIR" + ChatColor.WHITE +  " <--- " + player.getName() + ChatColor.WHITE + ": " + args[1] + " " + args[2]);
        } else if (args.length == 4){
            player.sendMessage(Citybuild.getPrefix() + ChatColor.RED + "DIR" + ChatColor.WHITE + " ---> " + targetPlayer.getName() + ": " + args[1] + " " + args[2]  + " " + args[3]);
            targetPlayer.sendMessage(Citybuild.getPrefix() + ChatColor.RED  + "DIR" + ChatColor.WHITE +  " <--- " + player.getName() + ChatColor.WHITE + ": " + args[1] + " " + args[2]  + " " + args[3]);
        } else if (args.length == 5){
            player.sendMessage(Citybuild.getPrefix() + ChatColor.RED + "DIR" + ChatColor.WHITE + " ---> " + targetPlayer.getName() + ": " + args[1] + " " + args[2] + " " + args[3]  + " " + args[4]);
            targetPlayer.sendMessage(Citybuild.getPrefix() + ChatColor.RED  + "DIR" + ChatColor.WHITE +  " <--- " + player.getName() + ChatColor.WHITE + ": " + args[1] + " " + args[2]  + " " + args[3] + " " + args[4]);
        } else if (args.length == 6) {
            player.sendMessage(Citybuild.getPrefix() + ChatColor.RED + "DIR" + ChatColor.WHITE + " ---> " + targetPlayer.getName() + ": " + args[1] + " " + args[2]  + " " + args[3]  + " " + args[4]  + " " + args[5]);
            targetPlayer.sendMessage(Citybuild.getPrefix() + ChatColor.RED  + "DIR" + ChatColor.WHITE +  " <--- " + player.getName() + ChatColor.WHITE + ": " + args[1] + " " + args[2]  + " " + args[3]  + " " + args[4]  + " " + args[5]);
        }else if (args.length == 7){
            player.sendMessage(Citybuild.getPrefix() + ChatColor.RED + "DIR" + ChatColor.WHITE + " ---> " + targetPlayer.getName() + ": " + args[1] + " " + args[2]  + " " + args[3]  + " " + args[4]  + " " + args[5] + " " + args[6]);
            targetPlayer.sendMessage(Citybuild.getPrefix() + ChatColor.RED  + "DIR" + ChatColor.WHITE +  " <--- " + player.getName() + ChatColor.WHITE + ": " + args[1] + " " + args[2]  + " " + args[3]  + " " + args[4]  + " " + args[5] + " " + args[6]);
        }else if (args.length == 8) {
            player.sendMessage(Citybuild.getPrefix() + ChatColor.RED + "DIR" + ChatColor.WHITE + " ---> " + targetPlayer.getName() + ": " + args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7]);
            targetPlayer.sendMessage(Citybuild.getPrefix() + ChatColor.RED + "DIR" + ChatColor.WHITE + " <--- " + player.getName() + ChatColor.WHITE + ": " + args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7]);
        } else if (args.length == 9) {
            player.sendMessage(Citybuild.getPrefix() + ChatColor.RED + "DIR" + ChatColor.WHITE + " ---> " + targetPlayer.getName() + ": " + args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8]);
            targetPlayer.sendMessage(Citybuild.getPrefix() + ChatColor.RED + "DIR" + ChatColor.WHITE + " <--- " + player.getName() + ChatColor.WHITE + ": " + args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8]);
        } else if (args.length == 10) {
        player.sendMessage(Citybuild.getPrefix() + ChatColor.RED + "DIR" + ChatColor.WHITE + " ---> " + targetPlayer.getName() + ": " + args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8] + " " + args[9]);
        targetPlayer.sendMessage(Citybuild.getPrefix() + ChatColor.RED + "DIR" + ChatColor.WHITE + " <--- " + player.getName() + ChatColor.WHITE + ": " + args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8] + " " + args[9]);
        } else if (args.length == 11) {
            player.sendMessage(Citybuild.getPrefix() + ChatColor.RED + "DIR" + ChatColor.WHITE + " ---> " + targetPlayer.getName() + ": " + args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8] + " " + args[9] + " " + args[10]);
            targetPlayer.sendMessage(Citybuild.getPrefix() + ChatColor.RED + "DIR" + ChatColor.WHITE + " <--- " + player.getName() + ChatColor.WHITE + ": " + args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8] + " " + args[9] + " " + args[10]);
        }
        else{
            player.sendMessage(Citybuild.getPrefix() + ChatColor.RED + "Deine Nachricht ist zu lang!");
        }

        return false;
    }
}

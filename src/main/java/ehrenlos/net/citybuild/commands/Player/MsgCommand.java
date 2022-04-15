package ehrenlos.net.citybuild.commands.Player;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MsgCommand implements CommandExecutor {

    //TODO Edit

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(Citybuild.getPrefix() + "§cDu musst ein Spieler sein");
            return false;
        }

        final Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("msg")) {
            if (player.hasPermission("citybuild.command.msg")) {
                if (args.length < 2) {
                    player.sendMessage(Citybuild.getPrefix() + "§7Bitte benutze §e/msg <Name> <Nachricht>");
                }

                if (args.length >= 2) {
                    String name = args[0];
                    final Player targetPlayer = Bukkit.getServer().getPlayer(name);
                    String msg = "";
                    for (int i = 1; i < args.length; i++) {
                        msg = msg + " " + args[i];
                    }

                    if (targetPlayer != null) {
                        player.sendMessage(Citybuild.getPrefix() + "§cDu §8--> §4" + targetPlayer.getName() + " §8|§e" + msg);
                        targetPlayer.sendMessage(Citybuild.getPrefix() + "§4" + player.getName() + " §8--> §cDir §8|§e" + msg);
                    } else {
                        player.sendMessage(Citybuild.getPrefix() + "§cDer Spieler ist nicht online");
                    }
                }
            } else {
                player.sendMessage(Citybuild.getPrefix() + Citybuild.getNoPermissions());
            }
        }
        return false;
    }
}

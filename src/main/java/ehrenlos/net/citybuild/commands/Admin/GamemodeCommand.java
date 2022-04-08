package ehrenlos.net.citybuild.commands.Admin;

import ehrenlos.net.citybuild.Citybuild;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        final Player player = (Player) sender;
        if (player.hasPermission("ehrenlos.gm")) {
            if (command.getName().equalsIgnoreCase("gm")) {
                if (args.length == 0) {
                    player.sendMessage(Citybuild.getPrefix() + "Bitte benutze /gm 0, 1, 2, 3");
                }
                if (args.length == 1) {
                    if (args[0].equalsIgnoreCase("0")) {
                        if (player.getGameMode() == GameMode.SURVIVAL) {
                            player.sendMessage(Citybuild.getPrefix() + "Du bist bereits im Survival Modus.");
                        } else {
                            player.setGameMode(GameMode.SURVIVAL);
                            player.sendMessage(Citybuild.getPrefix() + "Du befindest dich nun im Survival Modus.");
                        }
                    } else if (args[0].equalsIgnoreCase("1")) {
                        if (player.getGameMode() == GameMode.CREATIVE) {
                            player.sendMessage(Citybuild.getPrefix() + "Du bist bereits im Creative Modus.");
                        } else {
                            player.setGameMode(GameMode.CREATIVE);
                            player.sendMessage(Citybuild.getPrefix() + "Du befindest dich nun im Creative Modus.");
                        }
                    } else if (args[0].equalsIgnoreCase("2")) {
                        if (player.getGameMode() == GameMode.ADVENTURE) {
                            player.sendMessage(Citybuild.getPrefix() + "Du bist bereits im Adventure Modus.");
                        } else {
                            player.setGameMode(GameMode.ADVENTURE);
                            player.sendMessage(Citybuild.getPrefix() + "Du befindest dich nun im Adventure Modus.");
                        }
                    } else if (args[0].equalsIgnoreCase("3")) {
                        if (player.getGameMode() == GameMode.SPECTATOR) {
                            player.sendMessage(Citybuild.getPrefix() + "Du bist bereits im Spectator Modus.");
                        } else {
                            player.setGameMode(GameMode.SPECTATOR);
                            player.sendMessage(Citybuild.getPrefix() + "Du befindest dich nun im Spectator Modus.");
                        }
                    } else {
                        player.sendMessage(Citybuild.getPrefix() + "Bitte benutze /gm 0, 1, 2, 3");
                    }
                }
            }
        } else {
            sender.sendMessage(Citybuild.getPrefix() + "Du hast dafür keine Rechte.");
        }
        return false;
    }
}

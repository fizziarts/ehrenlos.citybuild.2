package ehrenlos.net.citybuild.duty;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class DutyMenu implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        final Player player = (Player) sender;

        org.bukkit.inventory.Inventory inv = Bukkit.createInventory(player, 9, ChatColor.RED.toString() + "Admin Tools!");

        ItemStack glass = new ItemStack(Material.BLUE_STAINED_GLASS_PANE);
        glass.setItemMeta(null);
        inv.setItem(0, glass);

        ItemStack glass2 = new ItemStack(Material.BLUE_STAINED_GLASS_PANE);
        glass.setItemMeta(null);
        inv.setItem(1, glass);

        ItemStack glass3 = new ItemStack(Material.BLUE_STAINED_GLASS_PANE);
        glass.setItemMeta(null);
        inv.setItem(2, glass);

        ItemStack chest1 = new ItemStack(Material.CHEST);
        ItemMeta meta = chest1.getItemMeta();
        meta.setDisplayName(ChatColor.BLUE + "World Settings");
        meta.setLore(Arrays.asList(
                "Hier kannst du die Welt beeinträchtigen."
        ));
        chest1.setItemMeta(meta);
        inv.setItem(3, chest1);

        ItemStack chest2 = new ItemStack(Material.CHEST);
        ItemMeta meta2 = chest2.getItemMeta();
        meta2.setDisplayName(ChatColor.BLUE + "Player Commands");
        meta2.setLore(Arrays.asList(
                "..."
        ));
        chest2.setItemMeta(meta2);
        inv.setItem(4, chest2);

        ItemStack chest3 = new ItemStack(Material.CHEST);
        ItemMeta meta3 = chest3.getItemMeta();
        meta3.setDisplayName(ChatColor.BLUE + "Chest 3");
        meta3.setLore(Arrays.asList(
                "..."
        ));
        chest3.setItemMeta(meta3);
        inv.setItem(5, chest3);

        ItemStack glass6 = new ItemStack(Material.BLUE_STAINED_GLASS_PANE);
        glass.setItemMeta(null);
        inv.setItem(6, glass);

        ItemStack glass7 = new ItemStack(Material.BLUE_STAINED_GLASS_PANE);
        glass.setItemMeta(null);
        inv.setItem(7, glass);

        ItemStack close = new ItemStack(Material.BARRIER);
        ItemMeta meta1 = close.getItemMeta();
        meta1.setDisplayName(ChatColor.BLUE + "Close");
        meta1.setLore(Arrays.asList(
                "..."
        ));
        close.setItemMeta(meta1);
        inv.setItem(8, close);

        ((Player) sender).openInventory(inv);
        return false;
    }
}

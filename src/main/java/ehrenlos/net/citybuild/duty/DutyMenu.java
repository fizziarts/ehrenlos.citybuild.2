package ehrenlos.net.citybuild.duty;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class DutyMenu implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        final Player player = (Player) sender;

        Inventory inv = Bukkit.createInventory(null, 9, "§4Admin Tools!");

        ItemStack playeholder = new ItemStack(Material.BLUE_STAINED_GLASS_PANE);
        ItemMeta placeMeta = playeholder.getItemMeta();
        placeMeta.setDisplayName("§r");
        playeholder.setItemMeta(placeMeta);

        // Lücken im Inventar mit Item ausfüllen
        for (int i = 0; i < inv.getSize(); i++) {
            if (inv.getItem(i) == null) {
                inv.setItem(i, playeholder);
            }
        }

        ItemStack chest1 = new ItemStack(Material.CHEST);
        ItemMeta meta = chest1.getItemMeta();
        meta.setDisplayName("§9World Settings");
        meta.setLore(Arrays.asList("Hier kannst du die Welt beeinträchtigen."));
        chest1.setItemMeta(meta);
        inv.setItem(3, chest1);

        ItemStack chest2 = new ItemStack(Material.CHEST);
        ItemMeta meta2 = chest2.getItemMeta();
        meta2.setDisplayName("§9Player Commands");
        meta2.setLore(Arrays.asList("..."));
        chest2.setItemMeta(meta2);
        inv.setItem(4, chest2);

        ItemStack chest3 = new ItemStack(Material.CHEST);
        ItemMeta meta3 = chest3.getItemMeta();
        meta3.setDisplayName("§9Chest 3");
        meta3.setLore(Arrays.asList("..."));
        chest3.setItemMeta(meta3);
        inv.setItem(5, chest3);

        ItemStack close = new ItemStack(Material.BARRIER);
        ItemMeta meta1 = close.getItemMeta();
        meta1.setDisplayName("§cClose");
        meta1.setLore(Arrays.asList("..."));
        close.setItemMeta(meta1);
        inv.setItem(8, close);

        player.openInventory(inv);
        return false;
    }
}

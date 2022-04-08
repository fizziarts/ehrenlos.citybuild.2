package ehrenlos.net.citybuild.duty;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class DutyMenuListener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        if (e.getView().getTitle().equals(ChatColor.RED + "Admin Tools!") && e.getCurrentItem() != null) {

            e.setCancelled(true);
            Player player = (Player) e.getWhoClicked();

            switch (e.getRawSlot()) {
                case 3:
                    Inventory inv1 = Bukkit.createInventory(player, 9, ChatColor.RED + "World Settings!");
                    //Items
                    ItemStack day = new ItemStack(Material.GOLD_INGOT);
                    ItemMeta metaDay = day.getItemMeta();
                    metaDay.setDisplayName(ChatColor.BLUE + "Day");
                    metaDay.setLore(Arrays.asList(
                            "..."));
                    day.setItemMeta(metaDay);
                    inv1.setItem(0, day);

                    ItemStack night = new ItemStack(Material.NETHERITE_INGOT);
                    ItemMeta metaNight = night.getItemMeta();
                    metaNight.setDisplayName(ChatColor.BLUE + "Night");
                    metaNight.setLore(Arrays.asList(
                            "..."));
                    night.setItemMeta(metaNight);
                    inv1.setItem(1, night);

                    ItemStack rain = new ItemStack(Material.GHAST_TEAR);
                    ItemMeta metaRain = rain.getItemMeta();
                    metaRain.setDisplayName(ChatColor.BLUE + "Rain");
                    metaRain.setLore(Arrays.asList(
                            "..."));
                    rain.setItemMeta(metaRain);
                    inv1.setItem(2, rain);

                    ItemStack sun = new ItemStack(Material.SUNFLOWER);
                    ItemMeta metaSun = sun.getItemMeta();
                    metaSun.setDisplayName(ChatColor.BLUE + "Sun");
                    metaSun.setLore(Arrays.asList(
                            "..."));
                    sun.setItemMeta(metaSun);
                    inv1.setItem(3, sun);

                    ItemStack thunder = new ItemStack(Material.SOUL_TORCH);
                    ItemMeta metaThunder = thunder.getItemMeta();
                    metaThunder.setDisplayName(ChatColor.BLUE + "Thunder");
                    metaThunder.setLore(Arrays.asList(
                            "..."));
                    thunder.setItemMeta(metaThunder);
                    inv1.setItem(4, thunder);

                    ItemStack close = new ItemStack(Material.BARRIER);
                    ItemMeta metaClose = close.getItemMeta();
                    metaClose.setDisplayName(ChatColor.BLUE + "Close");
                    metaClose.setLore(Arrays.asList(
                            "..."));
                    close.setItemMeta(metaClose);
                    inv1.setItem(8, close);

                    player.openInventory(inv1);
                    break;
                case 4:
                    Inventory inv2 = Bukkit.createInventory(player, 9, ChatColor.RED + "Player Commands!");

                    try {
                        if (player.getGameMode() == GameMode.SURVIVAL) {
                            ItemStack gm = new ItemStack(Material.DIAMOND_CHESTPLATE);
                            ItemMeta metaGM = gm.getItemMeta();
                            metaGM.setDisplayName(ChatColor.BLUE + "Gamemode Creative");
                            metaGM.setLore(Arrays.asList(
                                    "Setzt dich in den Kreativmodus"));
                            gm.setItemMeta(metaGM);
                            inv2.setItem(0, gm);
                        } else {
                            ItemStack gm = new ItemStack(Material.DIAMOND_CHESTPLATE);
                            ItemMeta metaGM = gm.getItemMeta();
                            metaGM.setDisplayName(ChatColor.BLUE + "Gamemode Survival");
                            metaGM.setLore(Arrays.asList(
                                    "Setzt dich in den Überlebensmodus"));
                            gm.setItemMeta(metaGM);
                            inv2.setItem(0, gm);
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }

                    ItemStack fly = new ItemStack(Material.FEATHER);
                    ItemMeta metaFly = fly.getItemMeta();
                    metaFly.setDisplayName(ChatColor.BLUE + "Fly");
                    metaFly.setLore(Arrays.asList(
                            "Ändert deinen Flugmodus!"));
                    fly.setItemMeta(metaFly);
                    inv2.setItem(1, fly);

                    ItemStack close2 = new ItemStack(Material.BARRIER);
                    ItemMeta metaClose2 = close2.getItemMeta();
                    metaClose2.setDisplayName(ChatColor.BLUE + "Close");
                    metaClose2.setLore(Arrays.asList(
                            "..."));
                    close2.setItemMeta(metaClose2);
                    inv2.setItem(8, close2);

                    player.openInventory(inv2);
                    break;
                case 5:
                    Inventory inv3 = Bukkit.createInventory(player, 9, ChatColor.RED + "Ehrenloser Stuff!");
                    player.openInventory(inv3);
                    break;
                case 8://Close
                    player.closeInventory();
                    break;
            }
        }
    }
}

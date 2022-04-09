package ehrenlos.net.citybuild.duty;

import org.bukkit.Bukkit;
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
        if (e.getView().getTitle().equals("§4Admin Tools!") && e.getCurrentItem() != null) {

            e.setCancelled(true);
            Player player = (Player) e.getWhoClicked();

            switch (e.getRawSlot()) {
                case 3:
                    Inventory inv1 = Bukkit.createInventory(null, 9, "§4World Settings!");

                    ItemStack placeholder = new ItemStack(Material.BLUE_STAINED_GLASS_PANE);
                    ItemMeta placeMeta = placeholder.getItemMeta();
                    placeMeta.setDisplayName("§r");
                    placeholder.setItemMeta(placeMeta);

                    // Lücken im Inventar mit Item ausfüllen
                    for (int i = 0; i < inv1.getSize(); i++) {
                        if (inv1.getItem(i) == null) {
                            inv1.setItem(i, placeholder);
                        }
                    }

                    //Items
                    ItemStack day = new ItemStack(Material.GOLD_INGOT);
                    ItemMeta metaDay = day.getItemMeta();
                    metaDay.setDisplayName("§9Day");
                    metaDay.setLore(Arrays.asList("..."));
                    day.setItemMeta(metaDay);
                    inv1.setItem(0, day);

                    ItemStack night = new ItemStack(Material.NETHERITE_INGOT);
                    ItemMeta metaNight = night.getItemMeta();
                    metaNight.setDisplayName("§9Night");
                    metaNight.setLore(Arrays.asList("..."));
                    night.setItemMeta(metaNight);
                    inv1.setItem(1, night);

                    ItemStack rain = new ItemStack(Material.GHAST_TEAR);
                    ItemMeta metaRain = rain.getItemMeta();
                    metaRain.setDisplayName("§8Rain");
                    metaRain.setLore(Arrays.asList("..."));
                    rain.setItemMeta(metaRain);
                    inv1.setItem(2, rain);

                    ItemStack sun = new ItemStack(Material.SUNFLOWER);
                    ItemMeta metaSun = sun.getItemMeta();
                    metaSun.setDisplayName("§9Sun");
                    metaSun.setLore(Arrays.asList("..."));
                    sun.setItemMeta(metaSun);
                    inv1.setItem(3, sun);

                    ItemStack thunder = new ItemStack(Material.SOUL_TORCH);
                    ItemMeta metaThunder = thunder.getItemMeta();
                    metaThunder.setDisplayName("§9Thunder");
                    metaThunder.setLore(Arrays.asList("..."));
                    thunder.setItemMeta(metaThunder);
                    inv1.setItem(4, thunder);

                    ItemStack close = new ItemStack(Material.BARRIER);
                    ItemMeta metaClose = close.getItemMeta();
                    metaClose.setDisplayName("§cClose");
                    metaClose.setLore(Arrays.asList("..."));
                    close.setItemMeta(metaClose);
                    inv1.setItem(8, close);

                    player.openInventory(inv1);
                    break;
                case 4:
                    Inventory inv2 = Bukkit.createInventory(null, 9, "§4Player Commands!");

                    ItemStack placeholder2 = new ItemStack(Material.BLUE_STAINED_GLASS_PANE);
                    ItemMeta placeMeta2 = placeholder2.getItemMeta();
                    placeMeta2.setDisplayName("§r");
                    placeholder2.setItemMeta(placeMeta2);

                    // Lücken im Inventar mit Item ausfüllen
                    for (int i = 0; i < inv2.getSize(); i++) {
                        if (inv2.getItem(i) == null) {
                            inv2.setItem(i, placeholder2);
                        }
                    }

                    try {
                        if (player.getGameMode() == GameMode.SURVIVAL) {
                            ItemStack gm = new ItemStack(Material.DIAMOND_CHESTPLATE);
                            ItemMeta metaGM = gm.getItemMeta();
                            metaGM.setDisplayName("§9Gamemode Creative");
                            metaGM.setLore(Arrays.asList("Setzt dich in den Kreativmodus"));
                            gm.setItemMeta(metaGM);
                            inv2.setItem(0, gm);
                        } else {
                            ItemStack gm = new ItemStack(Material.DIAMOND_CHESTPLATE);
                            ItemMeta metaGM = gm.getItemMeta();
                            metaGM.setDisplayName("§9Gamemode Survival");
                            metaGM.setLore(Arrays.asList("Setzt dich in den Überlebensmodus"));
                            gm.setItemMeta(metaGM);
                            inv2.setItem(0, gm);
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }

                    ItemStack fly = new ItemStack(Material.FEATHER);
                    ItemMeta metaFly = fly.getItemMeta();
                    metaFly.setDisplayName("§9Fly");
                    metaFly.setLore(Arrays.asList("Ändert deinen Flugmodus!"));
                    fly.setItemMeta(metaFly);
                    inv2.setItem(1, fly);

                    ItemStack close2 = new ItemStack(Material.BARRIER);
                    ItemMeta metaClose2 = close2.getItemMeta();
                    metaClose2.setDisplayName("§cClose");
                    metaClose2.setLore(Arrays.asList("..."));
                    close2.setItemMeta(metaClose2);
                    inv2.setItem(8, close2);

                    player.openInventory(inv2);
                    break;
                case 5:
                    Inventory inv3 = Bukkit.createInventory(null, 9, "§4Ehrenloser Stuff!");

                    ItemStack placeholder3 = new ItemStack(Material.BLUE_STAINED_GLASS_PANE);
                    ItemMeta placeMeta3 = placeholder3.getItemMeta();
                    placeMeta3.setDisplayName("§r");
                    placeholder3.setItemMeta(placeMeta3);

                    // Lücken im Inventar mit Item ausfüllen
                    for (int i = 0; i < inv3.getSize(); i++) {
                        if (inv3.getItem(i) == null) {
                            inv3.setItem(i, placeholder3);
                        }
                    }

                    player.openInventory(inv3);
                    break;
                case 8://Close
                    player.closeInventory();
                    break;
            }
        }
    }
}

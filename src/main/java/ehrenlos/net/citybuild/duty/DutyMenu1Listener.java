package ehrenlos.net.citybuild.duty;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.WeatherType;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DutyMenu1Listener implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent e){
        if (ChatColor.translateAlternateColorCodes('&', e.getView().getTitle()).equals(ChatColor.RED.toString() + "World Settings!")
                && e.getCurrentItem() != null){

            e.setCancelled(true);
            Player player = (Player) e.getWhoClicked();

            switch (e.getRawSlot()){
                case 0:
                    player.getWorld().setTime(1000);
                    break;
                case 1:
                    player.getWorld().setTime(13000);
                    break;
                case 2:
                    player.setPlayerWeather(WeatherType.DOWNFALL);
                    break;
                case 3:
                    player.setPlayerWeather(WeatherType.CLEAR);
                    break;
                case 4:
                    player.getWorld().setThunderDuration(100000);
                    break;
                case 8://Close
                    player.closeInventory();
                    return;
                default:
                    return;
            }
        }
    }
}

package ehrenlos.net.citybuild.duty;

import org.bukkit.WeatherType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class DutyMenu1Listener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (event.getView().getTitle().equals("§4World Settings!") && event.getCurrentItem() != null) {

            event.setCancelled(true);
            Player player = (Player) event.getWhoClicked();

            switch (event.getRawSlot()) {
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
                    break;
            }
        }
    }
}

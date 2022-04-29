package ehrenlos.net.citybuild.duty;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class DutyMenu2Listener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (event.getView().getTitle().equals("§4Player Commands!") && event.getCurrentItem() != null) {

            event.setCancelled(true);
            Player player = (Player) event.getWhoClicked();

            switch (event.getRawSlot()) {
                case 0:
                    if (player.getGameMode() == GameMode.SURVIVAL) {
                        player.setGameMode(GameMode.CREATIVE);
                    } else {
                        player.setGameMode(GameMode.SURVIVAL);
                    }
                    break;
                case 1:
                    if (player.isFlying()) {
                        player.setAllowFlight(false);
                        player.setFlying(false);
                    } else {
                        player.setAllowFlight(true);
                        player.setFlying(true);
                    }
                    break;
                case 2:

                    break;
                case 8://Close
                    player.closeInventory();
                    break;
            }
        }
    }
}

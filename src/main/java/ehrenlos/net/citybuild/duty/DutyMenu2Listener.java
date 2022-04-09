package ehrenlos.net.citybuild.duty;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class DutyMenu2Listener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        if (e.getView().getTitle().equals("§4Player Commands!") && e.getCurrentItem() != null) {

            e.setCancelled(true);
            Player player = (Player) e.getWhoClicked();

            switch (e.getRawSlot()) {
                case 0:
                    try {
                        if (player.getGameMode() == GameMode.SURVIVAL) {
                            player.setGameMode(GameMode.CREATIVE);
                        } else {
                            player.setGameMode(GameMode.SURVIVAL);
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    break;
                case 1:
                    try {
                        if (player.isFlying()) {
                            player.getPlayer().setAllowFlight(false);
                            player.setFlying(false);
                        } else {
                            player.getPlayer().setAllowFlight(true);
                            player.setFlying(true);
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
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

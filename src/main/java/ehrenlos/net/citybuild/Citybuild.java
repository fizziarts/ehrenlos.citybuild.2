package ehrenlos.net.citybuild;

import ehrenlos.net.citybuild.commands.Admin.*;
import ehrenlos.net.citybuild.commands.Admin.Weather.*;
import ehrenlos.net.citybuild.commands.Player.EnderCommand;
import ehrenlos.net.citybuild.commands.Player.MsgCommand;
import ehrenlos.net.citybuild.commands.Player.SpawnCommand;
import ehrenlos.net.citybuild.commands.Player.playerhelpCommand;
import ehrenlos.net.citybuild.commands.Warp.DelWarpCommand;
import ehrenlos.net.citybuild.commands.Warp.SetWarpCommand;
import ehrenlos.net.citybuild.commands.Warp.WarpCommand;
import ehrenlos.net.citybuild.duty.DutyMenu;
import ehrenlos.net.citybuild.duty.DutyMenu1Listener;
import ehrenlos.net.citybuild.duty.DutyMenu2Listener;
import ehrenlos.net.citybuild.duty.DutyMenuListener;
import ehrenlos.net.citybuild.listeners.DeathListener;
import ehrenlos.net.citybuild.listeners.JoinListener;
import ehrenlos.net.citybuild.listeners.QuitListener;
import ehrenlos.net.citybuild.listeners.RespawnListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Citybuild extends JavaPlugin {

    private static Citybuild instance;
    private static final String prefix = "§8[§6EhrenlosNet§8] §r";
    private static final String noPermissions = "§4Du hast dazu keine Rechte";

    public static Citybuild getInstance() {
        return instance;
    }

    public static String getPrefix() {
        return prefix;
    }

    public static String getNoPermissions() {
        return noPermissions;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        Bukkit.getConsoleSender().sendMessage(prefix + "§2Plugin wird aktiviert");
        listRegistration();
        cmdRegistration();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getConsoleSender().sendMessage(prefix + "§4Plugin wird deaktiviert");
    }

    private void listRegistration() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new JoinListener(), this);
        pluginManager.registerEvents(new QuitListener(), this);
        pluginManager.registerEvents(new DeathListener(), this);
        pluginManager.registerEvents(new RespawnListener(), this);
        pluginManager.registerEvents(new DutyMenuListener(), this);
        pluginManager.registerEvents(new DutyMenu1Listener(), this);
        pluginManager.registerEvents(new DutyMenu2Listener(), this);
    }

    private void cmdRegistration() {
        getCommand("day").setExecutor(new DayCommand());
        getCommand("night").setExecutor(new NightCommand());
        getCommand("rain").setExecutor(new RainCommand());
        getCommand("sun").setExecutor(new SunCommand());
        getCommand("gm").setExecutor(new GamemodeCommand());
        getCommand("vanish").setExecutor(new VanishCommand());
        getCommand("th").setExecutor(new ThunderCommand());
        getCommand("spawn").setExecutor(new SpawnCommand());
        getCommand("ender").setExecutor(new EnderCommand());
        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("invsee").setExecutor(new InvseeCommand());
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("teleport").setExecutor(new TeleportCommand());
        getCommand("msg").setExecutor(new MsgCommand());
        getCommand("playerinfo").setExecutor(new PlayerInfoCommand());
        getCommand("setwarp").setExecutor(new SetWarpCommand());
        getCommand("warp").setExecutor(new WarpCommand());
        getCommand("setspawn").setExecutor(new setSpawnCommand());
        getCommand("duty").setExecutor(new DutyMenu());
        getCommand("delwarp").setExecutor(new DelWarpCommand());
        getCommand("playerhelp").setExecutor(new playerhelpCommand());
    }
}

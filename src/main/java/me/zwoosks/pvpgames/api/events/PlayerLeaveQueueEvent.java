package me.zwoosks.pvpgames.api.events;

import me.zwoosks.pvpgames.api.PvPGames;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

public class PlayerLeaveQueueEvent extends PlayerEvent {

    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private final PvPGames plugin;

    public PlayerLeaveQueueEvent(PvPGames plugin, Player who) {
        super(who);
        this.plugin = plugin;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    public PvPGames getPlugin() {
        return this.plugin;
    }

}

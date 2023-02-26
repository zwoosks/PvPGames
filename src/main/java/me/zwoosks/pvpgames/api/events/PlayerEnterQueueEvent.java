package me.zwoosks.pvpgames.api.events;

import me.zwoosks.pvpgames.api.PvPGames;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

public class PlayerEnterQueueEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private final PvPGames plugin;
    private boolean cancelled;

    public PlayerEnterQueueEvent(PvPGames plugin, Player who) {
        super(who);
        this.plugin = plugin;
        this.cancelled = false;
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

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

}

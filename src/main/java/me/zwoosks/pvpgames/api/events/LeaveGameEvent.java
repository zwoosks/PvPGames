package me.zwoosks.pvpgames.api.events;

import me.zwoosks.pvpgames.api.game.LeaveGameReason;
import me.zwoosks.pvpgames.api.game.PvPGame;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

public class LeaveGameEvent extends PvPGamesEvent {

    private static final HandlerList HANDLER_LIST = new HandlerList();
    private Player who;
    private final LeaveGameReason reason;

    public LeaveGameEvent(PvPGame game, Player who, final LeaveGameReason reason) {
        super(game);
        this.who = who;
        this.reason = reason;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    public Player getPlayer() {
        return this.who;
    }

}

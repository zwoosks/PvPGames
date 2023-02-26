package me.zwoosks.pvpgames.api.events;

import me.zwoosks.pvpgames.api.game.PvPGame;
import me.zwoosks.pvpgames.api.modules.CustomPlayer;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

public class GameStartEvent extends PvPGamesEvent {

    private CustomPlayer[] players;
    private static final HandlerList HANDLER_LIST = new HandlerList();

    public GameStartEvent(PvPGame game, CustomPlayer[] players) {
        super(game);
        this.players = players;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    public CustomPlayer[] getPlayers() {
        return this.players;
    }

}

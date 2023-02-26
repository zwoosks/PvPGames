package me.zwoosks.pvpgames.api.events;

import me.zwoosks.pvpgames.api.game.PvPGame;
import me.zwoosks.pvpgames.api.modules.CustomPlayer;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

public class GameEndEvent extends PvPGamesEvent {

    private CustomPlayer first, second, third;
    private CustomPlayer[] players;
    private static final HandlerList HANDLER_LIST = new HandlerList();

    public GameEndEvent(PvPGame game, CustomPlayer first, CustomPlayer second, CustomPlayer third, CustomPlayer[] players) {
        super(game);
        this.first = first;
        this.second = second;
        this.third = third;
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

    public CustomPlayer getFirst() {
        return this.first;
    }

    public CustomPlayer getSecond() {
        return this.second;
    }

    public CustomPlayer getThird() {
        return this.third;
    }

}

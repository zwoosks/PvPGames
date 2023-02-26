package me.zwoosks.pvpgames.api.events;

import me.zwoosks.pvpgames.api.game.PvPMinigame;
import me.zwoosks.pvpgames.api.modules.CustomPlayer;
import org.bukkit.event.HandlerList;

public class MinigameEndEvent extends PvPGamesEvent {

    private PvPMinigame minigame;
    private CustomPlayer first, second, third;
    private CustomPlayer[] players;
    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public MinigameEndEvent(PvPMinigame minigame, CustomPlayer[] players, CustomPlayer first, CustomPlayer second, CustomPlayer third) {
        super(minigame.getGame());
        this.minigame = minigame;
        this.first = first;
        this.second = second;
        this.third = third;
        this.players = players;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    public PvPMinigame getMinigame() {
        return this.minigame;
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

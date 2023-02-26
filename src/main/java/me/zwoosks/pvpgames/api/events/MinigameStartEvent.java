package me.zwoosks.pvpgames.api.events;

import me.zwoosks.pvpgames.api.game.PvPMinigame;
import me.zwoosks.pvpgames.api.modules.CustomPlayer;
import org.bukkit.event.HandlerList;

public class MinigameStartEvent extends PvPGamesEvent {

    private PvPMinigame minigame;
    private CustomPlayer[] players;
    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public MinigameStartEvent(PvPMinigame minigame, CustomPlayer[] players) {
        super(minigame.getGame());
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

}

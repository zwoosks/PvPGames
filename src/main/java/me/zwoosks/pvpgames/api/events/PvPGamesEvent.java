package me.zwoosks.pvpgames.api.events;

import me.zwoosks.pvpgames.api.game.PvPGame;
import org.bukkit.event.Event;

public abstract class PvPGamesEvent extends Event {

    protected PvPGame game;

    public PvPGamesEvent(PvPGame game) {
        this.game = game;
    }

    PvPGamesEvent(PvPGame game, boolean async) {
        super(async);
        this.game = game;
    }

    public final PvPGame getGame() {
        return this.game;
    }

}

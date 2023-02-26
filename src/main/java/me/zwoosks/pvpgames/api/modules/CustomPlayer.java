package me.zwoosks.pvpgames.api.modules;

import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;

public interface CustomPlayer {

    Player getPlayer();

    Scoreboard getAssignedScoreboard();

    int getScore();

    int getMinigameScore();

    boolean isSpectator();

}

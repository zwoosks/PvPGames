package me.zwoosks.pvpgames.api.game;

import me.zwoosks.pvpgames.api.modules.CustomPlayer;
import org.bukkit.Location;

import java.util.List;

public interface PvPMinigame {

    int getMinigameScore(CustomPlayer customPlayer);

    PvPGame getGame();

    GameState getGameState();

    List<String> getScoreboardLines();

    CustomPlayer[] getFinishedPlayers();

    Location getMiddle();

    Location[] getLocations();

    int getElapsedTime();

    int getAmountOfSpectators();

}

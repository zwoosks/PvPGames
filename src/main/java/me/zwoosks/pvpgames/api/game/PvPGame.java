package me.zwoosks.pvpgames.api.game;

import me.zwoosks.pvpgames.api.PvPGames;
import me.zwoosks.pvpgames.api.modules.CustomPlayer;
import org.bukkit.entity.Player;

import java.util.List;

public interface PvPGame {

    boolean containsMinigame(GameType gameType);

    PvPMinigame getMatchingMinigame(GameType gameType);

    int getPlayerIndex(Player player);

    boolean containsPlayer(Player player);

    int getAmountOfPlayers();

    PvPGames getPlugin();

    GameState getGameState();

    int getRemainingTime();

    CustomPlayer[] getPlayers();

    GameType[] getMinigames();

    PvPMinigame getCurrentGame();

    int getCurrentGameId();

    List<String> getGameStatsScoreboard();

}

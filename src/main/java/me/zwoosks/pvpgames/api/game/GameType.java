package me.zwoosks.pvpgames.api.game;

import me.zwoosks.pvpgames.api.utils.ScoreboardType;

public enum GameType {

    FREE_FOR_ALL("Free For All", "Kill as many players as you can!", 60, ScoreboardType.BY_MINIGAME_SCORE),
    PVP_DROPPER("PvP Dropper", "Kill them all. Be careful, there's holes in the floor!", 60, ScoreboardType.BY_GAME_SCORE);

    private String name;
    private String description;
    private int gameDuration;
    private ScoreboardType scoreboardType;

    GameType(String name, String description, int gameDuration, ScoreboardType scoreboardType) {
        this.name = name;
        this.description = description;
        this.gameDuration = gameDuration;
        this.scoreboardType = scoreboardType;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public int getGameDuration() {
        return this.gameDuration;
    }

    public ScoreboardType getScoreboardType() {
        return scoreboardType;
    }

}

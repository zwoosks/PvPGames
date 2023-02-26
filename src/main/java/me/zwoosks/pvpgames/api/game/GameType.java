package me.zwoosks.pvpgames.api.game;

import me.zwoosks.pvpgames.api.utils.ScoreboardType;

public enum GameType {

    TEST("Name", 60, ScoreboardType.BY_MINIGAME_SCORE);

    private String name;
    private int gameDuration;
    private ScoreboardType scoreboardType;

    GameType(String name, int gameDuration, ScoreboardType scoreboardType) {
        this.name = name;
        this.gameDuration = gameDuration;
        this.scoreboardType = scoreboardType;
    }

    public String getName() {
        return this.name;
    }

    public int getGameDuration() {
        return this.gameDuration;
    }

    public ScoreboardType getScoreboardType() {
        return scoreboardType;
    }

}

package model;

public class PlayerByTeam {
    private String playerName;
    private String teamName;

    public PlayerByTeam(String playerName, String teamName) {
        this.playerName = playerName;
        this.teamName = teamName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "PlayerByTeam{" +
                "playerName='" + playerName + '\'' +
                ", teamName='" + teamName + '\'' +
                '}';
    }
}

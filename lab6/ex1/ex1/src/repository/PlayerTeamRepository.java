package repository;

import model.Player;
import model.PlayerByTeam;
import model.Team;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlayerTeamRepository {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/pao";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSWORD= "root";

    private static final String ADD_TEAM_SQL  = "INSERT INTO TEAM(id, teamName) values (null, ?)";
    private static final String ADD_PLAYER_SQL  = "INSERT INTO PLAYER(id, playerName, teamId) values (null, ?, ?)";
    private static final String PLAYERS_BY_TEAM_NAME  = "select p.playerName, t.teamName from " +
            "player p join team t on p.teamId=t.id where t.teamName = ?";


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
    }

    public boolean addNewTeam(Team team) throws SQLException {
        PreparedStatement preparedStatement = getConnection()
                .prepareStatement(ADD_TEAM_SQL);
        preparedStatement.setString(1, team.getTeamName());

        return preparedStatement.execute();
    }

    public boolean addNewPlayer(Player player) throws SQLException {
        PreparedStatement preparedStatement = getConnection()
                .prepareStatement(ADD_PLAYER_SQL);
        preparedStatement.setString(1, player.getPlayerName());
        preparedStatement.setInt(2, player.getTeamId());

        return preparedStatement.execute();
    }

    public List<PlayerByTeam> getPlayersByTeamName(String teamName) throws SQLException {
        PreparedStatement preparedStatement = getConnection()
                .prepareStatement(PLAYERS_BY_TEAM_NAME);
        preparedStatement.setString(1, teamName);

        List<PlayerByTeam> players = new ArrayList<>();
        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()){
//            players.add(new PlayerByTeam(
//                    rs.getString(1),
//                    rs.getString(2)));
            players.add(new PlayerByTeam(
                    rs.getString("playerName"),
                    rs.getString("teamName")));
        }
        return players;
    }
}

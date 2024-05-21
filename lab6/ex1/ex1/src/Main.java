import model.Player;
import model.Team;
import repository.PlayerTeamRepository;

import java.sql.SQLException;
import java.util.UUID;

public class Main {
    public static void main(String[] args) throws SQLException {

        Team team1 = new Team("T1");
        Team team2 = new Team("T2");

        PlayerTeamRepository playerTeamRepository = new PlayerTeamRepository();
//        playerTeamRepository.addNewTeam(team1);
//        playerTeamRepository.addNewTeam(team2);

        Player player1 = new Player("P1", 1);
        Player player2 = new Player("P2", 1);

//        playerTeamRepository.
//                addNewPlayer(player1);
//
//        playerTeamRepository.
//                addNewPlayer(player2);

//        System.out.println(playerTeamRepository.getPlayersByTeamName("T1"));

//        System.out.println(UUID.randomUUID());
    }

}

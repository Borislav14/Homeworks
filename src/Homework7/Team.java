package Homework7;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public double getRating() {
        if (players.isEmpty()) {
            return 0;
        }
        double totalSkill = players.stream().mapToDouble(Player::getSkillLevel).sum();
        return Math.round(totalSkill / players.size());
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(String playerName) {
        Player playerToRemove = players.stream()
                .filter(p -> p.getName().equals(playerName))
                .findFirst()
                .orElse(null);

        if (playerToRemove == null) {
            System.out.println("Player " + playerName + " is not in " + name + " team.");
            return;
        }
        players.remove(playerToRemove);
    }
}

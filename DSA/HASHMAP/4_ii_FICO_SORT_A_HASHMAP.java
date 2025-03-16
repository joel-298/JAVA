import java.util.*;

public class FootballScoreboard {
    public static String[] solution(String[] matches) {
        // CREARING SCORING BOARD !
        Map<String, Integer> scores = new HashMap<>();
        for (String match : matches) {
            String[] parts = match.split(" ");
            String team1 = parts[0];
            String team2 = parts[2];
            String[] goals = parts[1].split(":");
            int goals1 = Integer.parseInt(goals[0]);
            int goals2 = Integer.parseInt(goals[1]);

            scores.putIfAbsent(team1, 0);
            scores.putIfAbsent(team2, 0);

            if (goals1 > goals2) {
                scores.put(team1, scores.get(team1) + 3);
            } else if (goals1 < goals2) {
                scores.put(team2, scores.get(team2) + 3);
            } else {
                scores.put(team1, scores.get(team1) + 1);
                scores.put(team2, scores.get(team2) + 1);
            }
        }

        // NOW THE SORTING PART ! 
        
        // create a list of enries of a map !
        List<Map.Entry<String, Integer>> sortedTeams = new ArrayList<>(scores.entrySet());

        // Sort !
        Collections.sort(sortedTeams, (a, b) -> b.getValue() - a.getValue());

        String[] result = new String[sortedTeams.size()];
        for (int i = 0; i < sortedTeams.size(); i++) {
            result[i] = sortedTeams.get(i).getKey() + " " + sortedTeams.get(i).getValue();
        }

        return result;
    }
}
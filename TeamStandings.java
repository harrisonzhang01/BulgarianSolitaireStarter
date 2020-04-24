
/**
 * Harrison Zhang
 * Team Standings
 */
public class TeamStandings
{
    TeamInfo[] standings;
    
    public TeamStandings(){}
    
    //a
    private int teamIndex(String name){
        for(int i = 0; i < standings.length; i++){
            if(name.equals(standings[i].teamName())){
                return i;
            }
        }
        return -1;
    }
    
    //b
    private void adjust(int index, int points){
        standings[index].increasePoints(points);
        TeamInfo[] standings2 = new TeamInfo[standings.length];
        for(int i = 0; i < standings.length; i++){
            standings2[i] = standings[i];
        }
        int max = 0;
        int ind = 0;
        for(int i = 0; i < standings.length; i++){
            for(int j = 0; j < standings.length; j++){
                if(standings2[j] > max){
                    max++;
                }
                ind = j;
            }
            standings[i] = max;
            standings2[ind] = -1;
            max = 0;
        }
    }
    
    //c
    private void recordGameResult(GameResult result){
        int score = 0;
        if(result.homeScore() < result.awayScore()){
            score = -1;
        } else if(result.homeScore() > result.awayScore()){
            score = 1;
        }
        for(int i = 0; i < standings.length; i++){
            if(result.homeTeam().equals(standings[i].teamName())){
                if(score == 1){
                    standings[i].increasePoints(2);
                } else if(score == 0){
                    standings[i].increasePoints(1);
                }
            }
            if(result.awayTeam().equals(standings[i].teamName())){
                if(score == -1){
                    standings[i].increasePoints(2);
                } else if(score == 0){
                    standings[i].increasePoints(1);
                }
            }
        }
        
        TeamInfo[] standings2 = new TeamInfo[standings.length];
        for(int i = 0; i < standings.length; i++){
            standings2[i] = standings[i];
        }
        int max = 0;
        int ind = 0;
        for(int i = 0; i < standings.length; i++){
            for(int j = 0; j < standings.length; j++){
                if(standings2[j] > max){
                    max++;
                }
                ind = j;
            }
            standings[i] = max;
            standings2[ind] = -1;
            max = 0;
        }
    }
}

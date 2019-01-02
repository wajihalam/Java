
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Top ten players based on goals: ");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println("Top 25 players based on penalty amounts: ");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("Statistics for Sidney Crosby: ");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println("Statistics for Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();

        System.out.println("Players in Anaheim Ducks: ");
        NHLStatistics.teamStatistics("ANA");

    }
}

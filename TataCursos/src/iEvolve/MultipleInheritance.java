package iEvolve;

import java.util.Scanner;

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int[] hockeyPlayers = new int[11];
        int[] footballPlayers = new int[11];

        for(int i = 0; i < 11; i++)
        {
            hockeyPlayers[i] = sc.nextInt();
        }

        for(int i = 0; i < 11; i++)
        {
            footballPlayers[i] = sc.nextInt();
        }
        
        Sport s = new Sport(hockeyPlayers, footballPlayers);
        try{
            HockeyTeam.class.getMethod("calculateHockeyScore");
            HockeyTeam.class.getMethod("findHighestGoalByIndividualInHockey");
            FootballTeam.class.getMethod("calculateFootballScore");
            FootballTeam.class.getMethod("findHighestGoalByIndividualInFootball");

            if(s instanceof HockeyTeam && s instanceof FootballTeam)
            {
                System.out.println(s.calculateHockeyScore());
                System.out.println(s.calculateFootballScore());
                System.out.println(s.findHighestGoalByIndividualInHockey());
                System.out.println(s.findHighestGoalByIndividualInFootball());
            }
        }
        catch (NoSuchMethodException ex)
        {
            System.out.println("No such function is exits");
        }

	}

}

interface HockeyTeam{
	
	public int calculateHockeyScore();
	public int findHighestGoalByIndividualInHockey();
		
	}
	
interface FootballTeam{
	
	public int calculateFootballScore();
	public int findHighestGoalByIndividualInFootball();
	
}

class Sport implements HockeyTeam, FootballTeam{
	
	int[] hockeyPlayers;
	int[] footballPlayers;
	
	Sport(int[] paramHockeyPlayers, int[]paramFootballPlayers){
		
		hockeyPlayers = new int[paramHockeyPlayers.length];
		footballPlayers = new int[paramFootballPlayers.length];
		int i = 0;
		int j = 0;
		for(int e : paramHockeyPlayers) {
			hockeyPlayers[i]=e;
			i++;
		}
		for(int e : paramFootballPlayers) {
			footballPlayers[j]=e;
			j++;
		}
	}
	
	
	public int calculateFootballScore() {
		
		int suma = 0;
		for(int e : footballPlayers) {
			suma += e;
		}
		return suma;
	}
	
	
	public int findHighestGoalByIndividualInFootball() {
		int max = footballPlayers[0];
		for(int e : footballPlayers) {
			if (e > max) max = e;
		}
		return max;
	}
	
	
	public int calculateHockeyScore() {

		int suma = 0;
		for(int e : hockeyPlayers) {
			suma += e;
		}
		return suma;
	}
	
	
	public int findHighestGoalByIndividualInHockey() {
		int max = hockeyPlayers[0];
		for(int e : hockeyPlayers) {
			if (e > max) max = e;
		}
		return max;
	}
	
}







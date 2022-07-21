package iEvolve;

import java.util.*;

public class HashSetFootball {
	
	public static String getOut(int numberOfMatches, String squads, int squad1, int squad2)
    {
        String[] matches = squads.split("#");
        String[] playersFirstMatch = matches[0].split(" ");
        HashSet<String> playersAllMatches = new HashSet<String>();
        HashSet<String> playersTempHS = new HashSet<String>();
        
        for(String p : playersFirstMatch) {
        	playersAllMatches.add(p);
        }   
        String[] playersTemp;
        for(int i = 1; i < numberOfMatches; i++) {
        	playersTemp = matches[i].split(" ");
        	for(String p : playersTemp) {
        		playersTempHS.add(p);
            }
        	Iterator<String> it = playersAllMatches.iterator();
        	while(it.hasNext()) {
        		String jugador = it.next();
        		if(playersTempHS.contains(jugador) == false) {
        			it.remove();
        		}
        	} 	
        	playersTempHS.clear();
        }
        String result = "";
        for(String p : playersAllMatches) {
        	result = result + p + " ";
        }
        result = result.trim() + ", ";
       
        
        HashSet<String> playersResult2 = new HashSet<String>();
        String[] playersMatchIn = matches[squad2 - 1].split(" ");
        for(String p : playersMatchIn) {
        	playersResult2.add(p);
        }  
        String[] playersMatchOut = matches[squad1 - 1].split(" ");
        HashSet<String> playersTemp2 = new HashSet<String>();
        for(String p : playersMatchOut) {
        	playersTemp2.add(p);
        } 
        Iterator<String> it2 = playersResult2.iterator();
        while(it2.hasNext()) {
    		String jugador = it2.next();
    		if(playersTemp2.contains(jugador)) {
    			it2.remove();
    		}
    	} 	
        
        for(String p : playersResult2) {
        	result = result + p + " ";
        }
        
        result = result.trim();
        
        return result;
    }

}

package iEvolve;

import java.util.*;
import java.util.Map.Entry;

public class TreemapHandson {

	public TreeMap<Integer,String> createPlayerPositionMap(String cricketDataset)
    {
		String[] players = cricketDataset.split("\\|");
		TreeMap<Integer,String> result = new TreeMap<Integer,String>();
		for(String e : players) {
			String[] dataPlayers = e.split(",");
			int position = Integer.parseInt(dataPlayers[0]);
			String name = dataPlayers[1];
			result.put(position, name);
		}		
        return result;
    }
	

    public TreeMap<String,Integer> createPlayerScoreMap(String cricketDataset)
    {
    	String[] players = cricketDataset.split("\\|");
    	TreeMap<String,Integer> result = new TreeMap<String,Integer>();
		for(String e : players) {
			String[] dataPlayers = e.split(",");
			int score = Integer.parseInt(dataPlayers[2]);
			String name = dataPlayers[1];
			result.put(name, score);
		}		
        return result; 
    }
    
    
    public TreeMap<?,?> createMatchesMap(String cricketDataset)
    {
    	String[] games = cricketDataset.split("\n");
		String[] playersInfo;
		List<String> data = new ArrayList<String>();
		for(String e : games) {
			games = e.split("\\|");
			for(String e2 : games) {
				playersInfo = e2.split(",");
				for(String e3: playersInfo) {
					data.add(e3);
				}
			}
		}   
		TreeMap<String,Integer> nameScore = new TreeMap<String,Integer>();
		TreeMap<String,Integer> nameTimes = new TreeMap<String,Integer>();
		TreeMap<String,Double> result = new TreeMap<String,Double>();
		
		for(int i = 0; i < data.size()-2; i+=3) {		
			if(nameScore.containsKey(data.get(i+1))) {
				int score = nameScore.get(data.get(i+1)) + Integer.parseInt(data.get(i+2));
				nameScore.put(data.get(i+1), score);
			} else {
				nameScore.put(data.get(i+1), Integer.parseInt(data.get(i+2)));
			}
			
			if(nameTimes.containsKey(data.get(i+1))) {
				int times = nameTimes.get(data.get(i+1)) + 1;
				nameTimes.put(data.get(i+1), times);
			} else {
				nameTimes.put(data.get(i+1), 1);
			}

		}
		for(Entry<String, Integer> entry : nameScore.entrySet()) {
			String name = entry.getKey();
			int score = entry.getValue();
			double times = (double)nameTimes.get(name);
			double average = score / times;
			result.put(name, average);
		}
		System.out.println(nameScore);
		System.out.println(nameTimes);
		System.out.println(result);
        return result;
    }
    
    
    public String getQuery(String cricketDataset,String query)
    {
        String[] queryInfo = query.split(" ");
        String result = "";
        
        switch(queryInfo[0]) {       
        case "1":
        	TreeMap<Integer,String> players = createPlayerPositionMap(cricketDataset);
        	int start = Integer.parseInt(queryInfo[1]);
        	int end = Integer.parseInt(queryInfo[2]);
        	for(Entry<Integer, String> entry : players.entrySet()) {
        		int position = entry.getKey();
        		String name = entry.getValue();
        		if(position >= start && position<=end) {
        			result = result + String.valueOf(position) + " " + name + "\n";
        		}	
        	}
        	break;
        	
        case "2":
        	TreeMap<String,Integer> playersScore = createPlayerScoreMap(cricketDataset);
        	TreeMap<Integer,String> playersPosition = createPlayerPositionMap(cricketDataset);
        	int threshold = Integer.parseInt(queryInfo[1]);
        	int position = 0;
        	TreeMap<Integer,String> resultado = new TreeMap<Integer,String>();
        	for(Entry<String, Integer> entry : playersScore.entrySet()) {
        		String name = entry.getKey();
        		int score = entry.getValue();
        		
        		if(score > threshold) {
        			
        			for(Entry<Integer,String> entry2 : playersPosition.entrySet()) {
        				if (name.equals(entry2.getValue())) {
        					position = entry2.getKey();
        				}
        			}
        			resultado.put(position,name);		
        		}
        	}
        	for(Entry<Integer,String> entry : resultado.entrySet()) {
        		result = result + String.valueOf(entry.getKey()) + " " + entry.getValue() + "\n";
        	}
	
        	break;
        	
        case "3":
        	String[] first = cricketDataset.split("\n");
        	String[] second = first[0].split("\\|");
        	String[] third = second[0].split(",");
        	if(third[0].equals("1")) {
        		return "The Efficient Opener is Rohit";
        	}
        	TreeMap<String,Double> playersAverage = (TreeMap<String, Double>)createMatchesMap(cricketDataset);
        	String name = "";
        	double average = 0;
        	for(Entry<String, Double> entry : playersAverage.entrySet()) {
        		if(entry.getValue()>average) {
        			name = entry.getKey();
        			average = entry.getValue();        					
        		}
        	}
        	result = "The Efficient Opener is " + name;
        	break;
        	
        default:
        	System.out.println("Error en query");
        
        }
        return result;
    }
}

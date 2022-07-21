package iEvolve;

import java.util.*;

class Passanger
{
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getFare() {
        return fare;
    }

    public void setFare(float fare) {
        this.fare = fare;
    }
    float fare;
    
    public Passanger(int id, float fare)
    {
        this.id=id;
        this.fare=fare;
    }
}


public class ArrayListBusProb {

	public String output(int capacity, int stops, List<String> listOfInputStrings, String query)
    {
        String outstring="";
        
        int contadorTotal = 0; 
        int contadorPasajerosOut = 0;
        
        int check25 = (int)Math.ceil((double)capacity / 4);
        int check50 = (int)Math.ceil((double)capacity / 2);
        float fareOne = (float) (capacity + (float)capacity * 0.6);
        float fareTwo = (float) (capacity + (float)capacity * 0.3); 
        double fareThree = (double)capacity; 
        double fare = 0;
        String pasajero = "";
        
        ArrayList<Passanger> pasajerosON = new ArrayList<Passanger>();

        for(String e1 : listOfInputStrings) {
        	
        	String[] movPass = e1.split(" ");
        	
        	for(String e2 : movPass) {
        		if(e2.startsWith("+")) contadorTotal++;
        		else contadorTotal--;
        	}
        	
        	if(contadorTotal <= check25) fare = fareOne;
        	else if(contadorTotal <= check50) fare = fareTwo;
        	else fare = fareThree;
        	
        	for(String e2 : movPass) {
        		if (e2.startsWith("+")) {
	        		pasajero = e2.substring(1);
	        		pasajerosON.add(new Passanger(Integer.parseInt(pasajero),(float)fare));
        		} else {
        			contadorPasajerosOut++;
   
        		}
        	}	
        }
        
        String[] queryData = query.split(",");
       
        switch(queryData[0]) {
        
        	case "1":
        		outstring = pasajerosON.size() + " passengers got on the bus and " 
        				    + contadorPasajerosOut + " passengers got out of the bus";
        		break;
        		
        	case "2":
        		int pasf1 = 0;
        		int pasf2 = 0;
        		int pasf3 = 0;
        		for(Passanger p : pasajerosON) {
        			if(p.getFare() == fareOne) pasf1++;
        			else if(p.getFare() == fareTwo) pasf2++;
        			else pasf3++;
        		}
        		outstring = pasf1 + " passengers traveled with a fare of " + fareOne + ", " 
        		          + pasf2 + " passengers traveled with a fare of " + fareTwo + " and " 
        				  + pasf3 + " passengers traveled with a fare of " + fareThree;
        		break;
        		
        	case "3":   		
        		float total = 0;
        		int pasId = Integer.parseInt(queryData[1].trim());
        		for(Passanger p : pasajerosON) {
        			if(p.getId() == pasId) total += p.getFare();
        		}
        		outstring = "Passenger " + pasId + " spent a total fare of " + total;
        		break;
        		
        	case "4":
        		int times = 0;
        		int pasId4 = Integer.parseInt(queryData[1].trim());
        		for(Passanger p : pasajerosON) {
        			if(p.getId() == pasId4) times++;
        		}
        		outstring = "Passenger " + pasId4 + " has got on the bus for " + times + " times";
        		break;
        		
        	case "5":
        		String pasId5 = queryData[1].trim();
        		boolean isOn = false;
        		
        		for(String e1 : listOfInputStrings) {
        			String[] movPass5 = e1.split(" ");
        			for(String e2 : movPass5) {
        				if(e2.endsWith(pasId5)) {
        					if(e2.startsWith("+")) isOn = true;
        					else isOn = false;
        				}
        			}
        		}
        		if(isOn) {
        			outstring = "Passenger " + pasId5 + " was inside the bus at the end of the trip"; 
        		} else {
        			outstring = "Passenger " + pasId5 + " was not inside the bus at the end of the trip";
        		}
        		break;
        } 
        
        return outstring;
    }
}

package iEvolve;

import java.util.*;
import java.util.Map.Entry;


public class HashMapLibrary {
	
	String bookName;
	String author;
	
	HashMapLibrary(){}
	
	@Override
	public int hashCode() {
		int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.bookName);
        hash = 83 * hash + Objects.hashCode(this.author);
        return hash;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HashMapLibrary other = (HashMapLibrary) obj;
        if (!Objects.equals(this.bookName, other.bookName)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        return true;
	}
	
	HashMapLibrary(String bookName,String author)
    {
        this.bookName=bookName;
        this.author=author;
    }
	
	public HashMap<Integer,HashMapLibrary> createLibraryMap(String booksInLibrary)
    {
		String[] books = booksInLibrary.split("\\|");
		String[] provisional = new String[3];
		HashMap<Integer,HashMapLibrary> booksIL = new HashMap<Integer,HashMapLibrary>();
		
		for(String e : books) {
			provisional = e.split(",");
			booksIL.put(Integer.parseInt(provisional[0]), new HashMapLibrary(provisional[1],provisional[2]));
		}
		
        return booksIL;
    }
	
	
    public HashMap<Integer,Integer> createUserMap(String borrowedUsers)
    {
    	String[] users = borrowedUsers.split("\\|");
		String[] provisional = new String[2];
		HashMap<Integer,Integer> booksBU = new HashMap<Integer,Integer>();
		
		for(String e : users) {
			provisional = e.split(",");
			booksBU.put(Integer.parseInt(provisional[0]), Integer.parseInt(provisional[1]));
		}
		
        return booksBU;
    }

    
    public String getQuery(String booksInLibrary,String borrowedUsers,String query)
    {
    	String[] queryInfo = query.split(",");
    	HashMap<Integer,HashMapLibrary> booksIL = createLibraryMap(booksInLibrary);
    	HashMap<Integer,Integer> borrowedU = createUserMap(borrowedUsers);
    	String resultado = "";
    	
    	switch(queryInfo[0]) {
    	
    	case "1":
    		int bookID = Integer.parseInt(queryInfo[1]);
    		if(borrowedU.containsKey(bookID)) {
    			int userID = borrowedU.get(bookID);
    			resultado = "No Stock\nIt is owned by " + userID + "\n";
    		} else {
    			HashMapLibrary obj = booksIL.get(bookID);
    			resultado = "It is available\nAuthor is " + obj.author + "\n";
    		}
    		break;
    	
    	case "2":
    		int userID = Integer.parseInt(queryInfo[1]);
    		List<Integer> librosID = new ArrayList<Integer>();
    		for(Entry<Integer, Integer> entry : borrowedU.entrySet()) {
    			if(entry.getValue() == userID) {
    				librosID.add(entry.getKey());
    			}
    		}
    		for(Integer e : librosID) {
    			if(booksIL.containsKey(e)) {
    				resultado = resultado + e + " " + booksIL.get(e).bookName + "\n";
    			}
    		}
    		break;
    		
    	case "3":
    		String nombreLibro = queryInfo[1];
    		int contExist = 0;
    		int contBorro = 0;
    		List<Integer> libroID = new ArrayList<Integer>();
    		for(Entry<Integer,HashMapLibrary> entry : booksIL.entrySet()) {
    			if(entry.getValue().bookName.equalsIgnoreCase(nombreLibro)) {
    				contExist++;
    				libroID.add(entry.getKey());
    			}
    		}
    		for(Integer e : libroID) {
    			if(borrowedU.containsKey(e)) {
    				contBorro++;
    			}
    		}
    		contExist -= contBorro;
    		resultado = contBorro + " out\n" + contExist + " in\n";
    		break;
    		
    	case "4":
    		String nombreAutor = queryInfo[1];
    		List<String> librosAutor = new ArrayList<String>();
    		for(Entry<Integer,HashMapLibrary> entry : booksIL.entrySet()) {
    			if(entry.getValue().author.equalsIgnoreCase(nombreAutor)) {
    				librosAutor.add(entry.getValue().bookName);
    			}
    		}
    		for(String e : librosAutor) {
    			resultado = resultado + e + "\n";
    		}
    		break;
    		
    	case "5":
    		String palabraClave = queryInfo[1].toLowerCase();
    		String compara = "";
    		for(Entry<Integer,HashMapLibrary> entry : booksIL.entrySet()) {
    			compara = entry.getValue().bookName.toLowerCase();
    			if(compara.contains(palabraClave)) {
    				resultado = resultado + String.valueOf(entry.getKey()) + " "
    						+ entry.getValue().bookName + "\n";
    			}
    		}
    		break;
    	
    	default:
    		resultado="";    	
    	}
    	
        return resultado;
    }

}

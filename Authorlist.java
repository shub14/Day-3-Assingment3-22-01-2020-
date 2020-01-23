package day3assingment;

import java.util.*;
public class Authorlist {

	public static void main(String[] args) {
		TreeMap<String,Author> authors = new TreeMap<String,Author>();
		HashSet<String> set = new HashSet<String>();
		authors.put("Maths",new Author(1,"Harish Pradhan","42,Malviya Nagar,Jaipur"));
		authors.put("Head First Java",new Author(2,"Bert Bates","32,Boston,Massachussets"));
		authors.put("Java for Dummies",new Author(3,"Barry A. Burd","33,New Jersey,"));
		authors.put("Head First EJB",new Author(2,"Bert Bates","32,Boston,Massachussets"));
		authors.put("Ruby On Rails for Dummies",new Author(3,"Barry A. Burd","33,New Jersey,"));
		//System.out.println(authors);
		Set<String>
		keys=authors.keySet();
		for(String i:keys) {
			Author a = authors.get(i);
			System.out.println(i+ " by : "+a.getName()+" lives at: "+a.getAddress());
		}
		System.out.print("\n");
		System.out.print("Author names wrote more than one book\n\n");
	for (String i : keys) {
		Author a = authors.get(i);
		if(set.add(a.getName())==false) {
			System.out.println("Book name: "+ i + " Author id: " + a.getAuthorid()+" Author Name:" + a.getName()+" Author address: " + a.getAddress());
		}
	}
	
	}
	
	
}

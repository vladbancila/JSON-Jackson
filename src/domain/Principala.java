package domain;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Principala {

	public static void main(String[] args) {

		List<Masina> masini = new ArrayList<Masina>();
		
		masini.add( new Masina("Maserati", "Quattro Porte", 100000.00) );
		masini.add( new Masina("Audi", "R8", 70000.00) );
		masini.add( new Masina("Ferrari", "Enzo", 300000.00) );
		masini.add( new Masina("Lamborghini", "Veneno", 1500000.00) );
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			
			String json1 = mapper.writeValueAsString(masini.get(0));
			System.out.println(json1);
			
			String json2 = mapper.writeValueAsString( masini );
			System.out.println( json2 );
			
		} catch (JsonProcessingException e) {

			e.printStackTrace();
		}
		
		
		
	}

}

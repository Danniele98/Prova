package BozzeProgettoEsameModel;

import java.util.Vector;

public class City{
	
	private String id;
	private String name;
	private String state;
	private String country;
	private Coord coord;

	
	//Blocco getter e setter per "id"
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	//Blocco getter e setter per "name"
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//Blocco getter e setter per "state"
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	//Blocco getter e setter per "country"
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	//Blocco getter e setter per "coord"
	public Coord getCoord() {
		return coord;
	}

	public void setCoord(Coord coord) {
		this.coord = coord;
	}
	
}
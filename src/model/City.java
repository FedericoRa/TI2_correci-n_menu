package model;

public class City implements Comparable<City>{
	private String id;
	private String name;
	private String countryId;
	private double population;
	
	public City(String id, String name, String countryId, double population) {
		super();
		this.id = id;
		this.name = name;
		this.countryId = countryId;
		this.population = population;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public double getPopulation() {
		return population;
	}
	public void setPopulation(double population) {
		this.population = population;
	}
	public String information() {
		String all =" Nombre: " + getName() + " ID: " + getId() +" Country Id: " + getCountryId() + " Population: " + getPopulation();
		return all;
	}
	 public int compareTo(City e){
	        if(e.getPopulation()>population){
	            return -1;
	        }else if(e.getPopulation()==population){
	            return 0;
	        }else{
	            return 1;
	        }
	    }
}

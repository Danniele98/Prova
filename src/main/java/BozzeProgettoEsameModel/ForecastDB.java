package BozzeProgettoEsameModel;

import java.util.Date;

public class ForecastDB {
	
	
	//Nel database troveremo le informazioni richieste delle città esaminate
	
	
	//Creiamo un id per riconoscere l'elemento del databse da esaminare:
	private long id;
	
	//Dati della città:
	private String city_id;
	private String name;
	private String country;
	
	//Dati del Forecast nonchè le informazioni richieste
	private String weather;
	private int temp;
	private int tempMin;
	private int tempMax;
	private int tempMed;
	
	//Ogni elemento nel database avrà una data associata
	private Date forecastDate;

	//Blocco getter e setter per "id"
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

/*Blocco getter e setter per i dati della città:
	 							"city_id"
*/
	public String getCity_id() {
		return city_id;
	}

	public void setCity_id(String city_id) {
		this.city_id = city_id;
	}

	//							"name"
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//							"country"
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

/*Blocco getter e setter per i dati del Forecast:
								"weather"
*/
	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}
	//							"temp"
	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	//							"tempMin"
	public int getTempMin() {
		return tempMin;
	}

	public void setTempMin(int tempMin) {
		this.tempMin = tempMin;
	}

	//							"tempMax"
	public int getTempMax() {
		return tempMax;
	}

	public void setTempMax(int tempMax) {
		this.tempMax = tempMax;
	}

	//							"tempMed"
	public int getTempMed() {
		return tempMed;
	}

	public void setTempMed(int tempMed) {
		this.tempMed = tempMed;
	}

//Blocco getter e setter per "forecastDate"
	public Date getForecastDate() {
		return forecastDate;
	}

	public void setForecastDate(Date forecastDate) {
		this.forecastDate = forecastDate;
	}
	

}

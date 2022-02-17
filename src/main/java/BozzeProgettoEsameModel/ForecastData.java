package BozzeProgettoEsameModel;

public class ForecastData {
	private String weather;
	private int temp;
	private int tempMin;
	private int tempMax;
	private int tempMed;
	
	//Blocco getter e setter per "weather"
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	
	//Blocco getter e setter per "temp"
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	
	//Blocco getter e setter per "tempMin"
	public int getTempMin() {
		return tempMin;
	}
	public void setTempMin(int tempMin) {
		this.tempMin = tempMin;
	}
	
	//Blocco getter e setter per "tempMax"
	public int getTempMax() {
		return tempMax;
	}
	public void setTempMax(int tempMax) {
		this.tempMax = tempMax;
	}
	
	//Blocco getter e setter per "tempMed"
	public int getTempMed() {
		return tempMed;
	}
	public void setTempMed(int tempMed) {
		this.tempMed = tempMed;
	}
}
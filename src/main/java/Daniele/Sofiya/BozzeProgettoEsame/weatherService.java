package Daniele.Sofiya.BozzeProgettoEsame;

import BozzeProgettoEsameModel.City;
import org.json.simple.JSONObject;

public interface weatherService {
	public abstract JSONObject toJSON(City city);
	public abstract JSONObject getJSONForecst(String city);
	public abstract City getForecast(JSONObject forecast);
	public abstract void saveToFile (JSONObject obj);

}

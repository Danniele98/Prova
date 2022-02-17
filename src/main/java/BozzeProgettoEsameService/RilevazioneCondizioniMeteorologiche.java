package BozzeProgettoEsameService;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import Daniele.Sofiya.BozzeProgettoEsame.weatherService;

public class weatherServiceImpl implements weatherService {
		private String key="2a45c4714b625b08c4b33a68712e0225";
		private double lat=42.832248;
		private double lon=13.68799;
		private String url="https://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+lon+"&appid="+ key;
		
/*
		private double temp;
		private double tempMin;
		private double tempMax;
		private double tempMed=(tempMin+tempMax)/2;
		private String weather;
*/
		
		@Override
		public JSONObject getJSONForecast(String city) {
			JSONObject forecast=null;
			
			try {
				URLConnection openConnection=new URL (url).openConnection();
				InputStream in= openConnection.getInputStream();
				
				String data="";
				String line="";
				try {
					InputStreamReader inR=new InputStreamReader(in);
					BufferedReader buf= new BufferedReader(inR);
					while ((line=buf.readLine())!=null) {
						data+=line;
					}finally {
						in.close();
					}
					forecast=(JSONObject) JSONValue.parseWithException(data); //parse JSON object
				}
				catch (IOException | ParseException e) {
					e.printStackTrace();
				}
				catch(Exception e) {
						e.printStackTrace();
					}
					return forecast;
			}
			
			public City getForecast(JSONObject obj) {
				City city=new City();
				Vector <ForecastData> forecastData=new Vector<ForecastData>();
				JSONObject cityData=(JSONObject)obj.get("city");
				JSONArray list=(JSONArray)onj.get("list");
				
				City.setName
			}
			
		}
		
}

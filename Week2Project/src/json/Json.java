package json;

import org.json.JSONException;
import org.json.JSONObject;

import com.Cory.guitars.Guitars;

// used to make the model, type, and price a json object
public class Json {

	public static JSONObject buildJSON() {

		// creation of my Guitar object
		JSONObject guitarObject = new JSONObject();
		try {
			// creation of the json object
			JSONObject jsonObject = new JSONObject();

			// cycling through the enums
			for (Guitars guitar : Guitars.values()) {
				JSONObject guitarModels = new JSONObject();

				guitarModels.put("model", guitar.setModel());
				guitarModels.put("type", guitar.setType());
				guitarModels.put("price", guitar.setPrice());

				jsonObject.put(guitar.name().toString(), guitarModels);
			}

			guitarObject.put("json", jsonObject);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return guitarObject;
	}
	
	
	// used to return the model and type of the guitar
	public static String readJSON(String selected){
		String result, model, type;
		
		JSONObject object = buildJSON();
		
		try {
			model = object.getJSONObject("json").getJSONObject(selected).getString("model");
			type = object.getJSONObject("json").getJSONObject(selected).getString("type");
			//price = object.getJSONObject("json").getJSONObject(selected).getString("price");
			
			result = "Model: "+ model + "\r\n" 
					+"Type: " + type + "\r\n";
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = e.toString();
		}		
		
		
		return result;
	}
	
	// this is solely for returning the price of the guitar
	public static String getPrice(String selected){
		String priceReturn;
		
		JSONObject object = buildJSON();
		
		try {
			priceReturn = object.getJSONObject("json").getJSONObject(selected).getString("price");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			priceReturn = e.toString();
		}
		
		return priceReturn;
	}
	
	
	
	
}

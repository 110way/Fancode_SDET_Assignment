package utils;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Utility class for handling JSON operations like parsing, extracting,
 * and validating JSON data.
 */
public class JsonUtils {

    /**
     * Converts a JSON string to a JSONObject.
     jsonString the input JSON string
 the JSONObject representation
     */
    public static JSONObject parseStringToJsonObject(String jsonString) {
        return new JSONObject(jsonString);
    }

//   Extracts a list of integer values from a JSONArray based on a key.

    public static List<Integer> extractIntegerList(JSONArray jsonArray, String key) {
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject object = jsonArray.getJSONObject(i);
            if (object.has(key)) {
                values.add(object.getInt(key));
            }
        }
        return values;
    }

//   Extracts the boolean value of a key in a JSONObject.
   
    public static boolean getBooleanValue(JSONObject jsonObject, String key) {
        return jsonObject.has(key) && jsonObject.getBoolean(key);
    }

//  Extracts a double value of a key in a JSONObject.
   
    public static double getDoubleValue(JSONObject jsonObject, String key) {
        return jsonObject.has(key) ? jsonObject.getDouble(key) : 0.0;
    }

//    Extracts the value of a key as a string in a JSONObject
    public static String getStringValue(JSONObject jsonObject, String key) {
        return jsonObject.has(key) ? jsonObject.getString(key) : "";
    }
}

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
     *
     * @param jsonString the input JSON string
     * @return the JSONObject representation
     */
    public static JSONObject parseStringToJsonObject(String jsonString) {
        return new JSONObject(jsonString);
    }

    /**
     * Converts a JSON string to a JSONArray.
     *
     * @param jsonString the input JSON string
     * @return the JSONArray representation
     */
    public static JSONArray parseStringToJsonArray(String jsonString) {
        return new JSONArray(jsonString);
    }

    /**
     * Extracts a list of integer values from a JSONArray based on a key.
     *
     * @param jsonArray the input JSONArray
     * @param key       the key to extract values for
     * @return a list of integers
     */
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

    /**
     * Extracts the boolean value of a key in a JSONObject.
     *
     * @param jsonObject the input JSONObject
     * @param key        the key to extract the boolean value for
     * @return the boolean value
     */
    public static boolean getBooleanValue(JSONObject jsonObject, String key) {
        return jsonObject.has(key) && jsonObject.getBoolean(key);
    }

    /**
     * Extracts a double value of a key in a JSONObject.
     *
     * @param jsonObject the input JSONObject
     * @param key        the key to extract the double value for
     * @return the double value
     */
    public static double getDoubleValue(JSONObject jsonObject, String key) {
        return jsonObject.has(key) ? jsonObject.getDouble(key) : 0.0;
    }

    /**
     * Extracts the value of a key as a string in a JSONObject.
     *
     * @param jsonObject the input JSONObject
     * @param key        the key to extract the string value for
     * @return the string value
     */
    public static String getStringValue(JSONObject jsonObject, String key) {
        return jsonObject.has(key) ? jsonObject.getString(key) : "";
    }
}

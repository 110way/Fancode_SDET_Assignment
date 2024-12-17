package services;

import endpoints.FanCodeEndpoints;
import utils.JsonUtils;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    public List<Integer> getFanCodeUserIds() {
        List<Integer> userIds = new ArrayList<>();
        JSONArray users = new JSONArray(FanCodeEndpoints.getUsers().asString());

        for (int i = 0; i < users.length(); i++) {
            JSONObject user = users.getJSONObject(i);
            JSONObject geo = JsonUtils.parseStringToJsonObject(user.getJSONObject("address").toString()).getJSONObject("geo");
            double lat = JsonUtils.getDoubleValue(geo, "lat");
            double lng = JsonUtils.getDoubleValue(geo, "lng");


            if (lat >= -40 && lat <= 5 && lng >= 5 && lng <= 100) {
                userIds.add(user.getInt("id"));
            }
        }
        return userIds;
    }
}

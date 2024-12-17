package services;

import endpoints.FanCodeEndpoints;
import org.json.JSONArray;

public class TaskService {

    public double getTaskCompletionPercentage(int userId) {
        JSONArray tasks = new JSONArray(FanCodeEndpoints.getUserTasks(userId).asString());

        int totalTasks = tasks.length();
        int completedTasks = 0;

        for (int i = 0; i < tasks.length(); i++) {
            if (tasks.getJSONObject(i).getBoolean("completed")) {
                completedTasks++;
            }
        }
        return (completedTasks / (double) totalTasks) * 100;
    }
}

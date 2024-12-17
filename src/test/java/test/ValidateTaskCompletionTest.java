package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import services.TaskService;
import services.UserService;

import java.util.List;

public class ValidateTaskCompletionTest {

    UserService userService = new UserService();
    TaskService taskService = new TaskService();

    @Test
    public void validateTaskCompletionForFanCodeCityUsers() {
        // Step 1: Fetch users in FanCode city
        List<Integer> userIds = userService.getFanCodeUserIds();
        Assert.assertFalse(userIds.isEmpty(), "No users found in FanCode city!");

        // Step 2: Calculate task completion percentage for each user
        for (int userId : userIds) {
            double completionPercentage = taskService.getTaskCompletionPercentage(userId);
            System.out.println("User ID: " + userId + " | Task Completion: " + completionPercentage + "%");

            // Step 3: Validate task completion > 50%
            Assert.assertTrue(completionPercentage > 50,
                    "User ID " + userId + " has less than 50% tasks completed!");
        }
    }
}

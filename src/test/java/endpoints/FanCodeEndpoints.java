package endpoints;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class FanCodeEndpoints {

    public static Response getUsers() {
        return given()
                .when()
                .get(routes.Routes.USERS);
    }

    public static Response getUserTasks(int userId) {
        return given()
                .queryParam("userId", userId)
                .when()
                .get(routes.Routes.TODOS);
    }
}

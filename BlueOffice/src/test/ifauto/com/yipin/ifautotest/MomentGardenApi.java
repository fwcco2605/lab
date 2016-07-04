package com.yipin.ifautotest;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

public class MomentGardenApi {
	public String userId;
	public String accessToken;
	public String momentId;
	public String commentId;

	@BeforeTest
	public void setUp() {
		// 测试环境
		RestAssured.baseURI = "http://bocorp-test.ioffice100.net";
	}

	@Test
	public void login() {
		final String bodyString = "{\"AccountName\":\"tryhe@iblue100.com\",\"Password\":\"12345678\",\"ClientInstallationId\":\"c485cde65f274df4a9ebde114cd5de9c\",\"LanguageId\":\"1033\"}";
		Response response = 
				given().contentType("application/json").request().body(bodyString).when()
				.post("/dir/Corporations/bbd70056c684475e0000000000000000/Accounts/1/SignIn")
				.then().statusCode(200)
				.body("UserId", is(notNullValue()), "AccessToken", is(notNullValue()))
				.extract().response();
		userId = response.path("UserId");
		accessToken = response.path("AccessToken");
	}

	@Test
	public void setMoment() {
		String text = "abc";
		final String bodyString = String.format(
				"{\"OwnerId\":\"%s\",\"Type\":0,\"Text\":\"%s\",\"ImageList\":\"[]\",\"Status\":0,\"Longitude\":0.0,\"Latitude\":0.0,\"IsLocationDetected\":false,\"Visibility\":true,\"Metadata\":\"{}\"}",
				userId, text);
		given().headers("AccessToken", accessToken).contentType("application/json").request().body(bodyString)
		.when().post("/mg/Moments/Create")
		.then().statusCode(200).body("Code", equalTo(0));

	}

	@Test
	public void getMoment() {
		int startNum = 0;
		int count = 1;
		int topN = 11;
		final String bodyString = String.format(
				"/mg/Users/bbd70056c684475e907aebd63319b84f/FriendWithInSelfMoments?start=%d&count=%d&topN=%d",
				startNum, count, topN);
		Response response = 
				given().headers("AccessToken", accessToken).get(bodyString)
				.then().statusCode(200).body("id", notNullValue())
				.extract().response();
		List<String> id = response.path("Id");
		momentId = id.get(0);
	}

	@Test
	public void setComment() {
		String text = "ccc";
		int type = 0;
		final String bodyString = String.format(
				"{\"OwnerId\":\"%s\",\"MomentId\":\"%s\",\"Type\":%d,\"Text\":\"%s\",\"Status\":0,\"Metadata\":\"{}\",\"ReplyToUserId\":\"00000000000000000000000000000000\"}",
				userId, momentId, type, text);
		Response response = 
				given().header("AccessToken", accessToken).contentType("application/json").request().body(bodyString)
				.when().post("/mg/Comments/Create")
				.then().statusCode(200).body("Code", equalTo(0), "Description", notNullValue())
				.extract().response();
		String description = response.path("Description");
		String[] sp = description.split("\"");
		commentId = sp[3];
	}

	@Test
	public void delComment() {
		given().headers("AccessToken", accessToken)
		.when().post("/mg/Comments/{commentId}/Delete", commentId)
		.then().body("Code", equalTo(0));
	}

	@Test
	public void delMoment() {
		given().headers("AccessToken", accessToken)
		.when().post("/mg/Moments/{momentId}/Delete", momentId)
		.then().body("Code", equalTo(0));
	}
}
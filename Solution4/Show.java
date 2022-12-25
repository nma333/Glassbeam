package jsonpr.jsonpr;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Reading {
	//This function is responsible for reading the data from the json file
	//It will print the information as you described in the question
	//As per your requirements in the command window or in the terminal
	public static void show() throws IOException, ParseException {
		// Creating the json parser
		JSONParser jp = new JSONParser();
		// Reading the file
		FileReader c1 = new FileReader(".\\jsonfiles\\UDP_Channel_1.json");
		FileReader c2 = new FileReader(".\\jsonfiles\\UDP_Channel_2.json");

		// Parsing the json file
		Object obj1 = jp.parse(c1);
		Object obj2 = jp.parse(c2);
		// Creating the json object
		JSONObject channel1 = (JSONObject) obj1;
		JSONObject channel2 = (JSONObject) obj2;

		// Creating the json array
		JSONArray array = new JSONArray();
		array.add(channel2.get("score"));

		JSONArray teams = new JSONArray();
		teams = (JSONArray) channel2.get("teams");
		JSONArray matches = new JSONArray();
		matches.add(channel2.get("teams"));
		System.out.println("Enter the name of one of the teams playing the match ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		sc.close();
		// This will create the
		JSONArray upteams = new JSONArray();
		upteams = (JSONArray) channel1.get("teams");

		if (teams.contains(input)) {
			JSONObject address = (JSONObject) array.get(0);
			String team = (String) address.get("batting");
			long runs = (long) address.get("runs");
			long overs = (long) address.get("overs");
			System.out.println(
					"Match between " + teams.get(0) + " & " + teams.get(1) + " at " + channel1.get("location"));
			System.out.println("======");
			System.out.println(team + " is batting first and has scored " + runs + " in " + overs + " overs ");
			System.out.println("======");

		} else if (upteams.contains(input)) {
			System.out.println("======");
			System.out.println("No match with " + input + " is currently in progress");
			System.out.println("======");
		}
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ParseException {
		show();

	}

}

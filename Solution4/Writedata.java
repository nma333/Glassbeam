package jsonpr.jsonpr;

import java.io.FileReader;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Writedata {

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
		System.out.println("Enter the name playing team in the match: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		
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

	public static void read() throws IOException {
		JSONObject obj = new JSONObject();
		Scanner sc = new Scanner(System.in);

		// Creating the variables
		ArrayList<String> teams = new ArrayList<String>();
		Map<String, Object> det = new HashMap<String, Object>();
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter the team " + (i + 1) + " :");
			String in = sc.nextLine();
			teams.add(in);
		}

		// JSONArray arr=new JSONArray();
		System.out.println("Enter the batting team:");
		String bat = sc.nextLine();

		System.out.println("Enter the runs:");
		long runs = sc.nextInt();

		System.out.println("Enter the overs:");
		long overs = sc.nextInt();

		System.out.println("Enter the chasing status:");
		long chasing = sc.nextInt();
		if(chasing==1) {
			System.out.println("The match has been completed ! ! ! ! ! !");
		}
		else if(teams.get(0)==null || teams.get(1)==null) {
			System.out.println("The team 1 and team 2 must not be empty ! ! ! ! ! !");
		}

		// Writting into the json file
		det.put("batting", bat);
		det.put("runs", runs);
		det.put("overs", overs);
		det.put("chassing", chasing);

		obj.put("teams", teams);
		obj.put("score", det);

		// File operation
		FileWriter file = new FileWriter(".\\jsonfiles\\Create.json");
		file.write(obj.toJSONString());
		file.close();
		sc.close();
	}

	public static void main(String[] args) throws IOException, InterruptedException, ParseException {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the score :");
//			read();
			show();
			Thread.sleep(5000);
		}

	}

}

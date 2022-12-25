package jsonpr.jsonpr;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.json.simple.JSONObject;

public class Input {

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
	
		
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		read();

	}

}

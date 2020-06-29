package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class NewsOrganisation {

	public static void main(String[] args) {
		System.out.println("Enter your Statement: ");
		Scanner scanner = new Scanner(System.in);
		String statement = scanner.nextLine();
		
		List<String> hashTags = getHashTags(statement);
		System.out.println(hashTags);
		scanner.close();
	}
	public static List<String> getHashTags(String statement){
		//store top 3 tags
		ArrayList<String> tags = new ArrayList<>();
		String[] string = statement.split(" ");
		//sort words
		Arrays.sort(string, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.length() - o1.length();
			}
		});
		int count = 0;
		for (String string2 : string) {
			count++;
			//get top 3 tags
			if(count <= 3) {
				tags.add("#"+string2);
			}
		}
		
		return tags;
	}
}

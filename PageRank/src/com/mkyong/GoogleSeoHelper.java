package com.mkyong;
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import com.mkyong.hash.JenkinsHash;
 
public class GoogleSeoHelper {
 
  public static void main(String[] args) {
 
	GoogleSeoHelper obj = new GoogleSeoHelper();
	System.out.println(obj.getPR("netbeans.com"));
 
  }
 
  public int getPR(String domain) {
 
	String result = "";
 
	JenkinsHash jenkinsHash = new JenkinsHash();
	long hash = jenkinsHash.hash(("info:" + domain).getBytes());
 
	//Append a 6 in front of the hashing value.
	String url = "http://toolbarqueries.google.com/tbr?client=navclient-auto&hl=en&"
	   + "ch=6" + hash + "&ie=UTF-8&oe=UTF-8&features=Rank&q=info:" + domain;
 
	System.out.println("Sending request to : " + url);
 
	try {
		URLConnection conn = new URL(url).openConnection();
 
		BufferedReader br = new BufferedReader(new InputStreamReader(
			conn.getInputStream()));
 
		String input;
		while ((input = br.readLine()) != null) {
 
			// What Google returned? Example : Rank_1:1:9, PR = 9
			System.out.println(input);
 
			result = input.substring(input.lastIndexOf(":") + 1);
		}
 
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 
	if ("".equals(result)) {
		return 0;
	} else {
		return Integer.valueOf(result);
	}
 
  }
 
}
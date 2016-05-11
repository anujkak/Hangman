import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Hashtable;
import java.math.*;


public class DictionaryLists {
	
private String listTopic;
private String wordListLocation;
private int lineCount;
public Hashtable<Integer, String> words = new Hashtable<Integer, String>();
private String[] topicArray = {"compsci", "countries", "astronomy", "math","standard", "custom"};
	public DictionaryLists(String topic, String path)
	{
		listTopic = topic;
		wordListLocation = path;
	}
	public boolean topicChecker()
	{
		if (Arrays.asList(topicArray).contains(listTopic)){
			return true;
		}
		else{
			System.out.println("Not a valid option!");
			return false;
		}
		
	}
	//reads the file and returns a hashtable of each word line.
	public Hashtable<Integer, String> ReadFile(int lineCount){
		try {
			FileReader fileRead = new FileReader(wordListLocation);
			BufferedReader inputText = new BufferedReader(fileRead);
			int counter = 0;
		    System.out.println(lineCount);
			while (counter < 15){
				words.put(counter,inputText.readLine());
				counter++;
			}
			
			
		} 
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		catch (IOException e){
			e.printStackTrace();
		}
		return words;
		
		
	}
	public int LinesCounter() throws IOException{
		int lineCount = 0;
		FileReader fileRead = new FileReader(wordListLocation);
		BufferedReader textRead = new BufferedReader(fileRead);
		String line;
		while ((line = textRead.readLine()) != null){
			lineCount ++;
		}
		textRead.close();
		return lineCount;
	}
	public String randomLetter(){
		int key = 1 + (int) (Math.random() * 14);
	    System.out.println(key);
		String returnString = words.get(key);
		System.out.println(returnString);
		return returnString;
	}
	
	
}

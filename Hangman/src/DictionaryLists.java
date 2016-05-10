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


public class DictionaryLists {
	
private String listTopic;
private String wordListLocation;
private int lineCount;
public Hashtable<Integer, String> words = new Hashtable<Integer, String>();
private String[] topicArray = {"science", "capitals", "astronomy", "history", "states", "standard", "custom"};
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
			return false;
		}
		
	}
	public Hashtable<Integer, String> ReadFile(){
		try {
			BufferedReader inputText = new BufferedReader(new FileReader(wordListLocation));
			int counter = 0;
			counter = 0;
			while (counter < lineCount){
				words.put(counter,inputText.readLine());
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
	private int LinesCounter() throws IOException{
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
	public Hashtable<Integer, String> standardLists(){
		
		return words;
	}
	
	
}

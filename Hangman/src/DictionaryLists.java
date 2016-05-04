import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;


public class DictionaryLists {
	
private String listTopic;
private String wordListLocation;
private int listCount;
private String[] topicArray = {"science", "capitals", "astronomy", "history", "states"};
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
	public String[] ReadFile() throws IOException{
		FileReader fileRead = new FileReader(wordListLocation);
		BufferedReader textRead = new BufferedReader(fileRead);
		textRead.close();
		return topicArray;
		
		
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
	
	
}

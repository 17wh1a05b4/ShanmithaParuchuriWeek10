package lambdasStreams;

//List imports
import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;

//main method
public class palindromeStrings {
    public static void main(String args[]) {
    	//Array list
        List<String> words=new ArrayList<String>();
        words.add("aha");
        words.add("bbb");
        words.add("pppq");
        words.add("pqqpq");
        words.add("qrrrq");
        words.add("and");
        words = extract(words);
        for(String word : words)
            System.out.println(word);
    }
    static List<String> extract(List<String> words) {
        List<String> result = new ArrayList<String>();
           for(String word : words) {
        	   String t = word.replaceAll("\\s+", "").toLowerCase();
        	   if( IntStream.range(0,t.length()/2).noneMatch(j -> t.charAt(j)!= t.charAt(t.length()-j-1)))
        		   result.add(word);
            }
            return result;
    }
}
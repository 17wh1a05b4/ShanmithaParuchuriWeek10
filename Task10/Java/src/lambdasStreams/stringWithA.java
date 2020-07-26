package lambdasStreams;

import java.util.stream.Stream; 

public class stringWithA {
    public static void main(String[] args)  { 
    	//initializing and sorting
        Stream<String> st = Stream.of("apple", "ant", "run", "and","hat","are"); 
        //words starting with a and has 3 letters are printed
        st.filter(s -> s.startsWith("a") && s.length()==3).forEach(System.out::println); 
    }
}
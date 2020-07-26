package lambdasStreams;

//imports for IntStream
import java.util.*;
import java.util.stream.IntStream;

//main method
public class ListAvg{
public static void main(String []args){

//Initializing a list of numbers
IntStream lS= IntStream.of(1,3, 38, 11, 90, 78, 43);
OptionalDouble optDouble=lS.average();
if(optDouble.isPresent()){
System.out.println("The average of list of numbers 1, 3, 38, 11, 90, 78, 43 is : " + optDouble.getAsDouble());
} else {
System.out.println("Not Applicable!");
}
}
}
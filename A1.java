import java.util.Arrays;

public class A1 {
   public static void main(String[] args) {
//This feature about going to sorting a list of Strings 
 String [] clrs = {"Blue", "White", "Red", "Green", "Yellow","Black"};

//sorts string array in alphabetical order or ascending order  
Arrays.sort(clrs);  
//prints the sorted string array in ascending order  
String [] sorted = clrs;  

//Testing to see if this works
String [] result = {"Black", "Blue", "Green", "Red", "White", "Yellow"};
if (Arrays.equals(sorted, result))   
    System.out.println("Passed!");   
else  
    System.out.println("Failed!");   
    }   

    //A small change
}






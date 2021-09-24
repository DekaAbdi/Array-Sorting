import java.util.Arrays;

public class A1 {

    public static void main(String[] args) {

//This feature sorts an array of numbers
int [] age = {13, 7, 6, 45, 21, 9, 101, 102};

// Applying sort() method over to above array
// by passing the array as an argument
 Arrays.sort(age);

//prints the sorted string array in ascending order  
int [] sorted = age;  

//Testing to see if this works
int [] result = {6, 7, 9, 13, 21, 45,101,102};
if (Arrays.equals(sorted, result))   
    System.out.println("Passed!");   
else  
    System.out.println("Failed!");   
    }   
}



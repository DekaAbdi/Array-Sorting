import java.util.Arrays;

public class A1 {
//One feature sorts numbers and the other sorts strings.

    
    public static void main(String[] args) {


//This feature sorts an array of numbers
int [] age = {13, 7, 6, 45, 21, 9, 101, 102};

// Applying sort() method over to above array
// by passing the array as an argument
 Arrays.sort(age);
//printing the sorted array
System.out.println(age);
    }
}

//This feature about going to sorting a list of Strings
public static void stringSort(String clrs[])
{  

//sorts string array in alphabetical order or ascending order  
Arrays.sort(clrs);  
//prints the sorted string array in ascending order  
System.out.println(Arrays.toString(clrs));  
}  



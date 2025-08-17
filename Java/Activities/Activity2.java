package Activities;

import java.util.Arrays;

public class Activity2 {
public static void main(String[] args) {
	//Initializing array
	int[] numArray = {10,77,10,54,-11,10};
	System.out.println("Original array is:" + Arrays.toString(numArray));
	
	//Set Constants
	int searchNum = 10;
	int sum = 30;
	
	//Print result
    System.out.println("Result: " + result(numArray, searchNum, sum));
	
}
public static boolean result(int[] numbers, int searchNum, int sum) {
    int temp_sum = 0;
    //Loop through array
    for (int number : numbers) {
        //If value is 10
        if (number == searchNum) {
            //Add them
            temp_sum += searchNum;
        }

        //Sum should not be more than 30
        if (temp_sum > sum) {
            break;
        }
    }

    //Return true if condition satisfies
    return temp_sum == sum;
}
}


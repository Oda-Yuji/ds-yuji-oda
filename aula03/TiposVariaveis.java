public class TiposVariaveis 
{
    public static void main(String[] args) 
    {
        int myNum = 5;               // integer (whole number)
        float myFloatNum = 5.99f;    // floating point number
        char myLetter = 'D';         // character
        boolean myBool = true;       // boolean
        String myText = "Hello";     // String    

        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);


        // Create variables of different data types
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        // Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);


        // Set the maximum possible score in the game to 500
        int maxScore = 500;

        // The actual score of the user
        int userScore = 423;

        /* Calculate the percantage of the user's score in relation to the maximum available score.
        Convert userScore to float to make sure that the division is accurate */
        float percentage = (float) userScore / maxScore * 100.0f;

        // Print the result
        System.out.println("User's percentage is " + percentage);
    }
}
  
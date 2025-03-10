public class Testes
{
    public static void main(String[] args) 
    {
        int maxScore = 3000;
        int userScore = 1867;
        float percentage = (float) userScore / maxScore * 100.0f;
        char pert = '%'; 

        System.out.println("User's percentage is " + percentage + pert);


        int items = 400;
        float costPerItem = 19.99f;
        float totalCost = items * costPerItem;
        char currency1 = 'R';
        char currency2 = '$';

        System.out.println("\nNumber of items: " + items);
        System.out.println("Cost per item: " + currency1 + currency2 + " " + costPerItem);
        System.out.println("Total cost = " + currency1 + currency2 + " " + totalCost );
    }
}
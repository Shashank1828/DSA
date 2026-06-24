public class SecondSmallest {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 11, 13};
        
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
               
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
           
                secondSmallest = num;
            }
        }

        System.out.println("Smallest number is: " + smallest);
        System.out.println("Second smallest number is: " + secondSmallest);
    }
}

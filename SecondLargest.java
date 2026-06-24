public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 11};
        int First = arr[0];
        int Second = arr[1];

        for (int num : arr) {
            if (num > First) {
                Second = First;
                First = num;
            } else if (num > Second && num != First) {
                Second = num;
            }
        }

        System.out.println("Largest number is: " + First);
        System.out.println("Second largest number is: " + Second);
    }
}

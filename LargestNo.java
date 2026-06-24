    public class LargestNo{
        public static void main(String[] args) {
            int arr[]  = {2,1,7,3,9,11};
            int largest = arr[0];
            for(int num : arr) {
                if(num>largest){
                    largest=num;
                }

            }
            System.out.println("The largest no among the given set of number is "  +  largest);
        }
    }

public class ThirdLargest {
    public static void main(String[] args) {
        int arr[] = {2,4,1,5,0,9,3};
        int thirdlargest = findthirdlargest(arr);
        System.out.println("The third largest element is: " + thirdlargest);
    }

   public static int findthirdlargest(int arr[]){
        int first = arr[0];
        int second  =  Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int i = 1 ;i<arr.length;i++){
            if(arr[i]> first){
                third = second;
                second = first;
                first = arr[i];

            }else if(arr[i] >second){
                third = second;
                second = arr[i];

            }else if(arr[i] > third){
                third = arr[i];
            }
        }
        return third;

    }
}
 
package First;

public class array {
    public static void array_arguments(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            numbers[i]=numbers[i]+1;
        }
    }


    public static int linear_search(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if (numbers[i]==key) {
                return i;
            }
        }return -1;
    }


    public static int get_largest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }return largest;
    }


    public static int binary_search(int numbers[],int key){
        int start = 0;
        int end = numbers.length-1;
        while (start<=end) {
            int mid =(start+end)/2;
            if (numbers[mid]==key) {
                return mid;
            }if (numbers[mid] < key) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void reverse(int numbers[]){
        int start=0;
        int end=numbers.length-1;
        int temp;
        while (start<end) {
            temp=numbers[start];
            numbers[start]=numbers[end];
            numbers[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int numbers[]={2,4,3,5,2,4,4};
        reverse(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]);
        }
}
}

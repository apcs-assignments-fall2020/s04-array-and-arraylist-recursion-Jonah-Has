import java.util.ArrayList;

public class MyMain {

    // Wrapper method
    public static boolean isSorted(ArrayList<Integer> list) {
        return iss(list, 1);
    }
    
    public static boolean iss(ArrayList<Integer> list, int i){
        if (list.size() == i || list.size() == 0){
            return true;
        }
        if (list.get(i - 1) <= list.get(i)){
            return iss(list, i + 1);
        }
        
        return false;
    }





     // Wrapper method
    public static boolean hasCountCopies(int[] arr, int x, int count) {

        return hasCCF(arr, x, count, 0);

    }
    public static boolean hasCCF(int[] arr, int x, int count, int i){
        if (i == arr.length){
            if(count == 0){
                return true;
            }
            else{
                return false;
            }
        }
        if (arr[i] == x){
            return hasCCF(arr, x, count - 1, i + 1);
        }
        else{
            return hasCCF(arr, x, count, i + 1);
        }

        //return false;
    }

   




    // Wrapper method
    public static boolean binarySearch(int[] arr, int num) {
        return binarySearchRec(arr, num, 0, arr.length - 1);
    }

    // This recursive method calls binary search on the array
    public static boolean binarySearchRec(int[] arr, int num, int lowerBound, int upperBound) {        
        if (lowerBound > upperBound){
            return false;
        }
        int mid = (lowerBound + upperBound) / 2;
        if (arr[mid] == num){
            return true;
        }
        if (arr[mid] > num){
            return(binarySearchRec(arr, num, lowerBound, mid - 1));
        }
        if (arr[mid] < num){
            return(binarySearchRec(arr, num, mid + 1, upperBound));
            
        }
        return false;
        
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}

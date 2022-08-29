public class Main {

    static boolean isFound(int[] arr, int value){
        for(int i : arr){
            if(i == value)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,7,12,14,8,4,4,3,8,2,5,7,2};
        int[] duplicate  = new int [arr.length];
        int startIndex = 0;
        for (int i = 0; i< arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if(i != j && arr[i] % 2 == 0 && arr[i] == arr[j]){
                    if(! isFound(duplicate,arr[i]))
                        duplicate[startIndex++] = arr[i];
                }
            }
        }
        for (int value : duplicate) {
            if (value != 0) {
                System.out.print(value + " ");
            }
        }
    }
}

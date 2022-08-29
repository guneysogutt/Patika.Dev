public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        int counter;

        for (int i = 0; i < arr.length;i++){

            counter = 0;
            for (int j = 0; j < arr.length;j++){

                if (arr[i] == arr[j]){
                    counter++;
                    
                    if(i != j)
                        arr[j] = 0;
                }
            }

            if(arr[i]!=0)
                System.out.println("Number " + arr[i] + " repeats " + counter + " times.");
        }
    }
}

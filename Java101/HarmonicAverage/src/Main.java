public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;
        double harmonicAverage;
        for(int i : numbers){
            sum += Math.pow(i,-1);
        }
        harmonicAverage = numbers.length / sum;
        System.out.println("harmonic average : " + harmonicAverage);
    }
}

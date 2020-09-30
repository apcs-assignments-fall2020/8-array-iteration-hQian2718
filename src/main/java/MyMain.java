public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int[] reverse = new int[arr.length];
        for(int i = 0; i < arr.length; i ++){
            reverse[i] = arr[arr.length - 1 - i];
        }
        return reverse;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int max = arr[0];
        int sec = max;

        for(int i = 0; i < arr.length; i ++){
            if(arr[i] > max){
                sec = max;
                max = arr[i];
            }else if(arr[i] > sec){
                sec = arr[i];
            }
        }

        if(max == sec){
            sec = arr[1];
            for(int i = 1; i < arr.length; i ++){
                if(arr[i] > sec){
                    sec = arr[i];               
                }
            }
        }
        return sec;
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        if(arr.length < 2){
            return false;
        }
        
        double q = doubleDiv (arr[1], arr[0]);

        for(int i = 1; i < arr.length; i ++){
            if (q - doubleDiv(arr[i], arr[i-1]) > 0.0001 || q - doubleDiv(arr[i], arr[i-1]) < -0.0001){
                return false;
            }
        }

        return true;
    }

    public static double doubleDiv(int a, int b){
        return ((double) (a)) / ((double) b);
    }

    public static void pArr (int[] arr){
        for(int i = 0; i < arr.length; i ++){
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[] arr1 = {5, 4, 3, 2, 1};
        int[] arr2 = reverse(arr1);

        pArr(arr2);
        System.out.println(secondLargest(arr2));
        System.out.println(isGeometric(arr1));
        System.out.println(isGeometric(arr2));
    }
}

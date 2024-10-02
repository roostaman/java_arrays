public class revArray {
    public static void main(String[] args) {
        // int[] arrOne = new int[10];
        int[] arrOne = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i=0; i<arrOne.length;i++) {
            System.out.println(arrOne[i]);
        } 

        arrOne = reverseArray(arrOne);
        for (int i=0; i<arrOne.length;i++) {
            System.out.println(arrOne[i]);
        } 

        int maxNum = findMax(arrOne);
        System.out.println(maxNum);

        int sum = calcSum(arrOne);
        System.out.println(sum);

        double averageNum = calcAverage(arrOne);
        System.out.println(averageNum);

        String numIndex = findNum(arrOne, 5);
        System.out.println(numIndex);
        
    }
    
    public static int[] reverseArray(int[] arr) {
        int[] newArr = new int[arr.length];
        int i = 0;
        
        for (int len=(arr.length-1); 0<=len; len--) {
            newArr[len] = arr[i];
            i++;
        }
        return newArr;
    }
    
    public static int findMax(int[] arr) {
        int maxNum = arr[0];
        for (int i=0; i<arr.length; i++) {
            if (maxNum < arr[i]) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    public static int calcSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static double calcAverage(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum/arr.length;
    }

    public static String findNum(int[] arr, int numToFind) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == numToFind) {
                return "Number found at index: " + i;
            }
        }
        return "Number not found";
    }

}



package Homework.Module2;
public class Task2_1 {
    public static void main(String[] args) {
        //double[] doubleArray={12.12,312.123,123.35,4223.35,3234.345,23.746,77.0345,234.363,5786.345,984.367}; //double array
        int[] intArray = {13, 312, 3, 423, 323, 23, 767, 234, 5786, 984};//int array
        double[] doubleArray = {10.0, 10.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0};
        //integer strings
        System.out.println("SUM of all elements in the array: " + "Integer: " + sum(intArray));
        System.out.println("MIN of all elements in the array: " + "Integer: " + min(intArray));
        System.out.println("MAX of all elements in the array: " + "Integer: " + max(intArray));
        System.out.println("MAX POSITIVE of all elements in the array: " + "Integer: " + maxPositive(intArray));
        System.out.println("MULTIPLICATION of all elements in the array: " + "Integer: " + multiplication(intArray));
        System.out.println("MODULUS of all elements in the array: " + "Integer: " + modulus(intArray));
        System.out.println("SECOND LARGEST of all elements in the array: " + "Integer: " + secondLargest(intArray));
        System.out.println("=========================================================================================");  //for section
        //double strings
        System.out.println("SUM of all elements in the array: " + "Double: " + sum(doubleArray));
        System.out.println("MIN of all elements in the array: " + "Double: " + min(doubleArray));
        System.out.println("MAX of all elements in the array: " + "Double: " + max(doubleArray));
        System.out.println("MAX POSITIVE of all elements in the array: " + "Double: " + maxPositive(doubleArray));
        System.out.println("MULTIPLICATION of all elements in the array: " + "Double: " + multiplication(doubleArray));
        System.out.println("MODULUS of all elements in the array: " + "Double: " + modulus(doubleArray));
        System.out.println("SECOND LARGEST of all elements in the array: " + "Double: " + secondLargest(doubleArray));
    }

    //integer
    private static int sum(int[] array) {   //sum method
        int sum = 0;
        for (int item : array) sum += item;
        return sum;
    }

    private static int min(int array[]) {    //min method
        int min = array[0];
        for (short l = 1; l < array.length; l++) if (min > array[l]) min = array[l];
        return min;
    }
    private static int max(int array[]) {     //max method
        int max = array[0];
        for (short l = 1; l < array.length; l++) if (max < array[l]) max = array[l];
        return max;
    }

    private static int maxPositive(int array[]) {  //maxPositive method
        int max = array[0];
        for (short l = 1; l < array.length; l++){
            if (max < array[l]){
                max = array[l];
            }
        }
        return max;
    }

    private static long multiplication(int[] array) {    //multiplication method
        long multiplication = 1;
        for (long item : array) multiplication *= item;
        return multiplication;
    }

    private static int modulus(int[] array) {//modulus method
        return array[0]%array[array.length-1];
    }
    private static int secondLargest(int[] array){      //secondLargest
        int secondLargest= min(array);
        for (int anArray : array) if ((secondLargest < anArray) && (anArray < max(array))) secondLargest = anArray;
        return secondLargest;
    }
    //Double
    private static double sum(double[] array){           //sum method
        double sum = 0;
        for(double item:array) sum += item;
        return sum;
    }
    private static double min(double[] array){           //min method
        double min = array[0];
        for(short l=1;l<array.length;l++) if(min>array[l]) min = array[l];
        return min;
    }
    private static double max(double[] array){           //max method
        double max = array[0];
        for(short l=1;l<array.length;l++) if(max<array[l]) max = array[l];
        return max;
    }
    private static double maxPositive(double[] array){   //maxPositive method
        double max = array[0];
        for(short l=1;l<array.length;l++) if(max<array[l]) max = array[l];
        return max;
    }
    private static double multiplication(double[] array){    //multiplication method
        double multiplication = 1;
        for(double item:array) multiplication *= item;
        return multiplication;
    }
    private static double modulus(double[] array){           //modulus method
        return array[0]%array[array.length-1];
    }
    private static double secondLargest(double[] array) {
        double secondLargest = min(array);
        for (double anArray : array)
            if ((secondLargest < anArray) && (anArray < max(array)))
                secondLargest = anArray;
        return secondLargest;
    }
}
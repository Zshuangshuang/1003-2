import java.util.Arrays;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-03
 * Time:10:14
 **/
public class Test {
    public static String myToString(int[] array){
        String tmp = "[";
        for (int i = 0; i < array.length; i++) {
            tmp += array[i];
            if (i != array.length-1){
                tmp += ",";
            }
        }
        return tmp+"]";
    }

    public static int max(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                int tmp = array[i];
                array[i] = max;
                max = tmp;
            }
        }
        return max;
    }

    public static int[] myArrayCopy(int[] array){
        int[] tmp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        return tmp;
    }

    public static int binarySearch(int[] array,int toFind){
        int left = 0;
        int right = array.length-1;
        while(left <= right){
            int middle = (left + right)/2;
            if (array[middle] < toFind){
                left = middle+1;
            }else if (array[middle] == toFind){
                return middle;
            }
            else {
                right = middle-1;
            }
        }
        return -1;
    }

    public static double avg(int[] array){
        int sum = 0;
        for (int x:array) {
            sum += x;
        }
        return (sum*1.0)/array.length;
    }
    public static boolean isSorted(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length-1-i;j++) {
                if (array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
        }
    }
    public static void reverse(int[] array){
        int left = 0;
        int right = array.length-1;
        while(left <= right){
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }
    public static void sort(int[] array){
        int left = 0;
        int right = array.length-1;
        while(left < right){
            while((array[left] %2 == 0) && left < right){
                left++;
            }
            while((array[right] %2 != 0) && left < right){
                right--;
            }
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
        }



    }
    public static void main(String[] args) {
        int[] array = {1,32,50,7,2};
        /*System.out.println(myToString(array));*/
       /* System.out.println(Arrays.toString(myArrayCopy(array)));*/
       /* System.out.println(max(array));*/
       /* System.out.println(avg(array));*/
       /* System.out.println(binarySearch(array, 1));*/
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}

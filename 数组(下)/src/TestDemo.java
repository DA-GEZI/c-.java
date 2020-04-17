import java.util.Arrays;

public class TestDemo {
    //查找数组中指定元素
    //顺序查找
   /* public static int find(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;//数组是没有-1下标
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int ret = find(array, 8);
        System.out.println("下标：" + ret);
    }
}*/
    //二分查找：折半查找 给定一个有序的序列，然后才能使用二分查找
    //array:序列 key:代表查找的序列
    /*public static int binarySearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            int left = 0;
            int right = array.length - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (array[mid] < key) {
                    left = mid + 1;
                } else if (array[mid] == key) {
                    return mid;
                } else {
                    right = mid - 1;
                }
            }
        }
            return -1;
        }
        public static void main (String[]args){
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int ret = binarySearch(array, 8);
            System.out.println("下标：" + ret);
        }
    }*/
   /* public static int count=0;
    public static int find(int[] array, int key) {//9999
        for (int i = 0; i < array.length; i++) {
            count++;
            if (array[i] == key) {
                return i;
            }
        }
        return -1;//数组是没有-1下标
    }
    public static void main (String[]args){
        int[] array = new int[1_0000];
                for(int i=0;i<array.length;i++){
                    array [i]=i;//array[9999]=9999
                }
        int ret = find(array,9999);
        System.out.println("下标：" + ret+"找到次数："+count);
    }
}*/
   /* public static int count=0;
    public static int binarySearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            int left = 0;
            int right = array.length - 1;
            while (left <= right) {
                count++;
                int mid = (left + right) / 2;
                if (array[mid] < key) {
                    left = mid + 1;
                } else if (array[mid] == key) {
                    return mid;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main (String[]args){
        int[] array = new int[1_0000];
        for(int i=0;i<array.length;i++){
            array [i]=i;//array[9999]=9999
        }
        int ret =  binarySearch(array,9999);
        System.out.println("下标：" + ret+"找到次数："+count);
    }
}*/
    //Arrays.binarySearch
    //[fromIndex,int toIndex)
   /* public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.binarySearch(array,2,6,5));
    }
}*/
    //Arrays.copyOfRange
   /* public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //[to,newType)
        int[] ret = Arrays.copyOfRange(array, 2, 5);
        System.out.println(Arrays.toString(ret));
    }
}*/
    //判断数组是否相同
   /* public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.equals(array, array2));
    }
}*/
    //toString全部填充
   /* public static void main(String[] args) {
        int[] array = new int[10];
        Arrays.fill(array, 8);
        System.out.println(Arrays.toString(array));//10个8
    }
    }*/
    //局部填充：2号位置到8号位置
   /* public static void main(String[] args) {
        int[] array = new int[10];
        Arrays.fill(array,2,5,8);
        System.out.println(Arrays.toString(array));//10个8
    }
}*/
   //排序
   /* public static void main(String[] args) {
        int[] array = {1, 21, 34, 65, 3, 8, 9, 67};
        Arrays.sort(array);//底层排序
        System.out.println(Arrays.toString(array));
    }
}*/
   //判断数组是否是升序  是：true  不是：false
   /* public static boolean isUp(int [] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[i + 1]) ;
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,6,4,5,7};
        System.out.println(isUp(array));
    }
}*/
   //冒泡排序：5个数据比较4趟，每一趟次数都比上一趟少1
   /* public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length; i++) {//i为趟数 i<4  不可以等于4
            for (int j = 0; j < array.length - 1-i; j++) {//j为5个数据 数组长度为5 3趟
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
        public static void main(String[] args) {
            int[] array = {1,2,3,6,4,5,7};
            bubbleSort(array);
            System.out.println(Arrays.toString(array));
        }
    }*/
    /*public static void bubbleSort(int[] array){
        boolean flg=false;//没有发生交换
        for (int i = 0; i < array.length; i++) {//i为趟数 i<4  不可以等于4
           flg=false;
            for (int j = 0; j < array.length - 1-i; j++) {//j为5个数据 数组长度为5 3趟
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    flg=true;
                }
            }
            if(flg=false){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,6,4,5,7};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}*/
    //数组逆序列
      /* public static void reverse(int[] array){
       int left=0 ;
       int right=array.length-1;
       while(left<right){
           int tmp=array[left];
           array[left]=array[right];
           array[right]=tmp;
           left++;
           right--;
       }
       }
    public static void main(String[] args) {
        int[] array = {1,2,3,6,4,5,7};
       reverse(array);
        System.out.println(Arrays.toString(array));
    }
}
*/
      //偶数前面，奇数后面 前面遇到奇数停止，后面遇到偶数停止

      /* public static void reverse(int[] array) {
           int left = 0;
           int right = array.length - 1;
           while (left < right) {
               while (left < right && array[left] % 2 == 0) {//偶数
                   left++;
               }
               //left遇到奇数了
               while (left < right && array[left] % 2 != 0) {
                   right--;
               }
               //right肯定遇到偶数了
               if (left < right) {
                   int tmp = array[left];
                   array[left] = array[right];
                   array[left] = array[right];
                   array[right] = tmp;
               }
           }
       }
       public static void main(String[] args) {
        int[] array = {1,2,3,6,4,5,7};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
}*/
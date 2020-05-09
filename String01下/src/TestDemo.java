import java.util.Arrays;
import java.io.UnsupportedEncodingException;
public class TestDemo {
    /* public static void main(String[] args) {
         char[] val = {'a','b','c','d','e'};//字符串数组
         String str = new String(val,1,3);//偏移量，偏移3个
         System.out.println(str);//bcd
         String str2 = "hello";//字符串
         char ch = str2.charAt(4);//3号下标
         System.out.println(ch);//0
         char[] val2 = str2.toCharArray();//字符串转变为字符串数组
         System.out.println(Arrays.toString(val2));//[h,e,l,l,o]
     }
 }*/
    //给定字符串一个字符串，判断其是否全部由数字所组成
    /*public static boolean func(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "1234a6";
        boolean flg = func(str);
        System.out.println(flg);//false
    }
}*/
    //字节与字符串的转换
   /* public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] bytes = {97, 98, 99, 100};
        String str = new String(bytes);
        System.out.println(str);//abcd
        String str2 = "abcdef";
        byte[] bytes1 = str2.getBytes();
        System.out.println(Arrays.toString(bytes1));//[97,98,99,100,101,102]
        byte[] bytes2 = str2.getBytes("utf8");//换代码
        System.out.println("============");
        System.out.println(Arrays.toString(bytes1));
        //先打印========后打印[97,98,99,100,100]

    }
}
*/
    /*public static void main(String[] args) {
        String str1 = "FBCdefg";
        String str2 = "fbcdefg";
        String str3 = "dbc";//ebc
        String str4 = "abcdefg";//则a减f为4
        String str5 = "ebc";//ebcf
        String str6 = "abcdefg";//则a减e为3
        String str7 = "ebc";
        String str8 = "ebc";//相同为0
        System.out.println(str1.equals(str2));//判断字符串是否相同false
        System.out.println(str1.equalsIgnoreCase(str2));//忽略大小写比较是否相同true
        System.out.println(str4.compareTo(str3));//str4比str3大  返回值为正数 a为100 d为97相减为3则值为3
        System.out.println(str3.compareTo(str4));//比较两个字符串本身的长度大小 -4
        System.out.println("刘".compareTo("杨"));//-5456//
        //str1 > str2   正数
        //str1 < str2   负数
        //str1 == str2  0
    }
}*/
    /*public static void main(String[] args) {
        String str1 = "ababcabcd";
       String ret=str1.replaceAll("ab","pp");//修改字符串里面的数
        System.out.println(ret);//ppppcppcd
        String ret2 = str1.replaceFirst("abc","pp");//修改第一次出现的abc
        System.out.println(ret2);//abppabcd
        String str4 = "abab      cabcd     ";
        String ret4 = str4.trim();
        System.out.println(ret4);//abab      cabcd 去除左右空格
        //代表从这个位置开始进行截取到结束位置
        String ret3 = str1.substring(2);
        System.out.println(ret3);//abcabcd
        ret = str1.substring(1,4);//[1,4)提取字符串
        System.out.println(ret);//bab

    }
}*/
       /* public static boolean isAdmin(String userId){
            return userId.toLowerCase()=="admin";
        }
        public static void main(String[] args){
            System.out.println(isAdmin("Admin"));//false
        }
    }*/
        String str = new String("good");
        char[ ] ch = { 'a' , 'b' , 'c' };
        public static void main(String args[]){
         TestDemo ex = new TestDemo();
            ex.change(ex.str,ex.ch);
            System.out.print(ex.str + " and ");
            System.out.print(ex.ch);//good and gbc
        }
        public void change(String str,char ch[ ]){
            str = "test ok";
            ch[0] = 'g';
        }
    }

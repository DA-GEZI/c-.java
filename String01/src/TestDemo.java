import javax.xml.bind.SchemaOutputResolver;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.Arrays;
//public class TestDemo {
    /* public static void main(String[] args) {
         String str = "hello";
         System.out.println(str);
         String str2 = new String("abcdef");
         System.out.println(str2);
         char[] val = {'a', 'b', 'c', 'd', 'e', 'f'};
         String str3 = new String(val);
         System.out.println(str3);
     }
 }*/
  /* public static void main(String[] args) {
       String str1 = "hello";
       String str2 =new String("hello") ;
       System.out.println(str1==str2);//false
       String str3 = "hello";
       System.out.println(str1==str3);//true
   }
   }*/
    /*public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hel" + "lo";
        System.out.println(str1 == str2);//true
        String str3 = new String("hel") + "lo";
        System.out.println(str3 == str1);//false
        //常量在编译时候已经确定
        final int a=10;
        int c=a+30;//40
    }
}*/
    /*public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "str1";
        System.out.println(str1);//hello
        System.out.println(str2);//str1
        str1 = "abc";
        System.out.println(str1);//abc
        System.out.println(str2);//str1
    }
}*/
    /*public static void func(String str, char[] array) {
        str = "abcdef";
        array[0] = 'g';
    }
    public static void main5(String[] args) {
        String str1 = "hello";
        char[] val = {'a'};
        System.out.println(str1);//hello
        System.out.println(Arrays.toString(val));//a
        func(str1, val);
        System.out.println(str1);//hello
        System.out.println(Arrays.toString(val));//g
    }
}*/
    //一般情况下，如果调用equals，没有重写的话 默认实现是默认比较引用是否相同
    /*public static void main(String[] args) {
        String str1 = "hello";
        String str2 =new String("hello") ;
        System.out.println(str1==str2);//比较引用  false
        System.out.println(str1.equals(str2));//true//equal比较字符串内容
        String str3 = "hello";
        System.out.println(str1==str3);//true
        System.out.println(str1.equals(str3));//true
    }
}*/
    /*public static void main(String[] args) {
        String str1 = null;
        String str2 =new String("hello") ;
        //System.out.println(str2.equals(str1));//保证不可以为空
        //System.out.println(str2.equals(null));//false
        System.out.println(null.equals(str2));//点号前面不可以使用空
    }
}*/
    /*public static void main(String[] args) {
        String str1 = "hello";
        System.out.println(str1.equals("hello"));//true
        System.out.println("hello".equals(str1));//true
    }
}*/
    /*public static void main(String[] args) {
        String str1 = "hello";
        String str2 =new String("hello").intern() ;
        //intern()手动入池，从现象来看的
        //当前的这个字符串在常量池中如果存在，把常量池当中的引用赋值给当前的引用
        System.out.println(str1==str2);//true
    }
}*/
    /*public static void main(String[] args) {
        String str2 =new String("hello").intern() ;
        String str1 = "hello";
        System.out.println(str1==str2);//true
    }
}*/
   /* public static void main(String[] args) {
        String str = "hello";//变量
        str = str + " world";
        str += "!!!";
        System.out.println(str);//hello world!!1
        for (int i = 0; i < 1_0000; i++) {
            //不敢这样拼接字符串   StringBuffer  StringBuilder
            str += 1;
        }
    }
}*/
   /* public static void main(String[] args) {
        String str = "Hello";
        //str = "hello";
        str = "h" + str.substring(1);
        System.out.println(str);//hello
    }
}*/
    class Person {
        private int age;
    }
    public class TestDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String str = "Hello";
        //利用反射--》自省的过程  反射
        Class cl = String.class;//拿到对象
        Field field = cl.getDeclaredField("value");//拿字段
        field.setAccessible(true);//私有的权限打开 修改字段
        char[] val = (char[]) field.get(str);//强转为数组
        val[0] = 'g';
        System.out.println(str);//gello
    }
}



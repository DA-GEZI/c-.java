import java.util.Scanner;

public class TestDemo {
    /* public static void main(String[] args) {
         String str = "ababcabcdabcde";
         boolean flg = str.contains("abc1");//查找是否相同
         boolean flg1 = str.contains("abc");
         System.out.println(flg);//false
         System.out.println(flg1);//true
         int index = str.indexOf("abc");//查找第一次的abc
         System.out.println(index);//返回的是下标2
         index = str.lastIndexOf("abc");
         System.out.println(index);//找最后面的第9个下标但还是从前面数
         index = str.lastIndexOf("abc",3);//从三号下标开始往后找abc为第2个下标//2
         System.out.println(index);
         boolean flg2 = str.startsWith("ab");//是否以ab开头的
         System.out.println(flg2);//true
         boolean flg3 = str.startsWith("abc",2);//是否以第2个下标为abc的开头
         System.out.println(flg3);//true
         flg = str.endsWith("bcde");//判断是否以bcde结尾
         System.out.println(flg);//true
     }
 }*/
    /*public static void main(String[] args) {
        String str = "abc de f";
        String[] strings = str.split(" ");//以空格拆分
        //[abc] [de] [f]
        for (String s : strings) {//数组类型：数组
            System.out.println(s);//abc
                                  //de
                                  //f
        }
    }
}*/
   /* public static void main(String[] args) {
        String str = "abc de f";
        String[] strings = str.split(" ",2);//以空格拆分为两组
        //[abc] [de] [f]
        for (String s : strings) {//数组类型：数组
            System.out.println(s);//abc
                                  //de f
        }
    }
}*/
    //不管什么符号分割前面都要加两个\\
    /*public static void main(String[] args) {
        String str = "192.168.1.1";
        String[] strings = str.split("\\.");
        for (String s : strings) {
            System.out.println(s);//192
                                  //168
                                  //1
                                  //1

        }
    }
}*/
   /* public static void main(String[] args) {
        String str = "192*168*1*1";
        String[] strings = str.split("\\*");
        for (String s : strings) {
            System.out.println(s);//192
                                  //168
                                  //1
                                  //1

        }
    }
}*/
    /*public static void main(String[] args) {
        String str = "192\\168\\1\\1";
        String[] strings = str.split("\\\\");
        for (String s : strings) {
            System.out.println(s);//192
            //168
            //1
            //1
        }
    }
}*/
    //分割多次
    /*public static void main(String[] args) {
        String str = "Java-split#bit";
        String[] strings = str.split(" |-|#");
        for (String s : strings) {
            System.out.println(s);//Java
                                  //split
                                  //bit
        }
    }
}*/
    //多次分割
    /*public static void main(String[] args) {
        String str = "name=zhangsan&age=18";
        String[] strings1 = str.split("&");//第一个分割
        //0号下标[name=zhangsan]  1号下标[age=18]
        //  0                  1
        for (String s1 : strings1) {//分割的数组
            String[] strings2 = s1.split("=");//第2次以=分割
            for (String s2 : strings2) {
                System.out.println(s2);//name
                                       //zhangsan
                                       //age
                                       //18
            }
        }
    }
}*/
    public static String func(String str) {
        String[] strings = str.split(" ");
        String ret = "";
        for(String s : strings) {
            ret += s;
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //ctr+d
        while (scan.hasNext()) {
            String str = scan.nextLine();
            //不能用next 遇到空格结束了
            String ret = func(str);
            System.out.println(ret);
        }
    }
}

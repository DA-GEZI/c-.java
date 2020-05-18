import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//public class TestMain {
    /*public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(0,"hello");
        list.add(1, "abc");
        System.out.println(list);    //[hello, abc]
        //addAll
        //1.实现了Collection接口
        //2.类型--》E的子类或者本身
        List<String> list1 = new ArrayList<>();
        list.add("java");
        list.add("bit");
        list.addAll(list1);
        System.out.println(list);//[hello, abc, java, bit]
        //remove删除遇到的第几个元素的
        String ret=list.remove(0);
        System.out.println(ret);//hello
        //删除
        list.remove("bit");
        System.out.println(list);//[abc, java]
        System.out.println("======get======");
        ret=list.get(0);
        System.out.println(ret);//abc
        //set设置已经有的位置，不可以越界，相当于更新
        System.out.println("======set======");
        ret=list.set(0,"haha");
        System.out.println(list);//[haha, java]
        //包含：返回值要么为true,要么为false
        System.out.println(list.contains("haha"));//true
        //查找元素的下标
        System.out.println(list.indexOf("haha"));//0
        System.out.println(list.indexOf("haha1"));//-1
        //从后往前查找第一个haha出现的位置
        System.out.println(list.lastIndexOf("haha"));//0
        list.add("haha");
        System.out.println(list.lastIndexOf("haha"));//2
        System.out.println("=======subList========");//haha java haha
        //左闭右开
        List<String>retList=list.subList(0,2);
        System.out.println(retList);   //[haha, java]
        retList.set(0,"gaoobo");
        System.out.println(retList);//[gaoobo, java]
        System.out.println(list);//[gaoobo, java, haha]
        //清除
        list.clear();
        System.out.println(list);//[]
    }
}*/
    //删除第一个字符串中出现的第二个字符串的字符
   /* public static List<Character> func(String str1, String str2) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (!str2.contains(ch + "")) {
                list.add(ch);
            }
        }
        return list;
    }
        public static void main(String[] args) {
        String str = "welcome to bit";
        String str2 = "come";
        List<Character> ret = func(str, str2);
        for (char ch : ret) {
            System.out.print(ch);
        }
        System.out.println();//wl t bit
    }
}*/



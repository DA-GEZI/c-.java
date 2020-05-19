import java.util.*;

/*public class TestDemo {
    public static void main(String[] args) {
        //List<Integer>List=new Stack<>();//集合当中的一个栈
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(20);
        System.out.println(stack.peek());//peek拿到栈顶元素，但是不删除  20
        //System.out.println(stack.pop());//20
        stack.pop();//pop出站并及时删除栈顶元素
        System.out.println(stack.peek());//拿到栈顶并且删除栈顶元素1
        System.out.println(stack.empty());//false
    }
}*/
/*class Student {
    public String name;
    public String classes;
    public double score;

    public Student(String name, String classes, double score) {
        this.name = name;
        this.classes = classes;
        this.score = score;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getClasses() {

        return classes;
    }

    public void setClasses(String classes) {

        this.classes = classes;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                ", score=" + score +
                '}';
    }
}
public  class TestDemo {
    public static void main(String[] args) {
        Student student = new Student("bit", "火箭2班", 17.6);
        Student student2 = new Student("wang", "火箭2班", 14.5);
        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student2);
        System.out.println(list);//[Student{name='bit', classes='火箭2班', score=17.6},
        //Student{name='wang', classes='火箭2班', score=14.5}]

    }
}*/
                // 使用Collections.sort对List进行排序
/*public class TestDemo{
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(2);
        System.out.println(list);//[10, 2]
       Collections.sort(list);//集合 Collections
        System.out.println(list);//[2, 10]1
    }
}*/




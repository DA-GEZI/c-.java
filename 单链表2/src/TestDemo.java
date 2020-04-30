public class TestDemo {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
       /* myLinkedList.addLast(77);
        myLinkedList.addLast(97);
        myLinkedList.addLast(65);
        myLinkedList.addLast(46);
        myLinkedList.addLast(92);
        myLinkedList.addLast(14);
        myLinkedList.display();
        System.out.println("删除开始");
        myLinkedList.remove(77);
        myLinkedList.display();*/
       /* myLinkedList.addLast(77);
        myLinkedList.addLast(77);
        myLinkedList.addLast(77);
        myLinkedList.addLast(46);
        myLinkedList.addLast(77);
        myLinkedList.addLast(77);
        myLinkedList.display();
        System.out.println("删除开始");
        myLinkedList.removeAllKey(77);
        myLinkedList.display();*/
        /*myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        myLinkedList.display();
       Node ret=myLinkedList.reverseList();
        myLinkedList.display2(ret);*/
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        myLinkedList.addLast(6);
        myLinkedList.display();
        System.out.println(myLinkedList.middleNode().data);
    }
}


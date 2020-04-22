public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList1 = new MyArrayList();
        //打印下标0-9之间的数组
       /* myArrayList1.add(0,10);
        myArrayList1.add(1,24);
        myArrayList1.add(2,34);
        myArrayList1.add(0,48);
        myArrayList1.display();
    }
}*/
        //按顺序打印0-9之间的元素
       /* for (int i = 0; i < 10; i++) {
            myArrayList1.add(i, i);
        }
        myArrayList1.display();
    }
}*/
        //扩大以后
        /*for (int i = 0; i < 10; i++) {
            myArrayList1.add(i, i);
        }
        myArrayList1.display();
       myArrayList1.add(10,111);
        myArrayList1.display();
        }
    }*/
        //寻找某个数
        for (int i = 0; i < 10; i++) {
            myArrayList1.add(i, i);
        }
        System.out.println("============");
        System.out.println(myArrayList1.search(5));
    }
}



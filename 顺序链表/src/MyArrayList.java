import java.util.Arrays;
public class MyArrayList {
    /*public int[] elem;//定义数组
    public int usedSize;//有效数据个数
    public static final int intCapacity = 10;//初始容量

    public MyArrayList() {
        this.elem = new int[intCapacity];
        this.usedSize = 0;
    }

    //打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    private boolean isFull() {

        return this.usedSize == this.elem.length;
    }
    private void checkPos(int pos) {
        if (pos < 0 || pos > this.usedSize) {
            throw new RuntimeException("pos位置不合法");
        }
    }
   //1.在pos位置新增元素
   public void add(int pos, int data) {
        checkPos(pos);
        if (isFull()) {
            this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);
        }
       ///移动数据
        for (int i = this.usedSize - 1; i >= pos; i--) {
            this.elem[i + 1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }
}*/
    /*public int[] elem;//定义数组
    public int usedSize;//有效数据个数
    public static final int intCapacity = 10;//初始容量

    public MyArrayList() {
        this.elem = new int[intCapacity];
        this.usedSize = 0;
    }

    //1.在pos位置新增元素
    public void add(int pos, int data) {
        checkPos(pos);
        if (isFull()) { this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);
        }
        //移动数据
        for (int i = this.usedSize - 1; i >= pos; i--) { this.elem[i + 1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }

    //打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    private boolean isFull() {

        return this.usedSize == this.elem.length;
    }

    private void checkPos(int pos) {
        if (pos < 0 || pos > this.usedSize) {
            throw new RuntimeException("pos位置不合法");
        }
    }

    //判断某个元素对应的位置
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }
    //查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }
}*/







import java.util.Arrays;

/*public class MyArrayList {
    public int[] elem;//定义数组
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
        //移动数据
        for (int i = this.usedSize - 1; i >= pos; i--) {
            this.elem[i + 1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }
    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }
    private boolean isEmpty(){
        return this.usedSize==0;
    }
    //获取pos位置的元素
    public int getPos(int pos){
        //判断顺序表是否为空。
        //return pos位置的数据就好了
        if(isEmpty()){
            throw new RuntimeException("顺序表为空!");//手动抛出异常
        }
        //pos是否合法
       checkPos(pos);
        return this.elem[pos];
    }
    //获取顺序长度
    public int size(){return this.usedSize;}
    //删除第一次出现的关键字toRemove
    public void remove(int toRemove){
        int index=search(toRemove);
        if(index==-1){
            System.out.println("没有要产出的数字！");
            return;
        }
        for(int i=index;i<this.usedSize-1;i++){
            this.elem[i]=this.elem[i+1];
        }
        this.usedSize--;
    }
    //清空顺序表
    public void clear(){
        this.usedSize=0;
    }
}*/




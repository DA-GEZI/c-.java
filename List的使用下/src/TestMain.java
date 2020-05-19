import java.util.ArrayList;
import java.util.List;

/*public class TestMain {
    //杨辉三角[i-1,j]+[i-1,j-1]=[i,j]
    public List<List<Integer>>generate(int numRows){
        List<List<Integer>> ret=new ArrayList<>();
                if(numRows==0){
                    return ret;
                }
        List<Integer> oneRow=new ArrayList<>();
                ret.add(new oneRow);//先添加了一个List
                ret.get(0).add(1);//第一行的元素，添加了0号下标添加了一个1
        //直接从第2行进行运算
        for(int i=1;i<numRows;i++){
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);//当前行的第一个元素
            List<Integer> prevRow=ret.get(i-1);//代表前一行
            for(int j=1;j<i;j++){
                //[i-1,j]+[i-1,j-1]=[i,j]
                int x= prevRow.get(j);
                int y=prevRow.get(j-1);
                curRow.add(x+y);
            }
            //最后一个元素
            curRow.add(1);
            ret.add(curRow);
        }
        return ret;
    }
    public static void main(String[] args) {

    }
}*/

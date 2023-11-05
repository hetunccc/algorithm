package array;

public class DynamicArray {
    private int size = 0; //逻辑大小
    private int capacity = 0; //容量
    private int[] array = new int[capacity];

    public void addLast(int element){
//
        add(size , element);
    }

    public void add(int index , int element){
        if (index >= 0 && index < size ){
            System.arraycopy(array , index , array , index + 1 , size - index);
        }
        array[size] = element;
        size++;
    }

    //删除代码
    public int remove(int index){
        int removed = array[index];
        System.arraycopy(array , index + 1  , array , index , size - index - 1);
        size--;
        return removed;
    }
}

import java.util.Arrays;

public class Array {
    int[] array;
    int count  = 0;
    public Array(int length){
        array = new int[length];
    }
    public void insert(int item){
        if(array.length == count){
            int[] newarray = new int[count*2];
            for (int i = 0; i< count ; i++){
                newarray[i] = array[i];
            }
            array = newarray;
        }
        array[count] = item;
        count++;
    }

    public void removeAt(int index){
        if (index<0 || index>= count){
         throw new IllegalArgumentException("Index is not valid!");
        }

        /*int[] newarray = new int[count-1];
        for(int i = 0,k = 0; i< count ; i++){
            if(i != index){
                newarray[k] = array[i];
                k++;
            };
        }
        array =  newarray;
        count--;*/
        for (int i = index; i<count ; i++)
            array[i] = array[i+1];
        count--;
    }

    public void print(){
        for (int i = 0 ; i < count;i++){
            System.out.println(array[i]);
        }
    }

    public int indexOf(int item){
        for (int i=0 ; i<count ; i++)
            if (item == array[i]) return i;
        return  -1;
    }

    public int max(){
        int max = array[0];
        for (int i = 0 ; i< count ; i++){
            if (max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    public void reverse(){
        int start = 0;
        int end = count - 1;
        while(start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public void insertAt(int item,int index){
        for (int i= 0; i< count; i++){
            if (i == index){
                array[i] = item;
            }
        }
    }
    public void printf(){
        System.out.println(Arrays.toString(array));
    }

}

package main.cl.panarch;


import java.util.Arrays;
import java.util.NoSuchElementException;

public class MinMaxHeap {

    private int[] heapy;
    private int size;

    public MinMaxHeap(int capacity){
        this.heapy = new int[capacity];
    }

    //TODO: addToHeap / heapifyUp


    public void ensureExtraCapacity(){
        if(size == (heapy.length -1)){
            heapy = Arrays.copyOf(heapy,heapy.length*2);
        }
    }

    public void addToHeap(int value, int size){
        //heapy[size
    }

    public int getLeftChildIndex(int index){ return (index*2)+1;   }

    public int getRightChildIndex(int index){  return (index*2) +2;    }

    public int getParentChildIndex(int index){ return (index -1)/2;    }

    public boolean hasLeftChild(int index){return getLeftChildIndex(index) < size;}

    public boolean hasRightChild(int index){return getRightChildIndex(index) < size;}

    public boolean hasParent(int index){ return getParentChildIndex(index) >= 0;}

    public int peek(){return heapy[0];}

    public int poll() {
        if(size > 0 ){
            int minElement = heapy[0];
            heapy[0] = heapy[size -1];
            size--;
            heapifyDown();
            return minElement;
        }
        else throw new NoSuchElementException();

    }

    private void heapifyDown() {
        int index = 0;
        while(hasLeftChild(index) ){
            int minChildIndex = getLeftChildIndex(index);
            if ( heapy[minChildIndex] > heapy[getRightChildIndex(index)]) {
                minChildIndex = getRightChildIndex(index);
            }
            if(heapy[minChildIndex] > heapy[index]) {return;}
            swap(index, minChildIndex);
            index = minChildIndex;
        }


    }

    public void swap(int index1, int index2){
        int aux = heapy[index1];
        heapy[index1] = heapy[index2];
        heapy[2] = aux;
    }

}

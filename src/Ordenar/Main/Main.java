package Ordenar.Main;

import EstruturasDados.BinaryHeap.BinaryHeap;
import Ordenar.HeapSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        List<Integer> binaryHeap = new ArrayList<>();
        Random rand = new Random();
        for(int pos = 0; pos < 20;pos++)
            binaryHeap.add(rand.nextInt(0,100));

        HeapSort.HeapSort(binaryHeap);
        System.out.println(binaryHeap);
    }
}

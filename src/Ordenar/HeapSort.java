package Ordenar;

import java.util.List;

public class HeapSort {
    public static <T extends Comparable<T>> void HeapSort(List<T> list) {
        for(int posList = list.size()/2 - 1;posList >= 0;posList--){
            heapify(list, list.size(), posList);
        }
        for(int posList = list.size() - 1; posList > 0; posList--){
            T content = list.get(0);
            list.set(0, list.get(posList));
            list.set(posList, content);

            heapify(list, posList , 0);
        }
    }

    private static <T extends Comparable<T>> void heapify(List<T> list, int size, int index){
        int parent = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if(left < size && isBigger(list, left, parent)){
            parent = left;
        }
        if(right < size && isBigger(list, right, parent)){
            parent = right;
        }
        if(parent != index){
            T temp_content = list.get(index);
            list.set(index, list.get(parent));
            list.set(parent, temp_content);

            heapify(list, size, parent);
        }
    }

    private static <T extends Comparable<T>> boolean isBigger(List<T>list, int child, int parent){
        return list.get(child).compareTo(list.get(parent)) > 0;
    }
}

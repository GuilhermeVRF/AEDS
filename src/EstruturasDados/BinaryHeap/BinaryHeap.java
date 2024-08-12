package EstruturasDados.BinaryHeap;

import java.util.ArrayList;
import java.util.List;

public class BinaryHeap<T extends Comparable<T>> {
    private List<T> priorityQueue;

    public BinaryHeap(){
        this.priorityQueue = new ArrayList<>();
    }

    public void insert(T content){
        this.priorityQueue.add(content);
        int child = this.priorityQueue.size() - 1;
        int parent = (child + 1)/2;

        while(this.isBigger(child, parent)){
            T child_content = this.priorityQueue.get(child);
            this.priorityQueue.set(child, this.priorityQueue.get(parent));
            this.priorityQueue.set(parent, child_content);
            child = parent;
            parent = (child + 1)/2;
        }
    }

    private boolean isBigger(int child, int parent){
        return parent >= 1 && this.priorityQueue.get(child).compareTo(this.priorityQueue.get(parent)) > 0;
    }
}

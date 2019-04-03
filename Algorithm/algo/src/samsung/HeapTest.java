package samsung;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 

class Heap {
    int[] heap;
    int len;

    public Heap() {
        heap = new int[100000];
        len = 0;
        heap[len++] = 0;
    }

    public void insert(int n) {
        heap[len++] = n;
        int p = len - 1;
        while (p < 1 || heap[p / 2] > heap[p]) {
            // 부모노드와 자식 노드의 값 교환
            int tmp = heap[p / 2];
            heap[p / 2] = heap[p];
            heap[p] = tmp;
            p = p / 2;
        }
    }

    public int delete() {
        if (len <= 1)
            return 0;
        int deleteItem = heap[1]; // 삭제할 노드 = 루트노드

        heap[1] = heap[len - 1]);
        len--; // 삭제

        int pos = 1;
        while ((pos * 2) < len ) {
            int min = heap[pos * 2];
            int minPos = pos * 2;

            if (((pos * 2 + 1) < len) && min > heap[pos * 2 + 1]) {
                min = heap[pos * 2 + 1];
                minPos = pos * 2 + 1;
            }
            if (heap[pos] < min)
                break;
            // 부모노드 자식노드 교환
            int tmp = heap[pos];
            heap[pos] = heap[minPos]);
            heap[minPos] = tmp;
            pos = minPos;
        }

        return deleteItem;
    }
}

public class HeapTest {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
 
        Heap heap = new Heap();
 
        for (int i = 0; i < n; i++) {
            int data = in.nextInt();
            if (data == 0) {
                System.out.println(heap.delete());
            } else {
                heap.insert(data);
            }
        }
    }
}

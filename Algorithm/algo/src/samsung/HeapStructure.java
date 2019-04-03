package samsung;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 

// 왼쪽자식 = 부모 * 2
// 오르쪽자식 = 부모 * 2 + 1
// 부모 = 자식 / 2

//9
//0
//12345678
//1
//2
//0
//0
//0
//0
//32

//12
//1
//6
//5
//4
//3
//2
//0
//0
//0
//0
//0
//0


// 최소힙을 구현할 예정
class Heap {
    int[] heap;
    int len;

    public Heap() {
    	heap = new int[100000];
    	heap[len++] = 0; // 첫번째는 쓰지 않는다.
    }

    public void insert(int n) {
        heap[len++] = n;
        int p = len - 1; // p는 현재 추가된 위치
        
        // 새로들어온애가 부모보다 더 작다면 바꾼다. 왜냐면 최소힙을 구현하려고
        // 새로들어온 애를 부모로 바꾼다.
        while (p < 1 || heap[p / 2] > heap[p]) {
            // 부모노드와 자식 노드의 값 교환
            int tmp = heap[p / 2];
            heap[p / 2] = heap[p];
            heap[p] = tmp;
            p = p / 2; // 새로들어 온 애는 부모가 될 것이므로 p를 부모로 초기화
        }
    }

    public int delete() {
        if (len <= 1)
            return 0;
        int deleteItem = heap[1]; // 삭제할 노드 = 루트노드

        // 일단 처음에 제일 끝애 있는애를 부모로 대체한다
        // 그 이후 heapify 할 것임!
        heap[1] = heap[len - 1];
//        heap.remove(len - 1);
        len--; // 하나를 삭제한다.

        int pos = 1;
        
        // heapify한다
        // 왼쪽 자식이 존재할때 까지 계속 반복!
        while ((pos * 2) < len) {
        	// 더 작은 애를 먼저 왼쪽자식이라고 가정
            int min = heap[pos * 2];
            int minPos = pos * 2;

            
            // 오른쪽 자식이 존재하고, 왼쪽 자식이 오른쪽자식보다 큰경우
            // 작은애를 오른쪽 자식이라고 해야한다.
            if (((pos * 2 + 1) < len) && min > heap[pos * 2 + 1]) {
                min = heap[pos * 2 + 1];
                minPos = pos * 2 + 1;
            }
            
            // 이 과정을 거치면
            // pos앤 오른쪽 혹은 왼쪽 자식중 작은애의 번지가 저장될 것임
            if (heap[pos] < min)
                break;
            // 부모노드 자식노드 교환
            int tmp = heap[pos];
            heap[pos] = heap[minPos];
            heap[minPos] = tmp;
            pos = minPos;
        }
        return deleteItem;
    }
}

public class HeapStructure {
 
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
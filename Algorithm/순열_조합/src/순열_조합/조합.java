package 순열_조합;

public class 조합 {
    public static int[] arr = {1,2,3,4,5};
    public static int[] res = new int[3];
    
    public static void main(String[] args) {
       /* recur(0);*/
        combi(0, 0);
    }
    
/*    public static void recur(int cnt, int start) {
        if(cnt == res.length) {
            for (int i = 0; i < res.length; i++) {
                System.out.print(arr[res[i]] + " ");
            }
            System.out.println();
        } else {
            for (int i = start; i < arr.length; i++) {
                res[cnt] = i;
                recur(cnt+1, i+1);
            }
        }
    }*/
    
    
    public static void recur(int step) {
    	if(step == res.length) {
    		for(int i = 0; i < res.length; i++) {
    			System.out.print(arr[res[i]] + " ");
    		}
    		System.out.println();
    	}
    	else {
    		for(int i = 0; i < arr.length; i++) {
    			res[step] = i;
    			recur(step+1);
    		}
    	}
    }
    
    public static void combi(int step, int start) {
    	if(step == res.length) {
    		for(int i = 0; i < res.length; i++) {
    			System.out.print(arr[res[i]] + " ");
    		}
    		System.out.println();
    	}
    	else {
    		for(int i = start ; i < arr.length; i++) {
    			res[step] = i;
    			combi(step+1, i + 1);
    		}
    	}
    }
}
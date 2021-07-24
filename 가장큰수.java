import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"[,] ");
        PriorityQueue<Integer> tenUnderQueue = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> tenOverQueue = new PriorityQueue<>(Collections.reverseOrder());
        
   
        int tenUnder=0;
        int tenOver=0;
        String str1=null; //만든 수를 담음 
        String str2;
        
        
        
        while(st.hasMoreTokens()) {
        	
        		str2 = st.nextToken();
        		
        		if(Integer.parseInt(str2)>=10) {
        			
        			tenOver++;
        			tenOverQueue.add(Integer.parseInt(str2));
        		}
        		
        		else {
        			tenUnder++;
        			tenUnderQueue.add(Integer.parseInt(str2));
        			
        		}
        		
        		
        		
        		
        	}//while문 끝 숫자만 따로 분리 작업.
        
        
        
        Integer[] tenUnderArr = new Integer[tenUnder];
		
		 for(int i=0;i<tenUnder;i++) { 
			 
			 tenUnderArr[i] = tenUnderQueue.poll();
			 
		}
		 
        
        
        Integer[] tenOverArr  = new Integer[tenOver];
        
        for(int i=0;i<tenOver;i++) { 
			 
			 tenOverArr[i] = tenOverQueue.poll();
			 
		}
        
       
        
		int max=0;
        
        String number="";
        for(int i=0;i<tenUnder;i++) {
        	number+=tenUnderArr[i];
        }
        
        for(int i=0;i<tenOver;i++) {
        	number+=tenOverArr[i];
        }
        
      
        
        
       
		
		/*
		 * int max=0;
		 * 
		 * for(int i=0;i<count;i++) { number=""; number+=list.get(i); for(int
		 * j=0;j<count;j++) {
		 * 
		 * if(j==i) { continue; }
		 * 
		 * number+=list.get(j); }
		 * 
		 * 
		 * if(max<Integer.parseInt(number)) { max=Integer.parseInt(number); }
		 * 
		 * 
		 * number=""; number+=list.get(i);
		 * 
		 * for(int j=count-1;j>=0;j--) {
		 * 
		 * if(j==i) { continue; }
		 * 
		 * number+=list.get(j); }
		 * 
		 * if(max<Integer.parseInt(number)) { max=Integer.parseInt(number); }
		 * 
		 * 
		 * } //수를 만듬
		 */		 
		
        System.out.println(number);
        
		
       
    }
}

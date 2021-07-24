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
        
       
        
		//int max=0;
        
        String number="";
        int j=0;
        for(int i=0;i<tenUnder;i++) {
        	
        	if(tenOverArr[j]/10 == tenUnderArr[i]) {
        		
        		if(j<tenOver) {
        			
	        		if((tenOverArr[j]%10)>tenUnderArr[i]) {
	        			
	        			number+=tenOverArr[j];
	        			j++;
	        			i--;
	        			continue;
	        		}
	        		
	        		else {
	            		number+=tenUnderArr[i];
	            		continue;
	            	}
        		}
        		
        	}//십의 자리 수가 같고 일의 자리수가 0이상이라면 십의 자리수를 넣는게 더 큰숫자임
        	
        	else {
        		number+=tenUnderArr[i];
        	}
        	
        	
        }
        
       while(j<tenOver) {
    	   
    	   number+=tenOverArr[j];
    	   j++;
    	   
       }
        

        System.out.println(number);
        
		
       
    }
}

package Week6.day1;

import java.util.Arrays;
import java.util.Stack;

public class Minleft_Minright {
    public static void main(String [] args){
        int [] n={2,1,5,6,3,2};
        Stack<Integer> st=new Stack<>();
        int left[]=new int[n.length];
        for(int i=0;i<=n.length;i++){
            int curr=(i==n.length)?0:n[i];
            while(!st.isEmpty() && curr<n[st.peek()] ){
                st.pop();
                left[i-1]=st.isEmpty()?-1:st.peek();
            }
            st.push(i);
        }
        System.out.print(Arrays.toString(left));
    }
}

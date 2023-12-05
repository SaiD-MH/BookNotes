package ch4;

import java.util.Deque;

public class ReverseProblem {
    
    private String input, Output;

    public ReverseProblem(String s) {
        input = s;
        Output="";
     
    }
    
    public String Solve() {
        
        int sz = input.length();
        StackClass st = new StackClass(sz);
        
        for (int i = 0; i < sz; i++) {
            st.Push(input.charAt(i));
            
        }
        
        while(st.isEmpty() == false){
            Output = Output + st.Pop();
        }
        
        
        return Output;
        
    }
    
}

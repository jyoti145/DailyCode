//Q: Find kth element of spiral matrix
//solution
class Solution
{
   
    int findK(int A[][], int n, int m, int k)
    {
             if(k > n*m){
            return -1;
        }
        
 
    int count = 0;
    
    //rs - row start, cs - column start, re = row end, ce = column end
    int rs = 0, cs = 0, re = n-1, ce = m-1;
       
  
    while(count<n*m){
      
        for(int i = cs; i<=ce; i++){
            count++;
            if(count == k){
                return A[rs][i];
            }
        }
        rs++;
        
       
        for(int i = rs; i<=re; i++){
            count++;
            if(count == k){
                return A[i][ce];
            }
        }
        ce--;
        
       
        for(int i = ce; i>=cs; i--){
            count++;
            if(count == k){
                return A[re][i];
            }
        }
        re--;
           
       
        for(int i = re; i>=rs; i--){
            count++;
            if(count == k){
                return A[i][cs];
            }
        }
        cs++;
    }
    
    return -1;
    }
}
 

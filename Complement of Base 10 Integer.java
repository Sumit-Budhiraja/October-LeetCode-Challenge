class Solution {
     public int bitwiseComplement(int N) {
        if(N==0)
            return 1;
        int count = 0;
        int oldnum=  N;
        
        //count the num of digits in binary form for the given number
        while(N > 0){
            N >>=1;
            count++;
        }
    
        // generate a number with all digits as 1
        int num =0;
        while(count>0){
            num = num <<1;
            num = num|1;
             count--;
        }
    // XOR will reverse the bits (e.g. 1010 ^ 1111 = 0101)
        return num ^ oldnum;
    }
}
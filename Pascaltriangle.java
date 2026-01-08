import java.util.*;

class PascalTriangle {
    private int nCr(int n , int r){
        long val = 1;
        for(int i = 0;i<r;i++){
            val = val * (n-i)/i+1;
        }
        return (int)val;
    }
    public List<List<Integer>> generate(int n1) {
        List<List<Integer>> ans = new ArrayList<>();
    

        for(int i=0;i<n1;i++){
            List<Integer> tempList = new ArrayList<>();
            for( int j = 0; j<=n1;j++){
                tempList.add(nCr(i,j));
            }
            ans.add(tempList);
        }
        return ans;
    }
}
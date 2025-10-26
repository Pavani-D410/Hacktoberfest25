class Solution {
    public void rotate(int[][] m) {
        int i,j;
        int r=m.length;
        int c=m[0].length;
        for(i=0;i<r;i++)
        {
            for(j=i;j<c;j++)
            {
                int temp=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=temp;
            }
        }
        for(i=0;i<r;i++){
        int l=0;
        int r1=c-1;
        while(l<r1){
            int temp=m[i][l];
            m[i][l]=m[i][r1];
            m[i][r1]=temp;
            l++;
            r1--;
        }
    }
}
}

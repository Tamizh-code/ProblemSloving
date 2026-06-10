package June_July_Placement;

public class Common_Longest_Subsequence {
    public static void main(String[] args) {
//        String s1="abbcd";
//        String s2="aec";
        String s1="aggtab";
        String s2="gxtxayb";
        int [][] dp=new int[s2.length()+1][s1.length()+1];//DP CREATION
        //DP LOGIC
        for(int i=0;i<s2.length();i++) {
            for (int j = 0; j < s1.length(); j++) {
//                if (s1.substring(0, i + 1).indexOf(s2.charAt(j)) != -1) {
                if (s2.charAt(i)==s1.charAt(j)) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                } else {
                    dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        }
        //OUTPUT PRINTING
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]);
            }
            System.out.println();
        }
    }
}

public class reverseMultiplierTable2 {
    public static void main(String[] args) {
        for(int i=9;i>=1;i--) {
            for(int j=1,k=10-i;j<=i;j++,k++) {
                System.out.print(j+"×"+k+"="+k*j+"\t");// \t 跳到下一个TAB位置
            }
            System.out.println();
        }
    }
}

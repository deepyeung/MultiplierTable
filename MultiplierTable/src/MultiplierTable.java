/*
public class MultiplierTable {
    public static void main (String[] args){
        for(int i=1; i<=9; i++) {
            for(int k=1; k<=i; k++) {
                System.out.println(i+"x"+k+"="+i*k+"\t");
            }
            System.out.println();
        }
    }
}

 */


public class MultiplierTable {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j+"×"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}


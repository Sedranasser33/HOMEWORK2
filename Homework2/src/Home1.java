import java.util.Arrays;

public class Home1 {
    public static void main(String[] args) {
        int a1[]={1,2,3,4};
        System.out.println(Arrays.toString(a1));
        copy(a1);
        System.out.println("copy element"+Arrays.toString(a1));
    }
        public static void copy( int []arr1){
        int coparr2[]=new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            coparr2[i]=arr1[i];
            coparr2[0]++;
        }
       // System.out.println("arr1 element");
       // for (int i = 0; i <arr1.length ; i++) {
           // System.out.println(arr1[i]);
       // }System.out.println("cop arr2 element");
     //   for (int i = 0; i < coparr2.length; i++) {
           // System.out.print(coparr2[i]);

        }
}

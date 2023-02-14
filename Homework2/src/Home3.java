import java.util.Arrays;

public class Home3 {
    public static void main(String[] args) {
        int arr1[]={4,5,6};
        int arr2[]={1,2,3};
        int length=arr1.length+arr2.length;
        int merarr[]=new int[length];
        int po=0;
        for (int element:arr1){
            merarr[po]=element;
        po++;}
        for (int element:arr2){
            merarr[po]=element;
            po++;
        }
        System.out.println(Arrays.toString(merarr));

    }
}

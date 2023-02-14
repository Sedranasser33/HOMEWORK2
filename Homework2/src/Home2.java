public class Home2 {
    public static void main(String[] args) {
        char []arr1={'f','a','t','i','m','a'};
        char arr2[]=new char[6];
        System.arraycopy(arr1,0,arr2,0,6);
        System.out.println("Welcome \n"+String.valueOf(arr2));
    }
}

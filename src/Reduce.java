public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int i = 0;
        while(n != 1){
            if(n % 2 == 0){
                n = n/2;
            }
            else{
               n = n - 1;
            }
            i = i + 1;
        }
        System.out.println(i);

    }
}

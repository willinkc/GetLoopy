public class Task5 {
    public static void main(String [] args){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j+=1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
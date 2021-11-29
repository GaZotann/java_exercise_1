import java.util.Scanner;

public class Launcher {
    public static void main(String[] args){
        System.out.println("Je suis Launcher");

        Scanner KeybordInput = new Scanner(System.in);

        String command = KeybordInput.nextLine();
        while (!command.equals("quit") && !command.equals("fibo")){
            System.out.println("Unknow command");
            command = KeybordInput.nextLine();
        }
        if(command.equals("fibo")){
            System.out.println("Tapez un nombre:");
            int number = KeybordInput.nextInt();
            int fibo = 0;
            for(int i=0; i<=number; i++){
                fibo += i;
            }
            System.out.println("voici la suite de Fibonacci est: " + fibo);
        }
    }
}

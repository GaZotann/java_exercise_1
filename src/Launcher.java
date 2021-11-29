import java.util.Scanner;

public class Launcher {
    public static void main(String[] args){
        System.out.println("Je suis Launcher");

        Scanner KeybordInput = new Scanner(System.in);

        String command = KeybordInput.nextLine();
        while (!command.equals("quit")){
            System.out.println("Unknow command");
            command = KeybordInput.nextLine();
        }
    }
}

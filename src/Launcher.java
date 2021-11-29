import java.util.Scanner;

public class Launcher {
    public static void main(String[] args){
        System.out.println("Je suis Launcher");

        Scanner KeybordInput = new Scanner(System.in);

        String command = KeybordInput.nextLine();
        if(command.equals("quit")){
            return;
        }
        else{
            System.out.println("Unknow command");
            return;
        }
    }
}

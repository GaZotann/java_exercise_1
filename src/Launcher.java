import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.*;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Launcher {
    public static void main(String[] args){
        class frequence{
            public int count;
            public String world;
        }
        System.out.println("Je suis Launcher");

        Scanner KeybordInput = new Scanner(System.in);

        String command = KeybordInput.nextLine();
        while (!command.equals("quit") && !command.equals("fibo") && !command.equals("freq")){
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
        if(command.equals("freq")){
            System.out.println("Entrer un fichier: ");
            command = KeybordInput.nextLine();
            Path fichier = Paths.get(command);
            try {
                String test = Files.readString(fichier);
                test = test.toLowerCase();
                test = test.replaceAll("\\p{Punct}", "");
                test = test.replaceAll("( +)"," ").trim();
                Scanner scanner = new Scanner(test);
                while(scanner.hasNextLine()) {
                    test = scanner.nextLine();
                    String[] tab = test.split(" ");
                    Map<String, Long> result = Arrays.stream(tab).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
                    Map<String, Long> finalMap = new LinkedHashMap<>();
                    result.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).forEachOrdered(e->finalMap.put(e.getKey(), e.getValue()));
                    int size = finalMap.size();
                    List<String> aled = new ArrayList(finalMap.keySet());
                    for(int i =0; i<size; i++){
                        if(i<3){
                            System.out.print(aled.get(i) + " ");
                        }
                    }
                    System.out.print("\n");

                }

            } catch (IOException e) {
                System.out.println("Fichier inconnu");
            }
        }
    }
}

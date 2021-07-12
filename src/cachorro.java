import java.util.Scanner;

public class cachorro {

    public static void main(String[] args) {
        System.out.println("informe idade do seu cachorro: ");
            Scanner in = new Scanner(System.in);
            
            int idadeCachorro = in.nextInt(); 
                idadeCachorro = idadeCachorro * 7;
                
        System.out.println("O seu cachorro tem "+ idadeCachorro+ "Anos");
        
    }
}
import java.util.Arraylist;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser =new Scanner(System.in)
        ArrayList<String> listacompras= new Arraylist<>();
        int opcaolista = 0;
        
        do{
        System.out.println("""
                escolha a opçãodesejada
                1 -Criar uma nova lista de compras
                2- Sair
                """);
                int opcaolista = inUser.nextInt();
                inUser.nextLine();

                switch (opcaolista) {
                    case 1 -> System.out.println("Lista criada com sucesso");
                    case 2 -> System.out.println("Obrigado por usar o nosso sistema");
                                        
                    
                    default -> System.out.println("opcao Invalida");
                    
                }
        }while(opcaolista !=2);    
    }
}

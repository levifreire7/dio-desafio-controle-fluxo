import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
		        		
		try {		
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

			contar(parametroUm, parametroDois);		
		}catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}catch(InputMismatchException exception){
            System.out.println("Atenção! Digite um número inteiro.");
        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
		
		int contagem = parametroDois - parametroUm;
		
        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
	}
}

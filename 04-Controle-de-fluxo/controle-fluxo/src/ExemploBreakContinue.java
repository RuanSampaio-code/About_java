// class ExemploBreakContinue.java
public class ExemploBreakContinue {
	public static void main(String[] args) {
	System.out.println("Exemplo com break");
	for(int numero = 1; numero <=5; numero ++){
		if(numero==3)
			break;
		
		System.out.println(numero);
		
	}
	//Qual a saída no console ? vai imprimir até 3

    System.out.println("Exemplo com continue");
    for(int numero = 1; numero <=5; numero ++){
		if(numero==3)
			continue;
		
		System.out.println(numero);
		
	}
    }
}
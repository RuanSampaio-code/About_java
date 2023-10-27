public class ExemploFor {
    public static void main(String[] args) {
		//for simples
        for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
			System.out.println(carneirinhos + " - Carneirinho(s)");
		}

        //for com array
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

        //for each
        String alunos2 [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
        
            //Forma abreviada
        for(String aluno : alunos2) {
            System.out.println(aluno);
        }
        
       

	}
}

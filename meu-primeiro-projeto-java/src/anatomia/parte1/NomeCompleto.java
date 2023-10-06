package anatomia.parte1;

public class NomeCompleto {
    public static void main(String[] args) throws Exception {
       
        String primeiroNome = "Ruan";
        String segundoNome = "sampaio";
      
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);  
    }

    public static String nomeCompleto ( String primeiroNome, String segundoNome){
        return "Resultado é " + primeiroNome.concat(" ").concat(segundoNome);
    }
}

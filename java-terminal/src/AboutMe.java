public class AboutMe {
    public static void main(String[] args) {
        //os argumentos começam com indice 0
        //Foi feito para testar entrada e saida de dados, com "args" e "launch.json".
        
        
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
    


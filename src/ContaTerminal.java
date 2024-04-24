public class ContaTerminal {
    public static void main(String[] args) throws Exception {

System.out.println("Olá qual seu nome?");
String nome = System.console().readLine();

System.out.println("E qual sua agencia?");
String agencia = System.console().readLine();

System.out.println("Qual nuemro da sua conta?");
String numero = System.console().readLine();

System.out.println("Qual seu saldo?");
String saldo = System.console().readLine();



System.out.println("Olá "+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+", conta "+numero+" e seu saldo "+saldo+ " já está disponível para saque!");  

}
}

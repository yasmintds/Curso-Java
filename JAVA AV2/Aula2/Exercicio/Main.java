import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o nome do Funcionario:");
    String nome = scanner.nextLine();

    System.out.println("Digite o idade do Funcionario:");
    int idade = scanner.nextInt();

    System.out.println("Digite o salario do Funcionario:");
    int salario = scanner.nextInt();

    Funcionario funcionario = new Funcionario();
    funcionario.setNome(nome);
    funcionario.setIdade(idade);
    funcionario.setSalario(salario);

    System.out.println("Nome: " + funcionario.getNome());
    System.out.println("Idade: " + funcionario.getIdade());
    System.out.println("Salario: " + funcionario.getSalario());

    scanner.close();

  }

}
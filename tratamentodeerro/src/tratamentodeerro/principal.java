package tratamentodeerro;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Arrays;
import java.time.LocalDateTime;
public class principal {
	public static void main(String[] args) {
		while (true) {
			try {

				Scanner input = new Scanner(System.in);
				System.out.println("Digite um numero");
				int num = input.nextInt();

				break;
			} catch (InputMismatchException e) {
				System.err.println("Você digitou um numero errado");
				System.out.println(e.getMessage());
			}
		}
		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.println("Digite seu nome");
			String nome = input.nextLine().trim().toUpperCase();
			// String nome= input.nextLine().trim().toLowerCase(); minusculo
			if (nome.isEmpty() == false) {
				if (nome.matches("[A-Za-z ]+")) {
					System.out.println(nome);
					break;
				} else {
					System.out.println("Digite somente letras");
				}
			} else {
				System.out.println("Não pode ficar vazio");
			}
		}
		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.println("Digite seu email");
			String email = input.nextLine().trim();
			if (email.isEmpty() == false) {
				if (email.matches("[a-zA-Z0-9._%]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
					System.out.println(email);
					break;
				} else {
					System.out.println("Email invalido");
				}
			} else {
				System.out.println("Não pode ficar vazio!");
			}
		}
		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.println("Digite seu Cep");
			String cep = input.nextLine().trim();
			if (cep.isEmpty() == false) {
				if (cep.length() == 10) {
					System.out.println("cep ivalido");
					break;
				}
			} else {
				System.out.println("Não pode ficar vazio");
			}

		}
		while(true) {
			List<String> pagamento =Arrays.asList("pix","dinheiro","credito","debito","boleto");
			Scanner input = new Scanner(System.in);
			System.out.println("Digite a forma de pagamento");
			String formaDePagamento  = input.nextLine().trim();
			if (formaDePagamento.isEmpty() == false) {
				if (pagamento.contains(formaDePagamento)) {
					System.out.println(formaDePagamento);
					break;
		}else {
			System.out.println("Forma de pagamento inexistente!");
		}
	}else {
		System.out.println("Não pode ficar vazio");
	}
		}
		while(true) {
			Scanner input = new Scanner(System.in);
			System.out.println("Digite sua idade");
			int idade =input.nextInt();
			if(idade>0 && idade<120) {
				System.out.println(idade);
				break;
				
			}else {
				System.out.println("Idade invalida");
				
			}
		
		}
		LocalDateTime dataehora = LocalDateTime.now();
		System.out.println(dataehora);
		while(true) {
			Scanner input = new Scanner(System.in);
			System.out.println("Digite sua CPF");
			String cpf = input.nextLine();
			validarcpf val= new validarcpf();
			if(val.isCPF(cpf)) {
				System.out.println(cpf);
				break;
				
			}else {
				System.out.println("cpf invalido!");
			}
			
		}
	}
}

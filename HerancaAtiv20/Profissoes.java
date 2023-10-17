package HerancaAtiv20;

public class Profissoes {

		public static void main(String[] args) {

		Funcionario funcionario = new Funcionario("Romario", "77", 500000.00, "(999) 3244-2832", "Rua Josevaldo da Silva", "22/04/1972");

		System.out.println("Funcionario");
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Matricula: " + funcionario.getMatricula());
		System.out.println("Salario: " + funcionario.getSalario());
		System.out.println("Telefone: " + funcionario.getTelefone());
		System.out.println("Endereço: " + funcionario.getEndereco());
		System.out.println("Data de nascimento: " + funcionario.getDataNascimento());

		Administrador administrador = new Administrador("Pedro", "78", 200000.00, "(998) 3244-6788", "Rua Ruan Miranda", "29/02/1985",2 );

		System.out.println("\nAdministrador");
		System.out.println("Nome: " + administrador.getNome());
		System.out.println("Matricula: " + administrador.getMatricula());
		System.out.println("Salario: " + administrador.getSalario());
		System.out.println("Telefone: " + administrador.getTelefone());
		System.out.println("Endereço: " + administrador.getEndereco());
		System.out.println("Data de nascimento: " + administrador.getDataNascimento());
		System.out.println("Cra: " + administrador.getCra());

		Engenheiro engenheiro = new Engenheiro("Garsa", "79", 100000.00, "(988) 7332-9726", "Rua Leonel Duque", "14/08/1974", 558);

		System.out.println("\nEngenheiro");
		System.out.println("Nome: " + engenheiro.getNome());
		System.out.println("Matricula: " + engenheiro.getMatricula());
		System.out.println("Salario: " + engenheiro.getSalario());
		System.out.println("Telefone: " + engenheiro.getTelefone());
		System.out.println("Endereço: " + engenheiro.getEndereco());
		System.out.println("Data de nascimento: " + engenheiro.getDataNascimento());
		System.out.println("NumCra: " + engenheiro.getNumCra());

		Medico medico = new Medico("Gerundio", "80", 800000.00, "(999) 3567-2474", "Rua Cristiano Ruim", "05/02/1987", 575);

		System.out.println("\nMedico");
		System.out.println("Nome: " + medico.getNome());
		System.out.println("Matricula: " + medico.getMatricula());
		System.out.println("Salario: " + medico.getSalario());
		System.out.println("Telefone: " + medico.getTelefone());
		System.out.println("Endereço: " + medico.getEndereco());
		System.out.println("Data de nascimento: " + medico.getDataNascimento());
		System.out.println("Crm: " + medico.getCrm());

		}
}

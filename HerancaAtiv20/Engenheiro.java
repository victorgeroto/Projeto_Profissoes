package HerancaAtiv20;

public class Engenheiro extends Funcionario{

	private int numCra;

	public Engenheiro(String nome, String matricula, double salario, String telefone, String endereco,
			String dataNascimento, int numCra) {

		super(nome, matricula, salario, telefone, endereco, dataNascimento);
		this.numCra = numCra;

	}

	public int getNumCra() {
		return numCra;

	}

	public void setNumCra(int numCra) {
		this.numCra = numCra;

	}

}



public class Aluno extends Pessoa {
	private String matricula;
	private String data_ingresso;
	private Inscricao[] lista_inscricoes;

	public Aluno(String nome, String CPF, String dataNascimento, String matricula, String data_ingresso) {
		super(nome, CPF, dataNascimento);
		this.setMatricula(matricula);
		this.data_ingresso = data_ingresso;
		lista_inscricoes = new Inscricao[10];
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getData_ingresso() {
		return data_ingresso;
	}

	public void setData_ingresso(String data_ingresso) {
		this.data_ingresso = data_ingresso;
	}

	// INSERINDO UMA INSCRIÇÃO
	public int insereInscricao(Inscricao insc) {
		{
			if (listaInscricaoNaoEstaCheia()) {
				insereInscricaoPosicaoLivre(insc);
			} else {
				return -1;
			}
			return 0;
		}
	}

	private void insereInscricaoPosicaoLivre(Inscricao insc) {
		if (listaInscricaoNaoEstaCheia()) {
			int posicao_livre = -1;
			boolean encontrou = false;
			for (int i = 0; i < lista_inscricoes.length; i++) {
				if ((lista_inscricoes[i] == null) && !encontrou) {
					posicao_livre = i;
					encontrou = true;
				}
			}
			// relacionando o aluno a inscricao
			lista_inscricoes[posicao_livre] = insc;
			// relacionando a inscricao ao aluno
			insc.setAluno(this);
		} else {
			System.out.println("Lista Cheia !!");
		}
	}

	private boolean listaInscricaoNaoEstaCheia() {
		for (int i = 0; i < lista_inscricoes.length; i++) {
			if (lista_inscricoes[i] == null) {
				return true;
			}
		}
		return false;
	}
	
}

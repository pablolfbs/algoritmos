
public class Teste {
	
	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Tyrion");
//		contato.setEndereco("Kings Landing");
//		contato.setTelefone("21 99999-9999");
		
		Endereco end = new Endereco();
		end.setNomeRua("Rua Game of Thrones");
		end.setNumero("n/a");
		end.setComplemento("-");
		end.setCidade("Kings Landing");
		end.setEstado("Westeros");
		end.setCep("99999-999");
		
		contato.setEndereco(end);
		
		Telefone telefone1 = new Telefone();
		telefone1.setTipo("celular");
		telefone1.setDdd("21");
		telefone1.setNumero("99999-9999");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("casa");
		telefone2.setDdd("21");
		telefone2.setNumero("88888-8888");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone1;
		telefones[1] = telefone2;
		
//		contato.setTelefone(telefone);
		contato.setTelefones(telefones);
		
		System.out.println(contato.getNome());
		
		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		/*if (contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
		}*/
		
		if (contato != null && contato.getTelefones() != null) {
			for (Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
		
		
		
		
	}
	
}

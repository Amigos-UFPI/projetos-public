
public class Filme {
	public String Nome;
	public String Genero;
	public String Diretor;
	public int Ano;
	
	public Filme(String nome, String genero, String diretor, int ano) {
		nome = this.Nome;
		genero = this.Genero;
		diretor = this.Diretor;
		ano = this.Ano;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public String getDiretor() {
		return Diretor;
	}

	public void setDiretor(String diretor) {
		Diretor = diretor;
	}

	public int getAno() {
		return Ano;
	}

	public void setAno(int ano) {
		Ano = ano;
	}

	
}

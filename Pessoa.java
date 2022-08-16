package revisao;

public class Pessoa {
	private int id;
	private String nome;
	private String telefone;
	private int tipo;
	private Endereco endereco;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [id=");
		builder.append(id);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", telefone=");
		builder.append(telefone);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", endereco=");
		builder.append(endereco);
		builder.append("]");
		return builder.toString();
	}
	
	
}

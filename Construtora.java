package revisao;

public class Construtora {
	private int id;
	private String nome;
	private String estado;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Construtora [id=");
		builder.append(id);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", estado=");
		builder.append(estado);
		builder.append("]");
		return builder.toString();
	}

}

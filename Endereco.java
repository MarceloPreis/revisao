package revisao;

public class Endereco {
	private String rua;
	private String bairro;
	private String cidade;
	
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Endereco [rua=");
		builder.append(rua);
		builder.append(", bairro=");
		builder.append(bairro);
		builder.append(", cidade=");
		builder.append(cidade);
		builder.append("]");
		return builder.toString();
	}
}

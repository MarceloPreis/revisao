package revisao;

public class Corretor extends Pessoa {
	private String creci;
	private float salario;
	
	//Methods
	public String getCreci() {
		return creci;
	}
	public void setCreci(String creci) {
		this.creci = creci;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Corretor [creci=");
		builder.append(creci);
		builder.append(", salario=");
		builder.append(salario);
		builder.append("]");
		return builder.toString();
	}
	
}

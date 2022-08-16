package revisao;

public class Modelo {
	private int id;
	private String text;
	private int fontSize;

	public String gerarContratoDeVenda(Imovel imovel) {
		String text = "Este é o contrato de venda para o imóvel " + imovel.titulo + "";
		return text;
	}
}

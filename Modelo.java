package revisao;

public class Modelo {
	private int id;
	private String text;
	private int fontSize;

	public String gerarContratoDeVenda(Imovel imovel) {
		String text = "Este � o contrato de venda para o im�vel " + imovel.titulo + "";
		return text;
	}
}

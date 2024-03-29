package app;

import java.util.Random;

public class Serie extends StreamAvaliavel {
    private int quantidadeEpisodios;

    /**
     * Construtor da classe Serie
     * @param id
     * @param nome
     * @param genero
     * @param idioma
     * @param dataLancamento
     * @param quantidadeEpisodios
     */
    public Serie(int id, String nome, int genero, int idioma, String dataLancamento, int quantidadeEpisodios) {
        super(id, nome, genero, idioma, dataLancamento);
        this.quantidadeEpisodios = quantidadeEpisodios;
    }
    
    /**
     * Construtor da classe Serie
     * @param IdSerie
     * @param nome
     * @param dataDeLancamento
     */
    public Serie(int IdSerie, String nome, String dataDeLancamento){
        super(IdSerie, nome, dataDeLancamento);
        Random random = new java.util.Random();
        this.quantidadeEpisodios = random.nextInt(20);
    }

    /**
     * Retorna a quantidade de episodios da série 
     * 
     * @return int - quantidadeEpisodios
     */
    public int getQuantidadeEpisodios() {
        return quantidadeEpisodios;
    }

    /**
     * Atribui uma quantidade de episodios para a serie
     * @param quantidadeEpisodios
     */
    public void setQuantidadeEpisodios(int quantidadeEpisodios) {
        this.quantidadeEpisodios = quantidadeEpisodios;
    }

    /**
     * Retorna uma String com os valores dos atributos
     * 
     * @return String
     */
    @Override
    public String toString() {
        String apresentacao = "Sobre a Série: \n----------------------------------------------------------------\n";
        return apresentacao + super.toString() + "\nQuantidade de Episódios: " + quantidadeEpisodios + "\n\n";
    }
}

import java.time.LocalDate;

public class Equipamento {
    private static int ultimoId = 0;
    private int id;
    private String descricao;
    private LocalDate inicioAluguel;
    private int duracaoAluguel;
    private int duracaoMaxima;
    private double valorDiario;
    private double totalArrecadado;

    /**
     * A classe Equipamento representa um item disponível para aluguel na empresa Xulambs Heavy Rental.
     * Cada equipamento tem um identificador único, uma descrição, um valor diário de aluguel, 
     * e uma duração máxima de aluguel permitida. E também armazena informações sobre o 
     * histórico de aluguéis, como a data de início e a duração do aluguel mais recente.
     * @param descricao      A descrição do equipamento, que deve conter pelo menos 5 caracteres.
     * @param diaria         O valor diário de aluguel do equipamento (deve ser maior que zero).
     */
    public Equipamento(String descricao, double diaria, int duracaoMaxima) {        
        if (descricao.length() < 5) {
            System.out.println("Favor escrever pelo menos 5 caracteres para a descrição");
        }
        if (valorDiario < 0) {
            System.out.println("Favor escrever um valor diario maior do que 0");
        }
        if (valorDiario < 0) {
            System.out.println("Favor escrever um valor diario maior do que 0");
        }
        this.id = ++ultimoId;
        this.descricao = descricao;
        this.valorDiario = diaria;
        this.duracaoMaxima = duracaoMaxima;
        this.totalArrecadado = 0.0;
        this.inicioAluguel = null;
        this.duracaoAluguel = 0;
    }

     /**
     * Verifica se o equipamento está disponível para aluguel em uma data específica.
     * Se o equipamento não tiver sido alugado anteriormente (inicioAluguel == null), ele está disponível.
     * Caso contrário, calcula a data de fim do aluguel atual e verifica se a data fornecida é posterior.
     * @param data  A data para verificar a disponibilidade do equipamento.
     * @return true se o equipamento estiver disponível; false caso contrário.
     */
    public boolean estaDisponivel(LocalDate data) {
        if (inicioAluguel == null) {
            return true;
        }

        LocalDate fimAluguel = inicioAluguel.plusDays(duracaoAluguel);
        return data.isAfter(fimAluguel);
    }

    /**
     * Aluga o equipamento, registrando a data de início do aluguel e a duração em dias.
     * O equipamento só pode ser alugado se estiver disponível na data de início especificada.
     * O valor do aluguel é somado ao total arrecadado.
     * @param inicio          A data de início do aluguel.
     * @param duracaoAluguel  A duração do aluguel em dias.
     */
    public boolean alugar(LocalDate inicio, int duracaoAluguel) {
        if (!estaDisponivel(inicio)) {
            return false;
        }

        this.inicioAluguel = inicio;
        this.duracaoAluguel = duracaoAluguel;
        this.totalArrecadado += valorAluguel();
        return true;
    }

    /**
     * Calcula o valor total do aluguel atual, multiplicando a duração do aluguel pelo valor diário.
     * @return O valor total do aluguel.
     */
    public double valorAluguel() {
        return this.duracaoAluguel * this.valorDiario;
    }

    /**
     * Retorna uma string contendo os dados do equipamento: descrição, valor da diária, total arrecadado e informações sobre o último aluguel.
     * @return Um objeto StringBuilder contendo os dados formatados do equipamento.
     */
    public StringBuilder dados() {
        StringBuilder dados = new StringBuilder();
        dados.append("------------------------------------\n");
        dados.append("Descrição do equipamento: " + descricao + "\n");
        dados.append("Valor da diária: R$" + valorDiario + "\n");
        dados.append("Total Arrecadado: R$" + totalArrecadado + "\n");

        if (inicioAluguel != null) {
            dados.append("Alugado pela última vez em: " + inicioAluguel + " por " + duracaoAluguel + " dias\n");
        } else {
            dados.append("Equipamento nunca foi alugado.\n");
        }

        return dados;
    }
}
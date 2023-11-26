public class Main {
    public static void main(String[] args) {
        
        // Cria instâncias das estratégias de pagamento
        IPagamentoStrategy cartaoCredito = new CartaoCredito();
        IPagamentoStrategy transferenciaBancaria = new TransferenciaBancaria();
        IPagamentoStrategy pix = new Pix();
        IPagamentoStrategy carteiraDigital = new CarteiraDigital();

        // Cria instância do processador de pagamento com uma estratégia inicial (por exemplo, cartão de crédito)
        ProcessadorPagamento processador = new ProcessadorPagamento(cartaoCredito);

        // Executa o processamento de pagamento
        processador.processarPagamento();

        // Altera a estratégia para transferência bancária e executa o processamento novamente
        processador.setEstrategia(transferenciaBancaria);
        processador.processarPagamento();

        // Altera a estratégia para Pix e executa o processamento novamente
        processador.setEstrategia(pix);
        processador.processarPagamento();

        // Altera a estratégia para carteira digital e executa o processamento novamente
        processador.setEstrategia(carteiraDigital);
        processador.processarPagamento();
    }
}
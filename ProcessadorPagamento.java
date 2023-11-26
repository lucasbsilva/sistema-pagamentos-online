class ProcessadorPagamento {
    private IPagamentoStrategy estrategia;

    public ProcessadorPagamento(IPagamentoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(IPagamentoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void processarPagamento() {
        // Executa a lógica de processamento de pagamento conforme a estratégia escolhida
        estrategia.processarPagamento();
    }
}
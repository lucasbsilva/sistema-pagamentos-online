class CartaoCredito implements IPagamentoStrategy {
    @Override
    public void processarPagamento() {
        // Lógica específica para processar pagamento com cartão de crédito
        System.out.println("Processando pagamento com cartão de crédito...");
    }
}
public class Main {
    public static void main(String[] args) {
        Loja minhaLoja = new Loja();

        // Criando e empregando funcionários
        Funcionario func1 = new Funcionario("Ana Silva", "Rua A, 123", "1111-1111", "12345678900", 'F', 1, 101, 3000.0, "Caixa");
        Funcionario func2 = new Funcionario("Carlos Souza", "Rua B, 456", "2222-2222", "98765432100", 'M', 2, 102, 4500.0, "Gerente");

        minhaLoja.empregarFuncionario(func1);
        minhaLoja.empregarFuncionario(func2);

        // Criando e cadastrando clientes
        Cliente cliente1 = new Cliente("Juliana Mendes", "Rua C, 789", "3333-3333", "11122233344", 'F', 1, 5000.0, "Eletrônicos", "Arquiteta");
        Cliente cliente2 = new Cliente("Roberto Lima", "Rua D, 321", "4444-4444", "55566677788", 'M', 2, 2000.0, "Livros", "Professor");

        minhaLoja.cadastrarCliente(cliente1);
        minhaLoja.cadastrarCliente(cliente2);

        // Criando e cadastrando fornecedores
        Fornecedor fornecedor1 = new Fornecedor("Tech Eletrônicos", "Av. Central, 111", "5555-5555", "12345678000199", "Tech Eletrônicos LTDA", "Celulares, Notebooks");
        Fornecedor fornecedor2 = new Fornecedor("Livros & Cia", "Av. das Letras, 222", "6666-6666", "98765432000188", "Livros & Cia ME", "Livros e Revistas");

        minhaLoja.cadastrarFornecedor(fornecedor1);
        minhaLoja.cadastrarFornecedor(fornecedor2);

        // Listando todos
        minhaLoja.listarFuncionarios();
        minhaLoja.listarClientes();
        minhaLoja.listarFornecedores();

        // Demitindo um funcionário
        System.out.println("\nDemitindo o funcionário: " + func1.nome);
        minhaLoja.demitirFuncionario(func1);

        // Listando novamente para confirmar
        minhaLoja.listarFuncionarios();
    }
}

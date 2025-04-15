import java.util.ArrayList;
import java.util.List;

// Classe base
class Pessoa {
    protected String nome;
    protected String endereco;
    protected String telefone;

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
}

// Subclasse de Pessoa
class PessoaFisica extends Pessoa {
    protected String cpf;
    protected char sexo;
    protected int estadoCivil;

    public PessoaFisica(String nome, String endereco, String telefone, String cpf, char sexo, int estadoCivil) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
    }
}

class PessoaJuridica extends Pessoa {
    protected String cnpj;
    protected String razaoSocial;

    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String razaoSocial) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }
}

// Cliente herda de PessoaFisica
class Cliente extends PessoaFisica {
    private double renda;
    private String interesses;
    private String profissao;

    public Cliente(String nome, String endereco, String telefone, String cpf, char sexo, int estadoCivil,
                   double renda, String interesses, String profissao) {
        super(nome, endereco, telefone, cpf, sexo, estadoCivil);
        this.renda = renda;
        this.interesses = interesses;
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return nome + " (" + profissao + ")";
    }
}

// Funcionário herda de PessoaFisica
class Funcionario extends PessoaFisica {
    private int matricula;
    private double salario;
    private String cargo;

    public Funcionario(String nome, String endereco, String telefone, String cpf, char sexo, int estadoCivil,
                       int matricula, double salario, String cargo) {
        super(nome, endereco, telefone, cpf, sexo, estadoCivil);
        this.matricula = matricula;
        this.salario = salario;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return nome + " - " + cargo;
    }
}

// Fornecedor herda de PessoaJuridica
class Fornecedor extends PessoaJuridica {
    private String produtos;

    public Fornecedor(String nome, String endereco, String telefone, String cnpj, String razaoSocial, String produtos) {
        super(nome, endereco, telefone, cnpj, razaoSocial);
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return razaoSocial + " - Produtos: " + produtos;
    }
}

// Classe Loja
class Loja {
    private List<Funcionario> funcionarios;
    private List<Cliente> clientes;
    private List<Fornecedor> fornecedores;

    public Loja() {
        funcionarios = new ArrayList<>();
        clientes = new ArrayList<>();
        fornecedores = new ArrayList<>();
    }

    public void empregarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void demitirFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void cadastrarFornecedor(Fornecedor fornecedor) {
        fornecedores.add(fornecedor);
    }

    public void listarFuncionarios() {
        System.out.println("Funcionários:");
        for (Funcionario f : funcionarios) {
            System.out.println("- " + f);
        }
    }

    public void listarClientes() {
        System.out.println("Clientes:");
        for (Cliente c : clientes) {
            System.out.println("- " + c);
        }
    }

    public void listarFornecedores() {
        System.out.println("Fornecedores:");
        for (Fornecedor f : fornecedores) {
            System.out.println("- " + f);
        }
    }
}

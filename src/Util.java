import java.util.Scanner;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Util {
    static Scanner sc = new Scanner(System.in);
    static final int N = 10;
    static int idxProduto = 0, idxFornecedor = 0;
    private Produto[] produto = new Produto[N];
    private Fornecedor[] fornecedor = new Fornecedor[N];

    public void MenuPrincipal() {
        int opcao;

        do {
            opcao = parseInt(showInputDialog("Escolha uma das funções: \n" +
                    "1 - Cadastrar Produto \n2 - Pesquisar produto por nome \n" +
                    "3 - Pesquisar fornecedor por CNPJ \n4 - Finalizar"));

            while (opcao < 1 || opcao > 4) {
                opcao = parseInt(showInputDialog("Escolha uma das funções válidas: \n" +
                        "1 - Cadastrar Produto \n2 - Pesquisar produto por nome \n" +
                        "3 - Pesquisar fornecedor por CNPJ \n4 - Finalizar"));
            }

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;

                case 2:
                    pesquisarProduto();
                    break;

                case 3:
                    pesquisarFornecedor();
                    break;
            }
        } while (opcao != 4);

    }

    private void cadastrarProduto(){
        String nome;
        double preco;
        int qtdEstoque;
        Fornecedor fornecedor = pesquisarFornecedor();

        if(fornecedor == null){
            fornecedor = cadastrarFornecedor();
            idxFornecedor++;
        }

        nome = showInputDialog("Nome do produto");
        preco = parseDouble(showInputDialog("Valor unitário:"));
        qtdEstoque = parseInt(showInputDialog("Quantidade em estoque:"));

        produto[idxProduto] = new Produto(nome, preco, qtdEstoque, fornecedor);
        idxProduto++;

    }

    private void pesquisarProduto(){

    }

    private Fornecedor pesquisarFornecedor(){
        int cnpj = parseInt(showInputDialog("CNPJ do fornecedor:"));

        for (int i=0; i < idxFornecedor; i++){
            if(cnpj == fornecedor[i].getCnpj()){
                return fornecedor[i];
            }
        }
        showMessageDialog(null, cnpj + " Não cadastrado");
        return null;
    }

    private Fornecedor cadastrarFornecedor(){
        String nome;
        int cnpj;

        nome = showInputDialog("Nome do fornecedor:");
        cnpj = parseInt(showInputDialog("CNPJ do fornecedor"));

        fornecedor[idxFornecedor] = new Fornecedor(nome, cnpj);
        return fornecedor[idxFornecedor];
    }

}


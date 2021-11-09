package one.digitalinnovation.oo;

/**
 * Classe de exemplo para o exercício da Aula 4 de Orientação a Objetos.
 */
class RodarAplicacao {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Gerente gerente_ = new Funcionario();
        Vendedor vendedor_ = (Vendedor) new Funcionario();

    }
}

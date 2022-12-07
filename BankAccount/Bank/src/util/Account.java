package util;

/*
*
* Conta de Banco
* Como atributos numero nome e saldo da conta.
*
* Dois tipos de constructors, caso o cliente não queria iniciar a conta com deposito e caso ele queria iniciar com deposito.
* A conta morrera com o mesmo numero, entao apenas pode dar getNumber
* Já o nome do dono da conta, pode trocar com set, caso ele vai se casar e precisa mudar nome ex...
* Balance nao faz sentido modificar o saldo da sua conta, apenas usar get , para modificar o saldo apenas com depositos e saques usando metodos
*
* Metodo deposito recebendo como parametro um valor para depositar na conta
* Metodo saque recebendo como parametro valor para sacar da conta
*
*
* */
public class Account {

    private int number;
    private String name;
    private double balance;


    public Account(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Account(int number, String name, double initialDeposit) {
        this.number = number;
        this.name = name;
        deposit(initialDeposit); // Encapsulamento de regra de negocios, caso o banco queira trocar a maneira de deposito, fica mais facil mudar pelo metodo
    }

    public int getNumber(){
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount + 5.0;
    }

    public String toString() {
        return "Account " + number
                + ", Holder: " + name
                + ", Balance: $ " + String.format("%.2f", balance);
    }


}

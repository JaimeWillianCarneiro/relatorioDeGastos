class Main extends Funcionario{
    public static void main(String[]args) {
    
        // criando um objeto funcionario
    Funcionario f1= new Funcionario();
    f1.setNome("maryane");
    f1.setSalario(500);
    System.out.println("os gastos com esse funcionário é de:");
    System.out.println(f1.getGastos());

    
     // criando um objeto professor

    professorFuncionario f2 = new professorFuncionario();
    f2.setNome("Mary");
    f2.setSalario(1500);
    f2.setHorasDeAula(10);
    System.out.println("os gastos com esse funcionário é de:");
    System.out.println(f2.getGastos());

     // criando um objeto reitor

    Reitor f3 = new Reitor();
    f3.setNome("Ane");
    f3.setSalario(2000);
    System.out.println("os gastos com esse funcionário é de:");
    System.out.println(f3.getGastos());
}
}
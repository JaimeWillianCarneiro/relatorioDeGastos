 class GeradorDeRelatorio extends Funcionario {
    public void adiciona(Funcionario f) {
        System.out.println(f.getInfo());
        System.out.println(f.getGastos());
    }
}
public class Reitor extends Funcionario {
    public double getGastos() {
        return this.getSalario() * 15;
    }

       public String getInfo() {
           return super.getInfo() + " e ele é um reitor";
       }
       
   }
    

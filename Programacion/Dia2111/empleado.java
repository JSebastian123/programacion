package Dia2111;

public class empleado {
    private int Id;
    private Double salary;
    private String firstName;
    private String LastName;
    private Double IncrementoSalario;
    public empleado(int id, Double salary, String firstName, String LastName, Double IncrementoSalario) {
        this.setId(Id);
        this.setSalary(salary);        
        this.setFirstName(firstName);
        this.setLastname(LastName);
        //el salario deberia incrementar
        this.setIncrementoDeSalario(IncrementoSalario);
    }
    //tengo que preparar los setter/getter
    public int getId(){
        return Id;
    }
    public void setId(int Id){
        this.Id = Id;
    }
    public Double getSalary(){
        return salary;
    }
    public void setSalary(Double salary){
        this.salary = salary;
    }
     public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastname(){
        return LastName;
    }
    public void setLastname(String LastName){
        this.LastName = LastName;
    }
        public Double getIncrementoDeSalario(){
        return IncrementoSalario;
    }
    public void setIncrementoDeSalario(Double IncrementoSalario){
        this.IncrementoSalario = IncrementoSalario;
    }
}

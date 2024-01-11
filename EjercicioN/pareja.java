package EjercicioN;

public class pareja {
    private Integer id;
    private String persona1;
    private String persona2;
    private Integer telefono;

    pareja(Integer id, String persona1, String persona2, Integer telefono) {
        this.setPersona1(persona1);
        this.setPersona2(persona2);
        this.setTelefono(telefono);
        this.setId(id);
    }
  
    public String getPersona1() {
        return persona1;
    }

    public String getPersona2() {
        return persona2;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setPersona1(String persona1) {
        this.persona1 = persona1;
    }

    public void setPersona2(String persona2) {
        this.persona2 = persona2;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    //Pareja (id) : (name1), (name2), (no hace falta(telf))
    public void pintarInformacion(){
        System.out.println("Pareja Num : " + id + " : " + persona1 + "  -  " + persona2 );
    }
}

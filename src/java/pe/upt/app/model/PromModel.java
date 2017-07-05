package pe.upt.app.model;
public class PromModel {
   //Entradas
    private int pract1;
    private int exParcial;
    private int pract2;
    private int trabPract;
    private int exFinal;
   //Salidas
    private int promFinal;
    private String estado;

    public PromModel() {
    }

    public PromModel(int pract1, int exParcial, int pract2, int trabPract, int exFinal) {
        this.pract1 = pract1;
        this.exParcial = exParcial;
        this.pract2 = pract2;
        this.trabPract = trabPract;
        this.exFinal = exFinal;
    }

    public int getExFinal() {
        return exFinal;
    }

    public void setExFinal(int exFinal) {
        this.exFinal = exFinal;
    }

    public int getPract1() {
        return pract1;
    }

    public void setPract1(int pract1) {
        this.pract1 = pract1;
    }

    public int getExParcial() {
        return exParcial;
    }

    public void setExParcial(int exParcial) {
        this.exParcial = exParcial;
    }

    public int getPract2() {
        return pract2;
    }

    public void setPract2(int pract2) {
        this.pract2 = pract2;
    }

    public int getTrabPract() {
        return trabPract;
    }

    public void setTrabPract(int trabPract) {
        this.trabPract = trabPract;
    }

    public int getPromFinal() {
        return promFinal;
    }

    public void setPromFinal(int promFinal) {
        this.promFinal = promFinal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
      
}

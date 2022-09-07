package reto3;
public class CuerpoDeAgua extends ObjetoGeografico {
    private String tipoCuerpoDeAgua;
    private String tipoAgua;
    private Float irca;

    public CuerpoDeAgua(String tipoCuerpoDeAgua, String tipoAgua, float irca, String nombre, int idCuerpoDeAgua, String municipio) {
        super(nombre, idCuerpoDeAgua, municipio);
        this.tipoCuerpoDeAgua = tipoCuerpoDeAgua;
        this.tipoAgua = tipoAgua;
        this.irca = irca;
    }
    String nivel(){
        String nivel = "";
        if(getIrca() >= 0 && getIrca() <= 5){
        nivel = "SIN RIESGO";
        }else{
            if(getIrca() > 5 && getIrca() <= 14){
            nivel = "BAJO";
            }else{
                if(getIrca() > 14 && getIrca() <= 35){
                nivel = "MEDIO";
                }else{
                    if(getIrca() > 35 && getIrca() <= 80){
                    nivel = "ALTO";
                        }else{
                            if(getIrca() > 80 && getIrca() <= 100){
                            nivel = "INVIABLE SANITARIAMENTE"; 
                                                                  }
                             }
                     }
                 }
             }
        return nivel;
    }
    public String getTipoCuerpoDeAgua() {
        return tipoCuerpoDeAgua;
    }
    public void setTipoCuerpoDeAgua(String tipoCuerpoDeAgua) {
        this.tipoCuerpoDeAgua = tipoCuerpoDeAgua;
    }
    public String getTipoAgua() {
        return tipoAgua;
    }
    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }
    public Float getIrca() {
        return irca;
    }
    public void setIrca(Float irca) {
        this.irca = irca;
    }
}

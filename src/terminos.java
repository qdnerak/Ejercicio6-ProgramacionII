

public class terminos<date> {
    private int idTerminos;
    private String frecuencia;
    private int tamañoByte;
    private date fechaUltimaactualizacion;
    private int valorHash;
    private resultados resultados;

    public terminos(int idTerminos, String frecuencia, int tamañoByte, date fechaUltimaactualizacion, int valorHash, resultados resultados) {
        this.setIdTerminos(idTerminos);
        this.setFrecuencia(frecuencia);
        this.setTamañoByte(tamañoByte);
        this.setFechaUltimaactualizacion(fechaUltimaactualizacion);
        this.setValorHash(valorHash);
        this.setResultados(resultados);
    }

    public terminos(int idTerminos, int i, int tamañoByte, int i1, int valorHash, int i2) {
    }

    @Override
    public String toString() {
        return "terminos{" +
                "idTerminos=" + idTerminos +
                ", frecuencia='" + frecuencia + '\'' +
                ", tamañoByte=" + tamañoByte +
                ", fechaUltimaactualizacion=" + fechaUltimaactualizacion +
                ", valorHash=" + valorHash +
                ", resultados=" + resultados +
                '}';
    }

    public int getIdTerminos() {
        return idTerminos;
    }

    public void setIdTerminos(int idTerminos) {
        this.idTerminos = idTerminos;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getTamañoByte() {
        return tamañoByte;
    }

    public void setTamañoByte(int tamañoByte) {
        this.tamañoByte = tamañoByte;
    }

    public date getFechaUltimaactualizacion() {
        return fechaUltimaactualizacion;
    }

    public void setFechaUltimaactualizacion(date fechaUltimaactualizacion) {
        this.fechaUltimaactualizacion = fechaUltimaactualizacion;
    }

    public int getValorHash() {
        return valorHash;
    }

    public void setValorHash(int valorHash) {
        this.valorHash = valorHash;
    }

    public resultados getResultados() {
        return resultados;
    }

    public void setResultados(resultados resultados) {
        this.resultados = resultados;
    }
}

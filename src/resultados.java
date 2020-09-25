public class resultados {
    private int idResultados;
    private int numeroDocumentos;
    private int tamañoPalabras;
    private int numeroPalabrasDiferentes;
    private String frecuenciaPalabras;

    public resultados(int idResultados, int numeroDocumentos, int tamañoPalabras, int numeroPalabrasDiferentes, String frecuenciaPalabras) {
        this.setIdResultados(idResultados);
        this.setNumeroDocumentos(numeroDocumentos);
        this.setTamañoPalabras(tamañoPalabras);
        this.setNumeroPalabrasDiferentes(numeroPalabrasDiferentes);
        this.setFrecuenciaPalabras(frecuenciaPalabras);
    }

    @Override
    public String toString() {
        return "resultados{" +
                "idResultados=" + idResultados +
                ", numeroDocumentos=" + numeroDocumentos +
                ", tamañoPalabras=" + tamañoPalabras +
                ", numeroPalabrasDiferentes=" + numeroPalabrasDiferentes +
                ", frecuenciaPalabras='" + frecuenciaPalabras + '\'' +
                '}';
    }

    public int getIdResultados() {
        return idResultados;
    }

    public void setIdResultados(int idResultados) {
        this.idResultados = idResultados;
    }

    public int getNumeroDocumentos() {
        return numeroDocumentos;
    }

    public void setNumeroDocumentos(int numeroDocumentos) {
        this.numeroDocumentos = numeroDocumentos;
    }

    public int getTamañoPalabras() {
        return tamañoPalabras;
    }

    public void setTamañoPalabras(int tamañoPalabras) {
        this.tamañoPalabras = tamañoPalabras;
    }

    public int getNumeroPalabrasDiferentes() {
        return numeroPalabrasDiferentes;
    }

    public void setNumeroPalabrasDiferentes(int numeroPalabrasDiferentes) {
        this.numeroPalabrasDiferentes = numeroPalabrasDiferentes;
    }

    public String getFrecuenciaPalabras() {
        return frecuenciaPalabras;
    }

    public void setFrecuenciaPalabras(String frecuenciaPalabras) {
        this.frecuenciaPalabras = frecuenciaPalabras;
    }
}

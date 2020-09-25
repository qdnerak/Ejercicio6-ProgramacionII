public class documentos {
    private int idDocumentos;
    private int numeroRegistro;
    private String titulo;
    private String url;
    private temas temas;
    private terminos terminos;

    public documentos(int idDocumentos, int numeroRegistro, String titulo, String url, temas temas, terminos terminos) {
        this.setIdDocumentos(idDocumentos);
        this.setNumeroRegistro(numeroRegistro);
        this.setTitulo(titulo);
        this.setUrl(url);
        this.setTemas(temas);
        this.setTerminos(terminos);
    }

    public documentos(int idDocumentos, int numeroRegistro, String titulo, String url, int i, int i1) {

    }

    @Override
    public String toString() {
        return "documentos{" +
                "idDocumentos=" + idDocumentos +
                ", numeroRegistro=" + numeroRegistro +
                ", titulo='" + titulo + '\'' +
                ", url='" + url + '\'' +
                ", temas=" + temas +
                ", terminos=" + terminos +
                '}';
    }

    public int getIdDocumentos() {
        return idDocumentos;
    }

    public void setIdDocumentos(int idDocumentos) {
        this.idDocumentos = idDocumentos;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public temas getTemas() {
        return temas;
    }

    public void setTemas(temas temas) {
        this.temas = temas;
    }

    public terminos getTerminos() {
        return terminos;
    }

    public void setTerminos(terminos terminos) {
        this.terminos = terminos;
    }
}

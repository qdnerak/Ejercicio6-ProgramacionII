public class temas {
    private int idTemas;
    private String busqueda;
    private String navegar;
    private String subtemas;

    public temas(int idTemas, String busqueda, String navegar, String subtemas) {
        this.setIdTemas(idTemas);
        this.setBusqueda(busqueda);
        this.setNavegar(navegar);
        this.setSubtemas(subtemas);
    }

    public temas(int idTemas, String palabras, String letras, int i) {

    }

    @Override
    public String toString() {
        return "temas{" +
                "idTemas=" + idTemas +
                ", busqueda='" + busqueda + '\'' +
                ", navegar='" + navegar + '\'' +
                ", subtemas='" + subtemas + '\'' +
                '}';
    }

    public int getIdTemas() {
        return idTemas;
    }

    public void setIdTemas(int idTemas) {
        this.idTemas = idTemas;
    }

    public String getBusqueda() {
        return busqueda;
    }

    public void setBusqueda(String busqueda) {
        this.busqueda = busqueda;
    }

    public String getNavegar() {
        return navegar;
    }

    public void setNavegar(String navegar) {
        this.navegar = navegar;
    }

    public String getSubtemas() {
        return subtemas;
    }

    public void setSubtemas(String subtemas) {
        this.subtemas = subtemas;
    }
}

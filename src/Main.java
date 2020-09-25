public class Main {
    public static void main(String[]args){
        //temas
        temas tema = new temas(1,"palabras","letras",1);
        //resultados
        resultados resultado= new resultados(123,5,800,20,"5");
        //terminos
        terminos termino= new terminos(321,11,24,1,15,11);
        //documentos
        documentos documento= new documentos(789,50,"documento.1","www.documentos.org",1,1);
        System.out.println("==========================================================================================================================");
        System.out.println("          *  *  *  *  *  S  I  S  T  E  M  A      D  E     I  N  F  O  R   M   A  C   I   O  N   *  *   *  *  *          ");
        System.out.println("==========================================================================================================================");
        System.out.println(tema);
        System.out.println(resultado);
        System.out.println(termino);
        System.out.println(documento);
        System.out.println("============================");



    }
}

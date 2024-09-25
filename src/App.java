public class App {
    public static void main(String[] args) throws Exception {
        Metodos metodosOrdenamiento = new Metodos();
     

        int[] arreglo = {5,7,30,12,9};

        int[] arregloOrdenado = metodosOrdenamiento.sortByBubble(arreglo);
        metodosOrdenamiento.printArreglo(arregloOrdenado);

        System.out.println("");
        int[] arregloOrdenadoDes = metodosOrdenamiento.sortByBubbleDes(arreglo);
        metodosOrdenamiento.printArreglo(arregloOrdenadoDes);

        //ORDENAR LAS PALABRAS ALFABETICAMENTE DE LA CADENA DE TEXTO
        System.out.println("");
        String cadena = "Este es un ejemplo de texto para ordenar";
        String[] palabras = cadena.split(" ");
        String[] palabrasOrdenadas = metodosOrdenamiento.sortByBubblePalabras(palabras);
        metodosOrdenamiento.printArreglo(palabrasOrdenadas);
    }
}

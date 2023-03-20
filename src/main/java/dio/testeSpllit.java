package dio;

public class testeSpllit {
    public static void main(String[] args) {
        String numeros = "01-02-03-04";
        String dadosModificados = numeros.replaceAll("-", "\n");

        System.out.println(dadosModificados);
        }


}


public class Array{
    int[] arreglo1 = {1, 2, 3, 4, 5};
    int[] arreglo2 = arreglo1;

    public void modificar() {
        arreglo2[0] = 10;
    }

    public void mostrar() {
        for (int num : arreglo1) {
            System.out.print(num + " ");
        }
    }
}

package pe.edu.tecsup.app;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int cont = 0;
        while(true) {
            try {
                Thread.sleep(1000);
                cont++;
                System.out.println("Mensaje #" + cont + ": Hola Mundo!");
            } catch (InterruptedException e) {
                System.out.println("Se interrumpió el hilo");
                // Handle exception
            }
        }
    }
}
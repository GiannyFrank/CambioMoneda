import javax.swing.*;

public class Peso_Bolivares {

    public void entradaDatos(){
        double Precio_bolivar =0.0014;
        double precio_Peso = 721.43;
        double resultado = 0;
        double bolivar=0;
        double peso=0;
        String menu="";
        menu+="1. Peso a Bolivares\n";
        menu+="2. Bolivares a pesos\n";

        String entrada= JOptionPane.showInputDialog(null,"Que conversión desea hacer?\n"+menu);
        switch (entrada){
            case "1":
              bolivar = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el valor de pesos que desea convertir"));

                break;
            case "2":
                 peso = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el valor de Bolivares que desea convertir"));
                break;

            default:
                JOptionPane.showMessageDialog(null,"Digite una opcion valida");

        }
        if (entrada.equals("1")){
        resultado= bolivar*Precio_bolivar;
        JOptionPane.showMessageDialog(null,"el resultado es: "+resultado);


        }else if (entrada.equals("2")){
            resultado= peso*precio_Peso;
            JOptionPane.showMessageDialog(null,"el resultado es: "+resultado);
        }
    }

    public static void main(String[] args) {
        Peso_Bolivares s = new Peso_Bolivares();
        s.entradaDatos();

    }
}

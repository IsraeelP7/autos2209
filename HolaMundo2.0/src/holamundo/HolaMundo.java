package holamundo;

import java.awt.Color;
import poo.conceptos.basicos.Automovil;

public class HolaMundo {

    public static void main(String[] args) {

        System.out.println("Hola");
        Persona per1 = new Persona();
        per1.setNombre("Israel Prieto");
        System.out.println("Nombre: " + per1.getNombre());
        per1.comer("Hamburguesa!!!");

        Persona per2 = new Persona();
        per2.setNombre("Felipe");
        System.out.println("Nombre: " + per2.getNombre());
        per2.comer("Pizza hawaiana!!");
        
        System.out.println("");
        System.out.println("Primer auto");
        Automovil Mibocho = new Automovil();
        Mibocho.setMarca("VW");
        System.out.println("Marca: " + Mibocho.getMarca());
        Mibocho.setSubMarca("Sedan");
        System.out.println("SubMarca: " + Mibocho.getSubMarca());
        Mibocho.setModelo(1970);
        System.out.println("Modelo: " + Mibocho.getModelo());
        Mibocho.setColor(Color.blue);
        System.out.println("Color: " + Mibocho.getColor());
        
        System.out.println("");
        System.out.println("Segundo auto");
        Automovil Mimustang = new Automovil();
        Mimustang.setMarca("Ford");
        System.out.println("Marca: " + Mimustang.getMarca());
        Mimustang.setSubMarca("Mustang");
        System.out.println("SubMarca: " + Mimustang.getSubMarca());
        Mimustang.setModelo(2010);
        System.out.println("Modelo: " + Mimustang.getModelo());
        Mimustang.setColor(Color.YELLOW);
        System.out.println("Color: " + Mimustang.getColor());
        
        System.out.println("");
        System.out.println("Tercer auto");
        Automovil Miakura = new Automovil();
        Miakura.setMarca("Akura");
        System.out.println("Marca: " + Miakura.getMarca());
        Miakura.setSubMarca("NSX");
        System.out.println("SubMarca: " + Miakura.getSubMarca());
        Miakura.setModelo(2013);
        System.out.println("Modelo: " + Miakura.getModelo());
        Miakura.setColor(Color.GRAY);
        System.out.println("Color: " + Mimustang.getColor());

    }

}

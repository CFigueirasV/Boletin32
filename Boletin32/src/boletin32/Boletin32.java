package boletin32;


public class Boletin32 {

    
    public static void main(String[] args) {
        
     Alumno a1 = new Alumno("Pedro",8,"García Barbón",12);
        System.out.println(a1.amosar());
        a1.cambiarNota(9);
        System.out.println(a1.amosar());
    }
    
}
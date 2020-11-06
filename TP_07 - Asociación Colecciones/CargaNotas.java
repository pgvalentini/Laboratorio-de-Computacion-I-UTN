package Tema_B_2020;
import java.util.*;
public class CargaNotas {

    
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        
        while(true){
            Alumno alumno = new Alumno();
            
            System.out.println("Ingrese datos del alumno");
            System.out.println("NOMBRE COMPLETO");
            alumno.setNombreCompleto(new Scanner(System.in).nextLine());
            System.out.println("LEGAJO");
            alumno.setLegajo(new Scanner(System.in).nextLong());
            
            while(true){
            Notas notas = new Notas();
                
                System.out.println("CATEDRA");
                notas.setCatedra(new Scanner(System.in).nextLine());
                System.out.println("NOTAS");
                notas.setNotaExamen(new Scanner(System.in).nextDouble());
                
                alumno.asignarFila(notas);
                
                System.out.println("Para salir ingrese S y para continuar otro caracter");
                String salirAlumno = new Scanner(System.in).nextLine();
                if (salirAlumno.equalsIgnoreCase("S")) {break;}
            }
            
            alumnos.add(alumno);
            System.out.println("Para finalizar la carga presione F, para continuar con otro alumno C");
            String salirAlumno = new Scanner(System.in).nextLine();
            if (salirAlumno.equalsIgnoreCase("F")) {break;}
        }
        
        System.out.println("ALUMNOS");
        for (Alumno a:alumnos) {
            System.out.println("Alumno "+a.getNombreCompleto()+" legajo "+a.getLegajo());
            for (Notas n: a.getNota()) {
                System.out.println("Notas "+n.getNotaExamen()+" en catedra "+n.getCatedra());
            }
        System.out.println("El promedio del alumno en general es "+a.promedioNotas());
        }

    }
    
}

package Parcial_2_2020_LAB;
import java.util.*;
/**
 *
 * @author Pablo
 */
public class LiquidacionEmpresa {
    public static void main(String[] args) {
        ArrayList <NivelAcademico> nivelesAcademicos = new ArrayList <NivelAcademico>();
        
        NivelAcademico nivel10 = new NivelAcademico();
        nivel10.setCódigo(10);
        nivel10.setNivel("Secundario Completo");
        nivel10.setPorcentajeAumento(10);
        nivelesAcademicos.add(nivel10);
        
        NivelAcademico nivel20 = new NivelAcademico();
        nivel20.setCódigo(20);
        nivel20.setNivel("Universitario Completo");
        nivel20.setPorcentajeAumento(30);
        nivelesAcademicos.add(nivel20);
        
        NivelAcademico nivel30 = new NivelAcademico();
        nivel30.setCódigo(30);
        nivel30.setNivel("Maestría Completo");
        nivel30.setPorcentajeAumento(40);
        nivelesAcademicos.add(nivel30);
        
        NivelAcademico nivel40 = new NivelAcademico();
        nivel40.setCódigo(40);
        nivel40.setNivel("Doctorado Completo");
        nivel40.setPorcentajeAumento(50);
        nivelesAcademicos.add(nivel40);

 
        Empresa empresa = new Empresa();
        System.out.println("Empresa");
        empresa.setRazonSocial(noVacio());
        System.out.println("CUIT");
        empresa.setCuit(onceCaracteres());
        int contador=0;
        while(true){
            Empleado empleado = new Empleado();
            System.out.println("Legajo");
            if(contador==0){
                empleado.setLegajo(hayNumero());
            }else {empleado.setLegajo(noHayRepetido(empresa));}
            contador++;
            System.out.println("Nombre Empleado");
            empleado.setNombreCompleto(noVacio());
            System.out.println("Salario");
            empleado.setSalario(mayorCero());
            
            switch(nivelAc(nivelesAcademicos)) {
                case 10:
                    empleado.setNivelAcademico(nivel10);
                    break;
                case 20:
                    empleado.setNivelAcademico(nivel20);
                    break;
                case 30:
                    empleado.setNivelAcademico(nivel30);
                    break;
                case 40:
                    empleado.setNivelAcademico(nivel40);
                    break;
            }
            empresa.iniciarArray(empleado);
            System.out.println("¿Cargar otro empleado? SI o NO");
            String salir = new Scanner(System.in).nextLine();
            if (salir.equalsIgnoreCase("NO")) {break;}
            System.out.println("----------------------------------");
        }
       
        imprimirDatos(empresa);
        datosFinales(empresa);
        
    }
    public static String noVacio(){
        String cadena = new Scanner(System.in).nextLine();
        while(cadena.isEmpty()){
            System.out.println("Error ingrese un valor correcto");
            cadena = new Scanner(System.in).nextLine();
        }
        return cadena;
    }
    public static String onceCaracteres(){
        String cadena = new Scanner(System.in).nextLine();
        while(cadena.length()!=11){
            System.out.println("Error ingrese un valor correcto");
            cadena = new Scanner(System.in).nextLine();
        }
        return cadena;
    }
    public static int hayNumero(){
        int num = new Scanner(System.in).nextInt();
        while(String.valueOf(num).isEmpty()){
            System.out.println("Error ingrese un valor correcto");
            num = new Scanner(System.in).nextInt();
        }
        return num;
    }
    public static double mayorCero(){
        double num = new Scanner(System.in).nextDouble();
        while(num<0){
            System.out.println("Error ingrese un valor correcto");
            num = new Scanner(System.in).nextDouble();
        }
        return num;
    }
    public static int nivelAc(ArrayList <NivelAcademico> nivelesAcademicos){
        int codigo=0;
        boolean codEncontrado=false;
        while(!codEncontrado){
        System.out.println("Ingrese código del Nivel Académico");
        codigo = new Scanner(System.in).nextInt();
            for (NivelAcademico nivel: nivelesAcademicos) {
                if (nivel.getCódigo() == codigo) {
                codEncontrado=true;
                break;
                }
            }
            if (!codEncontrado) {
                System.out.println("Ingrese un nuevo código");
                codigo = new Scanner(System.in).nextInt();
            }
        }
        return codigo;
    }
    public static int noHayRepetido(Empresa empresa){
        boolean encontrado=true;
        int numero = new Scanner(System.in).nextInt();
        while(String.valueOf(numero).isEmpty()){
            System.out.println("Error ingrese un valor correcto");
            numero = new Scanner(System.in).nextInt();
        }
        while(encontrado){
        for (Empleado e:empresa.getEmpleados()) {
            if (e.getLegajo()!= numero) {
                encontrado=false;
                break;
            }else{System.out.println("Ya hay un legajo cargado, ingrese otro no repetido");}
        numero = new Scanner(System.in).nextInt();
        }
        }
        return numero;
    }
    public static void imprimirDatos(Empresa empresa){
        System.out.println("Empresa: "+empresa.getRazonSocial());
        System.out.println("CUIT: "+empresa.getCuit());
        System.out.println("----------Empleados----------");
        for (Empleado e:empresa.getEmpleados()) {
            System.out.println("Nombre Completo: "+e.getNombreCompleto());
            System.out.println("Salario: $"+e.getSalario());
            System.out.println("Nivel Educativo: "+e.getNivelAcademico().getNivel()+" (Porcentaje Aumento "+e.getNivelAcademico().getPorcentajeAumento()+" %) ");
            System.out.println("------------------------------------------");
            }
    }
    public static void datosFinales(Empresa empresa){
        double suma=0;
        double mayor=0;
        int contador=0;
        System.out.println("--------");
        System.out.println("Resumen:");
        for (Empleado e:empresa.getEmpleados()) {
            suma += e.salarioTotalCalculado();
            contador++;
        }
        System.out.println("El promedio de los salarios de la empresa es: $"+(suma/contador));
        for (Empleado e:empresa.getEmpleados()) {
            suma += e.salarioTotalCalculado();
            contador++;
        }
        System.out.println("El empleado con mejor salario es");
        for (Empleado e:empresa.getEmpleados()) {
            if (mayor<e.salarioTotalCalculado()) {
                mayor=e.salarioTotalCalculado();
            }
        }
        for (Empleado e:empresa.getEmpleados()) {
            if(mayor==e.salarioTotalCalculado()){
            System.out.println("Nombre Completo: "+e.getNombreCompleto());
            System.out.println("Salario: $"+e.getSalario());
            System.out.println("Nivel Educativo: "+e.getNivelAcademico().getNivel()+" (Porcentaje Aumento "+e.getNivelAcademico().getPorcentajeAumento()+" %) ");
            System.out.println("------------------------------------------");
            }
        }
    }
    
}

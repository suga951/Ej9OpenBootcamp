public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setEdad(19);
        c1.setNombre("Sasha");
        c1.setTelefono("1172526236");
        c1.setCredito(150000);


        System.out.println("Class Cliente:");
        System.out.println(c1.getEdad());
        System.out.println(c1.getNombre());
        System.out.println(c1.getTelefono());
        System.out.println(c1.getCredito());

        Trabajador t1 = new Trabajador();
        t1.setEdad(18);
        t1.setNombre("Fernanda");
        t1.setTelefono("1145789856");
        t1.setSalario(240000);
        System.out.println("Class Trabajador:");
        System.out.println(t1.getEdad());
        System.out.println(t1.getNombre());
        System.out.println(t1.getTelefono());
        System.out.println(t1.getSalario());

    }

}




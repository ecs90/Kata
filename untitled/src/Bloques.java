public class Bloques {

    static{
        System.out.println("bloque estatico 1");
    }
    {
        System.out.println("bloque de inicializacion");
    }
    static{
        System.out.println("bloque estatico 2");
    }
    public static void main(String[] args) {
        System.out.println("main");
        //new Bloques();
    }

}
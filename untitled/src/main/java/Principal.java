public class Principal {
    public static void main(String[]args){
        System.out.println("oi");
        banco b1 = new banco("Andrey", "000", 15);
        banco b2 = new banco();

        banco b3 = new banco("jose", "0001", 5);
        System.out.println(b3.getNome());
        b3.setNome("Joaquim");
        System.out.println(b3.getNome());


    }

}

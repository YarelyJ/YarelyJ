public class PirmFloat {
    public static void main(String[] args) {
        float realFloat = 0.00000000015f; //1.5e-10f;
        System.out.println("realFloat = "+ realFloat);
        System.out.println("Float corresponde en byte a:  "+ Float.BYTES);
        System.out.println("Float corresponde en biteS a: "+ Float.SIZE);
        System.out.println("Valor máximo de un float: "+ Float.MAX_VALUE);
        System.out.println("Valor mínimo de un float: "+ Float.MIN_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = "+ realDouble);
        System.out.println("Double corresponde en byte a: "+ Double.BYTES);
        System.out.println("Double corresponde en biteS a: "+ Double.SIZE);
        System.out.println("Valor máximo de un double: "+ Double.MAX_VALUE);
        System.out.println("Valor mínimo de un double: "+ Double.MIN_VALUE);

        var varFlotante = 3.1416;
        System.out.println("varFlotante = "+ varFlotante);
    }
}

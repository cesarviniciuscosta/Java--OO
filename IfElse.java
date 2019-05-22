class IfElse {

    public static void main(String[] args) {

        /*
         * int idade = 19; if (idade < 18) {
         * System.out.println("Não pode entrar, menor de idade"); } else {
         * System.out.println("Pode entrar, maior de idade");
         * 
         */

        /*
         * int idade = 15; boolean amigoDoDono = true; if (idade < 18 && amigoDoDono ==
         * false) { System.out.println("Não pode entrar, menor de idade"); } else {
         * System.out.println("Pode entrar, maior de idade");
         * 
         * }
         */

         // utilizando o operador de negação ! Transforma o resultado de uma expressao booleana de false pra tru e vice versa.
         
        int idade = 15;
        boolean amigoDoDono = true;
        if (idade < 18 && !amigoDoDono) {
            System.out.println("Não pode entrar, menor de idade");
        } else {
            System.out.println("Pode entrar, maior de idade");

        }
    }
}
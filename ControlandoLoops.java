class ControlandoLoops {

    public static void main(String[] args) {

        int x = 1;
        int y = 100;

        /*
        for (int i = x; i < y; i++) {
            if (i % 19 == 0) {
                System.out.println("Achei um número divisivel por 19 entre x e y");
                break;
            }
        
        }
        */

        
        for (int i = 0; i < 100; i++){
            if (i < 50 && i < 60){
                continue;
            }
            System.out.println(i);
        }
    }

}
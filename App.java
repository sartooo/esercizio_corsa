public class App
 {
    public static void main(String[] args) throws Exception 
    {
        System.out.println("che la gara abbia inizio");

        Concorrenti c1 = new Concorrenti("ciccio");
        Concorrenti c2 = new Concorrenti("joker");
        Concorrenti c3 = new Concorrenti("youtubo");

        c1.start();
        c2.start();
        c3.start();

        c1.join();
        c2.join();
        c3.join();

        System.out.println("fine della corsa")
    }
}

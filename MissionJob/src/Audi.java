public class Audi extends Car {

        public void run()
        {
            System.out.println("Audi is running");
        }
        public static void main(String args[])
        {
            Car b= new Audi();    //upcasting
            b.run();
        }
}

public class Main {
    public static void main(String[] args)  {

        Stocks st = new Stocks();
        try {
            st.logarithm();
        }
        catch (NegativeArraySizeException ex) {
            System.out.println("Can't create array of negative integers");
            return;
        }
        catch (Exception e){
            System.out.println("Write integers!");
            return;
        }



    }
}

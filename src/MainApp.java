import java.io.IOException;

/**
 * Created by Daniel_D'AGE on 30.11.2018.
 */
public class MainApp {


    public static void main(String[] args) {

        try {
//            businessMethod();
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        } catch (BusinessException ex) {
//            System.out.println(ex.getMessage());
//        } catch (IllegalStateException ex) {
//            System.out.println(ex.getMessage());
//        }

        //lub druga opcja

        businessMethod();
    } catch (BusinessException ex) {
        System.out.println(ex.getMessage());
    } catch (IOException | IllegalStateException ex) {
        System.out.println(ex.getMessage());

    }

}

    //metoda rzucająca trzy wyjatki
    public static void businessMethod() throws IOException, IllegalStateException, BusinessException {


    }
}


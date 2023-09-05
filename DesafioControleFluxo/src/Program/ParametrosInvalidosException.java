package Program;

public class ParametrosInvalidosException extends Exception {
    static String Erro() throws ParametrosInvalidosException{

        throw new ParametrosInvalidosException();
    }
}

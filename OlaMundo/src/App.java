public class App {
    public static void main(String[] args) throws Exception {
        OlaMundo olaMarco = new OlaMundo(" Marco");
        OlaMundo olaMatheus = new OlaMundo(" Matheus");
        olaMarco.printText();
        olaMarco.boasVindas();
        olaMatheus.boasVindas();
    }
}

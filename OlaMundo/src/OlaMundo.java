public class OlaMundo { //upper camel case - Nome de classes

    //atributo
    String nomeUsuario;  //lower camel case - Nome de variáveis ou atributos
    
    //construtor
    public OlaMundo(String nome) {
        nomeUsuario = nome;
    }

    //método
    public void printText() {
        System.out.println("Olá Mundo!");
    }

    public void boasVindas() {
        System.out.println("Bem vindo"+ nomeUsuario);
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

}

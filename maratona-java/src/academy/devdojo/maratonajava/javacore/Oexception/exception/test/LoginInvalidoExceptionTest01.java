package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    private static void logar() throws LoginInvalidoException{
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";

        System.out.println("Usuário");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();

        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuário ou senha incorreto");
        }

        System.out.println("Usuario logado com sucesso");
    }
}

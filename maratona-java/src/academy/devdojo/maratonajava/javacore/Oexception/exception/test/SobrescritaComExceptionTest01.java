package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        //Só funciona usando o try catch
        try {
            pessoa.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        funcionario.salvar(); // não da erro se nao usar try catch pois nao possui o mesmo throws que a superclasse

    }
}

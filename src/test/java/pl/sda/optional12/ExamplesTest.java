package pl.sda.optional12;

import org.junit.Test;

import javax.swing.text.html.Option;
import java.util.Optional;

import static org.junit.Assert.*;

class ExamplesTest {

    @Test
    public void whenCreateEmptyOptional_thenReturnTrue(){
        Optional<String> empty = Optional.empty();
        assertFalse(empty.isPresent());
    }

    @Test
    public void givenNonNull(){
        String name = "testowa wartosc";
        Optional<String> opt = Optional.of(name);
        assertEquals("Optional[testowa wartosc]", opt.toString());
    }

    @Test(expected = NullPointerException.class)
    public void givenNull_whenErrorOnCreate_thenCorrect(){
        String name = null;
        Optional<String> opt = Optional.of(name);
    }

    @Test
    public void givenNull_whenCreateNullable_thenCorrect(){
        String name = null;
        Optional<String> opt = Optional.ofNullable(name);
        assertEquals("Optional.empty", opt.toString());

    }

    @Test
    public void givenOptional_whenIfPresentOk_thenCorrect(){
        Optional<String> name = Optional.ofNullable(null);
        name.ifPresent(n-> System.out.println("Witaj: " + n));
    }

    @Test

    public void whenOrElseWorks_thenCorrect(){
        String name = null;
        String nameGood = Optional.ofNullable(name).orElse("Nowe imie");
    }


}
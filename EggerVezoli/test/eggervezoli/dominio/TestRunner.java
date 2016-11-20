package eggervezoli.dominio;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(EvaluacionTest.class, RestauranteTest.class, SorteoTest.class);

        result.getFailures().stream().forEach((failure) -> {
            System.out.println(failure.toString());
        });

        System.out.println(result.wasSuccessful() ? "Todos los tests pasaron!" : "Arregla los fallos y vuelve a interntar");
    }
}

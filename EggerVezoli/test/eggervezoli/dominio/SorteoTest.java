package eggervezoli.dominio;

import java.util.ArrayList;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class SorteoTest {

    private Sorteo instance;
    private int numeroDeGanadores;

    @Before
    public void setUp() throws InvalidDateRangeException {
        instance = new Sorteo("Un premio", numeroDeGanadores, new Date(), new Date());
    }

    @Test
    public void testSortearDevuelveUnaListaDeUsuarios() throws NotEnoughParticipantsException {
        numeroDeGanadores = 3;
        ArrayList<Usuario> participantes = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            participantes.add(new Usuario("usuario" + i, "a@example.com"));
        }
        int numeroDeUsuariosObtenidos = instance.sortear(participantes).size();

        assertEquals(numeroDeGanadores, numeroDeUsuariosObtenidos);
    }

    @Test(expected = NotEnoughParticipantsException.class)
    public void testSortearLanzaUnaExcepcionSiNoHaySuficientesParticipantes() throws NotEnoughParticipantsException {
        numeroDeGanadores = 3;
        ArrayList<Usuario> participantes = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            participantes.add(new Usuario("usuario" + i, "a@example.com"));
        }
        instance.sortear(participantes);
    }
}

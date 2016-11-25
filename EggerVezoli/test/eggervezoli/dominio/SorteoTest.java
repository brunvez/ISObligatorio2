package eggervezoli.dominio;

import java.util.ArrayList;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class SorteoTest {

    private Sorteo instance;

    @Before
    public void setUp() throws InvalidDateRangeException {
        Date manana = new Date(new Date().getTime() + (1000 * 60 * 60 * 24));
        instance = new Sorteo("Un premio", 3, new Date(), manana);
    }

    @Test
    public void testSortearDevuelveUnaListaDeUsuarios() throws NotEnoughParticipantsException {
        int numeroDeGanadores = 3;
        ArrayList<Usuario> participantes = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            participantes.add(new Usuario("usuario" + i, "a@example.com"));
        }
        ArrayList<Usuario> ganadores = instance.sortear(participantes);
        int numeroDeUsuariosObtenidos = ganadores.size();

        assertEquals(numeroDeGanadores, numeroDeUsuariosObtenidos);
    }

    @Test(expected = NotEnoughParticipantsException.class)
    public void testSortearLanzaUnaExcepcionSiNoHaySuficientesParticipantes() throws NotEnoughParticipantsException {
        int numeroDeGanadores = 3;
        ArrayList<Usuario> participantes = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            participantes.add(new Usuario("usuario" + i, "a@example.com"));
        }
        instance.sortear(participantes);
    }
}

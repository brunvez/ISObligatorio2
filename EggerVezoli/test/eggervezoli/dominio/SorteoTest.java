package eggervezoli.dominio;

import java.util.ArrayList;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class SorteoTest {
    private Sorteo instance;
    
    @Before
    public void setUp() throws InvalidDateRangeException{
        instance = new Sorteo("Un premio", 3, new Date(), new Date());
    }
    
    @Test
    public void testSortearDevuelveUnaListaDeUsuarios() throws NotEnoughParticipantsException {
        int numeroDeGanadores = 3;
        ArrayList<Usuario> participantes = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            participantes.add(new Usuario("usuario" + i, "a@example.com"));
        }
        int numeroDeUsuariosObtenidos = instance.sortear(participantes).size();
        assertEquals(numeroDeGanadores, numeroDeUsuariosObtenidos);
    }

    @Test(expected = NotEnoughParticipantsException.class)
    public void testSortearLanzaUnaExcepcionSiNoHayParticipantes() throws NotEnoughParticipantsException {
        int numeroDeGanadores = 3;
        ArrayList<Usuario> participantes = new ArrayList<>();

        instance.sortear(participantes);
    }
}

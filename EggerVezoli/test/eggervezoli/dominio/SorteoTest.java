package eggervezoli.dominio;

import java.util.ArrayList;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

public class SorteoTest {

    @Test
    public void testSortearDevuelveUnaListaDeUsuarios() throws NotEnoughParticipantsException {
        int numeroDeGanadores = 3;
        Sorteo instance = new Sorteo("Un premio", numeroDeGanadores, new Date(), new Date());
        ArrayList<Usuario> participantes = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            participantes.add(new Usuario("usuario" + i, "a@example.com"));
        }
        int numeroDeUsuariosObtenidos = instance.sortear(participantes).size();
        assertEquals(numeroDeGanadores, numeroDeUsuariosObtenidos);
    }

    @Test(expected = Exception.class)
    public void testSortearLanzaUnaExcepcionSiNoHayParticipantes() throws NotEnoughParticipantsException {
        int numeroDeGanadores = 3;
        Sorteo instance = new Sorteo("Un premio", numeroDeGanadores, new Date(), new Date());
        ArrayList<Usuario> participantes = new ArrayList<>();

        instance.sortear(participantes);
    }
}

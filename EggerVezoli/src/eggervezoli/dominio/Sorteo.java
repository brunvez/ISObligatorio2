package eggervezoli.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Sorteo {

    private String premio;
    private int numeroDeGanadores;
    private Date fechaIncio;
    private Date fechaFin;

    public Sorteo(String premio, int numeroDeGanadores, Date fechaInicio, Date fechaFin) throws InvalidDateRangeException {
        if(fechaInicio.compareTo(fechaFin) > 1){
            throw  new InvalidDateRangeException();
        }
        this.premio = premio;
        this.numeroDeGanadores = numeroDeGanadores;
        this.fechaIncio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }

    public int getNumeroDeGanadores() {
        return numeroDeGanadores;
    }

    public void setNumeroDeGanadores(int numeroDeGanadores) {
        this.numeroDeGanadores = numeroDeGanadores;
    }

    public ArrayList<Usuario> sortear(ArrayList<Usuario> participantes) throws NotEnoughParticipantsException {
        if(participantes.isEmpty()){
            throw new NotEnoughParticipantsException();
        }
        ArrayList<Usuario> ganadores = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < numeroDeGanadores; i++) {
            ganadores.add(participantes.get(rand.nextInt(participantes.size())));
        }
        return ganadores;
    }
}

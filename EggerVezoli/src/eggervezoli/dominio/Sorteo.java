package eggervezoli.dominio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Sorteo {

    private String premio;
    private int numeroDeGanadores;
    private Date fechaIncio;
    private Date fechaFin;
    private Sorteo sorteoseleccionado;

    /**
     * Crea un nuevo sorteo con los datos dados
     * 
     * @param premio la descripcion del premio
     * @param numeroDeGanadores la cantidad de ganadores maxima para el premio
     * @param fechaInicio la fecha de inicio del sorteo
     * @param fechaFin la fecha de finalizacion del sorteo
     * @throws InvalidDateRangeException  si la fecha de inicio es mayor que la del fin
    */
    public Sorteo(String premio, int numeroDeGanadores, Date fechaInicio, Date fechaFin) throws InvalidDateRangeException {
        if(fechaInicio.compareTo(fechaFin) > 0){
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

    public Date getFechaIncio() {
        return fechaIncio;
    }

    public Date getFechaFin() {
        return fechaFin;
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

    @Override
    public String toString() {
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(fechaFin);
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH);
        int ano = calendario.get(Calendar.YEAR);
        return "Sorteo del " + dia + "/" + mes + "/" + ano;
    }
}

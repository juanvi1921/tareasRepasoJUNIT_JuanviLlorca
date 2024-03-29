package es.iesmz.tests;

import java.time.LocalDate;

public class Time {
    private int hora;
    private int minuto;
    private int segundo;

    public Time(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hora=" + hora +
                ", minuto=" + minuto +
                ", segundo=" + segundo +
                '}';
    }

    public boolean equals(Object tiempo) {
        if (tiempo instanceof Time && ((Time) tiempo).hora == this.hora && ((Time) tiempo).minuto == this.minuto && ((Time) tiempo).segundo == this.segundo) {
            return true;
        } else {
            return false;
        }
    }

    public Time nexSecond() {
        if (hora == 23 && minuto == 59 && segundo == 59) {
            hora = 0;
            minuto = 0;
            segundo = 0;
        } else if(minuto == 59 && segundo == 59) {
            hora++;
            minuto = 0;
            segundo = 0;
        } else if (segundo == 59) {
            minuto++;
            segundo = 0;
        } else {
            segundo++;
        }
        return new Time(hora, minuto, segundo);
    }
}

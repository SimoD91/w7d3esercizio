package Adapter;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class InfoAdapter implements DataSource {
    private Info info;
    private Date dataDiNascita;

    public InfoAdapter(Info info, Date dataDiNascita) {
        this.info = info;
        this.dataDiNascita = dataDiNascita;
    }

    public void setDataDiNascita(Date dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        if (dataDiNascita != null) {
            LocalDate nascita = dataDiNascita.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate oggi = LocalDate.now();
            Period periodo = Period.between(nascita, oggi);
            return periodo.getYears();
        } else {
            return 0;
        }
    }
}
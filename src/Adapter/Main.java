package Adapter;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Info info = new Info();
        info.setNome("Mario");
        info.setCognome("Rossi");

        Calendar calendar = Calendar.getInstance();
        calendar.set(1991, Calendar.DECEMBER, 27);
        Date dataDiNascita = calendar.getTime();
        info.setDataDiNascita(dataDiNascita);

        InfoAdapter infoAdapter = new InfoAdapter(info, dataDiNascita);

        UserData userData = new UserData();
        userData.getData(infoAdapter);

        System.out.println("Nome completo: " + userData.getNomeCompleto());
        System.out.println("Età: " + userData.getEta());
    }
}
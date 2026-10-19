package tn.esprim.gestionfoyer.utils;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * L'année universitaire commence le 1er septembre et se termine le 31 août.
 */
public final class AnneeUniversitaireUtil {

    private AnneeUniversitaireUtil() {
    }

    /** 1er septembre de l'année universitaire qui contient la date donnée. */
    public static LocalDate debut(LocalDate reference) {
        int annee = reference.getMonthValue() >= 9 ? reference.getYear() : reference.getYear() - 1;
        return LocalDate.of(annee, 9, 1);
    }

    /** 31 août de l'année universitaire qui contient la date donnée. */
    public static LocalDate fin(LocalDate reference) {
        return debut(reference).plusYears(1).minusDays(1);
    }

    public static Date toDate(LocalDate date) {
        return Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }
}

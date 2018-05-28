package objects;

import java.util.Date;

/**
 * Classe che rappresenta una data.
 * 
 * @author Forlin Marco & Favari Matteo
 */
public class MyDate implements Comparable<MyDate> {
    private final int year;
    private final int month;
    private final int day;
    private static final int[] DAYSFORMONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    /**
     * Costruttore della classe.
     * 
     * @param year, anno
     * @param month, mese
     * @param day, giorno
     */
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        
        // controllo sulla correttezza della data:
        if(month > 12 || month < 1)
            throw new IllegalArgumentException("Mese non valido");
        
        if(day < 1 || day > getDayForMonth(month, year))
            throw new IllegalArgumentException("Giorno non valido");
    }
    
    public MyDate(Date date) {
        this(date.getYear(), date.getMonth(), date.getDay());
    }
    
    /**
     * Verifica se un anno è bisestile.
     * 
     * @param year, anno di cui si vuole verificare la bisestilità
     * @return boolean, true se bisestile false altrimenti
     */
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
    
    /**
     * Calcola quanti giorni ci sono in un mese.
     * Considera gli anni bisestili.
     * 
     * @param month, mese di cui si vogliono sapere i giorni
     * @param year, anno a cui appartiene il mese
     * @return int, giorni del mese
     */
    private int getDayForMonth(int month, int year) {
        if(month == 2 && isLeapYear(year))
            return 29;
        return DAYSFORMONTH[month];
    }
    
    /**
     * Consente l'accesso al campo day.
     * 
     * @return int, giorno della data
     */
    public final int getDay() {
        return day;
    }
    
    /**
     * Consente l'accesso al campo month.
     * 
     * @return int, mese della data
     */
    public final int getMonth() {
        return month;
    }
    
    /**
     * Consente l'accesso al campo year.
     * 
     * @return int, anno della data
     */
    public final int getYear() {
        return year;
    }

    /**
     * Implementazione del metodo compareTo.
     * 
     * @param other, data da confrontare
     * @return int, minore di 0 se this < other uguale a 0 se uguali maggiore di 0 altrimenti
     */
    @Override
    public int compareTo(MyDate other) {
        if(year != other.year)
            return year - other.year;
        
        if(month != other.month)
            return month - other.month;
        
        return day - other.day;
    }
}

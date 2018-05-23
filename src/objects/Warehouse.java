package objects;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Classe che rappresenta un magazzino.
 * 
 * @author Forlin Marco & Favari Matteo
 */
public class Warehouse {
    
    // contiene i tipi di articolo raggruppati per categoria di sport:
    private Map<Sport, Map<String, ArticleType>> articleTypes;
    
    // contiene gli articoli presenti in magazzino raggruppati per sport:
    private Map<Sport, Map<Long, ArticleInWarehouse>> articlesInWarehouse;
    
    // contiene gli ingressi in magazzino del mese corrente:
    private Map<Integer, Entry> entries;

    /**
     * Costruttore della classe.
     */
    public Warehouse() {
        articleTypes = new HashMap<>();
        
        articleTypes.put(Sport.BASEBALL, new HashMap<>());
        articleTypes.put(Sport.CALCIO, new HashMap<>());
        articleTypes.put(Sport.CICLISMO, new HashMap<>());
        articleTypes.put(Sport.MOTOCICLISMO, new HashMap<>());
        articleTypes.put(Sport.PALLANUOTO, new HashMap<>());
        articleTypes.put(Sport.PALLAVOLO, new HashMap<>());
        articleTypes.put(Sport.PESCA, new HashMap<>());
        articleTypes.put(Sport.SCI, new HashMap<>());
        articleTypes.put(Sport.TENNIS, new HashMap<>());
        articleTypes.put(Sport.ALTRO, new HashMap<>());
        
        articlesInWarehouse = new HashMap<>();
        
        articlesInWarehouse.put(Sport.BASEBALL, new HashMap<>());
        articlesInWarehouse.put(Sport.CALCIO, new HashMap<>());
        articlesInWarehouse.put(Sport.CICLISMO, new HashMap<>());
        articlesInWarehouse.put(Sport.MOTOCICLISMO, new HashMap<>());
        articlesInWarehouse.put(Sport.PALLANUOTO, new HashMap<>());
        articlesInWarehouse.put(Sport.PALLAVOLO, new HashMap<>());
        articlesInWarehouse.put(Sport.PESCA, new HashMap<>());
        articlesInWarehouse.put(Sport.SCI, new HashMap<>());
        articlesInWarehouse.put(Sport.TENNIS, new HashMap<>());
        articlesInWarehouse.put(Sport.ALTRO, new HashMap<>());
    }

    /**
     * Classe interna che rappresenta un ingresso in magazzino.
     * Il campo code deve essere univoco nelle istanze della classe.
     * 
     * @author Forlin Marco & Favari Matteo
     */
    public class Entry {
        private MyDate date;
        private int code; // 10 cifre

        // contiene gli articoli presenti nell'ingresso:
        private Map<Sport, Map<Long, ArticleInWarehouse>> enteredArticles;
        
        public Entry() {
            
            // data corrente:
            final Date currentDate = new Date(System.currentTimeMillis());
            this.date = new MyDate(currentDate.getYear(), currentDate.getMonth(), currentDate.getDay());
            
            this.code = entries.size();
        }
        
        /**
         * Inserisce l'articolo passato nella mappa degli articoli entrati in magazzino.
         * 
         * @param articleInWarehouse, articolo da inserire
         * @return int, >0 se operazione riuscita <0 se articolo già esistente
         */
        public int addEnteredArticle(ArticleInWarehouse articleInWarehouse) {
            Sport sport = articleInWarehouse.getArticleType().getSport();
            
            enteredArticles.putIfAbsent(sport, new HashMap<>());
        }
    }
}

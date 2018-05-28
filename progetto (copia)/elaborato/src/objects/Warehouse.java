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
    
    // contiene gli utenti del sistema:
    private Map<String, User> users;
    
    // contiene i tipi di articolo raggruppati per categoria di sport:
    private Map<Sport, Map<String, ArticleType>> articleTypes;
    
    // contiene gli articoli presenti in magazzino raggruppati per sport:
    private Map<Sport, Map<Long, ArticleInWarehouse>> articlesInWarehouse;
    
    // contiene gli ingressi in magazzino:
    private Map<Integer, Entry> entries;
    
    // contiene gli ordini dei negozi:
    private Map<Integer, Order> orders;

    /**
     * Costruttore della classe.
     */
    public Warehouse() {
        users = new HashMap<>();
        
        users.put("Marco", new WarehouseWorker("Marco", "1234"));
        users.put("Matteo", new AdministrativeSecretary("matteo", "1234"));
        users.put("Luca", new WarehouseWorker("Luca", "1234"));
        
        
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
        
        entries = new HashMap<>();
    }

    public Map<String, User> getUsers() {
        return users;
    }
    /**
     * Classe interna che rappresenta un ingresso in magazzino.
     * Il campo code deve essere univoco nelle istanze della classe.
     * 
     * @author Forlin Marco & Favari Matteo
     */
    public class Entry {
        private final MyDate date;
        private final int code; // 10 cifre

        // contiene gli articoli presenti nell'ingresso:
        private Map<Sport, Map<Long, ArticleInWarehouse>> enteredArticles;
        
        /**
         * Costruttore della classe.
         */
        public Entry() {
            
            // data corrente:
            final Date currentDate = new Date(System.currentTimeMillis());
            this.date = new MyDate(currentDate);
            
            this.code = entries.size();
        }
        
        /**
         * Inserisce l'articolo passato nella mappa degli articoli entrati in magazzino.
         * 
         * @param articleInWarehouse, articolo da inserire
         * @throws IllegalArgumentException, se l'articolo è gia nella mappa degli ingressi
         */
        public void addEnteredArticle(ArticleInWarehouse articleInWarehouse) {
            Sport sport = articleInWarehouse.getArticleType().getSport();
            long articleInWarehouseCode = articleInWarehouse.getCode();
            
            enteredArticles.putIfAbsent(sport, new HashMap<>());
            
            // verifico se l'articolo è già presente:
            if(enteredArticles.get(sport).containsKey(articleInWarehouseCode))
                throw new IllegalArgumentException("Questo articolo è già stato inserito");
            
            enteredArticles.get(sport).putIfAbsent(articleInWarehouseCode, articleInWarehouse);
        }
        
        /**
         * Aggiunge al magazzino gli articoli inseriti e salva l'entrata nella
         * mappa della calsse esterna.
         * 
         * @throws Warehouse.NothingToSaveException, se non ci sono articoli da salvare
         */
        public void saveEntry() {
            if(enteredArticles.isEmpty())
                throw new Warehouse.NothingToSaveException();
            
            // scorro gli sport:
            enteredArticles.keySet().forEach((Sport mySport) -> {
                
                // scorro gli articoli:
                enteredArticles.get(mySport).keySet().forEach((Long myCode) -> {
                    
                    // se l'articolo è presente sommo le quantità:
                    if(articlesInWarehouse.get(mySport).containsKey(myCode))
                        articlesInWarehouse.get(mySport).get(myCode)
                                .addQuantity(enteredArticles.get(mySport).get(myCode).getQuantity());
                    
                    // altrimenti lo aggiungo
                    articlesInWarehouse.get(mySport).put(myCode, enteredArticles.get(mySport).get(myCode));
                });
            });
        }
        
        /**
         * Implementazione del metodo equals.
         * 
         * @param other, oggetto da confrontare
         * @return boolean, true se uguali false altrimenti
         */
        @Override
        public boolean equals(Object other) {
            return other instanceof Entry &&
                    code == ((Entry)other).code;
        }

        /**
         * Implementazione del metodo hashcode.
         * 
         * @return int, valore hash code
         */
        @Override
        public int hashCode() {
            return code;
        }
    }
    
    /**
     * Classe che rappresenta un ordine.
     * Il campo code deve essere univoco nelle istanze della classe.
     * 
     * @author Forlin Marco & Favari Matteo
     */
    public class Order {
        Shop shop;
        int code; // 10 cifre
        MyDate date;
        float price;
        
        // contiene gli articoli ordinati:
        Map<Sport, Map<Long, Integer>> orderedArticles;
        
        /**
         * Costruttore della classe.
         * 
         * @param shop, negozio che effettua l'ordine 
         */
        public Order(Shop shop) {
            this.shop = shop;
            
            // data corrente:
            final Date currentDate = new Date(System.currentTimeMillis());
            this.date = new MyDate(currentDate);
            
            this.code = orders.size();
        }
        
        /**
         * Inserisce l'articolo e la quantità nella mappa degli ordini.
         * 
         * @param sport, categoria
         * @param code, codice articolo
         * @param quantity, 
         * @throws IllegalArgumentException, se la quantità ordinata è maggiore della quantità
         * presente in magazzino
         * @throws IllegalArgumentException, se l'articolo è già presente nella mappa degli ordini
         */
        public void addOrderedArticle(Sport sport, long code, int quantity) {
            
            if(articlesInWarehouse.get(sport).get(code).getQuantity() < quantity)
                throw new IllegalArgumentException("La quantità inserita è maggiore di quella in magazzino");
            
            if(orderedArticles.get(sport).containsKey(code))
                throw new IllegalArgumentException("Questo articolo è già stato inserito");
            
            
        }
    }
    
    /**
     * Classe che rappresente un uscita.
     * 
     */
    public class Exit {
        
    }
    
    /**
     * Classe che rappresenta l'eccezione in cui si prova a salvare qualcosa
     * che non esiste.
     * 
     * @author Forlin Marco & Favari Matteo
     */
    public class NothingToSaveException extends RuntimeException {

        /**
         * Costruttore della classe.
         */
        public NothingToSaveException() {
            super("Nessun elemento da salvare");
        }
        
    }
}

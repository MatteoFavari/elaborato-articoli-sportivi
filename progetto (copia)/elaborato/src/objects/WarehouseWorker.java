package objects;

/**
 * Classe che rappresente un magazziniere.
 * 
 * @author Forlin Marco & Favari Matteo
 */
public class WarehouseWorker implements User {
    private final String username;
    private final String password;

    /**
     * Costruttore della classe.
     * 
     * @param username, username
     * @param password, password
     */
    public WarehouseWorker(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    /**
     * Consente l'accesso al campo username.
     * 
     * @return String, username
     */
    @Override
    public String getUsername() {
        return username;
    }

    /**
     * Consente l'accesso al campo password.
     * 
     * @return String, password
     */
    @Override
    public String getPassword() {
         return password;
    }

    /**
     * Implementazione del metodo equals.
     * 
     * @param other, oggetto da confrontare
     * @return boolean, true se uguali false altrimenti
     */
    @Override
    public boolean equals(Object other) {
        return other instanceof WarehouseWorker &&
                username.equals(((WarehouseWorker)other).username);
    }

    /**
     * Implementazione del metodo hasCode.
     * 
     * @return int, valore hash code
     */
    @Override
    public int hashCode() {
        return username.hashCode();
    }
}

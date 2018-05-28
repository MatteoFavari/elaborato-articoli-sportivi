package objects;

/**
 * Interfaccia che rappresenta un utente.
 * 
 * @author Forlin Marco & Favari Mmatteo
 */
public interface User {
    
    /**
     * Consente l'accesso al campo username.
     * 
     * @return String, username
     */
    public String getUsername();
    
    /**
     * Consente l'accesso al campo password.
     * 
     * @return String, password
     */
    public String getPassword();
}

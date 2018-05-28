package objects;

/**
 * Classe che rappresenta un negozio.
 * Il campo fiscalCode debe essere univoco nelle istanze della classe.
 * 
 * @author Forlin Marco & Favari Matteo
 */
public class Shop implements User {
    private final String username;
    private final String password;
    private String fiscalCode;
    private String name;
    private Address address;
    private City city;

    /**
     * Costruttore della classe.
     * 
     * @param username, username
     * @param password, password
     * @param fiscalCode, codice fiscale
     * @param name, nome
     * @param address, indirizzo
     * @param city, città
     */
    public Shop(String username, String password, String fiscalCode, String name, Address address, City city) {
        this.username = username;
        this.password = password;
        this.fiscalCode = fiscalCode;
        this.name = name;
        this.address = address;
        this.city = city;
    }

    
    
    /**
     * Consente l'accesso 
     * @return 
     */
    @Override
    public String getUsername() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * 
     * @return 
     */
    @Override
    public String getPassword() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
}

package objects;

/**
 * Classe che rappresenta il tipo di articolo.
 * Il campo name deve essere univoco nelle istanze della classe.
 * 
 * @author Forlin Marco & Favari Matteo
 */
public class ArticleType {
    private String name;
    private String description;
    private Sport sport;
    private String[] materials;

    /**
     * Costruttore della classe.
     * 
     * @param name, nome
     * @param description, descrizione
     * @param sport, categoria di sport
     * @param materials, array con i materiali che compongono il tipo di articolo
     */
    public ArticleType(String name, String description, Sport sport, String... materials) {
        this.name = name;
        this.description = description;
        this.sport = sport;
        this.materials = materials;
    }

    /**
     * Consente l'accesso al campo name.
     * 
     * @return String, stringa contenente il nome
     */
    public final String getName() {
        return name;
    }
    
    /**
     * Consente l'accesso al campo description.
     * 
     * @return String, stringa contenente la descrizione
     */
    public final String getDescription() {
        return description;
    }
    
    /**
     * Consente l'accesso al campo sport.
     * 
     * @return Sport, enumerabile contenente la categoria di sport
     */
    public final Sport getSport() {
        return sport;
    }
    
    /**
     * Consente l'accesso al campo materials.
     * 
     * @return String[], array con i materiali che compongono il tipo di articolo
     */
    public final String[] getMaterials() {
        return materials;
    }
    
    /**
     * Consente di riscrivere il campo name.
     * 
     * @param name, nuovo nome
     */
    public final void setName(String name) {
        this.name = name;
    }
    
    /**
     * Consente di riscrivere il campo description.
     * 
     * @param description, nuova descrizione
     */
    public final void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Consente di riscrivere il campo sport.
     * 
     * @param sport, nuova categoria di sport
     */
    public final void setSport(Sport sport) {
        this.sport = sport;
    }
    
    /**
     * Consente di riscrivere il campo materials.
     * 
     * @param materials, nuovo array con i materiali che compongono il tipo di articolo
     */
    public final void setSport(String... materials) {
        this.materials = materials;
    }

    /**
     * Implementazione del metodo equals.
     * 
     * @param other, oggetto da confrontare
     * @return boolean, true se uguali false altrimenti
     */
    @Override
    public boolean equals(Object other) {
        return other instanceof ArticleType
                && name.equals(((ArticleType)other).name);
    }

    /**
     * Implementazione del metodo hashCode.
     * 
     * @return int, valore hash code
     */
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

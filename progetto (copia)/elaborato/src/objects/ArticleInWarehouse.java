package objects;

/**
 * Classe che rappresenta un articolo in magazzino.
 * Il campo code deve essere univoco nelle istanze della classe.
 * 
 * @author Forlin Marco & Favari Matteo
 */
public class ArticleInWarehouse {
    private ArticleType articleType;
    private long code; // 13 cifre
    private float price;
    private ProductionDate ProductionDate;
    private PositionInWarehouse positionInWarehouse;
    private int quantity;

    /**
     * Costruttore della classe.
     * 
     * @param articleType, tipo di articolo
     * @param code, codice univoco
     * @param price, prezzo
     * @param ProductionDate, data di produzione
     * @param positionInWarehouse, posizione nel magazzino
     * @param quantity, quantità
     */
    public ArticleInWarehouse(ArticleType articleType, long code, float price, ProductionDate ProductionDate, PositionInWarehouse positionInWarehouse, int quantity) {
        this.articleType = articleType;
        this.code = code;
        this.price = price;
        this.ProductionDate = ProductionDate;
        this.positionInWarehouse = positionInWarehouse;
        this.quantity = quantity;
    }

    /**
     * Consente l'accesso al campo articleType.
     * 
     * @return articleType, tipo di articolo
     */
    public final ArticleType getArticleType() {
        return articleType;
    }

    /**
     * Consente l'accesso al campo code.
     * 
     * @return int, codice univoco 
     */
    public final long getCode() {
        return code;
    }

    /**
     * Consente l'accesso al campo price.
     * 
     * @return float, prezzo
     */
    public final float getPrice() {
        return price;
    }

    /**
     * Consente l'accesso al campo productionDate.
     * 
     * @return ProductionDate, data di produzione
     */
    public final ProductionDate getProductionDate() {
        return ProductionDate;
    }

    /**
     * Consente l'accesso al campo positionInWarehouse.
     * 
     * @return PositionInWarehouse, posizione nel magazzino
     */
    public final PositionInWarehouse getPositionInWarehouse() {
        return positionInWarehouse;
    }

    /**
     * Consente l'accesso al campo quantity.
     * 
     * @return int, quantità 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Consente di riscrivere il campo articleType.
     * 
     * @param articleType, nuovo tipo di articolo 
     */
    public final void setArticleType(ArticleType articleType) {
        this.articleType = articleType;
    }

    /**
     * Consente di riscrivere il campo code.
     * 
     * @param code, nuovo codice univoco
     */
    public final void setCode(long code) {
        this.code = code;
    }

    /**
     * Consente di riscrivere il campo price.
     * 
     * @param price, nuovo prezzo
     */
    public final void setPrice(float price) {
        this.price = price;
    }

    /**
     * Consente di riscrivere il campo productionDate.
     * 
     * @param ProductionDate, nuova data di produzione
     */
    public final void setProductionDate(ProductionDate ProductionDate) {
        this.ProductionDate = ProductionDate;
    }

    /**
     * Consente di riscrivere il campo positionInWarehouse.
     * 
     * @param positionInWarehouse, nuova posizione in magazzino
     */
    public final void setPositionInWarehouse(PositionInWarehouse positionInWarehouse) {
        this.positionInWarehouse = positionInWarehouse;
    }

    /**
     * Consente di riscrivere il campo quantity.
     *
     * @param quantity, nuova quantità
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    /**
     * Consente di riscrivere il campo quantity incrementandolo del valore indicato. 
     * @param quantity 
     */
    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }
    
    /**
     * Implementazione del metodo equals.
     * 
     * @param other, oggetto da confrontare
     * @return boolean, true se uguali false altrimenti
     */
    @Override
    public boolean equals(Object other) {
        return other instanceof ArticleInWarehouse
                && code == (((ArticleInWarehouse)other).code);
    }

    /**
     * Implementazione del metodo hashCode.
     * 
     * @return int, valore hash code
     */
    @Override
    public int hashCode() {
        return Long.hashCode(code);
    }
}

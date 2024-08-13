package com.culloque.sections;

/**
 * La clase {@code Certification} representa una certificación obtenida por una
 * persona.
 * Incluye detalles sobre el título de la certificación, el emisor y la fecha en
 * la que fue emitida.
 */
public class Certification {

    private String title;
    private String issuer;
    private String date;

    /**
     * Obtiene el título de la certificación.
     * 
     * @return El título de la certificación (por ejemplo, "Certificación en Java").
     */
    public String getTitle() {
        return title;
    }

    /**
     * Establece el título de la certificación.
     * 
     * @param title El título de la certificación (por ejemplo, "Certificación en
     *              Java").
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Obtiene el emisor de la certificación.
     * 
     * @return El emisor de la certificación (por ejemplo, "Oracle").
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * Establece el emisor de la certificación.
     * 
     * @param issuer El emisor de la certificación (por ejemplo, "Oracle").
     */
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * Obtiene la fecha en la que fue emitida la certificación.
     * 
     * @return La fecha de emisión (por ejemplo, "2023-05-15").
     */
    public String getDate() {
        return date;
    }

    /**
     * Establece la fecha en la que fue emitida la certificación.
     * 
     * @param date La fecha de emisión (por ejemplo, "2023-05-15").
     */
    public void setDate(String date) {
        this.date = date;
    }
}

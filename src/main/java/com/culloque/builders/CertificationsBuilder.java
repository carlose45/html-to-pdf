package com.culloque.builders;

import com.culloque.sections.Candidate;
import com.culloque.sections.Certification;

/**
 * La clase {@code CertificationsBuilder} se encarga de construir el contenido
 * HTML
 * para las certificaciones de un candidato, utilizando una plantilla HTML
 * proporcionada.
 * 
 * El contenido se genera a partir de los datos de certificación del candidato y
 * la plantilla HTML
 * que define el formato del contenido de las certificaciones.
 */
public class CertificationsBuilder {

    private Candidate candidate;
    private String educationTemplate;
    private String education;

    /**
     * Constructor de la clase {@code CertificationsBuilder}.
     * 
     * @param educationTemplate La plantilla HTML que se utilizará para generar el
     *                          contenido de las certificaciones.
     * @param candidate         El objeto {@code Candidate} que contiene la
     *                          información de certificación.
     */
    public CertificationsBuilder(String educationTemplate, Candidate candidate) {
        this.candidate = candidate;
        this.educationTemplate = educationTemplate;
    }

    /**
     * Construye el contenido HTML para las certificaciones utilizando la plantilla
     * HTML proporcionada.
     * 
     * @return La instancia actual de {@code CertificationsBuilder} para permitir el
     *         encadenamiento de métodos.
     */
    public CertificationsBuilder buildEducationContent() {
        education = candidate.getCertifications().stream()
                .map(c -> getCertification(educationTemplate, c))
                .reduce("", String::concat);
        return this;
    }

    /**
     * Genera el contenido HTML para una certificación individual utilizando la
     * plantilla HTML.
     * 
     * @param html La plantilla HTML en la que se reemplazarán los marcadores de
     *             posición.
     * @param e    El objeto {@code Certification} con la información que se
     *             insertará en la plantilla.
     * @return El contenido HTML generado para la certificación.
     */
    private String getCertification(String html, Certification e) {
        return html
                .replace("|title|", e.getTitle())
                .replace("|issuer|", e.getIssuer())
                .replace("|date|", e.getDate());
    }

    /**
     * Obtiene el contenido HTML generado para las certificaciones.
     * 
     * @return El contenido HTML que representa todas las certificaciones del
     *         candidato.
     */
    public String getHtml() {
        return education;
    }

}

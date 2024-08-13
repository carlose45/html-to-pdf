package com.culloque.builders;

import com.culloque.sections.Candidate;
import com.culloque.sections.Education;

/**
 * La clase {@code EducationBuilder} se encarga de construir el contenido HTML
 * para la educación de un candidato, utilizando una plantilla HTML proporcionada.
 * 
 * El contenido se genera a partir de los datos educativos del candidato y la plantilla HTML
 * que define el formato del contenido educativo.
 */
public class EducationBuilder {

    private Candidate candidate;
    private String educationTemplate;
    private String education;

    /**
     * Constructor de la clase {@code EducationBuilder}.
     * 
     * @param educationTemplate La plantilla HTML que se utilizará para generar el contenido educativo.
     * @param candidate El objeto {@code Candidate} que contiene la información educativa.
     */
    public EducationBuilder(String educationTemplate, Candidate candidate) {
        this.candidate = candidate;
        this.educationTemplate = educationTemplate;
    }

    /**
     * Construye el contenido HTML para la educación utilizando la plantilla HTML proporcionada.
     * 
     * @return La instancia actual de {@code EducationBuilder} para permitir el encadenamiento de métodos.
     */
    public EducationBuilder buildEducationContent() {
        education = candidate.getEducation().stream()
                .map(e -> getEducation(educationTemplate, e))
                .reduce("", String::concat);
        return this;
    }

    /**
     * Genera el contenido HTML para una educación individual utilizando la plantilla HTML.
     * 
     * @param html La plantilla HTML en la que se reemplazarán los marcadores de posición.
     * @param e El objeto {@code Education} con la información que se insertará en la plantilla.
     * @return El contenido HTML generado para la educación.
     */
    private String getEducation(String html, Education e) {
        return html
                .replace("|title|", e.getTitle())
                .replace("|university|", e.getUniversity())
                .replace("|dateFrom|", e.getDateFrom())
                .replace("|dateTo|", e.getDateTo());
    }

    /**
     * Obtiene el contenido HTML generado para la educación.
     * 
     * @return El contenido HTML que representa toda la información educativa del candidato.
     */
    public String getHtml() {
        return education;
    }

}

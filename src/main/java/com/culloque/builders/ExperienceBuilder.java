package com.culloque.builders;

import java.util.List;

import com.culloque.sections.Candidate;
import com.culloque.sections.Experience;

/**
 * La clase {@code ExperienceBuilder} se encarga de construir el contenido HTML
 * para la experiencia laboral de un candidato, utilizando una plantilla HTML proporcionada.
 * 
 * El contenido se genera a partir de los datos de experiencia del candidato y la plantilla HTML
 * que define el formato del contenido de experiencia laboral.
 */
public class ExperienceBuilder {

    private Candidate candidate;
    private String experienceTemplate;
    private String experience;

    /**
     * Constructor de la clase {@code ExperienceBuilder}.
     * 
     * @param experienceTemplate La plantilla HTML que se utilizará para generar el contenido de experiencia.
     * @param candidate El objeto {@code Candidate} que contiene la información de experiencia.
     */
    public ExperienceBuilder(String experienceTemplate, Candidate candidate) {
        this.candidate = candidate;
        this.experienceTemplate = experienceTemplate;
    }

    /**
     * Construye el contenido HTML para la experiencia laboral utilizando la plantilla HTML proporcionada.
     * 
     * @return La instancia actual de {@code ExperienceBuilder} para permitir el encadenamiento de métodos.
     */
    public ExperienceBuilder buildExperienceContent() {
        experience = candidate.getExperiences().stream()
            .map(e -> getExperience(experienceTemplate, e))
            .reduce("", String::concat);
        return this;
    }

    /**
     * Genera el contenido HTML para una experiencia laboral individual utilizando la plantilla HTML.
     * 
     * @param html La plantilla HTML en la que se reemplazarán los marcadores de posición.
     * @param e El objeto {@code Experience} con la información que se insertará en la plantilla.
     * @return El contenido HTML generado para la experiencia laboral.
     */
    private String getExperience(String html, Experience e) {
        return html
                .replace("|keyResponsibilities|", getItemList(e.getKeyResponsibilities()))
                .replace("|outstandingAchievements|", getItemList(e.getOutstandingAchievements()))
                .replace("|technologiesUsed|", getItemList(e.getTechnologiesUsed()))
                .replace("|title|", e.getTitle())
                .replace("|workplace|", e.getWorkplace())
                .replace("|dateFrom|", e.getDateFrom())
                .replace("|dateTo|", e.getDateTo())
                .replace("|description|", e.getDescription());
    }

    /**
     * Convierte una lista de elementos en una lista HTML (<li>...</li>).
     * 
     * @param items La lista de elementos a convertir en HTML.
     * @return Una cadena con la lista HTML generada.
     */
    private String getItemList(List<String> items) {
        return "<li>" + String.join("</li><li>", items) + "</li>";
    }

    /**
     * Obtiene el contenido HTML generado para la experiencia laboral.
     * 
     * @return El contenido HTML que representa toda la experiencia laboral del candidato.
     */
    public String getHtml() {
        return experience;
    }
}

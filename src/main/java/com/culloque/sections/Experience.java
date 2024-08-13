package com.culloque.sections;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase {@code Experience} representa la experiencia laboral de una persona.
 * Incluye detalles sobre el título del puesto, el lugar de trabajo, las fechas
 * de inicio y fin,
 * una descripción general del rol, y listas de responsabilidades clave, logros
 * destacados y tecnologías utilizadas.
 */
public class Experience {

    private String title;
    private String workplace;
    private String dateFrom;
    private String dateTo;
    private String description;
    private List<String> keyResponsibilities;
    private List<String> outstandingAchievements;
    private List<String> technologiesUsed;

    /**
     * Constructor por defecto de la clase {@code Experience}.
     * Inicializa las listas de responsabilidades clave, logros destacados y
     * tecnologías utilizadas.
     */
    public Experience() {
        keyResponsibilities = new ArrayList<>();
        outstandingAchievements = new ArrayList<>();
        technologiesUsed = new ArrayList<>();
    }

    /**
     * Establece el título del puesto en la experiencia laboral.
     * 
     * @param title El título del puesto (por ejemplo, "Desarrollador de Software").
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Establece el lugar de trabajo para la experiencia laboral.
     * 
     * @param workplace El nombre del lugar de trabajo (por ejemplo, "TechCorp").
     */
    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    /**
     * Establece la fecha de inicio del período de experiencia laboral.
     * 
     * @param dateFrom La fecha de inicio (por ejemplo, "2021-06-01").
     */
    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    /**
     * Establece la fecha de fin del período de experiencia laboral.
     * 
     * @param dateTo La fecha de fin (por ejemplo, "2023-08-31").
     */
    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    /**
     * Establece una descripción general del rol y las responsabilidades en el
     * puesto.
     * 
     * @param description La descripción del rol (por ejemplo, "Desarrollo de
     *                    aplicaciones web").
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Añade una responsabilidad clave asociada con el puesto.
     * 
     * @param keyResponsibility La responsabilidad clave (por ejemplo, "Liderar el
     *                          equipo de desarrollo").
     */
    public void addKeyResponsibilities(String keyResponsibility) {
        this.keyResponsibilities.add(keyResponsibility);
    }

    /**
     * Añade un logro destacado asociado con el puesto.
     * 
     * @param outstandingAchievement El logro destacado (por ejemplo,
     *                               "Implementación exitosa de un nuevo sistema").
     */
    public void addOutstandingAchievements(String outstandingAchievement) {
        this.outstandingAchievements.add(outstandingAchievement);
    }

    /**
     * Añade una tecnología utilizada en el rol.
     * 
     * @param technologyUsed La tecnología utilizada (por ejemplo, "Java").
     */
    public void addTechnologiesUsed(String technologyUsed) {
        this.technologiesUsed.add(technologyUsed);
    }

    /**
     * Obtiene el título del puesto en la experiencia laboral.
     * 
     * @return El título del puesto (por ejemplo, "Desarrollador de Software").
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Obtiene el lugar de trabajo para la experiencia laboral.
     * 
     * @return El nombre del lugar de trabajo (por ejemplo, "TechCorp").
     */
    public String getWorkplace() {
        return this.workplace;
    }

    /**
     * Obtiene la fecha de inicio del período de experiencia laboral.
     * 
     * @return La fecha de inicio (por ejemplo, "2021-06-01").
     */
    public String getDateFrom() {
        return this.dateFrom;
    }

    /**
     * Obtiene la fecha de fin del período de experiencia laboral.
     * 
     * @return La fecha de fin (por ejemplo, "2023-08-31").
     */
    public String getDateTo() {
        return this.dateTo;
    }

    /**
     * Obtiene una descripción general del rol y las responsabilidades en el puesto.
     * 
     * @return La descripción del rol (por ejemplo, "Desarrollo de aplicaciones
     *         web").
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Obtiene la lista de responsabilidades clave asociadas con el puesto.
     * 
     * @return Una lista de responsabilidades clave.
     */
    public List<String> getKeyResponsibilities() {
        return this.keyResponsibilities;
    }

    /**
     * Obtiene la lista de logros destacados asociados con el puesto.
     * 
     * @return Una lista de logros destacados.
     */
    public List<String> getOutstandingAchievements() {
        return this.outstandingAchievements;
    }

    /**
     * Obtiene la lista de tecnologías utilizadas en el rol.
     * 
     * @return Una lista de tecnologías utilizadas.
     */
    public List<String> getTechnologiesUsed() {
        return this.technologiesUsed;
    }

}

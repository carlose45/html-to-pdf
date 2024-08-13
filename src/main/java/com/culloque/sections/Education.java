package com.culloque.sections;

/**
 * La clase {@code Education} representa la información educativa de una
 * persona.
 * Contiene detalles sobre el título obtenido, la universidad donde se estudió,
 * y las fechas de inicio y fin del período de estudio.
 */
public class Education {

    private String title;
    private String university;
    private String dateFrom;
    private String dateTo;

    /**
     * Constructor por defecto de la clase {@code Education}.
     * Inicializa una instancia sin establecer valores iniciales.
     */
    public Education() {
    }

    /**
     * Establece el título obtenido en la educación.
     * 
     * @param title El título obtenido (por ejemplo, "Licenciatura en Informática").
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Establece el nombre de la universidad donde se realizó el estudio.
     * 
     * @param university El nombre de la universidad (por ejemplo, "Universidad de
     *                   la Tecnología").
     */
    public void setUniversity(String university) {
        this.university = university;
    }

    /**
     * Establece la fecha de inicio del período de estudio.
     * 
     * @param dateFrom La fecha de inicio (por ejemplo, "2020-01-01").
     */
    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    /**
     * Establece la fecha de fin del período de estudio.
     * 
     * @param dateTo La fecha de fin (por ejemplo, "2024-05-31").
     */
    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    /**
     * Obtiene el título obtenido en la educación.
     * 
     * @return El título obtenido (por ejemplo, "Licenciatura en Informática").
     */
    public String getTitle() {
        return title;
    }

    /**
     * Obtiene el nombre de la universidad donde se realizó el estudio.
     * 
     * @return El nombre de la universidad (por ejemplo, "Universidad de la
     *         Tecnología").
     */
    public String getUniversity() {
        return university;
    }

    /**
     * Obtiene la fecha de inicio del período de estudio.
     * 
     * @return La fecha de inicio (por ejemplo, "2020-01-01").
     */
    public String getDateFrom() {
        return dateFrom;
    }

    /**
     * Obtiene la fecha de fin del período de estudio.
     * 
     * @return La fecha de fin (por ejemplo, "2024-05-31").
     */
    public String getDateTo() {
        return dateTo;
    }

}

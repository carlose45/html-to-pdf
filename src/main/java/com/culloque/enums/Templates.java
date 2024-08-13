package com.culloque.enums;

/**
 * El enum {@code Templates} define una serie de plantillas utilizadas para
 * generar documentos
 * en diferentes formatos. Cada plantilla tiene un nombre de archivo y,
 * opcionalmente, una sección
 * asociada que puede ser reemplazada o utilizada en el proceso de generación.
 */
public enum Templates {
    STYLE("style.html&&|templateCss|"),
    MAIN("template.html"),
    FULLNAME("&&|candidate.name|"),
    EMAIL("&&|candidate.email|"),
    PHONE("&&|candidate.phone|"),
    PROFILE("&&|candidate.profile|"),
    CERTIFICATION("certification.html&&|certifications|"),
    EDUCATION("education.html&&|educations|"),
    EXPERIENCE("experience.html&&|experiences|"),
    FINALPDF("final.pdf");

    private final String filename;
    private final String section;

    /**
     * Constructor del enum {@code Templates}.
     * Separa el string de ruta en nombre de archivo y sección usando el delimitador
     * "&&".
     * 
     * @param route La ruta del archivo y la sección (por ejemplo,
     *              "style.html&&|templateCss|").
     */
    Templates(String route) {
        String[] parts = route.split("&&", 2);
        this.filename = parts.length > 0 ? parts[0] : null;
        this.section = parts.length > 1 ? parts[1] : null;
    }

    /**
     * Obtiene el nombre del archivo asociado con la plantilla.
     * 
     * @return El nombre del archivo (por ejemplo, "style.html").
     */
    public String getFileName() {
        return this.filename;
    }

    /**
     * Obtiene la sección asociada con la plantilla, si existe.
     * 
     * @return La sección (por ejemplo, "|templateCss|"), o {@code null} si no hay
     *         sección.
     */
    public String getSection() {
        return this.section;
    }
}

package com.culloque.utils;

import java.nio.file.Path;
import java.util.Map;
import com.culloque.builders.CertificationsBuilder;
import com.culloque.builders.EducationBuilder;
import com.culloque.builders.ExperienceBuilder;
import com.culloque.builders.HtmlBuilder;
import com.culloque.enums.Templates;
import com.culloque.sections.Candidate;

/**
 * La clase {@code ArmarCV} implementa la interfaz {@code IRunnable<Void>} y se encarga de construir un currículum vitae (CV)
 * a partir de la información de un {@code Candidate}. El CV es generado como un archivo PDF que se visualiza automáticamente.
 * 
 * Este proceso incluye la carga de plantillas HTML y CSS, la generación de contenido para experiencias, educación y certificaciones,
 * y la conversión final a PDF.
 */
public class ArmarCV implements IRunnable<Void> {

    private Candidate candidate;

    // Map de títulos para reemplazo en el HTML
    private static final Map<String, String> titles = Map.of(
        "|keyResponsibilities.title|", "Responsabilidades Clave",
        "|outstandingAchievements.title|", "Logros Destacados",
        "|technologiesUsed.tittle|", "Tecnologías Usadas",
        "|tittle.experience|", "Experiencia Laboral",
        "|tittle.education|", "Educación",
        "|tittle.certification|", "Certificaciones"
    );

    /**
     * Constructor de la clase {@code ArmarCV}.
     * 
     * @param candidate El candidato cuyo CV se desea construir.
     */
    public ArmarCV(Candidate candidate) {
        this.candidate = candidate;
    }

    /**
     * Ejecuta el proceso de construcción del CV:
     * <ol>
     *   <li>Lee las plantillas HTML y CSS desde los archivos.</li>
     *   <li>Genera contenido para experiencias, educación y certificaciones utilizando los constructores correspondientes.</li>
     *   <li>Integra el contenido generado en el HTML de la plantilla principal.</li>
     *   <li>Convierte el HTML completo en un archivo PDF.</li>
     *   <li>Visualiza el archivo PDF resultante.</li>
     * </ol>
     * 
     * @return {@code null} después de completar el proceso.
     */
    @Override
    public Void run() {
        final PathManager pm = new PathManager();

        Path htmlFilePath = pm.getPath(Templates.MAIN);
        String pdfFilePath = pm.getPath(Templates.FINALPDF).toString();

        // Cargar plantillas HTML y CSS
        String html = new TemplateRenderer(htmlFilePath).run();
        String css = new TemplateRenderer(pm.getPath(Templates.STYLE)).run();
        String experienceTemplate = new TemplateRenderer(pm.getPath(Templates.EXPERIENCE)).run();
        String educationTemplate = new TemplateRenderer(pm.getPath(Templates.EDUCATION)).run();
        String certificationTemplate = new TemplateRenderer(pm.getPath(Templates.CERTIFICATION)).run();

        // Generar contenido para experiencia, educación y certificaciones
        String experience = new ExperienceBuilder(experienceTemplate, candidate)
                .buildExperienceContent()
                .getHtml();
        String education = new EducationBuilder(educationTemplate, candidate)
                .buildEducationContent()
                .getHtml();
        String certifications = new CertificationsBuilder(certificationTemplate, candidate)
                .buildEducationContent() // Parece un error, debería ser buildCertificationContent
                .getHtml();

        // Integrar el contenido en el HTML principal
        html = new HtmlBuilder(html)
                .withStyle(css)
                .withEmail(candidate.getEmail())
                .withFullName(candidate.getFullName())
                .withPhone(candidate.getPhone())
                .withProfile(candidate.getProfile())
                .withExperience(experience)
                .withEducation(education)
                .withCertifications(certifications)
                .withTitles(titles)
                .toHtml();

        // Convertir el HTML a PDF
        new HtmlToPDF(html, pdfFilePath).run();

        // Visualizar el archivo PDF resultante
        new PDFVisor().visor(pdfFilePath);

        return null;
    }
}

package com.culloque;

import com.culloque.sections.Candidate;
import com.culloque.sections.Certification;
import com.culloque.sections.Education;
import com.culloque.sections.Experience;
import com.culloque.utils.ArmarCV;

/**
 * La clase {@code Main} es el punto de entrada de la aplicación que configura un candidato
 * con su información personal, experiencia laboral, educación y certificaciones. Luego,
 * utiliza la clase {@code ArmarCV} para generar un CV en formato PDF basado en esta información.
 */
public class Main {
    public static void main(String[] args) {

        // Crear un objeto Candidate
        Candidate candidate = new Candidate();
        
        // Configurar información personal del candidato
        candidate.setFullName("Carlos Ulloque");
        candidate.setEmail("culloque@icloud.com");
        candidate.setPhone("(+57) 3153940196");
        
        // Definir el perfil del candidato en formato HTML
        StringBuilder profile = new StringBuilder();
            profile.append("<br>Profesional en Tecnología de la Información con amplia experiencia en arquitectura y desarrollo de aplicaciones, diseño de bases de datos y administración de infraestructura. Capacitado para traducir la visión del producto en soluciones técnicas tangibles y de alta calidad, con habilidades para mantenerme actualizado con las últimas tendencias tecnológicas y comunicar conceptos técnicos complejos de manera efectiva. Poseo conocimientos en tecnologías de computación en la nube como Oracle Cloud Infrastructure (OCI) y Amazon Web Services (AWS).");
            profile.append("<br>");
            profile.append("<br>Demuestro adaptabilidad rápida a nuevas tecnologías y capacidad para pensar de manera abstracta, lo que me permite mantener la agilidad y versatilidad en entornos tecnológicos en constante cambio. Como líder técnico, aplico las mejores prácticas, incluyendo la metodología ágil y los principios de ITIL, y utilizo ArchiMate para modelar arquitecturas empresariales. Promuevo la implementación de patrones de diseño en el desarrollo de software, con un enfoque prioritario en la seguridad y protección de datos. Mi experiencia en Scrum y otras metodologías ágiles garantiza resultados exitosos e integrados con las perspectivas del cliente para desarrollar soluciones de software innovadoras.");
            profile.append("<br>");
            profile.append("<br><b>Habilidades avanzadas</b> Java, Spring, SQL Server, T-SQL, Python, Docker, Oracle Fusion Middleware");
            profile.append("<br><b>Habilidades intermedias</b> AWS, JavaScript, Jenkins, Git, MySQL, Node.js");
            profile.append("<br><b>Conocimientos prácticos</b> OCI, TypeScript, Oracle Db, Postgres, Mongo DB, PHP");
            profile.append("<br><p>Cuento con un nivel B1 de inglés y certificaciones en Oracle OCI, Oracle WebLogic e ITIL Foundation.</p>");

        // Configurar experiencia laboral del candidato
        Experience experience1 = new Experience();
        experience1.setTitle("Líder de Producto de Software");
        experience1.setWorkplace("Fundación Cardiovascular de Colombia");
        experience1.setDateFrom("Enero 2019");
        experience1.setDateTo("Mayo 2023");
        experience1.setDescription("Como Líder de Producto de Software, mi principal responsabilidad fue estimar y supervisar proyectos, diseñando arquitecturas sólidas, escalables y altamente disponibles, integrables con terceros, mientras mantenía estándares de calidad excepcionales. Me enfoqué en ofrecer mejoras continuas al producto, alineadas con las expectativas establecidas.");
        experience1.addKeyResponsibilities("Definición y priorización de características y funcionalidades del producto.");
        experience1.addKeyResponsibilities("Coordinación estrecha con el equipo de desarrollo para cumplir objetivos y necesidades del cliente.");
        experience1.addKeyResponsibilities("Toma de decisiones estratégicas sobre el desarrollo y evolución del producto, manteniendo una visión a largo plazo.");
        experience1.addOutstandingAchievements("Concebí y desarrollé una aplicación para integrar datos clínicos en entornos transaccionales, optimizando procesos de análisis e inteligencia de negocios, y generando informes de alto nivel en tiempo real.");
        experience1.addOutstandingAchievements("Lideré el desarrollo de una aplicación de videoconferencia para Telemedicina, mejorando la comunicación eficiente y segura con adherencia a los estándares de protección de datos.");
        experience1.addOutstandingAchievements("Desarrollé una aplicación de gestión de acceso basada en reconocimiento facial, mejorando significativamente los tiempos de acceso y reduciendo las colas en la entrada de pacientes, visitantes y empleados.");
        experience1.addOutstandingAchievements("Participé en equipos de investigación para construir y desarrollar modelos de aprendizaje automático, apoyando la toma de decisiones médicas y permitiendo decisiones informadas y precisas por parte del personal de atención.");
        experience1.addTechnologiesUsed("<b>Lenguajes y Frameworks:</b> Java 8, Python, SpringBoot, Angular");
        experience1.addTechnologiesUsed("<b>Contenedores y Nube:</b> Docker, AWS (EC2, S3, Lambdas (Java, Python))");
        experience1.addTechnologiesUsed("<b>Arquitectura y Servicios:</b> Microservicios, Web Services (SOAP, REST)");
        experience1.addTechnologiesUsed("<b>Bases de Datos:</b> SQL Server (T-SQL), MySQL, MongoDB");
        experience1.addTechnologiesUsed("<b>Metodologías y Herramientas:</b> CI/CD, Scrum, Agile");
        candidate.addExperience(experience1);

        Experience experience2 = new Experience();
        experience2.setTitle("Consultor en Tecnologías de la Información");
        experience2.setWorkplace("Cable & Wireless Business, Panamá");
        experience2.setDateFrom("Enero 2014");
        experience2.setDateTo("Enero 2018");
        experience2.setDescription("Como miembro clave del equipo, contribuí a la implementación, automatización y soporte del proyecto <i>“Adquisición de Herramientas de Middleware, Servicios y Capacitación para la Implementación de una Plataforma Integral de Integración y Desarrollo de Software”</i> para la Autoridad del Canal de Panamá. Trabajé en un entorno de alta disponibilidad, garantizando la continuidad ininterrumpida del servicio.");
        experience2.addKeyResponsibilities("Participación activa en la implementación de soluciones de middleware Oracle y herramientas asociadas.");
        experience2.addKeyResponsibilities("Automatización de procesos y soporte continuo para asegurar la operatividad de la plataforma en un entorno crítico.");
        experience2.addKeyResponsibilities("Desarrollo de habilidades avanzadas en la gestión de proyectos a gran escala y en la implementación de soluciones de alta disponibilidad.");
        experience2.addOutstandingAchievements("Aseguré la continuidad del servicio en un entorno de alta disponibilidad, gestionando eficientemente la integración y el desarrollo de software para la Autoridad del Canal de Panamá.");
        experience2.addOutstandingAchievements("Mejoré la eficiencia del proyecto mediante la automatización de procesos y el soporte técnico, optimizando la plataforma de integración y desarrollo de software.");
        experience2.addTechnologiesUsed("<b>Middleware y Bases de Datos:</b> Oracle Fusion Middleware, Oracle Db");
        experience2.addTechnologiesUsed("<b>Lenguajes y Herramientas:</b> Python, BashScript");
        candidate.addExperience(experience2);

        Experience experience3 = new Experience();
        experience3.setTitle("Consultor SOA");
        experience3.setWorkplace("Assist Consultores Centroamérica, Costa Rica");
        experience3.setDateFrom("Junio 2012");
        experience3.setDateTo("Diciembre 2013");
        experience3.setDescription("Participé en proyectos en múltiples instituciones financieras, donde definí pautas de diseño, arquitectura y detalles técnicos en proyectos SOA. Brindé soporte conceptual y tecnológico a desarrolladores, clientes y expertos en negocios. Desempeñé un papel clave en la definición e implementación de la arquitectura del proyecto <i>“Diseño e Implementación de Aplicaciones en la Plataforma de Integración Oracle SOA Suite”</i> en el Banco Nacional de Costa Rica (BNCR). También gestioné exitosamente la instalación y configuración del plugin ArchiMate para RSA en el Banco Central de Costa Rica (BCR).");
        experience3.addKeyResponsibilities("Definición de pautas de diseño y arquitectura para proyectos SOA en instituciones financieras.");
        experience3.addKeyResponsibilities("Soporte técnico y conceptual a desarrolladores, clientes y expertos en negocios.");
        experience3.addKeyResponsibilities("Implementación de la arquitectura para la plataforma Oracle SOA Suite en el BNCR.");
        experience3.addKeyResponsibilities("Instalación y configuración del plugin ArchiMate para RSA en el BCR.");
        experience3.addOutstandingAchievements("Contribuí significativamente al diseño e implementación de aplicaciones en la plataforma Oracle SOA Suite, mejorando la integración y eficiencia en el BNCR.");
        experience3.addOutstandingAchievements("Gestioné con éxito la instalación del plugin ArchiMate, optimizando la modelización y documentación de procesos en el Banco Central de Costa Rica.");
        experience3.addTechnologiesUsed("<b>Middleware y Bases de Datos:</b> Oracle Fusion Middleware, ArchiMate");
        experience3.addTechnologiesUsed("<b>Metodologías y Normas:</b> ITIL");
        candidate.addExperience(experience3);

        // Establecer perfil del candidato
        candidate.setProfile(profile.toString());

        // Configurar educación del candidato
        Education education1 = new Education();
        education1.setTitle("Maestría en Ingeniería de Análisis de Datos, Mejora de Procesos y Toma de Decisiones");
        education1.setUniversity("Universidad Politécnica de Valencia (UPV), España");
        education1.setDateFrom("2017");
        education1.setDateTo("2019");
        candidate.addEducation(education1);

        Education education2 = new Education();
        education2.setTitle("Profesional en Ingeniería de Sistemas con Énfasis en Telecomunicaciones");
        education2.setUniversity("Universidad Cooperativa de Colombia");
        education2.setDateFrom("1999");
        education2.setDateTo("2004");
        candidate.addEducation(education2);

        // Configurar certificaciones del candidato
        Certification certification1 = new Certification();
        certification1.setTitle("Oracle Cloud Infrastructure 2023 Certified Foundations Associate");
        certification1.setIssuer("Oracle");
        certification1.setDate("2023");
        candidate.addCertification(certification1);

        Certification certification2 = new Certification();
        certification2.setTitle("Data Science for ALL | DS4A / Colombia 2.0: Graduated with Honors");
        certification2.setIssuer("Correlation One");
        certification2.setDate("2020");
        candidate.addCertification(certification2);

        Certification certification3 = new Certification();
        certification3.setTitle("ITIL Foundation Certificate in IT Service Management");
        certification3.setIssuer("AXELOS Global Best Practice");
        certification3.setDate("2014");
        candidate.addCertification(certification3);

        Certification certification4 = new Certification();
        certification4.setTitle("Oracle Certified Associate, Oracle WebLogic Server 11g System Administrator");
        certification4.setIssuer("Oracle");
        certification4.setDate("2014");
        candidate.addCertification(certification4);

        Certification certification5 = new Certification();
        certification5.setTitle("Oracle Service Oriented Architecture Infrastructure Implementation Certified Expert");
        certification5.setIssuer("Oracle");
        certification5.setDate("2012");
        candidate.addCertification(certification5);

        // Construir el CV y generarlo en PDF
        new ArmarCV(candidate).run();
    }
}

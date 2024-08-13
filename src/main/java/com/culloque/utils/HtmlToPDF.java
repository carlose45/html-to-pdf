package com.culloque.utils;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import java.io.FileOutputStream;

/**
 * La clase {@code HtmlToPDF} implementa la interfaz {@code IRunnable<Boolean>} y se encarga de convertir contenido HTML en un archivo PDF.
 * 
 * Utiliza la biblioteca iText para realizar la conversión, estableciendo un tamaño de página personalizado para el PDF generado.
 */
public class HtmlToPDF implements IRunnable<Boolean> {

    private String html;
    private String pdfFilePath;

    /**
     * Constructor de la clase {@code HtmlToPDF}.
     * 
     * @param html El contenido HTML que se convertirá en PDF.
     * @param pdfFilePath La ruta del archivo PDF de salida.
     */
    public HtmlToPDF(String html, String pdfFilePath) {
        this.html = html;
        this.pdfFilePath = pdfFilePath;
    }
    
    /**
     * Convierte el contenido HTML en un archivo PDF utilizando la biblioteca iText.
     * 
     * Establece un tamaño de página personalizado para el PDF y guarda el archivo en la ruta especificada.
     * 
     * @return {@code true} si la conversión fue exitosa; {@code false} en caso contrario.
     */
    @Override
    public Boolean run() {
        float width = PageSize.LETTER.getWidth();
        float height = PageSize.LETTER.getHeight() * 2.5f;
        PageSize customPageSize = new PageSize(width, height);

        try {
            PdfWriter writer = new PdfWriter(new FileOutputStream(pdfFilePath));
            PdfDocument pdfDocument = new PdfDocument(writer);
            pdfDocument.setDefaultPageSize(customPageSize);
            ConverterProperties converterProperties = new ConverterProperties();
            HtmlConverter.convertToPdf(html, pdfDocument, converterProperties);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

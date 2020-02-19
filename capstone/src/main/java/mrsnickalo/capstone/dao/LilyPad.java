package mrsnickalo.capstone.dao;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import marvin.image.MarvinImage;
import marvin.io.MarvinImageIO;
import static marvinplugins.MarvinPluginCollection.*;
import mrsnickalo.capstone.entity.Song;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 12, 2020
 */

@Repository
public class LilyPad 
{
    public void trimWhiteSpaces(Song song)
    {
        trimWhiteSpaceImage(song.getTitle().replaceAll(" ", "") + "Soprano.png");
        trimWhiteSpaceImage(song.getTitle().replaceAll(" ", "") + "Alto.png");
        trimWhiteSpaceImage(song.getTitle().replaceAll(" ", "") + "Tenor.png");
        trimWhiteSpaceImage(song.getTitle().replaceAll(" ", "") + "Bass.png");
    }
    
    public void createImages(Song song)
    {
        convertToImage(song.getTitle().replaceAll(" ", "") + "Soprano.pdf");
        convertToImage(song.getTitle().replaceAll(" ", "") + "Alto.pdf");
        convertToImage(song.getTitle().replaceAll(" ", "") + "Tenor.pdf");
        convertToImage(song.getTitle().replaceAll(" ", "") + "Bass.pdf"); 
    }
    
    public void createLilyPad(Song song)
    {
        try
        { 
            String soprano = song.getSoprano();
            soprano = convertToLilypad(soprano, song.getTitle(), "soprano");
            String alto = song.getAlto();
            alto = convertToLilypad(alto, song.getTitle(), "alto");
            String tenor = song.getTenor();
            tenor = convertToLilypad(tenor, song.getTitle(), "tenor");
            String bass = song.getBass();
            bass = convertToLilypad(bass, song.getBass(), "bass");
            String destinationDirSoprano = "C:/Users/Lindsay Gen10/Documents/NetBeansProjects/capstone/src/main/resources/templates/pdfs/" 
                    + song.getTitle().replaceAll(" ", "") + "Soprano.ly";
            File outputFileSoprano = new File(destinationDirSoprano);
            if(outputFileSoprano.exists())
            {
                outputFileSoprano.delete();
            }
            FileWriter writer = new FileWriter(outputFileSoprano);
            BufferedWriter buff = new BufferedWriter(writer);
            buff.write(soprano);
            buff.flush();
            buff.close();
            writer.close();
            String destinationDirAlto = "C:/Users/Lindsay Gen10/Documents/NetBeansProjects/capstone/src/main/resources/templates/pdfs/" 
                    + song.getTitle().replaceAll(" ", "") + "Alto.ly";
            File outputFileAlto = new File(destinationDirAlto);
            if(outputFileAlto.exists())
            {
                outputFileAlto.delete();
            }
            writer = new FileWriter(outputFileAlto);
            buff = new BufferedWriter(writer);
            buff.write(alto);
            buff.flush();
            buff.close();
            writer.close();
            String destinationDirTenor = "C:/Users/Lindsay Gen10/Documents/NetBeansProjects/capstone/src/main/resources/templates/pdfs/" 
                    + song.getTitle().replaceAll(" ", "") + "Tenor.ly";
            File outputFileTenor = new File(destinationDirTenor);
            if(outputFileTenor.exists())
            {
                outputFileTenor.delete();
            }
            writer = new FileWriter(outputFileTenor);
            buff = new BufferedWriter(writer);
            buff.write(tenor);
            buff.flush();
            buff.close();
            writer.close();
            String destinationDirBass = "C:/Users/Lindsay Gen10/Documents/NetBeansProjects/capstone/src/main/resources/templates/pdfs/" 
                    + song.getTitle().replaceAll(" ", "") + "Bass.ly";
            File outputFileBass = new File(destinationDirBass);
            if(outputFileBass.exists())
            {
                outputFileBass.delete();
            }
            writer = new FileWriter(outputFileBass);
            buff = new BufferedWriter(writer);
            buff.write(bass);
            buff.flush();
            buff.close();
            writer.close();
            String destinationScript = "C:/Users/Lindsay Gen10/Documents/NetBeansProjects/capstone/src/main/resources/templates/pdfs/" 
                    + song.getTitle().replaceAll(" ", "") + "Script.sh";
            File outputFileScript = new File(destinationScript);
            if(outputFileScript.exists())
            {
                outputFileScript.delete();
            }
            writer = new FileWriter(outputFileScript);
            buff = new BufferedWriter(writer);
            String text = "#!/bin/bash \n";
            buff.write(text);
            text = "lilypond ";
            text += "C:/Users/Lindsay\\ Gen10/Documents/NetBeansProjects/capstone/src/main/resources/templates/pdfs/"; 
            text += song.getTitle().replaceAll(" ", "") + "Soprano.ly \n";
            text += "mv " + song.getTitle().replaceAll(" ", "") + "Soprano.pdf ";
            text += "C:/Users/Lindsay\\ Gen10/Documents/NetBeansProjects/capstone/src/main/resources/templates/pdfs/ \n";
            buff.write(text);
            text = "lilypond ";
            text += "C:/Users/Lindsay\\ Gen10/Documents/NetBeansProjects/capstone/src/main/resources/templates/pdfs/"; 
            text += song.getTitle().replaceAll(" ", "") + "Alto.ly \n";
            text += "mv " + song.getTitle().replaceAll(" ", "") + "Alto.pdf ";
            text += "C:/Users/Lindsay\\ Gen10/Documents/NetBeansProjects/capstone/src/main/resources/templates/pdfs/ \n";
            buff.write(text);
            text = "lilypond ";
            text += "C:/Users/Lindsay\\ Gen10/Documents/NetBeansProjects/capstone/src/main/resources/templates/pdfs/"; 
            text += song.getTitle().replaceAll(" ", "") + "Tenor.ly \n";
            text += "mv " + song.getTitle().replaceAll(" ", "") + "Tenor.pdf ";
            text += "C:/Users/Lindsay\\ Gen10/Documents/NetBeansProjects/capstone/src/main/resources/templates/pdfs/ \n";
            buff.write(text);
            text = "lilypond ";
            text += "C:/Users/Lindsay\\ Gen10/Documents/NetBeansProjects/capstone/src/main/resources/templates/pdfs/"; 
            text += song.getTitle().replaceAll(" ", "") + "Bass.ly \n";
            text += "mv " + song.getTitle().replaceAll(" ", "") + "Bass.pdf ";
            text += "C:/Users/Lindsay\\ Gen10/Documents/NetBeansProjects/capstone/src/main/resources/templates/pdfs/ \n";
            buff.write(text);
            buff.flush();
            buff.close();
            writer.close();
            String command = "cmd.exe /C \"C:/Users/Lindsay Gen10/Documents/NetBeansProjects/capstone/src/main/resources/templates/pdfs/" 
                    + song.getTitle().replaceAll(" ", "") + "Script.sh\"";
            Runtime.getRuntime().exec("cmd /c run cmd.exe /K ");
            Process p = Runtime.getRuntime().exec(command);
            p.waitFor();
            createImages(song);
            trimWhiteSpaces(song);
        }
        catch (Exception e) 
        { 
            e.printStackTrace(); 
        }
    }
    
    public String convertToLilypad(String input, String title, String part)
    {
        int count = 1;
        String[] tokens = input.split(" ");
        String output = "";
        output += "\\version \"2.18.2\" \\score { { ";
        if(part.equalsIgnoreCase("soprano") || part.equalsIgnoreCase("alto"))
        {
            output += "\\clef treble \n";
        }
        else
        {
            output += "\\clef bass \n";
        }
        for(String s : tokens)
        {
            if(s.isEmpty() || s.equals(""))
            {
                continue;
            }
            String note = Character.toString(s.charAt(0)).toLowerCase();
            if(note.equals("|"))
            {
                output += " ";
                continue;
            }
            String octave;
            if(s.contains("1"))
            {
                octave = ",,,";
            }
            else if(s.contains("2"))
            {
                octave = ",,";
            }
            else if(s.contains("3"))
            {
                octave = ",";
            }
            else if(s.contains("4"))
            {
                octave = "";
            }
            else if(s.contains("6"))
            {
                octave = "''";
            }
            else if(s.contains("7"))
            {
                octave = "'''";
            }
            else if(s.contains("8"))
            {
                octave = "''''";
            }
            else if(s.contains("9"))
            {
                octave = "'''''";
            }
            else
            {
                octave = "'";
            }
            if(note.equals("r"))
            {
                octave = "";
            }
            boolean sharp = s.contains("#");
            boolean flat = s.contains("b");
            //boolean dot = s.contains(".");
            List<String> length = new ArrayList<>();
            s = s.replaceAll("[^qhwis.]", "");
            switch(s)
            {
                case "":
                    length.add("4");
                    break;
                case "q":
                    length.add("4");
                    break;
                case "h":
                    length.add("2");
                    break;
                case "w":
                    length.add("1");
                    break;
                case "i":
                    length.add("8");
                    break;
                case "s":
                    length.add("16");
                    break;
                case "q.":
                    length.add("4.");
                    break;
                case "h.":
                    length.add("2.");
                    break;
                case "w.":
                    length.add("1.");
                    break;
                case "i.":
                    length.add("8.");
                    break;
                case "s.":
                    length.add("16.");
                    break;
                default:
                    char[] array = s.toCharArray();
                    for(char c : array)
                    {
                        switch(c)
                        {
                            case 'q':
                                length.add("4");
                                break;
                            case 'h':
                                length.add("2");
                                break;
                            case 'w':
                                length.add("1");
                                break;
                            case 'i':
                                length.add("8");
                                break;
                            case 's':
                                length.add("16");
                                break;
                            case '.':
                                length.add(".");
                                break;
                            default:
                        }
                    }
            }
            for(int i=0; i<length.size(); i++)
            {
                if(length.get(i).equals("."))
                {
                    output += ".";
                    continue;
                }
                output += note;
                if(sharp)
                {
                    output += "is";
                }
                else if(flat)
                {
                    output += "es";
                }
                output += octave;
                output += length.get(i);
                if(length.size() > 1 && i < length.size()-1)
                {
                    output += "~";
                }
                output += " ";
                if(count % 4 == 0)
                {
                    output += "\n ";
                }
                if(count %20 == 0)
                {
                    output += " \\bar \"\" \\break \n";
                }
                count ++;
            }
        }
        output += " }";
        output += "\n \\layout { \n \\context { \n \\score \n \\override "
                + "SpacingSpanner.base-shortest-duration = #(ly:make-moment 1/16) \n } \n } \n ";
        output += "\n \\paper{oddFooterMarkup=##f page-count = #1} }";
//        output += " oddHeaderMarkup=##f bookTitleMarkup = ##f scoreTitleMarkup = ##f \n }";
        return output;
    }
    
    public void convertToImage(String source)
    {
        try
        {
            String sourceDir = "C:/Users/Lindsay Gen10/Documents/NetBeansProjects/capstone/src/main/resources/templates/pdfs/" + source;
            String destinationDir = "C:/Users/Lindsay Gen10/Documents/NetBeansProjects/capstone/src/main/resources/static/images/";
            File sourceFile = new File(sourceDir);
            String testName = source.replace("pdf", "png");
            File testFile = new File(destinationDir + testName);
            if(testFile.exists())
            {
                testFile.delete();
            }
            if(sourceFile.exists())
            {
                PDDocument document = PDDocument.load(sourceFile);
                PDFRenderer pdfRenderer = new PDFRenderer(document);
                int numberOfPages = document.getNumberOfPages();
                String fileName = sourceFile.getName().replace("pdf", "");
                String fileExtension = "png";
                int dpi = 300;
                if(numberOfPages == 1)
                {
                    for(int i=0; i<numberOfPages; ++i)
                    {
                        File outputFile = new File(destinationDir + fileName + fileExtension);
                        BufferedImage bImage = pdfRenderer.renderImageWithDPI(i, dpi);
                        ImageIO.write(bImage, fileExtension, outputFile);
                    }
                }
                else
                {
                    for(int i=0; i<numberOfPages; ++i)
                    {
                        File outputFile = new File(destinationDir + i + fileName + fileExtension);
                        BufferedImage bImage = pdfRenderer.renderImageWithDPI(i, dpi);
                        ImageIO.write(bImage, fileExtension, outputFile);
                    }
                    int imagesCount = numberOfPages;
                    BufferedImage[] images = new BufferedImage[imagesCount];
                    for(int j=0; j<images.length; j++)
                    {
                        images[j] = ImageIO.read(new File(destinationDir + j + fileName + fileExtension));
                        Graphics2D g2d = images[j].createGraphics();
                        g2d.drawRect(10, 10, 80, 80);
                        g2d.dispose();
                    }
                    int heightTotal = 0;
                    int maxWidth = 0;
                    for(int j=0; j<images.length; j++)
                    {
                        heightTotal += images[j].getHeight();
                        if(images[j].getWidth() > maxWidth)
                        {
                            maxWidth = images[j].getWidth();
                        }
                    }
                    int heightCurr = 0;
                    BufferedImage concatImage = new BufferedImage(maxWidth, heightTotal, BufferedImage.TYPE_INT_RGB);
                    Graphics2D g2d = concatImage.createGraphics();
                    for(int j=0; j<images.length; j++)
                    {
                        g2d.drawImage(images[j], 0, heightCurr, null);
                        heightCurr += images[j].getHeight();
                    }
                    g2d.dispose();
                    File outputFile = new File(destinationDir + fileName + fileExtension);
                    ImageIO.write(concatImage, fileExtension, outputFile);
                }
                document.close();
            }
            else
            {
                System.out.println("HAVING SOME DIFFICULTIES...");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void trimWhiteSpaceImage(String file)
    {
        BufferedImage img;
        String imageFile = "C:/Users/Lindsay Gen10/Documents/NetBeansProjects/capstone/src/main/resources/static/images/" + file;
        try
        {
            MarvinImage imageOriginal = MarvinImageIO.loadImage(imageFile);
            MarvinImage image = imageOriginal.clone();
            thresholding(image, 250);
            Rectangle r = new Rectangle();
            r.x = -1;
            r.y = -1;
            r.width = -1;
            r.height = -1;
            for(int y=0; y<image.getHeight(); y++)
            {
                for(int x=0; x<image.getWidth(); x++)
                {
                    if(image.getIntColor(x,y) == 0xFF000000)
                    {
                        if(r.x == -1 || x < r.x)
                        {
                            r.x = x;
                        }
                        if(r.width == -1 || x > r.x + r.width)
                        {
                            r.width = x - r.x;
                        }
                        if(r.y == -1 || y < r.y)
                        {
                            r.y = y;
                        }
                        if(r.height == -1 || y > r.y + r.height)
                        {
                            r.height = y - r.y;
                        }
                    }
                }
            }
            Rectangle rect = r;
            crop(imageOriginal, image, rect.x, rect.y, rect.width, rect.height);
            MarvinImageIO.saveImage(image, imageFile);
        }
        catch(Exception e)
        {
            System.out.println("PROBLEM TRIMMING FILE");
        }
    }
}

package com.bigdata.informatioretrieval.utils;

import com.bigdata.informatioretrieval.model.project.PDFBody;
import com.bigdata.informatioretrieval.model.project.ProjectBody;
import org.apache.tika.Tika;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BodyContentHandler;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Zhibin
 * @date 2022-04-11 14:43
 */
public class PDFParserHandel {

    public List<String> PDFToString() {
        try{
            //新建各种存放文件的files文件夹
            File fileDir = new File("/Users/zhangzhibin/Documents/项目文档/科技信息检索/文档");
            Tika tika = new Tika();
            File[] fileArr = fileDir.listFiles();
            List<PDFBody> PDFBodyList = new ArrayList<>();
            List<String> fileContents = new ArrayList<>();
            String fileContent;
            for (File file : fileArr) {
                PDFBody pdfBody = new PDFBody();
                String filename = file.getName();
                pdfBody.setFilename(filename);
                fileContent = tika.parseToString(file);
                fileContents.add(fileContent);
            }
            return (fileContents);
        }catch(Exception e){
            return Collections.singletonList(("error"));
        }
    }
}

package com.bigdata.informatioretrieval.controller;

import com.bigdata.informatioretrieval.utils.PDFParserHandel;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Zhibin
 * @date 2022-04-11 15:30
 */

@RestController
@RequestMapping("/parser")
@RequiredArgsConstructor
public class ParserController {
    @GetMapping("/pdf")
    public List<String> pdfHandle(){
        PDFParserHandel pdfParserHandel = new PDFParserHandel();
        return pdfParserHandel.PDFToString();
    }
}

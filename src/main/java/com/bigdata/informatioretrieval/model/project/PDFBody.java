package com.bigdata.informatioretrieval.model.project;

import lombok.Data;

import java.util.List;

/**
 * @author Zhibin
 * @date 2022-04-11 17:32
 */
@Data
public class PDFBody {
    /**
     * 文件名
     */
    private String filename;

    /**
     * 文件下的项目内容
     */
    private List<ProjectBody> projectBodyList;
}

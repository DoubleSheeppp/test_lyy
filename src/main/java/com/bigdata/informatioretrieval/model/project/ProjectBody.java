package com.bigdata.informatioretrieval.model.project;

import lombok.Data;

/**
 * @author Zhibin
 * @date 2022-04-11 17:28
 */
@Data
public class ProjectBody {
    /**
     * 项目名称
     */
    private String name;
    /**
     * 研究目标
     */
    private String goal;
    /**
     * 研究内容
     */
    private String researchContent;
}

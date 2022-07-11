package com.bigdata.informatioretrieval.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * 公共返回对象枚举
 *
 * @author kz
 * @date 2021-11-01
 */
@Getter
@ToString
@AllArgsConstructor
public enum RespBeanEnum {

    /**
     * 通用：返回成功状态码
     */
    SUCCESS(200, "success"),

    /**
     * 通用：服务端错误状态码
     */
    ERROR(500, "未知错误"),

    /**
     * 交互：参数校验错误
     */
    VALID_ERROR(500100, "参数校验错误"),
    /**
     * 数据库：查询为空
     */
    DB_EMPTY(500200, "数据库查询为空"),

    /**
     * 外部依赖: skywalking查询错误
     */
    SW_ERROR(500300, "skywalking查询出错");

    private final Integer code;
    private final String  message;
}

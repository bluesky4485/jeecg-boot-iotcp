package org.jeecg.modules.message.enums;


import com.alibaba.fastjson.annotation.JSONType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@JSONType(serializeEnumAsJavaBean = true)
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum MessageType {

    HEART("心跳", "heart"),
    DATA("数据", "data"),
    FUNCTION("功能", "function"),
    EVENT("事件", "event"),
    OTHER("其它", "other");

    private String name;
    private String code;
}

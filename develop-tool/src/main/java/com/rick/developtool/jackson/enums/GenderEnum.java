package com.rick.developtool.jackson.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author fengrui
 * @date 2022/11/3
 */
@Getter
@AllArgsConstructor
public enum GenderEnum {
    FEMALE(0, "女"),
    MALE(1, "男"),
    ;

    @JsonValue
    private Integer code;
    private String desc;

    public static final Map<Integer, GenderEnum> MAP = new HashMap<>(values().length);

    static {
        Arrays.stream(values()).forEach(v -> MAP.put(v.getCode(), v));
    }

    public static GenderEnum getEnumByCode(int code) {
        return MAP.get(code);
    }
}

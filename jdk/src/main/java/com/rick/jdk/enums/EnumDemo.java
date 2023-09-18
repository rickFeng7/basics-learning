package com.rick.jdk.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.*;

/**
 * @author fengrui
 * @date 2022/8/16
 */
@Getter
@AllArgsConstructor
public enum EnumDemo implements IDoSomething {
    ENUM_ONE(1, "枚举1") {
        @Override
        public void doSomething() {
        }
    },
    ENUM_TWO(2, "枚举2"),
    ;

    private Integer code;
    private String desc;

    private static final Map<Integer, EnumDemo> MAP = new HashMap<>(values().length);
    private static final List<Map<String, Object>> MAPS = new ArrayList<>();

    static {
        Arrays.stream(values()).forEach(v -> MAP.put(v.getCode(), v));
        Arrays.stream(values()).forEach(v -> MAPS.add(new HashMap<String, Object>() {{
            put("code", v.getCode());
            put("desc", v.getDesc());
        }}));
    }

    public static Map<Integer, EnumDemo> getMap() {
        return MAP;
    }

    public static List<Map<String, Object>> getMaps() {
        return MAPS;
    }

    public static String getDescByCode(int code) {
        return Optional.ofNullable(MAP.get(code)).map(EnumDemo::getDesc).orElse(null);
    }

    public static EnumDemo getEnumByCode(int code) {
        return MAP.get(code);
    }
}

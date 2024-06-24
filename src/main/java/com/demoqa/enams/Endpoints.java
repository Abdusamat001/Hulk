package com.demoqa.enams;

import lombok.Getter;
@Getter
public enum Endpoints {
    ALERT("/alerts"),
    BROWSER_WINDOWS("/browser-windows"),
    BUTTONS("/buttons"),
    FRAMES("/frames"),
    MENU("/menu"),
    PRACTICE_FORM("/automation-practice-form"),
    DYNAMIC_PROPERTIES("/dynamic-properties"),
    PROGRESS_BAR("/progress-bar"),
    SELECT_MENU("/select-menu"),
    TEXT_BOX("/text-box"),
    WEBTABLE("/webtables");


    private final String endpoint;

    Endpoints(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getEndpoint() {
        return endpoint;
    }

}

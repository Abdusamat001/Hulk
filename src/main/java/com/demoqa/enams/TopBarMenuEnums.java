package com.demoqa.enams;

import lombok.Getter;

public enum TopBarMenuEnums {
    USER_MANAGEMENT("User Management",new String[]{"Users"}),
    JOB("Job",new String[]{"Job Titles","Pay Grades","Employment Status","Job Categories","Work Shifts"}),
    ORGANIZATION("Organization",new String[]{"General Information","Locations","Structure"}),
    QUALIFICATION("Qualifications ",new String[]{"Skills","Education","Education","Languages","Memberships"}),
    NATIONALITIES("Nationalities"),
    CORPORATE_BRANDING("Corporate Branding"),
    CONFIGURATION("Configuration", new String[]{"Email Configuration", "Email Subscriptions", "Localization", "Language Packages", "Modules", "Social Media Authentication",
            "Register OAuth Client", "LDAP Configuration"});

    @Getter
    String topBarmenu;
    String[]topBarMenuItems;

    TopBarMenuEnums(String topBarMenu,String... topBarMenuItems){
        this.topBarmenu=topBarMenu;
        this.topBarMenuItems=topBarMenuItems;
    }
}

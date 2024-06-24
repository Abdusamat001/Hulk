package com.demoqa.pages;

import lombok.*;
import org.testng.annotations.BeforeClass;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class DemoQa {
    public AlertPage alertPage;
    public ButtonsPage buttonsPage;
    public FramePage framePage;
    public MenuPage menuPage;
    public PracticeFormPageDate practiceFormPageDate;
    public PracticeFormsPage practiceFormsPage;
    public ProgressBarPage progressBarPage;
    public TextBoxPage textBoxPage;
    public WebTablePage webTablePage;
    public OrangePage orangePage;

    @BeforeClass(alwaysRun = true)
    public void setUp(){
        alertPage = new AlertPage();
        buttonsPage = new ButtonsPage();
        framePage = new FramePage();
        menuPage = new MenuPage();
        practiceFormsPage = new PracticeFormsPage();
        practiceFormPageDate = new PracticeFormPageDate();
        progressBarPage = new ProgressBarPage();
        textBoxPage = new TextBoxPage();
        webTablePage = new WebTablePage();
        orangePage = new OrangePage();
    }
}

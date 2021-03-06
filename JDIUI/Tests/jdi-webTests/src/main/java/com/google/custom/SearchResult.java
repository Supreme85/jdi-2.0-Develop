package com.google.custom;

import com.epam.jdi.uitests.core.annotations.Title;
import com.epam.jdi.uitests.core.interfaces.common.ILabel;
import com.epam.jdi.uitests.core.interfaces.common.ILink;
import com.epam.jdi.uitests.core.interfaces.common.IText;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import com.epam.jdi.uitests.web.selenium.settings.WebSettings;

import static com.epam.jdi.uitests.web.selenium.settings.WebSettings.*;

/**
 * Created by Roman_Iovlev on 8/23/2017.
 */
public class SearchResult extends Section {
    @Title @Css("h3>a") public ILabel name;
    @Css(".st")  public IText description;
    @Css("cite") public ILink link;

    public String print() {
        return logger.logOff(() -> "SearchResult{" +
                "NAME=" + name.getText() +
                ", DESCRIPTION=" + description.getText() +
                ", LINK=" + link.getText() +
                '}');
    }
}

package com.smartbear.readyapi.client.extractors;

import com.smartbear.readyapi.client.teststeps.propertytransfer.PathLanguage;

public class Extractor {
    private String path;
    private String property;
    private String source;
    private PathLanguage pathLanguage;

    private final ExtractorOperator operator;

    public Extractor(String extractorProperty, String extractorPath, ExtractorOperator operator){
        this.property = extractorProperty;
        this.path = extractorPath;
        this.operator = operator;
    }

    public Extractor(String extractorProperty, ExtractorOperator operator){
        this.property = extractorProperty;
        this.path = "";
        this.operator = operator;
        this.pathLanguage = PathLanguage.XPath;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path){
        this.path = path;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property){
        this.property = property;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public ExtractorOperator getOperator() {
        return operator;
    }

    public PathLanguage getPathLanguage() {
        return pathLanguage;
    }

    public void setPathLanguage(PathLanguage pathLanguage) {
        this.pathLanguage = pathLanguage;
    }

}

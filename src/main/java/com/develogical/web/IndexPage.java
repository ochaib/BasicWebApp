package com.develogical.web;

import java.io.PrintWriter;

public class IndexPage extends HtmlPage {

    @Override
    protected void writeContentTo(PrintWriter writer) {
        writer.println(
                "<h1>Shmelcome!!</h1>" +
                "<p>Enter your shmoney in the box below: " +
                  "<form><input type=\"text\" name=\"q\" />" +
                    "<input type=\"shubmit\">" +
                  "</form>" +
                "</p>");
    }
    
}

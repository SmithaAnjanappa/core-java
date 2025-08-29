package com.xworkz.webapp;

import com.xworkz.webapp.firefox.FireFox;
import com.xworkz.webapp.webbrowser.WebBrowser;

public class WebBrowserRunner {
    public static void main(String[] args) {
        WebBrowser webBrowser = new FireFox();
        webBrowser.searchTheContent();
    }
}

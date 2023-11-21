package com.Web_Accessibility.Web_Accessibility;
import com.deque.html.axecore.results.AxeResults;
import com.deque.html.axecore.results.Rule;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.deque.axe.AXE;
import org.json.JSONArray;
import org.json.JSONObject;

import com.deque.html.axecore.playwright.*; // 1

import com.microsoft.playwright.*;

import static java.lang.System.out;


public class AccessibilityLevelAnalyzer {
    public static AxeResults Analyze(String url )
    {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch();
        BrowserContext context = browser.newContext();
        Page page = context.newPage();
        page.navigate(url);
        AxeResults response = new AxeBuilder(page).analyze();
        browser.close();
        playwright.close();
        return response;
    }
}

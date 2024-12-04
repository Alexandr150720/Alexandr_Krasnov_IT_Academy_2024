package com.academy.course.lesson7.home.work;

public class URLValidator {

    public static void main(String[] args) {
        String urlLink1 = "https://jira.academy.com/secure/Dashboard.jspa?selectPageId=22702";
        String urlLink2 = "http://jira.academy.com/secure/Dashboard.jspa";

        boolean urlRegex1 = urlLink1.matches("[htp|s]{1,5}://jira.academy.com/secure/Dashboard.jspa(\\?\\w{0,20}=\\d+)*");
        boolean urlRegex2 = urlLink2.matches("[htp|s]{1,5}://jira.academy.com/secure/Dashboard.jspa(\\?\\w{0,20}=\\d+)*");

        if (urlRegex1 && urlRegex2) {
            System.out.println("Верный адрес");
        } else {
            System.out.println("Не верный адрес");
        }
    }
}

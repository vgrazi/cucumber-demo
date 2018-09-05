package com.vgrazi.demo;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    public String calculate(String string) {
        string = parseParens(string);
        string = parsePlusMinus(string);
        return string;
    }

    private String parseParens(String string) {
        // first reduce parens
        Pattern parenPattern = Pattern.compile("(?<=.{0,99})(\\([\\d./+-\\\\*]+\\))");
        Matcher matcher = parenPattern.matcher(string);
        while (matcher.find()) {
            String exp = matcher.group(1);
            String innerExpression = exp.substring(1, exp.length() - 1);
            string = matcher.replaceAll(calculate(innerExpression));
            matcher = parenPattern.matcher(string);
        }
        return string;
    }

    private String parsePlusMinus(String string)
    {
        // split into a series of products, prefixed by an optional + or -
        String[] parts = string.split("(?=[+-])");
        double result = 0;
        for (String part : parts) {
            String op  = "";
            if(part.matches("[+-].*"))
            {
                op = part.substring(0, 1);
                string = part.substring(1);
            }
            else
            {
                string= part;
            }
            double newResult = parseTimesDiv(string);
            switch (op)
            {
                case "":
                    result = newResult;
                    break;
                case "+":
                    result += newResult;
                    break;
                case "-":
                    result -= newResult;
                    break;
                default:
                    throw new IllegalArgumentException("improper format");
            }
        }
        return String.valueOf(result);
    }
    private double parseTimesDiv(String string) {
        // split into a series of products, prefixed by an optional + or -
        String[] parts = string.split("(?=[*/])");
        double result = 1;
        for (String part : parts) {
            String op  = "";
            if(part.matches("[*/].*"))
            {
                op = part.substring(0, 1);
                string = part.substring(1);
            }
            else
            {
                string= part;
            }
            double newResult = Double.valueOf(string);
            switch (op)
            {
                case "":
                    result = newResult;
                    break;
                case "*":
                    result *= newResult;
                    break;
                case "/":
                    result /= newResult;
                    break;
                default:
                    throw new IllegalArgumentException("improper format");
            }
        }
        return result;
    }
}

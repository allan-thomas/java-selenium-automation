import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InterviewPractise {

	public static void main(String[] args) {


		String word ="hello000";
		int wrdLength = word.length();
		int m=0;
		
		boolean[] b = new boolean[word.length()];
		
		for (int i =0;i<wrdLength; i++) {
			
			int c =1;
			
			if(b[i])
				continue;
			for (int j=i+1;j<wrdLength;j++) {
				if(word.charAt(i)==word.charAt(j)) {
					c++;
					b[j]=true;
				}
			}
			if(c>m) {
			System.out.println(word.charAt(i) + ":"+ c);
			m=c;
		}}
		
	}

}
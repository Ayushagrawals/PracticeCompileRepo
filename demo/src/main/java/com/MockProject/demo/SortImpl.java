package com.MockProject.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.MockProject.demo.services.Checkersi;
import com.MockProject.demo.services.SortAlgorithm;

@Component
public class SortImpl {
SortAlgorithm sortAlgo;
@Autowired
public SortImpl(SortAlgorithm sortAlgorithm)
{
	this.sortAlgo=sortAlgorithm;
}
public void printMessage()
{
	System.out.println("h");
	System.out.println("hi there");
System.out.println(sortAlgo.Sort());
}
}

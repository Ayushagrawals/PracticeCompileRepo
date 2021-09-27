package com.MockProject.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BubbleSorting implements SortAlgo {

	//SortAlgo algorithm=()->"hi there in Bubble";

	@Override
	public String Sort() {
		// TODO Auto-generated method stub
		return "hi there in Bubble";
	}
}

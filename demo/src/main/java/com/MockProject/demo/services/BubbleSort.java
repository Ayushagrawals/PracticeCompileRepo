package com.MockProject.demo.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("bubble")
public class BubbleSort implements SortAlgorithm {

	//SortAlgorithm algorithm=()->"hi there in Bubble";

	@Override
	public String Sort() {
		// TODO Auto-generated method stub
		return "hi there in Bubble";
	}
}

package com.MockProject.demo.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

public class QuickSort implements SortAlgorithm{
	

	@Override
	public String Sort() {
		// TODO Auto-generated method stub
		return "return in quick";
	}
}

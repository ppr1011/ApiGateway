package com.exercise.ApiGateway;

import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;

public class JunitTest {

	
	@Test
	public void testList() {

		 //mock creation
		 // mock实例
		 List mockedList = mock(List.class);

		 //using mock object
		 // 像List真实实例一样，使用mock对象
		 mockedList.add("one");
		 mockedList.clear();

		 //verification
		 // 作些验证
		 verify(mockedList).add("one");
		 verify(mockedList).clear();
	}
}

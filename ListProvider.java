package com.tactfactory.designpatternniveau1.singleton.tp1;

import java.util.ArrayList;
import java.util.List;

import com.tactfactory.designpatternniveau1.singleton.tp1.entities.Entity1;

public class ListProvider {
	private static ListProvider instance = null;
	private static List<Entity1> result = new ArrayList<Entity1>();
	private static int nextId = 0;
	
	public ListProvider() {
		for (int i = 0; i < 20; i++) {
			Entity1 e1 = new Entity1();
			e1.setId(nextId);
			nextId++;
			e1.setData("data " + i);
			result.add(e1);
		}
	}

	public static synchronized ListProvider getInstance() {
		if (instance == null) {
			instance = new ListProvider();		
		}

		return instance;
	}

	public static List<Entity1> getEntity1s() {
		return result;
	}
	
	public int getId() {
		nextId++;
		return nextId-1;
	}
}

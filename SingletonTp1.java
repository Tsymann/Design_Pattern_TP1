package com.tactfactory.designpatternniveau1.singleton.tp1;

import java.util.ArrayList;
import java.util.List;

import com.tactfactory.designpatternniveau1.singleton.tp1.entities.Entity1;

/**
*
* @author tactfactory
*
* - Modifier le programme pour :
*   - 1 : permettre d'accéder n'importe où dans le projet à la liste d'Entity1
*   - 2 : faire en sorte que les ajouts, suppresions sur la liste d'Entity1 soient préservés durant l'exécution du
*       programme
*   - 3 : que les id des éléments dans la liste ne soient plus saisissables par le développeur et qu'ils deviennent
*       auto-incrémentés
*/
public class SingletonTp1 {
	public static void main(String[] args) {

		System.out.println(String.format("Nombre d'Entity1 %d", ListProvider.getInstance().getEntity1s().stream().count()));

		Entity1 e11 = new Entity1();
		e11.setId(ListProvider.getInstance().getId());
		e11.setData("data e1 15");

		ListProvider.getInstance().getEntity1s().add(e11);

		Entity1 e12 = new Entity1();
		e12.setId(ListProvider.getInstance().getId());
		e12.setData("data e1 16");
		
		ListProvider.getInstance().getEntity1s().add(e12);
		

		for (Entity1 item : ListProvider.getInstance().getEntity1s()) {
			System.out.println(item);
		}
	}

	
}

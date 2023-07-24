package com.workz.village;
import com.workz.village.inner.OldVillage;
import com.workz.village.outer.*;
public class VillageRunner {

	public static void main(String[] args) {
		OldVillage old=new OldVillage();
		old.enter();
		
		NewVillage newvillage=new NewVillage();
		newvillage.enter();
		newvillage.exit();

	}

}

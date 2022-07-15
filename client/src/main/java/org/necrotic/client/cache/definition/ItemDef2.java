package org.necrotic.client.cache.definition;

public class ItemDef2 {
	private ItemDef2() {
	}

	public byte[] customSpriteLocation;

	public static ItemDefinition newIDS(ItemDefinition itemDef, int id) {

		ItemDefinition itemDef2;
		ItemDefinition itemDef21;
		ItemDefinition finity;
		switch (id) {
			//Ring of dueling:
		  	case 2552:
			case 2554:
			case 2556:
			case 2558:
			case 2560:
			case 2562:
			case 2564:
			case 2566:
				itemDef.equipOptions[3] = "Duel Arena";
				itemDef.equipOptions[2] = "Castle Wars";
				itemDef.equipOptions[1] = "Clan wars";
				break;
				
			case 17670:
				itemDef.name = "<col=b3b4f2>Demon Scythe";
				itemDef.modelID = 64016;
				itemDef.maleEquip1 = 64017;
				itemDef.femaleEquip1 = 64017;
				itemDef21 = ItemDefinition.get(1419);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;

			case 17672:
				itemDef.name = "Doomicia bow";
				itemDef.modelID = 64018;
				itemDef.maleEquip1 = 64019;
				itemDef.femaleEquip1 = 64019;
				itemDef21 = ItemDefinition.get(7809);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;
			case 17674:
				itemDef.name = "Golden Microphone";
				itemDef.modelID = 64020;
				itemDef.maleEquip1 = 64021;
				itemDef.femaleEquip1 = 64021;
				itemDef21 = ItemDefinition.get(7809);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;
			case 17676:
				itemDef.name = "Demonhunter blade";
				itemDef.modelID = 64022;
				itemDef.maleEquip1 = 64023;
				itemDef.femaleEquip1 = 64023;
				itemDef21 = ItemDefinition.get(1419);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;
			case 17678:
				itemDef.name = "Noblelords Sycthe";
				itemDef.modelID = 64024;
				itemDef.maleEquip1 = 64025;
				itemDef.femaleEquip1 = 64025;
				itemDef21 = ItemDefinition.get(1419);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;
			case 17680:
				itemDef.name = "Bazooka";
				itemDef.modelID = 64026;
				itemDef.maleEquip1 = 64027;
				itemDef.femaleEquip1 = 64027;
				itemDef21 = ItemDefinition.get(1419);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;
			case 17682:
				itemDef.name = "Crownred Cape";
				itemDef.modelID = 64028;
				itemDef.maleEquip1 = 64029;
				itemDef.femaleEquip1 = 64029;
				itemDef21 = ItemDefinition.get(19709);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;
			case 17684:
				itemDef.name = "Wyvern Cape";
				itemDef.modelID = 64030;
				itemDef.maleEquip1 = 64031;
				itemDef.femaleEquip1 = 64031;
				itemDef21 = ItemDefinition.get(19709);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;
			case 12994:
				itemDef.name = "Lucien Crypt gloves";
				
				break;
			case 17686:
				itemDef.name = "Lucien Crypt wings";
				itemDef.modelID = 64032;
				itemDef.maleEquip1 = 64033;
				itemDef.femaleEquip1 = 64033;
				itemDef21 = ItemDefinition.get(19709);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
			
				break;
			case 17658:
				itemDef.name = "Teddybear";
				itemDef.modelID = 64034;
				itemDef.maleEquip1 = 64035;
				itemDef.femaleEquip1 = 64035;
				itemDef21 = ItemDefinition.get(8848);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;
			case 17688:
				itemDef.name = "Demoncore Sycthe";
				itemDef.modelID = 64036;
				itemDef.maleEquip1 = 64037;
				itemDef.femaleEquip1 = 64037;
				itemDef21 = ItemDefinition.get(1419);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;
			case 17714:
				itemDef.name = "Lucien Axe";
				itemDef.modelID = 64058;
				itemDef.maleEquip1 = 64057;
				itemDef.femaleEquip1 = 64057;
				itemDef21 = ItemDefinition.get(1419);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				
				break;
			case 17690:
				itemDef.name = "Nocturan MoonSlicer";
				itemDef.modelID = 64038;
				itemDef.maleEquip1 = 64039;
				itemDef.femaleEquip1 = 64039;
				itemDef21 = ItemDefinition.get(1419);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;
			case 17692:
				itemDef.name = "Paladin's Bliss";
				itemDef.modelID = 64040;
				itemDef.maleEquip1 = 64041;
				itemDef.femaleEquip1 = 64041;
				itemDef21 = ItemDefinition.get(1419);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;
			case 17694:
				itemDef.name = "Victory Hammer";
				itemDef.modelID = 64042;
				itemDef.maleEquip1 = 64042;
				itemDef.femaleEquip1 = 64042;
				itemDef21 = ItemDefinition.get(1419);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;
			case 17696:
				itemDef.name = "Victory Hammer Offhand";
				itemDef.modelID = 64043;
				itemDef.maleEquip1 = 64043;
				itemDef.femaleEquip1 = 64043;
				itemDef21 = ItemDefinition.get(1419);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;
			case 17698:
				itemDef.name = "Wrath Hammer";
				itemDef.modelID = 64044;
				itemDef.maleEquip1 = 64044;
				itemDef.femaleEquip1 = 64044;
				itemDef21 = ItemDefinition.get(1419);
				itemDef.modelOffsetX = 50;
				itemDef.modelOffsetY = 110;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = 280;
				itemDef.rotationX = 230;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				

				break;
			case 18753:
				itemDef.name = "<col=eed81d><shad=9283>Corrupt Maxiblood helm<shad-1>";
				itemDef.modelID = 65130;
				itemDef.maleEquip1 = 65131;
				itemDef.femaleEquip1 = 65131;
				itemDef21 = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 40; // the texture that it currently has
				itemDef.editedModelColor[0] = 66;
				itemDef.stackable = false;
				break;
			case 18752:
				itemDef.name = "<col=eed81d><shad=9283>Corrupt Maxiblood platebody<shad-1>";
				itemDef.modelID = 65132;
				itemDef.maleEquip1 = 65133;
				itemDef.femaleEquip1 = 65133;
				itemDef21 = ItemDefinition.get(4894);
				itemDef.modelOffsetX = 1;
				
				itemDef.modelOffsetY = -10;
				itemDef.modelZoom = 1400;
				itemDef.rotationY = 700;
				itemDef.rotationX = 1;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 40; // the texture that it currently has
				itemDef.editedModelColor[0] = 66;
				itemDef.stackable = false;
				break;
			case 18751:
				itemDef.name = "<col=eed81d><shad=9283>Corrupt Maxiblood legs<shad-1>";
				itemDef.modelID = 65134;
				itemDef.maleEquip1 = 65135;
				itemDef.femaleEquip1 = 65135;
				itemDef21 = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = 1800;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 40; // the texture that it currently has
				itemDef.editedModelColor[0] = 66;
				itemDef.stackable = false;
				break;
			case 18750:
				itemDef.name = "<col=eed81d><shad=9283>Corrupt maxiblood whip<shad-1>";
				itemDef.modelID = 65141;
				itemDef.maleEquip1 = 65142;
				itemDef.femaleEquip1 = 65142;
				itemDef21 = ItemDefinition.get(13131);
				itemDef.modelOffsetX = 10;
				
				itemDef.modelOffsetY = 1;
				itemDef.modelZoom = 1000;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = 120;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 40; // the texture that it currently has
				itemDef.editedModelColor[0] = 66; // the new texture u want it to have
				

				itemDef.stackable = false;
				break;

			case 17544:
				itemDef.name = "<col=353><shad=272625> Supreme Potion (1)<shad-1>";
				itemDef.rdc2 = 5774;
				itemDef.modelZoom = 600;
				itemDef.actions = new String[]{"Drink", null, null, null, "Destroy"};
				break;
			case 17546:
				itemDef.name = "<col=969695><shad=272625> God Potion (1)<shad-1>";
				itemDef.rdc2 = 9090;
				itemDef.modelZoom = 600;
				itemDef.actions = new String[]{"Drink", null, null, null, "Destroy"};
				break;
			case 17542:
				itemDef.name = "<col=ff0000><shad=272625>Super Overload (1)<shad-1>";
				itemDef.rdc2 = 42500;
				itemDef.modelZoom = 600;
				itemDef.actions = new String[]{"Drink", null, null, null, "Destroy"};
				break;
			case 17540:
				itemDef.name = "<col=ff0000><shad=272625>Infinite Super Overload<shad-1>";
				itemDef.rdc2 = 42500;
				itemDef.modelZoom = 600;
				itemDef.actions = new String[]{"Drink", null, null, null, "Destroy"};
				break;
			case 18749:
				itemDef.name = "<col=fb9ae5><shad=9283>Corrupt archie helm<shad-1>";
				itemDef.modelID = 65231;
				itemDef.maleEquip1 = 65232;
				itemDef.femaleEquip1 = 65232;
				itemDef21 = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				
				//	itemDef.originalModelColors = new int[] { 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40 };
				//	itemDef.originalModelColors = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				//	itemDef.modifiedModelColors = new int[1]; // same here
				//	itemDef.modifiedModelColors[0] = 60; // the texture that it currently has
				//	itemDef.originalModelColors[0] = 52; // the new texture u want it to have
				itemDef.stackable = false;
				break;
			case 18748:
				itemDef.name = "<col=fb9ae5><shad=9283>Corrupt archie body<shad-1>";
				itemDef.modelID = 65233;
				itemDef.maleEquip1 = 65234;
				itemDef.femaleEquip1 = 65234;
				itemDef21 = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				

				//		itemDef.originalModelColors = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				//	itemDef.modifiedModelColors = new int[1]; // same here
				//	itemDef.modifiedModelColors[0] = 60; // the texture that it currently has
				//	itemDef.originalModelColors[0] = 52; // the new texture u want it to have
				itemDef.stackable = false;
				break;
			case 18638:
				itemDef.name = "<col=fb9ae5><shad=9283> Corrupt archie chaps<shad-1>";
				itemDef.modelID = 65235;
				itemDef.maleEquip1 = 65236;
				itemDef.femaleEquip1 = 65236;// im not lagging
				itemDef21 = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};

				//	itemDef.originalModelColors = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				//		itemDef.modifiedModelColors = new int[1]; // same here
//			itemDef.modifiedModelColors[0] = 60; // the texture that it currently has
				
				itemDef.stackable = false;
				break;
			case 18631:
				itemDef.name = "<col=57d0fd><shad=9283>Corrupt moonlight hood<shad-1>";
				itemDef.modelID = 65296;
				itemDef.maleEquip1 = 65297;
				itemDef.femaleEquip1 = 65297;
				itemDef21 = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 40; // the texture that it currently has
				itemDef.editedModelColor[0] = 57;
				itemDef.stackable = false;
				break;
			case 18637:
				itemDef.name = "<col=57d0fd><shad=9283>Corrupt moonlight robetop<shad-1>";
				itemDef.modelID = 65298;
				itemDef.maleEquip1 = 65299;
				itemDef.femaleEquip1 = 65299;
				itemDef21 = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 40; // the texture that it currently has
				itemDef.editedModelColor[0] = 57;
				itemDef.stackable = false;
				break;
			case 18623:
				itemDef.name = "<col=57d0fd><shad=9283>Corrupt moonlight robebottom<shad-1>";
				itemDef.modelID = 65300;
				itemDef.maleEquip1 = 65301;
				itemDef.femaleEquip1 = 65301;
				itemDef21 = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 40; // the texture that it currently has
				itemDef.editedModelColor[0] = 57;
				itemDef.stackable = false;
				break;
			case 18629:
				itemDef.name = "<col=57d0fd><shad=9283>Corrupt moonlight staff<shad-1>";
				itemDef.modelID = 65294;
				itemDef.maleEquip1 = 65295;
				itemDef.femaleEquip1 = 65295;
				itemDef21 = ItemDefinition.get(4755);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[5];
				itemDef.actions[4] = "Drop";
				itemDef.actions[1] = "Wear";
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 62; // the texture that it currently has
				itemDef.editedModelColor[0] = 57; // the new texture u want it to have
				itemDef.stackable = false;
				break;
			case 18636:

				itemDef.name = "<col=fb9ae5><shad=9283>Corrupt archie minigun<shad-1>";
				ItemDefinition itemDef211 = ItemDefinition.get(20538);
				itemDef.modelID = 65210;
				itemDef.femaleEquip1 = 65211;
				itemDef.maleEquip1 = 65211;// 95099
				itemDef.actions = new String[]{null, "Wield", null, null, "Destroy"};
				itemDef.modelOffsetX = itemDef211.modelOffsetX;
				
				itemDef.modelOffsetY = itemDef211.modelOffsetY;
				itemDef.modelZoom = itemDef211.modelZoom;
				itemDef.rotationY = itemDef211.rotationY;
				itemDef.rotationX = itemDef211.rotationX;
				itemDef.stackable = false;
				break;
			case 8253:
				itemDef.editedModelColor = new int[2]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[2]; // same here
				itemDef.newModelColor[0] = 40; // the texture that it currently has
				itemDef.editedModelColor[0] = 66; // the new texture u want it to have

				itemDef.newModelColor[1] = 24; // the texture that it currently has
				itemDef.editedModelColor[1] = 71; // the new texture u want it to have
				itemDef.name = "<col=ff2a00><shad=761401>Defiled minigun<shad-1>";
				ItemDefinition def = ItemDefinition.get(20538);
				itemDef.modelID = 65210;
				itemDef.femaleEquip1 = 65211;
				itemDef.maleEquip1 = 65211;// 95099
				itemDef.actions = new String[]{null, "Wield", null, null, "Destroy"};
				itemDef.modelOffsetX = def.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.stackable = false;
				break;
			case 17700:
				itemDef.name = "Wrath Hammer Offhand";
				itemDef.maleEquip1 = 64045;
				itemDef.modelID = 64045;
				itemDef.femaleEquip1 = 64045;
				def = ItemDefinition.get(1419);
				itemDef.modelOffsetX = 46;
				itemDef.modelOffsetY = 10;
				itemDef.modelZoom = 2200;
				itemDef.rotationY = 300;
				itemDef.rotationX = 600;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				

				break;
			case 5420:
				itemDef.name = "Madman helm";
				itemDef.modelID = 65231;
				itemDef.maleEquip1 = 65232;
				itemDef.femaleEquip1 = 65232;
				itemDef21 = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.newModelColor = new int[]{60};
				itemDef.editedModelColor = new int[]{87};
				itemDef.stackable = false;
				break;
			case 5422:
				itemDef.name = "Madman body<shad-1>";
				itemDef.modelID = 65233;
				itemDef.maleEquip1 = 65234;
				itemDef.femaleEquip1 = 65234;
				itemDef21 = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.newModelColor = new int[]{60};
				itemDef.editedModelColor = new int[]{87};
				itemDef.stackable = false;
				break;
			case 5428:
				itemDef.name = "Madman legs<shad-1>";
				itemDef.modelID = 65235;
				itemDef.maleEquip1 = 65236;
				itemDef.femaleEquip1 = 65236;// im not lagging
				itemDef21 = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				//		itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.newModelColor = new int[]{60};
				itemDef.editedModelColor = new int[]{87};

				itemDef.stackable = false;
				break;
			case 15043:
				itemDef.name = "madman boots";
				break;
			case 6629:
				itemDef.name = "madman gloves";
				itemDef.modelID = 64046;
				//itemDef.maleWearId = 64047;
				//itemDef.femaleWearId = 64047;
				def = ItemDefinition.get(20562);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;
			case 17702:
				itemDef.name = "Freiza claws";
				itemDef.modelID = 64046;
				itemDef.maleEquip1 = 64047;
				itemDef.femaleEquip1 = 64047;
				def = ItemDefinition.get(20562);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;
			case 17704:
				itemDef.name = "Astrogun (Halo)";
				itemDef.modelID = 64048;
				itemDef.maleEquip1 = 64049;
				itemDef.femaleEquip1 = 64049;
				def = ItemDefinition.get(22034);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				

				break;
			case 17706:
				itemDef.name = "Chest";
				itemDef.modelID = 64050;
				itemDef.maleEquip1 = 64050;
				itemDef.femaleEquip1 = 64050;
				def = ItemDefinition.get(6199);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = 2300;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				//	itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
				itemDef.stackable = false;
				break;
			case 17708:
				itemDef.name = "<col=b5f2b3>Joyxox Sword";
				itemDef.modelID = 64051;
				itemDef.maleEquip1 = 64052;
				itemDef.femaleEquip1 = 64052;
				def = ItemDefinition.get(22034);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				
				break;
			case 15328:
				itemDef.name = "<shad=1><col=ff0000>Infinity Rage Potion";
				break;
			case 15330:
				itemDef.name = "<shad=1><col=ff0000>Infinite Super Overload";
				itemDef.actions = new String[]{"Drink", null, "Upgrade", null, "Drop"};
				break;

			case 17710:
				itemDef.name = "Dictator Maul";
				itemDef.modelID = 64053;
				itemDef.maleEquip1 = 64054;
				itemDef.femaleEquip1 = 64054;
				def = ItemDefinition.get(4153);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = 2200;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;

			case 13760:
				itemDef.name = "Elder Maul";
				itemDef.modelID = 64334;
				itemDef.maleEquip1 = 64335;
				itemDef.femaleEquip1 = 64335;
				def = ItemDefinition.get(4153);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = 2200;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;
			case 11798:
				itemDef.name = "Dinh's bulwark";
				itemDef.modelID = 64336;
				itemDef.maleEquip1 = 64337;
				itemDef.femaleEquip1 = 64337;
				def = ItemDefinition.get(4153);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = 2200;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				

				break;
			case 17712:
				itemDef.name = "<col=b5aaaa>Angels Flamethrower";
				itemDef.modelID = 64055;
				itemDef.maleEquip1 = 64056;
				itemDef.femaleEquip1 = 64056;
				def = ItemDefinition.get(22034);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				
				itemDef.rdc2 = 7654;
				break;
			case 12860:
				itemDef.name = "Angelic gloves";
				
				break;
			case 12565:
				itemDef.name = "Angelic boots";
				
				break;
			case 16140:
				itemDef.name = "Angelic amulet";
				
				break;
			case 10025:
				itemDef.name = "Progressive Reward Box";
				itemDef.rdc2 = 4567543;
				break;
			case 10027:
				itemDef.name = "<img=15>Slayer Reward Box";
				itemDef.rdc2 = 2536531;
				itemDef.actions = new String[]{"Open", null, null, null, "Drop"};

				break;

			case 17716:
				itemDef.name = "Doom wings";
				itemDef.modelID = 64071;
				itemDef.maleEquip1 = 64072;
				itemDef.femaleEquip1 = 64072;
				def = ItemDefinition.get(19893);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;
			case 1959:
				itemDef.name = "Halloween Token";
				itemDef.stackable = true;
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				break;
			case 18189:
				itemDef.name = "Baby web spiders";
				itemDef.stackable = true;
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				break;
			case 20422:
				itemDef.name = "Cracker Urn";
				itemDef.stackable = true;
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				break;
			case 4568:
				itemDef.name = "Basket of undead (@bla@Discontinued@or1@)";
				//	itemDef.stackable = true;
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				def = ItemDefinition.get(4565);
				itemDef.modelID = def.modelID;
				itemDef.maleEquip1 = def.maleEquip1;
				itemDef.femaleEquip1 = def.femaleEquip1;
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.actions = def.actions;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.rdc2 = 35473;
				break;
			case 4569:
				itemDef.name = "Basket of Xmas (@whi@Xmas 2019@or1@)";
				//	itemDef.stackable = true;
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				def = ItemDefinition.get(4565);
				itemDef.modelID = def.modelID;
				itemDef.maleEquip1 = def.maleEquip1;
				itemDef.femaleEquip1 = def.femaleEquip1;
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.actions = def.actions;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.rdc2 = 90999;
				break;
			case 4570:
				itemDef.name = "Golden Cracker (@whi@Xmas 2019@or1@)";
				//	itemDef.stackable = true;
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				def = ItemDefinition.get(20083);
				itemDef.modelID = def.modelID;
				itemDef.maleEquip1 = def.maleEquip1;
				itemDef.femaleEquip1 = def.femaleEquip1;
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.actions = def.actions;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.rdc2 = 7775;
				break;
			case 15367:
				itemDef.name = "Event pack";
				itemDef.stackable = false;
				itemDef.actions = new String[]{"Open", null, null, null, "Drop"};

				itemDef.rdc2 = 621133;
				break;
			case 15290:
				itemDef.name = "Upgrade Token pack (5k)";
				itemDef.stackable = false;
				itemDef.actions = new String[]{"Open", null, null, null, "Drop"};
				def = ItemDefinition.get(15262);
				itemDef.modelID = def.modelID;
				itemDef.maleEquip1 = def.maleEquip1;
				itemDef.femaleEquip1 = def.femaleEquip1;
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = 2000;
				//itemDef.actions = itemDef211.actions;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.rdc2 = 293613;
				break;
			case 15289:
				itemDef.name = "Upgrade Token pack (25k)";
				itemDef.stackable = false;
				itemDef.actions = new String[]{"Open", null, null, null, "Drop"};
				def = ItemDefinition.get(15262);
				itemDef.modelID = def.modelID;
				itemDef.maleEquip1 = def.maleEquip1;
				itemDef.femaleEquip1 = def.femaleEquip1;
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = 2000;
				//itemDef.actions = itemDef211.actions;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.rdc2 = 283613;
				break;
			case 15288:
				itemDef.name = "Upgrade Token pack (100k)";
				itemDef.stackable = false;
				itemDef.actions = new String[]{"Open", null, null, null, "Drop"};
				def = ItemDefinition.get(15262);
				itemDef.modelID = def.modelID;
				itemDef.maleEquip1 = def.maleEquip1;
				itemDef.femaleEquip1 = def.femaleEquip1;
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = 2000;
				//itemDef.actions = itemDef211.actions;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.rdc2 = 223613;
				break;
			case 8213:
				itemDef.name = "Christmas token";
				itemDef.stackable = true;
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				def = ItemDefinition.get(1050);
				itemDef.modelID = def.modelID;
				itemDef.maleEquip1 = def.maleEquip1;
				itemDef.femaleEquip1 = def.femaleEquip1;
				itemDef.modelOffsetX = 2;
				itemDef.modelOffsetY = 1;
				itemDef.modelZoom = 600;
				//itemDef.actions = itemDef211.actions;
				itemDef.rotationY = 20;
				itemDef.rotationX = 900;
				//itemDef.rdc2 = 743;
				break;
			case 6183:
				itemDef.name = "Halloween Box (@bla@Discontinued@or1@)";
				itemDef.rdc2 = 32535;
				break;
			case 15246:
				itemDef.name = "Xmas Mystery Box (@whi@Xmas 2019@or1@)";
				itemDef.rdc2 = 32535;
				break;
			case 20083:
				itemDef.name = "Halloween cracker (@bla@Discontinued@or1@)";
				//itemDef.stackable = true;
				itemDef.actions = new String[]{"Pull", null, null, null, "Drop"};
				itemDef.rdc2 = 294295;
				break;
			case 19775:
				itemDef.name = "Small event rate Lamp";
				itemDef.rdc2 = 47388;
				break;
			case 19768:
				itemDef.name = "Large event rate Lamp";
				itemDef.rdc2 = 23643315;
				itemDef.modelZoom = 700;
				break;
			case 15222:
				itemDef.name = "Poison Ivy";
				itemDef.stackable = true;
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				break;
			case 588:
				itemDef.name = "Spirit Orb";
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				itemDef.rdc2 = 12233;
				itemDef.stackable = true;

				break;
			case 14505:
				itemDef.name = "Phantom orb";
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				itemDef.rdc2 = 3274772;
				itemDef.stackable = true;

				break;
			case 18761:
				itemDef.name = "Transylvanian orb";
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				itemDef.rdc2 = 3465736;
				itemDef.stackable = true;

				break;
			case 19640:
				itemDef.name = "Undead orb";
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				itemDef.rdc2 = 8844;
				itemDef.stackable = true;
				break;
			case 17831:
				itemDef.name = "Mystery Shards";
				itemDef.stackable = true;
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				//itemDef.rdc2 = 234563434;
				break;
			case 2862:
				itemDef.name = "Grinch logs";
				itemDef.stackable = true;
				itemDef.rdc2 = 857664;
				break;
			case 10593:
				itemDef.name = "Cowbell";
				itemDef.stackable = true;
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				//	itemDef.rdc2=  857664;
				break;
			case 6855:
				itemDef.name = "Christmas Mystery Box";
				itemDef.stackable = false;
				itemDef.actions = new String[]{"open", null, null, null, "Drop"};
				//itemDef.rdc2 = 234563434;
				break;
			case 8212:
				itemDef.name = "Spirit Dust";
				itemDef.stackable = true;
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				itemDef.rdc2 = 234563434;
				break;
			case 6849:
				itemDef.name = "Blue bell";
				itemDef.stackable = true;
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				//itemDef.rdc2 = 234563434;
				break;
			case 6850:
				itemDef.name = "Green bell";
				itemDef.stackable = true;
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				//itemDef.rdc2 = 234563434;
				break;
			case 6847:
				itemDef.name = "Yellow bell";
				itemDef.stackable = true;
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				//itemDef.rdc2 = 234563434;
				break;
			case 6851:
				itemDef.name = "pink bell";
				itemDef.stackable = true;
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				//itemDef.rdc2 = 234563434;
				break;
			case 2396:
				itemDef.name = "Merry scroll";
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				itemDef.stackable = true;

				itemDef.rdc2 = 2344321;
				break;
			case 17718:
				itemDef.name = "Batman's bow";
				itemDef.modelID = 64073;
				itemDef.maleEquip1 = 64074;
				itemDef.femaleEquip1 = 64074;
				def = ItemDefinition.get(20171);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;
			case 17720:
				itemDef.name = "Dracula sword";
				itemDef.modelID = 64075;
				itemDef.maleEquip1 = 64076;
				itemDef.femaleEquip1 = 64076;
				def = ItemDefinition.get(1311);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;
			case 17722:
				itemDef.name = "Gunther sword";
				itemDef.modelID = 64077;
				itemDef.maleEquip1 = 64078;
				itemDef.femaleEquip1 = 64078;
				def = ItemDefinition.get(1311);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;
			case 17724:
				itemDef.name = "COL sword I";
				itemDef.modelID = 64079;
				itemDef.maleEquip1 = 64080;
				itemDef.femaleEquip1 = 64080;
				def = ItemDefinition.get(1281);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;
			case 17726:
				itemDef.name = "COL sword II";
				itemDef.modelID = 64081;
				itemDef.maleEquip1 = 64082;
				itemDef.femaleEquip1 = 64082;
				def = ItemDefinition.get(1281);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;
			case 17728:
				itemDef.name = "COL shield I";
				itemDef.modelID = 64083;
				itemDef.maleEquip1 = 64084;
				itemDef.femaleEquip1 = 64084;
				def = ItemDefinition.get(1193);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;
			case 17730:
				itemDef.name = "COL shield II";
				itemDef.modelID = 64085;
				itemDef.maleEquip1 = 64086;
				itemDef.femaleEquip1 = 64086;
				def = ItemDefinition.get(1193);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;

			case 17732:
				itemDef.name = "FyreFighter";
				itemDef.modelID = 64087;
				itemDef.maleEquip1 = 64088;
				itemDef.femaleEquip1 = 64088;
				def = ItemDefinition.get(1311);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;
			case 17734:
				itemDef.name = "GreatRealm Axe";
				itemDef.modelID = 64089;
				itemDef.maleEquip1 = 64090;
				itemDef.femaleEquip1 = 64090;
				def = ItemDefinition.get(1311);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;
			case 17636:
				itemDef.name = "Flaming Skeleton";
				itemDef.modelID = 65525;
				itemDef.maleEquip1 = 65526;
				itemDef.femaleEquip1 = 65526;
				def = ItemDefinition.get(4882);
				itemDef.modelOffsetX = def.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;
			case 17644:
				itemDef.name = "Flaming Katana";
				itemDef.modelID = 65527;
				itemDef.maleEquip1 = 65528;
				itemDef.femaleEquip1 = 65528;
				def = ItemDefinition.get(1333);
				itemDef.modelOffsetX = def.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				break;
			case 17638:
				itemDef.name = "<col=b5aaaa>Angelic helm";
				itemDef.modelID = 65519;
				itemDef.maleEquip1 = 65520;
				itemDef.femaleEquip1 = 65520;
				def = ItemDefinition.get(4882);
				itemDef.modelOffsetX = def.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				
				itemDef.rdc2 = 1511;

				break;

			case 17640:
				itemDef.name = "<col=b5aaaa>Angelic body";
				itemDef.modelID = 65521;
				itemDef.maleEquip1 = 65522;
				itemDef.femaleEquip1 = 65522;
				def = ItemDefinition.get(4894);
				itemDef.modelOffsetX = def.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 1511;
				

				break;

			case 17642:
				itemDef.name = "xat legs";
				itemDef.modelID = 65523;
				itemDef.maleEquip1 = 65524;
				itemDef.femaleEquip1 = 65524;
				def = ItemDefinition.get(4900);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 1511;

				break;
			case 2021:
				itemDef.name = "<col=b5aaaa>Angelic wings";
				itemDef.modelID = 65517;
				itemDef.maleEquip1 = 65518;
				itemDef.femaleEquip1 = 65518;
				def = ItemDefinition.get(18509);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				
				//itemDef.rdc2 = 1811;

				break;

			case 17632:
				itemDef.name = "Firefly wings";
				itemDef.modelID = 65517;
				itemDef.maleEquip1 = 65518;
				itemDef.femaleEquip1 = 65518;
				def = ItemDefinition.get(18509);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				
				itemDef.rdc2 = 29638936;

				break;
			case 17999:
				itemDef.name = "<col=E3E3E3>COL Torva helm";
				itemDef.modelID = 65498;
				itemDef.maleEquip1 = 65499;
				itemDef.femaleEquip1 = 65499;
				def = ItemDefinition.get(4882);
				itemDef.modelOffsetX = def.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 8239113;
				


				break;

			case 18001:
				itemDef.name = "<col=E3E3E3>COL Torva body";
				itemDef.modelID = 65500;
				itemDef.maleEquip1 = 65501;
				itemDef.femaleEquip1 = 65501;
				def = ItemDefinition.get(4894);
				itemDef.modelOffsetX = def.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 8239113;
				


				break;

			case 18003:
				itemDef.name = "<col=E3E3E3>COL Torva legs";
				itemDef.modelID = 65502;
				itemDef.maleEquip1 = 65503;
				itemDef.femaleEquip1 = 65503;
				def = ItemDefinition.get(4900);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 8239113;
				

				break;
			case 18005:
				itemDef.name = "<col=E3E3E3>COL wings";
				itemDef.modelID = 65504;
				itemDef.maleEquip1 = 65505;
				itemDef.femaleEquip1 = 65505;
				def = ItemDefinition.get(18509);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 8239113;
				

				break;
			case 18007:
				itemDef.name = "<col=E3E3E3>COL kiteshield";
				itemDef.modelID = 65506;
				itemDef.maleEquip1 = 65507;
				itemDef.femaleEquip1 = 65507;
				def = ItemDefinition.get(18509);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 8239113;
				


				break;
			case 18009:
				itemDef.name = "<col=E3E3E3>COL boots";
				itemDef.modelID = 65508;
				itemDef.maleEquip1 = 65508;
				itemDef.femaleEquip1 = 65508;
				def = ItemDefinition.get(11732);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 8239113;
				

				break;
			case 18011:
				itemDef.name = "<col=E3E3E3>COL whip";
				itemDef.modelID = 65509;
				itemDef.maleEquip1 = 65510;
				itemDef.femaleEquip1 = 65510;
				def = ItemDefinition.get(4151);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 8239113;
				


				break;
			case 17616:
			case 17614:
			case 17606:
			case 17618:

				

				break;

			case 17620:
				itemDef.name = "Shadow kiteshield";
				itemDef.modelID = 65506;
				itemDef.maleEquip1 = 65507;
				itemDef.femaleEquip1 = 65507;
				def = ItemDefinition.get(18509);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				

				break;
			case 17622:
				itemDef.name = "Shadow boots";
				itemDef.modelID = 65508;
				itemDef.maleEquip1 = 65508;
				itemDef.femaleEquip1 = 65508;
				def = ItemDefinition.get(11732);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				

				break;
			case 17624:
				itemDef.name = "Shadow whip";
				itemDef.modelID = 65509;
				itemDef.maleEquip1 = 65510;
				itemDef.femaleEquip1 = 65510;
				def = ItemDefinition.get(4151);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				

				break;
			case 757:
				itemDef.name = "<col=5cc6cf>Starter Tasks Book";
				//	itemDef.rdc2 = 92942;
				break;
			case 882:
				itemDef.name = "Starter arrow";
				//	itemDef.rdc2 = 92942;
				break;
			case 17600:
				itemDef.name = "Vindicta staff";
				itemDef.modelID = 65486;
				itemDef.maleEquip1 = 65487;
				itemDef.femaleEquip1 = 65487;
				def = ItemDefinition.get(4158);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;

				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				
				itemDef.rdc2 = 222222;
				break;
			case 675:
				itemDef.name = "<col=b5f2b3>Indravox full helmet";
				def = ItemDefinition.get(10350);
				itemDef.modelID = def.modelID;
				itemDef.maleEquip1 = def.maleEquip1;
				itemDef.femaleEquip1 = def.femaleEquip1;
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.rdc2 = 2324222;
				
				break;
			case 702:
				itemDef.name = "<col=b5f2b3>Indravox platebody";
				def = ItemDefinition.get(10348);
				itemDef.modelID = def.modelID;
				itemDef.maleEquip1 = 20154;
				itemDef.femaleEquip1 = 20154;
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.rdc2 = 2324222;
				
				break;
			case 700:
				itemDef.name = "<col=b5f2b3>Indravox platelegs";
				def = ItemDefinition.get(10346);
				itemDef.modelID = def.modelID;
				itemDef.maleEquip1 = def.maleEquip1;
				itemDef.femaleEquip1 = def.femaleEquip1;
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.rdc2 = 2324222;
				
				break;
			case 701:
				itemDef.name = "<col=b5f2b3>Indravox kiteshield";
				def = ItemDefinition.get(10352);
				itemDef.modelID = def.modelID;
				itemDef.maleEquip1 = def.maleEquip1;
				itemDef.femaleEquip1 = def.femaleEquip1;
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.rdc2 = 2324222;
				
				break;
			case 17602:
				itemDef.name = "<col=b5f2b3>Indravox Cape";
				itemDef.modelID = 65488;
				itemDef.maleEquip1 = 65489;
				itemDef.femaleEquip1 = 65489;
				def = ItemDefinition.get(18509);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				
				itemDef.rdc2 = 2324222;
				break;
			case 17604:
				itemDef.name = "Champion Cape";
				itemDef.modelID = 65490;
				itemDef.maleEquip1 = 65491;
				itemDef.femaleEquip1 = 65491;
				def = ItemDefinition.get(18509);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 7733;
				break;

			case 4555:
				itemDef.name = "Riddler's helm";
				itemDef.modelID = 65354;
				itemDef.maleEquip1 = 65355;
				itemDef.femaleEquip1 = 65355;
				def = ItemDefinition.get(4882);
				itemDef.modelOffsetX = def.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 57; // the texture that it currently has
				itemDef.editedModelColor[0] = 68; //
				break;

			case 4556:
				itemDef.name = "Riddler's body";
				itemDef.modelID = 65356;
				itemDef.maleEquip1 = 65357;
				itemDef.femaleEquip1 = 65357;
				def = ItemDefinition.get(4894);
				itemDef.modelOffsetX = def.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				// itemDef.rdc2 = 23945;
				//itemDef.rdc2 = 34737;
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 57; // the texture that it currently has
				itemDef.editedModelColor[0] = 68; //
				break;

			case 4557:
				itemDef.name = "Riddler's legs";
				itemDef.modelID = 65358;
				itemDef.maleEquip1 = 65359;
				itemDef.femaleEquip1 = 65359;
				def = ItemDefinition.get(4900);
				itemDef.modelOffsetX = def.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 57; // the texture that it currently has
				itemDef.editedModelColor[0] = 68; //
				//	itemDef.rdc2 = 34737;
				break;
			case 4558:
				itemDef.name = "Riddler's Offhand";
				itemDef.modelID = 65409;
				itemDef.maleEquip1 = 65411;
				itemDef.femaleEquip1 = 65411;
				def = ItemDefinition.get(19146);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[5];
				itemDef.actions[4] = "Drop";
				itemDef.actions[1] = "Wear";
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{55};
				itemDef.editedModelColor = new int[]{68};
				break;
			case 7014:
				itemDef.name = "Saggy's whacker";
				itemDef.modelID = 65341;
				itemDef.maleEquip1 = 65342;
				itemDef.femaleEquip1 = 65342;
				def = ItemDefinition.get(20551);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[5];
				itemDef.actions[4] = "Drop";
				itemDef.actions[1] = "Wear";
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{60, 62};
				itemDef.editedModelColor = new int[]{70, 70};
				break;
			case 9360:
				itemDef.name = "Master void helm (ranged)";

				itemDef.modelID = 65385;
				itemDef.maleEquip1 = 65386;
				itemDef.femaleEquip1 = 65386;
				itemDef2 = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemDef2.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemDef2.modelOffsetY;
				itemDef.modelZoom = itemDef2.modelZoom;
				itemDef.rotationY = itemDef2.rotationY;
				itemDef.rotationX = itemDef2.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{52};
				itemDef.editedModelColor = new int[]{73};
				break;
			case 9361:
				itemDef.name = "Master void body";
				itemDef.modelID = 65387;
				itemDef.maleEquip1 = 65388;
				itemDef.femaleEquip1 = 65388;
				itemDef2 = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemDef2.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemDef2.modelOffsetY;
				itemDef.modelZoom = itemDef2.modelZoom;
				itemDef.rotationY = itemDef2.rotationY;
				itemDef.rotationX = itemDef2.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{52};
				itemDef.editedModelColor = new int[]{73};

				break;
			case 9362:
				itemDef.name = "Master Void legs";

				itemDef.modelID = 65389;
				itemDef.maleEquip1 = 65390;
				itemDef.femaleEquip1 = 65390;
				def = ItemDefinition.get(4900);
				itemDef.modelOffsetX = def.modelOffsetX;
//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{52};
				itemDef.editedModelColor = new int[]{73};

				break;
			case 9363:
				itemDef.name = "Master void helm (melee)";
				itemDef.modelID = 65130;
				itemDef.maleEquip1 = 65131;
				itemDef.femaleEquip1 = 65131;
				def = ItemDefinition.get(4882);
				itemDef.modelOffsetX = def.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 40; // the texture that it currently has
				itemDef.editedModelColor[0] = 73;
				itemDef.stackable = false;
				break;
			case 9364:
				itemDef.name = "Master void helm (magic)";
				itemDef.modelID = 65112;
				itemDef.maleEquip1 = 65113;
				itemDef.femaleEquip1 = 65113;
				def = ItemDefinition.get(4882);
				itemDef.modelOffsetX = def.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 40; // the texture that it currently has
				itemDef.editedModelColor[0] = 73; // the new texture u want it to have
				itemDef.stackable = false;
				// itemDef.setTexture(matid, textureid);
				// itemDef.applyTexturing(model, id);
				// itemDef.rdc2 = 8822;
				break;
			case 15922:
				itemDef.name = "Maleficent helm";
				itemDef.modelID = 65450;
				itemDef.maleEquip1 = 65451;
				itemDef.femaleEquip1 = 65451;
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 57; // the texture that it currently has
				itemDef.editedModelColor[0] = 66; // the new texture u want it to have
				break;
			case 7885:
				itemDef.name = "Mac's blade";
				ItemDefinition trinity = ItemDefinition.get(20538);
				// itemDef.modelID = itemDef2.modelID;
				itemDef.modelID = 65428;
				itemDef.femaleEquip1 = 65429;
				itemDef.maleEquip1 = 65429;
				itemDef.modelOffsetX = trinity.modelOffsetX;
				//itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = trinity.modelOffsetY;
				itemDef.modelZoom = trinity.modelZoom;
				itemDef.rotationY = trinity.rotationY;
				itemDef.rotationX = trinity.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{52};
				itemDef.editedModelColor = new int[]{52};
				break;
			case 20551:
				itemDef.modelID = 65341;
				itemDef.maleEquip1 = 65342;
				itemDef.femaleEquip1 = 65342;
				itemDef.name = "Riddler's Glaive";
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.newModelColor = new int[]{60, 62};
				itemDef.editedModelColor = new int[]{68, 68};
				//itemDef.rdc2 = 7007;
				break;
			case 20558:
				itemDef.modelID = 65341;
				itemDef.maleEquip1 = 65342;
				itemDef.femaleEquip1 = 65342;
				itemDef.name = "Aids spreader (glaive)";
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.newModelColor = new int[]{60, 62};
				itemDef.editedModelColor = new int[]{57, 57};
				//itemDef.rdc2 = 7007;
				break;
			case 20559:
				itemDef.name = "Rabies spreader (offhand)";
				itemDef.modelID = 65409;
				itemDef.maleEquip1 = 65411;
				itemDef.femaleEquip1 = 65411;
				def = ItemDefinition.get(19146);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[5];
				itemDef.actions[4] = "Drop";
				itemDef.actions[1] = "Wear";
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{55};
				itemDef.editedModelColor = new int[]{57};
				break;
			case 4017:
				itemDef.modelID = 65341;
				itemDef.maleEquip1 = 65342;
				itemDef.femaleEquip1 = 65342;
				itemDef.name = "<shad=1><col=00e673>Extreme Glaive";
				trinity = ItemDefinition.get(20551);
				itemDef.modelOffsetX = trinity.modelOffsetX;
				itemDef.modelOffsetY = trinity.modelOffsetY;
				itemDef.modelZoom = trinity.modelZoom;
				itemDef.rotationY = trinity.rotationY;
				itemDef.rotationX = trinity.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.newModelColor = new int[]{60, 62};
				itemDef.editedModelColor = new int[]{59, 59};
				//itemDef.rdc2 = 7007;
				break;
			case 4018:
				itemDef.name = "<shad=1><col=00e673>Extreme Offhand";
				itemDef.modelID = 65409;
				itemDef.maleEquip1 = 65411;
				itemDef.femaleEquip1 = 65411;
				trinity = ItemDefinition.get(19146);
				itemDef.modelOffsetX = trinity.modelOffsetX;
				itemDef.modelOffsetY = trinity.modelOffsetY;
				itemDef.modelZoom = trinity.modelZoom;
				itemDef.rotationY = trinity.rotationY;
				itemDef.rotationX = trinity.rotationX;
				itemDef.actions = new String[5];
				itemDef.actions[4] = "Drop";
				itemDef.actions[1] = "Wear";
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{55};
				itemDef.editedModelColor = new int[]{59};
				break;
			case 3260:
				itemDef.name = "@red@Supreme Blade";
				ItemDefinition trinity2 = ItemDefinition.get(20538);
				// itemDef.modelID = itemDef2.modelID;
				itemDef.modelID = 65428;
				itemDef.femaleEquip1 = 65429;
				itemDef.maleEquip1 = 65429;
				itemDef.modelOffsetX = trinity2.modelOffsetX;
				//itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = trinity2.modelOffsetY;
				itemDef.modelZoom = trinity2.modelZoom;
				itemDef.rotationY = trinity2.rotationY;
				itemDef.rotationX = trinity2.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{52};
				itemDef.editedModelColor = new int[]{52};
				break;
			case 5432:
				itemDef.modelID = 65341;
				itemDef.maleEquip1 = 65342;
				itemDef.femaleEquip1 = 65342;
				itemDef.name = "Maddest glaive";
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.newModelColor = new int[]{60, 62};
				itemDef.editedModelColor = new int[]{71, 71};
				//itemDef.rdc2 = 7007;
				break;
			case 522:
				itemDef.name = "Saggy's broomstick";
				itemDef.modelID = 65127;
				itemDef.maleEquip1 = 65128;
				itemDef.femaleEquip1 = 65128;
				def = ItemDefinition.get(1321);
				itemDef.modelOffsetX = def.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 40; // the texture that it currently has
				itemDef.editedModelColor[0] = 70;
				itemDef.stackable = false;
				break;
			case 523:// tetsu
				itemDef.name = "Saggy helm";
				itemDef.modelID = 65078;
				itemDef.maleEquip1 = 65079;
				itemDef.femaleEquip1 = 65079;
				def = ItemDefinition.get(4882);
				itemDef.modelOffsetX = def.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				//	itemDef.rdc2 = 9999;
				itemDef.newModelColor = new int[]{55};
				itemDef.editedModelColor = new int[]{70};
				break;
			case 524:// tetsu
				itemDef.name = "Saggy body";
				itemDef.modelID = 65080;
				itemDef.maleEquip1 = 65081;
				itemDef.femaleEquip1 = 65081;
				def = ItemDefinition.get(4894);
				itemDef.modelOffsetX = def.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				//itemDef.rdc2 = 9999;
				itemDef.newModelColor = new int[]{55};
				itemDef.editedModelColor = new int[]{70};
				break;
			case 525:// tetsu
				itemDef.name = "Saggy legs";
				itemDef.modelID = 65082;
				itemDef.maleEquip1 = 65083;
				itemDef.femaleEquip1 = 65083;
				def = ItemDefinition.get(4900);
				itemDef.modelOffsetX = def.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.newModelColor = new int[]{55};
				itemDef.editedModelColor = new int[]{70};
				//	itemDef.rdc2 = 9999;
				break;


			case 666:
				itemDef.name = "<col=b3b4f2>Demon+ hood";
				def = ItemDefinition.get(15422);
				itemDef.modelID = def.modelID;
				itemDef.maleEquip1 = def.maleEquip1;
				itemDef.femaleEquip1 = def.femaleEquip1;
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.rdc2 = 83433339;
				
				break;
			case 15424:
				itemDef.name = "<col=b3b4f2>Demon+ top";

				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.rdc2 = 83433339;
				
				break;
			case 674:
				itemDef.name = "<col=b3b4f2>Demon+ bottom";
				def = ItemDefinition.get(15425);
				itemDef.modelID = def.modelID;
				itemDef.maleEquip1 = def.maleEquip1;
				itemDef.femaleEquip1 = def.femaleEquip1;
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.rdc2 = 83433339;
				
				break;
			case 669:
				itemDef.name = "Imp wings ";
				def = ItemDefinition.get(4411);
				itemDef.modelID = def.modelID;
				itemDef.maleEquip1 = def.maleEquip1;
				itemDef.femaleEquip1 = def.femaleEquip1;
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.rdc2 = 3453;
				
				break;
			case 671:
				itemDef.name = "Imp HandCannon ";
				def = ItemDefinition.get(15241);
				itemDef.modelID = def.modelID;
				itemDef.maleEquip1 = def.maleEquip1;
				itemDef.femaleEquip1 = def.femaleEquip1;
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.rdc2 = 1234;
				
				break;
			case 672:
				itemDef.name = "Imp gloves";
				def = ItemDefinition.get(14602);
				itemDef.modelID = def.modelID;
				itemDef.maleEquip1 = def.maleEquip1;
				itemDef.femaleEquip1 = def.femaleEquip1;
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.rdc2 = 1234;
				
				break;
			case 673:
				itemDef.name = "Imp boots";
				def = ItemDefinition.get(14605);
				itemDef.modelID = def.modelID;
				itemDef.maleEquip1 = def.maleEquip1;
				itemDef.femaleEquip1 = def.femaleEquip1;
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.rdc2 = 1234;
				
				break;
			case 14405:
			case 14395:
			case 14415:
				itemDef.name = itemDef.name.replace("class 3", "Imp");
				itemDef.name = itemDef.name.replace("(b)", "");
				itemDef.rdc2 = 54321;
				
				break;

			case 677:
				itemDef.name = "Lord helmet";
				def = ItemDefinition.get(19471);
				itemDef.modelID = def.modelID;
				itemDef.maleEquip1 = def.maleEquip1;
				itemDef.femaleEquip1 = def.femaleEquip1;
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.rdc2 = 9183;
				
				break;
			case 678:
				itemDef.name = "Lord body";
				def = ItemDefinition.get(19470);
				itemDef.modelID = def.modelID;
				itemDef.maleEquip1 = def.maleEquip1;
				itemDef.femaleEquip1 = def.femaleEquip1;
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.rdc2 = 9183;
				
				break;
			case 679:
				itemDef.name = "Lord legs";
				def = ItemDefinition.get(19469);
				itemDef.modelID = def.modelID;
				itemDef.maleEquip1 = def.maleEquip1;
				itemDef.femaleEquip1 = def.femaleEquip1;
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.rdc2 = 9183;
				
				break;
			case 676:
				itemDef.name = "Lord longsword";
				def = ItemDefinition.get(22075);
				itemDef.modelID = def.modelID;
				itemDef.maleEquip1 = def.maleEquip1;
				itemDef.femaleEquip1 = def.femaleEquip1;
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.rdc2 = 9183;
				
				break;
			case 681:
				itemDef.name = "lord of the ring";
				def = ItemDefinition.get(15398);
				itemDef.modelID = def.modelID;
				itemDef.maleEquip1 = def.maleEquip1;
				itemDef.femaleEquip1 = def.femaleEquip1;
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.rdc2 = 9183;
				
				break;
			case 18363:
				itemDef.name = "Lords deflector";
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.rdc2 = 9183;
				
				break;
			case 734:
				itemDef.name = "<col=b3b4f2>Demon big maul";
				def = ItemDefinition.get(17710);
				itemDef.modelID = def.modelID;
				itemDef.maleEquip1 = def.maleEquip1;
				itemDef.femaleEquip1 = def.femaleEquip1;
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.rdc2 = 49494;
				
				break;
			case 19149:
				itemDef.name = "Swoodo bow";
				

				break;
			case 12930:
				itemDef.name = "Swoodo Shield";
				

				break;

			case 16021:
				itemDef.name = "Maleficent body";
				itemDef.modelID = 65452;
				itemDef.maleEquip1 = 65453;
				itemDef.femaleEquip1 = 65453;
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 57; // the texture that it currently has
				itemDef.editedModelColor[0] = 66; // the new texture u want it to have
				break;
			case 15933:
				itemDef.name = "Maleficent legs";
				itemDef.modelID = 65454;
				itemDef.maleEquip1 = 65455;
				itemDef.femaleEquip1 = 65455;
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 57; // the texture that it currently has
				itemDef.editedModelColor[0] = 66; // the new texture u want it to have
				break;
			case 19682:
				itemDef.name = "Loot device";
				itemDef.actions = new String[]{null, null, null, null, "Drop"};
				//itemDef.rdc2 = 3222;
				break;
			case 8830:
				itemDef.name = "Penguin Cape";
				trinity = ItemDefinition.get(6570);
				itemDef.modelOffsetX = trinity.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = trinity.modelOffsetY;
				itemDef.modelZoom = trinity.modelZoom;
				itemDef.rotationY = trinity.rotationY;
				itemDef.rotationX = trinity.rotationX;
				itemDef.modelID = 65447;
				itemDef.maleEquip1 = 65446;
				itemDef.femaleEquip1 = 65446;
				itemDef.actions = trinity.actions;
				itemDef.editedModelColor = new int[2]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[2]; // same here
				itemDef.newModelColor[0] = 54; // the texture that it currently has
				itemDef.editedModelColor[0] = 63;
				itemDef.newModelColor[1] = 65; // the texture that it currently has
				itemDef.editedModelColor[1] = 63; // the new texture u want it to have
				itemDef.stackable = false;
				itemDef.value = 1;
				break;
			case 8812:
				itemDef.name = "Solak gloves";
				trinity = ItemDefinition.get(7671);
				itemDef.modelOffsetX = trinity.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = trinity.modelOffsetY;
				itemDef.modelZoom = trinity.modelZoom;
				itemDef.rotationY = trinity.rotationY;
				itemDef.rotationX = trinity.rotationX;
				itemDef.modelID = 65360;
				itemDef.femaleEquip1 = 65361;
				itemDef.maleEquip1 = 65361;
				itemDef.actions = trinity.actions;
				
				itemDef.rdc2 = 24252;
				break;
			case 18883:
				itemDef.name = "Supreme gloves";
				trinity = ItemDefinition.get(7671);
				itemDef.modelOffsetX = trinity.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = trinity.modelOffsetY;
				itemDef.modelZoom = trinity.modelZoom;
				itemDef.rotationY = trinity.rotationY;
				itemDef.rotationX = trinity.rotationX;
				itemDef.modelID = 65360;
				itemDef.femaleEquip1 = 65361;
				itemDef.maleEquip1 = 65361;
				itemDef.actions = trinity.actions;
				itemDef.rdc2 = 42812;
				break;

			case 18885:
				itemDef.name = "@cya@Mega gloves";
				trinity = ItemDefinition.get(7671);
				itemDef.modelOffsetX = trinity.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = trinity.modelOffsetY;
				itemDef.modelZoom = trinity.modelZoom;
				itemDef.rotationY = trinity.rotationY;
				itemDef.rotationX = trinity.rotationX;
				itemDef.modelID = 65360;
				itemDef.femaleEquip1 = 65361;
				itemDef.maleEquip1 = 65361;
				itemDef.actions = trinity.actions;
				itemDef.rdc2 = 42812;
				break;

			case 8819:
				itemDef.name = "Bulwark gloves";
				trinity = ItemDefinition.get(7671);
				itemDef.modelOffsetX = trinity.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = trinity.modelOffsetY;
				itemDef.modelZoom = trinity.modelZoom;
				itemDef.rotationY = trinity.rotationY;
				itemDef.rotationX = trinity.rotationX;
				itemDef.modelID = 65360;
				itemDef.femaleEquip1 = 65361;
				itemDef.maleEquip1 = 65361;
				itemDef.actions = trinity.actions;
				//	itemDef.rdc2 = 47333;
				

				break;
			case 8820:
				itemDef.name = "Bulwark boots";
				trinity = ItemDefinition.get(20450);
				itemDef.modelOffsetX = trinity.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = trinity.modelOffsetY;
				itemDef.modelZoom = trinity.modelZoom;
				itemDef.rotationY = trinity.rotationY;
				itemDef.rotationX = trinity.rotationX;
				itemDef.modelID = 65362;
				itemDef.femaleEquip1 = 65362;
				itemDef.maleEquip1 = 65362;
				itemDef.actions = trinity.actions;
				
				break;
			case 8831:
				itemDef.name = "Penguin Ring";
				trinity = ItemDefinition.get(15401);
				itemDef.modelOffsetX = trinity.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = trinity.modelOffsetY;
				itemDef.modelZoom = trinity.modelZoom;
				itemDef.rotationY = trinity.rotationY;
				itemDef.rotationX = trinity.rotationX;
				itemDef.actions = trinity.actions;

				itemDef.modelID = 65303;
				itemDef.maleEquip1 = 65303;
				itemDef.femaleEquip1 = 65303;
				itemDef.editedModelColor = new int[1]; // same here
				itemDef.newModelColor = new int[1];
				itemDef.newModelColor[0] = 51; // the texture that it currently has
				itemDef.editedModelColor[0] = 63;
				break;
			case 8832:
				itemDef.name = "Staff Ring";
				trinity = ItemDefinition.get(15401);
				itemDef.modelOffsetX = trinity.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = trinity.modelOffsetY;
				itemDef.modelZoom = trinity.modelZoom;
				itemDef.rotationY = trinity.rotationY;
				itemDef.rotationX = trinity.rotationX;
				itemDef.actions = trinity.actions;

				itemDef.modelID = 65303;
				itemDef.maleEquip1 = 65303;
				itemDef.femaleEquip1 = 65303;
				itemDef.editedModelColor = new int[1]; // same here
				itemDef.newModelColor = new int[1];
				itemDef.newModelColor[0] = 51; // the texture that it currently has
				itemDef.editedModelColor[0] = 64;
				break;
			case 8800:
				itemDef.name = "Shikruu helm";
				itemDef.modelID = 65363;
				itemDef.maleEquip1 = 65364;
				itemDef.femaleEquip1 = 65364;
				trinity = ItemDefinition.get(4882);
				itemDef.modelOffsetX = trinity.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = trinity.modelOffsetY;
				itemDef.modelZoom = trinity.modelZoom;
				itemDef.rotationY = trinity.rotationY;
				itemDef.rotationX = trinity.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{53};
				itemDef.editedModelColor = new int[]{77};
				//	itemDef.rdc2 = 2353627;
				
				break;
			case 8801:
				itemDef.name = "Shikruu body";
				itemDef.modelID = 65365;
				itemDef.maleEquip1 = 65366;
				itemDef.femaleEquip1 = 65366;
				trinity = ItemDefinition.get(4894);
				itemDef.modelOffsetX = trinity.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = trinity.modelOffsetY;
				itemDef.modelZoom = trinity.modelZoom;
				itemDef.rotationY = trinity.rotationY;
				itemDef.rotationX = trinity.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{53};
				itemDef.editedModelColor = new int[]{77};
				
				//	itemDef.rdc2 = 2353627;
				break;

			case 8802:
				itemDef.name = "Shikruu legs";
				itemDef.modelID = 65367;
				itemDef.maleEquip1 = 65368;
				itemDef.femaleEquip1 = 65368;
				trinity = ItemDefinition.get(4900);
				itemDef.modelOffsetX = trinity.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = trinity.modelOffsetY;
				itemDef.modelZoom = trinity.modelZoom;
				itemDef.rotationY = trinity.rotationY;
				itemDef.rotationX = trinity.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{53};
				itemDef.editedModelColor = new int[]{77};
				
				//	itemDef.rdc2 = 2353627;
				break;
			/*case 1153:
				itemDef.name = "Starter full helm";
				itemDef.modelID = 80047;
				itemDef.maleEquip1 = 80048;
				itemDef.femaleEquip1 = 80048;
				itemDef.stackable = false;
				itemDef.rdc2 = 77643;
				break;
			case 1115:
				itemDef.name = "Starter platebody";
				itemDef.modelID = 80051;
				itemDef.maleEquip1 = 80052;
				itemDef.femaleEquip1 = 80052;
				itemDef.stackable = false;
				itemDef.rdc2 = 77643;//568322
				break;
			case 1067:
				itemDef.name = "Starter platelegs";
				itemDef.modelID = 80049;
				itemDef.maleEquip1 = 80050;
				itemDef.femaleEquip1 = 80050;
				itemDef.stackable = false;
				itemDef.rdc2 = 77643;
				break;
*/
			case 8323:
				itemDef.name = "T4 Magic helm";
				itemDef.modelID = 65456;
				itemDef.maleEquip1 = 65457;
				itemDef.femaleEquip1 = 65457;
				trinity = ItemDefinition.get(4882);
				itemDef.modelOffsetX = trinity.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = trinity.modelOffsetY;
				itemDef.modelZoom = trinity.modelZoom;
				itemDef.rotationY = trinity.rotationY;
				itemDef.rotationX = trinity.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{56};
				itemDef.editedModelColor = new int[]{79};
				
				break;
			case 8324:
				itemDef.name = "T4 Magic body";
				itemDef.modelID = 65458;
				itemDef.maleEquip1 = 65459;
				itemDef.femaleEquip1 = 65459;
				trinity = ItemDefinition.get(4894);
				itemDef.modelOffsetX = trinity.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = trinity.modelOffsetY;
				itemDef.modelZoom = trinity.modelZoom;
				itemDef.rotationY = trinity.rotationY;
				itemDef.rotationX = trinity.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{56};
				itemDef.editedModelColor = new int[]{79};
				
				break;

			case 8325:
				itemDef.name = "T4 Magic legs";
				itemDef.modelID = 65460;
				itemDef.maleEquip1 = 65461;
				itemDef.femaleEquip1 = 65461;
				trinity = ItemDefinition.get(4900);
				itemDef.modelOffsetX = trinity.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = trinity.modelOffsetY;
				itemDef.modelZoom = trinity.modelZoom;
				itemDef.rotationY = trinity.rotationY;
				itemDef.rotationX = trinity.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{56};
				itemDef.editedModelColor = new int[]{79};
				
				break;
			case 8326:
				itemDef.name = "Starter helm";
				itemDef.modelID = 65462;
				itemDef.maleEquip1 = 65463;
				itemDef.femaleEquip1 = 65463;
				trinity = ItemDefinition.get(4882);
				itemDef.modelOffsetX = trinity.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = trinity.modelOffsetY;
				itemDef.modelZoom = trinity.modelZoom;
				itemDef.rotationY = trinity.rotationY;
				itemDef.rotationX = trinity.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{56};
				itemDef.editedModelColor = new int[]{52};
				
				break;
			case 8327:
				itemDef.name = "Starter body";
				itemDef.modelID = 65464;
				itemDef.maleEquip1 = 65465;
				itemDef.femaleEquip1 = 65465;
				trinity = ItemDefinition.get(4894);
				itemDef.modelOffsetX = trinity.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = trinity.modelOffsetY;
				itemDef.modelZoom = trinity.modelZoom;
				itemDef.rotationY = trinity.rotationY;
				itemDef.rotationX = trinity.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{56};
				itemDef.editedModelColor = new int[]{52};
				
				break;

			case 8328:
				itemDef.name = "Starter legs";
				itemDef.modelID = 65466;
				itemDef.maleEquip1 = 65467;
				itemDef.femaleEquip1 = 65467;
				trinity = ItemDefinition.get(4900);
				itemDef.modelOffsetX = trinity.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = trinity.modelOffsetY;
				itemDef.modelZoom = trinity.modelZoom;
				itemDef.rotationY = trinity.rotationY;
				itemDef.rotationX = trinity.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{56};
				itemDef.editedModelColor = new int[]{52};
				
				break;
			case 9250:
				itemDef.name = "Yogifus helm";
				itemDef.modelID = 65462;
				itemDef.maleEquip1 = 65463;
				itemDef.femaleEquip1 = 65463;
				trinity = ItemDefinition.get(4882);
				itemDef.modelOffsetX = trinity.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = trinity.modelOffsetY;
				itemDef.modelZoom = trinity.modelZoom;
				itemDef.rotationY = trinity.rotationY;
				itemDef.rotationX = trinity.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{56};
				itemDef.editedModelColor = new int[]{67};
				//	itemDef.rdc2 = 2353627;
				break;
			case 9251:
				itemDef.name = "Yogifus body";
				itemDef.modelID = 65464;
				itemDef.maleEquip1 = 65465;
				itemDef.femaleEquip1 = 65465;
				trinity = ItemDefinition.get(4894);
				itemDef.modelOffsetX = trinity.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = trinity.modelOffsetY;
				itemDef.modelZoom = trinity.modelZoom;
				itemDef.rotationY = trinity.rotationY;
				itemDef.rotationX = trinity.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{56};
				itemDef.editedModelColor = new int[]{67};
				//	itemDef.rdc2 = 2353627;
				break;

			case 9252:
				itemDef.name = "Yogifus legs";
				itemDef.modelID = 65466;
				itemDef.maleEquip1 = 65467;
				itemDef.femaleEquip1 = 65467;
				trinity = ItemDefinition.get(4900);
				itemDef.modelOffsetX = trinity.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = trinity.modelOffsetY;
				itemDef.modelZoom = trinity.modelZoom;
				itemDef.rotationY = trinity.rotationY;
				itemDef.rotationX = trinity.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{56};
				itemDef.editedModelColor = new int[]{67};
				//	itemDef.rdc2 = 2353627;
				break;
			case 9253:
				itemDef.name = "Yogi's picnic basket";
				ItemDefinition itemdefyogipic = ItemDefinition.get(20538);
				// itemDef.modelID = itemDef2.modelID;
				itemDef.modelID = 65428;
				itemDef.femaleEquip1 = 65429;
				itemDef.maleEquip1 = 65429;
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.stackable = false;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				//itemDef.stackable = false;
				itemDef.newModelColor = new int[]{52};
				itemDef.editedModelColor = new int[]{67};
				//itemDef.rdc2 = 222222;
				break;
			case 9254:
				itemDef.name = "Madman helm";
				itemDef.modelID = 65130;
				itemDef.maleEquip1 = 65131;
				itemDef.femaleEquip1 = 65131;
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 40; // the texture that it currently has
				itemDef.editedModelColor[0] = 71;
				itemDef.stackable = false;
				break;
			case 9255:
				itemDef.name = "Madman platebody";
				itemDef.modelID = 65132;
				itemDef.maleEquip1 = 65133;
				itemDef.femaleEquip1 = 65133;
				itemdefyogipic = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 40; // the texture that it currently has
				itemDef.editedModelColor[0] = 71;
				itemDef.stackable = false;
				break;
			case 9256:
				itemDef.name = "Madman legs";
				itemDef.modelID = 65134;
				itemDef.maleEquip1 = 65135;
				itemDef.femaleEquip1 = 65135;
				itemdefyogipic = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 40; // the texture that it currently has
				itemDef.editedModelColor[0] = 71;
				itemDef.stackable = false;
				break;
			case 9257:
				itemDef.name = "Epic Defender";
				itemDef.modelID = 65127;
				itemDef.maleEquip1 = 65128;
				itemDef.femaleEquip1 = 65128;
				itemdefyogipic = ItemDefinition.get(1321);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 40; // the texture that it currently has
				itemDef.editedModelColor[0] = 61;
				itemDef.stackable = false;
				break;
			case 9258:
				itemDef.name = "Yogifus Cape";
				itemdefyogipic = ItemDefinition.get(6570);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 65104;
				itemDef.maleEquip1 = 65105;
				itemDef.femaleEquip1 = 65105;
				itemDef.actions = itemdefyogipic.actions;
				itemDef.editedModelColor = new int[2]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[2]; // same here
				itemDef.newModelColor[0] = 52; // the texture that it currently has
				itemDef.editedModelColor[0] = 67;
				itemDef.newModelColor[1] = 920; // the texture that it currently has
				itemDef.editedModelColor[1] = 50; // the new texture u want it to have
				itemDef.stackable = false;
				itemDef.value = 1;
				break;
			case 8330:
				itemDef.name = "T4 Range helm";
				itemDef.modelID = 65468;
				itemDef.maleEquip1 = 65469;
				itemDef.femaleEquip1 = 65469;
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{56};
				itemDef.editedModelColor = new int[]{68};
				
				break;
			case 8331:
				itemDef.name = "T4 Range body";
				itemDef.modelID = 65470;
				itemDef.maleEquip1 = 65471;
				itemDef.femaleEquip1 = 65471;
				itemdefyogipic = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{56};
				itemDef.editedModelColor = new int[]{68};
				
				break;

			case 8332:
				itemDef.name = "T4 Range legs";
				itemDef.modelID = 65472;
				itemDef.maleEquip1 = 65473;
				itemDef.femaleEquip1 = 65473;
				itemdefyogipic = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{56};
				itemDef.editedModelColor = new int[]{68};
				
				break;
			case 8806:
				itemDef.name = "Ganopurp visor";
				itemDef.modelID = 65371;
				itemDef.maleEquip1 = 65372;
				itemDef.femaleEquip1 = 65372;
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{59};
				itemDef.editedModelColor = new int[]{54};
				//	itemDef.rdc2 = 2353627;
				
				break;
			case 8807:
				itemDef.name = "Ganopurp poncho";
				itemDef.modelID = 65373;
				itemDef.maleEquip1 = 65374;
				itemDef.femaleEquip1 = 65374;
				itemdefyogipic = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{59};
				itemDef.editedModelColor = new int[]{54};
				
				//	itemDef.rdc2 = 2353627;
				break;

			case 8808:
				itemDef.name = "Ganopurp legging";
				itemDef.modelID = 65375;
				itemDef.maleEquip1 = 65376;
				itemDef.femaleEquip1 = 65376;
				itemdefyogipic = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{59};
				itemDef.editedModelColor = new int[]{54};
				
				//	itemDef.rdc2 = 2353627;
				break;
			case 8803:
				itemDef.name = "Sorrow horn-coif";
				itemDef.modelID = 65377;
				itemDef.maleEquip1 = 65378;
				itemDef.femaleEquip1 = 65378;
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				//	itemDef.rdc2 = 2353627;
				itemDef.newModelColor = new int[]{55};
				itemDef.editedModelColor = new int[]{78};
				
				break;
			case 8804:
				itemDef.name = "Sorrow body";
				itemDef.modelID = 65379;
				itemDef.maleEquip1 = 65380;
				itemDef.femaleEquip1 = 65380;
				itemdefyogipic = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{78};
				//	itemDef.rdc2 = 2353627;
				
				break;

			case 8805:
				itemDef.name = "Sorrow chaps";
				itemDef.modelID = 65381;
				itemDef.maleEquip1 = 65382;
				itemDef.femaleEquip1 = 65382;
				itemdefyogipic = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{78};
				//	itemDef.rdc2 = 2353627;
				
				break;
			case 8821:
				itemDef.name = "Shikruu wings";
				itemDef.modelID = 65369;
				itemDef.maleEquip1 = 65370;
				itemDef.femaleEquip1 = 65370;
				itemdefyogipic = ItemDefinition.get(18509);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{55};
				//	itemDef.rdc2 = 2353627;
				break;

			case 8822:
				itemDef.name = "Loyalty helm";
				itemDef.modelID = 65385;
				itemDef.maleEquip1 = 65386;
				itemDef.femaleEquip1 = 65386;
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{52};
				itemDef.editedModelColor = new int[]{67};
				//	itemDef.rdc2 = 2353627;
				break;
			case 8823:
				itemDef.name = "Loyalty body";
				itemDef.modelID = 65387;
				itemDef.maleEquip1 = 65388;
				itemDef.femaleEquip1 = 65388;
				itemdefyogipic = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{52};
				itemDef.editedModelColor = new int[]{67};
				//	itemDef.rdc2 = 2353627;
				break;

			case 8824:
				itemDef.name = "Loyalty legs";
				itemDef.modelID = 65389;
				itemDef.maleEquip1 = 65390;
				itemDef.femaleEquip1 = 65390;
				itemdefyogipic = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{52};
				itemDef.editedModelColor = new int[]{67};
				//	itemDef.rdc2 = 2353627;
				break;
			case 8825:
				itemDef.name = "KBD helm";
				itemDef.modelID = 65391;
				itemDef.maleEquip1 = 65392;
				itemDef.femaleEquip1 = 65392;
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{52};
				itemDef.editedModelColor = new int[]{76};
				//	itemDef.rdc2 = 2353627;
				break;
			case 8826:
				itemDef.name = "KBD body";
				itemDef.modelID = 65393;
				itemDef.maleEquip1 = 65394;
				itemDef.femaleEquip1 = 65394;
				itemdefyogipic = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{52};
				itemDef.editedModelColor = new int[]{76};
				//	itemDef.rdc2 = 2353627;
				break;

			case 8827:
				itemDef.name = "KBD legs";
				itemDef.modelID = 65395;
				itemDef.maleEquip1 = 65396;
				itemDef.femaleEquip1 = 65396;
				itemdefyogipic = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{52};
				itemDef.editedModelColor = new int[]{76};
				//	itemDef.rdc2 = 2353627;
				break;

			case 8860:
				itemDef.name = "Predator helm";
				itemDef.modelID = 65403;
				itemDef.maleEquip1 = 65404;
				itemDef.femaleEquip1 = 65404;
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{63};
				itemDef.editedModelColor = new int[]{70};
				
				break;
			case 8861:
				itemDef.name = "Predator body";
				itemDef.modelID = 65405;
				itemDef.maleEquip1 = 65406;
				itemDef.femaleEquip1 = 65406;
				itemdefyogipic = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{63};
				itemDef.editedModelColor = new int[]{70};
				
				break;

			case 8862:
				itemDef.name = "Predator legs";
				itemDef.modelID = 65407;
				itemDef.maleEquip1 = 65408;
				itemDef.femaleEquip1 = 65408;
				itemdefyogipic = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{63};
				itemDef.editedModelColor = new int[]{70};
				
				break;
			case 8857:
				itemDef.name = "Nebula helm";
				itemDef.modelID = 65391;
				itemDef.maleEquip1 = 65392;
				itemDef.femaleEquip1 = 65392;
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{52};
				itemDef.editedModelColor = new int[]{61};
				//	itemDef.rdc2 = 2353627;
				break;
			case 8858:
				itemDef.name = "Nebula body";
				itemDef.modelID = 65393;
				itemDef.maleEquip1 = 65394;
				itemDef.femaleEquip1 = 65394;
				itemdefyogipic = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{52};
				itemDef.editedModelColor = new int[]{61};
				//	itemDef.rdc2 = 2353627;
				break;

			case 8859:
				itemDef.name = "Nebula legs";
				itemDef.modelID = 65395;
				itemDef.maleEquip1 = 65396;
				itemDef.femaleEquip1 = 65396;
				itemdefyogipic = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{52};
				itemDef.editedModelColor = new int[]{61};
				//	itemDef.rdc2 = 2353627;
				break;
			case 16835:
				itemDef.name = "Nebula whip";
				itemDef.modelID = 65141;
				itemDef.maleEquip1 = 65142;
				itemDef.femaleEquip1 = 65142;
				itemdefyogipic = ItemDefinition.get(13131);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 40; // the texture that it currently has
				itemDef.editedModelColor[0] = 61; // the new texture u want it to have
				itemDef.stackable = false;
				break;
			case 5154:
				itemDef.name = "Multiplier @cya@+100";
				itemdefyogipic = ItemDefinition.get(12845);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = itemdefyogipic.actions;
				itemDef.modelID = itemdefyogipic.modelID;
				break;
			case 5155:
				itemDef.name = "Multiplier @cya@+1000";
				itemdefyogipic = ItemDefinition.get(12845);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = itemdefyogipic.actions;
				itemDef.modelID = itemdefyogipic.modelID;
				break;
			case 5156:
				itemDef.name = "Multiplier @cya@+10000";
				itemdefyogipic = ItemDefinition.get(12845);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = itemdefyogipic.actions;
				itemDef.modelID = itemdefyogipic.modelID;
				break;
			case 5500:
				itemDef.name = "<img=15>Multiplier +1";
				itemdefyogipic = ItemDefinition.get(12845);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = itemdefyogipic.actions;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.rdc2 = 292;
				break;
			case 2023:
				itemDef.name = "Lazycat Bones";
				itemDef.newModelColor = new int[]{63};//old
				itemdefyogipic = ItemDefinition.get(526);
				itemDef.editedModelColor = new int[]{40};//new
				itemDef.actions = itemdefyogipic.actions;
				itemDef.modelID = 65285;
				itemDef.modelZoom = 1500;
				break;
			case 2025:
				itemDef.name = "Dragonballz Bones";
				itemDef.newModelColor = new int[]{63};//old
				itemdefyogipic = ItemDefinition.get(526);
				itemDef.editedModelColor = new int[]{84};//new
				itemDef.actions = itemdefyogipic.actions;
				itemDef.modelID = 65285;
				itemDef.modelZoom = 1500;
				break;
			case 2026:
				itemDef.name = "Special Bones";
				itemDef.newModelColor = new int[]{63};//old
				itemdefyogipic = ItemDefinition.get(526);
				itemDef.editedModelColor = new int[]{83};//new
				itemDef.actions = itemdefyogipic.actions;
				itemDef.modelID = 65285;
				itemDef.modelZoom = 1500;
				break;
			case 20481:
				itemDef.name = "Summoning charm box";
				itemdefyogipic = ItemDefinition.get(7630);
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.rdc2 = 23454;
				itemDef.actions = itemdefyogipic.actions;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				break;
			case 13172:
				itemDef.name = "Inferno cat mask";
				itemDef.rdc2 = 852661;
				break;

			case 13169:
				itemDef.name = "Brown sheep mask";
				itemDef.rdc2 = 3256;
				break;
			case 10721:
				itemDef.name = "Black frog mask";
				itemDef.rdc2 = 46234;
				break;
			case 19278:
				itemDef.name = "Golden unicorn mask";
				itemDef.rdc2 = 9924;
				break;
			case 9920:
				itemDef.name = "Haunted jack lantern mask";
				itemDef.rdc2 = 34563;//1242
				break;
			case 14824:
				itemDef.name = "Octo mask ";
				itemDef.rdc2 = 24242;
				break;
			case 14825:
				itemDef.name = "Ray mask";
				itemDef.rdc2 = 24242;
				break;
			case 14826:
				itemDef.name = "Manta mask";
				itemDef.rdc2 = 24242;
				break;
			case 8809:
				itemDef.name = "Ganopurp staff";
				itemDef.modelID = 65383;
				itemDef.maleEquip1 = 65384;
				itemDef.femaleEquip1 = 65384;
				itemdefyogipic = ItemDefinition.get(19146);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[5];
				itemDef.newModelColor = new int[]{59};
				itemDef.editedModelColor = new int[]{54};
				itemDef.actions[4] = "Drop";
				itemDef.actions[1] = "Wear";
				
				itemDef.stackable = false;
				break;
			case 15830:
				itemDef.name = "Predator boots";
				

				break;
			case 8834:
				itemDef.name = "Predator Reaper";
				itemDef.modelID = 65409;
				itemDef.maleEquip1 = 65410;
				itemDef.femaleEquip1 = 65410;
				itemdefyogipic = ItemDefinition.get(19146);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[5];
				itemDef.actions[4] = "Drop";
				itemDef.actions[1] = "Wear";
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{55};
				itemDef.editedModelColor = new int[]{70};
				

				break;
			case 8835:
				itemDef.name = "Predator Offhand";
				itemDef.modelID = 65409;
				itemDef.maleEquip1 = 65411;
				itemDef.femaleEquip1 = 65411;
				itemdefyogipic = ItemDefinition.get(19146);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[5];
				itemDef.actions[4] = "Drop";
				itemDef.actions[1] = "Wear";
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{55};
				itemDef.editedModelColor = new int[]{70};
				

				break;
			case 8810:
				itemDef.modelID = 65351;
				itemDef.maleEquip1 = 65352;
				itemDef.femaleEquip1 = 65352;
				itemDef.name = "<col=7f39f2>Solak Wings";
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 59; // the texture that it currently has
				itemDef.editedModelColor[0] = 71; //
				itemDef.actions = new String[5];
				itemDef.actions[4] = "Drop";
				itemDef.actions[1] = "Wear";
				

				break;
			case 11195:
				itemDef.name = "<col=39383a>Shadow Necklace";
				itemDef.rdc2 = 7262;
				

				break;
			case 8813:
				itemDef.name = "Shukarhazh helm";
				itemDef.modelID = 65272;
				itemDef.maleEquip1 = 65273;
				itemDef.femaleEquip1 = 65273;
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				
				itemDef.rdc2 = 452;
				break;
			case 8814:
				itemDef.name = "Shukarhazh body";
				itemDef.modelID = 65274;
				itemDef.maleEquip1 = 65275;
				itemDef.femaleEquip1 = 65275;
				itemdefyogipic = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				
				itemDef.rdc2 = 452;
				break;
			case 8815:
				itemDef.name = "Shukarhazh legs";
				itemDef.modelID = 65276;
				itemDef.maleEquip1 = 65277;
				itemDef.femaleEquip1 = 65277;
				itemdefyogipic = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				

				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				
				itemDef.rdc2 = 452;
				break;
			case 8816:
				itemDef.name = "Bulwark helm";
				itemDef.modelID = 65354;
				itemDef.maleEquip1 = 65355;
				itemDef.femaleEquip1 = 65355;
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 57; // the texture that it currently has
				itemDef.editedModelColor[0] = 65; //
				
				// itemDef.rdc2 = 23945;
				//	itemDef.rdc2 = 34737;
				break;
			case 16691:
				itemDef.name = "Ironman full helm";
				itemDef.modelID = 80047;
				itemDef.maleEquip1 = 80048;
				itemDef.femaleEquip1 = 80048;
				break;
			case 17239:
				itemDef.name = "Ironman platebody";
				itemDef.modelID = 80051;
				itemDef.maleEquip1 = 80052;
				itemDef.femaleEquip1 = 80052;
				break;
			case 16669:
				itemDef.name = "Ironman platelegs";
				itemDef.modelID = 80049;
				itemDef.maleEquip1 = 80050;
				itemDef.femaleEquip1 = 80050;

				break;
			case 4977:
				itemDef.name = "Ult. Ironman full helm";
				itemDef.modelID = 65440;
				itemDef.maleEquip1 = 65441;
				itemDef.femaleEquip1 = 65441;
				itemDef.rdc2 = 500;
				break;
			case 4989:
				itemDef.name = "Ult. Ironman platebody";
				itemDef.modelID = 65442;
				itemDef.maleEquip1 = 65443;
				itemDef.anInt188 = -1;
				itemDef.femaleEquip1 = 65443;
				itemDef.rdc2 = 500;
				break;
			case 4995:
				itemDef.name = "Ult. Ironman platelegs";
				itemDef.modelID = 65444;
				itemDef.maleEquip1 = 65445;
				itemDef.femaleEquip1 = 65445;
				itemDef.rdc2 = 500;
				break;
			case 15818:
				itemDef.name = "Lucien Defender";
				itemDef.modelID = 65127;
				itemDef.maleEquip1 = 65128;
				itemDef.femaleEquip1 = 65128;
				itemdefyogipic = ItemDefinition.get(1321);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 40; // the texture that it currently has
				itemDef.editedModelColor[0] = 12;
				
				itemDef.stackable = false;
				break;
			case 15888:
				itemDef.name = "Lucien whip";
				itemDef.modelID = 65141;
				itemDef.maleEquip1 = 65142;
				itemDef.femaleEquip1 = 65142;
				itemdefyogipic = ItemDefinition.get(13131);
				itemDef.modelOffsetX = 10;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = 1;
				itemDef.modelZoom = 1000;
				itemDef.rotationY = 600;
				itemDef.rotationX = 120;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.newModelColor = new int[]{59, 40};
				itemDef.editedModelColor = new int[]{12, 74};
				itemDef.newModelColor[0] = 40; // the texture that it currently has
				itemDef.editedModelColor[0] = 74; // the new texture u want it to hav
				
				itemDef.stackable = false;
				break;

			case 15924:
				itemDef.name = "Lucien helm";
				itemDef.modelID = 65335;
				//itemDef.name = "Torva full helm";
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.maleEquip1 = 65336;
				itemDef.femaleEquip1 = 65336;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				// itemDef.actions[2] = "Check-charges";
				itemDef.actions[4] = "Drop";
				//itemDef.maleDialogue = 62729;
				//itemDef.femaleDialogue = 62729;
				itemDef.newModelColor = new int[]{24, 40};
				itemDef.editedModelColor = new int[]{53, 12};
				itemDef.stackable = false;
				
				break;
			case 16023:
				itemDef.name = "Lucien platebody";
				itemDef.stackable = false;
				itemDef.modelID = 65337;
				//	itemDef.name = "Torva platebody";
				itemDef.modelZoom = 1506;
				itemDef.rotationY = 473;
				itemDef.rotationX = 2042;
				itemDef.modelOffsetX = 0;
				itemDef.modelOffsetY = 0;
				itemDef.maleEquip1 = 65338;
				itemDef.femaleEquip1 = 65338;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				// itemDef.actions[2] = "Check-charges";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{24, 40};
				itemDef.editedModelColor = new int[]{53, 12};
				
				break;
			case 15935:
				itemDef.name = "Lucien legs";
				itemDef.stackable = false;
				itemDef.modelID = 65339;
				//		itemDef.name = "Torva platelegs";
				itemDef.modelZoom = 1740;
				itemDef.rotationY = 474;
				itemDef.rotationX = 2045;
				itemDef.modelOffsetX = 0;
				itemDef.modelOffsetY = -5;
				itemDef.maleEquip1 = 65340;
				itemDef.femaleEquip1 = 65340;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				// itemDef.actions[2] = "Check-charges";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{24, 40};
				itemDef.editedModelColor = new int[]{53, 12};
				
				break;

			case 16272:
				itemDef.name = "Lucien boots";
				itemDef.modelID = 65138;
				itemDef.maleEquip1 = 65138;
				itemDef.femaleEquip1 = 65138;
				itemdefyogipic = ItemDefinition.get(3791);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 40; // the texture that it currently has
				itemDef.editedModelColor[0] = 12;
				itemDef.stackable = false;
				
				// itemDef.rdc2 = 8822;
				break;
			case 15591:
				itemDef.name = "xat full helm";
				itemDef.modelID = 65440;
				itemDef.maleEquip1 = 65441;
				itemDef.femaleEquip1 = 65441;
				itemdefyogipic = ItemDefinition.get(16691);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 121212;
				break;
			case 15592:
				itemDef.name = "xat platebody";
				itemDef.modelID = 65442;
				itemDef.maleEquip1 = 65443;
				itemDef.femaleEquip1 = 65443;
				itemdefyogipic = ItemDefinition.get(17239);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 121212;
				break;
			case 15593:
				itemDef.name = "<col=b5aaaa>Angelic platelegs";
				itemDef.modelID = 65444;
				itemDef.maleEquip1 = 65445;
				itemDef.femaleEquip1 = 65445;
				itemdefyogipic = ItemDefinition.get(16669);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 121212;
				
				break;
			case 703:
				itemDef.name = "<col=a69eb6>Avatar titan helm";
				itemDef.modelID = 65354;
				itemDef.maleEquip1 = 65355;
				itemDef.femaleEquip1 = 65355;
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 57; // the texture that it currently has
				itemDef.editedModelColor[0] = 71; //
				
				break;

			case 704:
				itemDef.name = "<col=a69eb6>Avatar titan body";
				itemDef.modelID = 65356;
				itemDef.maleEquip1 = 65357;
				itemDef.femaleEquip1 = 65357;
				itemdefyogipic = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				// itemDef.rdc2 = 23945;
				//itemDef.rdc2 = 34737;
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 57; // the texture that it currently has
				itemDef.editedModelColor[0] = 71; //
				
				break;

			case 705:
				itemDef.name = "<col=a69eb6>Avatar titan legs";
				itemDef.modelID = 65358;
				itemDef.maleEquip1 = 65359;
				itemDef.femaleEquip1 = 65359;
				itemdefyogipic = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 57; // the texture that it currently has
				itemDef.editedModelColor[0] = 71; //
				
				//	itemDef.rdc2 = 34737;
				break;
			case 15915:
				itemDef.name = "@red@Dan's Limited Mask";
				itemDef.modelID = 65433;
				itemDef.maleEquip1 = 65434;
				itemDef.femaleEquip1 = 65434;
				break;
			case 15916:
				itemDef.name = "Crown of hearts";
				itemDef.modelID = 93514;
				itemDef.maleEquip1 = 93498;
				itemDef.femaleEquip1 = 93498;
				itemDef.maleWieldY = 5;
				itemDef.modelZoom = 658;
				itemDef.modelOffsetX = 1;
				itemDef.modelOffsetY = -4;
				itemDef.rotationX = 2031;
				itemDef.rotationY = 475;
				itemDef.rotationZ = 1;
				break;
			case 13555:
				itemDef.copyItem(6585);
				itemDef.name = "Valentine's Pendant";
				itemDef.modelID = 83812;
				itemDef.maleEquip1 = 83801;
				itemDef.femaleEquip1 = 83801;
				itemDef.maleWieldY = 5;
				itemDef.modelZoom = 464;
				itemDef.modelOffsetX = 3;
				itemDef.modelOffsetY = 54;
				itemDef.rotationX = 1964;
				itemDef.rotationY = 277;
				itemDef.rotationZ = 0;
				break;
			case 13556:
				itemDef.copyItem(17011);
				itemDef.name = "Staff of Adoration";
				itemDef.modelID = 93511;
				itemDef.maleEquip1 = 93501;
				itemDef.femaleEquip1 = 93501;
				itemDef.modelZoom = 1579;
				itemDef.modelOffsetX = -3;
				itemDef.modelOffsetY = 1;
				itemDef.rotationX = 48;
				itemDef.rotationY = 660;
				itemDef.rotationZ = 13;
				break;
			case 13557:
				itemDef.copyItem(4561);
				itemDef.name = "Valentine's Candy";
				itemDef.modelID = 93512;
				itemDef.modelZoom = 724;
				itemDef.modelOffsetX = 1;
				itemDef.modelOffsetY = 1;
				itemDef.rotationX = 1808;
				itemDef.rotationY = 308;
				itemDef.rotationZ = 308;
				break;
			case 13558:
				itemDef.copyItem(12160);
				itemDef.name = "@red@Easter Attachment";
				itemDef.rdc2 = 52966;
				itemDef.stackable = true;
				break;
			case 13800:
				itemDef.copyItem(15916);
				itemDef.name = "St. Patrick's Hat";
				itemDef.modelID = 98004;
				itemDef.maleEquip1 = 98005;
				itemDef.femaleEquip1 = 98005;
				itemDef.maleWieldY = 5;
				itemDef.modelZoom = 700;
				itemDef.modelOffsetX = 1;
				itemDef.modelOffsetY = -1;
				itemDef.rotationX = 2031;
				itemDef.rotationY = 0;
				itemDef.rotationZ = 1;
				break;
			case 13801:
				itemDef.copyItem(17011);
				itemDef.name = "St. Patrick's Sword";
				itemDef.modelID = 98002;
				itemDef.maleEquip1 = 98003;
				itemDef.femaleEquip1 = 98003;
				itemDef.modelZoom = 1579;
				itemDef.modelOffsetX = -3;
				itemDef.modelOffsetY = 1;
				itemDef.rotationX = 48;
				itemDef.rotationY = 660;
				itemDef.rotationZ = 13;
				break;
			case 13802:
				itemDef.copyItem(6199);
				itemDef.name = "St. Patrick's Box";
				itemDef.newModelColor = new int[]{2999, 926, 22410};
				itemDef.editedModelColor = new int[]{19197, 20386, 20386};
				break;

			case 13700:
				itemDef.copyItem(4977);
				itemDef.name = "Group Ironman full helm";
				itemDef.rdc2 = 91291;
				break;
			case 13701:
				itemDef.copyItem(4989);
				itemDef.name = "Group Ironman platebody";
				itemDef.rdc2 = 91291;
				break;
			case 13702:
				itemDef.copyItem(4995);
				itemDef.name = "Group Ironman platelegs";
				itemDef.rdc2 = 91291;
				break;

			case 16014:
				itemDef.name = "Burning top";
				itemDef.modelID = 65435;
				itemDef.maleEquip1 = 65436;
				itemDef.femaleEquip1 = 65436;
				break;
			case 15926:
				itemDef.name = "Burning legs";
				itemDef.modelID = 65437;
				itemDef.maleEquip1 = 65438;
				itemDef.femaleEquip1 = 65438;
				break;
			case 20592:
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.name = "Dan's Limited Mask";
				itemdefyogipic = ItemDefinition.get(15915);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 65474;
				itemDef.maleEquip1 = 65475;
				itemDef.femaleEquip1 = 65475;
				itemDef.rdc2 = 29592;
				break;
			case 20593:
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.name = "Waterfall top";
				itemdefyogipic = ItemDefinition.get(16014);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 65476;
				itemDef.maleEquip1 = 65477;
				itemDef.femaleEquip1 = 65477;
				itemDef.rdc2 = 29592;

				break;
			case 20594:
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemdefyogipic = ItemDefinition.get(15926);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.name = "Waterfall legs";
				itemDef.modelID = 65478;
				itemDef.maleEquip1 = 65479;
				itemDef.femaleEquip1 = 65479;
				itemDef.rdc2 = 29592;
				break;


			case 8817:
				itemDef.name = "Bulwark body";
				itemDef.modelID = 65356;
				itemDef.maleEquip1 = 65357;
				itemDef.femaleEquip1 = 65357;
				itemdefyogipic = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				// itemDef.rdc2 = 23945;
				//itemDef.rdc2 = 34737;
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 57; // the texture that it currently has
				itemDef.editedModelColor[0] = 65; //
				
				break;

			case 8818:
				itemDef.name = "Bulwark legs";
				itemDef.modelID = 65358;
				itemDef.maleEquip1 = 65359;
				itemDef.femaleEquip1 = 65359;
				itemdefyogipic = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 57; // the texture that it currently has
				itemDef.editedModelColor[0] = 65; //
				
				//	itemDef.rdc2 = 34737;
				break;
			case 8811:
				itemDef.name = "<col=7f39f2>Solak boots";
				itemDef.modelID = 65226;
				itemDef.maleEquip1 = 65226;
				itemDef.femaleEquip1 = 65226;
				itemdefyogipic = ItemDefinition.get(3791);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 60; // the texture that it currently has
				itemDef.editedModelColor[0] = 71; // the new texture u want it to have
				itemDef.stackable = false;
				break;
			case 16137:
				itemDef.name = "Art's 2h sword";
				

				break;
			case 8329:
				itemDef.name = "Art's Defender";
				itemDef.modelID = 65127;
				itemDef.maleEquip1 = 65128;
				itemDef.femaleEquip1 = 65128;
				itemdefyogipic = ItemDefinition.get(1321);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 40; // the texture that it currently has
				itemDef.editedModelColor[0] = 62;
				itemDef.stackable = false;
				break;
			case 11140:
				itemDef.name = "Art's gloves";
				
				break;
			case 19892:
				itemDef.name = "Art's Amulet";
				break;
			case 8335:
				itemDef.name = "Art's Ring";
				itemDef.modelID = 65303;
				itemDef.maleEquip1 = 65303;
				itemDef.femaleEquip1 = 65303;
				itemdefyogipic = ItemDefinition.get(15401);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.editedModelColor = new int[1]; // same here
				itemDef.newModelColor = new int[1];
				itemDef.newModelColor[0] = 51; // the texture that it currently has
				itemDef.editedModelColor[0] = 62;
				
				break;

			case 8334:
				itemDef.name = "Art's boots";
				itemDef.modelID = 65226;
				itemDef.maleEquip1 = 65226;
				itemDef.femaleEquip1 = 65226;
				itemdefyogipic = ItemDefinition.get(3791);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 60; // the texture that it currently has
				itemDef.editedModelColor[0] = 62; // the new texture u want it to have
				itemDef.stackable = false;
				break;
			case 8336:
				itemDef.name = "eatmycaca helm";
				itemDef.modelID = 65231;
				itemDef.maleEquip1 = 65232;
				itemDef.femaleEquip1 = 65232;
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 60; // the texture that it currently has
				itemDef.editedModelColor[0] = 70; // the new texture u want it to have
				itemDef.stackable = false;
				break;
			case 8337:
				itemDef.name = "eatmycaca body";
				itemDef.modelID = 65233;
				itemDef.maleEquip1 = 65234;
				itemDef.femaleEquip1 = 65234;
				itemdefyogipic = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};

				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 60; // the texture that it currently has
				itemDef.editedModelColor[0] = 70; // the new texture u want it to have
				itemDef.stackable = false;
				break;
			case 8338:
				itemDef.name = "eatmycaca chaps";
				itemDef.modelID = 65235;
				itemDef.maleEquip1 = 65236;
				itemDef.femaleEquip1 = 65236;// im not lagging
				itemdefyogipic = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};

				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 60; // the texture that it currently has
				itemDef.editedModelColor[0] = 70; //
				itemDef.stackable = false;
				break;
			case 19112:
				itemDef.name = "Collector Donation";
				itemDef.actions = new String[5];
				itemDef.actions[0] = "Open";
				itemdefyogipic = ItemDefinition.get(290);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.rdc2 = 259252;
				break;
			case 7956:
				itemDef.name = "PvM Box";
				itemDef.actions = new String[5];
				itemDef.actions[0] = "Open";
				itemdefyogipic = ItemDefinition.get(6199);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				// itemDef.modelID = itemDef2.modelID;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.newModelColor = new int[]{63};
				itemDef.editedModelColor = new int[]{67};
				itemDef.modelID = 65284;
				break;
			case 7120:
				itemDef.name = "@or2@Slayer Box";
				itemDef.actions = new String[5];
				itemDef.actions[0] = "Open";
				itemdefyogipic = ItemDefinition.get(6199);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				// itemDef.modelID = itemDef2.modelID;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.newModelColor = new int[]{63};
				itemDef.editedModelColor = new int[]{81};
				itemDef.modelID = 65284;
				break;
			case 19624:
				itemDef.name = "<col=c497fc>Boss Event Box";
				itemDef.actions = new String[5];
				itemDef.actions[0] = "Open";
				itemdefyogipic = ItemDefinition.get(6199);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				// itemDef.modelID = itemDef2.modelID;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.newModelColor = new int[]{63};
				itemDef.editedModelColor = new int[]{61};
				itemDef.modelID = 65284;
				break;

			case 13306:
				itemDef.name = "Satanic anti-hellshield";
				itemDef.modelID = 65506;
				itemDef.maleEquip1 = 65507;
				itemDef.femaleEquip1 = 65507;
				def = ItemDefinition.get(18509);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 101922;
				


				break;
			case 18817:
				itemDef.name = "Ring of sauron (hell)";

				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 13300:
				itemDef.name = "Satanic full helm";
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = 1;
				itemDef.modelOffsetY = -60;
				itemDef.modelZoom = 1000;
				itemDef.rotationY = 230;
				itemDef.rotationX = 200;
				itemDef.modelID = 64114;
				itemDef.maleEquip1 = 64115;
				itemDef.femaleEquip1 = 64115;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{54};
				break;
			case 13301:
				itemDef.name = "Satanic hell body";
				itemdefyogipic = ItemDefinition.get(5575);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = 1600;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64116;
				itemDef.maleEquip1 = 64117;
				itemDef.femaleEquip1 = 64117;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{54};
				break;
			case 13304:
				itemDef.name = "Satanic hell legs";
				itemdefyogipic = ItemDefinition.get(5576);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = 20;
				itemDef.modelZoom = 2000;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64118;
				itemDef.maleEquip1 = 64119;
				itemDef.femaleEquip1 = 64119;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{54};
				break;
			case 13302:
				itemDef.name = "Satanic gloves";
				itemdefyogipic = ItemDefinition.get(7461);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64120;
				itemDef.maleEquip1 = 64121;
				itemDef.femaleEquip1 = 64121;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.rdc2 = 145242;
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 18881:
				itemDef.name = "Supreme Boots";
				itemDef.modelID = 65226;
				itemDef.maleEquip1 = 65226;
				itemDef.femaleEquip1 = 65226;
				itemdefyogipic = ItemDefinition.get(3791);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 60; // the texture that it currently has
				itemDef.editedModelColor[0] = 76; // the new texture u want it to have
				itemDef.stackable = false;
				break;
			case 18887:
				itemDef.name = "@cya@Mega Boots";
				itemDef.modelID = 65226;
				itemDef.maleEquip1 = 65226;
				itemDef.femaleEquip1 = 65226;
				itemdefyogipic = ItemDefinition.get(3791);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.editedModelColor = new int[1]; // if only 1 texture is modified this has to be 1, if 2 then 2 etc
				itemDef.newModelColor = new int[1]; // same here
				itemDef.newModelColor[0] = 60; // the texture that it currently has
				itemDef.editedModelColor[0] = 78; // the new texture u want it to have
				itemDef.stackable = false;
				break;
			case 13305:
				itemDef.name = "Satanic boots";
				itemdefyogipic = ItemDefinition.get(7114);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64122;
				itemDef.maleEquip1 = 64122;
				itemDef.femaleEquip1 = 64122;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 12265:
				itemDef.name = "Ice Torva full helm";
				itemdefyogipic = ItemDefinition.get(14008);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.maleEquip1 = itemdefyogipic.maleEquip1;
				itemDef.femaleEquip1 = itemdefyogipic.femaleEquip1;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.actions = itemdefyogipic.actions;
				itemDef.rdc2 = 36262;
				break;
			case 12266:
				itemDef.name = "Ice Torva platebody";
				itemdefyogipic = ItemDefinition.get(14009);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.maleEquip1 = itemdefyogipic.maleEquip1;
				itemDef.femaleEquip1 = itemdefyogipic.femaleEquip1;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.actions = itemdefyogipic.actions;
				itemDef.rdc2 = 36262;
				break;
			case 12267:
				itemDef.name = "Ice Torva platelegs";
				itemdefyogipic = ItemDefinition.get(14010);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.maleEquip1 = itemdefyogipic.maleEquip1;
				itemDef.femaleEquip1 = itemdefyogipic.femaleEquip1;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.actions = itemdefyogipic.actions;
				itemDef.rdc2 = 36262;
				break;
			case 13323:
				itemDef.name = "Goku head";
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64123;
				itemDef.maleEquip1 = 64124;
				itemDef.femaleEquip1 = 64124;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 13324:
				itemDef.name = "Goku body";
				itemdefyogipic = ItemDefinition.get(5575);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64125;
				itemDef.maleEquip1 = 64126;
				itemDef.femaleEquip1 = 64126;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 13325:
				itemDef.name = "Goku legs";
				itemdefyogipic = ItemDefinition.get(5576);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64127;
				itemDef.maleEquip1 = 64128;
				itemDef.femaleEquip1 = 64128;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 13326:
				itemDef.name = "Goku gloves";
				itemdefyogipic = ItemDefinition.get(7461);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64129;
				itemDef.maleEquip1 = 64130;
				itemDef.femaleEquip1 = 64130;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 13327:
				itemDef.name = "Goku boots";
				itemdefyogipic = ItemDefinition.get(7114);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64131;
				itemDef.maleEquip1 = 64131;
				itemDef.femaleEquip1 = 64131;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 13025:
				itemDef.name = "Grinch head";
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64306;
				itemDef.maleEquip1 = 64307;
				itemDef.femaleEquip1 = 64307;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 13027:
				itemDef.name = "Grinch body";
				itemdefyogipic = ItemDefinition.get(5575);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64308;
				itemDef.maleEquip1 = 64309;
				itemDef.femaleEquip1 = 64309;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 13023:
				itemDef.name = "Grinch legs";
				itemdefyogipic = ItemDefinition.get(5576);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64310;
				itemDef.maleEquip1 = 64311;
				itemDef.femaleEquip1 = 64311;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 13029:
				itemDef.name = "Grinch gloves";
				itemdefyogipic = ItemDefinition.get(7461);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64312;
				itemDef.maleEquip1 = 64313;
				itemDef.femaleEquip1 = 64313;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 13031:
				itemDef.name = "Grinch boots";
				itemdefyogipic = ItemDefinition.get(7114);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64314;
				itemDef.maleEquip1 = 64314;
				itemDef.femaleEquip1 = 64314;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 13328:
				itemDef.name = "Bleach head";
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64132;
				itemDef.maleEquip1 = 64133;
				itemDef.femaleEquip1 = 64133;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 13329:
				itemDef.name = "Bleach body";
				itemdefyogipic = ItemDefinition.get(5575);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64134;
				itemDef.maleEquip1 = 64135;
				itemDef.femaleEquip1 = 64135;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 13330:
				itemDef.name = "Bleach legs";
				itemdefyogipic = ItemDefinition.get(5576);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64136;
				itemDef.maleEquip1 = 64137;
				itemDef.femaleEquip1 = 64137;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 13332:
				itemDef.name = "Bleach boots";
				itemdefyogipic = ItemDefinition.get(7114);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64138;
				itemDef.maleEquip1 = 64138;
				itemDef.femaleEquip1 = 64138;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 13333:
				itemDef.name = "Bleach Sword";
				itemDef.modelID = 64139;
				itemDef.maleEquip1 = 64140;
				itemDef.femaleEquip1 = 64140;
				def = ItemDefinition.get(22034);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				
				break;

			case 21053:
				itemDef.name = "forbidden Ballista";
				itemDef.modelID = 64291;
				itemDef.maleEquip1 = 64292;
				itemDef.femaleEquip1 = 64292;
				def = ItemDefinition.get(22034);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;

				break;
			case 21054:
				itemDef.name = "Cursed Ballista";
				itemDef.modelID = 64291;
				itemDef.maleEquip1 = 64292;
				itemDef.femaleEquip1 = 64292;
				def = ItemDefinition.get(22034);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 24204;
				break;
			case 21055:
				itemDef.name = "Hidden Ballista";
				itemDef.modelID = 64291;
				itemDef.maleEquip1 = 64292;
				itemDef.femaleEquip1 = 64292;
				def = ItemDefinition.get(22034);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 9999898;
				break;
			case 21056:
				itemDef.name = "Damned Ballista";
				itemDef.modelID = 64291;
				itemDef.maleEquip1 = 64292;
				itemDef.femaleEquip1 = 64292;
				def = ItemDefinition.get(22034);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 553535;
				break;
			case 21057:
				itemDef.name = "lightsaber";
				itemDef.modelID = 64293;
				itemDef.maleEquip1 = 64294;
				itemDef.femaleEquip1 = 64294;
				def = ItemDefinition.get(22034);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				
				break;
			case 21058:
				itemDef.name = "dualsaber";
				itemDef.modelID = 64295;
				itemDef.maleEquip1 = 64296;
				itemDef.femaleEquip1 = 64296;
				def = ItemDefinition.get(22034);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				
				break;
			case 18665:
				itemDef.name = "Slayer reward key";
				break;
			case 3849:
				itemDef.name = "Slayer reward chest";
				break;
			case 21060:
				itemDef.name = "Slayer dualsaber";
				itemDef.modelID = 64295;
				itemDef.maleEquip1 = 64296;
				itemDef.femaleEquip1 = 64296;
				def = ItemDefinition.get(22034);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				
				itemDef.rdc2 = 295925;

				break;
			case 21061:
				itemDef.name = "dualsaber";
				itemDef.modelID = 64295;
				itemDef.maleEquip1 = 64296;
				itemDef.femaleEquip1 = 64296;
				def = ItemDefinition.get(22034);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				
				itemDef.rdc2 = 77777;
				break;
			case 21059:
				itemDef.name = "Slapping hand";
				itemDef.modelID = 64298;
				itemDef.maleEquip1 = 64297;
				itemDef.femaleEquip1 = 64297;
				def = ItemDefinition.get(22034);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				
				break;
			case 15005:
				itemDef.name = "Gladiator full helm";
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64101;
				itemDef.maleEquip1 = 64102;
				itemDef.femaleEquip1 = 64102;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 15006:
				itemDef.name = "Gladiator fighterbody";
				itemdefyogipic = ItemDefinition.get(5575);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64103;
				itemDef.maleEquip1 = 64104;
				itemDef.femaleEquip1 = 64104;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 15007:
				itemDef.name = "Gladiator fighterlegs";
				itemdefyogipic = ItemDefinition.get(5576);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64105;
				itemDef.maleEquip1 = 64106;
				itemDef.femaleEquip1 = 64106;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 15008:
				itemDef.name = "Gladiator kiteshield";
				itemdefyogipic = ItemDefinition.get(1540);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64107;
				itemDef.maleEquip1 = 64108;
				itemDef.femaleEquip1 = 64108;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;

			case 15200:
				itemDef.name = "Gladiator gloves";
				itemdefyogipic = ItemDefinition.get(7461);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64111;
				itemDef.maleEquip1 = 64112;
				itemDef.femaleEquip1 = 64112;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 15201:
				itemDef.name = "Gladiator boots";
				itemdefyogipic = ItemDefinition.get(7114);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64113;
				itemDef.maleEquip1 = 64113;
				itemDef.femaleEquip1 = 64113;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 15100:
				itemDef.name = "Gladiator cape";
				itemdefyogipic = ItemDefinition.get(6570);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64109;
				itemDef.maleEquip1 = 64110;
				itemDef.femaleEquip1 = 64110;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 21036:
				itemDef.name = "Exorcism helm";
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64269;
				itemDef.maleEquip1 = 64270;
				itemDef.femaleEquip1 = 64270;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 21037:
				itemDef.name = "Exorcism body";
				itemdefyogipic = ItemDefinition.get(5575);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64271;
				itemDef.maleEquip1 = 64272;
				itemDef.femaleEquip1 = 64272;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 21038:
				itemDef.name = "Exorcism legs";
				itemdefyogipic = ItemDefinition.get(5576);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64273;
				itemDef.maleEquip1 = 64274;
				itemDef.femaleEquip1 = 64274;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 21039:
				itemDef.name = "Exorcism cape";
				itemdefyogipic = ItemDefinition.get(1540);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = 2000;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64275;
				itemDef.maleEquip1 = 64276;
				itemDef.femaleEquip1 = 64276;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;

			case 21040:
				itemDef.name = "Exorcism gloves";
				itemdefyogipic = ItemDefinition.get(7461);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = 1200;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64277;
				itemDef.maleEquip1 = 64278;
				itemDef.femaleEquip1 = 64278;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 21041:
				itemDef.name = "Exorcism boots";
				itemdefyogipic = ItemDefinition.get(7114);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64279;
				itemDef.maleEquip1 = 64279;
				itemDef.femaleEquip1 = 64279;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;

			case 21042:
				itemDef.name = "Blacksir helm";
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64269;
				itemDef.maleEquip1 = 64270;
				itemDef.femaleEquip1 = 64270;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 234423;
				break;
			case 21043:
				itemDef.name = "Blacksir body";
				itemdefyogipic = ItemDefinition.get(5575);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64271;
				itemDef.maleEquip1 = 64272;
				itemDef.femaleEquip1 = 64272;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 234423;
				break;
			case 21044:
				itemDef.name = "Blacksir legs";
				itemdefyogipic = ItemDefinition.get(5576);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64273;
				itemDef.maleEquip1 = 64274;
				itemDef.femaleEquip1 = 64274;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 234423;
				break;
			case 21045:
				itemDef.name = "Blacksir cape";
				itemdefyogipic = ItemDefinition.get(1540);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = 2000;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64275;
				itemDef.maleEquip1 = 64276;
				itemDef.femaleEquip1 = 64276;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 234423;
				break;

			case 21046:
				itemDef.name = "Blacksir gloves";
				itemdefyogipic = ItemDefinition.get(7461);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = 1200;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64277;
				itemDef.maleEquip1 = 64278;
				itemDef.femaleEquip1 = 64278;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 234423;
				break;
			case 21047:
				itemDef.name = "Blacksir boots";
				itemdefyogipic = ItemDefinition.get(7114);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64279;
				itemDef.maleEquip1 = 64279;
				itemDef.femaleEquip1 = 64279;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 234423;
				break;
			case 19984:
				itemDef.name = "LegendarySlayer helm";
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64194;
				itemDef.maleEquip1 = 64195;
				itemDef.femaleEquip1 = 64195;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 444444;
				break;
			case 19985:
				itemDef.name = "LegendarySlayer body";
				itemdefyogipic = ItemDefinition.get(5575);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64196;
				itemDef.maleEquip1 = 64197;
				itemDef.femaleEquip1 = 64197;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 444444;
				break;
			case 19986:
				itemDef.name = "LegendarySlayer legs";
				itemdefyogipic = ItemDefinition.get(5576);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64198;
				itemDef.maleEquip1 = 64199;
				itemDef.femaleEquip1 = 64199;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 444444;
				break;
			case 19987:
				itemDef.name = "L.S spirit shield";
				itemdefyogipic = ItemDefinition.get(1540);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64200;
				itemDef.maleEquip1 = 64201;
				itemDef.femaleEquip1 = 64201;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 444444;
				break;

			case 19988:
				itemDef.name = "LegendarySlayer gloves";
				itemdefyogipic = ItemDefinition.get(7461);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64202;
				itemDef.maleEquip1 = 64203;
				itemDef.femaleEquip1 = 64203;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 444444;
				break;
			case 19989:
				itemDef.name = "LegendarySlayer boots";
				itemdefyogipic = ItemDefinition.get(7114);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64204;
				itemDef.maleEquip1 = 64204;
				itemDef.femaleEquip1 = 64204;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 444444;
				break;
			case 19991:
				itemDef.name = "L.S amulet";
				itemdefyogipic = ItemDefinition.get(295);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64205;
				itemDef.maleEquip1 = 64206;
				itemDef.femaleEquip1 = 64206;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 444444;
				break;
			case 19992:
				itemDef.name = "L.S ring";
				itemdefyogipic = ItemDefinition.get(1635);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64207;
				itemDef.maleEquip1 = 64208;
				itemDef.femaleEquip1 = 64208;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 444444;
				break;
			case 19993:
				itemDef.name = "LegendarySlayer scimitar";
				itemdefyogipic = ItemDefinition.get(4587);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64209;
				itemDef.maleEquip1 = 64210;
				itemDef.femaleEquip1 = 64210;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 444444;
				break;
			case 19994:
				itemDef.name = "LegendarySlayer cape";
				itemdefyogipic = ItemDefinition.get(2413);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64211;
				itemDef.maleEquip1 = 64212;
				itemDef.femaleEquip1 = 64212;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 666666;
				break;
			case 20400:
				itemDef.name = "@cya@Enraged Cape";
				itemdefyogipic = ItemDefinition.get(2413);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64211;
				itemDef.maleEquip1 = 64212;
				itemDef.femaleEquip1 = 64212;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				itemDef.rdc2 = 444444;
				break;
			case 19998:
				itemDef.name = "ExoticSlayer Rapier";
				itemdefyogipic = ItemDefinition.get(4587);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64213;
				itemDef.maleEquip1 = 64214;
				itemDef.femaleEquip1 = 64214;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 444444;
				break;
			case 21010:
				itemDef.name = "Owl mage helm";
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = 850;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64215;
				itemDef.maleEquip1 = 64216;
				itemDef.femaleEquip1 = 64216;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				//itemDef.rdc2= 77777;
				break;
			case 21011:
				itemDef.name = "Owl mage body";
				itemdefyogipic = ItemDefinition.get(5575);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = 10;
				itemDef.modelZoom = 1300;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64217;
				itemDef.maleEquip1 = 64218;
				itemDef.femaleEquip1 = 64218;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				//	itemDef.rdc2= 77777;
				break;
			case 21012:
				itemDef.name = "Owl mage legs";
				itemdefyogipic = ItemDefinition.get(5576);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = 10;
				itemDef.modelZoom = 2000;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64219;
				itemDef.maleEquip1 = 64220;
				itemDef.femaleEquip1 = 64220;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				//	itemDef.rdc2= 77777;
				break;
			case 21014:
				itemDef.name = "Owl mage staff";
				itemDef.modelID = 64221;
				itemDef.maleEquip1 = 64222;
				itemDef.femaleEquip1 = 64222;
				itemDef21 = ItemDefinition.get(4755);
				itemDef.modelOffsetX = 3;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = 500;
				itemDef.modelZoom = 2300;
				itemDef.rotationY = 260;
				itemDef.rotationX = 100;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 21015:
				itemDef.name = "Turtle helm";
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64227;
				itemDef.maleEquip1 = 64228;
				itemDef.femaleEquip1 = 64228;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				itemDef.rdc2 = 987654;
				
				//itemDef.rdc2= 77777;
				break;
			case 21016:
				itemDef.name = "Turtle body";
				itemdefyogipic = ItemDefinition.get(5575);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64229;
				itemDef.maleEquip1 = 64230;
				itemDef.femaleEquip1 = 64230;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				itemDef.rdc2 = 987654;
				
				//	itemDef.rdc2= 77777;
				break;
			case 21017:
				itemDef.name = "Turtle legs";
				itemdefyogipic = ItemDefinition.get(5576);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64231;
				itemDef.maleEquip1 = 64232;
				itemDef.femaleEquip1 = 64232;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 987654;
				//	itemDef.rdc2= 77777;
				break;
			case 21018:
				itemDef.name = "Supreme bow";
				itemDef.modelID = 64233;
				itemDef.maleEquip1 = 64234;
				itemDef.femaleEquip1 = 64234;
				itemDef21 = ItemDefinition.get(4755);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				itemDef.rdc2 = 987654;
				break;
			case 21019:
				itemDef.name = "Turtle spirit shield";
				itemDef.modelID = 64235;
				itemDef.maleEquip1 = 64236;
				itemDef.femaleEquip1 = 64236;
				itemDef21 = ItemDefinition.get(1540);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				itemDef.rdc2 = 987654;
				
				break;
			case 21020:
				itemDef.name = "Rusted G. helm";
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64237;
				itemDef.maleEquip1 = 64238;
				itemDef.femaleEquip1 = 64238;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				

				break;
			case 21021:
				itemDef.name = "Rusted G. body";
				itemdefyogipic = ItemDefinition.get(5575);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64239;
				itemDef.maleEquip1 = 64240;
				itemDef.femaleEquip1 = 64240;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 21022:
				itemDef.name = "Rusted G. legs";
				itemdefyogipic = ItemDefinition.get(5576);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64241;
				itemDef.maleEquip1 = 64242;
				itemDef.femaleEquip1 = 64242;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				

				break;
			case 21023:
				itemDef.name = "Rusted G. sword";
				itemDef.modelID = 64243;
				itemDef.maleEquip1 = 64244;
				itemDef.femaleEquip1 = 64244;
				itemDef21 = ItemDefinition.get(19780);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 21024:
				itemDef.name = "Rusted G. wings";
				itemDef.modelID = 64245;
				itemDef.maleEquip1 = 64246;
				itemDef.femaleEquip1 = 64246;
				itemDef21 = ItemDefinition.get(17632);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.rdc2 = 230;
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			//cyan 444444
			case 20086:
				itemDef.name = "Cursed helm";
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64194;
				itemDef.maleEquip1 = 64195;
				itemDef.femaleEquip1 = 64195;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 44322;//77777
				break;
			case 20087:
				itemDef.name = "Cursed body";
				itemdefyogipic = ItemDefinition.get(5575);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64196;
				itemDef.maleEquip1 = 64197;
				itemDef.femaleEquip1 = 64197;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 44322;
				break;
			case 20088:
				itemDef.name = "Cursed legs";
				itemdefyogipic = ItemDefinition.get(5576);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64198;
				itemDef.maleEquip1 = 64199;
				itemDef.femaleEquip1 = 64199;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 44322;
				break;
			case 20090:
				itemDef.name = "Cursed spirit shield";
				itemdefyogipic = ItemDefinition.get(1540);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64200;
				itemDef.maleEquip1 = 64201;
				itemDef.femaleEquip1 = 64201;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 44322;
				break;

			case 20091:
				itemDef.name = "Cursed gloves";
				itemdefyogipic = ItemDefinition.get(7461);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64202;
				itemDef.maleEquip1 = 64203;
				itemDef.femaleEquip1 = 64203;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 44322;
				break;
			case 20089:
				itemDef.name = "Cursed boots";
				itemdefyogipic = ItemDefinition.get(7114);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64204;
				itemDef.maleEquip1 = 64204;
				itemDef.femaleEquip1 = 64204;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 44322;
				break;
			case 20092:
				itemDef.name = "Cursed amulet";
				itemdefyogipic = ItemDefinition.get(295);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64205;
				itemDef.maleEquip1 = 64206;
				itemDef.femaleEquip1 = 64206;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 44322;
				break;
			case 20093:
				itemDef.name = "Cursed ring";
				itemdefyogipic = ItemDefinition.get(1635);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64207;
				itemDef.maleEquip1 = 64208;
				itemDef.femaleEquip1 = 64208;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 44322;
				break;
			case 20098:
				itemDef.name = "Cursed scimitar";
				itemdefyogipic = ItemDefinition.get(4587);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64209;
				itemDef.maleEquip1 = 64210;
				itemDef.femaleEquip1 = 64210;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 44322;
				break;
			case 20099:
				itemDef.name = "Cursed cape";
				itemdefyogipic = ItemDefinition.get(2413);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64211;
				itemDef.maleEquip1 = 64212;
				itemDef.femaleEquip1 = 64212;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 44322;
				break;
			case 20100:
				itemDef.name = "Cursed rapier";
				itemdefyogipic = ItemDefinition.get(4587);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64213;
				itemDef.maleEquip1 = 64214;
				itemDef.femaleEquip1 = 64214;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 44322;
				break;
			case 21062:
				itemDef.name = "Ruthless helm";
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64194;
				itemDef.maleEquip1 = 64195;
				itemDef.femaleEquip1 = 64195;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 23662;
				break;
			case 21063:
				itemDef.name = "Ruthless body";
				itemdefyogipic = ItemDefinition.get(5575);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64196;
				itemDef.maleEquip1 = 64197;
				itemDef.femaleEquip1 = 64197;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 23662;
				break;
			case 21064:
				itemDef.name = "Ruthless legs";
				itemdefyogipic = ItemDefinition.get(5576);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64198;
				itemDef.maleEquip1 = 64199;
				itemDef.femaleEquip1 = 64199;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 23662;
				break;
			case 21065:
				itemDef.name = "Ruthless spirit shield";
				itemdefyogipic = ItemDefinition.get(1540);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64200;
				itemDef.maleEquip1 = 64201;
				itemDef.femaleEquip1 = 64201;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 23662;
				break;

			case 21066:
				itemDef.name = "Ruthless gloves";
				itemdefyogipic = ItemDefinition.get(7461);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64202;
				itemDef.maleEquip1 = 64203;
				itemDef.femaleEquip1 = 64203;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 23662;
				break;
			case 21067:
				itemDef.name = "Ruthless boots";
				itemdefyogipic = ItemDefinition.get(7114);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64204;
				itemDef.maleEquip1 = 64204;
				itemDef.femaleEquip1 = 64204;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 23662;
				break;
			case 21068:
				itemDef.name = "Ruthless amulet";
				itemdefyogipic = ItemDefinition.get(295);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64205;
				itemDef.maleEquip1 = 64206;
				itemDef.femaleEquip1 = 64206;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 23662;
				break;
			case 21069:
				itemDef.name = "Ruthless ring";
				itemdefyogipic = ItemDefinition.get(1635);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64207;
				itemDef.maleEquip1 = 64208;
				itemDef.femaleEquip1 = 64208;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 23662;
				break;
			case 21070:
				itemDef.name = "Ruthless scimitar";
				itemdefyogipic = ItemDefinition.get(4587);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64209;
				itemDef.maleEquip1 = 64210;
				itemDef.femaleEquip1 = 64210;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 23662;
				break;
			case 21071:
				itemDef.name = "Ruthless cape";
				itemdefyogipic = ItemDefinition.get(2413);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = -50;
				itemDef.modelZoom = 2300;
				itemDef.rotationY = 200;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64211;
				itemDef.maleEquip1 = 64212;
				itemDef.femaleEquip1 = 64212;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 23662;
				break;
			case 21072:
				itemDef.name = "Ruthless rapier";
				itemdefyogipic = ItemDefinition.get(4587);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64213;
				itemDef.maleEquip1 = 64214;
				itemDef.femaleEquip1 = 64214;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 77743;
				break;
			case 21073:
				itemDef.name = "Ruthless Scimitar";
				itemdefyogipic = ItemDefinition.get(4587);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.maleEquip1 = itemdefyogipic.maleEquip1;
				itemDef.femaleEquip1 = itemdefyogipic.femaleEquip1;
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.actions = new String[]{null, "Wear", null, "Upgrade", "Drop"};
				itemDef.stackable = false;
				
				itemDef.rdc2 = 12124;
				break;
			case 13263:
				itemDef.actions = new String[]{null, "Wear", null, "Upgrade", "Drop"};
				break;

			case 21075:
				itemDef.name = "Slayer helmet [Level 1]";
				itemdefyogipic = ItemDefinition.get(13263);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.maleEquip1 = itemdefyogipic.maleEquip1;
				itemDef.femaleEquip1 = itemdefyogipic.femaleEquip1;
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.actions = new String[]{null, "Wear", null, "Upgrade", "Drop"};
				itemDef.stackable = false;
				//	
				itemDef.rdc2 = 35363;
				break;
			case 21076:
				itemDef.name = "Slayer helmet [Level 2]";
				itemdefyogipic = ItemDefinition.get(13263);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.maleEquip1 = itemdefyogipic.maleEquip1;
				itemDef.femaleEquip1 = itemdefyogipic.femaleEquip1;
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.actions = new String[]{null, "Wear", null, "Upgrade", "Drop"};
				itemDef.stackable = false;
				//
				itemDef.rdc2 = 444444;
				break;
			case 21077:
				itemDef.name = "Slayer helmet [level 3]";
				itemdefyogipic = ItemDefinition.get(13263);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.maleEquip1 = itemdefyogipic.maleEquip1;
				itemDef.femaleEquip1 = itemdefyogipic.femaleEquip1;
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.actions = new String[]{null, "Wear", null, "Upgrade", "Drop"};
				itemDef.stackable = false;
				//
				itemDef.rdc2 = 8858;
				break;

			case 21078:
				itemDef.name = "Slayer helmet [Level 4]";
				itemdefyogipic = ItemDefinition.get(13263);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.maleEquip1 = itemdefyogipic.maleEquip1;
				itemDef.femaleEquip1 = itemdefyogipic.femaleEquip1;
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.actions = new String[]{null, "Wear", null, "Upgrade", "Drop"};
				itemDef.stackable = false;
				//
				itemDef.rdc2 = 8808080;//8808080
				break;
			case 21079:
				itemDef.name = "Slayer helmet [MAX]";
				itemdefyogipic = ItemDefinition.get(13263);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.maleEquip1 = itemdefyogipic.maleEquip1;
				itemDef.femaleEquip1 = itemdefyogipic.femaleEquip1;
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				//
				itemDef.rdc2 = 74623;
				break;
			case 15230:
				itemDef.name = "Zeus full helm";
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64165;
				itemDef.maleEquip1 = 64166;
				itemDef.femaleEquip1 = 64166;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{73};
				break;
			case 15231:
				itemDef.name = "Zeus body";
				itemdefyogipic = ItemDefinition.get(5575);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64167;
				itemDef.maleEquip1 = 64168;
				itemDef.femaleEquip1 = 64168;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{73};
				break;
			case 15232:
				itemDef.name = "Zeus legs";
				itemdefyogipic = ItemDefinition.get(5576);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64169;
				itemDef.maleEquip1 = 64170;
				itemDef.femaleEquip1 = 64170;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{73};
				break;
			case 15233:
				itemDef.name = "Zeus Hammer";
				itemDef.modelID = 64171;
				itemDef.maleEquip1 = 64172;
				itemDef.femaleEquip1 = 64172;
				itemDef21 = ItemDefinition.get(4755);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{73};
				break;
			case 15234:
				itemDef.name = "Zeus shield";
				itemdefyogipic = ItemDefinition.get(1540);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64173;
				itemDef.maleEquip1 = 64174;
				itemDef.femaleEquip1 = 64174;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{73};
				break;
			case 21048:
				itemDef.name = "Fiya Sword+";
				itemDef.modelID = 64280;
				itemDef.maleEquip1 = 64281;
				itemDef.femaleEquip1 = 64281;
				itemDef21 = ItemDefinition.get(4755);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{73};
				break;
			case 21049:
				itemDef.name = "Fiya Shield+";
				itemdefyogipic = ItemDefinition.get(1540);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64282;
				itemDef.maleEquip1 = 64283;
				itemDef.femaleEquip1 = 64283;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{73};
				break;
			case 21031:
				itemDef.name = "Hades full helm";
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64259;
				itemDef.maleEquip1 = 64260;
				itemDef.femaleEquip1 = 64260;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 2724624;
				break;
			case 21032:
				itemDef.name = "Hades body";
				itemdefyogipic = ItemDefinition.get(5575);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64261;
				itemDef.maleEquip1 = 64262;
				itemDef.femaleEquip1 = 64262;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 2724624;
				break;
			case 21033:
				itemDef.name = "Hades legs";
				itemdefyogipic = ItemDefinition.get(5576);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64263;
				itemDef.maleEquip1 = 64264;
				itemDef.femaleEquip1 = 64264;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 2724624;
				break;
			case 21034:
				itemDef.name = "Hades Hammer";
				itemDef.modelID = 64265;
				itemDef.maleEquip1 = 64266;
				itemDef.femaleEquip1 = 64266;
				itemDef21 = ItemDefinition.get(4755);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				//itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 99957;
				break;
			case 21035:
				itemDef.name = "Hades shield";
				itemdefyogipic = ItemDefinition.get(1540);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64267;
				itemDef.maleEquip1 = 64268;
				itemDef.femaleEquip1 = 64268;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 2724624;
				break;
			case 15235:
				itemDef.name = "Electric gloves";
				itemdefyogipic = ItemDefinition.get(7461);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = 1100;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64175;
				itemDef.maleEquip1 = 64176;
				itemDef.femaleEquip1 = 64176;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 15236:
				itemDef.name = "Electric boots";
				itemdefyogipic = ItemDefinition.get(7114);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64177;
				itemDef.maleEquip1 = 64178;
				itemDef.femaleEquip1 = 64178;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 11305:
				itemDef.name = "Earthquake full helm";
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64151;
				itemDef.maleEquip1 = 64152;
				itemDef.femaleEquip1 = 64152;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 3462;
				break;
			case 11306:
				itemDef.name = "Earthquake platebody";
				itemdefyogipic = ItemDefinition.get(5575);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64153;
				itemDef.maleEquip1 = 64154;
				itemDef.femaleEquip1 = 64154;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 3462;
				break;

			case 11307:
				itemDef.name = "Earthquake platelegs";
				itemdefyogipic = ItemDefinition.get(5576);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64155;
				itemDef.maleEquip1 = 64156;
				itemDef.femaleEquip1 = 64156;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 3462;
				break;
			case 11308:
				itemDef.name = "Earthquake battlesword";
				itemDef.modelID = 64157;
				itemDef.maleEquip1 = 64158;
				itemDef.femaleEquip1 = 64158;
				def = ItemDefinition.get(22034);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 3462;
				
				break;
			case 11300:
				itemDef.name = "Defender full helm";
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64141;
				itemDef.maleEquip1 = 64142;
				itemDef.femaleEquip1 = 64142;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{58};
				break;
			case 11301:
				itemDef.name = "Defender fighterbody";
				itemdefyogipic = ItemDefinition.get(5575);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64143;
				itemDef.maleEquip1 = 64144;
				itemDef.femaleEquip1 = 64144;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{58};
				break;
			case 11302:
				itemDef.name = "Defender fighterlegs";
				itemdefyogipic = ItemDefinition.get(5576);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64145;
				itemDef.maleEquip1 = 64146;
				itemDef.femaleEquip1 = 64146;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{58};
				break;
			case 11303:
				itemDef.name = "Defender kiteshield";
				itemdefyogipic = ItemDefinition.get(1540);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64147;
				itemDef.maleEquip1 = 64148;
				itemDef.femaleEquip1 = 64148;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{58};
				break;
			case 11304:
				itemDef.name = "Defender cape";
				itemdefyogipic = ItemDefinition.get(2413);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64149;
				itemDef.maleEquip1 = 64150;
				itemDef.femaleEquip1 = 64150;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{58};
				break;
			case 11315:
				ItemDefinition itemDef2111 = ItemDefinition.get(12479);
				itemDef.modelID = 64100;
				itemDef.modelOffsetX = itemDef2111.modelOffsetX;
				//itemDef.modelOffsetX = itemDef211.modelOffsetX;
				itemDef.modelOffsetY = itemDef2111.modelOffsetY;
				itemDef.modelZoom = 7950;
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.name = "<img=1355><col=f8ac00>double afk pet";
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
				break;
			case 11316:
				ItemDefinition votingpoting = ItemDefinition.get(12479);
				itemDef.modelID = 64098;
				itemDef.modelOffsetX = votingpoting.modelOffsetX;
				//itemDef.modelOffsetX = itemDef211.modelOffsetX;
				itemDef.modelOffsetY = votingpoting.modelOffsetY;
				itemDef.modelZoom = 7550;
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.name = "<img=28><col=f8ac00>Double vote pet";
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
				break;
			case 2098:
				itemDef.name = "Skilling ticket";
				itemDef.rdc2 = 12511;
				itemDef.stackable = true;
				itemDef21 = ItemDefinition.get(18652);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.modelID = itemDef21.modelID;
				itemDef.actions = itemDef21.actions;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;

				break;
			case 20511:
				ItemDefinition hooker = ItemDefinition.get(12479);
				itemDef.modelID = 36071;
				itemDef.modelOffsetX = 2;
				//itemDef.modelOffsetX = itemDef211.modelOffsetX;
				itemDef.modelOffsetY = 80;
				itemDef.rotationY = 204;
				itemDef.rotationX = 20;
				itemDef.modelZoom = 2700;
				itemDef.name = "Hooker pet";
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
				break;
			case 5504:
				ItemDefinition charizard = ItemDefinition.get(12479);
				itemDef.modelID = 64067;
				itemDef.modelOffsetX = charizard.modelOffsetX;
				//itemDef.modelOffsetX = itemDef211.modelOffsetX;
				itemDef.modelOffsetY = charizard.modelOffsetY;
				itemDef.modelZoom = 4000;
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.name = "Charizard pet";
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.actions = new String[]{null, null, "Summon", "Upgrade-pet", "Drop"};
				break;
			case 5506:
				ItemDefinition donkeykong2 = ItemDefinition.get(12479);
				itemDef.modelID = 64225;
				itemDef.modelOffsetX = donkeykong2.modelOffsetX;
				//itemDef.modelOffsetX = itemDef211.modelOffsetX;
				itemDef.modelOffsetY = donkeykong2.modelOffsetY;
				itemDef.modelZoom = 4000;
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.name = "Donkeykong pet";
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.actions = new String[]{null, null, "Summon", "Upgrade-pet", "Drop"};
				break;
			case 5507:
				ItemDefinition sonicw = ItemDefinition.get(12479);
				itemDef.modelID = 64224;
				itemDef.modelOffsetX = sonicw.modelOffsetX;
				//itemDef.modelOffsetX = itemDef211.modelOffsetX;
				itemDef.modelOffsetY = sonicw.modelOffsetY;
				itemDef.modelZoom = 3000;
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.name = "Sonic pet";
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.actions = new String[]{null, null, "Summon", "Upgrade-pet", "Drop"};
				break;
			case 5508:
				ItemDefinition Mario = ItemDefinition.get(12479);
				itemDef.modelID = 64223;
				itemDef.modelOffsetX = Mario.modelOffsetX;
				//itemDef.modelOffsetX = itemDef211.modelOffsetX;
				itemDef.modelOffsetY = Mario.modelOffsetY;
				itemDef.modelZoom = 3000;
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.name = "Mario pet";
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.actions = new String[]{null, null, "Summon", "Upgrade-pet", "Drop"};
				break;
			case 5560:
				ItemDefinition superstar2 = ItemDefinition.get(12479);
				itemDef.modelID = 64305;
				itemDef.modelOffsetX = superstar2.modelOffsetX;
				//itemDef.modelOffsetX = itemDef211.modelOffsetX;
				itemDef.modelOffsetY = superstar2.modelOffsetY;
				itemDef.modelZoom = 2000;
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.name = "Super Star pet";
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.actions = new String[]{null, null, "Summon", "Upgrade-pet", "Drop"};
				break;
			case 5563:
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = 1000;
				itemDef.rotationY = 10;
				itemDef.rotationX = 10;
				itemDef.modelID = 64306;

				itemDef.name = "Grinch pet @whi@X2 EXP@or1@";
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
				break;


			case 14819:
				itemDef.name = "x2 Slayer XP Certificate";
				break;

			case 14817:
				itemdefyogipic = ItemDefinition.get(14819);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.name = "x2 Invention XP Certificate";
				itemDef.rdc2 = 2592;
				break;
			case 14822:
				itemDef.name = "<img=15>VIP Slayer License";
				itemDef.actions = new String[]{"Claim", null, null, null, "Drop"};
				break;
			case 28:
				itemDef.name = "Slayer chest key";
				itemdefyogipic = ItemDefinition.get(989);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = 760;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = 800;
				itemDef.modelID = 64299;
				itemDef.stackable = false;
				break;
			case 29:
				itemDef.name = "Locked slayer chest";
				itemdefyogipic = ItemDefinition.get(405);
				itemDef.modelOffsetX = 2;
				itemDef.modelOffsetY = 1;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = 100;
				itemDef.rotationX = 90;
				itemDef.modelID = 64300;
				itemDef.modelZoom = 1100;
				itemDef.stackable = false;
				break;

			case 27:
				itemDef.name = "<img=15>VIP Slayer Gem";
				itemDef.actions = new String[]{"Teleport to task", null, "Teleport to VIP", null, "Drop"};
				itemDef.rdc2 = 37483;
				itemdefyogipic = ItemDefinition.get(4155);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				break;
			case 14827:
				itemDef.name = "American pernix hood";
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = 1;
				itemDef.modelOffsetY = 200;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = 260;
				itemDef.rotationX = 20;
				itemDef.modelID = 64159;
				itemDef.maleEquip1 = 64160;
				itemDef.femaleEquip1 = 64160;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 14818:
				itemDef.name = "American pernix body";
				itemdefyogipic = ItemDefinition.get(5575);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = 1350;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64161;
				itemDef.maleEquip1 = 64162;
				itemDef.femaleEquip1 = 64162;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 15441:
			case 15442:
			case 15443:
			case 15444:
				
				break;
			case 13953:
			case 13954:
			case 13955:
			case 13956:
			case 13957:
				
				break;
			case 14820:
				itemDef.name = "American pernix legs";
				itemdefyogipic = ItemDefinition.get(5576);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = 7;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64163;
				itemDef.maleEquip1 = 64164;
				itemDef.femaleEquip1 = 64164;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 21050:
				itemDef.name = "Slayermaster hood";
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64284;
				itemDef.maleEquip1 = 64285;
				itemDef.femaleEquip1 = 64285;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 21051:
				itemDef.name = "Slayermaster body";
				itemdefyogipic = ItemDefinition.get(5575);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64286;
				itemDef.maleEquip1 = 64287;
				itemDef.femaleEquip1 = 64287;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 21052:
				itemDef.name = "Slayermaster legs";
				itemdefyogipic = ItemDefinition.get(5576);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64288;
				itemDef.maleEquip1 = 64289;
				itemDef.femaleEquip1 = 64289;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 21025:
				itemDef.name = "Samurai head";
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64247;
				itemDef.maleEquip1 = 64248;
				itemDef.femaleEquip1 = 64248;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 21026:
				itemDef.name = "Samurai body";
				itemdefyogipic = ItemDefinition.get(5575);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64249;
				itemDef.maleEquip1 = 64250;
				itemDef.femaleEquip1 = 64250;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 21027:
				itemDef.name = "Samurai legs";
				itemdefyogipic = ItemDefinition.get(5576);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64251;
				itemDef.maleEquip1 = 64252;
				itemDef.femaleEquip1 = 64252;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 21028:
				itemDef.name = "eSamurai head";
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64253;
				itemDef.maleEquip1 = 64254;
				itemDef.femaleEquip1 = 64254;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 923295;
				break;
			case 21029:
				itemDef.name = "eSamurai body";
				itemdefyogipic = ItemDefinition.get(5575);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64255;
				itemDef.maleEquip1 = 64256;
				itemDef.femaleEquip1 = 64256;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 923295;
				break;
			case 21030:
				itemDef.name = "eSamurai legs";
				itemdefyogipic = ItemDefinition.get(5576);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64257;
				itemDef.maleEquip1 = 64258;
				itemDef.femaleEquip1 = 64258;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 923295;
				break;
			case 11009:
				itemDef.name = "Hotshot helm";
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64186;
				itemDef.maleEquip1 = 64187;
				itemDef.femaleEquip1 = 64187;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 11010:
				itemDef.name = "Hotshot body";
				itemdefyogipic = ItemDefinition.get(5575);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64188;
				itemDef.maleEquip1 = 64189;
				itemDef.femaleEquip1 = 64189;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 11011:
				itemDef.name = "Hotshot legs";
				itemdefyogipic = ItemDefinition.get(5576);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64190;
				itemDef.maleEquip1 = 64191;
				itemDef.femaleEquip1 = 64191;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 11012:
				itemDef.name = "Hotshot wings";
				itemdefyogipic = ItemDefinition.get(2413);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64192;
				itemDef.maleEquip1 = 64193;
				itemDef.femaleEquip1 = 64193;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 11001:
				itemDef.name = "Hiddenvally coif";
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64179;
				itemDef.maleEquip1 = 64180;
				itemDef.femaleEquip1 = 64180;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 11002:
				itemDef.name = "Hiddenvally leatherbody";
				itemdefyogipic = ItemDefinition.get(5575);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64181;
				itemDef.maleEquip1 = 64182;
				itemDef.femaleEquip1 = 64182;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;

			case 2575:
				itemDef.name = "Goku Watch";
				
				break;
			case 11003:
				itemDef.name = "Hiddenvally leatherchaps";
				itemdefyogipic = ItemDefinition.get(5576);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64183;
				itemDef.maleEquip1 = 64184;
				itemDef.femaleEquip1 = 64184;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				break;
			case 11006:
				itemDef.name = "Forbidden coif";
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64179;
				itemDef.maleEquip1 = 64180;
				itemDef.femaleEquip1 = 64180;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 29592;
				break;
			case 11007:
				itemDef.name = "Forbidden leatherbody";
				itemdefyogipic = ItemDefinition.get(5575);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64181;
				itemDef.maleEquip1 = 64182;
				itemDef.femaleEquip1 = 64182;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 29592;
				break;
			case 11008:
				itemDef.name = "Forbidden leatherchaps";
				itemdefyogipic = ItemDefinition.get(5576);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64183;
				itemDef.maleEquip1 = 64184;
				itemDef.femaleEquip1 = 64184;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				
				itemDef.rdc2 = 29592;
				break;
			case 11314:
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = 1000;
				itemDef.rotationY = 10;
				itemDef.rotationX = 10;
				itemDef.modelID = 64123;
				//itemDef.maleWearId = 64124;
				//itemDef.femaleWearId = 64124;
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.name = "<img=1354><col=f8ac00>Goku Double Killcount Pet<img=1354>";
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.actions = new String[]{null, null, "Summon", null, "Drop"};
				break;
			case 8868:
				itemDef.name = "<col=f8ac00>Betrayed key@lre@";
				itemDef.actions = new String[5];
				itemDef.actions[0] = "Open";
				break;
			case 21201:
				itemDef.name = "Betrayed key [<col=92d49a>Uncommon@lre@]";
				itemdefyogipic = ItemDefinition.get(8868);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.actions = itemdefyogipic.actions;
				itemDef.rdc2 = 4710;
				break;
			case 21202:
				itemDef.name = "Betrayed key [<col=789eea>Rare@lre@]";
				itemdefyogipic = ItemDefinition.get(8868);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.actions = itemdefyogipic.actions;
				itemDef.rdc2 = 888888;
				break;
			case 21203:
				itemDef.name = "Betrayed key [<col=c378ea>Legendary@lre@]";
				itemdefyogipic = ItemDefinition.get(8868);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.actions = itemdefyogipic.actions;
				itemDef.rdc2 = 111111;
				break;
			case 21204:
				itemDef.name = "Betrayed key [<col=eae678>Exotic@lre@]";
				itemdefyogipic = ItemDefinition.get(8868);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.actions = itemdefyogipic.actions;
				itemDef.rdc2 = 88757;
				break;
			case 9662:
				itemDef.name = "<col=f8ac00>Damned key@lre@";
				itemDef.actions = new String[5];
				itemDef.actions[0] = "Open";
				break;
			case 21205:
				itemDef.name = "Damned key [<col=92d49a>Uncommon@lre@]";
				itemdefyogipic = ItemDefinition.get(9662);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.actions = itemdefyogipic.actions;
				itemDef.rdc2 = 4710;
				break;
			case 21206:
				itemDef.name = "Damned key [<col=789eea>Rare@lre@]";
				itemdefyogipic = ItemDefinition.get(9662);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.actions = itemdefyogipic.actions;
				itemDef.rdc2 = 888888;
				break;
			case 21207:
				itemDef.name = "Damned key [<col=c378ea>Legendary@lre@]";
				itemdefyogipic = ItemDefinition.get(9662);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.actions = itemdefyogipic.actions;
				itemDef.rdc2 = 111111;
				break;
			case 21208:
				itemDef.name = "Damned key [<col=eae678>Exotic@lre@]";
				itemdefyogipic = ItemDefinition.get(9662);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.actions = itemdefyogipic.actions;
				itemDef.rdc2 = 88757;
				break;
			case 14471:
				itemDef.name = "<col=f8ac00>Hidden key@lre@";
				itemDef.actions = new String[5];
				itemDef.actions[0] = "Open";
				break;
			case 21209:
				itemDef.name = "Hidden key [<col=92d49a>Uncommon@lre@]";
				itemdefyogipic = ItemDefinition.get(14471);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.actions = itemdefyogipic.actions;
				itemDef.rdc2 = 1896;
				break;
			case 21210:
				itemDef.name = "Hidden key [<col=789eea>Rare@lre@]";
				itemdefyogipic = ItemDefinition.get(14471);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.actions = itemdefyogipic.actions;
				itemDef.rdc2 = 888888;
				break;
			case 21211:
				itemDef.name = "Hidden key [<col=c378ea>Legendary@lre@]";
				itemdefyogipic = ItemDefinition.get(14471);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.actions = itemdefyogipic.actions;
				itemDef.rdc2 = 111111;
				break;
			case 21212:
				itemDef.name = "Hidden key [<col=eae678>Exotic@lre@]";
				itemdefyogipic = ItemDefinition.get(14471);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.actions = itemdefyogipic.actions;
				itemDef.rdc2 = 88757;
				break;
			case 3468:
				itemDef.name = "<col=f8ac00>Cursed key@lre@";
				itemDef.actions = new String[5];
				itemDef.actions[0] = "Open";
				break;
			case 21213:
				itemDef.name = "Cursed key [<col=92d49a>Uncommon@lre@]";
				itemdefyogipic = ItemDefinition.get(3468);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.actions = itemdefyogipic.actions;
				itemDef.rdc2 = 5364;
				break;
			case 21214:
				itemDef.name = "Cursed key [<col=789eea>Rare@lre@]";
				itemdefyogipic = ItemDefinition.get(3468);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.actions = itemdefyogipic.actions;
				itemDef.rdc2 = 888888;
				break;
			case 21215:
				itemDef.name = "Cursed key [<col=c378ea>Legendary@lre@]";
				itemdefyogipic = ItemDefinition.get(3468);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.actions = itemdefyogipic.actions;
				itemDef.rdc2 = 7326;
				break;
			case 21216:
				itemDef.name = "Cursed key [<col=eae678>Exotic@lre@]";
				itemdefyogipic = ItemDefinition.get(3468);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.actions = itemdefyogipic.actions;
				itemDef.rdc2 = 88757;
				break;
			case 21217:
				itemDef.name = "Slayer xp lamp ";
				itemdefyogipic = ItemDefinition.get(19750);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.actions = itemdefyogipic.actions;
				itemDef.rdc2 = 36262;
				break;
			case 15403:
				itemDef.name = "Sharp balmung";
				itemDef.rdc2 = 9224592;
				break;
			case 10887:
				itemDef.name = "Pirates ancor";
				itemDef.rdc2 = 9939;
				break;
			case 21219:
				itemDef.name = "Slayer xp lamp ";
				itemdefyogipic = ItemDefinition.get(19750);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = 750;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.actions = itemdefyogipic.actions;
				itemDef.rdc2 = 36262;
				break;
			case 21218:
				itemDef.name = "Invention xp lamp ";
				itemdefyogipic = ItemDefinition.get(19750);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = itemdefyogipic.modelID;
				itemDef.actions = itemdefyogipic.actions;
				itemDef.rdc2 = 3344;
				break;
			case 21260:
				itemDef.name = "offhand glaive";
				itemDef.modelID = 64301;
				itemDef.maleEquip1 = 64302;
				itemDef.femaleEquip1 = 64302;
				def = ItemDefinition.get(22034);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				

				break;
			case 20505:
				itemDef.name = "saggy offhand glaive";
				itemDef.modelID = 64301;
				itemDef.maleEquip1 = 64302;
				itemDef.femaleEquip1 = 64302;
				def = ItemDefinition.get(22034);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				//

				break;
			case 5424:
				itemDef.name = "madman offhand glaive";
				itemDef.modelID = 64301;
				itemDef.maleEquip1 = 64302;
				itemDef.femaleEquip1 = 64302;
				def = ItemDefinition.get(22034);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				//

				break;
			case 21261:
				itemDef.name = "offhand glaive";
				itemDef.modelID = 64301;
				itemDef.maleEquip1 = 64302;
				itemDef.femaleEquip1 = 64302;
				def = ItemDefinition.get(22034);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				
				itemDef.rdc2 = 464646;
				break;
			case 21262:
				itemDef.name = "offhand glaive";
				itemDef.modelID = 64301;
				itemDef.maleEquip1 = 64302;
				itemDef.femaleEquip1 = 64302;
				def = ItemDefinition.get(22034);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				
				itemDef.rdc2 = 85722;
				break;
			case 21263:
				itemDef.name = "offhand glaive";
				itemDef.modelID = 64301;
				itemDef.maleEquip1 = 64302;
				itemDef.femaleEquip1 = 64302;
				def = ItemDefinition.get(22034);
				itemDef.modelOffsetX = def.modelOffsetX;
				itemDef.modelOffsetY = def.modelOffsetY;
				itemDef.modelZoom = def.modelZoom;
				itemDef.rotationY = def.rotationY;
				itemDef.rotationX = def.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				
				itemDef.rdc2 = 43722;
				break;
			case 455:
				itemDef.name = "Scratch Card";
				break;
			case 18599:
				itemDef.name = "Pink Bikini head";
				itemdefyogipic = ItemDefinition.get(4882);
				itemDef.modelOffsetX = 1;
				itemDef.modelOffsetY = -60;
				itemDef.modelZoom = 1000;
				itemDef.rotationY = 230;
				itemDef.rotationX = 200;
				itemDef.modelID = 64317;
				itemDef.maleEquip1 = 64318;
				itemDef.femaleEquip1 = 64318;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				break;
			case 18600:
				itemDef.name = "Bikini body";
				itemdefyogipic = ItemDefinition.get(5575);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = 1600;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64319;
				itemDef.maleEquip1 = 64320;
				itemDef.femaleEquip1 = 64320;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				break;
			case 18601:
				itemDef.name = "Bikini legs";
				itemdefyogipic = ItemDefinition.get(5576);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = 20;
				itemDef.modelZoom = 2000;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64321;
				itemDef.maleEquip1 = 64322;
				itemDef.femaleEquip1 = 64322;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				break;
			case 18602:
				itemDef.name = "Bikini hands";
				itemdefyogipic = ItemDefinition.get(7461);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64323;
				itemDef.maleEquip1 = 64324;
				itemDef.femaleEquip1 = 64324;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				break;
			case 18603:
				itemDef.name = "Bikini feet";
				itemdefyogipic = ItemDefinition.get(7114);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64325;
				itemDef.maleEquip1 = 64325;
				itemDef.femaleEquip1 = 64325;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				break;
			case 5012:
				itemDef.name = "Execution Twisted Bow";
				ItemDefinition tbow = ItemDefinition.get(1419);
				// itemDef.modelID = itemDef2.modelID;
				itemDef.modelID = 65324;
				itemDef.femaleEquip1 = 65325;
				itemDef.maleEquip1 = 65325;
				itemDef.actions = tbow.actions;
				itemDef.modelOffsetX = tbow.modelOffsetX;
				itemDef.modelOffsetY = tbow.modelOffsetY;
				itemDef.modelZoom = 2000;
				itemDef.rotationY = tbow.rotationY;
				itemDef.rotationX = tbow.rotationX;
				itemDef.stackable = false;
				break;
			case 5011:
				itemDef.name = "@whi@Light Twisted Bow";
				ItemDefinition tbow1 = ItemDefinition.get(1419);
				itemDef.modelID = 65324;
				itemDef.femaleEquip1 = 65325;
				itemDef.maleEquip1 = 65325;
				itemDef.actions = tbow1.actions;
				itemDef.modelOffsetX = tbow1.modelOffsetX;
				itemDef.modelOffsetY = tbow1.modelOffsetY;
				itemDef.modelZoom = tbow1.modelZoom;
				itemDef.rotationY = tbow1.rotationY;
				itemDef.rotationX = tbow1.rotationX;
				itemDef.stackable = false;
				itemDef.rdc2 = 888833;
				break;
			case 5010:
				itemDef.name = "Crystalized bow";
				ItemDefinition tbow3 = ItemDefinition.get(1419);
				itemDef.modelID = 71222;
				itemDef.femaleEquip1 = 71223;
				itemDef.maleEquip1 = 71223;
				itemDef.actions = tbow3.actions;
				itemDef.modelOffsetX = tbow3.modelOffsetX;
				itemDef.modelOffsetY = tbow3.modelOffsetY;
				itemDef.modelZoom = tbow3.modelZoom;
				itemDef.rotationY = tbow3.rotationY;
				itemDef.rotationX = tbow3.rotationX;
				itemDef.stackable = false;
				break;
			case 8136:
				itemDef.name = "Blood Vitur";
				ItemDefinition vitruu = ItemDefinition.get(1419);
				// itemDef.modelID = itemDef2.modelID;
				itemDef.modelID = 65320;
				itemDef.femaleEquip1 = 65321;
				itemDef.maleEquip1 = 65321;
				itemDef.actions = vitruu.actions;

				itemDef.modelOffsetX = vitruu.modelOffsetX;
				//	itemDef.modelOffsetX = vitruu.modelOffsetX;
				itemDef.modelOffsetY = vitruu.modelOffsetY;
				itemDef.modelZoom = 3800;
				itemDef.rotationY = vitruu.rotationY;
				itemDef.rotationX = vitruu.rotationX;
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{54};
				break;
			case 12535:
				itemDef.name = "Execution Vitur";
				ItemDefinition vitur22 = ItemDefinition.get(1419);
				// itemDef.modelID = itemDef2.modelID;
				itemDef.modelID = 65320;
				itemDef.femaleEquip1 = 65321;
				itemDef.maleEquip1 = 65321;
				itemDef.actions = vitur22.actions;

				itemDef.modelOffsetX = vitur22.modelOffsetX;
				//	itemDef.modelOffsetX = vitruu.modelOffsetX;
				itemDef.modelOffsetY = vitur22.modelOffsetY;
				itemDef.modelZoom = 3800;
				itemDef.rotationY = vitur22.rotationY;
				itemDef.rotationX = vitur22.rotationX;
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{57};
				break;

			case 12537:
				itemDef.name = "Light Scythe Of Vitur";
				ItemDefinition vitur222 = ItemDefinition.get(1419);
				// itemDef.modelID = itemDef2.modelID;
				itemDef.modelID = 65320;
				itemDef.femaleEquip1 = 65321;
				itemDef.maleEquip1 = 65321;
				itemDef.actions = vitur222.actions;

				itemDef.modelOffsetX = vitur222.modelOffsetX;
				//	itemDef.modelOffsetX = vitruu.modelOffsetX;
				itemDef.modelOffsetY = vitur222.modelOffsetY;
				itemDef.modelZoom = 3800;
				itemDef.rotationY = vitur222.rotationY;
				itemDef.rotationX = vitur222.rotationX;
				itemDef.stackable = false;
				itemDef.newModelColor = new int[]{40};
				itemDef.editedModelColor = new int[]{76};
				break;
			case 9940:
				itemDef.name = "Execution chainmace";
				ItemDefinition execution = ItemDefinition.get(4755);
				// itemDef.modelID = itemDef2.modelID;
				itemDef.modelID = 65322;
				itemDef.femaleEquip1 = 65323;
				itemDef.maleEquip1 = 65323;
				itemDef.actions = execution.actions;

				itemDef.modelOffsetX = execution.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = execution.modelOffsetY;
				itemDef.modelZoom = execution.modelZoom;
				itemDef.rotationY = execution.rotationY;
				itemDef.rotationX = execution.rotationX;
				itemDef.stackable = false;
				itemDef.rdc2 = 3645768;//23622

				break;
			case 9942:
				itemDef.name = "Execution Staff";

				ItemDefinition execution1 = ItemDefinition.get(21777);
				// itemDef.modelID = itemDef2.modelID;
				itemDef.modelID = execution1.modelID;
				itemDef.femaleEquip1 = execution1.femaleEquip1;
				itemDef.maleEquip1 = execution1.maleEquip1;
				itemDef.actions = execution1.actions;

				itemDef.modelOffsetX = execution1.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = execution1.modelOffsetY;
				itemDef.modelZoom = execution1.modelZoom;
				itemDef.rotationY = execution1.rotationY;
				itemDef.rotationX = execution1.rotationX;
				itemDef.stackable = false;
				itemDef.rdc2 = 85748;//23622

				break;
			case 9939:
				itemDef.name = "Execution cape";

				ItemDefinition execape = ItemDefinition.get(21039);
				// itemDef.modelID = itemDef2.modelID;
				itemDef.modelID = execape.modelID;
				itemDef.femaleEquip1 = execape.femaleEquip1;
				itemDef.maleEquip1 = execape.maleEquip1;
				itemDef.actions = execape.actions;
				itemDef.modelZoom = 3000;
				itemDef.modelOffsetX = execape.modelOffsetX;
				//	itemDef.modelOffsetX = itemDef2.modelOffsetX;
				itemDef.modelOffsetY = execape.modelOffsetY;
				//itemDef.modelZoom = execape.modelZoom;
				itemDef.rotationY = execape.rotationY;
				itemDef.rotationX = execape.rotationX;
				itemDef.stackable = false;
				itemDef.rdc2 = 565656;//23622

				break;
			case 17011:
				itemDef.name = "Sanguinesti Execution Staff";
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.modelID = 99513;
				itemDef.maleEquip1 = 99506;
				itemDef.femaleEquip1 = 99506;
				break;

			case 17013:
				itemDef.name = "@whi@Light Sanguinesti Staff";
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.modelID = 99513;
				itemDef.maleEquip1 = 99506;
				itemDef.femaleEquip1 = 99506;
				itemDef.rdc2 = 888833;
				break;
			case 8273:
				itemDef.name = "Execution gloves";
				itemdefyogipic = ItemDefinition.get(7461);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = 1200;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64277;
				itemDef.maleEquip1 = 64278;
				itemDef.femaleEquip1 = 64278;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				itemDef.rdc2 = 565656;
				break;
			case 8274:
				itemDef.name = "Execution boots";
				itemdefyogipic = ItemDefinition.get(7114);
				itemDef.modelOffsetX = itemdefyogipic.modelOffsetX;
				itemDef.modelOffsetY = itemdefyogipic.modelOffsetY;
				itemDef.modelZoom = itemdefyogipic.modelZoom;
				itemDef.rotationY = itemdefyogipic.rotationY;
				itemDef.rotationX = itemdefyogipic.rotationX;
				itemDef.modelID = 64279;
				itemDef.maleEquip1 = 64279;
				itemDef.femaleEquip1 = 64279;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.stackable = false;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				itemDef.stackable = false;
				itemDef.rdc2 = 565656;
				break;
			case 9941:
				itemDef.actions = new String[5];
				itemDef.modelID = 19219;
				itemDef.name = "Execution blowpipe";
				itemDef.modelZoom = 1158;
				itemDef.rotationX = 189;//189
				itemDef.rotationY = 768;//768
				itemDef.modelOffsetX = -7;
				itemDef.modelOffsetY = 4;
				itemDef.value = 20000000;
				itemDef.maleEquip1 = 14403;
				itemDef.femaleEquip1 = 14403;
				itemDef.actions[1] = "Wield";
				// itemDef.actions[2] = "Uncharge";
				//	itemDef.actions[3] = "Uncharge";
				itemDef.groundActions = new String[]{null, null, "Take", null, null};
				itemDef.rdc2 = 666737;//23622
				break;

			case 4684:
				itemDef.name = "Execution helm";
				itemDef.modelID = 65272;
				itemDef.maleEquip1 = 65273;
				itemDef.femaleEquip1 = 65273;
				itemDef21 = ItemDefinition.get(4882);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 45341;

                /* Dye recolors

                33281 cyan
                50000 purple
                12222 grey
                99900 teal
                remove rdc for GREEN

                 */
				break;
			case 4685:
				itemDef.name = "Execution body";
				itemDef.modelID = 65274;
				itemDef.maleEquip1 = 65275;
				itemDef.femaleEquip1 = 65275;
				itemDef21 = ItemDefinition.get(4894);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 45341;
				break;
			case 4686:
				itemDef.name = "Execution legs";
				itemDef.modelID = 65276;
				itemDef.maleEquip1 = 65277;
				itemDef.femaleEquip1 = 65277;
				itemDef21 = ItemDefinition.get(4900);
				itemDef.modelOffsetX = itemDef21.modelOffsetX;
				itemDef.modelOffsetY = itemDef21.modelOffsetY;
				itemDef.modelZoom = itemDef21.modelZoom;
				itemDef.rotationY = itemDef21.rotationY;
				itemDef.rotationX = itemDef21.rotationX;
				itemDef.actions = new String[]{null, "Wear", null, null, "Drop"};
				itemDef.stackable = false;
				itemDef.rdc2 = 45341;
				break;
		}
		return itemDef;
	}

}

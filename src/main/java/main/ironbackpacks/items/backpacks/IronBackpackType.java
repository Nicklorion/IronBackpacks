package main.ironbackpacks.items.backpacks;

import main.ironbackpacks.util.ConfigHandler;
import main.ironbackpacks.util.IronBackpacksConstants;

public enum IronBackpackType {

    BASIC(IronBackpacksConstants.Backpacks.BASIC_ID,
            ConfigHandler.enumBasicBackpack.sizeX.getValue() * ConfigHandler.enumBasicBackpack.sizeY.getValue(),
            ConfigHandler.enumBasicBackpack.sizeX.getValue(),
            "basicBackpack"),
    IRON(IronBackpacksConstants.Backpacks.IRON_ID,
            ConfigHandler.enumIronBackpack.sizeX.getValue() * ConfigHandler.enumIronBackpack.sizeY.getValue(),
            ConfigHandler.enumIronBackpack.sizeX.getValue(),
            "ironBackpack"),
    GOLD(IronBackpacksConstants.Backpacks.GOLD_ID,
            ConfigHandler.enumGoldBackpack.sizeX.getValue() * ConfigHandler.enumGoldBackpack.sizeY.getValue(),
            ConfigHandler.enumGoldBackpack.sizeX.getValue(),
            "goldBackpack"),
    DIAMOND(IronBackpacksConstants.Backpacks.DIAMOND_ID,
            ConfigHandler.enumDiamondBackpack.sizeX.getValue() * ConfigHandler.enumDiamondBackpack.sizeY.getValue(),
            ConfigHandler.enumDiamondBackpack.sizeX.getValue(),
            "diamondBackpack");

    private int id; //id int value of number in enum
    private int size; //number of slots
    private int rowLength; //number of rows
    public String name;

    IronBackpackType(int id, int size, int rowLength, String fancyName){
        this.id = id;
        this.size = size;
        this.rowLength = rowLength;
        this.name = fancyName;
    }

    public int getRowCount() {
        return size / rowLength;
    }

    public int getRowLength() {
        return rowLength;
    }

    public int getSize() { return size; }

    public String getName() {return name; }

    public int getId() { return id; }
}
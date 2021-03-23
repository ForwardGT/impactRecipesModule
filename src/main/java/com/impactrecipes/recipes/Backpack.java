package com.impactrecipes.recipes;

import gregtech.api.enums.Dyes;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_Utility;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Backpack implements Runnable {

    private static final long tBitMask = GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE;

    @Override
    public void run() {
        hand();
        assembler();
        bath();
    }

    private void hand() {
        // --- Bound Leather
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Backpack", "boundLeather", 1L), tBitMask, new Object[]{"SLS", "LSL", "SLS", 'S', new ItemStack(Items.string), 'L', new ItemStack(Items.leather)});
        // --- Small Backpack
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Backpack", "backpack", 1L), tBitMask, new Object[]{"WRW", "LWL", "LLL", 'R', OrePrefixes.ring.get(Materials.Iron), 'L', GT_ModHandler.getModItem("Backpack", "boundLeather", 1L), 'W', new ItemStack(Blocks.wool)});
        // --- Medium Backpack
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Backpack", "backpack", 1L, 100), tBitMask, new Object[]{"RLR", "LBL", "RLR", 'R', OrePrefixes.ring.get(Materials.WroughtIron), 'L', GT_ModHandler.getModItem("Backpack", "tannedLeather", 1L), 'B', GT_ModHandler.getModItem("Backpack", "backpack", 1L)});
        // --- Big Backpack
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Backpack", "backpack", 1L, 200), tBitMask, new Object[]{"RLR", "LBL", "RLR", 'R', OrePrefixes.ring.get(Materials.Steel), 'L', new ItemStack(Blocks.wool), 'B', GT_ModHandler.getModItem("Backpack", "backpack", 1L, 100)});
        // --- Workbench Backpack
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Backpack", "workbenchbackpack", 1L, 17), tBitMask, new Object[]{"WRW", "LWL", "LBL", 'R', OrePrefixes.ring.get(Materials.Iron), 'L', GT_ModHandler.getModItem("Backpack", "boundLeather", 1L), 'W', new ItemStack(Blocks.wool), 'B', GT_ModHandler.getModItem("TConstruct", "CraftingSlab", 1L)});
        // --- Workbench Big Backpack
        GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Backpack", "workbenchbackpack", 1L, 217), tBitMask, new Object[]{"RLR", "LBL", "RCR", 'R', OrePrefixes.ring.get(Materials.Steel), 'L', new ItemStack(Blocks.wool), 'B', GT_ModHandler.getModItem("Backpack", "backpack", 1L, 100), 'C', GT_ModHandler.getModItem("TConstruct", "CraftingSlab", 1L)});

        for (int i = 0; i < 16; i++) {
            // --- Small Backpack*
            GT_ModHandler.addShapelessCraftingRecipe(GT_ModHandler.getModItem("Backpack", "backpack", 1L, i + 1), tBitMask, new Object[]{Dyes.VALUES[i], GT_ModHandler.getModItem("Backpack", "backpack", 1L)});
            // --- Medium Backpack*
            GT_ModHandler.addShapelessCraftingRecipe(GT_ModHandler.getModItem("Backpack", "backpack", 1L, i + 101), tBitMask, new Object[]{Dyes.VALUES[i], GT_ModHandler.getModItem("Backpack", "backpack", 1L, 100)});
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Backpack", "backpack", 1L, i + 101), tBitMask, new Object[]{"RLR", "LBL", "RLR", 'R', OrePrefixes.ring.get(Materials.WroughtIron), 'L', GT_ModHandler.getModItem("Backpack", "tannedLeather", 1L), 'B', GT_ModHandler.getModItem("Backpack", "backpack", 1L, i + 1)});
            // --- Big Backpack*
            GT_ModHandler.addShapelessCraftingRecipe(GT_ModHandler.getModItem("Backpack", "backpack", 1L, i + 201), tBitMask, new Object[]{Dyes.VALUES[i], GT_ModHandler.getModItem("Backpack", "backpack", 1L, 200)});
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("Backpack", "backpack", 1L, i + 201), tBitMask, new Object[]{"RLR", "LBL", "RLR", 'R', OrePrefixes.ring.get(Materials.Steel), 'L', new ItemStack(Blocks.wool), 'B', GT_ModHandler.getModItem("Backpack", "backpack", 1L, i + 101)});
        }
    }

    private void assembler() {
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{new ItemStack(Items.leather, 2), new ItemStack(Items.string, 3),
                        GT_Utility.getIntegratedCircuit(1)}, null,
                GT_ModHandler.getModItem("Backpack", "boundLeather", 1L), 100, 16);
    }

    private void bath() {
        // --- Tanned Leather
        GT_Values.RA.addChemicalBathRecipe(new ItemStack(Items.leather, 2, 0),
                Materials.PhosphoricAcid.getFluid(100),
                GT_ModHandler.getModItem("Backpack", "tannedLeather", 1L, 0), GT_Values.NI, GT_Values.NI,
                new int[]{10000}, 300, 30);

    }
}

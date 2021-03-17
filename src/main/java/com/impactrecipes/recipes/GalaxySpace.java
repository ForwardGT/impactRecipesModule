package com.impactrecipes.recipes;

import com.impact.common.item.Core_Items;
import com.impact.common.item.Core_Items2;
import gregtech.api.GregTech_API;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import static com.impact.common.item.Core_List_Items.TCetiESeaweedExtract;
import static gregtech.api.enums.GT_Values.RA;

public class GalaxySpace implements Runnable {

    final Core_Items2 CoreItems2 = Core_Items2.getInstance();
    final Core_Items CoreItems = Core_Items.getInstance();

    @Override
    public void run() {
        sifter();
        pulverizer();
        fluidCanner();
        extractor();
        centrifuge();
        arcFurnace();
        assembler();
        autoclave();
        compressor();
        chemical();
        assemblyLine();
    }

    private void sifter() {
        RA.addSifterRecipe(GT_ModHandler.getModItem("GalaxySpace", "barnardaCdirt", 1L),
                new ItemStack[]{GT_ModHandler.getModItem("minecraft", "sand", 1L),
                        GT_ModHandler.getModItem("GalaxySpace", "barnardaCdandelions", 1L, 0),
                        GT_ModHandler.getModItem("GalaxySpace", "barnardaCdandelions", 1L, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Gallium, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Yttrium, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Niobium, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Neutronium, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.InfinityCatalyst, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.DraconiumAwakened, 1L)},
                new int[]{5000, 2000, 2000, 2500, 2000, 1500, 900, 250, 250}, 20, 2000000);
    }

    private void pulverizer() {
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "ceresblocks", 1L, 0),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustCeres", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.MeteoricIron, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Beryllium, 1)},
                new int[]{10000, 5000, 2500}, 400, 120);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "ceresblocks", 1L, 1),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustCeres", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.MeteoricIron, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Beryllium, 1)},
                new int[]{10000, 5000, 2500}, 400, 120);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "europablocks", 1L, 1),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustEuropa", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.SiliconDioxide, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iron, 1)},
                new int[]{10000, 5000, 2000}, 400, 120);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "europablocks", 1L, 2),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustIceEuropa", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Ledox, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Lapis, 1)},
                new int[]{10000, 5000, 2500}, 400, 120);
        RA.addPulveriserRecipe(
                GT_ModHandler.getModItem("GalaxySpace", "europaunderwatergeyser", 1L, 0),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustIceEuropa", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Ledox, 2),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Lapis, 2)},
                new int[]{10000, 5000, 2500}, 400, 120);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "europablocks", 1L, 0),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustEuropa", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.SiliconDioxide, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iron, 1)},
                new int[]{10000, 5000, 2000}, 400, 120);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "europageyser", 1L, 0),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustEuropa", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.SiliconDioxide, 2),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iron, 2)},
                new int[]{10000, 5000, 3500}, 400, 120);
        RA
                .addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "ganymedeblocks", 1L, 0),
                        new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustGanymed", 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Titanium, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Chromite, 1)},
                        new int[]{10000, 3500, 1000}, 400, 120);
        RA
                .addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "ganymedeblocks", 1L, 1),
                        new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustGanymed", 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Titanium, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Chromite, 1)},
                        new int[]{10000, 3500, 1000}, 400, 120);
        RA
                .addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "callistoblocks", 1L, 0),
                        new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustCallisto", 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Galena, 1)},
                        new int[]{10000, 5000, 2500}, 400, 120);
        RA
                .addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "callistoblocks", 1L, 1),
                        new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustIceCallisto", 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Galena, 1)},
                        new int[]{10000, 5000, 2500}, 400, 120);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "ioblocks", 1L, 0),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustIo", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Sulfur, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tantalite, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tungsten, 1)},
                new int[]{10000, 5000, 2500, 1500}, 400, 256);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "ioblocks", 1L, 7),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustIo", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Sulfur, 2),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tantalite, 2),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tungsten, 2)},
                new int[]{10000, 5000, 3500, 2500}, 400, 256);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "ioblocks", 1L, 1),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustIo", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Ash, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Sulfur, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tantalite, 1)},
                new int[]{10000, 5000, 3000, 2000}, 400, 256);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "ioblocks", 1L, 8),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustIo", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Ash, 2),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Sulfur, 2),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tantalite, 2)},
                new int[]{10000, 5000, 4000, 3000}, 400, 256);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "ioblocks", 1L, 2),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustIo", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Sulfur, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tantalite, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tungsten, 1)},
                new int[]{10000, 5000, 2500, 1500}, 400, 256);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "venusblocks", 1L, 0),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustVenus", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tetrahedrite, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Scheelite, 1)},
                new int[]{10000, 4500, 2500, 1500}, 400, 256);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "venusblocks", 1L, 1),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustVenus", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tetrahedrite, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Scheelite, 1)},
                new int[]{10000, 4500, 2500, 1500}, 400, 256);
        RA
                .addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "mercuryblocks", 1L, 0),
                        new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustMercuryP", 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Ilmenite, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tungsten, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Mithril, 1)},
                        new int[]{10000, 3000, 2000, 1200}, 400, 256);
        RA
                .addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "mercuryblocks", 1L, 1),
                        new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustMercuryP", 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Ilmenite, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tungsten, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Mithril, 1)},
                        new int[]{10000, 3000, 2000, 1200}, 400, 256);
        RA
                .addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "mercuryblocks", 1L, 2),
                        new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustMercuryP", 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Ilmenite, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tungsten, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Mithril, 1)},
                        new int[]{10000, 3000, 2000, 1200}, 400, 256);
        RA
                .addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "enceladusblocks", 1L, 0),
                        new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustIceEnceladus", 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.MysteriousCrystal, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Chrome, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1)},
                        new int[]{10000, 1500, 2000, 1000}, 400, 480);
        RA
                .addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "enceladusblocks", 1L, 1),
                        new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustEnceladus", 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Chrome, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Osmium, 1)},
                        new int[]{10000, 3000, 2000, 1000}, 400, 480);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "titanblocks", 1L, 0),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustTitan", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Nickel, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Osmium, 1)},
                new int[]{10000, 4500, 3000, 2000}, 400, 480);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "titanblocks", 1L, 1),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustTitan", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Nickel, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Osmium, 1)},
                new int[]{10000, 4500, 3000, 2000}, 400, 480);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "titanblocks", 1L, 2),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustTitan", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Nickel, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Osmium, 1)},
                new int[]{10000, 4500, 3000, 2000}, 400, 480);
        RA
                .addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "mirandablocks", 1L, 0),
                        new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustMiranda", 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tin, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tetrahedrite, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1)},
                        new int[]{10000, 2500, 1500, 1000}, 400, 480);
        RA
                .addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "mirandablocks", 1L, 1),
                        new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustMiranda", 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tin, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tetrahedrite, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1)},
                        new int[]{10000, 2500, 1500, 1000}, 400, 480);
        RA
                .addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "mirandablocks", 1L, 2),
                        new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustMiranda", 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tin, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tetrahedrite, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1)},
                        new int[]{10000, 2500, 1500, 1000}, 400, 480);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "tritonblocks", 1L, 0),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustTriton", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Gold, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Neodymium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.RareEarth, 1)},
                new int[]{10000, 5000, 2500, 1000}, 400, 1024);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "tritonblocks", 1L, 1),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustTriton", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Gold, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Neodymium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.RareEarth, 1)},
                new int[]{10000, 5000, 2500, 1000}, 400, 1024);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "tritonblocks", 1L, 2),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustTriton", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Gold, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Neodymium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.RareEarth, 1)},
                new int[]{10000, 5000, 2500, 1000}, 400, 1024);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "tritonblocks", 1L, 3),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustTriton", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Gold, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Neodymium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.RareEarth, 1)},
                new int[]{10000, 5000, 2500, 1000}, 400, 1024);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "tritonblocks", 1L, 4),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustTriton", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Gold, 2),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Neodymium, 2),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.RareEarth, 2)},
                new int[]{10000, 5000, 3500, 2000}, 400, 1024);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "plutoblocks", 1L, 0),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustIcePluto", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Thorium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uranium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Plutonium, 1)},
                new int[]{10000, 5000, 2500, 1250}, 400, 1920);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "plutoblocks", 1L, 1),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustIcePluto", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Thorium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uranium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Plutonium, 1)},
                new int[]{10000, 5000, 2500, 1250}, 400, 1920);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "plutoblocks", 1L, 2),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustIcePluto", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Thorium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uranium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Plutonium, 1)},
                new int[]{10000, 5000, 2500, 1250}, 400, 1920);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "plutoblocks", 1L, 3),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustIcePluto", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Thorium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uranium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Plutonium, 1)},
                new int[]{10000, 5000, 2500, 1250}, 400, 1920);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "plutoblocks", 1L, 4),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustIcePluto", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Thorium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uranium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Plutonium, 1)},
                new int[]{10000, 5000, 2500, 1250}, 400, 1920);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "plutoblocks", 1L, 5),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustPluto", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uranium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Plutonium, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.BlackPlutonium, 1)},
                new int[]{10000, 5000, 2500, 850}, 400, 1920);
        RA
                .addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "acentauribbgrunt", 1L, 0),
                        new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustSurfaceCentauriA", 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.NaquadahEnriched, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Draconium, 1)},
                        new int[]{10000, 5000, 3000, 1000}, 400, 4096);
        RA
                .addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "acentauribbsubgrunt", 1L, 0),
                        new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustCentauriA", 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Osmium, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.NaquadahEnriched, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Neutronium, 1)},
                        new int[]{10000, 5000, 3000, 500}, 400, 4096);
        RA
                .addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "vegabsubgrunt", 1L, 0),
                        new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustVegaB", 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uranium235, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Plutonium241, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Europium, 1)},
                        new int[]{10000, 5000, 3000, 1500}, 400, 4096);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "vegabgrunt", 1L, 0),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustVegaB", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Uranium235, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Plutonium241, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Europium, 1)},
                new int[]{10000, 5000, 3000, 1500}, 400, 4096);
        RA
                .addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "barnardaEgrunt", 1L, 0),
                        new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustBarnardaE", 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Niobium, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Yttrium, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Gallium, 1)},
                        new int[]{10000, 2500, 2000, 1500}, 400, 4096);
        RA
                .addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "barnardaEsubgrunt", 1L, 0),
                        new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustBarnardaE", 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Niobium, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Yttrium, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Gallium, 1)},
                        new int[]{10000, 2500, 2000, 1500}, 400, 4096);
        RA
                .addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "barnardaFgrunt", 1L, 0),
                        new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustBarnardaF", 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Gallium, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Yttrium, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Niobium, 1)},
                        new int[]{10000, 2500, 2000, 1500}, 400, 4096);
        RA
                .addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "barnardaFsubgrunt", 1L, 0),
                        new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustBarnardaF", 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Gallium, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Yttrium, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Niobium, 1)},
                        new int[]{10000, 2500, 2000, 1500}, 400, 4096);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "tcetieblocks", 1L, 0),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustTCetiE", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Lapis, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Apatite, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.BlackPlutonium, 1)},
                new int[]{10000, 2500, 2000, 1500}, 400, 4096);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "tcetieblocks", 1L, 1),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustTCetiE", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Lapis, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Apatite, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.BlackPlutonium, 1)},
                new int[]{10000, 2500, 2000, 1500}, 400, 4096);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "tcetieblocks", 1L, 2),
                new ItemStack[]{GregTech_API.getStackofAmountFromOreDict("dustTCetiE", 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Lapis, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Apatite, 1),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.BlackPlutonium, 1)},
                new int[]{10000, 2500, 2000, 1500}, 400, 4096);
        RA
                .addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "enceladuscrystal", 1L, 0),
                        new ItemStack[]{GT_ModHandler.getModItem("GalaxySpace", "item.BasicItems", 1L, 10),
                                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.MysteriousCrystal, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.MysteriousCrystal, 1),
                                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.MysteriousCrystal, 1)},
                        new int[]{10000, 3500, 2000, 1500}, 200, 480);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "barnardaClog", 1L),
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Wood, 6L),
                        CoreItems2.getRecipe(151, 1)}, new int[]{10000, 3300}, 600, 8);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "barnardaCleaves", 8L),
                new ItemStack[]{CoreItems2.getRecipe(152, 1),
                        GT_ModHandler.getModItem("GalaxySpace", "barnardaCdandelion3", 1L)},
                new int[]{10000, 5000}, 200, 2);
        RA.addPulveriserRecipe(CoreItems2.getRecipe(152, 1),
                new ItemStack[]{GT_ModHandler.getModItem("GalaxySpace", "barnardaCdirt", 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.AlienOrganic, 1L)},
                new int[]{10000, 2000}, 100, 40);
        RA
                .addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "dungeonglowstone", 1L, 0),
                        new ItemStack[]{GT_ModHandler.getModItem("GalaxySpace", "item.GlowstoneDusts", 4L, 0)},
                        new int[]{10000}, 300, 2);
        RA.addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "dungeonglowstone", 1L, 1),
                new ItemStack[]{GT_ModHandler.getModItem("GalaxySpace", "item.GlowstoneDusts", 4L, 1)},
                new int[]{10000}, 300, 2);
        RA
                .addPulveriserRecipe(GT_ModHandler.getModItem("GalaxySpace", "item.UnknowCrystal", 1L),
                        new ItemStack[]{
                                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.MysteriousCrystal, 1L)},
                        new int[]{10000}, 300, 2);
    }

    private void fluidCanner() {
        RA.addFluidCannerRecipe(
                GT_ModHandler.getModItem("GalaxySpace", "item.oxygentank_t4", 1L, 10800),
                GT_ModHandler.getModItem("GalaxySpace", "item.oxygentank_t4", 1L, 0),
                Materials.Oxygen.getGas(10800L), GT_Values.NF);
        RA.addFluidCannerRecipe(
                GT_ModHandler.getModItem("GalaxySpace", "item.oxygentank_t5", 1L, 12600),
                GT_ModHandler.getModItem("GalaxySpace", "item.oxygentank_t5", 1L, 0),
                Materials.Oxygen.getGas(12600L), GT_Values.NF);
        RA.addFluidCannerRecipe(
                GT_ModHandler.getModItem("GalaxySpace", "item.oxygentank_t6", 1L, 14400),
                GT_ModHandler.getModItem("GalaxySpace", "item.oxygentank_t6", 1L, 0),
                Materials.Oxygen.getGas(14400L), GT_Values.NF);
    }

    private void extractor() {
        for (byte i = 0; i < 6; ++i) {
            RA.addExtractorRecipe(GT_ModHandler.getModItem("GalaxySpace", "tcetiedandelions", 64L, i),
                    CoreItems.getRecipe(TCetiESeaweedExtract.getMetaID(), 1), 400, 262144);
        }
    }

    private void centrifuge() {
        GT_Values.RA
                .addCentrifugeRecipe(GT_ModHandler.getModItem("GalaxySpace", "item.GlowstoneDusts", 1L, 0),
                        GT_Values.NI, GT_Values.NF, GT_Values.NF,
                        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Glowstone, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.MeteoricIron, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Beryllium, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Platinum, 1L), null, null,
                        new int[]{10000, 7500, 6000, 5000}, 400, 120);
        GT_Values.RA
                .addCentrifugeRecipe(GT_ModHandler.getModItem("GalaxySpace", "item.GlowstoneDusts", 1L, 1),
                        GT_Values.NI, GT_Values.NF, GT_Values.NF,
                        GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Glowstone, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Sulfur, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tantalite, 1L),
                        GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tungsten, 1L), null, null,
                        new int[]{10000, 7500, 6000, 5000}, 500, 256);
    }

    private void arcFurnace() {
        GT_Values.RA
                .addArcFurnaceRecipe(GT_ModHandler.getModItem("GalaxySpace", "item.Tier4Rocket", 1L, 0),
                        new ItemStack[]{CoreItems2.getRecipe(16, 64), CoreItems2.getRecipe(16, 3),
                                ItemList.Ingot_Heavy3.get(28),
                                GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.HastelloyN, 24)}, null, 1800,
                        24576);
        GT_Values.RA
                .addArcFurnaceRecipe(GT_ModHandler.getModItem("GalaxySpace", "item.Tier5Rocket", 1L, 0),
                        new ItemStack[]{CoreItems2.getRecipe(17, 64), CoreItems2.getRecipe(17, 17),
                                CoreItems2.getRecipe(16, 30),
                                GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Europium, 30)}, null, 2000,
                        98304);
        GT_Values.RA
                .addArcFurnaceRecipe(GT_ModHandler.getModItem("GalaxySpace", "item.Tier6Rocket", 1L, 0),
                        new ItemStack[]{CoreItems2.getRecipe(18, 64), CoreItems2.getRecipe(18, 43),
                                CoreItems2.getRecipe(17, 40),
                                GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Americium, 40)}, null, 2200,
                        393216);
        GT_Values.RA
                .addArcFurnaceRecipe(GT_ModHandler.getModItem("GalaxySpace", "item.Tier7Rocket", 1L, 0),
                        new ItemStack[]{CoreItems2.getRecipe(19, 64), CoreItems2.getRecipe(19, 64),
                                CoreItems2.getRecipe(18, 50),
                                GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Neutronium, 54)}, null, 2400,
                        1572864);
        GT_Values.RA
                .addArcFurnaceRecipe(GT_ModHandler.getModItem("GalaxySpace", "item.Tier8Rocket", 1L, 0),
                        new ItemStack[]{CoreItems2.getRecipe(20, 64), CoreItems2.getRecipe(20, 64),
                                CoreItems2.getRecipe(19, 60),
                                GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Phoenixite, 64)}, null, 2800,
                        6291456);

        //Canisters
        GT_Values.RA
                .addArcFurnaceRecipe(GT_ModHandler.getModItem("GalaxySpace", "item.oxygentank_t4", 1L, GT_Values.W),
                        new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Draconium, 21),
                                GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Chrome, 9)}, null, 1000, 1920);
        GT_Values.RA
                .addArcFurnaceRecipe(GT_ModHandler.getModItem("GalaxySpace", "item.oxygentank_t5", 1L, GT_Values.W),
                        new ItemStack[]{CoreItems2.getRecipe(73, 21),
                                GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Iridium, 9)}, null, 1100, 4096);
        GT_Values.RA
                .addArcFurnaceRecipe(GT_ModHandler.getModItem("GalaxySpace", "item.oxygentank_t6", 1L, GT_Values.W),
                        new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Quantium, 21),
                                GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Osmium, 9)}, null, 1200, 7680);

    }

    private void assembler() {
        // ---  T1 Rocket + chest
        // ---  T4 Rocket + chest
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("GalaxySpace", "item.Tier4Rocket", 1L),
                GT_ModHandler.getModItem("chestup", "Blockchestup", 1L, 2),
                GT_ModHandler.getModItem("GalaxySpace", "item.Tier4Rocket", 1L, 3), 200, 64);
        // ---  T5 Rocket + chest
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("GalaxySpace", "item.Tier5Rocket", 1L),
                GT_ModHandler.getModItem("chestup", "Blockchestup", 1L, 2),
                GT_ModHandler.getModItem("GalaxySpace", "item.Tier5Rocket", 1L, 3), 200, 64);
        // ---  T6 Rocket + chest
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("GalaxySpace", "item.Tier6Rocket", 1L),
                GT_ModHandler.getModItem("chestup", "Blockchestup", 1L, 2),
                GT_ModHandler.getModItem("GalaxySpace", "item.Tier6Rocket", 1L, 3), 200, 64);
        // ---  T7 Rocket + chest
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("GalaxySpace", "item.Tier7Rocket", 1L),
                GT_ModHandler.getModItem("chestup", "Blockchestup", 1L, 2),
                GT_ModHandler.getModItem("GalaxySpace", "item.Tier7Rocket", 1L, 3), 200, 64);
        // ---  T8 Rocket + chest
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("GalaxySpace", "item.Tier8Rocket", 1L),
                GT_ModHandler.getModItem("chestup", "Blockchestup", 1L, 2),
                GT_ModHandler.getModItem("GalaxySpace", "item.Tier8Rocket", 1L, 3), 200, 64);


        // --- Thermal Cloth Tier 2
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.foil, Materials.MeteoricSteel, 4),
                        GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Titanium, 4),
                        GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Tungsten, 4),
                        GT_ModHandler.getModItem("GalacticraftMars", "item.itemBasicAsteroids", 1L, 7)},
                Materials.Polycaprolactam.getMolten(576),
                GT_ModHandler.getModItem("GalaxySpace", "item.ThermalClothT2", 1L), 200, 7680);
        // --- Thermal Padding Helmet Tier 2
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("GalaxySpace", "item.ThermalClothT2", 5L),
                        GT_Utility.getIntegratedCircuit(5),
                        GT_ModHandler.getModItem("GalaxySpace", "item.ThermalPaddingT2", 1L), 1500, 7680);
        // --- Thermal Padding Chestpiece Tier 2
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("GalaxySpace", "item.ThermalClothT2", 8L),
                        GT_Utility.getIntegratedCircuit(8),
                        GT_ModHandler.getModItem("GalaxySpace", "item.ThermalPaddingT2", 1L, 1), 2400, 7680);
        // --- Thermal Padding Leggings Tier 2
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("GalaxySpace", "item.ThermalClothT2", 7L),
                        GT_Utility.getIntegratedCircuit(7),
                        GT_ModHandler.getModItem("GalaxySpace", "item.ThermalPaddingT2", 1L, 2), 2100, 7680);
        // --- Thermal Padding Boots Tier 2
        GT_Values.RA
                .addAssemblerRecipe(GT_ModHandler.getModItem("GalaxySpace", "item.ThermalClothT2", 4L),
                        GT_Utility.getIntegratedCircuit(4),
                        GT_ModHandler.getModItem("GalaxySpace", "item.ThermalPaddingT2", 1L, 3), 1200, 7680);
        // --- Space Suit Jetpack
        //GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ModHandler.getModItem("GalaxySpace", "item.spacesuit_plate", 1L), GT_ModHandler.getModItem("IC2", "itemArmorJetpackElectric", 1L, GT_Values.W), GT_ModHandler.getModItem("GalaxySpace", "item.CompressedPlates", 4L, 2)}, Materials.Platinum.getMolten(1440), GT_ModHandler.getModItem("GalaxySpace", "item.spacesuit_jetplate", 1L), 600, 1920);
        // --- Space Suit Gravity Boots
        //GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ModHandler.getModItem("GalaxySpace", "item.spacesuit_boots", 1L), GT_ModHandler.getModItem("GalaxySpace", "item.CompressedPlates", 2L, 4), GT_ModHandler.getModItem("GalaxySpace", "item.CompressedPlates", 4L, 2)}, Materials.Platinum.getMolten(1440), GT_ModHandler.getModItem("GalaxySpace", "item.spacesuit_gravityboots", 1L), 600, 1920);
        // --- Space Suit Sensor Glasses
        //GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ModHandler.getModItem("GalaxySpace", "item.spacesuit_helmet", 1L), GT_ModHandler.getModItem("GalacticraftCore", "item.sensorGlasses", 1L), GT_ModHandler.getModItem("GalaxySpace", "item.CompressedPlates", 4L, 2)}, Materials.Platinum.getMolten(1440), GT_ModHandler.getModItem("GalaxySpace", "item.spacesuit_helmetglasses", 1L), 600, 1920);
        // --- Future Glass
        GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("minecraft", "glass", 1L),
                GT_OreDictUnificator.get(OrePrefixes.stick, Materials.Desh, 8),
                GT_ModHandler.getModItem("GalaxySpace", "futureglass", 1L), 200, 480);
        // --- Blank Fuel Tank
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("GalacticraftCore", "item.basicItem", 6L, 9),
                        GT_OreDictUnificator.get(OrePrefixes.ring, Materials.Steel, 2),
                        GT_Utility.getIntegratedCircuit(2)}, null,
                GT_ModHandler.getModItem("GalaxySpace", "item.BasicItems", 1L, 0), 50, 16);
        // --- Small Fuel Canister
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[]{GT_ModHandler.getModItem("GalaxySpace", "item.BasicItems", 1L, 0),
                        GT_ModHandler.getModItem("GalaxySpace", "item.CompressedPlates", 2L, 4),
                        GT_Utility.getIntegratedCircuit(1)}, Materials.HSLA.getMolten(72),
                GT_ModHandler.getModItem("GalaxySpace", "item.Modules", 1L, 3), 100, 64);
        // --- EPOT
        GT_Values.RA.addAssemblerRecipe(
                GT_ModHandler.getModItem("GalaxySpace", "item.oxygentank_t4", 1L, 10800),
                GT_ModHandler.getModItem("GalacticraftCore", "item.oxygenConcentrator", 1L, 0),
                GT_ModHandler.getModItem("GalaxySpace", "item.oxygentank_epp_t1", 1L, 10800), 600, 4096);

    }

    private void autoclave() {
        GT_Values.RA.addAutoclaveSpaceRecipe(
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.MysteriousCrystal, 9L),
                Materials.EnrichedBacterialSludge.getFluid(1000L),
                GT_ModHandler.getModItem("GalaxySpace", "item.BasicItems", 1L, 10), 10000, 2000, 7680,
                true);
    }

    private void compressor() {
        GT_Values.RA
                .addCompressorRecipe(GT_ModHandler.getModItem("GalaxySpace", "item.GlowstoneDusts", 4L),
                        GT_ModHandler.getModItem("GalaxySpace", "dungeonglowstone", 1L), 200, 8);
        GT_Values.RA
                .addCompressorRecipe(GT_ModHandler.getModItem("GalaxySpace", "item.GlowstoneDusts", 4L, 1),
                        GT_ModHandler.getModItem("GalaxySpace", "dungeonglowstone", 1L, 1), 200, 8);

    }

    private void chemical() {
        GT_Values.RA.addChemicalRecipe(GT_ModHandler.getModItem("GalaxySpace", "item.BasicItems", 4L, 10),
                Materials.Osmiridium.getDust(2), Materials.GrowthMediumSterilized.getFluid(1000L),
                Materials.BacterialSludge.getFluid(1000L), ItemList.Circuit_Chip_Stemcell.get(64L),
                GT_Values.NI, 600, 30720);
    }

    private void assemblyLine() {
        GT_Values.RA.addAssemblylineRecipe(CoreItems2.getRecipe(3, 1), 144000, new Object[]{
                        CoreItems2.getRecipe(21, 1),
                        GT_ModHandler.getModItem("GalacticraftMars", "item.itemBasicAsteroids", 4L, 0),
                        CoreItems2.getRecipe(11, 14),
                        CoreItems2.getRecipe(31, 6),
                        CoreItems2.getRecipe(36, 4),
                        CoreItems2.getRecipe(133, 4),
                        CoreItems2.getRecipe(26, 2)
                },
                new FluidStack[]{
                        Materials.SolderingAlloy.getMolten(576),
                        Materials.Lubricant.getFluid(500),
                        new FluidStack(FluidRegistry.getFluid("ic2coolant"), 500)
                },
                GT_ModHandler.getModItem("GalaxySpace", "item.Tier4Rocket", 1L, 0), 3000, 16384);

        GT_Values.RA.addAssemblylineRecipe(CoreItems2.getRecipe(4, 1), 288000, new Object[]{
                        CoreItems2.getRecipe(22, 1),
                        CoreItems2.getRecipe(11, 6),
                        CoreItems2.getRecipe(12, 16),
                        CoreItems2.getRecipe(32, 6),
                        CoreItems2.getRecipe(37, 4),
                        CoreItems2.getRecipe(134, 2),
                        CoreItems2.getRecipe(27, 3)
                },
                new FluidStack[]{
                        Materials.SolderingAlloy.getMolten(1152),
                        Materials.Lubricant.getFluid(1000),
                        new FluidStack(FluidRegistry.getFluid("ic2coolant"), 1000),
                        Materials.Duranium.getMolten(576)
                },
                GT_ModHandler.getModItem("GalaxySpace", "item.Tier5Rocket", 1L, 0), 4000, 65536);

        GT_Values.RA.addAssemblylineRecipe(CoreItems2.getRecipe(5, 1), 432000, new Object[]{
                        CoreItems2.getRecipe(23, 1),
                        CoreItems2.getRecipe(12, 8),
                        CoreItems2.getRecipe(13, 18),
                        CoreItems2.getRecipe(33, 8),
                        CoreItems2.getRecipe(38, 6),
                        CoreItems2.getRecipe(134, 4),
                        CoreItems2.getRecipe(28, 4)
                },
                new FluidStack[]{
                        Materials.SolderingAlloy.getMolten(2304),
                        Materials.Lubricant.getFluid(2000),
                        new FluidStack(FluidRegistry.getFluid("ic2coolant"), 2000),
                        Materials.Tritanium.getMolten(1152)
                },
                GT_ModHandler.getModItem("GalaxySpace", "item.Tier6Rocket", 1L, 0), 5000, 262144);

        GT_Values.RA.addAssemblylineRecipe(CoreItems2.getRecipe(6, 1), 576000, new Object[]{
                        CoreItems2.getRecipe(24, 1),
                        CoreItems2.getRecipe(13, 10),
                        CoreItems2.getRecipe(14, 20),
                        CoreItems2.getRecipe(34, 10),
                        CoreItems2.getRecipe(39, 8),
                        CoreItems2.getRecipe(135, 2),
                        CoreItems2.getRecipe(29, 5)
                },
                new FluidStack[]{
                        Materials.SolderingAlloy.getMolten(4608),
                        Materials.Lubricant.getFluid(4000),
                        new FluidStack(FluidRegistry.getFluid("ic2coolant"), 4000),
                        Materials.Neutronium.getMolten(2304)
                },
                GT_ModHandler.getModItem("GalaxySpace", "item.Tier7Rocket", 1L, 0), 6000, 1000000);

        GT_Values.RA.addAssemblylineRecipe(CoreItems2.getRecipe(7, 1), 1152000, new Object[]{
                        CoreItems2.getRecipe(25, 1),
                        CoreItems2.getRecipe(14, 12),
                        CoreItems2.getRecipe(15, 24),
                        CoreItems2.getRecipe(35, 12),
                        CoreItems2.getRecipe(40, 10),
                        CoreItems2.getRecipe(135, 4),
                        CoreItems2.getRecipe(30, 6)
                },
                new FluidStack[]{
                        Materials.SolderingAlloy.getMolten(9216),
                        Materials.Lubricant.getFluid(8000),
                        new FluidStack(FluidRegistry.getFluid("ic2coolant"), 8000),
                        Materials.Phoenixite.getMolten(4608)
                },
                GT_ModHandler.getModItem("GalaxySpace", "item.Tier8Rocket", 1L, 0), 7000, 4000000);

    }

}

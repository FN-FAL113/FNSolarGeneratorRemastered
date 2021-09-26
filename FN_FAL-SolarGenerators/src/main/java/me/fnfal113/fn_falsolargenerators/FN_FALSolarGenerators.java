package me.fnfal113.fn_falsolargenerators;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetProvider;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.electric.generators.SolarGenerator;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import me.fnfal113.fn_falsolargenerators.Generators.*;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class FN_FALSolarGenerators extends JavaPlugin implements SlimefunAddon {

    FileConfiguration config = getConfig();

    @Override
    public void onEnable() {
        ItemStack categoryItem = new CustomItemStack(SlimefunUtils.getCustomHead("7ef65cd50b885b705e558e95836a12477acc8ba36eae588b22569496c7043680"), "&dFN_FAL's Solar Generators Remastered");
        ItemGroup itemGroup = new ItemGroup(new NamespacedKey(this, "generators"), categoryItem);

        config.options().copyDefaults();
        saveDefaultConfig();

        SolarGenerator solarGenerator1 = registerFNGeneratorTier1(itemGroup, "FN_FAL_GENERATOR_TIER1", "6d2822cedb3abd579d6dfa2966c1433c3c36cb9732e2c23ec0cc81daedd4403b", "&dFN Solar Generator Tier I", config.getInt("Tier1-power1"), new ItemStack[] {
                SlimefunItems.SOLAR_GENERATOR_3, SlimefunItems.SOLAR_GENERATOR_4 , SlimefunItems.SOLAR_GENERATOR_3,
                SlimefunItems.SMALL_CAPACITOR, SlimefunItems.POWER_CRYSTAL, SlimefunItems.SMALL_CAPACITOR,
                SlimefunItems.SMALL_CAPACITOR, new ItemStack(Material.NETHER_STAR), SlimefunItems.SMALL_CAPACITOR
        });

        SolarGenerator solarGenerator2 = registerFNGeneratorTier2(itemGroup, "FN_FAL_GENERATOR_TIER2", "35dd37f729fc88133e314a552204c0fa2c0168428b353f957bf15ff24b7707e0", "&dFN Solar Generator Tier II", config.getInt("Tier2-power2"), new ItemStack[] {
                SlimefunItems.SOLAR_GENERATOR_4, solarGenerator1.getItem() , SlimefunItems.SOLAR_GENERATOR_4,
                SlimefunItems.MEDIUM_CAPACITOR, SlimefunItems.POWER_CRYSTAL, SlimefunItems.MEDIUM_CAPACITOR,
                SlimefunItems.STEEL_INGOT, new ItemStack(Material.NETHER_STAR), SlimefunItems.STEEL_INGOT
        });

        SolarGenerator solarGenerator3 = registerFNGeneratorTier3(itemGroup, "FN_FAL_GENERATOR_TIER3", "25ddf6af2d6271d8fdfadbdc54faaad5a68d7b8ac20e163883fc38d76336ea6", "&dFN Solar Generator Tier III", config.getInt("Tier3-power3"), new ItemStack[] {
                SlimefunItems.SOLAR_GENERATOR_4 , solarGenerator2.getItem() , SlimefunItems.SOLAR_GENERATOR_4,
                SlimefunItems.MEDIUM_CAPACITOR, SlimefunItems.POWER_CRYSTAL, SlimefunItems.MEDIUM_CAPACITOR,
                SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.MEDIUM_CAPACITOR, SlimefunItems.DAMASCUS_STEEL_INGOT
        });

        SolarGenerator solarGenerator4 = registerFNGeneratorTier4(itemGroup, "FN_FAL_GENERATOR_TIER4", "e7f4c00356d1addb85b45ba5352992d3ecc0c9d11feb9041482f8531fd27d014", "&dFN Solar Generator Tier IV", config.getInt("Tier4-power4"), new ItemStack[] {
                SlimefunItems.SOLAR_GENERATOR_4 , solarGenerator3.getItem() , SlimefunItems.SOLAR_GENERATOR_4,
                SlimefunItems.MEDIUM_CAPACITOR, SlimefunItems.POWER_CRYSTAL, SlimefunItems.MEDIUM_CAPACITOR,
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.BIG_CAPACITOR, SlimefunItems.REINFORCED_ALLOY_INGOT
        });

        SolarGenerator solarGenerator5 = registerFNGeneratorTier5(itemGroup, "FN_FAL_GENERATOR_TIER5", "afdd9e588d2461d2d3d058cb3e0af2b3a3367607aa14d124ed92a833f25fb112", "&dFN Solar Generator Tier V", config.getInt("Tier5-power5"), new ItemStack[] {
                SlimefunItems.SOLAR_GENERATOR_4 , solarGenerator4.getItem() , SlimefunItems.SOLAR_GENERATOR_4,
                SlimefunItems.MEDIUM_CAPACITOR, SlimefunItems.POWER_CRYSTAL, SlimefunItems.MEDIUM_CAPACITOR,
                SlimefunItems.BIG_CAPACITOR, solarGenerator2.getItem(), SlimefunItems.BIG_CAPACITOR
        });

        SolarGenerator solarGenerator6 = registerFNGeneratorTier6(itemGroup, "FN_FAL_GENERATOR_TIER6", "224ad26209fa02f559ef6aa863ee9ba8f3bef0a02f1e9cff8fdc09196402fb6f", "&dFN Solar Generator Tier VI", config.getInt("Tier6-power6"), new ItemStack[] {
                SlimefunItems.SOLAR_GENERATOR_4 , solarGenerator5.getItem() , SlimefunItems.SOLAR_GENERATOR_4,
                SlimefunItems.BOOSTED_URANIUM, SlimefunItems.POWER_CRYSTAL, SlimefunItems.BOOSTED_URANIUM,
                SlimefunItems.BIG_CAPACITOR, SlimefunItems.LARGE_CAPACITOR, SlimefunItems.BIG_CAPACITOR
        });

        SolarGenerator solarGenerator7 = registerFNGeneratorTier7(itemGroup, "FN_FAL_GENERATOR_TIER7", "c4fe135c311f7086edcc5e6dbc4ef4b23f819fddaa42f827dac46e3574de2287", "&dFN Solar Generator Tier VII", config.getInt("Tier7-power7"), new ItemStack[] {
                SlimefunItems.SOLAR_GENERATOR_4 , solarGenerator6.getItem() , SlimefunItems.SOLAR_GENERATOR_4,
                SlimefunItems.LARGE_CAPACITOR, SlimefunItems.POWER_CRYSTAL, SlimefunItems.LARGE_CAPACITOR,
                SlimefunItems.LARGE_CAPACITOR, solarGenerator3.getItem(), SlimefunItems.LARGE_CAPACITOR
        });

        SolarGenerator solarGenerator8 = registerFNGeneratorTier8(itemGroup, "FN_FAL_GENERATOR_TIER8", "240775c3ad75763613f32f04986881bbe4eee4366d0c57f17f7c7514e2d0a77d", "&dFN Solar Generator Tier VIII", config.getInt("Tier8-power8"), new ItemStack[] {
                SlimefunItems.SOLAR_GENERATOR_4 , solarGenerator7.getItem() , SlimefunItems.SOLAR_GENERATOR_4,
                SlimefunItems.BOOSTED_URANIUM, SlimefunItems.POWER_CRYSTAL, SlimefunItems.BOOSTED_URANIUM,
                SlimefunItems.LARGE_CAPACITOR, solarGenerator4.getItem(), SlimefunItems.LARGE_CAPACITOR
        });
    }

    private SolarGenerator1 registerFNGeneratorTier1(ItemGroup itemGroup, String id, String texture, String name, int power, ItemStack[] recipe) {
        SlimefunItemStack item = new SlimefunItemStack(id, texture, name, "", "&eA solar generator for those who needs power", "&eGenerator works Day and Night", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR), LoreBuilder.powerBuffer(config.getInt("Buffer1")), LoreBuilder.powerPerSecond(power * 2));

        SolarGenerator1 generator = new SolarGenerator1(itemGroup, item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe, power);
        generator.register(this);
        return generator;
    }

    private SolarGenerator2 registerFNGeneratorTier2(ItemGroup itemGroup, String id, String texture, String name, int power, ItemStack[] recipe) {
        SlimefunItemStack item = new SlimefunItemStack(id, texture, name, "", "&eA solar generator for those who needs power", "&eGenerator works Day and Night", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR), LoreBuilder.powerBuffer(config.getInt("Buffer2")), LoreBuilder.powerPerSecond(power * 2));

        SolarGenerator2 generator = new SolarGenerator2(itemGroup, item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe, power);
        generator.register(this);
        return generator;
    }

    private SolarGenerator3 registerFNGeneratorTier3(ItemGroup itemGroup, String id, String texture, String name, int power, ItemStack[] recipe) {
        SlimefunItemStack item = new SlimefunItemStack(id, texture, name, "", "&eA solar generator for those who needs power", "&eGenerator works Day and Night", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR), LoreBuilder.powerBuffer(config.getInt("Buffer3")), LoreBuilder.powerPerSecond(power * 2));

        SolarGenerator3 generator = new SolarGenerator3(itemGroup, item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe, power);
        generator.register(this);
        return generator;
    }

    private SolarGenerator4 registerFNGeneratorTier4(ItemGroup itemGroup, String id, String texture, String name, int power, ItemStack[] recipe) {
        SlimefunItemStack item = new SlimefunItemStack(id, texture, name, "", "&eA solar generator for those who needs power", "&eGenerator works Day and Night", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR), LoreBuilder.powerBuffer(config.getInt("Buffer4")), LoreBuilder.powerPerSecond(power * 2));

        SolarGenerator4 generator = new SolarGenerator4(itemGroup, item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe, power);
        generator.register(this);
        return generator;
    }

    private SolarGenerator5 registerFNGeneratorTier5(ItemGroup itemGroup, String id, String texture, String name, int power, ItemStack[] recipe) {
        SlimefunItemStack item = new SlimefunItemStack(id, texture, name, "", "&eA solar generator for those who needs power", "&eGenerator works Day and Night", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR), LoreBuilder.powerBuffer(config.getInt("Buffer5")), LoreBuilder.powerPerSecond(power * 2));

        SolarGenerator5 generator = new SolarGenerator5(itemGroup, item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe, power);
        generator.register(this);
        return generator;
    }

    private SolarGenerator6 registerFNGeneratorTier6(ItemGroup itemGroup, String id, String texture, String name, int power, ItemStack[] recipe) {
        SlimefunItemStack item = new SlimefunItemStack(id, texture, name, "", "&eA solar generator for those who needs power", "&eGenerator works Day and Night", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR), LoreBuilder.powerBuffer(config.getInt("Buffer6")), LoreBuilder.powerPerSecond(power * 2));

        SolarGenerator6 generator = new SolarGenerator6(itemGroup, item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe, power);
        generator.register(this);
        return generator;
    }

    private SolarGenerator7 registerFNGeneratorTier7(ItemGroup itemGroup, String id, String texture, String name, int power, ItemStack[] recipe) {
        SlimefunItemStack item = new SlimefunItemStack(id, texture, name, "", "&eA solar generator for those who needs power", "&eGenerator works Day and Night", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR), LoreBuilder.powerBuffer(config.getInt("Buffer7")), LoreBuilder.powerPerSecond(power * 2));

        SolarGenerator7 generator = new SolarGenerator7(itemGroup, item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe, power);
        generator.register(this);
        return generator;
    }

    private SolarGenerator8 registerFNGeneratorTier8(ItemGroup itemGroup, String id, String texture, String name, int power, ItemStack[] recipe) {
        SlimefunItemStack item = new SlimefunItemStack(id, texture, name, "", "&eA solar generator for those who needs power", "&eGenerator works Day and Night", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR), LoreBuilder.powerBuffer(config.getInt("Buffer8")), LoreBuilder.powerPerSecond(power * 2));

        SolarGenerator8 generator = new SolarGenerator8(itemGroup, item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe, power);
        generator.register(this);
        return generator;
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    @Override
    public String getBugTrackerURL() {
        return null;
    }
}

package olivermakesco.de.refmagic.registry;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import olivermakesco.de.refmagic.Mod;
import olivermakesco.de.refmagic.block.*;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;

public class RefinedMagicBlocks {
    public static Block kyriteOre = new KyriteOreBlock(
            QuiltBlockSettings
                    .copyOf(Blocks.END_STONE)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
    );
    public static Block kyriteBlock = new Block(
            QuiltBlockSettings
                    .copyOf(Blocks.AMETHYST_BLOCK)
                    .requiresTool()
    );
    public static Block topazOre = new TopazOreBlock(
            QuiltBlockSettings
                    .copyOf(Blocks.GRANITE)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
    );
    public static Block topazBlock = new Block(
            QuiltBlockSettings
                    .copyOf(Blocks.AMETHYST_BLOCK)
                    .requiresTool()
    );
    public static Block bismuthOre = new BismuthOreBlock(
            QuiltBlockSettings
                    .copyOf(Blocks.BASALT)
                    .sounds(BlockSoundGroup.BASALT)
                    .requiresTool()
    );
    public static Block bismuthBlock = new BismuthOreBlock(
            QuiltBlockSettings
                    .copyOf(Blocks.IRON_BLOCK)
                    .sounds(BlockSoundGroup.METAL)
                    .requiresTool()
    );
    public static Block citrineOre = new CitrineOreBlock(
            QuiltBlockSettings
                    .copyOf(Blocks.BLACKSTONE)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
    );
    public static Block citrineBlock = new Block(
            QuiltBlockSettings
                    .copyOf(Blocks.AMETHYST_BLOCK)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .requiresTool()
    );
    public static Block opalOre = new OpalOreBlock(
            QuiltBlockSettings
                    .copyOf(Blocks.END_STONE)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
    );
    public static Block opalBlock = new Block(
            QuiltBlockSettings
                    .copyOf(Blocks.AMETHYST_BLOCK)
                    .requiresTool()
    );
    public static Block roseQuartzOre = new RoseQuartzOreBlock(
            QuiltBlockSettings
                    .copyOf(Blocks.END_STONE)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
    );
    public static Block roseQuartzBlock = new Block(
            QuiltBlockSettings
                    .copyOf(Blocks.QUARTZ_BLOCK)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .requiresTool()
    );
    public static Block altarBlock = new AltarTableBlock(
            QuiltBlockSettings
                    .copyOf(Blocks.SPRUCE_PLANKS)
    );

    public static void register() {
        register(kyriteOre, Mod.id("kyrite_ore"));
        register(kyriteBlock, Mod.id("kyrite_block"));
        register(topazOre, Mod.id("topaz_ore"));
        register(topazBlock, Mod.id("topaz_block"));
        register(bismuthOre, Mod.id("bismuth_ore"));
        register(bismuthBlock, Mod.id("bismuth_block"));
        register(citrineOre, Mod.id("citrine_ore"));
        register(citrineBlock, Mod.id("citrine_block"));
        register(opalOre, Mod.id("opal_ore"));
        register(opalBlock, Mod.id("opal_block"));
        register(roseQuartzOre, Mod.id("rose_quartz_ore"));
        register(roseQuartzBlock, Mod.id("rose_quartz_block"));
        register(altarBlock, Mod.id("altar"));
    }

    public static void register(Block block, Identifier id) {
        Registry.register(Registry.BLOCK, id, block);
    }
}

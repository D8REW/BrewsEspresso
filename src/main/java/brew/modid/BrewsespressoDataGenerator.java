package brew.modid;

import brew.modid.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class BrewsespressoDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(BeLangProvider::new);
		pack.addProvider(BeModelProvider::new);
		pack.addProvider(BeBlockLootTableProvider::new);
		pack.addProvider(BeTagProvider.BeBlockTagProvider::new);
		pack.addProvider(BeTagProvider.BeItemTagProvider::new);
		pack.addProvider(BeTagProvider.BeEntityTagProvider::new);

	}
}

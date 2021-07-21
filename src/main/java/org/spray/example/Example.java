package org.spray.example;

import java.awt.Color;

import org.spray.example.font.IFont;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

public class Example implements ModInitializer {

	@Override
	public void onInitialize() {
		HudRenderCallback.EVENT.register((matrices, tickDelta) -> {
			IFont.CONSOLAS.drawString(matrices, "Consolas Font", 4, 4, Color.WHITE.getRGB());
			IFont.LEGACY.drawString(matrices, "Legacy Font", 4, 7 + IFont.CONSOLAS.getFontHeight(),
					new Color(113, 152, 184).getRGB());
		});
	}

}

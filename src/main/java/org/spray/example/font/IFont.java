package org.spray.example.font;

public class IFont {

	public static GlyphPageFontRenderer CONSOLAS = GlyphPageFontRenderer.create("Consolas",
			25, false, false, false);
	public static GlyphPageFontRenderer LEGACY = GlyphPageFontRenderer.createFromID("/assets/example/font/legacy.ttf",
			21, false, false, false);

}

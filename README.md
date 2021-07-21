# Custom Font for Minecraft 1.17+

This is just a port of the old Font-Rendering for the new version (1.17+)

Author: [superblaubeere27](https://github.com/superblaubeere27)

Ported: [sprayD](https://github.com/SprayDown)

The Original: [Font Renderer](https://github.com/superblaubeere27/ClientBase/tree/master/src/main/java/net/superblaubeere27/clientbase/utils/fontRenderer)

## Example
(Fabric 1.17.1)

```Java
HudRenderCallback.EVENT.register((matrices, tickDelta) -> {
	IFont.CONSOLAS.drawString(matrices, "Consolas Font", 4, 4, Color.WHITE.getRGB());
	IFont.LEGACY.drawString(matrices, "Legacy Font", 4, 7 + IFont.CONSOLAS.getFontHeight(),
			new Color(113, 152, 184).getRGB());
});
```

## Result

![Just a Font](https://whyuleet.ru/upload-images/font-result.png "Font Example")

package de.longuyen.core.layout

import de.longuyen.core.FoundCallback
import de.longuyen.core.Word
import java.awt.Color
import java.awt.image.BufferedImage

abstract class Layout {
    abstract fun produce(image: BufferedImage, text: String, preferedColor: Color, minSize: Float=20f, maxSize: Float=40f, foundCallback: FoundCallback): List<Word>
}
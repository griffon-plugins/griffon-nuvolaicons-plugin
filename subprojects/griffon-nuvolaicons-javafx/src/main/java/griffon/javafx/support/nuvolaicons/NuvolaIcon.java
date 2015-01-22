/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package griffon.javafx.support.nuvolaicons;

import griffon.plugins.nuvolaicons.Nuvola;
import javafx.scene.image.Image;

import javax.annotation.Nonnull;
import java.net.URL;

import static java.util.Objects.requireNonNull;

/**
 * @author Andres Almiray
 */
public class NuvolaIcon extends Image {
    private final Nuvola nuvola;
    private final int size;

    public NuvolaIcon(@Nonnull Nuvola nuvola) {
        this(nuvola, 16);
    }

    public NuvolaIcon(@Nonnull Nuvola nuvola, int size) {
        super(toURL(nuvola, size), true);
        this.nuvola = nuvola;
        this.size = size;
    }

    public NuvolaIcon(@Nonnull String description) {
        this(Nuvola.findByDescription(description));
    }

    @Nonnull
    private static String toURL(@Nonnull Nuvola nuvola, int size) {
        requireNonNull(nuvola, "Argument 'nuvola' must not be null.");
        String resource = nuvola.asResource(size);
        URL url = Thread.currentThread().getContextClassLoader().getResource(resource);
        if (url == null) {
            throw new IllegalArgumentException("Icon " + nuvola.formatted() + " does not exist");
        }
        return url.toExternalForm();
    }

    @Nonnull
    public Nuvola getNuvola() {
        return nuvola;
    }

    public int getSize() {
        return size;
    }
}
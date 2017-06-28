/*
 * Copyright 2014-2017 the original author or authors.
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

import static griffon.plugins.nuvolaicons.Nuvola.invalidDescription;
import static griffon.util.GriffonNameUtils.requireNonBlank;
import static java.util.Objects.requireNonNull;

/**
 * @author Andres Almiray
 */
public class NuvolaIcon extends Image {
    private static final String ERROR_NUVOLA_NULL = "Argument 'nuvola' must not be null.";
    private Nuvola nuvola;
    private int size;

    public NuvolaIcon(@Nonnull Nuvola nuvola) {
        this(nuvola, 16);
    }

    public NuvolaIcon(@Nonnull Nuvola nuvola, int size) {
        super(toURL(nuvola, size), true);
        this.nuvola = requireNonNull(nuvola, ERROR_NUVOLA_NULL);
        this.size = size;
    }

    public NuvolaIcon(@Nonnull String description) {
        super(toURL(description));
        nuvola = Nuvola.findByDescription(description);

        String[] parts = description.split(":");
        if (parts.length == 3) {
            try {
                size = Integer.parseInt(parts[2]);
            } catch (NumberFormatException e) {
                throw invalidDescription(description, e);
            }
        } else {
            size = 16;
        }
    }

    @Nonnull
    private static String toURL(@Nonnull Nuvola nuvola, int size) {
        requireNonNull(nuvola, ERROR_NUVOLA_NULL);
        String resource = nuvola.asResource(size);
        URL url = Thread.currentThread().getContextClassLoader().getResource(resource);
        if (url == null) {
            throw new IllegalArgumentException("Icon " + nuvola + ":" + size + " does not exist");
        }
        return url.toExternalForm();
    }

    @Nonnull
    private static String toURL(@Nonnull String description) {
        requireNonBlank(description, "Argument 'description' must not be blank");
        String resource = Nuvola.asResource(description);
        URL url = Thread.currentThread().getContextClassLoader().getResource(resource);
        if (url == null) {
            throw new IllegalArgumentException("Icon " + description + " does not exist");
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
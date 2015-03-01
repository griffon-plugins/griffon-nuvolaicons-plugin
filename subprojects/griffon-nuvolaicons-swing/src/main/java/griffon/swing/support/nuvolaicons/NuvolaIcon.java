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
package griffon.swing.support.nuvolaicons;

import griffon.plugins.nuvolaicons.Nuvola;

import javax.annotation.Nonnull;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.net.URL;

import static griffon.plugins.nuvolaicons.Nuvola.invalidDescription;
import static griffon.plugins.nuvolaicons.Nuvola.requireValidSize;
import static griffon.util.GriffonNameUtils.requireNonBlank;
import static java.util.Objects.requireNonNull;

/**
 * @author Andres Almiray
 */
public class NuvolaIcon extends ImageIcon {
    private static final String ERROR_NUVOLA_NULL = "Argument 'nuvola' must not be null";
    private Nuvola nuvola;
    private int size;

    public NuvolaIcon() {
        this(Nuvola.findByDescription("apps:error:16"));
    }

    public NuvolaIcon(@Nonnull Nuvola nuvola) {
        this(nuvola, 16);
    }

    public NuvolaIcon(@Nonnull Nuvola nuvola, int size) {
        super(toURL(nuvola, size));
        this.nuvola = requireNonNull(nuvola, ERROR_NUVOLA_NULL);
        this.size = size;
    }

    public NuvolaIcon(@Nonnull String description) {
        this(Nuvola.findByDescription(description));
        setNuvola(description);
    }

    @Nonnull
    private static URL toURL(@Nonnull Nuvola nuvola, int size) {
        requireNonNull(nuvola, ERROR_NUVOLA_NULL);
        String resource = nuvola.asResource(size);
        URL url = Thread.currentThread().getContextClassLoader().getResource(resource);
        if (url == null) {
            throw new IllegalArgumentException("Icon " + nuvola + " does not exist");
        }
        return url;
    }

    @Nonnull
    public Nuvola getNuvola() {
        return nuvola;
    }

    public void setNuvola(@Nonnull Nuvola nuvola) {
        this.nuvola = requireNonNull(nuvola, ERROR_NUVOLA_NULL);
        setImage(Toolkit.getDefaultToolkit().getImage(toURL(nuvola, size)));
    }

    public void setNuvola(@Nonnull String description) {
        requireNonBlank(description, "Argument 'description' must not be blank");

        String[] parts = description.split(":");
        if (parts.length == 3) {
            try {
                int s = Integer.parseInt(parts[2]);
                this.size = requireValidSize(s);
            } catch (NumberFormatException e) {
                throw invalidDescription(description, e);
            }
        } else if (size == 0) {
            size = 16;
        }

        nuvola = Nuvola.findByDescription(description);
        setImage(Toolkit.getDefaultToolkit().getImage(toURL(nuvola, size)));
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = requireValidSize(size);
        setImage(Toolkit.getDefaultToolkit().getImage(toURL(nuvola, size)));
    }
}
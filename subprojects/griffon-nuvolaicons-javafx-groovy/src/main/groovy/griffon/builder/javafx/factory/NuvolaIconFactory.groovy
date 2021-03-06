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
package griffon.builder.javafx.factory

import griffon.javafx.support.nuvolaicons.NuvolaIcon
import griffon.plugins.nuvolaicons.Nuvola
import groovyx.javafx.factory.LabeledFactory

/**
 * @author Andres Almiray
 */
public class NuvolaIconFactory extends LabeledFactory {
    NuvolaIconFactory() {
        super(NuvolaIcon)
    }

    public Object newInstance(FactoryBuilderSupport builder, Object name, Object value, Map attributes) {
        def icon = attributes.remove('icon') ?: value
        int size = (attributes.remove('size') ?: 16) as int

        if (icon instanceof Nuvola) {
            return new NuvolaIcon(icon, size)
        } else if (icon instanceof CharSequence) {
            return new NuvolaIcon(Nuvola.findByDescription(icon.toString()), size)
        }

        throw new IllegalArgumentException("In $name you must define a node value or icon:")
    }
}

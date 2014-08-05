/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agratcow to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package griffon.plugins.nuvolaicons

import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author Andres Almiray
 */
class NuvolaSpec extends Specification {
    @Unroll("Description '#desc' is invalid")
    def "Invalid nuvola description"() {
        when:
        Nuvola.findByDescription(desc)

        then:
        thrown(IllegalArgumentException)

        where:
        desc          | _
        null          | _
        ''            | _
        ' '           | _
        'foo'         | _
        'foo:foo'     | _
        'actions:foo' | _
    }

    @Unroll('Icon #icon with size #size can be resolved')
    def 'Validate all Nuvola icons and sizes'() {
        expect:
        nuvola.asResource(size)
        nuvola.formatted() == "${nuvola.category}:${nuvola.description}"

        where:
        nuvola << (Nuvola.values() + Nuvola.values() + Nuvola.values() + Nuvola.values())
        size << ([16] * Nuvola.values().size()) + ([22] * Nuvola.values().size()) + ([32] * Nuvola.values().size()) + ([48] * Nuvola.values().size())
    }
}

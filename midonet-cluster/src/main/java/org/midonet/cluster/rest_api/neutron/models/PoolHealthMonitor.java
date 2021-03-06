/*
 * Copyright 2014 Midokura SARL
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
package org.midonet.cluster.rest_api.neutron.models;

import java.util.UUID;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class PoolHealthMonitor {

    public UUID id;

    @Override
    public final boolean equals(Object obj) {

        if (obj == this) {
            return true;
        }

        if (!(obj instanceof PoolHealthMonitor)) {
            return false;
        }
        final PoolHealthMonitor other = (PoolHealthMonitor) obj;

        return Objects.equal(id, other.id);
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public final String toString() {
        return MoreObjects.toStringHelper(this)
            .add("id", id)
            .toString();
    }
}

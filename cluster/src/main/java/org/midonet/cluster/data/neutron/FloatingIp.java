/*
 * Copyright (c) 2014 Midokura Europe SARL, All Rights Reserved.
 */
package org.midonet.cluster.data.neutron;

import com.google.common.base.Objects;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.UUID;

public class FloatingIp {

    public UUID id;

    @JsonProperty("floating_ip_address")
    public String floatingIpAddress;

    @JsonProperty("floating_network_id")
    public UUID floatingNetworkId;

    @JsonProperty("router_id")
    public UUID routerId;

    @JsonProperty("port_id")
    public UUID portId;

    @JsonProperty("fixed_ip_address")
    public String fixedIpAddress;

    @JsonProperty("tenant_id")
    public String tenantId;

    @Override
    public boolean equals(Object obj) {

        if (obj == this) return true;

        if (!(obj instanceof FloatingIp)) return false;
        final FloatingIp other = (FloatingIp) obj;

        return Objects.equal(id, other.id)
                && Objects.equal(floatingIpAddress, other.floatingIpAddress)
                && Objects.equal(floatingNetworkId, other.floatingNetworkId)
                && Objects.equal(tenantId, other.tenantId)
                && Objects.equal(routerId, other.routerId)
                && Objects.equal(portId, other.portId)
                && Objects.equal(fixedIpAddress, other.fixedIpAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, floatingIpAddress, floatingNetworkId,
                tenantId, routerId, portId, fixedIpAddress);
    }

    @Override
    public String toString() {

        return Objects.toStringHelper(this)
                .add("id", id)
                .add("floatingIpAddress", floatingIpAddress)
                .add("floatingNetworkId", floatingNetworkId)
                .add("tenantId", tenantId)
                .add("routerId", routerId)
                .add("portId", portId)
                .add("fixedIpAddress", fixedIpAddress).toString();
    }
}
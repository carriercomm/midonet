package org.midonet.cluster.rest_api.neutron.models;

import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;

import org.midonet.cluster.data.ZoomClass;
import org.midonet.cluster.data.ZoomField;
import org.midonet.cluster.data.ZoomObject;
import org.midonet.cluster.models.Neutron;
import org.midonet.cluster.util.IPAddressUtil;

@ZoomClass(clazz = Neutron.VpnService.class)
public class VpnService extends ZoomObject {
    @ZoomField(name = "id")
    public UUID id;

    @ZoomField(name = "name")
    public String name;

    @ZoomField(name = "description")
    public String description;

    @JsonProperty("admin_state_up")
    @ZoomField(name = "admin_state_up")
    public Boolean adminStateUp;

    @JsonProperty("tenant_id")
    @ZoomField(name = "tenant_id")
    public String tenantId;

    @JsonProperty("router_id")
    @ZoomField(name = "router_id")
    public UUID routerId;

    @JsonProperty("subnet_id")
    @ZoomField(name = "subnet_id")
    public UUID subnetId;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        VpnService that = (VpnService) o;

        return Objects.equals(id, that.id) &&
               Objects.equals(name, that.name) &&
               Objects.equals(description, that.description) &&
               Objects.equals(adminStateUp, that.adminStateUp) &&
               Objects.equals(tenantId, that.tenantId) &&
               Objects.equals(routerId, that.routerId) &&
               Objects.equals(subnetId, that.subnetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, adminStateUp, tenantId,
                            routerId, subnetId);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .omitNullValues()
            .add("id", id)
            .add("name", name)
            .add("description", description)
            .add("adminStateUp", adminStateUp)
            .add("tenantId", tenantId)
            .add("routerId", routerId)
            .add("subnetId", subnetId)
            .toString();
    }
}

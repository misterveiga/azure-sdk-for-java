/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01.implementation;

import com.microsoft.azure.management.compute.v2020_12_01.Sku;
import com.microsoft.azure.management.compute.v2020_12_01.Plan;
import com.microsoft.azure.management.compute.v2020_12_01.UpgradePolicy;
import com.microsoft.azure.management.compute.v2020_12_01.AutomaticRepairsPolicy;
import com.microsoft.azure.management.compute.v2020_12_01.VirtualMachineScaleSetVMProfile;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.compute.v2020_12_01.AdditionalCapabilities;
import com.microsoft.azure.management.compute.v2020_12_01.ScaleInPolicy;
import com.microsoft.azure.management.compute.v2020_12_01.OrchestrationMode;
import com.microsoft.azure.management.compute.v2020_12_01.VirtualMachineScaleSetIdentity;
import java.util.List;
import com.microsoft.azure.management.compute.v2020_12_01.ExtendedLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Describes a Virtual Machine Scale Set.
 */
@JsonFlatten
public class VirtualMachineScaleSetInner extends Resource {
    /**
     * The virtual machine scale set sku.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * Specifies information about the marketplace image used to create the
     * virtual machine. This element is only used for marketplace images.
     * Before you can use a marketplace image from an API, you must enable the
     * image for programmatic use.  In the Azure portal, find the marketplace
     * image that you want to use and then click **Want to deploy
     * programmatically, Get Started -&gt;**. Enter any required information
     * and then click **Save**.
     */
    @JsonProperty(value = "plan")
    private Plan plan;

    /**
     * The upgrade policy.
     */
    @JsonProperty(value = "properties.upgradePolicy")
    private UpgradePolicy upgradePolicy;

    /**
     * Policy for automatic repairs.
     */
    @JsonProperty(value = "properties.automaticRepairsPolicy")
    private AutomaticRepairsPolicy automaticRepairsPolicy;

    /**
     * The virtual machine profile.
     */
    @JsonProperty(value = "properties.virtualMachineProfile")
    private VirtualMachineScaleSetVMProfile virtualMachineProfile;

    /**
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Specifies whether the Virtual Machine Scale Set should be
     * overprovisioned.
     */
    @JsonProperty(value = "properties.overprovision")
    private Boolean overprovision;

    /**
     * When Overprovision is enabled, extensions are launched only on the
     * requested number of VMs which are finally kept. This property will hence
     * ensure that the extensions do not run on the extra overprovisioned VMs.
     */
    @JsonProperty(value = "properties.doNotRunExtensionsOnOverprovisionedVMs")
    private Boolean doNotRunExtensionsOnOverprovisionedVMs;

    /**
     * Specifies the ID which uniquely identifies a Virtual Machine Scale Set.
     */
    @JsonProperty(value = "properties.uniqueId", access = JsonProperty.Access.WRITE_ONLY)
    private String uniqueId;

    /**
     * When true this limits the scale set to a single placement group, of max
     * size 100 virtual machines. NOTE: If singlePlacementGroup is true, it may
     * be modified to false. However, if singlePlacementGroup is false, it may
     * not be modified to true.
     */
    @JsonProperty(value = "properties.singlePlacementGroup")
    private Boolean singlePlacementGroup;

    /**
     * Whether to force strictly even Virtual Machine distribution cross
     * x-zones in case there is zone outage.
     */
    @JsonProperty(value = "properties.zoneBalance")
    private Boolean zoneBalance;

    /**
     * Fault Domain count for each placement group.
     */
    @JsonProperty(value = "properties.platformFaultDomainCount")
    private Integer platformFaultDomainCount;

    /**
     * Specifies information about the proximity placement group that the
     * virtual machine scale set should be assigned to.
     * &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     */
    @JsonProperty(value = "properties.proximityPlacementGroup")
    private SubResource proximityPlacementGroup;

    /**
     * Specifies information about the dedicated host group that the virtual
     * machine scale set resides in. &lt;br&gt;&lt;br&gt;Minimum api-version:
     * 2020-06-01.
     */
    @JsonProperty(value = "properties.hostGroup")
    private SubResource hostGroup;

    /**
     * Specifies additional capabilities enabled or disabled on the Virtual
     * Machines in the Virtual Machine Scale Set. For instance: whether the
     * Virtual Machines have the capability to support attaching managed data
     * disks with UltraSSD_LRS storage account type.
     */
    @JsonProperty(value = "properties.additionalCapabilities")
    private AdditionalCapabilities additionalCapabilities;

    /**
     * Specifies the scale-in policy that decides which virtual machines are
     * chosen for removal when a Virtual Machine Scale Set is scaled-in.
     */
    @JsonProperty(value = "properties.scaleInPolicy")
    private ScaleInPolicy scaleInPolicy;

    /**
     * Specifies the orchestration mode for the virtual machine scale set.
     * Possible values include: 'Uniform', 'Flexible'.
     */
    @JsonProperty(value = "properties.orchestrationMode")
    private OrchestrationMode orchestrationMode;

    /**
     * The identity of the virtual machine scale set, if configured.
     */
    @JsonProperty(value = "identity")
    private VirtualMachineScaleSetIdentity identity;

    /**
     * The virtual machine scale set zones. NOTE: Availability zones can only
     * be set when you create the scale set.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /**
     * The extended location of the Virtual Machine Scale Set.
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /**
     * Get the virtual machine scale set sku.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the virtual machine scale set sku.
     *
     * @param sku the sku value to set
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get specifies information about the marketplace image used to create the virtual machine. This element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable the image for programmatic use.  In the Azure portal, find the marketplace image that you want to use and then click **Want to deploy programmatically, Get Started -&gt;**. Enter any required information and then click **Save**.
     *
     * @return the plan value
     */
    public Plan plan() {
        return this.plan;
    }

    /**
     * Set specifies information about the marketplace image used to create the virtual machine. This element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable the image for programmatic use.  In the Azure portal, find the marketplace image that you want to use and then click **Want to deploy programmatically, Get Started -&gt;**. Enter any required information and then click **Save**.
     *
     * @param plan the plan value to set
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withPlan(Plan plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the upgrade policy.
     *
     * @return the upgradePolicy value
     */
    public UpgradePolicy upgradePolicy() {
        return this.upgradePolicy;
    }

    /**
     * Set the upgrade policy.
     *
     * @param upgradePolicy the upgradePolicy value to set
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withUpgradePolicy(UpgradePolicy upgradePolicy) {
        this.upgradePolicy = upgradePolicy;
        return this;
    }

    /**
     * Get policy for automatic repairs.
     *
     * @return the automaticRepairsPolicy value
     */
    public AutomaticRepairsPolicy automaticRepairsPolicy() {
        return this.automaticRepairsPolicy;
    }

    /**
     * Set policy for automatic repairs.
     *
     * @param automaticRepairsPolicy the automaticRepairsPolicy value to set
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withAutomaticRepairsPolicy(AutomaticRepairsPolicy automaticRepairsPolicy) {
        this.automaticRepairsPolicy = automaticRepairsPolicy;
        return this;
    }

    /**
     * Get the virtual machine profile.
     *
     * @return the virtualMachineProfile value
     */
    public VirtualMachineScaleSetVMProfile virtualMachineProfile() {
        return this.virtualMachineProfile;
    }

    /**
     * Set the virtual machine profile.
     *
     * @param virtualMachineProfile the virtualMachineProfile value to set
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withVirtualMachineProfile(VirtualMachineScaleSetVMProfile virtualMachineProfile) {
        this.virtualMachineProfile = virtualMachineProfile;
        return this;
    }

    /**
     * Get the provisioning state, which only appears in the response.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get specifies whether the Virtual Machine Scale Set should be overprovisioned.
     *
     * @return the overprovision value
     */
    public Boolean overprovision() {
        return this.overprovision;
    }

    /**
     * Set specifies whether the Virtual Machine Scale Set should be overprovisioned.
     *
     * @param overprovision the overprovision value to set
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withOverprovision(Boolean overprovision) {
        this.overprovision = overprovision;
        return this;
    }

    /**
     * Get when Overprovision is enabled, extensions are launched only on the requested number of VMs which are finally kept. This property will hence ensure that the extensions do not run on the extra overprovisioned VMs.
     *
     * @return the doNotRunExtensionsOnOverprovisionedVMs value
     */
    public Boolean doNotRunExtensionsOnOverprovisionedVMs() {
        return this.doNotRunExtensionsOnOverprovisionedVMs;
    }

    /**
     * Set when Overprovision is enabled, extensions are launched only on the requested number of VMs which are finally kept. This property will hence ensure that the extensions do not run on the extra overprovisioned VMs.
     *
     * @param doNotRunExtensionsOnOverprovisionedVMs the doNotRunExtensionsOnOverprovisionedVMs value to set
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withDoNotRunExtensionsOnOverprovisionedVMs(Boolean doNotRunExtensionsOnOverprovisionedVMs) {
        this.doNotRunExtensionsOnOverprovisionedVMs = doNotRunExtensionsOnOverprovisionedVMs;
        return this;
    }

    /**
     * Get specifies the ID which uniquely identifies a Virtual Machine Scale Set.
     *
     * @return the uniqueId value
     */
    public String uniqueId() {
        return this.uniqueId;
    }

    /**
     * Get when true this limits the scale set to a single placement group, of max size 100 virtual machines. NOTE: If singlePlacementGroup is true, it may be modified to false. However, if singlePlacementGroup is false, it may not be modified to true.
     *
     * @return the singlePlacementGroup value
     */
    public Boolean singlePlacementGroup() {
        return this.singlePlacementGroup;
    }

    /**
     * Set when true this limits the scale set to a single placement group, of max size 100 virtual machines. NOTE: If singlePlacementGroup is true, it may be modified to false. However, if singlePlacementGroup is false, it may not be modified to true.
     *
     * @param singlePlacementGroup the singlePlacementGroup value to set
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withSinglePlacementGroup(Boolean singlePlacementGroup) {
        this.singlePlacementGroup = singlePlacementGroup;
        return this;
    }

    /**
     * Get whether to force strictly even Virtual Machine distribution cross x-zones in case there is zone outage.
     *
     * @return the zoneBalance value
     */
    public Boolean zoneBalance() {
        return this.zoneBalance;
    }

    /**
     * Set whether to force strictly even Virtual Machine distribution cross x-zones in case there is zone outage.
     *
     * @param zoneBalance the zoneBalance value to set
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withZoneBalance(Boolean zoneBalance) {
        this.zoneBalance = zoneBalance;
        return this;
    }

    /**
     * Get fault Domain count for each placement group.
     *
     * @return the platformFaultDomainCount value
     */
    public Integer platformFaultDomainCount() {
        return this.platformFaultDomainCount;
    }

    /**
     * Set fault Domain count for each placement group.
     *
     * @param platformFaultDomainCount the platformFaultDomainCount value to set
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withPlatformFaultDomainCount(Integer platformFaultDomainCount) {
        this.platformFaultDomainCount = platformFaultDomainCount;
        return this;
    }

    /**
     * Get specifies information about the proximity placement group that the virtual machine scale set should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     *
     * @return the proximityPlacementGroup value
     */
    public SubResource proximityPlacementGroup() {
        return this.proximityPlacementGroup;
    }

    /**
     * Set specifies information about the proximity placement group that the virtual machine scale set should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     *
     * @param proximityPlacementGroup the proximityPlacementGroup value to set
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withProximityPlacementGroup(SubResource proximityPlacementGroup) {
        this.proximityPlacementGroup = proximityPlacementGroup;
        return this;
    }

    /**
     * Get specifies information about the dedicated host group that the virtual machine scale set resides in. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-06-01.
     *
     * @return the hostGroup value
     */
    public SubResource hostGroup() {
        return this.hostGroup;
    }

    /**
     * Set specifies information about the dedicated host group that the virtual machine scale set resides in. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-06-01.
     *
     * @param hostGroup the hostGroup value to set
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withHostGroup(SubResource hostGroup) {
        this.hostGroup = hostGroup;
        return this;
    }

    /**
     * Get specifies additional capabilities enabled or disabled on the Virtual Machines in the Virtual Machine Scale Set. For instance: whether the Virtual Machines have the capability to support attaching managed data disks with UltraSSD_LRS storage account type.
     *
     * @return the additionalCapabilities value
     */
    public AdditionalCapabilities additionalCapabilities() {
        return this.additionalCapabilities;
    }

    /**
     * Set specifies additional capabilities enabled or disabled on the Virtual Machines in the Virtual Machine Scale Set. For instance: whether the Virtual Machines have the capability to support attaching managed data disks with UltraSSD_LRS storage account type.
     *
     * @param additionalCapabilities the additionalCapabilities value to set
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withAdditionalCapabilities(AdditionalCapabilities additionalCapabilities) {
        this.additionalCapabilities = additionalCapabilities;
        return this;
    }

    /**
     * Get specifies the scale-in policy that decides which virtual machines are chosen for removal when a Virtual Machine Scale Set is scaled-in.
     *
     * @return the scaleInPolicy value
     */
    public ScaleInPolicy scaleInPolicy() {
        return this.scaleInPolicy;
    }

    /**
     * Set specifies the scale-in policy that decides which virtual machines are chosen for removal when a Virtual Machine Scale Set is scaled-in.
     *
     * @param scaleInPolicy the scaleInPolicy value to set
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withScaleInPolicy(ScaleInPolicy scaleInPolicy) {
        this.scaleInPolicy = scaleInPolicy;
        return this;
    }

    /**
     * Get specifies the orchestration mode for the virtual machine scale set. Possible values include: 'Uniform', 'Flexible'.
     *
     * @return the orchestrationMode value
     */
    public OrchestrationMode orchestrationMode() {
        return this.orchestrationMode;
    }

    /**
     * Set specifies the orchestration mode for the virtual machine scale set. Possible values include: 'Uniform', 'Flexible'.
     *
     * @param orchestrationMode the orchestrationMode value to set
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withOrchestrationMode(OrchestrationMode orchestrationMode) {
        this.orchestrationMode = orchestrationMode;
        return this;
    }

    /**
     * Get the identity of the virtual machine scale set, if configured.
     *
     * @return the identity value
     */
    public VirtualMachineScaleSetIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity of the virtual machine scale set, if configured.
     *
     * @param identity the identity value to set
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withIdentity(VirtualMachineScaleSetIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the virtual machine scale set zones. NOTE: Availability zones can only be set when you create the scale set.
     *
     * @return the zones value
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the virtual machine scale set zones. NOTE: Availability zones can only be set when you create the scale set.
     *
     * @param zones the zones value to set
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the extended location of the Virtual Machine Scale Set.
     *
     * @return the extendedLocation value
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extended location of the Virtual Machine Scale Set.
     *
     * @param extendedLocation the extendedLocation value to set
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

}

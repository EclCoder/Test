package com.vungle.ads.internal.protos;

import com.google.protobuf.i;
import com.google.protobuf.s0;
import com.google.protobuf.t0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface e extends t0 {
    long getAdLoadType();

    String getAdSource();

    i getAdSourceBytes();

    String getAdState();

    i getAdStateBytes();

    String getAdapterAdFormat();

    i getAdapterAdFormatBytes();

    long getAppState();

    String getConnectionType();

    i getConnectionTypeBytes();

    String getConnectionTypeDetail();

    i getConnectionTypeDetailBytes();

    String getCreativeId();

    i getCreativeIdBytes();

    @Override // com.google.protobuf.t0
    /* synthetic */ s0 getDefaultInstanceForType();

    String getEventId();

    i getEventIdBytes();

    String getExperiments();

    i getExperimentsBytes();

    boolean getIsAdPodding();

    boolean getIsAdoEnabled();

    long getIsHbPlacement();

    boolean getIsLowDataModeEnabled();

    boolean getIsPartialDownloadEnabled();

    String getMake();

    i getMakeBytes();

    String getMediationName();

    i getMediationNameBytes();

    String getMeta();

    i getMetaBytes();

    String getModel();

    i getModelBytes();

    String getOs();

    i getOsBytes();

    String getOsVersion();

    i getOsVersionBytes();

    String getPlacementReferenceId();

    i getPlacementReferenceIdBytes();

    String getPlacementType();

    i getPlacementTypeBytes();

    String getSessionId();

    i getSessionIdBytes();

    Sdk$SDKMetric.b getType();

    int getTypeValue();

    long getValue();

    String getVmVersion();

    i getVmVersionBytes();

    @Override // com.google.protobuf.t0
    /* synthetic */ boolean isInitialized();
}

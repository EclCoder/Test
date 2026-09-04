package com.vungle.ads.internal.protos;

import com.google.protobuf.i;
import com.google.protobuf.s0;
import com.google.protobuf.t0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface d extends t0 {
    long getAdLoadType();

    String getAdSource();

    i getAdSourceBytes();

    String getAdState();

    i getAdStateBytes();

    String getAdapterAdFormat();

    i getAdapterAdFormatBytes();

    long getAppState();

    long getAt();

    String getConnectionType();

    i getConnectionTypeBytes();

    String getConnectionTypeDetail();

    String getConnectionTypeDetailAndroid();

    i getConnectionTypeDetailAndroidBytes();

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

    String getMessage();

    i getMessageBytes();

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

    Sdk$SDKError.b getReason();

    int getReasonValue();

    String getSessionId();

    i getSessionIdBytes();

    String getVmVersion();

    i getVmVersionBytes();

    @Override // com.google.protobuf.t0
    /* synthetic */ boolean isInitialized();
}

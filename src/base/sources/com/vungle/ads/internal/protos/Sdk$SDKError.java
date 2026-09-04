package com.vungle.ads.internal.protos;

import com.google.protobuf.a0;
import com.google.protobuf.c1;
import com.google.protobuf.i;
import com.google.protobuf.j;
import com.google.protobuf.p;
import com.google.protobuf.y;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Sdk$SDKError extends y implements d {
    public static final int ADAPTERADFORMAT_FIELD_NUMBER = 26;
    public static final int ADLOADTYPE_FIELD_NUMBER = 25;
    public static final int ADSOURCE_FIELD_NUMBER = 16;
    public static final int ADSTATE_FIELD_NUMBER = 23;
    public static final int APPSTATE_FIELD_NUMBER = 17;
    public static final int AT_FIELD_NUMBER = 1;
    public static final int CONNECTIONTYPEDETAILANDROID_FIELD_NUMBER = 101;
    public static final int CONNECTIONTYPEDETAIL_FIELD_NUMBER = 10;
    public static final int CONNECTIONTYPE_FIELD_NUMBER = 9;
    public static final int CREATIVEID_FIELD_NUMBER = 12;
    private static final Sdk$SDKError DEFAULT_INSTANCE;
    public static final int EVENTID_FIELD_NUMBER = 4;
    public static final int EXPERIMENTS_FIELD_NUMBER = 24;
    public static final int ISADOENABLED_FIELD_NUMBER = 20;
    public static final int ISADPODDING_FIELD_NUMBER = 22;
    public static final int ISHBPLACEMENT_FIELD_NUMBER = 14;
    public static final int ISLOWDATAMODEENABLED_FIELD_NUMBER = 201;
    public static final int ISPARTIALDOWNLOADENABLED_FIELD_NUMBER = 21;
    public static final int MAKE_FIELD_NUMBER = 5;
    public static final int MEDIATIONNAME_FIELD_NUMBER = 18;
    public static final int MESSAGE_FIELD_NUMBER = 3;
    public static final int MODEL_FIELD_NUMBER = 6;
    public static final int OSVERSION_FIELD_NUMBER = 8;
    public static final int OS_FIELD_NUMBER = 7;
    private static volatile c1 PARSER = null;
    public static final int PLACEMENTREFERENCEID_FIELD_NUMBER = 11;
    public static final int PLACEMENTTYPE_FIELD_NUMBER = 15;
    public static final int REASON_FIELD_NUMBER = 2;
    public static final int SESSIONID_FIELD_NUMBER = 13;
    public static final int VMVERSION_FIELD_NUMBER = 19;
    private long adLoadType_;
    private long appState_;
    private long at_;
    private boolean isAdPodding_;
    private boolean isAdoEnabled_;
    private long isHbPlacement_;
    private boolean isLowDataModeEnabled_;
    private boolean isPartialDownloadEnabled_;
    private int reason_;
    private String message_ = "";
    private String eventId_ = "";
    private String make_ = "";
    private String model_ = "";
    private String os_ = "";
    private String osVersion_ = "";
    private String connectionType_ = "";
    private String connectionTypeDetail_ = "";
    private String placementReferenceId_ = "";
    private String creativeId_ = "";
    private String sessionId_ = "";
    private String placementType_ = "";
    private String adSource_ = "";
    private String mediationName_ = "";
    private String vmVersion_ = "";
    private String adState_ = "";
    private String experiments_ = "";
    private String adapterAdFormat_ = "";
    private String connectionTypeDetailAndroid_ = "";

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends y.b implements d {
        /* synthetic */ a(com.vungle.ads.internal.protos.a aVar) {
            this();
        }

        public a clearAdLoadType() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearAdLoadType();
            return this;
        }

        public a clearAdSource() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearAdSource();
            return this;
        }

        public a clearAdState() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearAdState();
            return this;
        }

        public a clearAdapterAdFormat() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearAdapterAdFormat();
            return this;
        }

        public a clearAppState() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearAppState();
            return this;
        }

        public a clearAt() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearAt();
            return this;
        }

        public a clearConnectionType() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearConnectionType();
            return this;
        }

        public a clearConnectionTypeDetail() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearConnectionTypeDetail();
            return this;
        }

        public a clearConnectionTypeDetailAndroid() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearConnectionTypeDetailAndroid();
            return this;
        }

        public a clearCreativeId() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearCreativeId();
            return this;
        }

        public a clearEventId() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearEventId();
            return this;
        }

        public a clearExperiments() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearExperiments();
            return this;
        }

        public a clearIsAdPodding() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearIsAdPodding();
            return this;
        }

        public a clearIsAdoEnabled() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearIsAdoEnabled();
            return this;
        }

        public a clearIsHbPlacement() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearIsHbPlacement();
            return this;
        }

        public a clearIsLowDataModeEnabled() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearIsLowDataModeEnabled();
            return this;
        }

        public a clearIsPartialDownloadEnabled() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearIsPartialDownloadEnabled();
            return this;
        }

        public a clearMake() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearMake();
            return this;
        }

        public a clearMediationName() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearMediationName();
            return this;
        }

        public a clearMessage() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearMessage();
            return this;
        }

        public a clearModel() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearModel();
            return this;
        }

        public a clearOs() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearOs();
            return this;
        }

        public a clearOsVersion() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearOsVersion();
            return this;
        }

        public a clearPlacementReferenceId() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearPlacementReferenceId();
            return this;
        }

        public a clearPlacementType() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearPlacementType();
            return this;
        }

        public a clearReason() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearReason();
            return this;
        }

        public a clearSessionId() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearSessionId();
            return this;
        }

        public a clearVmVersion() {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).clearVmVersion();
            return this;
        }

        @Override // com.vungle.ads.internal.protos.d
        public long getAdLoadType() {
            return ((Sdk$SDKError) this.instance).getAdLoadType();
        }

        @Override // com.vungle.ads.internal.protos.d
        public String getAdSource() {
            return ((Sdk$SDKError) this.instance).getAdSource();
        }

        @Override // com.vungle.ads.internal.protos.d
        public i getAdSourceBytes() {
            return ((Sdk$SDKError) this.instance).getAdSourceBytes();
        }

        @Override // com.vungle.ads.internal.protos.d
        public String getAdState() {
            return ((Sdk$SDKError) this.instance).getAdState();
        }

        @Override // com.vungle.ads.internal.protos.d
        public i getAdStateBytes() {
            return ((Sdk$SDKError) this.instance).getAdStateBytes();
        }

        @Override // com.vungle.ads.internal.protos.d
        public String getAdapterAdFormat() {
            return ((Sdk$SDKError) this.instance).getAdapterAdFormat();
        }

        @Override // com.vungle.ads.internal.protos.d
        public i getAdapterAdFormatBytes() {
            return ((Sdk$SDKError) this.instance).getAdapterAdFormatBytes();
        }

        @Override // com.vungle.ads.internal.protos.d
        public long getAppState() {
            return ((Sdk$SDKError) this.instance).getAppState();
        }

        @Override // com.vungle.ads.internal.protos.d
        public long getAt() {
            return ((Sdk$SDKError) this.instance).getAt();
        }

        @Override // com.vungle.ads.internal.protos.d
        public String getConnectionType() {
            return ((Sdk$SDKError) this.instance).getConnectionType();
        }

        @Override // com.vungle.ads.internal.protos.d
        public i getConnectionTypeBytes() {
            return ((Sdk$SDKError) this.instance).getConnectionTypeBytes();
        }

        @Override // com.vungle.ads.internal.protos.d
        public String getConnectionTypeDetail() {
            return ((Sdk$SDKError) this.instance).getConnectionTypeDetail();
        }

        @Override // com.vungle.ads.internal.protos.d
        public String getConnectionTypeDetailAndroid() {
            return ((Sdk$SDKError) this.instance).getConnectionTypeDetailAndroid();
        }

        @Override // com.vungle.ads.internal.protos.d
        public i getConnectionTypeDetailAndroidBytes() {
            return ((Sdk$SDKError) this.instance).getConnectionTypeDetailAndroidBytes();
        }

        @Override // com.vungle.ads.internal.protos.d
        public i getConnectionTypeDetailBytes() {
            return ((Sdk$SDKError) this.instance).getConnectionTypeDetailBytes();
        }

        @Override // com.vungle.ads.internal.protos.d
        public String getCreativeId() {
            return ((Sdk$SDKError) this.instance).getCreativeId();
        }

        @Override // com.vungle.ads.internal.protos.d
        public i getCreativeIdBytes() {
            return ((Sdk$SDKError) this.instance).getCreativeIdBytes();
        }

        @Override // com.vungle.ads.internal.protos.d
        public String getEventId() {
            return ((Sdk$SDKError) this.instance).getEventId();
        }

        @Override // com.vungle.ads.internal.protos.d
        public i getEventIdBytes() {
            return ((Sdk$SDKError) this.instance).getEventIdBytes();
        }

        @Override // com.vungle.ads.internal.protos.d
        public String getExperiments() {
            return ((Sdk$SDKError) this.instance).getExperiments();
        }

        @Override // com.vungle.ads.internal.protos.d
        public i getExperimentsBytes() {
            return ((Sdk$SDKError) this.instance).getExperimentsBytes();
        }

        @Override // com.vungle.ads.internal.protos.d
        public boolean getIsAdPodding() {
            return ((Sdk$SDKError) this.instance).getIsAdPodding();
        }

        @Override // com.vungle.ads.internal.protos.d
        public boolean getIsAdoEnabled() {
            return ((Sdk$SDKError) this.instance).getIsAdoEnabled();
        }

        @Override // com.vungle.ads.internal.protos.d
        public long getIsHbPlacement() {
            return ((Sdk$SDKError) this.instance).getIsHbPlacement();
        }

        @Override // com.vungle.ads.internal.protos.d
        public boolean getIsLowDataModeEnabled() {
            return ((Sdk$SDKError) this.instance).getIsLowDataModeEnabled();
        }

        @Override // com.vungle.ads.internal.protos.d
        public boolean getIsPartialDownloadEnabled() {
            return ((Sdk$SDKError) this.instance).getIsPartialDownloadEnabled();
        }

        @Override // com.vungle.ads.internal.protos.d
        public String getMake() {
            return ((Sdk$SDKError) this.instance).getMake();
        }

        @Override // com.vungle.ads.internal.protos.d
        public i getMakeBytes() {
            return ((Sdk$SDKError) this.instance).getMakeBytes();
        }

        @Override // com.vungle.ads.internal.protos.d
        public String getMediationName() {
            return ((Sdk$SDKError) this.instance).getMediationName();
        }

        @Override // com.vungle.ads.internal.protos.d
        public i getMediationNameBytes() {
            return ((Sdk$SDKError) this.instance).getMediationNameBytes();
        }

        @Override // com.vungle.ads.internal.protos.d
        public String getMessage() {
            return ((Sdk$SDKError) this.instance).getMessage();
        }

        @Override // com.vungle.ads.internal.protos.d
        public i getMessageBytes() {
            return ((Sdk$SDKError) this.instance).getMessageBytes();
        }

        @Override // com.vungle.ads.internal.protos.d
        public String getModel() {
            return ((Sdk$SDKError) this.instance).getModel();
        }

        @Override // com.vungle.ads.internal.protos.d
        public i getModelBytes() {
            return ((Sdk$SDKError) this.instance).getModelBytes();
        }

        @Override // com.vungle.ads.internal.protos.d
        public String getOs() {
            return ((Sdk$SDKError) this.instance).getOs();
        }

        @Override // com.vungle.ads.internal.protos.d
        public i getOsBytes() {
            return ((Sdk$SDKError) this.instance).getOsBytes();
        }

        @Override // com.vungle.ads.internal.protos.d
        public String getOsVersion() {
            return ((Sdk$SDKError) this.instance).getOsVersion();
        }

        @Override // com.vungle.ads.internal.protos.d
        public i getOsVersionBytes() {
            return ((Sdk$SDKError) this.instance).getOsVersionBytes();
        }

        @Override // com.vungle.ads.internal.protos.d
        public String getPlacementReferenceId() {
            return ((Sdk$SDKError) this.instance).getPlacementReferenceId();
        }

        @Override // com.vungle.ads.internal.protos.d
        public i getPlacementReferenceIdBytes() {
            return ((Sdk$SDKError) this.instance).getPlacementReferenceIdBytes();
        }

        @Override // com.vungle.ads.internal.protos.d
        public String getPlacementType() {
            return ((Sdk$SDKError) this.instance).getPlacementType();
        }

        @Override // com.vungle.ads.internal.protos.d
        public i getPlacementTypeBytes() {
            return ((Sdk$SDKError) this.instance).getPlacementTypeBytes();
        }

        @Override // com.vungle.ads.internal.protos.d
        public b getReason() {
            return ((Sdk$SDKError) this.instance).getReason();
        }

        @Override // com.vungle.ads.internal.protos.d
        public int getReasonValue() {
            return ((Sdk$SDKError) this.instance).getReasonValue();
        }

        @Override // com.vungle.ads.internal.protos.d
        public String getSessionId() {
            return ((Sdk$SDKError) this.instance).getSessionId();
        }

        @Override // com.vungle.ads.internal.protos.d
        public i getSessionIdBytes() {
            return ((Sdk$SDKError) this.instance).getSessionIdBytes();
        }

        @Override // com.vungle.ads.internal.protos.d
        public String getVmVersion() {
            return ((Sdk$SDKError) this.instance).getVmVersion();
        }

        @Override // com.vungle.ads.internal.protos.d
        public i getVmVersionBytes() {
            return ((Sdk$SDKError) this.instance).getVmVersionBytes();
        }

        public a setAdLoadType(long j10) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setAdLoadType(j10);
            return this;
        }

        public a setAdSource(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setAdSource(str);
            return this;
        }

        public a setAdSourceBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setAdSourceBytes(iVar);
            return this;
        }

        public a setAdState(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setAdState(str);
            return this;
        }

        public a setAdStateBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setAdStateBytes(iVar);
            return this;
        }

        public a setAdapterAdFormat(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setAdapterAdFormat(str);
            return this;
        }

        public a setAdapterAdFormatBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setAdapterAdFormatBytes(iVar);
            return this;
        }

        public a setAppState(long j10) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setAppState(j10);
            return this;
        }

        public a setAt(long j10) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setAt(j10);
            return this;
        }

        public a setConnectionType(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setConnectionType(str);
            return this;
        }

        public a setConnectionTypeBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setConnectionTypeBytes(iVar);
            return this;
        }

        public a setConnectionTypeDetail(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setConnectionTypeDetail(str);
            return this;
        }

        public a setConnectionTypeDetailAndroid(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setConnectionTypeDetailAndroid(str);
            return this;
        }

        public a setConnectionTypeDetailAndroidBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setConnectionTypeDetailAndroidBytes(iVar);
            return this;
        }

        public a setConnectionTypeDetailBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setConnectionTypeDetailBytes(iVar);
            return this;
        }

        public a setCreativeId(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setCreativeId(str);
            return this;
        }

        public a setCreativeIdBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setCreativeIdBytes(iVar);
            return this;
        }

        public a setEventId(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setEventId(str);
            return this;
        }

        public a setEventIdBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setEventIdBytes(iVar);
            return this;
        }

        public a setExperiments(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setExperiments(str);
            return this;
        }

        public a setExperimentsBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setExperimentsBytes(iVar);
            return this;
        }

        public a setIsAdPodding(boolean z10) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setIsAdPodding(z10);
            return this;
        }

        public a setIsAdoEnabled(boolean z10) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setIsAdoEnabled(z10);
            return this;
        }

        public a setIsHbPlacement(long j10) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setIsHbPlacement(j10);
            return this;
        }

        public a setIsLowDataModeEnabled(boolean z10) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setIsLowDataModeEnabled(z10);
            return this;
        }

        public a setIsPartialDownloadEnabled(boolean z10) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setIsPartialDownloadEnabled(z10);
            return this;
        }

        public a setMake(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setMake(str);
            return this;
        }

        public a setMakeBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setMakeBytes(iVar);
            return this;
        }

        public a setMediationName(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setMediationName(str);
            return this;
        }

        public a setMediationNameBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setMediationNameBytes(iVar);
            return this;
        }

        public a setMessage(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setMessage(str);
            return this;
        }

        public a setMessageBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setMessageBytes(iVar);
            return this;
        }

        public a setModel(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setModel(str);
            return this;
        }

        public a setModelBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setModelBytes(iVar);
            return this;
        }

        public a setOs(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setOs(str);
            return this;
        }

        public a setOsBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setOsBytes(iVar);
            return this;
        }

        public a setOsVersion(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setOsVersion(str);
            return this;
        }

        public a setOsVersionBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setOsVersionBytes(iVar);
            return this;
        }

        public a setPlacementReferenceId(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setPlacementReferenceId(str);
            return this;
        }

        public a setPlacementReferenceIdBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setPlacementReferenceIdBytes(iVar);
            return this;
        }

        public a setPlacementType(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setPlacementType(str);
            return this;
        }

        public a setPlacementTypeBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setPlacementTypeBytes(iVar);
            return this;
        }

        public a setReason(b bVar) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setReason(bVar);
            return this;
        }

        public a setReasonValue(int i10) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setReasonValue(i10);
            return this;
        }

        public a setSessionId(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setSessionId(str);
            return this;
        }

        public a setSessionIdBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setSessionIdBytes(iVar);
            return this;
        }

        public a setVmVersion(String str) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setVmVersion(str);
            return this;
        }

        public a setVmVersionBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKError) this.instance).setVmVersionBytes(iVar);
            return this;
        }

        private a() {
            super(Sdk$SDKError.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    public enum b implements a0.c {
        UNKNOWN_ERROR(0),
        INVALID_APP_ID(2),
        CURRENTLY_INITIALIZING(3),
        ALREADY_INITIALIZED(4),
        SDK_NOT_INITIALIZED(6),
        USER_AGENT_ERROR(7),
        API_REQUEST_ERROR(101),
        API_RESPONSE_DATA_ERROR(102),
        API_RESPONSE_DECODE_ERROR(103),
        API_FAILED_STATUS_CODE(104),
        INVALID_TEMPLATE_URL(105),
        INVALID_REQUEST_BUILDER_ERROR(106),
        TEMPLATE_UNZIP_ERROR(109),
        INVALID_CTA_URL(110),
        INVALID_ASSET_URL(111),
        ASSET_REQUEST_ERROR(ASSET_REQUEST_ERROR_VALUE),
        ASSET_RESPONSE_DATA_ERROR(ASSET_RESPONSE_DATA_ERROR_VALUE),
        ASSET_WRITE_ERROR(ASSET_WRITE_ERROR_VALUE),
        INVALID_INDEX_URL(INVALID_INDEX_URL_VALUE),
        GZIP_ENCODE_ERROR(GZIP_ENCODE_ERROR_VALUE),
        ASSET_FAILED_STATUS_CODE(ASSET_FAILED_STATUS_CODE_VALUE),
        PROTOBUF_SERIALIZATION_ERROR(PROTOBUF_SERIALIZATION_ERROR_VALUE),
        JSON_ENCODE_ERROR(JSON_ENCODE_ERROR_VALUE),
        TPAT_ERROR(TPAT_ERROR_VALUE),
        INVALID_ADS_ENDPOINT(INVALID_ADS_ENDPOINT_VALUE),
        INVALID_RI_ENDPOINT(INVALID_RI_ENDPOINT_VALUE),
        INVALID_LOG_ERROR_ENDPOINT(INVALID_LOG_ERROR_ENDPOINT_VALUE),
        INVALID_METRICS_ENDPOINT(INVALID_METRICS_ENDPOINT_VALUE),
        ASSET_FAILED_INSUFFICIENT_SPACE(ASSET_FAILED_INSUFFICIENT_SPACE_VALUE),
        ASSET_FAILED_MAX_SPACE_EXCEEDED(ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE),
        INVALID_TPAT_KEY(128),
        EMPTY_TPAT_ERROR(129),
        MRAID_DOWNLOAD_JS_ERROR(130),
        MRAID_JS_WRITE_FAILED(MRAID_JS_WRITE_FAILED_VALUE),
        OMSDK_DOWNLOAD_JS_ERROR(OMSDK_DOWNLOAD_JS_ERROR_VALUE),
        OMSDK_JS_WRITE_FAILED(OMSDK_JS_WRITE_FAILED_VALUE),
        STORE_REGION_CODE_ERROR(134),
        INVALID_CONFIG_RESPONSE(135),
        PRIVACY_URL_ERROR(PRIVACY_URL_ERROR_VALUE),
        TPAT_RETRY_FAILED(TPAT_RETRY_FAILED_VALUE),
        CONFIG_REFRESH_FAILED(138),
        INVALID_EVENT_ID_ERROR(200),
        INVALID_PLACEMENT_ID(201),
        AD_CONSUMED(202),
        AD_IS_LOADING(AD_IS_LOADING_VALUE),
        AD_ALREADY_LOADED(204),
        AD_IS_PLAYING(AD_IS_PLAYING_VALUE),
        AD_ALREADY_FAILED(AD_ALREADY_FAILED_VALUE),
        PLACEMENT_AD_TYPE_MISMATCH(PLACEMENT_AD_TYPE_MISMATCH_VALUE),
        INVALID_BID_PAYLOAD(INVALID_BID_PAYLOAD_VALUE),
        INVALID_JSON_BID_PAYLOAD(INVALID_JSON_BID_PAYLOAD_VALUE),
        AD_NOT_LOADED(AD_NOT_LOADED_VALUE),
        PLACEMENT_SLEEP(PLACEMENT_SLEEP_VALUE),
        INVALID_ADUNIT_BID_PAYLOAD(INVALID_ADUNIT_BID_PAYLOAD_VALUE),
        INVALID_GZIP_BID_PAYLOAD(INVALID_GZIP_BID_PAYLOAD_VALUE),
        AD_RESPONSE_EMPTY(AD_RESPONSE_EMPTY_VALUE),
        AD_RESPONSE_INVALID_TEMPLATE_TYPE(AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE),
        AD_RESPONSE_TIMED_OUT(AD_RESPONSE_TIMED_OUT_VALUE),
        MRAID_JS_DOES_NOT_EXIST(MRAID_JS_DOES_NOT_EXIST_VALUE),
        MRAID_JS_COPY_FAILED(MRAID_JS_COPY_FAILED_VALUE),
        AD_RESPONSE_RETRY_AFTER(AD_RESPONSE_RETRY_AFTER_VALUE),
        AD_LOAD_FAIL_RETRY_AFTER(AD_LOAD_FAIL_RETRY_AFTER_VALUE),
        INVALID_WATERFALL_PLACEMENT_ID(INVALID_WATERFALL_PLACEMENT_ID_VALUE),
        STALE_CACHED_RESPONSE(STALE_CACHED_RESPONSE_VALUE),
        AD_LOAD_FAIL_EMPTY_BID_PAYLOAD(224),
        AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH(AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE),
        PRIVACY_ICON_FALLBACK_ERROR(PRIVACY_ICON_FALLBACK_ERROR_VALUE),
        INVALID_CSB_DATA(INVALID_CSB_DATA_VALUE),
        MRAID_ERROR(301),
        INVALID_IFA_STATUS(302),
        AD_EXPIRED(304),
        MRAID_BRIDGE_ERROR(MRAID_BRIDGE_ERROR_VALUE),
        AD_EXPIRED_ON_PLAY(307),
        AD_WIN_NOTIFICATION_ERROR(AD_WIN_NOTIFICATION_ERROR_VALUE),
        ASSET_FAILED_TO_DELETE(ASSET_FAILED_TO_DELETE_VALUE),
        AD_HTML_FAILED_TO_LOAD(AD_HTML_FAILED_TO_LOAD_VALUE),
        MRAID_JS_CALL_EMPTY(MRAID_JS_CALL_EMPTY_VALUE),
        DEEPLINK_OPEN_FAILED(DEEPLINK_OPEN_FAILED_VALUE),
        EVALUATE_JAVASCRIPT_FAILED(EVALUATE_JAVASCRIPT_FAILED_VALUE),
        LINK_COMMAND_OPEN_FAILED(LINK_COMMAND_OPEN_FAILED_VALUE),
        JSON_PARAMS_ENCODE_ERROR(JSON_PARAMS_ENCODE_ERROR_VALUE),
        GENERATE_JSON_DATA_ERROR(GENERATE_JSON_DATA_ERROR_VALUE),
        AD_CLOSED_TEMPLATE_ERROR(AD_CLOSED_TEMPLATE_ERROR_VALUE),
        AD_CLOSED_MISSING_HEARTBEAT(AD_CLOSED_MISSING_HEARTBEAT_VALUE),
        SILENT_MODE_MONITOR_ERROR(SILENT_MODE_MONITOR_ERROR_VALUE),
        WEBVIEW_ERROR(WEBVIEW_ERROR_VALUE),
        BLACK_SCREEN_DETECTION_ERROR(BLACK_SCREEN_DETECTION_ERROR_VALUE),
        MRAID_UNRECOGNIZED_COMMAND(MRAID_UNRECOGNIZED_COMMAND_VALUE),
        CONCURRENT_PLAYBACK_UNSUPPORTED(400),
        BANNER_VIEW_INVALID_SIZE(500),
        NATIVE_ASSET_ERROR(NATIVE_ASSET_ERROR_VALUE),
        NATIVE_VIDEO_PLAYBACK_ERROR(NATIVE_VIDEO_PLAYBACK_ERROR_VALUE),
        WEB_VIEW_WEB_CONTENT_PROCESS_DID_TERMINATE(2000),
        WEB_VIEW_FAILED_NAVIGATION(2001),
        STORE_KIT_LOAD_ERROR(2002),
        OMSDK_COPY_ERROR(2003),
        STORE_OVERLAY_LOAD_ERROR(2004),
        REACHABILITY_INITIALIZATION_FAILED(2005),
        UNKNOWN_RADIO_ACCESS_TECHNOLOGY(2006),
        STORE_KIT_PRESENTATION_ERROR(2007),
        STORE_OVERLAY_PRESENTATION_ERROR(2008),
        INVALID_PLAY_PARAMETER(2009),
        STORE_OVERLAY_DISMISSAL_ERROR(2010),
        PRESENTER_DEALLOCATED_BEFORE_LOAD_COMPLETION(2011),
        APP_IMPRESSION_CREATION_FAILED(2012),
        HANDLE_TAP_FAILED(2013),
        HAPTIC_ENGINE_ERROR(HAPTIC_ENGINE_ERROR_VALUE),
        OUT_OF_MEMORY(3001),
        INLINE_INSTALL_ERROR(3002),
        VUNGLE_OIT_CREATION_ERROR(4000),
        MEDIATION_ERROR(5000),
        AD_NO_FILL(10001),
        AD_LOAD_TOO_FREQUENTLY(AD_LOAD_TOO_FREQUENTLY_VALUE),
        AD_SERVER_ERROR(AD_SERVER_ERROR_VALUE),
        AD_PUBLISHER_MISMATCH(AD_PUBLISHER_MISMATCH_VALUE),
        AD_INTERNAL_INTEGRATION_ERROR(AD_INTERNAL_INTEGRATION_ERROR_VALUE),
        CONFIG_NOT_FOUND_ERROR(CONFIG_NOT_FOUND_ERROR_VALUE),
        UNRECOGNIZED(-1);

        public static final int AD_ALREADY_FAILED_VALUE = 206;
        public static final int AD_ALREADY_LOADED_VALUE = 204;

        @Deprecated
        public static final int AD_CLOSED_MISSING_HEARTBEAT_VALUE = 318;
        public static final int AD_CLOSED_TEMPLATE_ERROR_VALUE = 317;
        public static final int AD_CONSUMED_VALUE = 202;
        public static final int AD_EXPIRED_ON_PLAY_VALUE = 307;
        public static final int AD_EXPIRED_VALUE = 304;
        public static final int AD_HTML_FAILED_TO_LOAD_VALUE = 310;
        public static final int AD_INTERNAL_INTEGRATION_ERROR_VALUE = 30002;
        public static final int AD_IS_LOADING_VALUE = 203;
        public static final int AD_IS_PLAYING_VALUE = 205;
        public static final int AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE = 224;
        public static final int AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE = 225;
        public static final int AD_LOAD_FAIL_RETRY_AFTER_VALUE = 221;
        public static final int AD_LOAD_TOO_FREQUENTLY_VALUE = 10002;
        public static final int AD_NOT_LOADED_VALUE = 210;
        public static final int AD_NO_FILL_VALUE = 10001;
        public static final int AD_PUBLISHER_MISMATCH_VALUE = 30001;
        public static final int AD_RESPONSE_EMPTY_VALUE = 215;
        public static final int AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE = 216;
        public static final int AD_RESPONSE_RETRY_AFTER_VALUE = 220;
        public static final int AD_RESPONSE_TIMED_OUT_VALUE = 217;
        public static final int AD_SERVER_ERROR_VALUE = 20001;

        @Deprecated
        public static final int AD_WIN_NOTIFICATION_ERROR_VALUE = 308;

        @Deprecated
        public static final int ALREADY_INITIALIZED_VALUE = 4;
        public static final int API_FAILED_STATUS_CODE_VALUE = 104;
        public static final int API_REQUEST_ERROR_VALUE = 101;
        public static final int API_RESPONSE_DATA_ERROR_VALUE = 102;
        public static final int API_RESPONSE_DECODE_ERROR_VALUE = 103;
        public static final int APP_IMPRESSION_CREATION_FAILED_VALUE = 2012;
        public static final int ASSET_FAILED_INSUFFICIENT_SPACE_VALUE = 126;

        @Deprecated
        public static final int ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE = 127;

        @Deprecated
        public static final int ASSET_FAILED_STATUS_CODE_VALUE = 117;
        public static final int ASSET_FAILED_TO_DELETE_VALUE = 309;
        public static final int ASSET_REQUEST_ERROR_VALUE = 112;

        @Deprecated
        public static final int ASSET_RESPONSE_DATA_ERROR_VALUE = 113;
        public static final int ASSET_WRITE_ERROR_VALUE = 114;
        public static final int BANNER_VIEW_INVALID_SIZE_VALUE = 500;
        public static final int BLACK_SCREEN_DETECTION_ERROR_VALUE = 321;
        public static final int CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE = 400;
        public static final int CONFIG_NOT_FOUND_ERROR_VALUE = 30003;
        public static final int CONFIG_REFRESH_FAILED_VALUE = 138;

        @Deprecated
        public static final int CURRENTLY_INITIALIZING_VALUE = 3;
        public static final int DEEPLINK_OPEN_FAILED_VALUE = 312;
        public static final int EMPTY_TPAT_ERROR_VALUE = 129;
        public static final int EVALUATE_JAVASCRIPT_FAILED_VALUE = 313;
        public static final int GENERATE_JSON_DATA_ERROR_VALUE = 316;
        public static final int GZIP_ENCODE_ERROR_VALUE = 116;
        public static final int HANDLE_TAP_FAILED_VALUE = 2013;
        public static final int HAPTIC_ENGINE_ERROR_VALUE = 2014;
        public static final int INLINE_INSTALL_ERROR_VALUE = 3002;
        public static final int INVALID_ADS_ENDPOINT_VALUE = 122;
        public static final int INVALID_ADUNIT_BID_PAYLOAD_VALUE = 213;
        public static final int INVALID_APP_ID_VALUE = 2;
        public static final int INVALID_ASSET_URL_VALUE = 111;
        public static final int INVALID_BID_PAYLOAD_VALUE = 208;
        public static final int INVALID_CONFIG_RESPONSE_VALUE = 135;
        public static final int INVALID_CSB_DATA_VALUE = 227;
        public static final int INVALID_CTA_URL_VALUE = 110;
        public static final int INVALID_EVENT_ID_ERROR_VALUE = 200;
        public static final int INVALID_GZIP_BID_PAYLOAD_VALUE = 214;
        public static final int INVALID_IFA_STATUS_VALUE = 302;
        public static final int INVALID_INDEX_URL_VALUE = 115;
        public static final int INVALID_JSON_BID_PAYLOAD_VALUE = 209;
        public static final int INVALID_LOG_ERROR_ENDPOINT_VALUE = 124;
        public static final int INVALID_METRICS_ENDPOINT_VALUE = 125;
        public static final int INVALID_PLACEMENT_ID_VALUE = 201;
        public static final int INVALID_PLAY_PARAMETER_VALUE = 2009;
        public static final int INVALID_REQUEST_BUILDER_ERROR_VALUE = 106;
        public static final int INVALID_RI_ENDPOINT_VALUE = 123;
        public static final int INVALID_TEMPLATE_URL_VALUE = 105;
        public static final int INVALID_TPAT_KEY_VALUE = 128;

        @Deprecated
        public static final int INVALID_WATERFALL_PLACEMENT_ID_VALUE = 222;
        public static final int JSON_ENCODE_ERROR_VALUE = 119;
        public static final int JSON_PARAMS_ENCODE_ERROR_VALUE = 315;
        public static final int LINK_COMMAND_OPEN_FAILED_VALUE = 314;
        public static final int MEDIATION_ERROR_VALUE = 5000;
        public static final int MRAID_BRIDGE_ERROR_VALUE = 305;
        public static final int MRAID_DOWNLOAD_JS_ERROR_VALUE = 130;
        public static final int MRAID_ERROR_VALUE = 301;
        public static final int MRAID_JS_CALL_EMPTY_VALUE = 311;
        public static final int MRAID_JS_COPY_FAILED_VALUE = 219;
        public static final int MRAID_JS_DOES_NOT_EXIST_VALUE = 218;
        public static final int MRAID_JS_WRITE_FAILED_VALUE = 131;
        public static final int MRAID_UNRECOGNIZED_COMMAND_VALUE = 322;
        public static final int NATIVE_ASSET_ERROR_VALUE = 600;
        public static final int NATIVE_VIDEO_PLAYBACK_ERROR_VALUE = 601;
        public static final int OMSDK_COPY_ERROR_VALUE = 2003;
        public static final int OMSDK_DOWNLOAD_JS_ERROR_VALUE = 132;
        public static final int OMSDK_JS_WRITE_FAILED_VALUE = 133;
        public static final int OUT_OF_MEMORY_VALUE = 3001;
        public static final int PLACEMENT_AD_TYPE_MISMATCH_VALUE = 207;
        public static final int PLACEMENT_SLEEP_VALUE = 212;
        public static final int PRESENTER_DEALLOCATED_BEFORE_LOAD_COMPLETION_VALUE = 2011;
        public static final int PRIVACY_ICON_FALLBACK_ERROR_VALUE = 226;
        public static final int PRIVACY_URL_ERROR_VALUE = 136;
        public static final int PROTOBUF_SERIALIZATION_ERROR_VALUE = 118;
        public static final int REACHABILITY_INITIALIZATION_FAILED_VALUE = 2005;
        public static final int SDK_NOT_INITIALIZED_VALUE = 6;
        public static final int SILENT_MODE_MONITOR_ERROR_VALUE = 319;
        public static final int STALE_CACHED_RESPONSE_VALUE = 223;
        public static final int STORE_KIT_LOAD_ERROR_VALUE = 2002;
        public static final int STORE_KIT_PRESENTATION_ERROR_VALUE = 2007;
        public static final int STORE_OVERLAY_DISMISSAL_ERROR_VALUE = 2010;
        public static final int STORE_OVERLAY_LOAD_ERROR_VALUE = 2004;
        public static final int STORE_OVERLAY_PRESENTATION_ERROR_VALUE = 2008;
        public static final int STORE_REGION_CODE_ERROR_VALUE = 134;
        public static final int TEMPLATE_UNZIP_ERROR_VALUE = 109;
        public static final int TPAT_ERROR_VALUE = 121;
        public static final int TPAT_RETRY_FAILED_VALUE = 137;
        public static final int UNKNOWN_ERROR_VALUE = 0;
        public static final int UNKNOWN_RADIO_ACCESS_TECHNOLOGY_VALUE = 2006;
        public static final int USER_AGENT_ERROR_VALUE = 7;
        public static final int VUNGLE_OIT_CREATION_ERROR_VALUE = 4000;
        public static final int WEBVIEW_ERROR_VALUE = 320;
        public static final int WEB_VIEW_FAILED_NAVIGATION_VALUE = 2001;
        public static final int WEB_VIEW_WEB_CONTENT_PROCESS_DID_TERMINATE_VALUE = 2000;
        private static final a0.d internalValueMap = new a();
        private final int value;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        /* JADX INFO: loaded from: classes6.dex */
        class a implements a0.d {
            a() {
            }

            @Override // com.google.protobuf.a0.d
            public b findValueByNumber(int i10) {
                return b.forNumber(i10);
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.protos.Sdk$SDKError$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        /* JADX INFO: loaded from: classes6.dex */
        private static final class C0528b implements a0.e {
            static final a0.e INSTANCE = new C0528b();

            private C0528b() {
            }

            @Override // com.google.protobuf.a0.e
            public boolean isInRange(int i10) {
                return b.forNumber(i10) != null;
            }
        }

        b(int i10) {
            this.value = i10;
        }

        public static b forNumber(int i10) {
            if (i10 != 0) {
                if (i10 == 2) {
                    return INVALID_APP_ID;
                }
                if (i10 == 3) {
                    return CURRENTLY_INITIALIZING;
                }
                if (i10 == 4) {
                    return ALREADY_INITIALIZED;
                }
                if (i10 == 6) {
                    return SDK_NOT_INITIALIZED;
                }
                if (i10 == 7) {
                    return USER_AGENT_ERROR;
                }
                if (i10 == 301) {
                    return MRAID_ERROR;
                }
                if (i10 == 302) {
                    return INVALID_IFA_STATUS;
                }
                if (i10 == 304) {
                    return AD_EXPIRED;
                }
                if (i10 == 305) {
                    return MRAID_BRIDGE_ERROR;
                }
                switch (i10) {
                    case 0:
                        break;
                    case TPAT_ERROR_VALUE:
                        return TPAT_ERROR;
                    case INVALID_ADS_ENDPOINT_VALUE:
                        return INVALID_ADS_ENDPOINT;
                    case INVALID_RI_ENDPOINT_VALUE:
                        return INVALID_RI_ENDPOINT;
                    case INVALID_LOG_ERROR_ENDPOINT_VALUE:
                        return INVALID_LOG_ERROR_ENDPOINT;
                    case INVALID_METRICS_ENDPOINT_VALUE:
                        return INVALID_METRICS_ENDPOINT;
                    case ASSET_FAILED_INSUFFICIENT_SPACE_VALUE:
                        return ASSET_FAILED_INSUFFICIENT_SPACE;
                    case ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE:
                        return ASSET_FAILED_MAX_SPACE_EXCEEDED;
                    case 128:
                        return INVALID_TPAT_KEY;
                    case 129:
                        return EMPTY_TPAT_ERROR;
                    case 130:
                        return MRAID_DOWNLOAD_JS_ERROR;
                    case MRAID_JS_WRITE_FAILED_VALUE:
                        return MRAID_JS_WRITE_FAILED;
                    case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                        return OMSDK_DOWNLOAD_JS_ERROR;
                    case OMSDK_JS_WRITE_FAILED_VALUE:
                        return OMSDK_JS_WRITE_FAILED;
                    case 134:
                        return STORE_REGION_CODE_ERROR;
                    case 135:
                        return INVALID_CONFIG_RESPONSE;
                    case PRIVACY_URL_ERROR_VALUE:
                        return PRIVACY_URL_ERROR;
                    case TPAT_RETRY_FAILED_VALUE:
                        return TPAT_RETRY_FAILED;
                    case 138:
                        return CONFIG_REFRESH_FAILED;
                    case 400:
                        return CONCURRENT_PLAYBACK_UNSUPPORTED;
                    case 500:
                        return BANNER_VIEW_INVALID_SIZE;
                    case NATIVE_ASSET_ERROR_VALUE:
                        return NATIVE_ASSET_ERROR;
                    case NATIVE_VIDEO_PLAYBACK_ERROR_VALUE:
                        return NATIVE_VIDEO_PLAYBACK_ERROR;
                    case 2000:
                        return WEB_VIEW_WEB_CONTENT_PROCESS_DID_TERMINATE;
                    case 2001:
                        return WEB_VIEW_FAILED_NAVIGATION;
                    case 2002:
                        return STORE_KIT_LOAD_ERROR;
                    case 2003:
                        return OMSDK_COPY_ERROR;
                    case 2004:
                        return STORE_OVERLAY_LOAD_ERROR;
                    case 2005:
                        return REACHABILITY_INITIALIZATION_FAILED;
                    case 2006:
                        return UNKNOWN_RADIO_ACCESS_TECHNOLOGY;
                    case 2007:
                        return STORE_KIT_PRESENTATION_ERROR;
                    case 2008:
                        return STORE_OVERLAY_PRESENTATION_ERROR;
                    case 2009:
                        return INVALID_PLAY_PARAMETER;
                    case 2010:
                        return STORE_OVERLAY_DISMISSAL_ERROR;
                    case 2011:
                        return PRESENTER_DEALLOCATED_BEFORE_LOAD_COMPLETION;
                    case 2012:
                        return APP_IMPRESSION_CREATION_FAILED;
                    case 2013:
                        return HANDLE_TAP_FAILED;
                    case HAPTIC_ENGINE_ERROR_VALUE:
                        return HAPTIC_ENGINE_ERROR;
                    case 3001:
                        return OUT_OF_MEMORY;
                    case 3002:
                        return INLINE_INSTALL_ERROR;
                    case 4000:
                        return VUNGLE_OIT_CREATION_ERROR;
                    case 5000:
                        return MEDIATION_ERROR;
                    case 10001:
                        return AD_NO_FILL;
                    case AD_LOAD_TOO_FREQUENTLY_VALUE:
                        return AD_LOAD_TOO_FREQUENTLY;
                    case AD_SERVER_ERROR_VALUE:
                        return AD_SERVER_ERROR;
                    case AD_PUBLISHER_MISMATCH_VALUE:
                        return AD_PUBLISHER_MISMATCH;
                    case AD_INTERNAL_INTEGRATION_ERROR_VALUE:
                        return AD_INTERNAL_INTEGRATION_ERROR;
                    case CONFIG_NOT_FOUND_ERROR_VALUE:
                        return CONFIG_NOT_FOUND_ERROR;
                    default:
                        switch (i10) {
                            case 101:
                                return API_REQUEST_ERROR;
                            case 102:
                                return API_RESPONSE_DATA_ERROR;
                            case 103:
                                return API_RESPONSE_DECODE_ERROR;
                            case 104:
                                return API_FAILED_STATUS_CODE;
                            case 105:
                                return INVALID_TEMPLATE_URL;
                            case 106:
                                return INVALID_REQUEST_BUILDER_ERROR;
                            default:
                                switch (i10) {
                                    case 109:
                                        return TEMPLATE_UNZIP_ERROR;
                                    case 110:
                                        return INVALID_CTA_URL;
                                    case 111:
                                        return INVALID_ASSET_URL;
                                    case ASSET_REQUEST_ERROR_VALUE:
                                        return ASSET_REQUEST_ERROR;
                                    case ASSET_RESPONSE_DATA_ERROR_VALUE:
                                        return ASSET_RESPONSE_DATA_ERROR;
                                    case ASSET_WRITE_ERROR_VALUE:
                                        return ASSET_WRITE_ERROR;
                                    case INVALID_INDEX_URL_VALUE:
                                        return INVALID_INDEX_URL;
                                    case GZIP_ENCODE_ERROR_VALUE:
                                        return GZIP_ENCODE_ERROR;
                                    case ASSET_FAILED_STATUS_CODE_VALUE:
                                        return ASSET_FAILED_STATUS_CODE;
                                    case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                                        return PROTOBUF_SERIALIZATION_ERROR;
                                    case JSON_ENCODE_ERROR_VALUE:
                                        return JSON_ENCODE_ERROR;
                                    default:
                                        switch (i10) {
                                            case 200:
                                                return INVALID_EVENT_ID_ERROR;
                                            case 201:
                                                return INVALID_PLACEMENT_ID;
                                            case 202:
                                                return AD_CONSUMED;
                                            case AD_IS_LOADING_VALUE:
                                                return AD_IS_LOADING;
                                            case 204:
                                                return AD_ALREADY_LOADED;
                                            case AD_IS_PLAYING_VALUE:
                                                return AD_IS_PLAYING;
                                            case AD_ALREADY_FAILED_VALUE:
                                                return AD_ALREADY_FAILED;
                                            case PLACEMENT_AD_TYPE_MISMATCH_VALUE:
                                                return PLACEMENT_AD_TYPE_MISMATCH;
                                            case INVALID_BID_PAYLOAD_VALUE:
                                                return INVALID_BID_PAYLOAD;
                                            case INVALID_JSON_BID_PAYLOAD_VALUE:
                                                return INVALID_JSON_BID_PAYLOAD;
                                            case AD_NOT_LOADED_VALUE:
                                                return AD_NOT_LOADED;
                                            default:
                                                switch (i10) {
                                                    case PLACEMENT_SLEEP_VALUE:
                                                        return PLACEMENT_SLEEP;
                                                    case INVALID_ADUNIT_BID_PAYLOAD_VALUE:
                                                        return INVALID_ADUNIT_BID_PAYLOAD;
                                                    case INVALID_GZIP_BID_PAYLOAD_VALUE:
                                                        return INVALID_GZIP_BID_PAYLOAD;
                                                    case AD_RESPONSE_EMPTY_VALUE:
                                                        return AD_RESPONSE_EMPTY;
                                                    case AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE:
                                                        return AD_RESPONSE_INVALID_TEMPLATE_TYPE;
                                                    case AD_RESPONSE_TIMED_OUT_VALUE:
                                                        return AD_RESPONSE_TIMED_OUT;
                                                    case MRAID_JS_DOES_NOT_EXIST_VALUE:
                                                        return MRAID_JS_DOES_NOT_EXIST;
                                                    case MRAID_JS_COPY_FAILED_VALUE:
                                                        return MRAID_JS_COPY_FAILED;
                                                    case AD_RESPONSE_RETRY_AFTER_VALUE:
                                                        return AD_RESPONSE_RETRY_AFTER;
                                                    case AD_LOAD_FAIL_RETRY_AFTER_VALUE:
                                                        return AD_LOAD_FAIL_RETRY_AFTER;
                                                    case INVALID_WATERFALL_PLACEMENT_ID_VALUE:
                                                        return INVALID_WATERFALL_PLACEMENT_ID;
                                                    case STALE_CACHED_RESPONSE_VALUE:
                                                        return STALE_CACHED_RESPONSE;
                                                    case 224:
                                                        return AD_LOAD_FAIL_EMPTY_BID_PAYLOAD;
                                                    case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                                                        return AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH;
                                                    case PRIVACY_ICON_FALLBACK_ERROR_VALUE:
                                                        return PRIVACY_ICON_FALLBACK_ERROR;
                                                    case INVALID_CSB_DATA_VALUE:
                                                        return INVALID_CSB_DATA;
                                                    default:
                                                        switch (i10) {
                                                            case 307:
                                                                return AD_EXPIRED_ON_PLAY;
                                                            case AD_WIN_NOTIFICATION_ERROR_VALUE:
                                                                return AD_WIN_NOTIFICATION_ERROR;
                                                            case ASSET_FAILED_TO_DELETE_VALUE:
                                                                return ASSET_FAILED_TO_DELETE;
                                                            case AD_HTML_FAILED_TO_LOAD_VALUE:
                                                                return AD_HTML_FAILED_TO_LOAD;
                                                            case MRAID_JS_CALL_EMPTY_VALUE:
                                                                return MRAID_JS_CALL_EMPTY;
                                                            case DEEPLINK_OPEN_FAILED_VALUE:
                                                                return DEEPLINK_OPEN_FAILED;
                                                            case EVALUATE_JAVASCRIPT_FAILED_VALUE:
                                                                return EVALUATE_JAVASCRIPT_FAILED;
                                                            case LINK_COMMAND_OPEN_FAILED_VALUE:
                                                                return LINK_COMMAND_OPEN_FAILED;
                                                            case JSON_PARAMS_ENCODE_ERROR_VALUE:
                                                                return JSON_PARAMS_ENCODE_ERROR;
                                                            case GENERATE_JSON_DATA_ERROR_VALUE:
                                                                return GENERATE_JSON_DATA_ERROR;
                                                            case AD_CLOSED_TEMPLATE_ERROR_VALUE:
                                                                return AD_CLOSED_TEMPLATE_ERROR;
                                                            case AD_CLOSED_MISSING_HEARTBEAT_VALUE:
                                                                return AD_CLOSED_MISSING_HEARTBEAT;
                                                            case SILENT_MODE_MONITOR_ERROR_VALUE:
                                                                return SILENT_MODE_MONITOR_ERROR;
                                                            case WEBVIEW_ERROR_VALUE:
                                                                return WEBVIEW_ERROR;
                                                            case BLACK_SCREEN_DETECTION_ERROR_VALUE:
                                                                return BLACK_SCREEN_DETECTION_ERROR;
                                                            case MRAID_UNRECOGNIZED_COMMAND_VALUE:
                                                                return MRAID_UNRECOGNIZED_COMMAND;
                                                            default:
                                                                return null;
                                                        }
                                                }
                                        }
                                }
                        }
                }
            }
            return UNKNOWN_ERROR;
        }

        public static a0.d internalGetValueMap() {
            return internalValueMap;
        }

        public static a0.e internalGetVerifier() {
            return C0528b.INSTANCE;
        }

        @Override // com.google.protobuf.a0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static b valueOf(int i10) {
            return forNumber(i10);
        }
    }

    static {
        Sdk$SDKError sdk$SDKError = new Sdk$SDKError();
        DEFAULT_INSTANCE = sdk$SDKError;
        y.registerDefaultInstance(Sdk$SDKError.class, sdk$SDKError);
    }

    private Sdk$SDKError() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdLoadType() {
        this.adLoadType_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdSource() {
        this.adSource_ = getDefaultInstance().getAdSource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdState() {
        this.adState_ = getDefaultInstance().getAdState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdapterAdFormat() {
        this.adapterAdFormat_ = getDefaultInstance().getAdapterAdFormat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppState() {
        this.appState_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAt() {
        this.at_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectionType() {
        this.connectionType_ = getDefaultInstance().getConnectionType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectionTypeDetail() {
        this.connectionTypeDetail_ = getDefaultInstance().getConnectionTypeDetail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectionTypeDetailAndroid() {
        this.connectionTypeDetailAndroid_ = getDefaultInstance().getConnectionTypeDetailAndroid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreativeId() {
        this.creativeId_ = getDefaultInstance().getCreativeId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventId() {
        this.eventId_ = getDefaultInstance().getEventId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExperiments() {
        this.experiments_ = getDefaultInstance().getExperiments();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAdPodding() {
        this.isAdPodding_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAdoEnabled() {
        this.isAdoEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsHbPlacement() {
        this.isHbPlacement_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsLowDataModeEnabled() {
        this.isLowDataModeEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPartialDownloadEnabled() {
        this.isPartialDownloadEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMake() {
        this.make_ = getDefaultInstance().getMake();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMediationName() {
        this.mediationName_ = getDefaultInstance().getMediationName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModel() {
        this.model_ = getDefaultInstance().getModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOs() {
        this.os_ = getDefaultInstance().getOs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsVersion() {
        this.osVersion_ = getDefaultInstance().getOsVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlacementReferenceId() {
        this.placementReferenceId_ = getDefaultInstance().getPlacementReferenceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlacementType() {
        this.placementType_ = getDefaultInstance().getPlacementType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.reason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVmVersion() {
        this.vmVersion_ = getDefaultInstance().getVmVersion();
    }

    public static Sdk$SDKError getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static Sdk$SDKError parseDelimitedFrom(InputStream inputStream) {
        return (Sdk$SDKError) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKError parseFrom(ByteBuffer byteBuffer) {
        return (Sdk$SDKError) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static c1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdLoadType(long j10) {
        this.adLoadType_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdSource(String str) {
        str.getClass();
        this.adSource_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdSourceBytes(i iVar) {
        com.google.protobuf.a.checkByteStringIsUtf8(iVar);
        this.adSource_ = iVar.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdState(String str) {
        str.getClass();
        this.adState_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdStateBytes(i iVar) {
        com.google.protobuf.a.checkByteStringIsUtf8(iVar);
        this.adState_ = iVar.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdapterAdFormat(String str) {
        str.getClass();
        this.adapterAdFormat_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdapterAdFormatBytes(i iVar) {
        com.google.protobuf.a.checkByteStringIsUtf8(iVar);
        this.adapterAdFormat_ = iVar.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppState(long j10) {
        this.appState_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAt(long j10) {
        this.at_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionType(String str) {
        str.getClass();
        this.connectionType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionTypeBytes(i iVar) {
        com.google.protobuf.a.checkByteStringIsUtf8(iVar);
        this.connectionType_ = iVar.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionTypeDetail(String str) {
        str.getClass();
        this.connectionTypeDetail_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionTypeDetailAndroid(String str) {
        str.getClass();
        this.connectionTypeDetailAndroid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionTypeDetailAndroidBytes(i iVar) {
        com.google.protobuf.a.checkByteStringIsUtf8(iVar);
        this.connectionTypeDetailAndroid_ = iVar.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionTypeDetailBytes(i iVar) {
        com.google.protobuf.a.checkByteStringIsUtf8(iVar);
        this.connectionTypeDetail_ = iVar.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreativeId(String str) {
        str.getClass();
        this.creativeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreativeIdBytes(i iVar) {
        com.google.protobuf.a.checkByteStringIsUtf8(iVar);
        this.creativeId_ = iVar.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventId(String str) {
        str.getClass();
        this.eventId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventIdBytes(i iVar) {
        com.google.protobuf.a.checkByteStringIsUtf8(iVar);
        this.eventId_ = iVar.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperiments(String str) {
        str.getClass();
        this.experiments_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentsBytes(i iVar) {
        com.google.protobuf.a.checkByteStringIsUtf8(iVar);
        this.experiments_ = iVar.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAdPodding(boolean z10) {
        this.isAdPodding_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAdoEnabled(boolean z10) {
        this.isAdoEnabled_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsHbPlacement(long j10) {
        this.isHbPlacement_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsLowDataModeEnabled(boolean z10) {
        this.isLowDataModeEnabled_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPartialDownloadEnabled(boolean z10) {
        this.isPartialDownloadEnabled_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMake(String str) {
        str.getClass();
        this.make_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMakeBytes(i iVar) {
        com.google.protobuf.a.checkByteStringIsUtf8(iVar);
        this.make_ = iVar.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediationName(String str) {
        str.getClass();
        this.mediationName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediationNameBytes(i iVar) {
        com.google.protobuf.a.checkByteStringIsUtf8(iVar);
        this.mediationName_ = iVar.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(i iVar) {
        com.google.protobuf.a.checkByteStringIsUtf8(iVar);
        this.message_ = iVar.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModel(String str) {
        str.getClass();
        this.model_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModelBytes(i iVar) {
        com.google.protobuf.a.checkByteStringIsUtf8(iVar);
        this.model_ = iVar.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOs(String str) {
        str.getClass();
        this.os_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsBytes(i iVar) {
        com.google.protobuf.a.checkByteStringIsUtf8(iVar);
        this.os_ = iVar.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersion(String str) {
        str.getClass();
        this.osVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersionBytes(i iVar) {
        com.google.protobuf.a.checkByteStringIsUtf8(iVar);
        this.osVersion_ = iVar.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlacementReferenceId(String str) {
        str.getClass();
        this.placementReferenceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlacementReferenceIdBytes(i iVar) {
        com.google.protobuf.a.checkByteStringIsUtf8(iVar);
        this.placementReferenceId_ = iVar.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlacementType(String str) {
        str.getClass();
        this.placementType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlacementTypeBytes(i iVar) {
        com.google.protobuf.a.checkByteStringIsUtf8(iVar);
        this.placementType_ = iVar.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(b bVar) {
        this.reason_ = bVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonValue(int i10) {
        this.reason_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(i iVar) {
        com.google.protobuf.a.checkByteStringIsUtf8(iVar);
        this.sessionId_ = iVar.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVmVersion(String str) {
        str.getClass();
        this.vmVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVmVersionBytes(i iVar) {
        com.google.protobuf.a.checkByteStringIsUtf8(iVar);
        this.vmVersion_ = iVar.toStringUtf8();
    }

    @Override // com.google.protobuf.y
    protected final Object dynamicMethod(y.h hVar, Object obj, Object obj2) {
        c1 cVar;
        com.vungle.ads.internal.protos.a aVar = null;
        switch (com.vungle.ads.internal.protos.a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[hVar.ordinal()]) {
            case 1:
                return new Sdk$SDKError();
            case 2:
                return new a(aVar);
            case 3:
                return y.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001c\u0000\u0000\u0001É\u001c\u0000\u0000\u0000\u0001\u0002\u0002\f\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ\rȈ\u000e\u0002\u000fȈ\u0010Ȉ\u0011\u0002\u0012Ȉ\u0013Ȉ\u0014\u0007\u0015\u0007\u0016\u0007\u0017Ȉ\u0018Ȉ\u0019\u0002\u001aȈeȈÉ\u0007", new Object[]{"at_", "reason_", "message_", "eventId_", "make_", "model_", "os_", "osVersion_", "connectionType_", "connectionTypeDetail_", "placementReferenceId_", "creativeId_", "sessionId_", "isHbPlacement_", "placementType_", "adSource_", "appState_", "mediationName_", "vmVersion_", "isAdoEnabled_", "isPartialDownloadEnabled_", "isAdPodding_", "adState_", "experiments_", "adLoadType_", "adapterAdFormat_", "connectionTypeDetailAndroid_", "isLowDataModeEnabled_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                c1 c1Var = PARSER;
                if (c1Var != null) {
                    return c1Var;
                }
                synchronized (Sdk$SDKError.class) {
                    try {
                        cVar = PARSER;
                        if (cVar == null) {
                            cVar = new y.c(DEFAULT_INSTANCE);
                            PARSER = cVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return cVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.vungle.ads.internal.protos.d
    public long getAdLoadType() {
        return this.adLoadType_;
    }

    @Override // com.vungle.ads.internal.protos.d
    public String getAdSource() {
        return this.adSource_;
    }

    @Override // com.vungle.ads.internal.protos.d
    public i getAdSourceBytes() {
        return i.copyFromUtf8(this.adSource_);
    }

    @Override // com.vungle.ads.internal.protos.d
    public String getAdState() {
        return this.adState_;
    }

    @Override // com.vungle.ads.internal.protos.d
    public i getAdStateBytes() {
        return i.copyFromUtf8(this.adState_);
    }

    @Override // com.vungle.ads.internal.protos.d
    public String getAdapterAdFormat() {
        return this.adapterAdFormat_;
    }

    @Override // com.vungle.ads.internal.protos.d
    public i getAdapterAdFormatBytes() {
        return i.copyFromUtf8(this.adapterAdFormat_);
    }

    @Override // com.vungle.ads.internal.protos.d
    public long getAppState() {
        return this.appState_;
    }

    @Override // com.vungle.ads.internal.protos.d
    public long getAt() {
        return this.at_;
    }

    @Override // com.vungle.ads.internal.protos.d
    public String getConnectionType() {
        return this.connectionType_;
    }

    @Override // com.vungle.ads.internal.protos.d
    public i getConnectionTypeBytes() {
        return i.copyFromUtf8(this.connectionType_);
    }

    @Override // com.vungle.ads.internal.protos.d
    public String getConnectionTypeDetail() {
        return this.connectionTypeDetail_;
    }

    @Override // com.vungle.ads.internal.protos.d
    public String getConnectionTypeDetailAndroid() {
        return this.connectionTypeDetailAndroid_;
    }

    @Override // com.vungle.ads.internal.protos.d
    public i getConnectionTypeDetailAndroidBytes() {
        return i.copyFromUtf8(this.connectionTypeDetailAndroid_);
    }

    @Override // com.vungle.ads.internal.protos.d
    public i getConnectionTypeDetailBytes() {
        return i.copyFromUtf8(this.connectionTypeDetail_);
    }

    @Override // com.vungle.ads.internal.protos.d
    public String getCreativeId() {
        return this.creativeId_;
    }

    @Override // com.vungle.ads.internal.protos.d
    public i getCreativeIdBytes() {
        return i.copyFromUtf8(this.creativeId_);
    }

    @Override // com.vungle.ads.internal.protos.d
    public String getEventId() {
        return this.eventId_;
    }

    @Override // com.vungle.ads.internal.protos.d
    public i getEventIdBytes() {
        return i.copyFromUtf8(this.eventId_);
    }

    @Override // com.vungle.ads.internal.protos.d
    public String getExperiments() {
        return this.experiments_;
    }

    @Override // com.vungle.ads.internal.protos.d
    public i getExperimentsBytes() {
        return i.copyFromUtf8(this.experiments_);
    }

    @Override // com.vungle.ads.internal.protos.d
    public boolean getIsAdPodding() {
        return this.isAdPodding_;
    }

    @Override // com.vungle.ads.internal.protos.d
    public boolean getIsAdoEnabled() {
        return this.isAdoEnabled_;
    }

    @Override // com.vungle.ads.internal.protos.d
    public long getIsHbPlacement() {
        return this.isHbPlacement_;
    }

    @Override // com.vungle.ads.internal.protos.d
    public boolean getIsLowDataModeEnabled() {
        return this.isLowDataModeEnabled_;
    }

    @Override // com.vungle.ads.internal.protos.d
    public boolean getIsPartialDownloadEnabled() {
        return this.isPartialDownloadEnabled_;
    }

    @Override // com.vungle.ads.internal.protos.d
    public String getMake() {
        return this.make_;
    }

    @Override // com.vungle.ads.internal.protos.d
    public i getMakeBytes() {
        return i.copyFromUtf8(this.make_);
    }

    @Override // com.vungle.ads.internal.protos.d
    public String getMediationName() {
        return this.mediationName_;
    }

    @Override // com.vungle.ads.internal.protos.d
    public i getMediationNameBytes() {
        return i.copyFromUtf8(this.mediationName_);
    }

    @Override // com.vungle.ads.internal.protos.d
    public String getMessage() {
        return this.message_;
    }

    @Override // com.vungle.ads.internal.protos.d
    public i getMessageBytes() {
        return i.copyFromUtf8(this.message_);
    }

    @Override // com.vungle.ads.internal.protos.d
    public String getModel() {
        return this.model_;
    }

    @Override // com.vungle.ads.internal.protos.d
    public i getModelBytes() {
        return i.copyFromUtf8(this.model_);
    }

    @Override // com.vungle.ads.internal.protos.d
    public String getOs() {
        return this.os_;
    }

    @Override // com.vungle.ads.internal.protos.d
    public i getOsBytes() {
        return i.copyFromUtf8(this.os_);
    }

    @Override // com.vungle.ads.internal.protos.d
    public String getOsVersion() {
        return this.osVersion_;
    }

    @Override // com.vungle.ads.internal.protos.d
    public i getOsVersionBytes() {
        return i.copyFromUtf8(this.osVersion_);
    }

    @Override // com.vungle.ads.internal.protos.d
    public String getPlacementReferenceId() {
        return this.placementReferenceId_;
    }

    @Override // com.vungle.ads.internal.protos.d
    public i getPlacementReferenceIdBytes() {
        return i.copyFromUtf8(this.placementReferenceId_);
    }

    @Override // com.vungle.ads.internal.protos.d
    public String getPlacementType() {
        return this.placementType_;
    }

    @Override // com.vungle.ads.internal.protos.d
    public i getPlacementTypeBytes() {
        return i.copyFromUtf8(this.placementType_);
    }

    @Override // com.vungle.ads.internal.protos.d
    public b getReason() {
        b bVarForNumber = b.forNumber(this.reason_);
        return bVarForNumber == null ? b.UNRECOGNIZED : bVarForNumber;
    }

    @Override // com.vungle.ads.internal.protos.d
    public int getReasonValue() {
        return this.reason_;
    }

    @Override // com.vungle.ads.internal.protos.d
    public String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.vungle.ads.internal.protos.d
    public i getSessionIdBytes() {
        return i.copyFromUtf8(this.sessionId_);
    }

    @Override // com.vungle.ads.internal.protos.d
    public String getVmVersion() {
        return this.vmVersion_;
    }

    @Override // com.vungle.ads.internal.protos.d
    public i getVmVersionBytes() {
        return i.copyFromUtf8(this.vmVersion_);
    }

    public static a newBuilder(Sdk$SDKError sdk$SDKError) {
        return (a) DEFAULT_INSTANCE.createBuilder(sdk$SDKError);
    }

    public static Sdk$SDKError parseDelimitedFrom(InputStream inputStream, p pVar) {
        return (Sdk$SDKError) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pVar);
    }

    public static Sdk$SDKError parseFrom(ByteBuffer byteBuffer, p pVar) {
        return (Sdk$SDKError) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, pVar);
    }

    public static Sdk$SDKError parseFrom(i iVar) {
        return (Sdk$SDKError) y.parseFrom(DEFAULT_INSTANCE, iVar);
    }

    public static Sdk$SDKError parseFrom(i iVar, p pVar) {
        return (Sdk$SDKError) y.parseFrom(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static Sdk$SDKError parseFrom(byte[] bArr) {
        return (Sdk$SDKError) y.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Sdk$SDKError parseFrom(byte[] bArr, p pVar) {
        return (Sdk$SDKError) y.parseFrom(DEFAULT_INSTANCE, bArr, pVar);
    }

    public static Sdk$SDKError parseFrom(InputStream inputStream) {
        return (Sdk$SDKError) y.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKError parseFrom(InputStream inputStream, p pVar) {
        return (Sdk$SDKError) y.parseFrom(DEFAULT_INSTANCE, inputStream, pVar);
    }

    public static Sdk$SDKError parseFrom(j jVar) {
        return (Sdk$SDKError) y.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static Sdk$SDKError parseFrom(j jVar, p pVar) {
        return (Sdk$SDKError) y.parseFrom(DEFAULT_INSTANCE, jVar, pVar);
    }
}

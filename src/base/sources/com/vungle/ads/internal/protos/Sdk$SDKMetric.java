package com.vungle.ads.internal.protos;

import com.google.protobuf.a0;
import com.google.protobuf.c1;
import com.google.protobuf.i;
import com.google.protobuf.j;
import com.google.protobuf.p;
import com.google.protobuf.y;
import com.mbridge.msdk.mbnative.report.RN.lkCBSIFlvmyGX;
import java.io.InputStream;
import java.nio.ByteBuffer;
import r7.pgx.XTkUEXuiK;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class Sdk$SDKMetric extends y implements e {
    public static final int ADAPTERADFORMAT_FIELD_NUMBER = 26;
    public static final int ADLOADTYPE_FIELD_NUMBER = 25;
    public static final int ADSOURCE_FIELD_NUMBER = 16;
    public static final int ADSTATE_FIELD_NUMBER = 23;
    public static final int APPSTATE_FIELD_NUMBER = 18;
    public static final int CONNECTIONTYPEDETAIL_FIELD_NUMBER = 9;
    public static final int CONNECTIONTYPE_FIELD_NUMBER = 8;
    public static final int CREATIVEID_FIELD_NUMBER = 11;
    private static final Sdk$SDKMetric DEFAULT_INSTANCE;
    public static final int EVENTID_FIELD_NUMBER = 12;
    public static final int EXPERIMENTS_FIELD_NUMBER = 24;
    public static final int ISADOENABLED_FIELD_NUMBER = 20;
    public static final int ISADPODDING_FIELD_NUMBER = 22;
    public static final int ISHBPLACEMENT_FIELD_NUMBER = 14;
    public static final int ISLOWDATAMODEENABLED_FIELD_NUMBER = 201;
    public static final int ISPARTIALDOWNLOADENABLED_FIELD_NUMBER = 21;
    public static final int MAKE_FIELD_NUMBER = 4;
    public static final int MEDIATIONNAME_FIELD_NUMBER = 17;
    public static final int META_FIELD_NUMBER = 3;
    public static final int MODEL_FIELD_NUMBER = 5;
    public static final int OSVERSION_FIELD_NUMBER = 7;
    public static final int OS_FIELD_NUMBER = 6;
    private static volatile c1 PARSER = null;
    public static final int PLACEMENTREFERENCEID_FIELD_NUMBER = 10;
    public static final int PLACEMENTTYPE_FIELD_NUMBER = 15;
    public static final int SESSIONID_FIELD_NUMBER = 13;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    public static final int VMVERSION_FIELD_NUMBER = 19;
    private long adLoadType_;
    private long appState_;
    private boolean isAdPodding_;
    private boolean isAdoEnabled_;
    private long isHbPlacement_;
    private boolean isLowDataModeEnabled_;
    private boolean isPartialDownloadEnabled_;
    private int type_;
    private long value_;
    private String meta_ = "";
    private String make_ = "";
    private String model_ = "";
    private String os_ = "";
    private String osVersion_ = "";
    private String connectionType_ = "";
    private String connectionTypeDetail_ = "";
    private String placementReferenceId_ = "";
    private String creativeId_ = "";
    private String eventId_ = "";
    private String sessionId_ = "";
    private String placementType_ = "";
    private String adSource_ = "";
    private String mediationName_ = "";
    private String vmVersion_ = "";
    private String adState_ = "";
    private String experiments_ = "";
    private String adapterAdFormat_ = "";

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class a extends y.b implements e {
        /* synthetic */ a(com.vungle.ads.internal.protos.a aVar) {
            this();
        }

        public a clearAdLoadType() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearAdLoadType();
            return this;
        }

        public a clearAdSource() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearAdSource();
            return this;
        }

        public a clearAdState() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearAdState();
            return this;
        }

        public a clearAdapterAdFormat() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearAdapterAdFormat();
            return this;
        }

        public a clearAppState() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearAppState();
            return this;
        }

        public a clearConnectionType() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearConnectionType();
            return this;
        }

        public a clearConnectionTypeDetail() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearConnectionTypeDetail();
            return this;
        }

        public a clearCreativeId() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearCreativeId();
            return this;
        }

        public a clearEventId() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearEventId();
            return this;
        }

        public a clearExperiments() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearExperiments();
            return this;
        }

        public a clearIsAdPodding() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearIsAdPodding();
            return this;
        }

        public a clearIsAdoEnabled() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearIsAdoEnabled();
            return this;
        }

        public a clearIsHbPlacement() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearIsHbPlacement();
            return this;
        }

        public a clearIsLowDataModeEnabled() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearIsLowDataModeEnabled();
            return this;
        }

        public a clearIsPartialDownloadEnabled() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearIsPartialDownloadEnabled();
            return this;
        }

        public a clearMake() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearMake();
            return this;
        }

        public a clearMediationName() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearMediationName();
            return this;
        }

        public a clearMeta() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearMeta();
            return this;
        }

        public a clearModel() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearModel();
            return this;
        }

        public a clearOs() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearOs();
            return this;
        }

        public a clearOsVersion() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearOsVersion();
            return this;
        }

        public a clearPlacementReferenceId() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearPlacementReferenceId();
            return this;
        }

        public a clearPlacementType() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearPlacementType();
            return this;
        }

        public a clearSessionId() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearSessionId();
            return this;
        }

        public a clearType() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearType();
            return this;
        }

        public a clearValue() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearValue();
            return this;
        }

        public a clearVmVersion() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearVmVersion();
            return this;
        }

        @Override // com.vungle.ads.internal.protos.e
        public long getAdLoadType() {
            return ((Sdk$SDKMetric) this.instance).getAdLoadType();
        }

        @Override // com.vungle.ads.internal.protos.e
        public String getAdSource() {
            return ((Sdk$SDKMetric) this.instance).getAdSource();
        }

        @Override // com.vungle.ads.internal.protos.e
        public i getAdSourceBytes() {
            return ((Sdk$SDKMetric) this.instance).getAdSourceBytes();
        }

        @Override // com.vungle.ads.internal.protos.e
        public String getAdState() {
            return ((Sdk$SDKMetric) this.instance).getAdState();
        }

        @Override // com.vungle.ads.internal.protos.e
        public i getAdStateBytes() {
            return ((Sdk$SDKMetric) this.instance).getAdStateBytes();
        }

        @Override // com.vungle.ads.internal.protos.e
        public String getAdapterAdFormat() {
            return ((Sdk$SDKMetric) this.instance).getAdapterAdFormat();
        }

        @Override // com.vungle.ads.internal.protos.e
        public i getAdapterAdFormatBytes() {
            return ((Sdk$SDKMetric) this.instance).getAdapterAdFormatBytes();
        }

        @Override // com.vungle.ads.internal.protos.e
        public long getAppState() {
            return ((Sdk$SDKMetric) this.instance).getAppState();
        }

        @Override // com.vungle.ads.internal.protos.e
        public String getConnectionType() {
            return ((Sdk$SDKMetric) this.instance).getConnectionType();
        }

        @Override // com.vungle.ads.internal.protos.e
        public i getConnectionTypeBytes() {
            return ((Sdk$SDKMetric) this.instance).getConnectionTypeBytes();
        }

        @Override // com.vungle.ads.internal.protos.e
        public String getConnectionTypeDetail() {
            return ((Sdk$SDKMetric) this.instance).getConnectionTypeDetail();
        }

        @Override // com.vungle.ads.internal.protos.e
        public i getConnectionTypeDetailBytes() {
            return ((Sdk$SDKMetric) this.instance).getConnectionTypeDetailBytes();
        }

        @Override // com.vungle.ads.internal.protos.e
        public String getCreativeId() {
            return ((Sdk$SDKMetric) this.instance).getCreativeId();
        }

        @Override // com.vungle.ads.internal.protos.e
        public i getCreativeIdBytes() {
            return ((Sdk$SDKMetric) this.instance).getCreativeIdBytes();
        }

        @Override // com.vungle.ads.internal.protos.e
        public String getEventId() {
            return ((Sdk$SDKMetric) this.instance).getEventId();
        }

        @Override // com.vungle.ads.internal.protos.e
        public i getEventIdBytes() {
            return ((Sdk$SDKMetric) this.instance).getEventIdBytes();
        }

        @Override // com.vungle.ads.internal.protos.e
        public String getExperiments() {
            return ((Sdk$SDKMetric) this.instance).getExperiments();
        }

        @Override // com.vungle.ads.internal.protos.e
        public i getExperimentsBytes() {
            return ((Sdk$SDKMetric) this.instance).getExperimentsBytes();
        }

        @Override // com.vungle.ads.internal.protos.e
        public boolean getIsAdPodding() {
            return ((Sdk$SDKMetric) this.instance).getIsAdPodding();
        }

        @Override // com.vungle.ads.internal.protos.e
        public boolean getIsAdoEnabled() {
            return ((Sdk$SDKMetric) this.instance).getIsAdoEnabled();
        }

        @Override // com.vungle.ads.internal.protos.e
        public long getIsHbPlacement() {
            return ((Sdk$SDKMetric) this.instance).getIsHbPlacement();
        }

        @Override // com.vungle.ads.internal.protos.e
        public boolean getIsLowDataModeEnabled() {
            return ((Sdk$SDKMetric) this.instance).getIsLowDataModeEnabled();
        }

        @Override // com.vungle.ads.internal.protos.e
        public boolean getIsPartialDownloadEnabled() {
            return ((Sdk$SDKMetric) this.instance).getIsPartialDownloadEnabled();
        }

        @Override // com.vungle.ads.internal.protos.e
        public String getMake() {
            return ((Sdk$SDKMetric) this.instance).getMake();
        }

        @Override // com.vungle.ads.internal.protos.e
        public i getMakeBytes() {
            return ((Sdk$SDKMetric) this.instance).getMakeBytes();
        }

        @Override // com.vungle.ads.internal.protos.e
        public String getMediationName() {
            return ((Sdk$SDKMetric) this.instance).getMediationName();
        }

        @Override // com.vungle.ads.internal.protos.e
        public i getMediationNameBytes() {
            return ((Sdk$SDKMetric) this.instance).getMediationNameBytes();
        }

        @Override // com.vungle.ads.internal.protos.e
        public String getMeta() {
            return ((Sdk$SDKMetric) this.instance).getMeta();
        }

        @Override // com.vungle.ads.internal.protos.e
        public i getMetaBytes() {
            return ((Sdk$SDKMetric) this.instance).getMetaBytes();
        }

        @Override // com.vungle.ads.internal.protos.e
        public String getModel() {
            return ((Sdk$SDKMetric) this.instance).getModel();
        }

        @Override // com.vungle.ads.internal.protos.e
        public i getModelBytes() {
            return ((Sdk$SDKMetric) this.instance).getModelBytes();
        }

        @Override // com.vungle.ads.internal.protos.e
        public String getOs() {
            return ((Sdk$SDKMetric) this.instance).getOs();
        }

        @Override // com.vungle.ads.internal.protos.e
        public i getOsBytes() {
            return ((Sdk$SDKMetric) this.instance).getOsBytes();
        }

        @Override // com.vungle.ads.internal.protos.e
        public String getOsVersion() {
            return ((Sdk$SDKMetric) this.instance).getOsVersion();
        }

        @Override // com.vungle.ads.internal.protos.e
        public i getOsVersionBytes() {
            return ((Sdk$SDKMetric) this.instance).getOsVersionBytes();
        }

        @Override // com.vungle.ads.internal.protos.e
        public String getPlacementReferenceId() {
            return ((Sdk$SDKMetric) this.instance).getPlacementReferenceId();
        }

        @Override // com.vungle.ads.internal.protos.e
        public i getPlacementReferenceIdBytes() {
            return ((Sdk$SDKMetric) this.instance).getPlacementReferenceIdBytes();
        }

        @Override // com.vungle.ads.internal.protos.e
        public String getPlacementType() {
            return ((Sdk$SDKMetric) this.instance).getPlacementType();
        }

        @Override // com.vungle.ads.internal.protos.e
        public i getPlacementTypeBytes() {
            return ((Sdk$SDKMetric) this.instance).getPlacementTypeBytes();
        }

        @Override // com.vungle.ads.internal.protos.e
        public String getSessionId() {
            return ((Sdk$SDKMetric) this.instance).getSessionId();
        }

        @Override // com.vungle.ads.internal.protos.e
        public i getSessionIdBytes() {
            return ((Sdk$SDKMetric) this.instance).getSessionIdBytes();
        }

        @Override // com.vungle.ads.internal.protos.e
        public b getType() {
            return ((Sdk$SDKMetric) this.instance).getType();
        }

        @Override // com.vungle.ads.internal.protos.e
        public int getTypeValue() {
            return ((Sdk$SDKMetric) this.instance).getTypeValue();
        }

        @Override // com.vungle.ads.internal.protos.e
        public long getValue() {
            return ((Sdk$SDKMetric) this.instance).getValue();
        }

        @Override // com.vungle.ads.internal.protos.e
        public String getVmVersion() {
            return ((Sdk$SDKMetric) this.instance).getVmVersion();
        }

        @Override // com.vungle.ads.internal.protos.e
        public i getVmVersionBytes() {
            return ((Sdk$SDKMetric) this.instance).getVmVersionBytes();
        }

        public a setAdLoadType(long j10) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setAdLoadType(j10);
            return this;
        }

        public a setAdSource(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setAdSource(str);
            return this;
        }

        public a setAdSourceBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setAdSourceBytes(iVar);
            return this;
        }

        public a setAdState(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setAdState(str);
            return this;
        }

        public a setAdStateBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setAdStateBytes(iVar);
            return this;
        }

        public a setAdapterAdFormat(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setAdapterAdFormat(str);
            return this;
        }

        public a setAdapterAdFormatBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setAdapterAdFormatBytes(iVar);
            return this;
        }

        public a setAppState(long j10) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setAppState(j10);
            return this;
        }

        public a setConnectionType(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setConnectionType(str);
            return this;
        }

        public a setConnectionTypeBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setConnectionTypeBytes(iVar);
            return this;
        }

        public a setConnectionTypeDetail(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setConnectionTypeDetail(str);
            return this;
        }

        public a setConnectionTypeDetailBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setConnectionTypeDetailBytes(iVar);
            return this;
        }

        public a setCreativeId(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setCreativeId(str);
            return this;
        }

        public a setCreativeIdBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setCreativeIdBytes(iVar);
            return this;
        }

        public a setEventId(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setEventId(str);
            return this;
        }

        public a setEventIdBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setEventIdBytes(iVar);
            return this;
        }

        public a setExperiments(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setExperiments(str);
            return this;
        }

        public a setExperimentsBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setExperimentsBytes(iVar);
            return this;
        }

        public a setIsAdPodding(boolean z10) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setIsAdPodding(z10);
            return this;
        }

        public a setIsAdoEnabled(boolean z10) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setIsAdoEnabled(z10);
            return this;
        }

        public a setIsHbPlacement(long j10) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setIsHbPlacement(j10);
            return this;
        }

        public a setIsLowDataModeEnabled(boolean z10) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setIsLowDataModeEnabled(z10);
            return this;
        }

        public a setIsPartialDownloadEnabled(boolean z10) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setIsPartialDownloadEnabled(z10);
            return this;
        }

        public a setMake(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setMake(str);
            return this;
        }

        public a setMakeBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setMakeBytes(iVar);
            return this;
        }

        public a setMediationName(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setMediationName(str);
            return this;
        }

        public a setMediationNameBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setMediationNameBytes(iVar);
            return this;
        }

        public a setMeta(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setMeta(str);
            return this;
        }

        public a setMetaBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setMetaBytes(iVar);
            return this;
        }

        public a setModel(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setModel(str);
            return this;
        }

        public a setModelBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setModelBytes(iVar);
            return this;
        }

        public a setOs(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setOs(str);
            return this;
        }

        public a setOsBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setOsBytes(iVar);
            return this;
        }

        public a setOsVersion(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setOsVersion(str);
            return this;
        }

        public a setOsVersionBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setOsVersionBytes(iVar);
            return this;
        }

        public a setPlacementReferenceId(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setPlacementReferenceId(str);
            return this;
        }

        public a setPlacementReferenceIdBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setPlacementReferenceIdBytes(iVar);
            return this;
        }

        public a setPlacementType(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setPlacementType(str);
            return this;
        }

        public a setPlacementTypeBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setPlacementTypeBytes(iVar);
            return this;
        }

        public a setSessionId(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setSessionId(str);
            return this;
        }

        public a setSessionIdBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setSessionIdBytes(iVar);
            return this;
        }

        public a setType(b bVar) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setType(bVar);
            return this;
        }

        public a setTypeValue(int i10) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setTypeValue(i10);
            return this;
        }

        public a setValue(long j10) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setValue(j10);
            return this;
        }

        public a setVmVersion(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setVmVersion(str);
            return this;
        }

        public a setVmVersionBytes(i iVar) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setVmVersionBytes(iVar);
            return this;
        }

        private a() {
            super(Sdk$SDKMetric.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public enum b implements a0.c {
        UNKNOWN_METRIC_TYPE(0),
        AD_REQUEST_TO_RESPONSE_DURATION_MS(1),
        AD_RESPONSE_TO_SHOW_DURATION_MS(2),
        AD_SHOW_TO_DISPLAY_DURATION_MS(3),
        AD_DISPLAY_TO_CLICK_DURATION_MS(4),
        IOS_STORE_KIT_LOAD_TIME_MS(5),
        INIT_REQUEST_TO_RESPONSE_DURATION_MS(6),
        ASSET_DOWNLOAD_DURATION_MS(7),
        LOCAL_ASSETS_USED(8),
        REMOTE_ASSETS_USED(9),
        TEMPLATE_DOWNLOAD_DURATION_MS(10),
        AD_REQUEST_TO_CALLBACK_DURATION_MS(11),
        AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS(12),
        ASSET_FILE_SIZE(13),
        USER_AGENT_LOAD_DURATION_MS(14),
        TEMPLATE_ZIP_SIZE(15),
        CACHED_ASSETS_USED(16),
        LOAD_AD_API(17),
        TPAT_FIRED(18),
        TPAT_SUCCESS(19),
        WIN_NOTIF_FIRED(20),
        WIN_NOTIF_SUCCESS(21),
        AD_EXPIRED_BEFORE_PLAY(22),
        PLAY_AD_API(23),
        AD_LOAD_FAIL(24),
        VIEW_NOT_VISIBLE_ON_PLAY(25),
        MRAID_DOWNLOAD_JS_RETRY_SUCCESS(26),
        OMSDK_DOWNLOAD_JS_RETRY_SUCCESS(27),
        PRIVACY_URL_OPENED(28),
        NOTIFICATION_REDIRECT(29),
        AD_PLAY_RESET_ON_DEINIT(30),
        TEMPLATE_HTML_SIZE(31),
        CONFIG_LOADED_FROM_INIT(32),
        CONFIG_LOADED_FROM_AD_LOAD(33),
        CONFIG_LOADED_FROM_ADM_LOAD(34),
        AD_SHOW_TO_PRESENT_DURATION_MS(35),
        AD_SHOW_TO_FAIL_DURATION_MS(36),
        AD_PRESENT_TO_DISPLAY_DURATION_MS(37),
        BID_TOKEN_REQUESTED(38),
        BID_TOKEN_REQUEST_TO_RESPONSE_DURATION_MS(39),
        BID_TOKEN_REQUEST_TO_FAIL_DURATION_MS(40),
        AD_LOAD_TO_FAIL_CALLBACK_DURATION_MS(41),
        AD_SHOW_TO_CLOSE_DURATION_MS(42),
        AD_LOAD_TO_CALLBACK_DURATION_MS(43),
        AD_LOAD_TO_CALLBACK_ADO_DURATION_MS(44),
        SDK_INIT_API(45),
        AD_START_EVENT(46),
        AD_CLICK_EVENT(47),
        AD_SHOW_TO_VALIDATION_DURATION_MS(48),
        AD_VALIDATION_TO_PRESENT_DURATION_MS(49),
        AD_LEAVE_APPLICATION(50),
        AD_REWARD_USER(51),
        AD_REQUIRED_DOWNLOAD_DURATION_MS(52),
        AD_OPTIONAL_DOWNLOAD_DURATION_MS(53),
        AD_BACKGROUND_BEFORE_IMPRESSION(54),
        AD_CLOSED_BEFORE_IMPRESSION(55),
        AD_VISIBILITY(56),
        INIT_TO_SUCCESS_CALLBACK_DURATION_MS(57),
        INIT_TO_FAIL_CALLBACK_DURATION_MS(58),
        AD_START_TO_BACKGROUND_DURATION_MS(59),
        ASSET_PARTIAL_DOWNLOAD_DURATION_MS(60),
        APP_BACKGROUND_DURING_AD_LOAD(61),
        DEPRECATED_API_USED(62),
        AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET(63),
        AD_PRELOAD_TO_READY_DURATION_MS(64),
        CONCURRENT_CACHED_WEBVIEW_COUNT(65),
        BLACK_SCREEN_IS_DETECTED(66),
        NATIVE_PLAY_ASSET_TYPE(67),
        NATIVE_VIDEO_PREPARE_DURATION_MS(68),
        NATIVE_AD_DISPLAY_DURATION(69),
        ASSET_DOWNLOAD_RETRY_STATUS(70),
        AD_VISIBLE_DURATION_MS(71),
        SKOVERLAY_PRESENTED_FOR_AD(2000),
        SAFARI_PRESENTED_FOR_AD(2001),
        STORE_KIT_PRESENTED_FOR_AD(2002),
        STORE_KIT_NOT_READY(2003),
        LAUNCH_STORE_KIT_REQUEST(2004),
        LAUNCH_SKOVERLAY_REQUEST(2005),
        LAUNCH_SAFARI_REQUEST(2006),
        IDFV_RESTRICTED(2007),
        NOTIFICATION_WAIT_FOR_CONNECTIVITY(2008),
        IDFV_VALUE_CHANGED(2009),
        AD_WILL_CLOSE(2010),
        APP_TERM_DURING_AD_BEFORE_IMPRESSION(2011),
        HANDLE_TAP_REQUEST(2012),
        HANDLE_TAP_SUCCESS(2013),
        HARDWARE_ACCELERATE_DISABLED(3001),
        BANNER_AUTO_REDIRECT(3002),
        BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL(3003),
        INLINE_INSTALL_STATUS(3004),
        UNRECOGNIZED(-1);

        public static final int AD_BACKGROUND_BEFORE_IMPRESSION_VALUE = 54;
        public static final int AD_CLICK_EVENT_VALUE = 47;
        public static final int AD_CLOSED_BEFORE_IMPRESSION_VALUE = 55;
        public static final int AD_DISPLAY_TO_CLICK_DURATION_MS_VALUE = 4;

        @Deprecated
        public static final int AD_EXPIRED_BEFORE_PLAY_VALUE = 22;
        public static final int AD_LEAVE_APPLICATION_VALUE = 50;
        public static final int AD_LOAD_FAIL_VALUE = 24;
        public static final int AD_LOAD_TO_CALLBACK_ADO_DURATION_MS_VALUE = 44;
        public static final int AD_LOAD_TO_CALLBACK_DURATION_MS_VALUE = 43;
        public static final int AD_LOAD_TO_FAIL_CALLBACK_DURATION_MS_VALUE = 41;
        public static final int AD_OPTIONAL_DOWNLOAD_DURATION_MS_VALUE = 53;
        public static final int AD_PLAY_RESET_ON_DEINIT_VALUE = 30;
        public static final int AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE = 63;
        public static final int AD_PRELOAD_TO_READY_DURATION_MS_VALUE = 64;
        public static final int AD_PRESENT_TO_DISPLAY_DURATION_MS_VALUE = 37;
        public static final int AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS_VALUE = 12;
        public static final int AD_REQUEST_TO_CALLBACK_DURATION_MS_VALUE = 11;
        public static final int AD_REQUEST_TO_RESPONSE_DURATION_MS_VALUE = 1;
        public static final int AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE = 52;
        public static final int AD_RESPONSE_TO_SHOW_DURATION_MS_VALUE = 2;
        public static final int AD_REWARD_USER_VALUE = 51;
        public static final int AD_SHOW_TO_CLOSE_DURATION_MS_VALUE = 42;
        public static final int AD_SHOW_TO_DISPLAY_DURATION_MS_VALUE = 3;
        public static final int AD_SHOW_TO_FAIL_DURATION_MS_VALUE = 36;

        @Deprecated
        public static final int AD_SHOW_TO_PRESENT_DURATION_MS_VALUE = 35;
        public static final int AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE = 48;
        public static final int AD_START_EVENT_VALUE = 46;
        public static final int AD_START_TO_BACKGROUND_DURATION_MS_VALUE = 59;
        public static final int AD_VALIDATION_TO_PRESENT_DURATION_MS_VALUE = 49;
        public static final int AD_VISIBILITY_VALUE = 56;
        public static final int AD_VISIBLE_DURATION_MS_VALUE = 71;
        public static final int AD_WILL_CLOSE_VALUE = 2010;
        public static final int APP_BACKGROUND_DURING_AD_LOAD_VALUE = 61;
        public static final int APP_TERM_DURING_AD_BEFORE_IMPRESSION_VALUE = 2011;
        public static final int ASSET_DOWNLOAD_DURATION_MS_VALUE = 7;
        public static final int ASSET_DOWNLOAD_RETRY_STATUS_VALUE = 70;
        public static final int ASSET_FILE_SIZE_VALUE = 13;
        public static final int ASSET_PARTIAL_DOWNLOAD_DURATION_MS_VALUE = 60;
        public static final int BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE = 3003;
        public static final int BANNER_AUTO_REDIRECT_VALUE = 3002;
        public static final int BID_TOKEN_REQUESTED_VALUE = 38;
        public static final int BID_TOKEN_REQUEST_TO_FAIL_DURATION_MS_VALUE = 40;
        public static final int BID_TOKEN_REQUEST_TO_RESPONSE_DURATION_MS_VALUE = 39;
        public static final int BLACK_SCREEN_IS_DETECTED_VALUE = 66;
        public static final int CACHED_ASSETS_USED_VALUE = 16;
        public static final int CONCURRENT_CACHED_WEBVIEW_COUNT_VALUE = 65;
        public static final int CONFIG_LOADED_FROM_ADM_LOAD_VALUE = 34;
        public static final int CONFIG_LOADED_FROM_AD_LOAD_VALUE = 33;
        public static final int CONFIG_LOADED_FROM_INIT_VALUE = 32;
        public static final int DEPRECATED_API_USED_VALUE = 62;
        public static final int HANDLE_TAP_REQUEST_VALUE = 2012;
        public static final int HANDLE_TAP_SUCCESS_VALUE = 2013;
        public static final int HARDWARE_ACCELERATE_DISABLED_VALUE = 3001;
        public static final int IDFV_RESTRICTED_VALUE = 2007;
        public static final int IDFV_VALUE_CHANGED_VALUE = 2009;
        public static final int INIT_REQUEST_TO_RESPONSE_DURATION_MS_VALUE = 6;
        public static final int INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE = 58;
        public static final int INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE = 57;
        public static final int INLINE_INSTALL_STATUS_VALUE = 3004;
        public static final int IOS_STORE_KIT_LOAD_TIME_MS_VALUE = 5;
        public static final int LAUNCH_SAFARI_REQUEST_VALUE = 2006;
        public static final int LAUNCH_SKOVERLAY_REQUEST_VALUE = 2005;
        public static final int LAUNCH_STORE_KIT_REQUEST_VALUE = 2004;
        public static final int LOAD_AD_API_VALUE = 17;

        @Deprecated
        public static final int LOCAL_ASSETS_USED_VALUE = 8;
        public static final int MRAID_DOWNLOAD_JS_RETRY_SUCCESS_VALUE = 26;
        public static final int NATIVE_AD_DISPLAY_DURATION_VALUE = 69;
        public static final int NATIVE_PLAY_ASSET_TYPE_VALUE = 67;
        public static final int NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE = 68;
        public static final int NOTIFICATION_REDIRECT_VALUE = 29;
        public static final int NOTIFICATION_WAIT_FOR_CONNECTIVITY_VALUE = 2008;
        public static final int OMSDK_DOWNLOAD_JS_RETRY_SUCCESS_VALUE = 27;
        public static final int PLAY_AD_API_VALUE = 23;
        public static final int PRIVACY_URL_OPENED_VALUE = 28;

        @Deprecated
        public static final int REMOTE_ASSETS_USED_VALUE = 9;
        public static final int SAFARI_PRESENTED_FOR_AD_VALUE = 2001;
        public static final int SDK_INIT_API_VALUE = 45;
        public static final int SKOVERLAY_PRESENTED_FOR_AD_VALUE = 2000;
        public static final int STORE_KIT_NOT_READY_VALUE = 2003;
        public static final int STORE_KIT_PRESENTED_FOR_AD_VALUE = 2002;
        public static final int TEMPLATE_DOWNLOAD_DURATION_MS_VALUE = 10;
        public static final int TEMPLATE_HTML_SIZE_VALUE = 31;
        public static final int TEMPLATE_ZIP_SIZE_VALUE = 15;
        public static final int TPAT_FIRED_VALUE = 18;
        public static final int TPAT_SUCCESS_VALUE = 19;
        public static final int UNKNOWN_METRIC_TYPE_VALUE = 0;
        public static final int USER_AGENT_LOAD_DURATION_MS_VALUE = 14;

        @Deprecated
        public static final int VIEW_NOT_VISIBLE_ON_PLAY_VALUE = 25;
        public static final int WIN_NOTIF_FIRED_VALUE = 20;
        public static final int WIN_NOTIF_SUCCESS_VALUE = 21;
        private static final a0.d internalValueMap = new a();
        private final int value;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements a0.d {
            a() {
            }

            @Override // com.google.protobuf.a0.d
            public b findValueByNumber(int i10) {
                return b.forNumber(i10);
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.protos.Sdk$SDKMetric$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static final class C0529b implements a0.e {
            static final a0.e INSTANCE = new C0529b();

            private C0529b() {
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
            switch (i10) {
                case 0:
                    return UNKNOWN_METRIC_TYPE;
                case 1:
                    return AD_REQUEST_TO_RESPONSE_DURATION_MS;
                case 2:
                    return AD_RESPONSE_TO_SHOW_DURATION_MS;
                case 3:
                    return AD_SHOW_TO_DISPLAY_DURATION_MS;
                case 4:
                    return AD_DISPLAY_TO_CLICK_DURATION_MS;
                case 5:
                    return IOS_STORE_KIT_LOAD_TIME_MS;
                case 6:
                    return INIT_REQUEST_TO_RESPONSE_DURATION_MS;
                case 7:
                    return ASSET_DOWNLOAD_DURATION_MS;
                case 8:
                    return LOCAL_ASSETS_USED;
                case 9:
                    return REMOTE_ASSETS_USED;
                case 10:
                    return TEMPLATE_DOWNLOAD_DURATION_MS;
                case 11:
                    return AD_REQUEST_TO_CALLBACK_DURATION_MS;
                case 12:
                    return AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS;
                case 13:
                    return ASSET_FILE_SIZE;
                case 14:
                    return USER_AGENT_LOAD_DURATION_MS;
                case 15:
                    return TEMPLATE_ZIP_SIZE;
                case 16:
                    return CACHED_ASSETS_USED;
                case 17:
                    return LOAD_AD_API;
                case 18:
                    return TPAT_FIRED;
                case 19:
                    return TPAT_SUCCESS;
                case 20:
                    return WIN_NOTIF_FIRED;
                case 21:
                    return WIN_NOTIF_SUCCESS;
                case 22:
                    return AD_EXPIRED_BEFORE_PLAY;
                case 23:
                    return PLAY_AD_API;
                case 24:
                    return AD_LOAD_FAIL;
                case 25:
                    return VIEW_NOT_VISIBLE_ON_PLAY;
                case 26:
                    return MRAID_DOWNLOAD_JS_RETRY_SUCCESS;
                case 27:
                    return OMSDK_DOWNLOAD_JS_RETRY_SUCCESS;
                case 28:
                    return PRIVACY_URL_OPENED;
                case 29:
                    return NOTIFICATION_REDIRECT;
                case 30:
                    return AD_PLAY_RESET_ON_DEINIT;
                case 31:
                    return TEMPLATE_HTML_SIZE;
                case 32:
                    return CONFIG_LOADED_FROM_INIT;
                case 33:
                    return CONFIG_LOADED_FROM_AD_LOAD;
                case 34:
                    return CONFIG_LOADED_FROM_ADM_LOAD;
                case 35:
                    return AD_SHOW_TO_PRESENT_DURATION_MS;
                case 36:
                    return AD_SHOW_TO_FAIL_DURATION_MS;
                case 37:
                    return AD_PRESENT_TO_DISPLAY_DURATION_MS;
                case 38:
                    return BID_TOKEN_REQUESTED;
                case 39:
                    return BID_TOKEN_REQUEST_TO_RESPONSE_DURATION_MS;
                case 40:
                    return BID_TOKEN_REQUEST_TO_FAIL_DURATION_MS;
                case 41:
                    return AD_LOAD_TO_FAIL_CALLBACK_DURATION_MS;
                case 42:
                    return AD_SHOW_TO_CLOSE_DURATION_MS;
                case 43:
                    return AD_LOAD_TO_CALLBACK_DURATION_MS;
                case 44:
                    return AD_LOAD_TO_CALLBACK_ADO_DURATION_MS;
                case SDK_INIT_API_VALUE:
                    return SDK_INIT_API;
                case AD_START_EVENT_VALUE:
                    return AD_START_EVENT;
                case AD_CLICK_EVENT_VALUE:
                    return AD_CLICK_EVENT;
                case 48:
                    return AD_SHOW_TO_VALIDATION_DURATION_MS;
                case 49:
                    return AD_VALIDATION_TO_PRESENT_DURATION_MS;
                case 50:
                    return AD_LEAVE_APPLICATION;
                case 51:
                    return AD_REWARD_USER;
                case 52:
                    return AD_REQUIRED_DOWNLOAD_DURATION_MS;
                case 53:
                    return AD_OPTIONAL_DOWNLOAD_DURATION_MS;
                case 54:
                    return AD_BACKGROUND_BEFORE_IMPRESSION;
                case 55:
                    return AD_CLOSED_BEFORE_IMPRESSION;
                case AD_VISIBILITY_VALUE:
                    return AD_VISIBILITY;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    return INIT_TO_SUCCESS_CALLBACK_DURATION_MS;
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    return INIT_TO_FAIL_CALLBACK_DURATION_MS;
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    return AD_START_TO_BACKGROUND_DURATION_MS;
                case 60:
                    return ASSET_PARTIAL_DOWNLOAD_DURATION_MS;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    return APP_BACKGROUND_DURING_AD_LOAD;
                case DEPRECATED_API_USED_VALUE:
                    return DEPRECATED_API_USED;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    return AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET;
                case 64:
                    return AD_PRELOAD_TO_READY_DURATION_MS;
                case 65:
                    return CONCURRENT_CACHED_WEBVIEW_COUNT;
                case BLACK_SCREEN_IS_DETECTED_VALUE:
                    return BLACK_SCREEN_IS_DETECTED;
                case NATIVE_PLAY_ASSET_TYPE_VALUE:
                    return NATIVE_PLAY_ASSET_TYPE;
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    return NATIVE_VIDEO_PREPARE_DURATION_MS;
                case NATIVE_AD_DISPLAY_DURATION_VALUE:
                    return NATIVE_AD_DISPLAY_DURATION;
                case ASSET_DOWNLOAD_RETRY_STATUS_VALUE:
                    return ASSET_DOWNLOAD_RETRY_STATUS;
                case AD_VISIBLE_DURATION_MS_VALUE:
                    return AD_VISIBLE_DURATION_MS;
                default:
                    switch (i10) {
                        case 2000:
                            return SKOVERLAY_PRESENTED_FOR_AD;
                        case 2001:
                            return SAFARI_PRESENTED_FOR_AD;
                        case 2002:
                            return STORE_KIT_PRESENTED_FOR_AD;
                        case 2003:
                            return STORE_KIT_NOT_READY;
                        case 2004:
                            return LAUNCH_STORE_KIT_REQUEST;
                        case 2005:
                            return LAUNCH_SKOVERLAY_REQUEST;
                        case 2006:
                            return LAUNCH_SAFARI_REQUEST;
                        case 2007:
                            return IDFV_RESTRICTED;
                        case 2008:
                            return NOTIFICATION_WAIT_FOR_CONNECTIVITY;
                        case 2009:
                            return IDFV_VALUE_CHANGED;
                        case 2010:
                            return AD_WILL_CLOSE;
                        case 2011:
                            return APP_TERM_DURING_AD_BEFORE_IMPRESSION;
                        case 2012:
                            return HANDLE_TAP_REQUEST;
                        case 2013:
                            return HANDLE_TAP_SUCCESS;
                        default:
                            switch (i10) {
                                case 3001:
                                    return HARDWARE_ACCELERATE_DISABLED;
                                case 3002:
                                    return BANNER_AUTO_REDIRECT;
                                case 3003:
                                    return BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL;
                                case 3004:
                                    return INLINE_INSTALL_STATUS;
                                default:
                                    return null;
                            }
                    }
            }
        }

        public static a0.d internalGetValueMap() {
            return internalValueMap;
        }

        public static a0.e internalGetVerifier() {
            return C0529b.INSTANCE;
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
        Sdk$SDKMetric sdk$SDKMetric = new Sdk$SDKMetric();
        DEFAULT_INSTANCE = sdk$SDKMetric;
        y.registerDefaultInstance(Sdk$SDKMetric.class, sdk$SDKMetric);
    }

    private Sdk$SDKMetric() {
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
    public void clearConnectionType() {
        this.connectionType_ = getDefaultInstance().getConnectionType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectionTypeDetail() {
        this.connectionTypeDetail_ = getDefaultInstance().getConnectionTypeDetail();
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
    public void clearMeta() {
        this.meta_ = getDefaultInstance().getMeta();
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
    public void clearSessionId() {
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVmVersion() {
        this.vmVersion_ = getDefaultInstance().getVmVersion();
    }

    public static Sdk$SDKMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static Sdk$SDKMetric parseDelimitedFrom(InputStream inputStream) {
        return (Sdk$SDKMetric) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKMetric parseFrom(ByteBuffer byteBuffer) {
        return (Sdk$SDKMetric) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setMeta(String str) {
        str.getClass();
        this.meta_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetaBytes(i iVar) {
        com.google.protobuf.a.checkByteStringIsUtf8(iVar);
        this.meta_ = iVar.toStringUtf8();
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
    public void setType(b bVar) {
        this.type_ = bVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i10) {
        this.type_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(long j10) {
        this.value_ = j10;
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

    @Override // com.vungle.ads.internal.protos.e
    public long getAdLoadType() {
        return this.adLoadType_;
    }

    @Override // com.vungle.ads.internal.protos.e
    public String getAdSource() {
        return this.adSource_;
    }

    @Override // com.vungle.ads.internal.protos.e
    public i getAdSourceBytes() {
        return i.copyFromUtf8(this.adSource_);
    }

    @Override // com.vungle.ads.internal.protos.e
    public String getAdState() {
        return this.adState_;
    }

    @Override // com.vungle.ads.internal.protos.e
    public i getAdStateBytes() {
        return i.copyFromUtf8(this.adState_);
    }

    @Override // com.vungle.ads.internal.protos.e
    public String getAdapterAdFormat() {
        return this.adapterAdFormat_;
    }

    @Override // com.vungle.ads.internal.protos.e
    public i getAdapterAdFormatBytes() {
        return i.copyFromUtf8(this.adapterAdFormat_);
    }

    @Override // com.vungle.ads.internal.protos.e
    public long getAppState() {
        return this.appState_;
    }

    @Override // com.vungle.ads.internal.protos.e
    public String getConnectionType() {
        return this.connectionType_;
    }

    @Override // com.vungle.ads.internal.protos.e
    public i getConnectionTypeBytes() {
        return i.copyFromUtf8(this.connectionType_);
    }

    @Override // com.vungle.ads.internal.protos.e
    public String getConnectionTypeDetail() {
        return this.connectionTypeDetail_;
    }

    @Override // com.vungle.ads.internal.protos.e
    public i getConnectionTypeDetailBytes() {
        return i.copyFromUtf8(this.connectionTypeDetail_);
    }

    @Override // com.vungle.ads.internal.protos.e
    public String getCreativeId() {
        return this.creativeId_;
    }

    @Override // com.vungle.ads.internal.protos.e
    public i getCreativeIdBytes() {
        return i.copyFromUtf8(this.creativeId_);
    }

    @Override // com.vungle.ads.internal.protos.e
    public String getEventId() {
        return this.eventId_;
    }

    @Override // com.vungle.ads.internal.protos.e
    public i getEventIdBytes() {
        return i.copyFromUtf8(this.eventId_);
    }

    @Override // com.vungle.ads.internal.protos.e
    public String getExperiments() {
        return this.experiments_;
    }

    @Override // com.vungle.ads.internal.protos.e
    public i getExperimentsBytes() {
        return i.copyFromUtf8(this.experiments_);
    }

    @Override // com.vungle.ads.internal.protos.e
    public boolean getIsAdPodding() {
        return this.isAdPodding_;
    }

    @Override // com.vungle.ads.internal.protos.e
    public boolean getIsAdoEnabled() {
        return this.isAdoEnabled_;
    }

    @Override // com.vungle.ads.internal.protos.e
    public long getIsHbPlacement() {
        return this.isHbPlacement_;
    }

    @Override // com.vungle.ads.internal.protos.e
    public boolean getIsLowDataModeEnabled() {
        return this.isLowDataModeEnabled_;
    }

    @Override // com.vungle.ads.internal.protos.e
    public boolean getIsPartialDownloadEnabled() {
        return this.isPartialDownloadEnabled_;
    }

    @Override // com.vungle.ads.internal.protos.e
    public String getMake() {
        return this.make_;
    }

    @Override // com.vungle.ads.internal.protos.e
    public i getMakeBytes() {
        return i.copyFromUtf8(this.make_);
    }

    @Override // com.vungle.ads.internal.protos.e
    public String getMediationName() {
        return this.mediationName_;
    }

    @Override // com.vungle.ads.internal.protos.e
    public i getMediationNameBytes() {
        return i.copyFromUtf8(this.mediationName_);
    }

    @Override // com.vungle.ads.internal.protos.e
    public String getMeta() {
        return this.meta_;
    }

    @Override // com.vungle.ads.internal.protos.e
    public i getMetaBytes() {
        return i.copyFromUtf8(this.meta_);
    }

    @Override // com.vungle.ads.internal.protos.e
    public String getModel() {
        return this.model_;
    }

    @Override // com.vungle.ads.internal.protos.e
    public i getModelBytes() {
        return i.copyFromUtf8(this.model_);
    }

    @Override // com.vungle.ads.internal.protos.e
    public String getOs() {
        return this.os_;
    }

    @Override // com.vungle.ads.internal.protos.e
    public i getOsBytes() {
        return i.copyFromUtf8(this.os_);
    }

    @Override // com.vungle.ads.internal.protos.e
    public String getOsVersion() {
        return this.osVersion_;
    }

    @Override // com.vungle.ads.internal.protos.e
    public i getOsVersionBytes() {
        return i.copyFromUtf8(this.osVersion_);
    }

    @Override // com.vungle.ads.internal.protos.e
    public String getPlacementReferenceId() {
        return this.placementReferenceId_;
    }

    @Override // com.vungle.ads.internal.protos.e
    public i getPlacementReferenceIdBytes() {
        return i.copyFromUtf8(this.placementReferenceId_);
    }

    @Override // com.vungle.ads.internal.protos.e
    public String getPlacementType() {
        return this.placementType_;
    }

    @Override // com.vungle.ads.internal.protos.e
    public i getPlacementTypeBytes() {
        return i.copyFromUtf8(this.placementType_);
    }

    @Override // com.vungle.ads.internal.protos.e
    public String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.vungle.ads.internal.protos.e
    public i getSessionIdBytes() {
        return i.copyFromUtf8(this.sessionId_);
    }

    @Override // com.vungle.ads.internal.protos.e
    public b getType() {
        b bVarForNumber = b.forNumber(this.type_);
        return bVarForNumber == null ? b.UNRECOGNIZED : bVarForNumber;
    }

    @Override // com.vungle.ads.internal.protos.e
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.vungle.ads.internal.protos.e
    public long getValue() {
        return this.value_;
    }

    @Override // com.vungle.ads.internal.protos.e
    public String getVmVersion() {
        return this.vmVersion_;
    }

    @Override // com.vungle.ads.internal.protos.e
    public i getVmVersionBytes() {
        return i.copyFromUtf8(this.vmVersion_);
    }

    public static a newBuilder(Sdk$SDKMetric sdk$SDKMetric) {
        return (a) DEFAULT_INSTANCE.createBuilder(sdk$SDKMetric);
    }

    public static Sdk$SDKMetric parseDelimitedFrom(InputStream inputStream, p pVar) {
        return (Sdk$SDKMetric) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pVar);
    }

    public static Sdk$SDKMetric parseFrom(ByteBuffer byteBuffer, p pVar) {
        return (Sdk$SDKMetric) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, pVar);
    }

    @Override // com.google.protobuf.y
    protected final Object dynamicMethod(y.h hVar, Object obj, Object obj2) {
        c1 cVar;
        com.vungle.ads.internal.protos.a aVar = null;
        switch (com.vungle.ads.internal.protos.a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[hVar.ordinal()]) {
            case 1:
                return new Sdk$SDKMetric();
            case 2:
                return new a(aVar);
            case 3:
                return y.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001b\u0000\u0000\u0001É\u001b\u0000\u0000\u0000\u0001\f\u0002\u0002\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ\rȈ\u000e\u0002\u000fȈ\u0010Ȉ\u0011Ȉ\u0012\u0002\u0013Ȉ\u0014\u0007\u0015\u0007\u0016\u0007\u0017Ȉ\u0018Ȉ\u0019\u0002\u001aȈÉ\u0007", new Object[]{"type_", lkCBSIFlvmyGX.dqIYip, "meta_", "make_", "model_", "os_", "osVersion_", "connectionType_", "connectionTypeDetail_", "placementReferenceId_", "creativeId_", "eventId_", "sessionId_", "isHbPlacement_", "placementType_", "adSource_", "mediationName_", "appState_", "vmVersion_", "isAdoEnabled_", XTkUEXuiK.RdkahqBvJuAFHq, "isAdPodding_", "adState_", "experiments_", "adLoadType_", "adapterAdFormat_", "isLowDataModeEnabled_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                c1 c1Var = PARSER;
                if (c1Var != null) {
                    return c1Var;
                }
                synchronized (Sdk$SDKMetric.class) {
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

    public static Sdk$SDKMetric parseFrom(i iVar) {
        return (Sdk$SDKMetric) y.parseFrom(DEFAULT_INSTANCE, iVar);
    }

    public static Sdk$SDKMetric parseFrom(i iVar, p pVar) {
        return (Sdk$SDKMetric) y.parseFrom(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static Sdk$SDKMetric parseFrom(byte[] bArr) {
        return (Sdk$SDKMetric) y.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Sdk$SDKMetric parseFrom(byte[] bArr, p pVar) {
        return (Sdk$SDKMetric) y.parseFrom(DEFAULT_INSTANCE, bArr, pVar);
    }

    public static Sdk$SDKMetric parseFrom(InputStream inputStream) {
        return (Sdk$SDKMetric) y.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKMetric parseFrom(InputStream inputStream, p pVar) {
        return (Sdk$SDKMetric) y.parseFrom(DEFAULT_INSTANCE, inputStream, pVar);
    }

    public static Sdk$SDKMetric parseFrom(j jVar) {
        return (Sdk$SDKMetric) y.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static Sdk$SDKMetric parseFrom(j jVar, p pVar) {
        return (Sdk$SDKMetric) y.parseFrom(DEFAULT_INSTANCE, jVar, pVar);
    }
}

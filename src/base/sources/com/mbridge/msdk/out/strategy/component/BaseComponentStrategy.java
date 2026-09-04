package com.mbridge.msdk.out.strategy.component;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import ud.qoRq.WwUgngZLNA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseComponentStrategy {
    protected static final long DEFAULT_TIMEOUT_MS = 3000;
    protected static final Handler MAIN_HANDLER = new Handler(Looper.getMainLooper());
    protected static final String TAG = "BaseComponentStrategy";
    protected int adType;
    protected String bidToken;
    protected String extraData;
    protected com.mbridge.msdk.config.manager.callback.b mComponentCallbackListener;
    protected NewInterstitialListener newInterstitialListener;
    protected String placementId;
    protected com.mbridge.msdk.video.bt.module.orglistener.g rewardVideoListener;
    protected String unitId;
    protected String userId;
    protected boolean isReady = true;
    protected boolean isRewardPlusOpen = false;
    protected int isSilent = 0;
    protected Map<String, Object> developerSettingMap = new HashMap();
    protected volatile boolean isQuerying = false;
    protected volatile Looper triggerThreadLooper = null;

    /* JADX INFO: renamed from: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    class AnonymousClass1 implements com.mbridge.msdk.config.manager.callback.b {
        AnonymousClass1() {
        }

        public static /* synthetic */ void a(AnonymousClass1 anonymousClass1, MBridgeIds mBridgeIds) {
            com.mbridge.msdk.video.bt.module.orglistener.g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onVideoLoadSuccess(mBridgeIds);
            }
        }

        public static /* synthetic */ void b(AnonymousClass1 anonymousClass1, MBridgeIds mBridgeIds) {
            com.mbridge.msdk.video.bt.module.orglistener.g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onEndcardShow(mBridgeIds);
            }
        }

        public static /* synthetic */ void c(AnonymousClass1 anonymousClass1, MBridgeIds mBridgeIds) {
            com.mbridge.msdk.video.bt.module.orglistener.g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onVideoComplete(mBridgeIds);
            }
        }

        public static /* synthetic */ void d(AnonymousClass1 anonymousClass1, MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
            com.mbridge.msdk.video.bt.module.orglistener.g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onAdClose(mBridgeIds, rewardInfo);
            }
        }

        public static /* synthetic */ void e(AnonymousClass1 anonymousClass1, MBridgeIds mBridgeIds, String str) {
            com.mbridge.msdk.video.bt.module.orglistener.g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onVideoLoadFail(mBridgeIds, str);
            }
        }

        public static /* synthetic */ void f(AnonymousClass1 anonymousClass1, MBridgeIds mBridgeIds) {
            com.mbridge.msdk.video.bt.module.orglistener.g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onVideoAdClicked(mBridgeIds);
            }
        }

        public static /* synthetic */ void g(AnonymousClass1 anonymousClass1, MBridgeIds mBridgeIds, String str) {
            com.mbridge.msdk.video.bt.module.orglistener.g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onShowFail(mBridgeIds, str);
            }
        }

        public static /* synthetic */ void h(AnonymousClass1 anonymousClass1, MBridgeIds mBridgeIds) {
            com.mbridge.msdk.video.bt.module.orglistener.g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onAdShow(mBridgeIds);
            }
        }

        public static /* synthetic */ void i(AnonymousClass1 anonymousClass1, MBridgeIds mBridgeIds) {
            com.mbridge.msdk.video.bt.module.orglistener.g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onLoadSuccess(mBridgeIds);
            }
        }

        public void onAdCloseWithIVReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onAdShow(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.a
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass1.h(this.f31904a, mBridgeIds);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "showResult", 1);
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onEndCardShow(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.d
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass1.b(this.f31912a, mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onLoadSuccess(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.h
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass1.i(this.f31921a, mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onShowFail(final MBridgeIds mBridgeIds, final String str) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.g
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass1.g(this.f31918a, mBridgeIds, str);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "showResult", 2);
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoAdClicked(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.f
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass1.f(this.f31916a, mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoComplete(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.e
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass1.c(this.f31914a, mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoLoadFail(final MBridgeIds mBridgeIds, final String str) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.b
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass1.e(this.f31906a, mBridgeIds, str);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "loadEnd", 2);
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoLoadSuccess(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.i
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass1.a(this.f31923a, mBridgeIds);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "loadEnd", 1);
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onAdClose(final MBridgeIds mBridgeIds, final RewardInfo rewardInfo) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.c
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass1.d(this.f31909a, mBridgeIds, rewardInfo);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, WwUgngZLNA.LLgBhMMXrwcws, 0);
        }
    }

    public BaseComponentStrategy(String str, String str2, int i10) {
        this.placementId = str;
        this.unitId = str2;
        this.adType = i10;
        String str3 = i10 == 94 ? "rv_init" : i10 == 287 ? "iv_init" : "";
        if (!TextUtils.isEmpty(str3)) {
            sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), str3, null);
        }
        recordTriggerThread();
    }

    private com.mbridge.msdk.config.manager.callback.b createInterstitialVideoListener() {
        return new AnonymousClass2();
    }

    private com.mbridge.msdk.config.manager.callback.b createRewardVideoListener() {
        return new AnonymousClass1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    public void sendApiEndMetrics(MBridgeIds mBridgeIds, String str, int i10) {
        byte b10;
        String str2;
        try {
            int iHashCode = str.hashCode();
            if (iHashCode != -1178337387) {
                if (iHashCode != 336615957) {
                    if (iHashCode == 740662650 && str.equals("showResult")) {
                        b10 = 1;
                    } else {
                        b10 = -1;
                    }
                } else if (str.equals("loadEnd")) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("adClose")) {
                b10 = 2;
            } else {
                b10 = -1;
            }
            String str3 = "";
            if (b10 == 0) {
                str2 = "m_pipe_load_end";
            } else if (b10 != 1) {
                str2 = b10 != 2 ? "" : "m_pipe_show_close";
            } else {
                str2 = "m_pipe_show_result";
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            HashMap map = new HashMap();
            String contextId = mBridgeIds != null ? mBridgeIds.getContextId() : "";
            if (!TextUtils.isEmpty(contextId)) {
                str3 = contextId;
            }
            map.put("context_id", str3);
            map.put("result", Integer.valueOf(i10));
            HashMap map2 = new HashMap();
            map2.put(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, this.placementId);
            map2.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.unitId);
            map2.put("ad_type", Integer.valueOf(this.adType));
            map.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, map2);
            com.mbridge.msdk.config.component.common.metrics.b.a(str2, map);
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    private void sendApiStartMetrics(String str, String str2, Map<String, Object> map) {
        String str3;
        try {
            if (!str2.equals("c1") && !str2.equals("c2") && !str2.equals("c3")) {
                return;
            }
            HashMap map2 = new HashMap();
            map2.put("context_id", str);
            HashMap map3 = new HashMap(map);
            map3.remove("sdk_context");
            map2.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, map3);
            if (str2.equals("c1")) {
                str3 = "m_pipe_load_start";
            } else {
                str3 = str2.equals("c2") ? "m_pipe_show_start" : "m_pipe_isready_start";
            }
            com.mbridge.msdk.config.component.common.metrics.b.a(str3, map2);
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    private void sendReadyEndMetrics(String str, Object obj, long j10) {
        try {
            HashMap map = new HashMap();
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            map.put("context_id", str);
            map.put("result", Integer.valueOf(obj instanceof Boolean ? ((Boolean) obj).booleanValue() : false ? 1 : 2));
            map.put("duration", Long.valueOf(j10));
            HashMap map2 = new HashMap();
            map2.put(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, this.placementId);
            map2.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.unitId);
            map2.put("ad_type", Integer.valueOf(this.adType));
            map.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, map2);
            com.mbridge.msdk.config.component.common.metrics.b.a("m_pipe_isready_end", map);
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    public void clearBitmapCache() {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a();
    }

    public void clearVideoCache() {
        o0.b();
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c20", null);
    }

    public String getCreativeIdWithUnitId() {
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c18", null);
        if (com.mbridge.msdk.config.manager.a.c().b().b((Object) "creativeId") == null) {
            return "";
        }
        Object objB = com.mbridge.msdk.config.manager.a.c().b().b((Object) "creativeId");
        if (!(objB instanceof Map)) {
            return "";
        }
        Object obj = ((Map) objB).get(this.unitId);
        return obj instanceof String ? (String) obj : "";
    }

    public String getRequestId() {
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c17", null);
        if (com.mbridge.msdk.config.manager.a.c().b().b((Object) "requestId") == null) {
            return "";
        }
        Object objB = com.mbridge.msdk.config.manager.a.c().b().b((Object) "requestId");
        return objB instanceof String ? (String) objB : "";
    }

    protected synchronized boolean isReadyWithSyncWait(boolean z10) {
        try {
            if (this.isQuerying) {
                return false;
            }
            try {
                try {
                    this.isQuerying = true;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    com.mbridge.msdk.config.component.common.util.a aVar = new com.mbridge.msdk.config.component.common.util.a();
                    gi.a aVar2 = new gi.a(aVar);
                    HashMap map = new HashMap();
                    map.put("callback", aVar2);
                    HashMap map2 = new HashMap();
                    map2.put("bid_token", TextUtils.isEmpty(this.bidToken) ? "" : this.bidToken);
                    map2.put("is_hb", Integer.valueOf(z10 ? 1 : 0));
                    map2.put("sdk_context", map);
                    String strA = com.mbridge.msdk.config.component.common.util.c.a();
                    sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c3", map2);
                    Map map3 = (Map) aVar.a(com.mbridge.msdk.config.manager.a.f29567k);
                    this.isQuerying = false;
                    if (map3 != null) {
                        Object obj = map3.get("ready_state");
                        sendReadyEndMetrics(strA, obj, System.currentTimeMillis() - jCurrentTimeMillis);
                        if (obj instanceof Boolean) {
                            return ((Boolean) obj).booleanValue();
                        }
                    }
                    return false;
                } catch (Exception e10) {
                    q0.b(TAG, "isReadyWithSyncWait error: " + e10.getMessage(), e10);
                    return false;
                }
            } catch (InterruptedException e11) {
                q0.b(TAG, "isReadyWithSyncWait interrupted: " + e11.getMessage(), e11);
                return false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void playVideoMute(int i10) {
        this.isSilent = i10;
        this.developerSettingMap.put("mute_state", Integer.valueOf(i10));
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c13", null);
    }

    protected void recordTriggerThread() {
        this.triggerThreadLooper = Looper.myLooper();
    }

    protected void sendApiCallEvent(String str, String str2, Map<String, Object> map) {
        try {
            Map<String, Object> map2 = new HashMap<>();
            map2.put(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, this.placementId);
            map2.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.unitId);
            map2.put("ad_type", Integer.valueOf(this.adType));
            map2.putAll(this.developerSettingMap);
            if (map != null && !map.isEmpty()) {
                map2.putAll(map);
            }
            if (!map2.containsKey("sdk_context")) {
                HashMap map3 = new HashMap();
                map3.put("callback", this.mComponentCallbackListener);
                map2.put("sdk_context", map3);
            }
            com.mbridge.msdk.config.manager.a.c().b(str, str2, map2);
            sendApiStartMetrics(str, str2, map2);
        } catch (Exception e10) {
            q0.b(TAG, "sendComponentEvent error: " + e10.getMessage(), e10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        try {
            HashMap map = new HashMap();
            map.put(CampaignEx.JSON_KEY_TITLE, str);
            map.put("content", str2);
            map.put("confirm", str3);
            map.put("cancel", str4);
            this.developerSettingMap.put("dialog_config", map);
            sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c14", map);
        } catch (Exception e10) {
            q0.b(TAG, "BaseComponentStrategy setAlertDialogText error: " + e10.getMessage(), e10);
        }
    }

    public void setExtraInfo(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return;
        }
        HashMap map = new HashMap();
        map.put("extra_info", jSONObject);
        this.developerSettingMap.put("extra_info", jSONObject);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c16", map);
    }

    public void setIVRewardEnable(int i10, int i11) {
        int i12 = i10 == com.mbridge.msdk.foundation.same.a.H ? 2 : i10;
        if (i10 == com.mbridge.msdk.foundation.same.a.I) {
            i12 = 4;
        }
        HashMap map = new HashMap();
        map.put("ivReward_type", Integer.valueOf(i12));
        map.put("ivReward_value", Integer.valueOf(i11));
        this.developerSettingMap.put("iv_reward", map);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c19", map);
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.newInterstitialListener = newInterstitialListener;
        this.mComponentCallbackListener = createInterstitialVideoListener();
    }

    public void setRewardPlus(boolean z10) {
        this.isRewardPlusOpen = z10;
        this.developerSettingMap.put("reward_plus_open", Boolean.valueOf(z10));
        HashMap map = new HashMap();
        map.put("reward_plus_open", Boolean.valueOf(z10));
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c15", map);
    }

    @Deprecated
    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.newInterstitialListener = newInterstitialListener;
        this.mComponentCallbackListener = createInterstitialVideoListener();
    }

    protected void threadConsistentCallback(Runnable runnable) {
        if (this.triggerThreadLooper == Looper.getMainLooper()) {
            MAIN_HANDLER.post(runnable);
        } else {
            runnable.run();
        }
    }

    public void setRewardVideoListener(com.mbridge.msdk.video.bt.module.orglistener.g gVar) {
        this.rewardVideoListener = gVar;
        this.mComponentCallbackListener = createRewardVideoListener();
    }

    public void setIVRewardEnable(int i10, double d10) {
        int i11 = i10 == com.mbridge.msdk.foundation.same.a.H ? 1 : i10;
        if (i10 == com.mbridge.msdk.foundation.same.a.I) {
            i11 = 3;
        }
        HashMap map = new HashMap();
        map.put("ivReward_type", Integer.valueOf(i11));
        map.put("ivReward_value", Double.valueOf(d10));
        this.developerSettingMap.put("iv_reward", map);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c19", map);
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class AnonymousClass2 implements com.mbridge.msdk.config.manager.callback.b {
        AnonymousClass2() {
        }

        public static /* synthetic */ void a(AnonymousClass2 anonymousClass2, MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onLoadCampaignSuccess(mBridgeIds);
            }
        }

        public static /* synthetic */ void b(AnonymousClass2 anonymousClass2, MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onResourceLoadSuccess(mBridgeIds);
            }
        }

        public static /* synthetic */ void c(AnonymousClass2 anonymousClass2, MBridgeIds mBridgeIds, String str) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onResourceLoadFail(mBridgeIds, str);
            }
        }

        public static /* synthetic */ void d(AnonymousClass2 anonymousClass2, MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onAdClose(mBridgeIds, rewardInfo);
            }
        }

        public static /* synthetic */ void e(AnonymousClass2 anonymousClass2, MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onAdShow(mBridgeIds);
            }
        }

        public static /* synthetic */ void f(AnonymousClass2 anonymousClass2, MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onAdClicked(mBridgeIds);
            }
        }

        public static /* synthetic */ void g(AnonymousClass2 anonymousClass2, MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onEndcardShow(mBridgeIds);
            }
        }

        public static /* synthetic */ void h(AnonymousClass2 anonymousClass2, MBridgeIds mBridgeIds, String str) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onShowFail(mBridgeIds, str);
            }
        }

        public static /* synthetic */ void i(AnonymousClass2 anonymousClass2, MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onVideoComplete(mBridgeIds);
            }
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onAdClose(final MBridgeIds mBridgeIds, final RewardInfo rewardInfo) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.m
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass2.d(this.f31932a, mBridgeIds, rewardInfo);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "adClose", 0);
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onAdShow(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.n
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass2.e(this.f31935a, mBridgeIds);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "showResult", 2);
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onEndCardShow(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.k
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass2.g(this.f31927a, mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onLoadSuccess(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.o
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass2.a(this.f31937a, mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onShowFail(final MBridgeIds mBridgeIds, final String str) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.l
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass2.h(this.f31929a, mBridgeIds, str);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "showResult", 2);
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoAdClicked(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.j
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass2.f(this.f31925a, mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoComplete(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.p
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass2.i(this.f31939a, mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoLoadFail(final MBridgeIds mBridgeIds, final String str) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.q
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass2.c(this.f31941a, mBridgeIds, str);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "loadEnd", 2);
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoLoadSuccess(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.r
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass2.b(this.f31944a, mBridgeIds);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "loadEnd", 1);
        }

        public void onAdCloseWithIVReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        }
    }
}

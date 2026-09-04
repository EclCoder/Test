package com.vungle.ads.internal.presenter;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.LinkError;
import com.vungle.ads.PrivacyUrlError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.TpatError;
import com.vungle.ads.d0;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.internal.util.q;
import fl.w;
import gl.l0;
import gl.r;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class j {
    public static final a Companion = new a(null);
    public static final String DOWNLOAD = "download";
    public static final String OPEN_PRIVACY = "openPrivacy";
    private static final String TAG = "NativeAdPresenter";
    public static final String TPAT = "tpat";
    private Long adStartTime;
    private final com.vungle.ads.internal.model.b advertisement;
    private com.vungle.ads.internal.presenter.a bus;
    private com.vungle.ads.internal.d clickCoordinateTracker;
    private final Context context;
    private Dialog currentDialog;
    private final k delegate;
    private final Map<Integer, Boolean> firedOMEventMap;
    private final Map<String, Boolean> firedTpatMap;
    private final fl.k logEntry$delegate;
    private final Map<Integer, Boolean> multipleOMEventEnabledMap;
    private final Map<String, Boolean> multipleTpatEnabledMap;
    private com.vungle.ads.internal.omsdk.a omTracker;
    private final com.vungle.ads.internal.platform.f platform;
    private final fl.k tpatSender$delegate;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class b extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.omsdk.c, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.omsdk.c invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.omsdk.c.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class c extends t implements tl.a {
        c() {
            super(0);
        }

        @Override // tl.a
        public final p invoke() {
            return j.this.advertisement.getLogEntry();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class d implements com.vungle.ads.internal.ui.c {
        final /* synthetic */ String $deeplinkUrl;
        final /* synthetic */ j this$0;

        d(String str, j jVar) {
            this.$deeplinkUrl = str;
            this.this$0 = jVar;
        }

        @Override // com.vungle.ads.internal.ui.c
        public void onDeeplinkClick(boolean z10) {
            if (!z10) {
                new LinkError(Sdk$SDKError.b.DEEPLINK_OPEN_FAILED, "Fail to open " + this.$deeplinkUrl).setLogEntry$vungle_ads_release(this.this$0.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
            }
            List tpatUrls$default = com.vungle.ads.internal.model.b.getTpatUrls$default(this.this$0.advertisement, com.vungle.ads.internal.f.DEEPLINK_CLICK, String.valueOf(z10), null, 4, null);
            if (tpatUrls$default != null) {
                j jVar = this.this$0;
                Iterator it = tpatUrls$default.iterator();
                while (it.hasNext()) {
                    com.vungle.ads.internal.network.i.sendTpat$default(jVar.getTpatSender(), new com.vungle.ads.internal.network.g.a((String) it.next()).tpatKey(com.vungle.ads.internal.f.DEEPLINK_CLICK).withLogEntry(jVar.getLogEntry()).build(), false, 2, null);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class e extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.i, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.network.i invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.i.class);
        }
    }

    public j(Context context, k delegate, com.vungle.ads.internal.model.b advertisement, com.vungle.ads.internal.platform.f platform) {
        s.h(context, "context");
        s.h(delegate, "delegate");
        s.h(advertisement, "advertisement");
        s.h(platform, "platform");
        this.context = context;
        this.delegate = delegate;
        this.advertisement = advertisement;
        this.platform = platform;
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        this.tpatSender$delegate = fl.l.a(fl.o.SYNCHRONIZED, new e(context));
        this.logEntry$delegate = fl.l.b(new c());
        this.firedTpatMap = new LinkedHashMap();
        Boolean bool = Boolean.TRUE;
        this.multipleTpatEnabledMap = l0.l(w.a(com.vungle.ads.internal.f.TPAT_VIDEO_MUTE, bool), w.a(com.vungle.ads.internal.f.TPAT_VIDEO_UNMUTE, bool));
        this.firedOMEventMap = new LinkedHashMap();
        this.multipleOMEventEnabledMap = l0.l(w.a(8, bool), w.a(9, bool), w.a(10, bool));
        this.clickCoordinateTracker = new com.vungle.ads.internal.d(context, advertisement);
    }

    public static /* synthetic */ void getClickCoordinateTracker$vungle_ads_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p getLogEntry() {
        return (p) this.logEntry$delegate.getValue();
    }

    public static /* synthetic */ void getOmTracker$vungle_ads_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.vungle.ads.internal.network.i getTpatSender() {
        return (com.vungle.ads.internal.network.i) this.tpatSender$delegate.getValue();
    }

    /* JADX INFO: renamed from: initAndStartOMTracker$lambda-9, reason: not valid java name */
    private static final com.vungle.ads.internal.omsdk.c m132initAndStartOMTracker$lambda9(fl.k kVar) {
        return (com.vungle.ads.internal.omsdk.c) kVar.getValue();
    }

    private final boolean needShowGdpr() {
        return com.vungle.ads.internal.e.INSTANCE.getGDPRIsCountryDataProtected() && s.c("unknown", yj.c.INSTANCE.getConsentStatus());
    }

    private final void onDownload(String str) throws Throwable {
        com.vungle.ads.internal.presenter.a aVar;
        processCommand$default(this, "tpat", com.vungle.ads.internal.f.CLICK_URL, null, 4, null);
        processCommand("tpat", com.vungle.ads.internal.f.CTA_URL, str);
        com.vungle.ads.internal.model.b.c cVarAdUnit = this.advertisement.adUnit();
        String deeplinkUrl = cVarAdUnit != null ? cVarAdUnit.getDeeplinkUrl() : null;
        boolean zLaunch$vungle_ads_release = com.vungle.ads.internal.util.h.INSTANCE.launch$vungle_ads_release(deeplinkUrl, str, this.context, getLogEntry(), new d(deeplinkUrl, this));
        com.vungle.ads.internal.presenter.a aVar2 = this.bus;
        if (aVar2 != null) {
            aVar2.onNext(g.OPEN, "adClick", this.delegate.getPlacementRefId());
        }
        if (!zLaunch$vungle_ads_release || (aVar = this.bus) == null) {
            return;
        }
        aVar.onNext(g.OPEN, "adLeftApplication", this.delegate.getPlacementRefId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onOMEvent$default(j jVar, int i10, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = null;
        }
        jVar.onOMEvent(i10, map);
    }

    private final void onPrivacy(String str) throws Throwable {
        com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, new d0(Sdk$SDKMetric.b.PRIVACY_URL_OPENED), getLogEntry(), (String) null, 4, (Object) null);
        if (str != null) {
            if (!com.vungle.ads.internal.util.j.INSTANCE.isValidUrl(str)) {
                new PrivacyUrlError(str).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                return;
            }
            if (!com.vungle.ads.internal.util.h.launch$vungle_ads_release$default(com.vungle.ads.internal.util.h.INSTANCE, null, str, this.context, getLogEntry(), null, 16, null)) {
                new PrivacyUrlError(str).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                return;
            }
            com.vungle.ads.internal.presenter.a aVar = this.bus;
            if (aVar != null) {
                aVar.onNext(g.OPEN, "adLeftApplication", this.delegate.getPlacementRefId());
            }
        }
    }

    public static /* synthetic */ void processCommand$default(j jVar, String str, String str2, String str3, int i10, Object obj) throws Throwable {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        jVar.processCommand(str, str2, str3);
    }

    private final void showGdpr() {
        yj.c.INSTANCE.updateGdprConsent("opted_out_by_timeout", "vungle_modal", null);
        if (!(this.context instanceof Activity)) {
            q.Companion.w(TAG, "We can not show GDPR dialog with application context.");
            return;
        }
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.vungle.ads.internal.presenter.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                j.m133showGdpr$lambda7(this.f35849a, dialogInterface, i10);
            }
        };
        com.vungle.ads.internal.e eVar = com.vungle.ads.internal.e.INSTANCE;
        String gDPRConsentTitle = eVar.getGDPRConsentTitle();
        String gDPRConsentMessage = eVar.getGDPRConsentMessage();
        String gDPRButtonAccept = eVar.getGDPRButtonAccept();
        String gDPRButtonDeny = eVar.getGDPRButtonDeny();
        Context context = this.context;
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(context, ((Activity) context).getApplicationInfo().theme));
        if (gDPRConsentTitle != null && gDPRConsentTitle.length() != 0) {
            builder.setTitle(gDPRConsentTitle);
        }
        if (gDPRConsentMessage != null && gDPRConsentMessage.length() != 0) {
            builder.setMessage(gDPRConsentMessage);
        }
        builder.setPositiveButton(gDPRButtonAccept, onClickListener);
        builder.setNegativeButton(gDPRButtonDeny, onClickListener);
        builder.setCancelable(false);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.vungle.ads.internal.presenter.i
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                j.m134showGdpr$lambda8(this.f35850a, dialogInterface);
            }
        });
        this.currentDialog = alertDialogCreate;
        alertDialogCreate.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showGdpr$lambda-7, reason: not valid java name */
    public static final void m133showGdpr$lambda7(j this$0, DialogInterface dialogInterface, int i10) {
        String value;
        s.h(this$0, "this$0");
        if (i10 != -2) {
            value = i10 != -1 ? "opted_out_by_timeout" : yj.b.OPT_IN.getValue();
        } else {
            value = yj.b.OPT_OUT.getValue();
        }
        yj.c.INSTANCE.updateGdprConsent(value, "vungle_modal", null);
        this$0.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showGdpr$lambda-8, reason: not valid java name */
    public static final void m134showGdpr$lambda8(j this$0, DialogInterface dialogInterface) {
        s.h(this$0, "this$0");
        this$0.currentDialog = null;
    }

    private final void start() {
        if (needShowGdpr()) {
            showGdpr();
        }
    }

    public final void detach() {
        com.vungle.ads.internal.omsdk.a aVar = this.omTracker;
        if (aVar != null) {
            aVar.stop();
        }
        Dialog dialog = this.currentDialog;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        Long l10 = this.adStartTime;
        if (l10 != null) {
            List<String> tpatUrls = this.advertisement.getTpatUrls(com.vungle.ads.internal.f.AD_CLOSE, String.valueOf(System.currentTimeMillis() - l10.longValue()), String.valueOf(this.platform.getVolumeLevel()));
            if (tpatUrls != null) {
                Iterator<T> it = tpatUrls.iterator();
                while (it.hasNext()) {
                    com.vungle.ads.internal.network.i.sendTpat$default(getTpatSender(), new com.vungle.ads.internal.network.g.a((String) it.next()).tpatKey(com.vungle.ads.internal.f.AD_CLOSE).withLogEntry(getLogEntry()).build(), false, 2, null);
                }
            }
        }
        com.vungle.ads.internal.presenter.a aVar2 = this.bus;
        if (aVar2 != null) {
            aVar2.onNext(TtmlNode.END, null, this.delegate.getPlacementRefId());
        }
    }

    public final com.vungle.ads.internal.d getClickCoordinateTracker$vungle_ads_release() {
        return this.clickCoordinateTracker;
    }

    public final com.vungle.ads.internal.omsdk.a getOmTracker$vungle_ads_release() {
        return this.omTracker;
    }

    public final void initAndStartOMTracker(View view, String omSdkData) {
        s.h(view, "view");
        s.h(omSdkData, "omSdkData");
        boolean zOmEnabled = this.advertisement.omEnabled();
        if (omSdkData.length() <= 0 || !zOmEnabled) {
            return;
        }
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        String oMSDKJS$vungle_ads_release = m132initAndStartOMTracker$lambda9(fl.l.a(fl.o.SYNCHRONIZED, new b(this.context))).getOMSDKJS$vungle_ads_release();
        if (oMSDKJS$vungle_ads_release != null) {
            com.vungle.ads.internal.omsdk.a aVar = new com.vungle.ads.internal.omsdk.a(omSdkData, oMSDKJS$vungle_ads_release, this.delegate.isNativeVideo());
            aVar.start(view);
            this.omTracker = aVar;
        }
    }

    public final void onViewTouched(MotionEvent motionEvent) {
        if (motionEvent != null) {
            q.Companion.d(TAG, "user interaction on Native ad");
            this.clickCoordinateTracker.trackCoordinate(motionEvent);
        }
    }

    public final void prepare() {
        start();
        com.vungle.ads.internal.presenter.a aVar = this.bus;
        if (aVar != null) {
            aVar.onNext("start", null, this.delegate.getPlacementRefId());
        }
        this.adStartTime = Long.valueOf(System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ae  */
    public final void processCommand(String action, String str, String str2) throws Throwable {
        String str3;
        String str4;
        List<String> tpatUrls$default;
        s.h(action, "action");
        q.a aVar = q.Companion;
        aVar.d(TAG, "processCommand: action=" + action + " event=" + str + " value=" + str2);
        int iHashCode = action.hashCode();
        if (iHashCode != -511324706) {
            if (iHashCode != 3566511) {
                if (iHashCode == 1427818632 && action.equals(DOWNLOAD)) {
                    onDownload(str2);
                    return;
                }
            } else if (action.equals("tpat")) {
                if (str == null || str.length() == 0) {
                    new TpatError(Sdk$SDKError.b.EMPTY_TPAT_ERROR, "Empty tpat key").setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                    return;
                }
                Boolean bool = this.multipleTpatEnabledMap.get(str);
                Boolean bool2 = Boolean.TRUE;
                if (!s.c(bool, bool2) && s.c(this.firedTpatMap.get(str), bool2)) {
                    aVar.d(TAG, "Ignore this already fired TPAT: " + str);
                    return;
                }
                this.firedTpatMap.put(str, bool2);
                int iHashCode2 = str.hashCode();
                if (iHashCode2 == -2125915830) {
                    str3 = str;
                    str4 = str2;
                    tpatUrls$default = !str3.equals(com.vungle.ads.internal.f.CHECKPOINT_0) ? com.vungle.ads.internal.model.b.getTpatUrls$default(this.advertisement, str3, null, null, 6, null) : this.advertisement.getTpatUrls(str3, this.platform.getCarrierName(), String.valueOf(this.platform.getVolumeLevel()));
                } else if (iHashCode2 != -747709511) {
                    if (iHashCode2 != 1082060480 || !str.equals(com.vungle.ads.internal.f.CTA_URL)) {
                        str3 = str;
                        str4 = str2;
                    } else if (str2 != null) {
                        tpatUrls$default = r.e(str2);
                        str3 = str;
                        str4 = str2;
                    } else {
                        str3 = str;
                        str4 = str2;
                        tpatUrls$default = null;
                    }
                } else if (str.equals(com.vungle.ads.internal.f.VIDEO_LENGTH_TPAT)) {
                    str3 = str;
                    tpatUrls$default = com.vungle.ads.internal.model.b.getTpatUrls$default(this.advertisement, str3, str2, null, 4, null);
                    str4 = str2;
                } else {
                    str3 = str;
                    str4 = str2;
                }
                List<String> list = tpatUrls$default;
                if (list == null || list.isEmpty()) {
                    new TpatError(Sdk$SDKError.b.INVALID_TPAT_KEY, "Empty urls for tpat: " + str3 + " value=" + str4).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                } else {
                    Iterator<T> it = tpatUrls$default.iterator();
                    while (it.hasNext()) {
                        com.vungle.ads.internal.network.i.sendTpat$default(getTpatSender(), new com.vungle.ads.internal.network.g.a((String) it.next()).tpatKey(str3).withLogEntry(getLogEntry()).build(), false, 2, null);
                    }
                }
                if (s.c(str3, com.vungle.ads.internal.f.CHECKPOINT_0)) {
                    com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, new d0(Sdk$SDKMetric.b.AD_START_EVENT), getLogEntry(), (String) null, 4, (Object) null);
                    com.vungle.ads.internal.presenter.a aVar2 = this.bus;
                    if (aVar2 != null) {
                        aVar2.onNext("adViewed", null, this.delegate.getPlacementRefId());
                        return;
                    }
                    return;
                }
                return;
            }
        } else if (action.equals("openPrivacy")) {
            onPrivacy(str2);
            return;
        }
        aVar.w(TAG, "Unknown native ad action: " + action);
    }

    public final void setClickCoordinateTracker$vungle_ads_release(com.vungle.ads.internal.d dVar) {
        s.h(dVar, "<set-?>");
        this.clickCoordinateTracker = dVar;
    }

    public final void setEventListener(com.vungle.ads.internal.presenter.a aVar) {
        this.bus = aVar;
    }

    public final void setOmTracker$vungle_ads_release(com.vungle.ads.internal.omsdk.a aVar) {
        this.omTracker = aVar;
    }

    public final void onOMEvent(int i10, Map<String, ? extends Object> map) {
        q.a aVar = q.Companion;
        String str = dOIDCKnIR.PpiWZRLKJ;
        aVar.d(str, "onOMEvent: event=" + i10 + " value=" + map);
        Boolean bool = this.multipleOMEventEnabledMap.get(Integer.valueOf(i10));
        Boolean bool2 = Boolean.TRUE;
        if (!s.c(bool, bool2) && s.c(this.firedOMEventMap.get(Integer.valueOf(i10)), bool2)) {
            aVar.d(str, "Ignore this already fired om event: " + i10);
        }
        this.firedOMEventMap.put(Integer.valueOf(i10), bool2);
        switch (i10) {
            case 1:
                com.vungle.ads.internal.omsdk.a aVar2 = this.omTracker;
                if (aVar2 != null) {
                    aVar2.onStatePlay();
                }
                break;
            case 2:
                com.vungle.ads.internal.omsdk.a aVar3 = this.omTracker;
                if (aVar3 != null) {
                    aVar3.onStatePaused();
                }
                break;
            case 3:
                com.vungle.ads.internal.omsdk.a aVar4 = this.omTracker;
                if (aVar4 != null) {
                    aVar4.onStateCompleted();
                }
                break;
            case 4:
                Object obj = map != null ? map.get(com.vungle.ads.internal.l.QUARTILE_START_KEY_DURATION) : null;
                Number number = obj instanceof Number ? (Number) obj : null;
                float fFloatValue = number != null ? number.floatValue() : 0.0f;
                Object obj2 = map != null ? map.get(com.vungle.ads.internal.l.QUARTILE_START_KEY_VOLUME) : null;
                Number number2 = obj2 instanceof Number ? (Number) obj2 : null;
                float fFloatValue2 = number2 != null ? number2.floatValue() : 0.0f;
                com.vungle.ads.internal.omsdk.a aVar5 = this.omTracker;
                if (aVar5 != null) {
                    aVar5.onQuartileStart(fFloatValue, fFloatValue2);
                }
                break;
            case 5:
            case 6:
            case 7:
                com.vungle.ads.internal.omsdk.a aVar6 = this.omTracker;
                if (aVar6 != null) {
                    aVar6.onQuartileChanged(i10);
                }
                break;
            case 8:
                com.vungle.ads.internal.omsdk.a aVar7 = this.omTracker;
                if (aVar7 != null) {
                    aVar7.onUserInteraction();
                }
                break;
            case 9:
                com.vungle.ads.internal.omsdk.a aVar8 = this.omTracker;
                if (aVar8 != null) {
                    aVar8.onMuteChanged(true);
                }
                break;
            case 10:
                com.vungle.ads.internal.omsdk.a aVar9 = this.omTracker;
                if (aVar9 != null) {
                    aVar9.onMuteChanged(false);
                }
                break;
            case 11:
                com.vungle.ads.internal.omsdk.a aVar10 = this.omTracker;
                if (aVar10 != null) {
                    aVar10.impressionOccurred();
                }
                break;
        }
    }
}

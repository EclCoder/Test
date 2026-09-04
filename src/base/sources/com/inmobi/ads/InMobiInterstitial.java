package com.inmobi.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.bug.sk.hnj.UfZs.NhHRaDJCHtCTJR;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.media.AbstractC3107l1;
import com.inmobi.media.AbstractC3194oa;
import com.inmobi.media.AbstractC3219p9;
import com.inmobi.media.C2997gk;
import com.inmobi.media.C3220pa;
import com.inmobi.media.C3245q9;
import com.inmobi.media.C3246qa;
import com.inmobi.media.C3271ra;
import com.inmobi.media.C3297sa;
import com.inmobi.media.N5;
import com.inmobi.media.Sb;
import com.inmobi.media.Sg;
import com.inmobi.media.W9;
import com.inmobi.media.Xi;
import com.inmobi.media.Yi;
import com.mbridge.msdk.playercommon.PHx.jyeoXJ;
import com.vungle.ads.internal.f;
import fl.k;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 F2\u00020\u0001:\u0002GHB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0015\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\u00020\n2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020\r¢\u0006\u0004\b\"\u0010\u0010J\u0015\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\n¢\u0006\u0004\b'\u0010\u0012J\u0015\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u001d\u0010/\u001a\u00020\n2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020(¢\u0006\u0004\b/\u00100R\"\u00102\u001a\u0002018\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u00109\u001a\u0002088\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R \u0010E\u001a\u00020?8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b@\u0010A\u0012\u0004\bD\u0010\u0012\u001a\u0004\bB\u0010C¨\u0006I"}, d2 = {"Lcom/inmobi/ads/InMobiInterstitial;", "", "Landroid/content/Context;", "context", "", "placementId", "Lcom/inmobi/ads/listeners/InterstitialAdEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;JLcom/inmobi/ads/listeners/InterstitialAdEventListener;)V", "Lfl/g0;", "setListener", "(Lcom/inmobi/ads/listeners/InterstitialAdEventListener;)V", "", "keywords", "setKeywords", "(Ljava/lang/String;)V", "getSignals", "()V", "", "response", TrackLoadSettingsAtom.TYPE, "([B)V", "loadAdUnit", "show", "(Landroid/content/Context;)V", "", "isReady", "()Z", "", "extras", "setExtras", "(Ljava/util/Map;)V", "contentUrl", "setContentUrl", "Lcom/inmobi/ads/WatermarkData;", "watermarkData", "setWatermarkData", "(Lcom/inmobi/ads/WatermarkData;)V", "disableHardwareAcceleration", "", "minBidToWin", "notifyWin", "(D)V", "", "lossReason", "auctionPrice", "notifyLoss", "(ID)V", "Lcom/inmobi/media/oa;", "mPubListener", "Lcom/inmobi/media/oa;", "getMPubListener$media_release", "()Lcom/inmobi/media/oa;", "setMPubListener$media_release", "(Lcom/inmobi/media/oa;)V", "Lcom/inmobi/media/sa;", "mAdManager", "Lcom/inmobi/media/sa;", "getMAdManager$media_release", "()Lcom/inmobi/media/sa;", "setMAdManager$media_release", "(Lcom/inmobi/media/sa;)V", "Lcom/inmobi/ads/PreloadManager;", "f", "Lcom/inmobi/ads/PreloadManager;", "getPreloadManager", "()Lcom/inmobi/ads/PreloadManager;", "getPreloadManager$annotations", "preloadManager", "Companion", "a", "com/inmobi/media/q9", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiInterstitial {
    public static final C3245q9 Companion = new C3245q9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f24386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f24387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Sg f24388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f24389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f24390f;
    public C3297sa mAdManager;
    public AbstractC3194oa mPubListener;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/inmobi/ads/InMobiInterstitial$a;", "Lcom/inmobi/media/ra;", "Lcom/inmobi/ads/InMobiInterstitial;", f.PLACEMENT_TYPE_INTERSTITIAL, "<init>", "(Lcom/inmobi/ads/InMobiInterstitial;)V", "Lcom/inmobi/ads/AdMetaInfo;", "info", "Lfl/g0;", "onAdFetchSuccessful", "(Lcom/inmobi/ads/AdMetaInfo;)V", "Lcom/inmobi/ads/InMobiAdRequestStatus;", NotificationCompat.CATEGORY_STATUS, "onAdFetchFailed", "(Lcom/inmobi/ads/InMobiAdRequestStatus;)V", "", "getType", "()B", "type", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends C3271ra {
        @Override // com.inmobi.media.C3271ra, com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.media.C3271ra, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(InMobiAdRequestStatus status) {
            AbstractC3194oa mPubListener$media_release;
            s.h(status, "status");
            InMobiInterstitial inMobiInterstitial = this.f27384a.get();
            if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
                return;
            }
            mPubListener$media_release.a(inMobiInterstitial, status);
        }

        @Override // com.inmobi.media.C3271ra, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(AdMetaInfo info) throws JSONException {
            s.h(info, "info");
            super.onAdFetchSuccessful(info);
            InMobiInterstitial inMobiInterstitial = this.f27384a.get();
            if (inMobiInterstitial != null) {
                try {
                    inMobiInterstitial.getMAdManager$media_release().i();
                } catch (IllegalStateException e10) {
                    String strAccess$getTAG$cp = InMobiInterstitial.access$getTAG$cp();
                    s.g(strAccess$getTAG$cp, "access$getTAG$cp(...)");
                    Sb.a((byte) 1, strAccess$getTAG$cp, e10.getMessage());
                    inMobiInterstitial.getMPubListener$media_release().a(inMobiInterstitial, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InMobiInterstitial inMobiInterstitial) {
            super(inMobiInterstitial);
            s.h(inMobiInterstitial, jyeoXJ.dZOxmyLtxUfOiEt);
        }
    }

    public InMobiInterstitial(Context context, long j10, InterstitialAdEventListener listener) {
        s.h(context, "context");
        s.h(listener, "listener");
        Sg sg2 = new Sg();
        this.f24388d = sg2;
        this.f24389e = new a(this);
        this.f24390f = new e(this);
        if (!Xi.d()) {
            s.g("InMobiInterstitial", "TAG");
            throw new SdkNotInitializedException("InMobiInterstitial");
        }
        this.f24385a = context.getApplicationContext();
        sg2.f25691a = j10;
        this.f24387c = new WeakReference(context);
        setMPubListener$media_release(new C3220pa(listener));
        setMAdManager$media_release(new C3297sa());
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        return "InMobiInterstitial";
    }

    public static /* synthetic */ void getPreloadManager$annotations() {
    }

    public final void a(Activity activity) {
        try {
            if (this.f24386b) {
                getMAdManager$media_release().a(activity);
            } else {
                s.g("InMobiInterstitial", "TAG");
                Sb.a((byte) 1, "InMobiInterstitial", "load() must be called before trying to show the ad");
            }
        } catch (Exception e10) {
            s.g("InMobiInterstitial", "TAG");
            Sb.a((byte) 1, "InMobiInterstitial", "Unable to show ad; SDK encountered an unexpected error");
            s.g("InMobiInterstitial", "TAG");
            e10.getMessage();
            k kVar = W9.f25935a;
            AbstractC3219p9.a(e10);
        }
    }

    public final void disableHardwareAcceleration() {
        this.f24388d.f25694d = true;
    }

    public final C3297sa getMAdManager$media_release() {
        C3297sa c3297sa = this.mAdManager;
        if (c3297sa != null) {
            return c3297sa;
        }
        s.w("mAdManager");
        return null;
    }

    public final AbstractC3194oa getMPubListener$media_release() {
        AbstractC3194oa abstractC3194oa = this.mPubListener;
        if (abstractC3194oa != null) {
            return abstractC3194oa;
        }
        s.w("mPubListener");
        return null;
    }

    public final PreloadManager getPreloadManager() {
        return this.f24390f;
    }

    public final void getSignals() {
        Sg sg2 = this.f24388d;
        sg2.getClass();
        s.h("AB", "<set-?>");
        sg2.f25697g = "AB";
        C3297sa mAdManager$media_release = getMAdManager$media_release();
        Sg sg3 = this.f24388d;
        Context context = this.f24385a;
        if (context == null) {
            s.w("mContext");
            context = null;
        }
        mAdManager$media_release.a(sg3, context, false, "getToken");
        getMAdManager$media_release().a(this.f24389e);
    }

    public final boolean isReady() {
        C3246qa c3246qa;
        C2997gk c2997gk;
        C3297sa mAdManager$media_release = getMAdManager$media_release();
        C3246qa c3246qa2 = mAdManager$media_release.f27454h;
        boolean z10 = c3246qa2 != null && 2 == mAdManager$media_release.f25846a && c3246qa2.f26890b == 4;
        if (!z10 && (((c3246qa = getMAdManager$media_release().f27454h) == null || (c2997gk = c3246qa.H) == null || !c2997gk.f26632b) && c3246qa != null)) {
            c3246qa.b0();
        }
        return z10;
    }

    public final void load(byte[] response) {
        this.f24386b = true;
        Sg sg2 = this.f24388d;
        s.h("AB", "<set-?>");
        sg2.f25697g = "AB";
        C3297sa mAdManager$media_release = getMAdManager$media_release();
        Sg sg3 = this.f24388d;
        Context context = this.f24385a;
        if (context == null) {
            s.w("mContext");
            context = null;
        }
        mAdManager$media_release.a(sg3, context, true, "intHtml");
        if (Build.VERSION.SDK_INT >= 29) {
            N5.c((Context) this.f24387c.get());
        }
        getMAdManager$media_release().a(response, this.f24389e);
    }

    public final void loadAdUnit() {
        getMAdManager$media_release().b(this.f24389e);
    }

    public final void notifyLoss(int lossReason, double auctionPrice) {
        String strA = "loss notification failed to trigger";
        if (this.mAdManager == null) {
            Sb.a((byte) 1, "InMobi", "loss notification failed to trigger");
            return;
        }
        C3297sa mAdManager$media_release = getMAdManager$media_release();
        if (mAdManager$media_release.f() != null) {
            AbstractC3107l1 abstractC3107l1F = mAdManager$media_release.f();
            strA = abstractC3107l1F != null ? abstractC3107l1F.a(lossReason, auctionPrice) : null;
        }
        if (strA != null) {
            Sb.a((byte) 1, "InMobi", strA);
        }
    }

    public final void notifyWin(double minBidToWin) {
        String strA = "win notification failed to trigger";
        if (this.mAdManager == null) {
            Sb.a((byte) 1, "InMobi", "win notification failed to trigger");
            return;
        }
        C3297sa mAdManager$media_release = getMAdManager$media_release();
        if (mAdManager$media_release.f() != null) {
            AbstractC3107l1 abstractC3107l1F = mAdManager$media_release.f();
            strA = abstractC3107l1F != null ? abstractC3107l1F.a(minBidToWin) : null;
        }
        if (strA != null) {
            Sb.a((byte) 1, "InMobi", strA);
        }
    }

    public final void setContentUrl(String contentUrl) {
        s.h(contentUrl, "contentUrl");
        this.f24388d.f25695e = contentUrl;
    }

    public final void setExtras(Map<String, String> extras) {
        if (extras != null) {
            String str = extras.get("tp");
            if (!TextUtils.isEmpty(str)) {
                Yi.f26090b = str;
            }
            String str2 = extras.get("tp-v");
            if (!TextUtils.isEmpty(str2)) {
                Yi.f26089a = str2;
            }
        }
        this.f24388d.f25693c = extras;
    }

    public final void setKeywords(String keywords) {
        this.f24388d.f25692b = keywords;
    }

    public final void setListener(InterstitialAdEventListener listener) {
        s.h(listener, "listener");
        setMPubListener$media_release(new C3220pa(listener));
    }

    public final void setMAdManager$media_release(C3297sa c3297sa) {
        s.h(c3297sa, "<set-?>");
        this.mAdManager = c3297sa;
    }

    public final void setMPubListener$media_release(AbstractC3194oa abstractC3194oa) {
        s.h(abstractC3194oa, "<set-?>");
        this.mPubListener = abstractC3194oa;
    }

    public final void setWatermarkData(WatermarkData watermarkData) {
        s.h(watermarkData, "watermarkData");
        getMAdManager$media_release().a(watermarkData);
    }

    public final void show(Context context) {
        s.h(context, "context");
        if (context instanceof Activity) {
            a((Activity) context);
            return;
        }
        s.g("InMobiInterstitial", NhHRaDJCHtCTJR.FmMQLtLzeRR);
        Sb.a((byte) 1, "InMobiInterstitial", "Activity context is required to show interstitial ad as expected");
        a(null);
    }

    public final void show() {
        a(null);
    }

    public final void load() {
        try {
            this.f24386b = true;
            Sg sg2 = this.f24388d;
            s.h("NonAB", "<set-?>");
            sg2.f25697g = "NonAB";
            C3297sa mAdManager$media_release = getMAdManager$media_release();
            Sg sg3 = this.f24388d;
            Context context = this.f24385a;
            if (context == null) {
                s.w("mContext");
                context = null;
            }
            mAdManager$media_release.a(sg3, context, true, "intHtml");
            if (Build.VERSION.SDK_INT >= 29) {
                N5.c((Context) this.f24387c.get());
            }
            loadAdUnit();
        } catch (Exception e10) {
            s.g("InMobiInterstitial", "TAG");
            Sb.a((byte) 1, "InMobiInterstitial", "Unable to load ad; SDK encountered an unexpected error");
            s.g("InMobiInterstitial", "TAG");
            e10.getMessage();
            getMAdManager$media_release().a((short) 2000);
            getMAdManager$media_release().a(getMAdManager$media_release().f27454h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            k kVar = W9.f25935a;
            AbstractC3219p9.a(e10);
        }
    }
}

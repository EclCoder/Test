package com.inmobi.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.AbstractC3145md;
import com.inmobi.media.AbstractC3219p9;
import com.inmobi.media.Ae;
import com.inmobi.media.C2839ah;
import com.inmobi.media.C3068je;
import com.inmobi.media.C3119ld;
import com.inmobi.media.C3348u9;
import com.inmobi.media.C3430xd;
import com.inmobi.media.Ic;
import com.inmobi.media.InterfaceC3322t9;
import com.inmobi.media.InterfaceC3332tj;
import com.inmobi.media.Sb;
import com.inmobi.media.Sg;
import com.inmobi.media.W9;
import com.inmobi.media.Xi;
import com.inmobi.media.Yi;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import fl.k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\f\u0018\u0000 K2\u00020\u0001:\u0002LKB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u0018J\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u0018J\u000f\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\"\u0010!J\u000f\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b&\u0010!J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b*\u0010!J\u000f\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b/\u00100J\r\u00102\u001a\u000201¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u00020\n2\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u001d\u0010;\u001a\u00020\n2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u000204¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u000201¢\u0006\u0004\b@\u00103J#\u0010C\u001a\u00020\n2\u0014\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f\u0018\u00010A¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\n2\b\u0010E\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\n2\b\u0010H\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\bI\u0010GJ\r\u0010J\u001a\u00020\n¢\u0006\u0004\bJ\u0010\u0018¨\u0006M"}, d2 = {"Lcom/inmobi/ads/InMobiNative;", "", "Landroid/content/Context;", "context", "", "placementId", "Lcom/inmobi/ads/listeners/NativeAdEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;JLcom/inmobi/ads/listeners/NativeAdEventListener;)V", "Lfl/g0;", "setListener", "(Lcom/inmobi/ads/listeners/NativeAdEventListener;)V", "Lcom/inmobi/ads/listeners/VideoEventListener;", "setVideoEventListener", "(Lcom/inmobi/ads/listeners/VideoEventListener;)V", "Lcom/inmobi/ads/InMobiNative$LockScreenListener;", "lockScreenListener", "showOnLockScreen", "(Lcom/inmobi/ads/InMobiNative$LockScreenListener;)V", "", "response", TrackLoadSettingsAtom.TYPE, "([B)V", "()V", "Lcom/inmobi/media/ads/nativeAd/InMobiNativeViewData;", "inMobiNativeViewData", "registerViewForTracking", "(Lcom/inmobi/media/ads/nativeAd/InMobiNativeViewData;)V", "unTrackViews", "takeAction", "", "getAdTitle", "()Ljava/lang/String;", "getAdDescription", "Lcom/inmobi/media/ads/nativeAd/InMobiNativeImage;", "getAdIcon", "()Lcom/inmobi/media/ads/nativeAd/InMobiNativeImage;", "getCtaText", "", "getAdRating", "()F", "getAdvertiserName", "Lcom/inmobi/media/ads/nativeAd/MediaView;", "getMediaView", "()Lcom/inmobi/media/ads/nativeAd/MediaView;", "Landroid/view/View;", "getAdChoiceIcon", "()Landroid/view/View;", "", "isVideo", "()Z", "", "minBidToWin", "notifyWin", "(D)V", "", "lossReason", "auctionPrice", "notifyLoss", "(ID)V", "Lorg/json/JSONObject;", "getAdContent", "()Lorg/json/JSONObject;", "isReady", "", "extras", "setExtras", "(Ljava/util/Map;)V", "keywords", "setKeywords", "(Ljava/lang/String;)V", "contentUrl", "setContentUrl", "destroy", "Companion", "LockScreenListener", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiNative {
    public static final String APP_INSTALLS = "AppInstalls";
    public static final String LIKES = "Likes";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3119ld f24397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f24396b = "InMobiNative";

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/inmobi/ads/InMobiNative$LockScreenListener;", "", "Lcom/inmobi/ads/InMobiNative;", "nativeAd", "Lfl/g0;", "onActionRequired", "(Lcom/inmobi/ads/InMobiNative;)V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface LockScreenListener {
        void onActionRequired(InMobiNative nativeAd);
    }

    public InMobiNative(Context context, long j10, NativeAdEventListener adEventListener) {
        s.h(context, "context");
        s.h(adEventListener, "listener");
        C3119ld c3119ld = new C3119ld(this, context, j10);
        this.f24397a = c3119ld;
        if (Xi.d()) {
            s.h(adEventListener, "adEventListener");
            c3119ld.f26940b.f26219a = adEventListener;
        } else {
            String TAG = f24396b;
            s.g(TAG, "TAG");
            throw new SdkNotInitializedException(TAG);
        }
    }

    public final void destroy() {
        C3119ld c3119ld = this.f24397a;
        c3119ld.getClass();
        try {
            c3119ld.f26943e = null;
            C2839ah c2839ah = c3119ld.f26940b;
            c2839ah.f26219a = null;
            c2839ah.f26220b = null;
            c2839ah.f26221c = null;
            c3119ld.f26941c.f25481c.clear();
            c3119ld.f26942d.f25414b.j();
        } catch (Exception e10) {
            String str = AbstractC3145md.f26993a;
            s.g(str, "access$getTAG$p(...)");
            Sb.a((byte) 1, str, "Failed to destroy ad; SDK encountered an unexpected error");
            k kVar = W9.f25935a;
            AbstractC3219p9.a(e10);
        }
    }

    public final View getAdChoiceIcon() {
        C3068je c3068je = this.f24397a.f26943e;
        if (c3068je != null) {
            return c3068je.f26815j;
        }
        return null;
    }

    public final JSONObject getAdContent() {
        C3068je c3068je = this.f24397a.f26943e;
        if (c3068je != null) {
            return c3068je.f26810e;
        }
        return null;
    }

    public final String getAdDescription() {
        C3068je c3068je = this.f24397a.f26943e;
        if (c3068je != null) {
            return c3068je.f26807b;
        }
        return null;
    }

    public final InMobiNativeImage getAdIcon() {
        C3068je c3068je = this.f24397a.f26943e;
        if (c3068je != null) {
            return c3068je.f26808c;
        }
        return null;
    }

    public final float getAdRating() {
        Float f10;
        C3068je c3068je = this.f24397a.f26943e;
        if (c3068je == null || (f10 = c3068je.f26812g) == null) {
            return 0.0f;
        }
        return f10.floatValue();
    }

    public final String getAdTitle() {
        C3068je c3068je = this.f24397a.f26943e;
        if (c3068je != null) {
            return c3068je.f26806a;
        }
        return null;
    }

    public final String getAdvertiserName() {
        C3068je c3068je = this.f24397a.f26943e;
        if (c3068je != null) {
            return c3068je.f26811f;
        }
        return null;
    }

    public final String getCtaText() {
        C3068je c3068je = this.f24397a.f26943e;
        if (c3068je != null) {
            return c3068je.f26809d;
        }
        return null;
    }

    public final MediaView getMediaView() {
        C3068je c3068je = this.f24397a.f26943e;
        if (c3068je != null) {
            return c3068je.f26814i;
        }
        return null;
    }

    public final boolean isReady() {
        return this.f24397a.f26943e != null;
    }

    public final boolean isVideo() {
        C3068je c3068je = this.f24397a.f26943e;
        if (c3068je != null) {
            return c3068je.f26813h;
        }
        return false;
    }

    public final void load(byte[] response) {
        C3119ld c3119ld = this.f24397a;
        Sg sg2 = c3119ld.f26939a;
        s.h("AB", "<set-?>");
        sg2.f25697g = "AB";
        c3119ld.f26942d.f25414b.a(response);
    }

    public final void notifyLoss(int lossReason, double auctionPrice) {
        String strA = this.f24397a.f26942d.f25414b.a(lossReason, auctionPrice);
        if (strA.length() > 0) {
            Sb.a((byte) 1, "InMobiNative", strA);
        }
    }

    public final void notifyWin(double minBidToWin) {
        String strA = this.f24397a.f26942d.f25414b.a(minBidToWin);
        if (strA.length() > 0) {
            Sb.a((byte) 1, "InMobiNative", strA);
        }
    }

    public final void registerViewForTracking(InMobiNativeViewData inMobiNativeViewData) {
        s.h(inMobiNativeViewData, "inMobiNativeViewData");
        C3119ld c3119ld = this.f24397a;
        c3119ld.getClass();
        s.h(inMobiNativeViewData, "inMobiNativeViewData");
        c3119ld.f26942d.a(inMobiNativeViewData);
    }

    public final void setContentUrl(String contentUrl) {
        this.f24397a.f26939a.f25695e = contentUrl;
    }

    public final void setExtras(Map<String, String> extras) {
        C3119ld c3119ld = this.f24397a;
        if (extras != null) {
            c3119ld.getClass();
            String str = extras.get("tp");
            if (!TextUtils.isEmpty(str)) {
                Yi.f26090b = str;
            }
            String str2 = extras.get("tp-v");
            if (!TextUtils.isEmpty(str2)) {
                Yi.f26089a = str2;
            }
        }
        c3119ld.f26939a.f25693c = extras;
    }

    public final void setKeywords(String keywords) {
        this.f24397a.f26939a.f25692b = keywords;
    }

    public final void setListener(NativeAdEventListener listener) {
        s.h(listener, "listener");
        C3119ld c3119ld = this.f24397a;
        c3119ld.getClass();
        s.h(listener, "adEventListener");
        c3119ld.f26940b.f26219a = listener;
    }

    public final void setVideoEventListener(VideoEventListener listener) {
        s.h(listener, "listener");
        C3119ld c3119ld = this.f24397a;
        c3119ld.getClass();
        s.h(listener, "videoEventListener");
        c3119ld.f26940b.f26220b = listener;
    }

    public final void showOnLockScreen(LockScreenListener lockScreenListener) {
        s.h(lockScreenListener, "lockScreenListener");
        C3119ld c3119ld = this.f24397a;
        c3119ld.getClass();
        s.h(lockScreenListener, "lockScreenListener");
        c3119ld.f26939a.f25696f = true;
        c3119ld.f26940b.f26221c = lockScreenListener;
    }

    public final void takeAction() {
        Ic ic2 = this.f24397a.f26942d.f25414b;
        InterfaceC3332tj interfaceC3332tj = ic2.f25000c;
        C3430xd c3430xd = interfaceC3332tj instanceof C3430xd ? (C3430xd) interfaceC3332tj : null;
        if (c3430xd != null) {
            InterfaceC3322t9 interfaceC3322t9L = c3430xd.l();
            if (interfaceC3322t9L != null) {
                ((C3348u9) interfaceC3322t9L).a("AUM-NativeLoadedState", "takeAction - delegating to ad unit");
            }
            c3430xd.f27849h.a();
        }
        InterfaceC3332tj interfaceC3332tj2 = ic2.f25000c;
        Ae ae2 = interfaceC3332tj2 instanceof Ae ? (Ae) interfaceC3332tj2 : null;
        if (ae2 != null) {
            InterfaceC3322t9 interfaceC3322t9L2 = ae2.l();
            if (interfaceC3322t9L2 != null) {
                ((C3348u9) interfaceC3322t9L2).a("AUM-NativeRenderedState", "takeAction - delegating to ad unit");
            }
            ae2.f24470f.a();
        }
    }

    public final void unTrackViews() {
        this.f24397a.f26942d.f25414b.d();
    }

    public final void load() {
        C3119ld c3119ld = this.f24397a;
        Sg sg2 = c3119ld.f26939a;
        s.h("NonAB", "<set-?>");
        sg2.f25697g = "NonAB";
        c3119ld.f26942d.f25414b.c();
    }
}

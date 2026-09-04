package com.inmobi.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import bm.r;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.banner.AudioListener;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.exceptions.InvalidPlacementIdException;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.media.AbstractC2971fk;
import com.inmobi.media.AbstractC3107l1;
import com.inmobi.media.C2824a2;
import com.inmobi.media.C2831a9;
import com.inmobi.media.C2876c2;
import com.inmobi.media.C2927e2;
import com.inmobi.media.C3348u9;
import com.inmobi.media.HandlerC2902d2;
import com.inmobi.media.J3;
import com.inmobi.media.N5;
import com.inmobi.media.P5;
import com.inmobi.media.Sb;
import com.inmobi.media.Sg;
import com.inmobi.media.V1;
import com.inmobi.media.ViewTreeObserverOnGlobalLayoutListenerC2857b9;
import com.inmobi.media.Xi;
import com.inmobi.media.Y1;
import com.inmobi.media.Yi;
import com.inmobi.media.Z1;
import com.inmobi.media.ads.network.common.model.Ad;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import fl.g0;
import fl.k;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u0087\u00012\u00020\u0001:\u0005\u0088\u0001\u0089\u0001ZB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0012\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0014J#\u0010\u0018\u001a\u00020\u000b2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u000b¢\u0006\u0004\b/\u0010\rJ\u000f\u00100\u001a\u00020\u000bH\u0014¢\u0006\u0004\b0\u0010\rJ\u000f\u00101\u001a\u00020\u000bH\u0014¢\u0006\u0004\b1\u0010\rJ\u0015\u00104\u001a\u00020\u000b2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J!\u00108\u001a\u00020\u000b2\b\b\u0001\u00106\u001a\u00020'2\b\b\u0001\u00107\u001a\u00020'¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u000bH\u0007¢\u0006\u0004\b:\u0010\rJ\u001f\u0010>\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020'H\u0014¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020#H\u0016¢\u0006\u0004\bA\u0010&J\u000f\u0010C\u001a\u00020\u000bH\u0000¢\u0006\u0004\bB\u0010\rJ\u000f\u0010E\u001a\u00020\u000bH\u0001¢\u0006\u0004\bD\u0010\rJ\r\u0010F\u001a\u00020\u000b¢\u0006\u0004\bF\u0010\rJ\r\u0010G\u001a\u00020\u000b¢\u0006\u0004\bG\u0010\rJ\r\u0010H\u001a\u00020\b¢\u0006\u0004\bH\u0010IJ\u0015\u0010L\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020J¢\u0006\u0004\bL\u0010MJ\u0015\u0010P\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bP\u0010QJ\u001d\u0010T\u001a\u00020\u000b2\u0006\u0010R\u001a\u00020'2\u0006\u0010S\u001a\u00020N¢\u0006\u0004\bT\u0010UJ\r\u0010V\u001a\u00020#¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u000bH\u0007¢\u0006\u0004\bX\u0010\rR$\u0010`\u001a\u0004\u0018\u00010Y8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R$\u0010f\u001a\u0004\u0018\u00010J8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010MR\"\u0010n\u001a\u00020g8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR$\u0010v\u001a\u0004\u0018\u00010o8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u001a\u0010|\u001a\u00020w8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R$\u0010\u0083\u0001\u001a\u00020}8\u0006X\u0087\u0004¢\u0006\u0015\n\u0004\b~\u0010\u007f\u0012\u0005\b\u0082\u0001\u0010\r\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u0010\u0086\u0001\u001a\u00020\u00168BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001¨\u0006\u008a\u0001"}, d2 = {"Lcom/inmobi/ads/InMobiBanner;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "placementId", "(Landroid/content/Context;J)V", "Lfl/g0;", "getSignals", "()V", "", "response", TrackLoadSettingsAtom.TYPE, "([B)V", "refreshBanner$media_release", "refreshBanner", "(Landroid/content/Context;)V", "", "", "extras", "setExtras", "(Ljava/util/Map;)V", "keywords", "setKeywords", "(Ljava/lang/String;)V", "contentUrl", "setContentUrl", "Lcom/inmobi/ads/listeners/BannerAdEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lcom/inmobi/ads/listeners/BannerAdEventListener;)V", "", "enabled", "setEnableAutoRefresh", "(Z)V", "", "refreshInterval", "setRefreshInterval", "(I)V", "Lcom/inmobi/ads/InMobiBanner$AnimationType;", "animationType", "setAnimationType", "(Lcom/inmobi/ads/InMobiBanner$AnimationType;)V", "disableHardwareAcceleration", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/inmobi/ads/WatermarkData;", "watermarkData", "setWatermarkData", "(Lcom/inmobi/ads/WatermarkData;)V", "widthInDp", "heightInDp", "setBannerSize", "(II)V", "setupBannerSizeObserver", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "hasWindowFocus", "onWindowFocusChanged", "scheduleRefresh$media_release", "scheduleRefresh", "swapAdUnitsAndDisplayAd$media_release", "swapAdUnitsAndDisplayAd", CampaignEx.JSON_NATIVE_VIDEO_RESUME, CampaignEx.JSON_NATIVE_VIDEO_PAUSE, "getPlacementId", "()J", "Lcom/inmobi/ads/banner/AudioListener;", "audioListener", "setAudioListener", "(Lcom/inmobi/ads/banner/AudioListener;)V", "", "minBidToWin", "notifyWin", "(D)V", "lossReason", "auctionPrice", "notifyLoss", "(ID)V", "isAudioAd", "()Z", "destroy", "Lcom/inmobi/media/Y1;", "a", "Lcom/inmobi/media/Y1;", "getMPubListener$media_release", "()Lcom/inmobi/media/Y1;", "setMPubListener$media_release", "(Lcom/inmobi/media/Y1;)V", "mPubListener", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/inmobi/ads/banner/AudioListener;", "getMAudioListener$media_release", "()Lcom/inmobi/ads/banner/AudioListener;", "setMAudioListener$media_release", "mAudioListener", "Lcom/inmobi/media/V1;", "c", "Lcom/inmobi/media/V1;", "getAudioStatusInternal$media_release", "()Lcom/inmobi/media/V1;", "setAudioStatusInternal$media_release", "(Lcom/inmobi/media/V1;)V", "audioStatusInternal", "Lcom/inmobi/media/e2;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/inmobi/media/e2;", "getMAdManager$media_release", "()Lcom/inmobi/media/e2;", "setMAdManager$media_release", "(Lcom/inmobi/media/e2;)V", "mAdManager", "Lcom/inmobi/media/Sg;", "n", "Lcom/inmobi/media/Sg;", "getMPubSettings$media_release", "()Lcom/inmobi/media/Sg;", "mPubSettings", "Lcom/inmobi/ads/PreloadManager;", "o", "Lcom/inmobi/ads/PreloadManager;", "getPreloadManager", "()Lcom/inmobi/ads/PreloadManager;", "getPreloadManager$annotations", "preloadManager", "getFrameSizeString", "()Ljava/lang/String;", "frameSizeString", "Companion", "AnimationType", "com/inmobi/media/a9", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiBanner extends RelativeLayout {
    public static final C2831a9 Companion = new C2831a9();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Y1 mPubListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public AudioListener mAudioListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public V1 audioStatusInternal;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public C2927e2 mAdManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f24374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f24376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HandlerC2902d2 f24377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f24379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AnimationType f24380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f24381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public WeakReference f24382m;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final Sg mPubSettings;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d f24384o;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/inmobi/ads/InMobiBanner$AnimationType;", "", "<init>", "(Ljava/lang/String;I)V", "ANIMATION_OFF", "ROTATE_HORIZONTAL_AXIS", "ANIMATION_ALPHA", "ROTATE_VERTICAL_AXIS", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum AnimationType {
        ANIMATION_OFF,
        ROTATE_HORIZONTAL_AXIS,
        ANIMATION_ALPHA,
        ROTATE_VERTICAL_AXIS;

        private static final /* synthetic */ ml.a $ENTRIES = ml.b.a(values());

        public static ml.a getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/inmobi/ads/InMobiBanner$a;", "Lcom/inmobi/media/c2;", "Lcom/inmobi/ads/InMobiBanner;", "banner", "<init>", "(Lcom/inmobi/ads/InMobiBanner;)V", "Lcom/inmobi/ads/AdMetaInfo;", "info", "Lfl/g0;", "onAdFetchSuccessful", "(Lcom/inmobi/ads/AdMetaInfo;)V", "Lcom/inmobi/ads/InMobiAdRequestStatus;", NotificationCompat.CATEGORY_STATUS, "onAdFetchFailed", "(Lcom/inmobi/ads/InMobiAdRequestStatus;)V", "", "getType", "()B", "type", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends C2876c2 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InMobiBanner banner) {
            super(banner);
            s.h(banner, "banner");
        }

        @Override // com.inmobi.media.C2876c2, com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.media.C2876c2, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(InMobiAdRequestStatus status) {
            s.h(status, "status");
            InMobiBanner inMobiBanner = a().get();
            if (inMobiBanner == null) {
                return;
            }
            Y1 mPubListener = inMobiBanner.getMPubListener();
            if (mPubListener != null) {
                mPubListener.a(inMobiBanner, status);
            }
            inMobiBanner.scheduleRefresh$media_release();
        }

        @Override // com.inmobi.media.C2876c2, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(AdMetaInfo info) {
            s.h(info, "info");
            super.onAdFetchSuccessful(info);
            InMobiBanner inMobiBanner = a().get();
            if (inMobiBanner != null) {
                try {
                    C2927e2 mAdManager = inMobiBanner.getMAdManager();
                    if (mAdManager != null) {
                        mAdManager.o();
                    }
                } catch (IllegalStateException e10) {
                    String strAccess$getTAG$cp = InMobiBanner.access$getTAG$cp();
                    s.g(strAccess$getTAG$cp, "access$getTAG$cp(...)");
                    Sb.a((byte) 1, strAccess$getTAG$cp, e10.getMessage());
                    Y1 mPubListener = inMobiBanner.getMPubListener();
                    if (mPubListener != null) {
                        mPubListener.a(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s.h(context, "context");
        s.h(attributeSet, "attributeSet");
        this.audioStatusInternal = V1.f25865d;
        this.f24374e = new a(this);
        this.f24376g = true;
        this.f24380k = AnimationType.ROTATE_HORIZONTAL_AXIS;
        Sg sg2 = new Sg();
        this.mPubSettings = sg2;
        this.f24384o = new d(this);
        if (!Xi.d()) {
            s.g("InMobiBanner", "TAG");
            throw new SdkNotInitializedException("InMobiBanner");
        }
        if (context instanceof Activity) {
            this.f24382m = new WeakReference(context);
        }
        this.mAdManager = new C2927e2();
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", "placementId");
        String attributeValue2 = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", "refreshInterval");
        if (attributeValue != null) {
            long jA = a(attributeValue);
            if (jA == Long.MIN_VALUE) {
                throw new InvalidPlacementIdException();
            }
            sg2.f25691a = jA;
        }
        Context context2 = getContext();
        s.g(context2, "getContext(...)");
        a(this, context2);
        C2927e2 c2927e2 = this.mAdManager;
        this.f24375f = c2927e2 != null ? c2927e2.k() : 0;
        this.f24377h = new HandlerC2902d2(this);
        if (attributeValue2 != null) {
            try {
                int length = attributeValue2.length() - 1;
                int i10 = 0;
                boolean z10 = false;
                while (i10 <= length) {
                    boolean z11 = s.i(attributeValue2.charAt(!z10 ? i10 : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z11) {
                        i10++;
                    } else {
                        z10 = true;
                    }
                }
                setRefreshInterval(Integer.parseInt(attributeValue2.subSequence(i10, length + 1).toString()));
            } catch (NumberFormatException unused) {
                s.g("InMobiBanner", "TAG");
                Sb.a((byte) 1, "InMobiBanner", "Refresh interval value supplied in XML layout is not valid. Falling back to default value.");
            }
        }
    }

    public static final g0 a(InMobiBanner inMobiBanner, byte[] bArr) {
        C3348u9 c3348u9;
        C2927e2 c2927e2 = inMobiBanner.mAdManager;
        if (c2927e2 != null && (c3348u9 = c2927e2.f25851f) != null) {
            s.g("InMobiBanner", "TAG");
            c3348u9.c("InMobiBanner", "load with response");
        }
        C2927e2 c2927e3 = inMobiBanner.mAdManager;
        if (c2927e3 != null) {
            c2927e3.a(bArr, inMobiBanner.f24374e);
        }
        return g0.f38750a;
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        return "InMobiBanner";
    }

    public static final boolean access$hasValidSize(InMobiBanner inMobiBanner) {
        return inMobiBanner.f24378i > 0 && inMobiBanner.f24379j > 0;
    }

    private final String getFrameSizeString() {
        return this.f24378i + "x" + this.f24379j;
    }

    public final boolean b() {
        C3348u9 c3348u9;
        C2927e2 c2927e2 = this.mAdManager;
        if (c2927e2 == null || (c3348u9 = c2927e2.f25851f) == null) {
            return true;
        }
        s.g("InMobiBanner", "TAG");
        c3348u9.c("InMobiBanner", "checkStateAndLogError");
        return true;
    }

    public final void destroy() {
        a();
        removeAllViews();
        C2927e2 c2927e2 = this.mAdManager;
        if (c2927e2 != null) {
            c2927e2.j();
        }
        this.mPubListener = null;
    }

    public final void disableHardwareAcceleration() {
        this.mPubSettings.f25694d = true;
    }

    /* JADX INFO: renamed from: getAudioStatusInternal$media_release, reason: from getter */
    public final V1 getAudioStatusInternal() {
        return this.audioStatusInternal;
    }

    /* JADX INFO: renamed from: getMAdManager$media_release, reason: from getter */
    public final C2927e2 getMAdManager() {
        return this.mAdManager;
    }

    /* JADX INFO: renamed from: getMAudioListener$media_release, reason: from getter */
    public final AudioListener getMAudioListener() {
        return this.mAudioListener;
    }

    /* JADX INFO: renamed from: getMPubListener$media_release, reason: from getter */
    public final Y1 getMPubListener() {
        return this.mPubListener;
    }

    /* JADX INFO: renamed from: getMPubSettings$media_release, reason: from getter */
    public final Sg getMPubSettings() {
        return this.mPubSettings;
    }

    public final long getPlacementId() {
        return this.mPubSettings.f25691a;
    }

    public final PreloadManager getPreloadManager() {
        return this.f24384o;
    }

    public final void getSignals() {
        C2927e2 c2927e2 = this.mAdManager;
        if (c2927e2 != null) {
            c2927e2.a(this.f24374e);
        }
    }

    public final boolean isAudioAd() {
        C2824a2 c2824a2;
        Ad adB;
        C2927e2 c2927e2 = this.mAdManager;
        if (c2927e2 == null || (c2824a2 = c2927e2.f26439l) == null || (adB = c2824a2.b(0)) == null) {
            return false;
        }
        MetaInfo metaInfo = adB.getMetaInfo();
        return s.c(metaInfo != null ? metaInfo.getCreativeType() : null, MimeTypes.BASE_TYPE_AUDIO);
    }

    public final void load(final byte[] response) {
        b();
        Sg sg2 = this.mPubSettings;
        sg2.getClass();
        s.h("AB", "<set-?>");
        sg2.f25697g = "AB";
        if (getLayoutParams() != null) {
            this.f24378i = J3.b(getLayoutParams().width / N5.b());
            this.f24379j = J3.b(getLayoutParams().height / N5.b());
        }
        C2927e2 c2927e2 = this.mAdManager;
        if (c2927e2 == null || c2927e2.f26437j == null || c2927e2.f26438k == null || c2927e2.f25846a == 0) {
            Context context = getContext();
            s.g(context, "getContext(...)");
            a(this, context);
        }
        C2927e2 c2927e3 = this.mAdManager;
        if (c2927e3 != null) {
            c2927e3.g();
        }
        a("load(byte[])", new tl.a() { // from class: wh.d
            @Override // tl.a
            public final Object invoke() {
                return InMobiBanner.a(this.f56276a, response);
            }
        });
    }

    public final void notifyLoss(int lossReason, double auctionPrice) {
        String strA = "loss notification failed to trigger";
        if (this.mAdManager == null) {
            Sb.a((byte) 1, "InMobi", "loss notification failed to trigger");
            g0 g0Var = g0.f38750a;
        }
        C2927e2 c2927e2 = this.mAdManager;
        if (c2927e2 != null) {
            if (c2927e2.f() != null) {
                AbstractC3107l1 abstractC3107l1F = c2927e2.f();
                strA = abstractC3107l1F != null ? abstractC3107l1F.a(lossReason, auctionPrice) : null;
            }
            if (strA == null || strA.length() <= 0) {
                return;
            }
            Sb.a((byte) 1, "InMobi", strA);
        }
    }

    public final void notifyWin(double minBidToWin) {
        String strA = "win notification failed to trigger";
        if (this.mAdManager == null) {
            Sb.a((byte) 1, "InMobi", "win notification failed to trigger");
            g0 g0Var = g0.f38750a;
        }
        C2927e2 c2927e2 = this.mAdManager;
        if (c2927e2 != null) {
            if (c2927e2.f() != null) {
                AbstractC3107l1 abstractC3107l1F = c2927e2.f();
                strA = abstractC3107l1F != null ? abstractC3107l1F.a(minBidToWin) : null;
            }
            if (strA == null || strA.length() <= 0) {
                return;
            }
            Sb.a((byte) 1, "InMobi", strA);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        C3348u9 c3348u9;
        try {
            super.onAttachedToWindow();
            C2927e2 c2927e2 = this.mAdManager;
            if (c2927e2 != null) {
                c2927e2.n();
            }
            if (getLayoutParams() != null) {
                this.f24378i = J3.b(getLayoutParams().width / N5.b());
                this.f24379j = J3.b(getLayoutParams().height / N5.b());
            }
            if (this.f24378i <= 0 || this.f24379j <= 0) {
                setupBannerSizeObserver();
            }
            scheduleRefresh$media_release();
            if (Build.VERSION.SDK_INT >= 29) {
                P5 p10 = N5.f25313a;
                Context context = getContext();
                WindowInsets rootWindowInsets = getRootWindowInsets();
                s.g(rootWindowInsets, "getRootWindowInsets(...)");
                N5.a(rootWindowInsets, context);
            }
        } catch (Exception e10) {
            C2927e2 c2927e3 = this.mAdManager;
            if (c2927e3 == null || (c3348u9 = c2927e3.f25851f) == null) {
                return;
            }
            s.g("InMobiBanner", "TAG");
            c3348u9.a("InMobiBanner", "InMobiBanner#onAttachedToWindow() handler threw unexpected error: ", e10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        C3348u9 c3348u9;
        try {
            super.onDetachedFromWindow();
            a();
            C2927e2 c2927e2 = this.mAdManager;
            if (c2927e2 != null) {
                c2927e2.t();
            }
        } catch (Exception e10) {
            C2927e2 c2927e3 = this.mAdManager;
            if (c2927e3 == null || (c3348u9 = c2927e3.f25851f) == null) {
                return;
            }
            s.g("InMobiBanner", "TAG");
            c3348u9.a("InMobiBanner", "InMobiBanner.onDetachedFromWindow() handler threw unexpected error: ", e10);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int visibility) {
        C3348u9 c3348u9;
        s.h(changedView, "changedView");
        try {
            super.onVisibilityChanged(changedView, visibility);
            if (visibility == 0) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e10) {
            C2927e2 c2927e2 = this.mAdManager;
            if (c2927e2 == null || (c3348u9 = c2927e2.f25851f) == null) {
                return;
            }
            s.g("InMobiBanner", "TAG");
            c3348u9.a("InMobiBanner", "InMobiBanner$1.onVisibilityChanged() handler threw unexpected error: ", e10);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        C3348u9 c3348u9;
        try {
            super.onWindowFocusChanged(hasWindowFocus);
            if (hasWindowFocus) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e10) {
            C2927e2 c2927e2 = this.mAdManager;
            if (c2927e2 == null || (c3348u9 = c2927e2.f25851f) == null) {
                return;
            }
            s.g("InMobiBanner", "TAG");
            c3348u9.a("InMobiBanner", "InMobiBanner$1.onWindowFocusChanged() handler threw unexpected error: ", e10);
        }
    }

    public final void pause() {
        C3348u9 c3348u9;
        C2927e2 c2927e2;
        try {
            if (this.f24382m != null || (c2927e2 = this.mAdManager) == null) {
                return;
            }
            c2927e2.m();
        } catch (Exception e10) {
            C2927e2 c2927e3 = this.mAdManager;
            if (c2927e3 == null || (c3348u9 = c2927e3.f25851f) == null) {
                return;
            }
            s.g("InMobiBanner", "TAG");
            c3348u9.a("InMobiBanner", "SDK encountered unexpected error in pausing ad; ", e10);
        }
    }

    public final void refreshBanner$media_release() {
        a((PublisherCallbacks) this.f24374e, "NonAB", true);
    }

    public final void resume() {
        C3348u9 c3348u9;
        C2927e2 c2927e2;
        try {
            if (this.f24382m != null || (c2927e2 = this.mAdManager) == null) {
                return;
            }
            c2927e2.p();
        } catch (Exception e10) {
            C2927e2 c2927e3 = this.mAdManager;
            if (c2927e3 == null || (c3348u9 = c2927e3.f25851f) == null) {
                return;
            }
            s.g("InMobiBanner", "TAG");
            c3348u9.a("InMobiBanner", "SDK encountered unexpected error in resuming ad; ", e10);
        }
    }

    public final void scheduleRefresh$media_release() {
        HandlerC2902d2 handlerC2902d2;
        if (isShown() && hasWindowFocus()) {
            HandlerC2902d2 handlerC2902d3 = this.f24377h;
            if (handlerC2902d3 != null) {
                handlerC2902d3.removeMessages(1);
            }
            C2927e2 c2927e2 = this.mAdManager;
            if (c2927e2 == null || !c2927e2.i() || !this.f24376g || (handlerC2902d2 = this.f24377h) == null) {
                return;
            }
            handlerC2902d2.sendEmptyMessageDelayed(1, this.f24375f * 1000);
        }
    }

    public final void setAnimationType(AnimationType animationType) {
        s.h(animationType, "animationType");
        this.f24380k = animationType;
    }

    public final void setAudioListener(AudioListener audioListener) {
        AudioStatus audioStatus;
        s.h(audioListener, "audioListener");
        this.mAudioListener = audioListener;
        V1 item = this.audioStatusInternal;
        if (item == V1.f25865d || audioListener == null) {
            return;
        }
        V1.f25863b.getClass();
        s.h(item, "item");
        int iOrdinal = item.ordinal();
        if (iOrdinal != 1) {
            audioStatus = iOrdinal != 2 ? AudioStatus.COMPLETED : AudioStatus.PAUSED;
        } else {
            audioStatus = AudioStatus.PLAYING;
        }
        audioListener.onAudioStatusChanged(this, audioStatus);
    }

    public final void setAudioStatusInternal$media_release(V1 v10) {
        s.h(v10, "<set-?>");
        this.audioStatusInternal = v10;
    }

    public final void setBannerSize(int widthInDp, int heightInDp) {
        this.f24378i = widthInDp;
        this.f24379j = heightInDp;
    }

    public final void setContentUrl(String contentUrl) {
        s.h(contentUrl, "contentUrl");
        this.mPubSettings.f25695e = contentUrl;
    }

    public final void setEnableAutoRefresh(boolean enabled) {
        C3348u9 c3348u9;
        try {
            if (this.f24376g == enabled) {
                return;
            }
            this.f24376g = enabled;
            if (enabled) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e10) {
            C2927e2 c2927e2 = this.mAdManager;
            if (c2927e2 == null || (c3348u9 = c2927e2.f25851f) == null) {
                return;
            }
            s.g("InMobiBanner", "TAG");
            c3348u9.a("InMobiBanner", "Setting up auto-refresh failed with unexpected error: ", e10);
        }
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
        this.mPubSettings.f25693c = extras;
    }

    public final void setKeywords(String keywords) {
        this.mPubSettings.f25692b = keywords;
    }

    public final void setListener(BannerAdEventListener listener) {
        s.h(listener, "listener");
        this.mPubListener = new Z1(listener);
    }

    public final void setMAdManager$media_release(C2927e2 c2927e2) {
        this.mAdManager = c2927e2;
    }

    public final void setMAudioListener$media_release(AudioListener audioListener) {
        this.mAudioListener = audioListener;
    }

    public final void setMPubListener$media_release(Y1 y10) {
        this.mPubListener = y10;
    }

    public final void setRefreshInterval(int refreshInterval) {
        C3348u9 c3348u9;
        try {
            Sg sg2 = this.mPubSettings;
            sg2.getClass();
            s.h("NonAB", "<set-?>");
            sg2.f25697g = "NonAB";
            Context context = getContext();
            s.g(context, "getContext(...)");
            a(this, context);
            C2927e2 c2927e2 = this.mAdManager;
            this.f24375f = c2927e2 != null ? c2927e2.a(refreshInterval, this.f24375f) : 0;
        } catch (Exception e10) {
            C2927e2 c2927e3 = this.mAdManager;
            if (c2927e3 == null || (c3348u9 = c2927e3.f25851f) == null) {
                return;
            }
            s.g("InMobiBanner", "TAG");
            c3348u9.a("InMobiBanner", "Setting refresh interval failed with unexpected error: ", e10);
        }
    }

    public final void setWatermarkData(WatermarkData watermarkData) {
        s.h(watermarkData, "watermarkData");
        C2927e2 c2927e2 = this.mAdManager;
        if (c2927e2 != null) {
            c2927e2.a(watermarkData);
        }
    }

    public final void setupBannerSizeObserver() {
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC2857b9(this));
    }

    public final void swapAdUnitsAndDisplayAd$media_release() {
        C3348u9 c3348u9;
        C2927e2 c2927e2 = this.mAdManager;
        if (c2927e2 != null) {
            c2927e2.s();
        }
        try {
            Animation animationA = b.a(this.f24380k, getWidth(), getHeight());
            C2927e2 c2927e3 = this.mAdManager;
            if (c2927e3 != null) {
                c2927e3.a(this);
            }
            if (animationA != null) {
                startAnimation(animationA);
            }
        } catch (Exception e10) {
            C2927e2 c2927e4 = this.mAdManager;
            if (c2927e4 == null || (c3348u9 = c2927e4.f25851f) == null) {
                return;
            }
            s.g("InMobiBanner", "TAG");
            c3348u9.a("InMobiBanner", "Unexpected error while displaying Banner Ad : ", e10);
        }
    }

    public final boolean b(String str) {
        C3348u9 c3348u9;
        C3348u9 c3348u10;
        if (this.f24378i > 0 && this.f24379j > 0) {
            return true;
        }
        if (getLayoutParams() == null) {
            C2927e2 c2927e2 = this.mAdManager;
            if (c2927e2 != null && (c3348u10 = c2927e2.f25851f) != null) {
                s.g("InMobiBanner", "TAG");
                c3348u10.b("InMobiBanner", "The layout params of the banner must be set before calling " + str + " or call setBannerSize(int widthInDp, int heightInDp) before " + str);
            }
            return false;
        }
        if (getLayoutParams().width != -2 && getLayoutParams().height != -2) {
            if (getLayoutParams() == null) {
                return true;
            }
            this.f24378i = J3.b(getLayoutParams().width / N5.b());
            this.f24379j = J3.b(getLayoutParams().height / N5.b());
            return true;
        }
        C2927e2 c2927e3 = this.mAdManager;
        if (c2927e3 != null && (c3348u9 = c2927e3.f25851f) != null) {
            s.g("InMobiBanner", "TAG");
            c3348u9.b("InMobiBanner", "The height or width of a Banner ad can't be WRAP_CONTENT or call setBannerSize(int widthInDp, int heightInDp) before " + str);
        }
        return false;
    }

    public final void a(final PublisherCallbacks publisherCallbacks, String str, final boolean z10) {
        C3348u9 c3348u9;
        C3348u9 c3348u10;
        C3348u9 c3348u11;
        C3348u9 c3348u12;
        C3348u9 c3348u13;
        try {
            Sg sg2 = this.mPubSettings;
            sg2.getClass();
            s.h(str, "<set-?>");
            sg2.f25697g = str;
            C2927e2 c2927e2 = this.mAdManager;
            if (c2927e2 != null && c2927e2.l()) {
                C2927e2 c2927e3 = this.mAdManager;
                if (c2927e3 != null) {
                    c2927e3.g();
                }
                C2927e2 c2927e4 = this.mAdManager;
                if (c2927e4 != null && (c3348u13 = c2927e4.f25851f) != null) {
                    s.g("InMobiBanner", "TAG");
                    c3348u13.a("InMobiBanner", "load called - placementType - " + str + " " + this);
                }
                C2927e2 c2927e5 = this.mAdManager;
                if (c2927e5 != null && (c3348u12 = c2927e5.f25851f) != null) {
                    s.g("InMobiBanner", "TAG");
                    c3348u12.b("InMobiBanner", "load already in progress");
                }
                C2927e2 c2927e6 = this.mAdManager;
                if (c2927e6 != null) {
                    c2927e6.b((short) 2169);
                }
                Y1 y10 = this.mPubListener;
                if (y10 != null) {
                    y10.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                }
                C2927e2 c2927e7 = this.mAdManager;
                if (c2927e7 != null && (c3348u11 = c2927e7.f25851f) != null) {
                    s.g("InMobiBanner", "TAG");
                    c3348u11.b("InMobiBanner", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                }
                Sb.a((byte) 1, "InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                return;
            }
            Context context = getContext();
            s.g(context, "getContext(...)");
            a(this, context);
            C2927e2 c2927e8 = this.mAdManager;
            if (c2927e8 != null) {
                c2927e8.g();
            }
            C2927e2 c2927e9 = this.mAdManager;
            if (c2927e9 != null && (c3348u10 = c2927e9.f25851f) != null) {
                s.g("InMobiBanner", "TAG");
                c3348u10.a("InMobiBanner", "load called - placementType - " + str + " " + this);
            }
            a(TrackLoadSettingsAtom.TYPE, new tl.a() { // from class: wh.b
                @Override // tl.a
                public final Object invoke() {
                    return InMobiBanner.a(this.f56271a, publisherCallbacks, z10);
                }
            });
        } catch (Exception e10) {
            C2927e2 c2927e10 = this.mAdManager;
            if (c2927e10 != null) {
                c2927e10.a((short) 2172);
            }
            Y1 y11 = this.mPubListener;
            if (y11 != null) {
                y11.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            C2927e2 c2927e11 = this.mAdManager;
            if (c2927e11 == null || (c3348u9 = c2927e11.f25851f) == null) {
                return;
            }
            s.g("InMobiBanner", "TAG");
            c3348u9.a("InMobiBanner", "Load failed with unexpected error: ", e10);
        }
    }

    public final void load() {
        b();
        a((PublisherCallbacks) this.f24374e, "NonAB", false);
    }

    public static /* synthetic */ void getPreloadManager$annotations() {
    }

    public final void load(Context context) {
        s.h(context, "context");
        b();
        this.f24382m = context instanceof Activity ? new WeakReference(context) : null;
        a((PublisherCallbacks) this.f24374e, "NonAB", false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiBanner(Context context, long j10) {
        super(context);
        s.h(context, "context");
        this.audioStatusInternal = V1.f25865d;
        this.f24374e = new a(this);
        this.f24376g = true;
        this.f24380k = AnimationType.ROTATE_HORIZONTAL_AXIS;
        Sg sg2 = new Sg();
        this.mPubSettings = sg2;
        this.f24384o = new d(this);
        if (Xi.d()) {
            if (context instanceof Activity) {
                this.f24382m = new WeakReference(context);
            }
            this.mAdManager = new C2927e2();
            sg2.f25691a = j10;
            a(this, context);
            C2927e2 c2927e2 = this.mAdManager;
            this.f24375f = c2927e2 != null ? c2927e2.k() : 0;
            this.f24377h = new HandlerC2902d2(this);
            return;
        }
        s.g("InMobiBanner", "TAG");
        throw new SdkNotInitializedException("InMobiBanner");
    }

    public static final g0 a(InMobiBanner inMobiBanner, PublisherCallbacks publisherCallbacks, boolean z10) {
        C2927e2 c2927e2;
        inMobiBanner.a();
        long j10 = inMobiBanner.f24381l;
        if (j10 == 0 || (c2927e2 = inMobiBanner.mAdManager) == null || c2927e2.a(j10)) {
            inMobiBanner.f24381l = SystemClock.elapsedRealtime();
            C2927e2 c2927e3 = inMobiBanner.mAdManager;
            if (c2927e3 != null) {
                c2927e3.a(publisherCallbacks, inMobiBanner.getFrameSizeString(), z10);
            }
        }
        return g0.f38750a;
    }

    public final void a(String str, final tl.a aVar) {
        C3348u9 c3348u9;
        C3348u9 c3348u10;
        C2927e2 c2927e2 = this.mAdManager;
        if (c2927e2 != null && (c3348u10 = c2927e2.f25851f) != null) {
            s.g("InMobiBanner", "TAG");
            c3348u10.c("InMobiBanner", "validateSizeAndLoad");
        }
        if (!b(str)) {
            C2927e2 c2927e3 = this.mAdManager;
            if (c2927e3 != null && (c3348u9 = c2927e3.f25851f) != null) {
                s.g("InMobiBanner", "TAG");
                c3348u9.b("InMobiBanner", "invalid banner size. fail.");
            }
            C2927e2 c2927e4 = this.mAdManager;
            if (c2927e4 != null) {
                c2927e4.a((short) 2170);
            }
            Y1 y10 = this.mPubListener;
            if (y10 != null) {
                y10.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
                return;
            }
            return;
        }
        if (this.f24378i > 0 && this.f24379j > 0) {
            aVar.invoke();
            return;
        }
        Runnable runnable = new Runnable() { // from class: wh.c
            @Override // java.lang.Runnable
            public final void run() {
                InMobiBanner.a(this.f56274a, aVar);
            }
        };
        k kVar = AbstractC2971fk.f26574a;
        s.h(runnable, "runnable");
        ((Handler) AbstractC2971fk.f26574a.getValue()).postDelayed(runnable, 200L);
    }

    public static final void a(InMobiBanner inMobiBanner, tl.a aVar) {
        C3348u9 c3348u9;
        C3348u9 c3348u10;
        try {
            if (inMobiBanner.f24378i > 0 && inMobiBanner.f24379j > 0) {
                aVar.invoke();
                return;
            }
            C2927e2 c2927e2 = inMobiBanner.mAdManager;
            if (c2927e2 != null && (c3348u10 = c2927e2.f25851f) != null) {
                s.g("InMobiBanner", "TAG");
                c3348u10.b("InMobiBanner", "The height or width of the banner can not be determined");
            }
            C2927e2 c2927e3 = inMobiBanner.mAdManager;
            if (c2927e3 != null) {
                c2927e3.a((short) 2171);
            }
            Y1 y10 = inMobiBanner.mPubListener;
            if (y10 != null) {
                y10.a(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
            }
        } catch (Exception e10) {
            C2927e2 c2927e4 = inMobiBanner.mAdManager;
            if (c2927e4 != null) {
                c2927e4.a((short) 2172);
            }
            Y1 y11 = inMobiBanner.mPubListener;
            if (y11 != null) {
                y11.a(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            C2927e2 c2927e5 = inMobiBanner.mAdManager;
            if (c2927e5 == null || (c3348u9 = c2927e5.f25851f) == null) {
                return;
            }
            s.g("InMobiBanner", "TAG");
            c3348u9.a("InMobiBanner", "InMobiBanner$4.run() threw unexpected error: ", e10);
        }
    }

    public static void a(InMobiBanner inMobiBanner, Context context) {
        int iA;
        C2927e2 c2927e2 = inMobiBanner.mAdManager;
        if (c2927e2 != null) {
            c2927e2.a(context, inMobiBanner.mPubSettings, inMobiBanner.getFrameSizeString());
        }
        C2927e2 c2927e3 = inMobiBanner.mAdManager;
        if (c2927e3 != null) {
            int i10 = inMobiBanner.f24375f;
            iA = c2927e3.a(i10, i10);
        } else {
            iA = 0;
        }
        inMobiBanner.f24375f = iA;
    }

    public final void a() {
        HandlerC2902d2 handlerC2902d2 = this.f24377h;
        if (handlerC2902d2 != null) {
            handlerC2902d2.removeMessages(1);
        }
    }

    public final long a(String str) {
        C3348u9 c3348u9;
        C3348u9 c3348u10;
        C3348u9 c3348u11;
        try {
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = s.i(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            StringBuilder sb2 = new StringBuilder(str.subSequence(i10, length + 1).toString());
            if (r.A("plid-", sb2.substring(0, 5), true)) {
                String strSubstring = sb2.substring(5, sb2.length());
                s.e(strSubstring);
                int length2 = strSubstring.length() - 1;
                int i11 = 0;
                boolean z12 = false;
                while (i11 <= length2) {
                    boolean z13 = s.i(strSubstring.charAt(!z12 ? i11 : length2), 32) <= 0;
                    if (z12) {
                        if (!z13) {
                            break;
                        }
                        length2--;
                    } else if (z13) {
                        i11++;
                    } else {
                        z12 = true;
                    }
                }
                return Long.parseLong(strSubstring.subSequence(i11, length2 + 1).toString());
            }
            C2927e2 c2927e2 = this.mAdManager;
            if (c2927e2 != null && (c3348u11 = c2927e2.f25851f) != null) {
                s.g("InMobiBanner", "TAG");
                c3348u11.b("InMobiBanner", "Invalid Placement id: " + str);
                return Long.MIN_VALUE;
            }
            return Long.MIN_VALUE;
        } catch (NumberFormatException unused) {
            C2927e2 c2927e3 = this.mAdManager;
            if (c2927e3 != null && (c3348u10 = c2927e3.f25851f) != null) {
                s.g("InMobiBanner", "TAG");
                c3348u10.b("InMobiBanner", "Invalid Placement id: " + str);
            }
        } catch (StringIndexOutOfBoundsException unused2) {
            C2927e2 c2927e4 = this.mAdManager;
            if (c2927e4 != null && (c3348u9 = c2927e4.f25851f) != null) {
                s.g("InMobiBanner", "TAG");
                c3348u9.b("InMobiBanner", "Invalid Placement id: " + str);
            }
        }
    }
}

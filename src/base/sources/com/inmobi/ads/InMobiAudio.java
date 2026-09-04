package com.inmobi.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import bm.r;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom;
import com.inmobi.ads.InMobiAudio;
import com.inmobi.ads.exceptions.InvalidPlacementIdException;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.AudioAdEventListener;
import com.inmobi.media.AbstractC2878c4;
import com.inmobi.media.AbstractC2971fk;
import com.inmobi.media.B5;
import com.inmobi.media.C3136m4;
import com.inmobi.media.J3;
import com.inmobi.media.N1;
import com.inmobi.media.N5;
import com.inmobi.media.P5;
import com.inmobi.media.R1;
import com.inmobi.media.Sb;
import com.inmobi.media.Sg;
import com.inmobi.media.W1;
import com.inmobi.media.Xi;
import com.inmobi.media.Y8;
import com.inmobi.media.Yi;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import fl.k;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001)B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\rJ#\u0010\u0012\u001a\u00020\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\rJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001e\u0010\rJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001f\u0010\rJ!\u0010#\u001a\u00020\u000b2\b\b\u0001\u0010!\u001a\u00020 2\b\b\u0001\u0010\"\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0007¢\u0006\u0004\b%\u0010\rJ\r\u0010&\u001a\u00020\u000b¢\u0006\u0004\b&\u0010\rJ\r\u0010'\u001a\u00020\u000b¢\u0006\u0004\b'\u0010\rJ\u000f\u0010(\u001a\u00020\u000bH\u0007¢\u0006\u0004\b(\u0010\rR$\u0010.\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u001cR$\u00106\u001a\u0004\u0018\u00010/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0014\u00109\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/inmobi/ads/InMobiAudio;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "placementId", "(Landroid/content/Context;J)V", "Lfl/g0;", TrackLoadSettingsAtom.TYPE, "()V", "show", "", "", "extras", "setExtras", "(Ljava/util/Map;)V", "keywords", "setKeywords", "(Ljava/lang/String;)V", "contentUrl", "setContentUrl", "Lcom/inmobi/ads/listeners/AudioAdEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lcom/inmobi/ads/listeners/AudioAdEventListener;)V", "disableHardwareAcceleration", "onAttachedToWindow", "onDetachedFromWindow", "", "widthInDp", "heightInDp", "setAudioSize", "(II)V", "setupViewSizeObserver", CampaignEx.JSON_NATIVE_VIDEO_RESUME, CampaignEx.JSON_NATIVE_VIDEO_PAUSE, "destroy", "a", "Lcom/inmobi/ads/listeners/AudioAdEventListener;", "getMPubListener$media_release", "()Lcom/inmobi/ads/listeners/AudioAdEventListener;", "setMPubListener$media_release", "mPubListener", "Lcom/inmobi/media/W1;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/inmobi/media/W1;", "getMAdManager$media_release", "()Lcom/inmobi/media/W1;", "setMAdManager$media_release", "(Lcom/inmobi/media/W1;)V", "mAdManager", "getFrameSizeString", "()Ljava/lang/String;", "frameSizeString", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiAudio extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public AudioAdEventListener mPubListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public W1 mAdManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f24365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Sg f24366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f24367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24369g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/inmobi/ads/InMobiAudio$a;", "Lcom/inmobi/media/R1;", "Lcom/inmobi/ads/InMobiAudio;", MimeTypes.BASE_TYPE_AUDIO, "<init>", "(Lcom/inmobi/ads/InMobiAudio;)V", "Lcom/inmobi/ads/AdMetaInfo;", "info", "Lfl/g0;", "onAdFetchSuccessful", "(Lcom/inmobi/ads/AdMetaInfo;)V", "Lcom/inmobi/ads/InMobiAdRequestStatus;", NotificationCompat.CATEGORY_STATUS, "onAdFetchFailed", "(Lcom/inmobi/ads/InMobiAdRequestStatus;)V", "", "getType", "()B", "type", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends R1 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InMobiAudio audio) {
            super(audio);
            s.h(audio, "audio");
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(InMobiAdRequestStatus status) {
            AudioAdEventListener mPubListener;
            s.h(status, "status");
            InMobiAudio inMobiAudio = a().get();
            if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
                return;
            }
            mPubListener.onAdLoadFailed(inMobiAudio, status);
        }

        @Override // com.inmobi.media.R1, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(AdMetaInfo info) {
            s.h(info, "info");
            super.onAdFetchSuccessful(info);
            InMobiAudio inMobiAudio = a().get();
            if (inMobiAudio == null) {
                return;
            }
            try {
                W1 mAdManager = inMobiAudio.getMAdManager();
                if (mAdManager != null) {
                    mAdManager.k();
                }
            } catch (IllegalStateException e10) {
                Sb.a((byte) 1, "InMobiAudio", e10.getMessage());
                AudioAdEventListener mPubListener = inMobiAudio.getMPubListener();
                if (mPubListener != null) {
                    mPubListener.onAdLoadFailed(inMobiAudio, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiAudio(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s.h(context, "context");
        s.h(attributeSet, "attributeSet");
        a aVar = new a(this);
        Sg sg2 = new Sg();
        this.f24366d = sg2;
        if (!Xi.d()) {
            throw new SdkNotInitializedException("InMobiAudio");
        }
        if (context instanceof Activity) {
            this.f24365c = new WeakReference(context);
        }
        this.mAdManager = new W1(aVar);
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", "placementId");
        if (attributeValue != null) {
            long jA = a(attributeValue);
            if (jA == Long.MIN_VALUE) {
                throw new InvalidPlacementIdException();
            }
            sg2.f25691a = jA;
        }
        Context context2 = getContext();
        s.g(context2, "getContext(...)");
        W1 w10 = this.mAdManager;
        if (w10 != null) {
            w10.a(context2, sg2, getFrameSizeString());
        }
    }

    public static final boolean access$hasValidSize(InMobiAudio inMobiAudio) {
        return inMobiAudio.f24368f > 0 && inMobiAudio.f24369g > 0;
    }

    private final String getFrameSizeString() {
        return this.f24368f + "x" + this.f24369g;
    }

    public final boolean a() {
        if (this.f24368f <= 0 || this.f24369g <= 0) {
            if (getLayoutParams() == null) {
                Sb.a((byte) 1, "InMobiAudio", "The layout params of the audio ad view must be set before calling " + TrackLoadSettingsAtom.TYPE + " or call setAudioSize(int widthInDp, int heightInDp) before " + TrackLoadSettingsAtom.TYPE);
                return false;
            }
            if (getLayoutParams().width == -2 || getLayoutParams().height == -2) {
                Sb.a((byte) 1, "InMobiAudio", "The height or width of a Audio ad can't be WRAP_CONTENT or call setAudioSize(int widthInDp, int heightInDp) before " + TrackLoadSettingsAtom.TYPE);
                return false;
            }
            if (getLayoutParams() != null) {
                this.f24368f = J3.b(getLayoutParams().width / N5.b());
                this.f24369g = J3.b(getLayoutParams().height / N5.b());
            }
        }
        return true;
    }

    public final void b() {
        W1 w10;
        N1 n10;
        try {
            C3136m4 c3136m4 = AbstractC2878c4.f26300a;
            s.h(AdConfig.class, "clazz");
            C3136m4 c3136m5 = AbstractC2878c4.f26300a;
            if (!((AdConfig) c3136m5.a(AdConfig.class)).getAudio().getIsAudioEnabled()) {
                W1 w11 = this.mAdManager;
                if (w11 != null) {
                    w11.a((short) 107);
                }
                W1 w12 = this.mAdManager;
                if (w12 != null) {
                    w12.a(w12.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.FEATURE_DISABLED));
                }
                Sb.a((byte) 1, "InMobi", "");
                return;
            }
            Sg sg2 = this.f24366d;
            sg2.getClass();
            s.h("NonAB", "<set-?>");
            sg2.f25697g = "NonAB";
            Context context = getContext();
            s.g(context, "getContext(...)");
            W1 w13 = this.mAdManager;
            if (w13 != null) {
                w13.a(context, this.f24366d, getFrameSizeString());
            }
            W1 w14 = this.mAdManager;
            if (w14 != null && (n10 = w14.f25919j) != null && n10.f26890b == 7) {
                W1 w15 = this.mAdManager;
                if (w15 != null) {
                    w15.b((short) 15);
                }
                AudioAdEventListener audioAdEventListener = this.mPubListener;
                if (audioAdEventListener != null) {
                    audioAdEventListener.onAdLoadFailed(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                }
                Sb.a((byte) 1, "InMobiAudio", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                return;
            }
            if (!a()) {
                W1 w16 = this.mAdManager;
                if (w16 != null) {
                    w16.a((short) 108);
                }
                W1 w17 = this.mAdManager;
                if (w17 != null) {
                    w17.a(w17.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID));
                    return;
                }
                return;
            }
            s.h(AdConfig.class, "clazz");
            if (((AdConfig) c3136m5.a(AdConfig.class)).getAudio().getMinDeviceVolume() > B5.f24500a.a(Xi.f26021a, Xi.f26026f)) {
                W1 w18 = this.mAdManager;
                if (w18 != null) {
                    w18.a((short) 106);
                }
                W1 w19 = this.mAdManager;
                if (w19 != null) {
                    w19.a(w19.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.DEVICE_AUDIO_LEVEL_LOW));
                    return;
                }
                return;
            }
            if (this.f24368f <= 0 || this.f24369g <= 0) {
                Runnable runnable = new Runnable() { // from class: wh.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        InMobiAudio.a(this.f56270a);
                    }
                };
                k kVar = AbstractC2971fk.f26574a;
                s.h(runnable, "runnable");
                ((Handler) AbstractC2971fk.f26574a.getValue()).postDelayed(runnable, 200L);
                return;
            }
            long j10 = this.f24367e;
            if (j10 == 0 || (w10 = this.mAdManager) == null || w10.a(j10)) {
                this.f24367e = SystemClock.elapsedRealtime();
                W1 w20 = this.mAdManager;
                if (w20 != null) {
                    w20.b(getFrameSizeString());
                }
            }
        } catch (Exception e10) {
            W1 w21 = this.mAdManager;
            if (w21 != null) {
                w21.a((short) 105);
            }
            Sb.a((byte) 1, "InMobiAudio", "Unable to load ad; SDK encountered an unexpected error");
            e10.getMessage();
        }
    }

    public final void destroy() {
        removeAllViews();
        W1 w10 = this.mAdManager;
        if (w10 != null) {
            w10.h();
        }
        this.mPubListener = null;
    }

    public final void disableHardwareAcceleration() {
        this.f24366d.f25694d = true;
    }

    /* JADX INFO: renamed from: getMAdManager$media_release, reason: from getter */
    public final W1 getMAdManager() {
        return this.mAdManager;
    }

    /* JADX INFO: renamed from: getMPubListener$media_release, reason: from getter */
    public final AudioAdEventListener getMPubListener() {
        return this.mPubListener;
    }

    public final void load() {
        W1 w10 = this.mAdManager;
        if (w10 != null) {
            w10.g();
        }
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            W1 w10 = this.mAdManager;
            if (w10 != null) {
                w10.j();
            }
            if (getLayoutParams() != null) {
                this.f24368f = J3.b(getLayoutParams().width / N5.b());
                this.f24369g = J3.b(getLayoutParams().height / N5.b());
            }
            if (this.f24368f <= 0 || this.f24369g <= 0) {
                setupViewSizeObserver();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                P5 p10 = N5.f25313a;
                Context context = getContext();
                WindowInsets rootWindowInsets = getRootWindowInsets();
                s.g(rootWindowInsets, "getRootWindowInsets(...)");
                N5.a(rootWindowInsets, context);
            }
        } catch (Exception e10) {
            Sb.a((byte) 1, "InMobiAudio", "InMobiAudio#onAttachedToWindow() handler threw unexpected error");
            e10.getMessage();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            W1 w10 = this.mAdManager;
            if (w10 != null) {
                w10.p();
            }
        } catch (Exception e10) {
            Sb.a((byte) 1, "InMobiAudio", "InMobiAudio.onDetachedFromWindow() handler threw unexpected error");
            e10.getMessage();
        }
    }

    public final void pause() {
        W1 w10;
        try {
            if (this.f24365c != null || (w10 = this.mAdManager) == null) {
                return;
            }
            w10.i();
        } catch (Exception e10) {
            Sb.a((byte) 1, "InMobi", "Could not pause ad; SDK encountered an unexpected error");
            e10.getMessage();
        }
    }

    public final void resume() {
        W1 w10;
        try {
            if (this.f24365c != null || (w10 = this.mAdManager) == null) {
                return;
            }
            w10.l();
        } catch (Exception e10) {
            Sb.a((byte) 1, "InMobi", "Could not resume ad; SDK encountered an unexpected error");
            e10.getMessage();
        }
    }

    public final void setAudioSize(int widthInDp, int heightInDp) {
        this.f24368f = widthInDp;
        this.f24369g = heightInDp;
    }

    public final void setContentUrl(String contentUrl) {
        s.h(contentUrl, "contentUrl");
        this.f24366d.f25695e = contentUrl;
    }

    public final void setExtras(Map<String, String> extras) {
        if (extras != null) {
            String str = extras.get("tp");
            if (str != null && !TextUtils.isEmpty(str)) {
                Yi.f26090b = str;
            }
            String str2 = extras.get("tp-v");
            if (str2 != null && !TextUtils.isEmpty(str2)) {
                Yi.f26089a = str2;
            }
        }
        this.f24366d.f25693c = extras;
    }

    public final void setKeywords(String keywords) {
        this.f24366d.f25692b = keywords;
    }

    public final void setListener(AudioAdEventListener listener) {
        s.h(listener, "listener");
        this.mPubListener = listener;
    }

    public final void setMAdManager$media_release(W1 w10) {
        this.mAdManager = w10;
    }

    public final void setMPubListener$media_release(AudioAdEventListener audioAdEventListener) {
        this.mPubListener = audioAdEventListener;
    }

    public final void setupViewSizeObserver() {
        getViewTreeObserver().addOnGlobalLayoutListener(new Y8(this));
    }

    public final void show() {
        W1 w10 = this.mAdManager;
        if (w10 != null) {
            w10.n();
        }
        W1 w11 = this.mAdManager;
        if (w11 != null) {
            w11.a(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiAudio(Context context, long j10) {
        super(context);
        s.h(context, "context");
        a aVar = new a(this);
        Sg sg2 = new Sg();
        this.f24366d = sg2;
        if (Xi.d()) {
            if (context instanceof Activity) {
                this.f24365c = new WeakReference(context);
            }
            W1 w10 = new W1(aVar);
            this.mAdManager = w10;
            sg2.f25691a = j10;
            w10.a(context, sg2, getFrameSizeString());
            return;
        }
        throw new SdkNotInitializedException("InMobiAudio");
    }

    public static final void a(InMobiAudio inMobiAudio) {
        W1 w10;
        try {
            if (inMobiAudio.f24368f > 0 && inMobiAudio.f24369g > 0) {
                long j10 = inMobiAudio.f24367e;
                if (j10 == 0 || (w10 = inMobiAudio.mAdManager) == null || w10.a(j10)) {
                    inMobiAudio.f24367e = SystemClock.elapsedRealtime();
                    W1 w11 = inMobiAudio.mAdManager;
                    if (w11 != null) {
                        w11.b(inMobiAudio.getFrameSizeString());
                        return;
                    }
                    return;
                }
                return;
            }
            Sb.a((byte) 1, "InMobiAudio", "The height or width of the audio ad can not be determined");
            W1 w12 = inMobiAudio.mAdManager;
            if (w12 != null) {
                w12.a((short) 108);
            }
            W1 w13 = inMobiAudio.mAdManager;
            if (w13 != null) {
                w13.a(w13.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        } catch (Exception e10) {
            W1 w14 = inMobiAudio.mAdManager;
            if (w14 != null) {
                w14.a((short) 105);
            }
            Sb.a((byte) 1, "InMobiAudio", "SDK encountered unexpected error while loading an ad");
            e10.getMessage();
        }
    }

    public static long a(String str) {
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
            Sb.a((byte) 1, "InMobiAudio", "Placement id value supplied in XML layout is not valid. Please make sure placement id is in plid-0123456789 format.");
            Sb.a((byte) 1, "InMobiAudio", "Invalid Placement id: " + str);
            return Long.MIN_VALUE;
        } catch (NumberFormatException unused) {
            Sb.a((byte) 1, "InMobiAudio", "Placement id value supplied in XML layout is not valid. Audio creation failed.");
            Sb.a((byte) 1, "InMobiAudio", "Invalid Placement id: " + str);
            return Long.MIN_VALUE;
        } catch (StringIndexOutOfBoundsException unused2) {
            Sb.a((byte) 1, "InMobiAudio", "Placement id value supplied in XML layout is not valid. Please make sure placement id is in plid-0123456789 format.");
            Sb.a((byte) 1, "InMobiAudio", "Invalid Placement id: " + str);
            return Long.MIN_VALUE;
        }
    }
}

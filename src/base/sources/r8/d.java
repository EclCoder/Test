package r8;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.nativead.MediaView;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.OnMBMediaViewListener;
import com.mbridge.msdk.widget.MBAdChoice;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d extends UnifiedNativeAdMapper implements OnMBMediaViewListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Campaign f51157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final MediationAdLoadCallback f51158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    MediationNativeAdCallback f51159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f51160d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class a extends NativeAd.Image {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable f51161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f51162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final double f51163c;

        public a(Drawable drawable, Uri uri, double d10) {
            this.f51161a = drawable;
            this.f51162b = uri;
            this.f51163c = d10;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return this.f51161a;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return this.f51163c;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Uri getUri() {
            return this.f51162b;
        }
    }

    public d(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        this.f51160d = com.google.ads.mediation.mintegral.a.f(mediationNativeAdConfiguration.getMediationExtras());
        this.f51158b = mediationAdLoadCallback;
    }

    protected void a(Campaign campaign, Context context) {
        d dVar;
        this.f51157a = campaign;
        if (campaign.getAppName() != null) {
            setHeadline(this.f51157a.getAppName());
        }
        if (this.f51157a.getAppDesc() != null) {
            setBody(this.f51157a.getAppDesc());
        }
        if (this.f51157a.getAdCall() != null) {
            setCallToAction(this.f51157a.getAdCall());
        }
        setStarRating(Double.valueOf(this.f51157a.getRating()));
        if (TextUtils.isEmpty(this.f51157a.getIconUrl())) {
            dVar = this;
        } else {
            dVar = this;
            setIcon(dVar.new a(null, Uri.parse(this.f51157a.getIconUrl()), 1.0d));
        }
        MBMediaView mBMediaView = new MBMediaView(context);
        mBMediaView.setVideoSoundOnOff(!dVar.f51160d);
        mBMediaView.setNativeAd(dVar.f51157a);
        setMediaView(mBMediaView);
        MBAdChoice mBAdChoice = new MBAdChoice(context);
        mBAdChoice.setCampaign(dVar.f51157a);
        setAdChoicesContent(mBAdChoice);
        setOverrideClickHandling(true);
    }

    protected List b(View view) {
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            if (view instanceof MediaView) {
                arrayList.add(view);
                return arrayList;
            }
            if (!(view instanceof ViewGroup)) {
                arrayList.add(view);
                return arrayList;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                if (viewGroup.getChildAt(i10) instanceof ViewGroup) {
                    arrayList.addAll(b(viewGroup.getChildAt(i10)));
                } else {
                    arrayList.add(viewGroup.getChildAt(i10));
                }
            }
        }
        return arrayList;
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onEnterFullscreen() {
        MediationNativeAdCallback mediationNativeAdCallback = this.f51159c;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdOpened();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onExitFullscreen() {
        MediationNativeAdCallback mediationNativeAdCallback = this.f51159c;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdClosed();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onVideoAdClicked(Campaign campaign) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f51159c;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onVideoStart() {
        MediationNativeAdCallback mediationNativeAdCallback = this.f51159c;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onVideoPlay();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onFinishRedirection(Campaign campaign, String str) {
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onRedirectionFailed(Campaign campaign, String str) {
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onStartRedirection(Campaign campaign, String str) {
    }
}

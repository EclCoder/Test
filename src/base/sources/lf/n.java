package lf;

import android.app.Activity;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import fl.g0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import nh.l0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f44484g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map f44485h = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f44486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RewardedAd f44487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f44488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f44489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f44490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f44491f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        COMPRESS,
        REMOVE_WATERMARK,
        AUTO_CAPTION;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ ml.a f44496e = ml.b.a(d());
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n a(a adLocation) {
            n nVar;
            s.h(adLocation, "adLocation");
            synchronized (this) {
                try {
                    Map map = n.f44485h;
                    Object nVar2 = map.get(adLocation);
                    if (nVar2 == null) {
                        nVar2 = new n(adLocation);
                        map.put(adLocation, nVar2);
                    }
                    nVar = (n) nVar2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return nVar;
        }

        public final void b() {
            synchronized (this) {
                try {
                    Iterator it = n.f44485h.values().iterator();
                    while (it.hasNext()) {
                        ((n) it.next()).k();
                    }
                    n.f44485h.clear();
                    g0 g0Var = g0.f38750a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        void f();

        void h();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44497a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.COMPRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.REMOVE_WATERMARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.AUTO_CAPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f44497a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e extends RewardedAdLoadCallback {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a extends FullScreenContentCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n f44499a;

            a(n nVar) {
                this.f44499a = nVar;
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdClicked() {
                wp.a.h("RewardedAdsManager").g("Ad was clicked.", new Object[0]);
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdDismissedFullScreenContent() {
                c cVar;
                wp.a.h("RewardedAdsManager").g("Ad dismissed fullscreen content.", new Object[0]);
                this.f44499a.f44487b = null;
                if (this.f44499a.f44491f && (cVar = this.f44499a.f44490e) != null) {
                    cVar.h();
                }
                this.f44499a.m();
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdFailedToShowFullScreenContent(AdError adError) {
                s.h(adError, "adError");
                wp.a.h("RewardedAdsManager").d("Ad failed to show fullscreen content.", new Object[0]);
                this.f44499a.f44487b = null;
                c cVar = this.f44499a.f44490e;
                if (cVar != null) {
                    cVar.f();
                }
                this.f44499a.m();
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdImpression() {
                wp.a.h("RewardedAdsManager").g("Ad recorded an impression.", new Object[0]);
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdShowedFullScreenContent() {
                wp.a.h("RewardedAdsManager").g("Ad showed fullscreen content.", new Object[0]);
            }
        }

        e() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(RewardedAd ad2) {
            s.h(ad2, "ad");
            wp.a.h("RewardedAdsManager").g("Ad was loaded.", new Object[0]);
            n.this.f44487b = ad2;
            n.this.f44488c = System.currentTimeMillis();
            n.this.f44489d = false;
            RewardedAd rewardedAd = n.this.f44487b;
            if (rewardedAd != null) {
                rewardedAd.setFullScreenContentCallback(new a(n.this));
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError adError) {
            s.h(adError, "adError");
            wp.a.h("RewardedAdsManager").g("Failed to load ad: %s", adError.toString());
            n.this.f44487b = null;
            n.this.f44489d = false;
        }
    }

    public n(a adLocation) {
        s.h(adLocation, "adLocation");
        this.f44486a = adLocation;
    }

    public static final n i(a aVar) {
        return f44484g.a(aVar);
    }

    private final void n() {
        String str;
        int i10 = d.f44497a[this.f44486a.ordinal()];
        if (i10 == 1) {
            str = lf.a.f44391r;
        } else if (i10 == 2) {
            str = lf.a.f44392s;
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = lf.a.f44393t;
        }
        AdRequest adRequestBuild = new AdRequest.Builder().build();
        s.g(adRequestBuild, "build(...)");
        RewardedAd.load(AzRecorderApp.e().getApplicationContext(), str, adRequestBuild, new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(n nVar, RewardItem rewardItem) {
        s.h(rewardItem, "rewardItem");
        int amount = rewardItem.getAmount();
        nVar.f44491f = amount > 0;
        wp.a.h("RewardedAdsManager").g("Reward amount: %d, type: %s", Integer.valueOf(amount), rewardItem.getType());
    }

    public final boolean j() {
        return this.f44487b != null && System.currentTimeMillis() - this.f44488c < 3600000;
    }

    public final void k() {
        this.f44489d = false;
        this.f44487b = null;
    }

    public final void l() {
        this.f44490e = null;
    }

    public final void m() {
        if (l0.o() || j() || this.f44489d) {
            return;
        }
        this.f44489d = true;
        n();
    }

    public final void o(c listener) {
        s.h(listener, "listener");
        this.f44490e = listener;
    }

    public final void p(Activity activity) {
        s.h(activity, "activity");
        this.f44491f = false;
        RewardedAd rewardedAd = this.f44487b;
        if (rewardedAd != null) {
            rewardedAd.show(activity, new OnUserEarnedRewardListener() { // from class: lf.m
                @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                public final void onUserEarnedReward(RewardItem rewardItem) {
                    n.q(this.f44483a, rewardItem);
                }
            });
            return;
        }
        wp.a.h("RewardedAdsManager").g("The rewarded ad wasn't ready yet.", new Object[0]);
        c cVar = this.f44490e;
        if (cVar != null) {
            cVar.f();
        }
    }
}

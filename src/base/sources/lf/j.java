package lf;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
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
public final class j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f44444g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map f44445h = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f44446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterstitialAd f44447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f44448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f44449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f44450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private tl.a f44451f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        VIDEO_VIEW,
        IMAGE_VIEW,
        LIVE_STREAM;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ ml.a f44456e = ml.b.a(d());
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a(a adLocation) {
            j jVar;
            s.h(adLocation, "adLocation");
            synchronized (this) {
                try {
                    Map map = j.f44445h;
                    Object jVar2 = map.get(adLocation);
                    if (jVar2 == null) {
                        jVar2 = new j(adLocation);
                        map.put(adLocation, jVar2);
                    }
                    jVar = (j) jVar2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return jVar;
        }

        public final void b() {
            synchronized (this) {
                try {
                    Iterator it = j.f44445h.values().iterator();
                    while (it.hasNext()) {
                        ((j) it.next()).l();
                    }
                    j.f44445h.clear();
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
        void onAdDismissed();

        void x();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44457a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.VIDEO_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.IMAGE_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.LIVE_STREAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f44457a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e extends InterstitialAdLoadCallback {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a extends FullScreenContentCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f44459a;

            a(j jVar) {
                this.f44459a = jVar;
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdDismissedFullScreenContent() {
                wp.a.g("Google interstitial Ad was dismissed.", new Object[0]);
                this.f44459a.f44447b = null;
                c cVar = this.f44459a.f44450e;
                if (cVar != null) {
                    cVar.onAdDismissed();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdFailedToShowFullScreenContent(AdError adError) {
                s.h(adError, "adError");
                wp.a.g("Google interstitial Ad failed to show.", new Object[0]);
                this.f44459a.f44447b = null;
                c cVar = this.f44459a.f44450e;
                if (cVar != null) {
                    cVar.x();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdShowedFullScreenContent() {
                wp.a.g("Google interstitial Ad showed fullscreen content.", new Object[0]);
            }
        }

        e() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(InterstitialAd interstitialAd) {
            s.h(interstitialAd, "interstitialAd");
            wp.a.g("Google interstitial ad was loaded", new Object[0]);
            j.this.f44447b = interstitialAd;
            j.this.f44448c = System.currentTimeMillis();
            j.this.f44449d = false;
            InterstitialAd interstitialAd2 = j.this.f44447b;
            if (interstitialAd2 != null) {
                interstitialAd2.setFullScreenContentCallback(new a(j.this));
            }
            j.this.k();
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError adError) {
            s.h(adError, "adError");
            wp.a.g(adError.getMessage(), new Object[0]);
            j.this.f44447b = null;
            j.this.f44449d = false;
            j.this.k();
        }
    }

    public j(a adLocation) {
        s.h(adLocation, "adLocation");
        this.f44446a = adLocation;
    }

    public static final j h(a aVar) {
        return f44444g.a(aVar);
    }

    private final boolean i() {
        return this.f44447b != null && System.currentTimeMillis() - this.f44448c < 3600000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        tl.a aVar = this.f44451f;
        this.f44451f = null;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public static /* synthetic */ void o(j jVar, Context context, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = AzRecorderApp.e().getApplicationContext();
        }
        jVar.n(context);
    }

    private final void p(Context context) {
        String str;
        AdRequest adRequestBuild = new AdRequest.Builder().build();
        s.g(adRequestBuild, "build(...)");
        int i10 = d.f44457a[this.f44446a.ordinal()];
        if (i10 == 1) {
            str = lf.a.f44388o;
        } else if (i10 == 2) {
            str = lf.a.f44389p;
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = lf.a.f44390q;
        }
        InterstitialAd.load(context, str, adRequestBuild, new e());
    }

    public final boolean j() {
        return this.f44449d;
    }

    public final void l() {
        this.f44449d = false;
        this.f44447b = null;
        this.f44451f = null;
    }

    public final void m() {
        this.f44450e = null;
    }

    public final void n(Context context) {
        s.h(context, "context");
        if (l0.o() || this.f44449d || i()) {
            return;
        }
        this.f44449d = true;
        p(context);
    }

    public final void q(c listener) {
        s.h(listener, "listener");
        this.f44450e = listener;
    }

    public final void r(tl.a aVar) {
        this.f44451f = aVar;
    }

    public final boolean s(Activity activity) {
        s.h(activity, "activity");
        if (l0.o() || !i()) {
            return false;
        }
        InterstitialAd interstitialAd = this.f44447b;
        if (interstitialAd == null) {
            return true;
        }
        interstitialAd.show(activity);
        return true;
    }
}

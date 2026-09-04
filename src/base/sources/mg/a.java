package mg;

import android.app.Activity;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import nh.l0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0712a f46242e = new C0712a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile a f46243f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AppOpenAd f46244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f46245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f46246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f46247d;

    /* JADX INFO: renamed from: mg.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0712a {
        public /* synthetic */ C0712a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            a aVar;
            a aVar2 = a.f46243f;
            if (aVar2 != null) {
                return aVar2;
            }
            synchronized (this) {
                aVar = a.f46243f;
                if (aVar == null) {
                    aVar = new a(null);
                    a.f46243f = aVar;
                }
            }
            return aVar;
        }

        private C0712a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends AppOpenAd.AppOpenAdLoadCallback {
        b() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(AppOpenAd ad2) {
            s.h(ad2, "ad");
            a.this.f46244a = ad2;
            a.this.f46245b = false;
            a.this.f46246c = new Date().getTime();
            wp.a.a("App open ad loaded successfully", new Object[0]);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError error) {
            s.h(error, "error");
            a.this.f46245b = false;
            wp.a.d("Failed to load app open ad: " + error.getMessage(), new Object[0]);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends FullScreenContentCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ tl.a f46250b;

        c(tl.a aVar) {
            this.f46250b = aVar;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            a.this.f46244a = null;
            a.this.f46247d = false;
            a.this.k();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            s.h(adError, "adError");
            a.this.f46244a = null;
            a.this.f46247d = false;
            wp.a.d("Failed to show app open ad: " + adError.getMessage(), new Object[0]);
            a.this.k();
            tl.a aVar = this.f46250b;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            wp.a.a("App open ad showed", new Object[0]);
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final a g() {
        return f46242e.a();
    }

    private final boolean h() {
        return new Date().getTime() - this.f46246c > 14400000;
    }

    private final boolean i() {
        return (this.f46244a == null || h()) ? false : true;
    }

    private final void j() {
        this.f46245b = true;
        AdRequest adRequestBuild = new AdRequest.Builder().build();
        s.g(adRequestBuild, "build(...)");
        AppOpenAd.load(AzRecorderApp.e(), lf.a.f44394u, adRequestBuild, new b());
    }

    public final void k() {
        if (l0.o() || this.f46245b || i()) {
            return;
        }
        j();
    }

    public final boolean l(Activity activity, tl.a aVar) {
        s.h(activity, "activity");
        if (this.f46247d) {
            wp.a.a("App open ad is already showing", new Object[0]);
            return false;
        }
        if (!i()) {
            wp.a.a("App open ad is not ready yet", new Object[0]);
            k();
            return false;
        }
        AppOpenAd appOpenAd = this.f46244a;
        if (appOpenAd != null) {
            appOpenAd.setFullScreenContentCallback(new c(aVar));
        }
        this.f46247d = true;
        AppOpenAd appOpenAd2 = this.f46244a;
        if (appOpenAd2 != null) {
            appOpenAd2.show(activity);
        }
        return true;
    }

    private a() {
    }
}

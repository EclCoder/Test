package lf;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
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
public final class c implements lf.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0675c f44397g = new C0675c(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map f44398h = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f44399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AdView f44400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f44401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f44402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private lf.b.a f44403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public lg.a f44404f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        HOME,
        EXPORT,
        SHARE,
        REVIEW,
        CAPTION;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ ml.a f44411g = ml.b.a(d());
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum b {
        NONE,
        LOADING,
        LOADED,
        SHOWN;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ ml.a f44417f = ml.b.a(d());
    }

    /* JADX INFO: renamed from: lf.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0675c {
        public /* synthetic */ C0675c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(a adLocation) {
            c cVar;
            s.h(adLocation, "adLocation");
            synchronized (this) {
                try {
                    Map map = c.f44398h;
                    Object cVar2 = map.get(adLocation);
                    if (cVar2 == null) {
                        cVar2 = new c(adLocation, null);
                        map.put(adLocation, cVar2);
                    }
                    cVar = (c) cVar2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return cVar;
        }

        public final void b() {
            synchronized (this) {
                try {
                    Iterator it = c.f44398h.values().iterator();
                    while (it.hasNext()) {
                        ((c) it.next()).release();
                    }
                    c.f44398h.clear();
                    g0 g0Var = g0.f38750a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private C0675c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44418a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EXPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.SHARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.REVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.CAPTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f44418a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e extends AdListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdView f44420b;

        e(AdView adView) {
            this.f44420b = adView;
        }

        @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
        public void onAdClicked() {
            super.onAdClicked();
            lf.b.a aVar = c.this.f44403e;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            s.h(loadAdError, "loadAdError");
            wp.a.a("Google banner ads failed to load", new Object[0]);
            super.onAdFailedToLoad(loadAdError);
            AdView adView = c.this.f44400b;
            if (adView != null) {
                adView.destroy();
            }
            c.this.f44400b = null;
            c.this.f44401c = b.NONE;
            lf.b.a aVar = c.this.f44403e;
            if (aVar != null) {
                aVar.b();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            super.onAdLoaded();
            wp.a.g("Google banner ads loaded", new Object[0]);
            AdView adView = c.this.f44400b;
            if (adView != null) {
                adView.destroy();
            }
            c.this.f44400b = this.f44420b;
            c.this.f44401c = b.LOADED;
            c.this.f44402d = System.currentTimeMillis();
            lf.b.a aVar = c.this.f44403e;
            if (aVar != null) {
                aVar.onAdsLoaded();
            }
        }
    }

    public /* synthetic */ c(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    private final AdSize m() {
        int iWidth;
        Context applicationContext = AzRecorderApp.e().getApplicationContext();
        DisplayMetrics displayMetrics = applicationContext.getResources().getDisplayMetrics();
        Object systemService = applicationContext.getSystemService("window");
        s.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        WindowManager windowManager = (WindowManager) systemService;
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            s.g(currentWindowMetrics, "getCurrentWindowMetrics(...)");
            iWidth = currentWindowMetrics.getBounds().width();
        } else {
            iWidth = displayMetrics.widthPixels;
        }
        AdSize currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(applicationContext, (int) (iWidth / displayMetrics.density));
        s.g(currentOrientationAnchoredAdaptiveBannerAdSize, "getCurrentOrientationAnc…AdaptiveBannerAdSize(...)");
        return currentOrientationAnchoredAdaptiveBannerAdSize;
    }

    public static final c n(a aVar) {
        return f44397g.a(aVar);
    }

    private final void o() {
        wp.a.g("requestGoogleBannerAds", new Object[0]);
        AdView adView = new AdView(AzRecorderApp.e().getApplicationContext());
        int i10 = d.f44418a[this.f44399a.ordinal()];
        if (i10 == 1) {
            adView.setAdUnitId(lf.a.f44383j);
            adView.setAdSize(m());
        } else if (i10 == 2) {
            adView.setAdUnitId(lf.a.f44384k);
            adView.setAdSize(AdSize.MEDIUM_RECTANGLE);
        } else if (i10 == 3) {
            adView.setAdUnitId(lf.a.f44386m);
            adView.setAdSize(AdSize.MEDIUM_RECTANGLE);
        } else if (i10 == 4) {
            adView.setAdUnitId(lf.a.f44387n);
            adView.setAdSize(AdSize.MEDIUM_RECTANGLE);
        } else {
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            adView.setAdUnitId(lf.a.f44385l);
            adView.setAdSize(AdSize.MEDIUM_RECTANGLE);
        }
        AdRequest adRequestBuild = new AdRequest.Builder().build();
        s.g(adRequestBuild, "build(...)");
        adView.loadAd(adRequestBuild);
        adView.setAdListener(new e(adView));
    }

    @Override // lf.b
    public void a() {
        if (l0.o() || c() || b()) {
            return;
        }
        this.f44401c = b.LOADING;
        o();
    }

    @Override // lf.b
    public boolean b() {
        return this.f44401c == b.LOADED && System.currentTimeMillis() - this.f44402d < 3600000;
    }

    @Override // lf.b
    public boolean c() {
        return this.f44401c == b.LOADING;
    }

    @Override // lf.b
    public void d() {
        AdView adView = this.f44400b;
        if (adView != null) {
            adView.resume();
        }
    }

    @Override // lf.b
    public void e(lf.b.a listener) {
        s.h(listener, "listener");
        this.f44403e = listener;
    }

    @Override // lf.b
    public void f() {
        AdView adView = this.f44400b;
        if (adView != null) {
            adView.pause();
        }
    }

    public final void p(ViewGroup viewGroup) {
        AdView adView;
        if (l0.o() || !b() || viewGroup == null || (adView = this.f44400b) == null) {
            return;
        }
        this.f44401c = b.SHOWN;
        viewGroup.removeAllViews();
        try {
            viewGroup.addView(adView);
            viewGroup.setVisibility(0);
        } catch (IllegalStateException e10) {
            com.google.firebase.crashlytics.a.b().d(e10);
            ViewParent parent = adView.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(adView);
            }
            try {
                viewGroup.addView(adView);
                viewGroup.setVisibility(0);
            } catch (IllegalStateException e11) {
                com.google.firebase.crashlytics.a.b().d(e11);
            }
        }
    }

    @Override // lf.b
    public void release() {
        this.f44403e = null;
        this.f44401c = b.NONE;
        AdView adView = this.f44400b;
        if (adView != null) {
            adView.destroy();
        }
        this.f44400b = null;
    }

    private c(a aVar) {
        this.f44399a = aVar;
        this.f44401c = b.NONE;
        AzRecorderApp.d().z(this);
    }
}

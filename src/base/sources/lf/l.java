package lf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.bug.sk.hnj.UfZs.NhHRaDJCHtCTJR;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import fl.g0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import nh.l0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements lf.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f44461f = new c(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map f44462g = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f44463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f44464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f44465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private NativeAd f44466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private lf.b.a f44467e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public enum a {
        EXPORT,
        SHARE,
        REVIEW,
        HOME,
        CAPTION;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ ml.a f44474g = ml.b.a(d());
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public enum b {
        NONE,
        LOADING,
        LOADED,
        SHOWN;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ ml.a f44480f = ml.b.a(d());
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l a(a adLocation) {
            l lVar;
            s.h(adLocation, "adLocation");
            synchronized (this) {
                try {
                    Map map = l.f44462g;
                    Object lVar2 = map.get(adLocation);
                    if (lVar2 == null) {
                        lVar2 = new l(adLocation, null);
                        map.put(adLocation, lVar2);
                    }
                    lVar = (l) lVar2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return lVar;
        }

        public final void b() {
            synchronized (this) {
                try {
                    Iterator it = l.f44462g.values().iterator();
                    while (it.hasNext()) {
                        ((l) it.next()).release();
                    }
                    l.f44462g.clear();
                    g0 g0Var = g0.f38750a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44481a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.EXPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.SHARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.REVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.HOME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.CAPTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f44481a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class f extends AdListener {
        f() {
        }

        @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
        public void onAdClicked() {
            wp.a.g("google onAdClicked", new Object[0]);
            super.onAdClicked();
            lf.b.a aVar = l.this.f44467e;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError adError) {
            s.h(adError, "adError");
            wp.a.d("Can't request google ads %s", adError.toString());
            NativeAd nativeAd = l.this.f44466d;
            if (nativeAd != null) {
                nativeAd.destroy();
            }
            l.this.f44466d = null;
            l.this.f44464b = b.NONE;
            lf.b.a aVar = l.this.f44467e;
            if (aVar != null) {
                aVar.b();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            wp.a.g("Ad opened", new Object[0]);
            super.onAdOpened();
        }
    }

    public /* synthetic */ l(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public static final l m(a aVar) {
        return f44461f.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(l lVar, NativeAd nativeAd) {
        wp.a.g("native ads loaded", new Object[0]);
        NativeAd nativeAd2 = lVar.f44466d;
        if (nativeAd2 != null) {
            nativeAd2.destroy();
        }
        lVar.f44466d = nativeAd;
        lVar.f44464b = b.LOADED;
        lVar.f44465c = System.currentTimeMillis();
        lf.b.a aVar = lVar.f44467e;
        if (aVar != null) {
            aVar.onAdsLoaded();
        }
    }

    @Override // lf.b
    public void a() {
        if (l0.o() || c() || b()) {
            return;
        }
        this.f44464b = b.LOADING;
        o();
    }

    @Override // lf.b
    public boolean b() {
        return this.f44464b == b.LOADED && System.currentTimeMillis() - this.f44465c < 3600000;
    }

    @Override // lf.b
    public boolean c() {
        return this.f44464b == b.LOADING;
    }

    @Override // lf.b
    public void d() {
        lf.b.C0674b.b(this);
    }

    @Override // lf.b
    public void e(lf.b.a listener) {
        s.h(listener, "listener");
        this.f44467e = listener;
    }

    @Override // lf.b
    public void f() {
        lf.b.C0674b.a(this);
    }

    public final boolean n(NativeAdView nativeAdView) {
        if (!l0.o() && b() && nativeAdView != null) {
            try {
                NativeAd nativeAd = this.f44466d;
                if (nativeAd == null) {
                    return false;
                }
                this.f44464b = b.SHOWN;
                View viewFindViewById = nativeAdView.findViewById(R.id.gg_ad_title);
                ((TextView) viewFindViewById).setText(nativeAd.getHeadline());
                nativeAdView.setHeadlineView(viewFindViewById);
                View viewFindViewById2 = nativeAdView.findViewById(R.id.gg_ad_description);
                ((TextView) viewFindViewById2).setText(nativeAd.getBody());
                nativeAdView.setBodyView(viewFindViewById2);
                View viewFindViewById3 = nativeAdView.findViewById(R.id.gg_ad_call_to_action_btn);
                ((Button) viewFindViewById3).setText(nativeAd.getCallToAction());
                nativeAdView.setCallToActionView(viewFindViewById3);
                View viewFindViewById4 = nativeAdView.findViewById(R.id.gg_ad_icon);
                ImageView imageView = (ImageView) viewFindViewById4;
                try {
                    NativeAd.Image icon = nativeAd.getIcon();
                    imageView.setImageDrawable(icon != null ? icon.getDrawable() : null);
                    imageView.setVisibility(0);
                } catch (Exception unused) {
                    imageView.setVisibility(8);
                }
                nativeAdView.setIconView(viewFindViewById4);
                MediaView mediaView = (MediaView) nativeAdView.findViewById(R.id.gg_ad_media_view);
                if (mediaView != null) {
                    mediaView.setOnHierarchyChangeListener(new e());
                    nativeAdView.setMediaView(mediaView);
                }
                nativeAdView.setNativeAd(nativeAd);
                ViewParent parent = nativeAdView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                nativeAdView.setVisibility(0);
                return true;
            } catch (Exception e10) {
                wp.a.e(e10);
                com.google.firebase.crashlytics.a.b().d(e10);
            }
        }
        return false;
    }

    @Override // lf.b
    public void release() {
        this.f44467e = null;
        this.f44464b = b.NONE;
        NativeAd nativeAd = this.f44466d;
        if (nativeAd != null) {
            nativeAd.destroy();
        }
        this.f44466d = null;
    }

    private l(a aVar) {
        this.f44463a = aVar;
        this.f44464b = b.NONE;
    }

    private final void o() {
        String str;
        Context applicationContext = AzRecorderApp.e().getApplicationContext();
        int i10 = d.f44481a[this.f44463a.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            str = lf.a.f44376c;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        str = lf.a.f44382i;
                    }
                } else {
                    str = lf.a.f44377d;
                }
            } else {
                str = lf.a.f44374a;
            }
        } else {
            str = lf.a.f44375b;
        }
        AdLoader adLoaderBuild = new AdLoader.Builder(applicationContext, str).forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: lf.k
            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
            public final void onNativeAdLoaded(NativeAd nativeAd) {
                l.p(this.f44460a, nativeAd);
            }
        }).withAdListener(new f()).withNativeAdOptions(new NativeAdOptions.Builder().setMediaAspectRatio(2).setAdChoicesPlacement(1).build()).build();
        s.g(adLoaderBuild, NhHRaDJCHtCTJR.rSIbLRfpO);
        adLoaderBuild.loadAd(new AdRequest.Builder().build());
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View parent, View child) {
            s.h(parent, "parent");
            s.h(child, "child");
            if (child instanceof ImageView) {
                ((ImageView) child).setAdjustViewBounds(true);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
        }
    }
}

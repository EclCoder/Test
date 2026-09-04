package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import com.inmobi.ads.InMobiNative;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import com.inmobi.media.ads.network.inmobiJson.model.AppMetrics;
import com.inmobi.media.ads.network.inmobiJson.model.CTA;
import com.inmobi.media.ads.network.inmobiJson.model.Description;
import com.inmobi.media.ads.network.inmobiJson.model.Icon;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import com.inmobi.media.ads.network.inmobiJson.model.Sponsored;
import com.inmobi.media.ads.network.inmobiJson.model.Title;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.yd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3455yd extends AbstractC3441y implements InterfaceC3332tj, Ah, InterfaceC2950f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaView f27944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f27945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC2926e1 f27946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Vc f27947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Mc f27948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rc f27949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final H4 f27950h;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3455yd(MediaView mediaView, View view, AbstractC2926e1 adSessionManager, Vc nativeBeaconProcessor, Mc nativeAdUnitComponent, Rc stateMachine) {
        kotlin.jvm.internal.s.h(adSessionManager, "adSessionManager");
        kotlin.jvm.internal.s.h(nativeBeaconProcessor, "nativeBeaconProcessor");
        kotlin.jvm.internal.s.h(nativeAdUnitComponent, "nativeAdUnitComponent");
        kotlin.jvm.internal.s.h(stateMachine, "stateMachine");
        C3416x c3416x = nativeAdUnitComponent.f25267a;
        super(c3416x);
        this.f27944b = mediaView;
        this.f27945c = view;
        this.f27946d = adSessionManager;
        this.f27947e = nativeBeaconProcessor;
        this.f27948f = nativeAdUnitComponent;
        this.f27949g = stateMachine;
        G g10 = c3416x.f27823b;
        this.f27950h = new H4(g10.f24818h, g10.f24811a.f27159a.f25691a);
    }

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void a() throws JSONException {
        NativeMedia media;
        AppMetrics appMetrics;
        Sponsored sponsored;
        CTA cta;
        Description description;
        Title title;
        Icon icon;
        AppMetrics appMetrics2;
        AppMetrics appMetrics3;
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("NativeLoadedState", "Initialize Called");
        }
        Lc lc2 = (Lc) this.f27948f.f25272f.getValue();
        Map mapA = AbstractC3487zk.a(lc2.f25200a);
        long j10 = lc2.f25201b.f26287a;
        em.o0 o0Var = AbstractC3488zl.f28033a;
        mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        C3178nk c3178nk = C3178nk.f27064a;
        C3178nk.b("AdLoadSuccessful", mapA, EnumC3281rk.SDK);
        this.f27947e.f25893b.f25746b.a(C2863bf.f26261a);
        JsonAssetObject assetsObject = this.f27948f.f25268b.getAssetsObject();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(InMobiNative.APP_INSTALLS, (assetsObject == null || (appMetrics3 = assetsObject.getAppMetrics()) == null) ? null : appMetrics3.getDownloads());
        jSONObject.put(InMobiNative.LIKES, (assetsObject == null || (appMetrics2 = assetsObject.getAppMetrics()) == null) ? null : appMetrics2.getLikes());
        C3068je pubData = new C3068je((assetsObject == null || (title = assetsObject.getTitle()) == null) ? null : title.getText(), (assetsObject == null || (description = assetsObject.getDescription()) == null) ? null : description.getText(), new InMobiNativeImage((assetsObject == null || (icon = assetsObject.getIcon()) == null) ? null : icon.getUrl()), (assetsObject == null || (cta = assetsObject.getCta()) == null) ? null : cta.getText(), jSONObject, (assetsObject == null || (sponsored = assetsObject.getSponsored()) == null) ? null : sponsored.getText(), (assetsObject == null || (appMetrics = assetsObject.getAppMetrics()) == null) ? null : appMetrics.getRating(), kotlin.jvm.internal.s.c((assetsObject == null || (media = assetsObject.getMedia()) == null) ? null : media.getType(), MimeTypes.BASE_TYPE_VIDEO), this.f27944b, this.f27945c);
        Ic ic2 = this.f27948f.f25269c;
        ic2.getClass();
        kotlin.jvm.internal.s.h(pubData, "pubData");
        InterfaceC3332tj interfaceC3332tj = ic2.f25000c;
        Kd kd2 = interfaceC3332tj instanceof Kd ? (Kd) interfaceC3332tj : null;
        if (kd2 != null) {
            kd2.a(pubData);
        }
    }

    @Override // com.inmobi.media.InterfaceC3332tj
    public final void c() {
    }

    @Override // com.inmobi.media.Ah
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        kotlin.jvm.internal.s.h(inMobiNativeViewData, "inMobiNativeViewData");
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("NativeLoadedState", "registerViewForTracking - parentView: " + inMobiNativeViewData.getParentView() + ", isAttachedToWindow: " + inMobiNativeViewData.getParentView().isAttachedToWindow());
        }
        G g10 = this.f27890a.f27823b;
        kotlin.jvm.internal.s.h(g10, "<this>");
        kotlin.jvm.internal.s.h(g10, "<this>");
        long timeToLive = g10.f24811a.f27160b.getCacheConfig("native").getTimeToLive();
        long millis = g10.f24821k;
        if (millis == -1) {
            millis = g10.f24820j + TimeUnit.SECONDS.toMillis(timeToLive);
        }
        if (millis - System.currentTimeMillis() < 0) {
            InterfaceC3322t9 interfaceC3322t9L2 = l();
            if (interfaceC3322t9L2 != null) {
                ((C3348u9) interfaceC3322t9L2).a("NativeLoadedState", "Ad-Expired");
            }
            Map mapA = AbstractC3487zk.a(((Lc) this.f27948f.f25272f.getValue()).f25200a);
            C3178nk c3178nk = C3178nk.f27064a;
            C3178nk.b("AdExpired", mapA, EnumC3281rk.SDK);
        }
        this.f27950h.a();
        C2874c0 c2874c0 = this.f27890a.f27822a.f27106d;
        c2874c0.getClass();
        c2874c0.f26290d = SystemClock.elapsedRealtime();
        this.f27947e.f25893b.f25748d.a(C2863bf.f26261a);
        Map mapA2 = AbstractC3487zk.a(((Lc) this.f27948f.f25272f.getValue()).f25200a);
        C3178nk c3178nk2 = C3178nk.f27064a;
        C3178nk.b("StartTracking", mapA2, EnumC3281rk.SDK);
        this.f27949g.a(new Be(new Ce(new Fi(), new C2865bh(inMobiNativeViewData, this.f27944b, this.f27945c), this.f27950h, this.f27946d, this.f27947e, this.f27948f), this.f27949g), this);
    }

    @Override // com.inmobi.media.InterfaceC2950f
    public final Object a(kl.f fVar) {
        InterfaceC3322t9 interfaceC3322t9L = l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("NativeLoadedState", "onDestroy");
        }
        Object objA = this.f27949g.a(new C2913dd(), this, (kotlin.coroutines.jvm.internal.d) fVar);
        return objA == ll.b.f() ? objA : fl.g0.f38750a;
    }
}

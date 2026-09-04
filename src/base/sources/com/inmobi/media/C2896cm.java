package com.inmobi.media;

import com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom;
import com.inmobi.media.C2896cm;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.cm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2896cm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2947em f26361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gc f26362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Gc f26363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Gc f26364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Gc f26365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Gc f26366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Gc f26367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3306sj f26368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Gc f26369i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Gc f26370j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Gc f26371k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Gc f26372l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Gc f26373m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final R5 f26374n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Gc f26375o;

    public C2896cm(Uc nativeBeaconMacroData, C2947em trackerData) {
        kotlin.jvm.internal.s.h(nativeBeaconMacroData, "nativeBeaconMacroData");
        kotlin.jvm.internal.s.h(trackerData, "trackerData");
        this.f26361a = trackerData;
        C3306sj c3306sj = new C3306sj(nativeBeaconMacroData, new tl.a() { // from class: yh.j7
            @Override // tl.a
            public final Object invoke() {
                return C2896cm.e(this.f57789a);
            }
        });
        C3306sj c3306sj2 = new C3306sj(nativeBeaconMacroData, new tl.a() { // from class: yh.u7
            @Override // tl.a
            public final Object invoke() {
                return C2896cm.f(this.f57956a);
            }
        });
        this.f26362b = new Gc(nativeBeaconMacroData, new tl.a() { // from class: yh.v7
            @Override // tl.a
            public final Object invoke() {
                return C2896cm.d(this.f57974a);
            }
        });
        this.f26363c = new Gc(nativeBeaconMacroData, new tl.a() { // from class: yh.w7
            @Override // tl.a
            public final Object invoke() {
                return C2896cm.g(this.f57989a);
            }
        });
        this.f26364d = new Gc(nativeBeaconMacroData, new tl.a() { // from class: yh.x7
            @Override // tl.a
            public final Object invoke() {
                return C2896cm.h(this.f58006a);
            }
        });
        this.f26365e = new Gc(nativeBeaconMacroData, new tl.a() { // from class: yh.k7
            @Override // tl.a
            public final Object invoke() {
                return C2896cm.b(this.f57802a);
            }
        });
        this.f26366f = new Gc(nativeBeaconMacroData, new tl.a() { // from class: yh.l7
            @Override // tl.a
            public final Object invoke() {
                return C2896cm.j(this.f57820a);
            }
        });
        this.f26367g = new Gc(nativeBeaconMacroData, new tl.a() { // from class: yh.m7
            @Override // tl.a
            public final Object invoke() {
                return C2896cm.n(this.f57836a);
            }
        });
        this.f26368h = new C3306sj(nativeBeaconMacroData, new tl.a() { // from class: yh.n7
            @Override // tl.a
            public final Object invoke() {
                return C2896cm.c(this.f57852a);
            }
        });
        this.f26369i = new Gc(nativeBeaconMacroData, new tl.a() { // from class: yh.o7
            @Override // tl.a
            public final Object invoke() {
                return C2896cm.k(this.f57866a);
            }
        });
        this.f26370j = new Gc(nativeBeaconMacroData, new tl.a() { // from class: yh.p7
            @Override // tl.a
            public final Object invoke() {
                return C2896cm.o(this.f57879a);
            }
        });
        this.f26371k = new Gc(nativeBeaconMacroData, new tl.a() { // from class: yh.q7
            @Override // tl.a
            public final Object invoke() {
                return C2896cm.l(this.f57892a);
            }
        });
        this.f26372l = new Gc(nativeBeaconMacroData, new tl.a() { // from class: yh.r7
            @Override // tl.a
            public final Object invoke() {
                return C2896cm.m(this.f57909a);
            }
        });
        this.f26373m = new Gc(nativeBeaconMacroData, new tl.a() { // from class: yh.s7
            @Override // tl.a
            public final Object invoke() {
                return C2896cm.i(this.f57924a);
            }
        });
        this.f26374n = new R5(nativeBeaconMacroData, trackerData, c3306sj, c3306sj2);
        this.f26375o = new Gc(nativeBeaconMacroData, new tl.a() { // from class: yh.t7
            @Override // tl.a
            public final Object invoke() {
                return C2896cm.a(this.f57939a);
            }
        });
    }

    public static final List a(C2896cm c2896cm) {
        return D4.a("companion_rendered", c2896cm.f26361a.f26516a.f27880a);
    }

    public static final List b(C2896cm c2896cm) {
        return c2896cm.a(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
    }

    public static final List c(C2896cm c2896cm) {
        return D4.a("creative_view", c2896cm.f26361a.f26516a.f27880a);
    }

    public static final List d(C2896cm c2896cm) {
        return c2896cm.a(CampaignEx.JSON_NATIVE_VIDEO_FIRST_QUARTILE, "firstQuartile");
    }

    public static final List e(C2896cm c2896cm) {
        return D4.a("progress_received", c2896cm.f26361a.f26516a.f27880a);
    }

    public static final List f(C2896cm c2896cm) {
        return D4.a("progress_occurred", c2896cm.f26361a.f26516a.f27880a);
    }

    public static final List g(C2896cm c2896cm) {
        return c2896cm.a("second_quartile", CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
    }

    public static final List h(C2896cm c2896cm) {
        return c2896cm.a(CampaignEx.JSON_NATIVE_VIDEO_THIRD_QUARTILE, "thirdQuartile");
    }

    public static final List i(C2896cm c2896cm) {
        return c2896cm.a("error", "error");
    }

    public static final List j(C2896cm c2896cm) {
        return c2896cm.a(TrackLoadSettingsAtom.TYPE, "loaded");
    }

    public static final List k(C2896cm c2896cm) {
        return c2896cm.a(CampaignEx.JSON_NATIVE_VIDEO_MUTE, CampaignEx.JSON_NATIVE_VIDEO_MUTE);
    }

    public static final List l(C2896cm c2896cm) {
        return c2896cm.a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public static final List m(C2896cm c2896cm) {
        return c2896cm.a(CampaignEx.JSON_NATIVE_VIDEO_RESUME, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public static final List n(C2896cm c2896cm) {
        return c2896cm.a("start", "start");
    }

    public static final List o(C2896cm c2896cm) {
        return c2896cm.a(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE, CampaignEx.JSON_NATIVE_VIDEO_UNMUTE);
    }

    public final List a(String str, String str2) {
        return gl.r.s0(AbstractC2844am.a(str2, this.f26361a.f26517b), D4.a(str, this.f26361a.f26516a.f27880a));
    }
}

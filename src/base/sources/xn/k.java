package xn;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f56935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f56936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h0 f56937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Long f56938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Long f56939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Long f56940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Long f56941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f56942h;

    public k(boolean z10, boolean z11, h0 h0Var, Long l10, Long l11, Long l12, Long l13, Map extras) {
        kotlin.jvm.internal.s.h(extras, "extras");
        this.f56935a = z10;
        this.f56936b = z11;
        this.f56937c = h0Var;
        this.f56938d = l10;
        this.f56939e = l11;
        this.f56940f = l12;
        this.f56941g = l13;
        this.f56942h = gl.l0.t(extras);
    }

    public static /* synthetic */ k b(k kVar, boolean z10, boolean z11, h0 h0Var, Long l10, Long l11, Long l12, Long l13, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = kVar.f56935a;
        }
        if ((i10 & 2) != 0) {
            z11 = kVar.f56936b;
        }
        if ((i10 & 4) != 0) {
            h0Var = kVar.f56937c;
        }
        if ((i10 & 8) != 0) {
            l10 = kVar.f56938d;
        }
        if ((i10 & 16) != 0) {
            l11 = kVar.f56939e;
        }
        if ((i10 & 32) != 0) {
            l12 = kVar.f56940f;
        }
        if ((i10 & 64) != 0) {
            l13 = kVar.f56941g;
        }
        if ((i10 & 128) != 0) {
            map = kVar.f56942h;
        }
        Long l14 = l13;
        Map map2 = map;
        Long l15 = l11;
        Long l16 = l12;
        return kVar.a(z10, z11, h0Var, l10, l15, l16, l14, map2);
    }

    public final k a(boolean z10, boolean z11, h0 h0Var, Long l10, Long l11, Long l12, Long l13, Map extras) {
        kotlin.jvm.internal.s.h(extras, "extras");
        return new k(z10, z11, h0Var, l10, l11, l12, l13, extras);
    }

    public final Long c() {
        return this.f56938d;
    }

    public final h0 d() {
        return this.f56937c;
    }

    public final boolean e() {
        return this.f56936b;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f56935a) {
            arrayList.add("isRegularFile");
        }
        if (this.f56936b) {
            arrayList.add("isDirectory");
        }
        if (this.f56938d != null) {
            arrayList.add("byteCount=" + this.f56938d.longValue());
        }
        if (this.f56939e != null) {
            arrayList.add("createdAt=" + this.f56939e.longValue());
        }
        if (this.f56940f != null) {
            arrayList.add("lastModifiedAt=" + this.f56940f.longValue());
        }
        if (this.f56941g != null) {
            arrayList.add("lastAccessedAt=" + this.f56941g.longValue());
        }
        if (!this.f56942h.isEmpty()) {
            arrayList.add("extras=" + this.f56942h);
        }
        return gl.r.l0(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public /* synthetic */ k(boolean z10, boolean z11, h0 h0Var, Long l10, Long l11, Long l12, Long l13, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? null : h0Var, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? null : l11, (i10 & 32) != 0 ? null : l12, (i10 & 64) != 0 ? null : l13, (i10 & 128) != 0 ? gl.l0.h() : map);
    }
}

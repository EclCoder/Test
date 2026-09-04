package kotlinx.serialization.json;

import kotlin.jvm.internal.DefaultConstructorMarker;
import um.g1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class w extends g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f43686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rm.f f43687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f43688c;

    public /* synthetic */ w(Object obj, boolean z10, rm.f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z10, (i10 & 4) != 0 ? null : fVar);
    }

    @Override // kotlinx.serialization.json.g0
    public String a() {
        return this.f43688c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        return g() == wVar.g() && kotlin.jvm.internal.s.c(a(), wVar.a());
    }

    public final rm.f f() {
        return this.f43687b;
    }

    public boolean g() {
        return this.f43686a;
    }

    public int hashCode() {
        return (Boolean.hashCode(g()) * 31) + a().hashCode();
    }

    @Override // kotlinx.serialization.json.g0
    public String toString() {
        if (!g()) {
            return a();
        }
        StringBuilder sb2 = new StringBuilder();
        g1.c(sb2, a());
        String string = sb2.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        return string;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Object body, boolean z10, rm.f fVar) {
        super(null);
        kotlin.jvm.internal.s.h(body, "body");
        this.f43686a = z10;
        this.f43687b = fVar;
        this.f43688c = body.toString();
        if (fVar != null && !fVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}

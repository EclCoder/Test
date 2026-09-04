package hn;

import gl.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zl.c f40710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f40711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f40712c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(zl.c key, Object value, f next) {
        super(null);
        s.h(key, "key");
        s.h(value, "value");
        s.h(next, "next");
        this.f40710a = key;
        this.f40711b = value;
        this.f40712c = next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e e(e it) {
        s.h(it, "it");
        f fVar = it.f40712c;
        if (fVar instanceof e) {
            return (e) fVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence f(e it) {
        s.h(it, "it");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(it.f40710a);
        sb2.append('=');
        sb2.append(it.f40711b);
        return sb2.toString();
    }

    @Override // hn.f
    public Object a(zl.c key) {
        s.h(key, "key");
        return s.c(key, this.f40710a) ? sl.a.a(key).cast(this.f40711b) : this.f40712c.a(key);
    }

    @Override // hn.f
    public f b(zl.c key, Object obj) {
        f eVar;
        s.h(key, "key");
        if (s.c(key, this.f40710a)) {
            eVar = this.f40712c;
        } else {
            f fVarB = this.f40712c.b(key, null);
            eVar = fVarB == this.f40712c ? this : new e(this.f40710a, this.f40711b, fVarB);
        }
        return obj != null ? new e(key, obj, eVar) : eVar;
    }

    public String toString() {
        return r.l0(r.u0(am.j.B(am.j.g(this, new Function1() { // from class: hn.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.e((e) obj);
            }
        }))), null, "{", "}", 0, null, new Function1() { // from class: hn.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.f((e) obj);
            }
        }, 25, null);
    }
}

package um;

import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends sm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f54761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vm.b f54762b;

    public e0(a lexer, kotlinx.serialization.json.b json) {
        kotlin.jvm.internal.s.h(lexer, "lexer");
        kotlin.jvm.internal.s.h(json, "json");
        this.f54761a = lexer;
        this.f54762b = json.a();
    }

    @Override // sm.a, sm.e
    public byte F() {
        a aVar = this.f54761a;
        String strQ = aVar.q();
        try {
            return bm.l0.b(strQ);
        } catch (IllegalArgumentException unused) {
            a.x(aVar, "Failed to parse type 'UByte' for input '" + strQ + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // sm.e, sm.c
    public vm.b a() {
        return this.f54762b;
    }

    @Override // sm.a, sm.e
    public int g() {
        a aVar = this.f54761a;
        String strQ = aVar.q();
        try {
            return bm.l0.e(strQ);
        } catch (IllegalArgumentException unused) {
            a.x(aVar, "Failed to parse type 'UInt' for input '" + strQ + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // sm.a, sm.e
    public long k() {
        a aVar = this.f54761a;
        String strQ = aVar.q();
        try {
            return bm.l0.h(strQ);
        } catch (IllegalArgumentException unused) {
            a.x(aVar, "Failed to parse type 'ULong' for input '" + strQ + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // sm.c
    public int o(rm.f descriptor) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // sm.a, sm.e
    public short p() {
        a aVar = this.f54761a;
        String strQ = aVar.q();
        try {
            return bm.l0.k(strQ);
        } catch (IllegalArgumentException unused) {
            a.x(aVar, "Failed to parse type 'UShort' for input '" + strQ + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }
}

package kotlinx.serialization.json;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class r implements pm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f43683a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final rm.f f43684b = rm.l.d("kotlinx.serialization.json.JsonElement", rm.d.b.f51389a, new rm.f[0], new Function1() { // from class: kotlinx.serialization.json.l
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return r.g((rm.a) obj);
        }
    });

    private r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 g(rm.a buildSerialDescriptor) {
        kotlin.jvm.internal.s.h(buildSerialDescriptor, "$this$buildSerialDescriptor");
        rm.a.b(buildSerialDescriptor, "JsonPrimitive", s.f(new tl.a() { // from class: kotlinx.serialization.json.m
            @Override // tl.a
            public final Object invoke() {
                return r.h();
            }
        }), null, false, 12, null);
        rm.a.b(buildSerialDescriptor, "JsonNull", s.f(new tl.a() { // from class: kotlinx.serialization.json.n
            @Override // tl.a
            public final Object invoke() {
                return r.i();
            }
        }), null, false, 12, null);
        rm.a.b(buildSerialDescriptor, "JsonLiteral", s.f(new tl.a() { // from class: kotlinx.serialization.json.o
            @Override // tl.a
            public final Object invoke() {
                return r.j();
            }
        }), null, false, 12, null);
        rm.a.b(buildSerialDescriptor, "JsonObject", s.f(new tl.a() { // from class: kotlinx.serialization.json.p
            @Override // tl.a
            public final Object invoke() {
                return r.k();
            }
        }), null, false, 12, null);
        rm.a.b(buildSerialDescriptor, "JsonArray", s.f(new tl.a() { // from class: kotlinx.serialization.json.q
            @Override // tl.a
            public final Object invoke() {
                return r.l();
            }
        }), null, false, 12, null);
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rm.f h() {
        return h0.f43680a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rm.f i() {
        return b0.f43632a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rm.f j() {
        return x.f43689a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rm.f k() {
        return f0.f43659a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rm.f l() {
        return d.f43635a.getDescriptor();
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return f43684b;
    }

    @Override // pm.c
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public i deserialize(sm.e decoder) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        return s.d(decoder).f();
    }

    @Override // pm.l
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void serialize(sm.f encoder, i value) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        kotlin.jvm.internal.s.h(value, "value");
        s.h(encoder);
        if (value instanceof g0) {
            encoder.q(h0.f43680a, value);
        } else if (value instanceof d0) {
            encoder.q(f0.f43659a, value);
        } else {
            if (!(value instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            encoder.q(d.f43635a, value);
        }
    }
}

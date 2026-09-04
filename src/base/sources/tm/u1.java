package tm;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class u1 implements pm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f53590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f53591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fl.k f53592c;

    public u1(final String serialName, Object objectInstance) {
        kotlin.jvm.internal.s.h(serialName, "serialName");
        kotlin.jvm.internal.s.h(objectInstance, "objectInstance");
        this.f53590a = objectInstance;
        this.f53591b = gl.r.l();
        this.f53592c = fl.l.a(fl.o.PUBLICATION, new tl.a() { // from class: tm.s1
            @Override // tl.a
            public final Object invoke() {
                return u1.c(serialName, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rm.f c(String str, final u1 u1Var) {
        return rm.l.d(str, rm.n.d.f51424a, new rm.f[0], new Function1() { // from class: tm.t1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u1.d(this.f53586a, (rm.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 d(u1 u1Var, rm.a buildSerialDescriptor) {
        kotlin.jvm.internal.s.h(buildSerialDescriptor, "$this$buildSerialDescriptor");
        buildSerialDescriptor.h(u1Var.f53591b);
        return fl.g0.f38750a;
    }

    @Override // pm.c
    public Object deserialize(sm.e decoder) {
        int iO;
        kotlin.jvm.internal.s.h(decoder, "decoder");
        rm.f descriptor = getDescriptor();
        sm.c cVarB = decoder.b(descriptor);
        if (cVarB.l() || (iO = cVarB.o(getDescriptor())) == -1) {
            fl.g0 g0Var = fl.g0.f38750a;
            cVarB.d(descriptor);
            return this.f53590a;
        }
        throw new SerializationException("Unexpected index " + iO);
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return (rm.f) this.f53592c.getValue();
    }

    @Override // pm.l
    public void serialize(sm.f encoder, Object value) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        kotlin.jvm.internal.s.h(value, "value");
        encoder.b(getDescriptor()).d(getDescriptor());
    }
}

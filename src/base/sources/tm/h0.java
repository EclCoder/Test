package tm;

import java.util.Arrays;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 implements pm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Enum[] f53500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private rm.f f53501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fl.k f53502c;

    public h0(final String serialName, Enum[] values) {
        kotlin.jvm.internal.s.h(serialName, "serialName");
        kotlin.jvm.internal.s.h(values, "values");
        this.f53500a = values;
        this.f53502c = fl.l.b(new tl.a() { // from class: tm.g0
            @Override // tl.a
            public final Object invoke() {
                return h0.c(this.f53481a, serialName);
            }
        });
    }

    private final rm.f b(String str) {
        f0 f0Var = new f0(str, this.f53500a.length);
        for (Enum r10 : this.f53500a) {
            g2.q(f0Var, r10.name(), false, 2, null);
        }
        return f0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rm.f c(h0 h0Var, String str) {
        rm.f fVar = h0Var.f53501b;
        return fVar == null ? h0Var.b(str) : fVar;
    }

    @Override // pm.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Enum deserialize(sm.e decoder) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        int iG = decoder.G(getDescriptor());
        if (iG >= 0) {
            Enum[] enumArr = this.f53500a;
            if (iG < enumArr.length) {
                return enumArr[iG];
            }
        }
        throw new SerializationException(iG + " is not among valid " + getDescriptor().i() + " enum values, values size is " + this.f53500a.length);
    }

    @Override // pm.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void serialize(sm.f encoder, Enum value) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        kotlin.jvm.internal.s.h(value, "value");
        int iC0 = gl.j.c0(this.f53500a, value);
        if (iC0 != -1) {
            encoder.E(getDescriptor(), iC0);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(value);
        sb2.append(" is not a valid enum ");
        sb2.append(getDescriptor().i());
        sb2.append(", must be one of ");
        String string = Arrays.toString(this.f53500a);
        kotlin.jvm.internal.s.g(string, "toString(...)");
        sb2.append(string);
        throw new SerializationException(sb2.toString());
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return (rm.f) this.f53502c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().i() + '>';
    }
}

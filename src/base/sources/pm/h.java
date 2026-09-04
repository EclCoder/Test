package pm;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import fl.g0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends tm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zl.c f50257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f50258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fl.k f50259c;

    public h(zl.c baseClass) {
        kotlin.jvm.internal.s.h(baseClass, "baseClass");
        this.f50257a = baseClass;
        this.f50258b = gl.r.l();
        this.f50259c = fl.l.a(fl.o.PUBLICATION, new tl.a() { // from class: pm.f
            @Override // tl.a
            public final Object invoke() {
                return h.h(this.f50255a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rm.f h(final h hVar) {
        return rm.b.c(rm.l.d("kotlinx.serialization.Polymorphic", rm.d.a.f51388a, new rm.f[0], new Function1() { // from class: pm.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.i(this.f50256a, (rm.a) obj);
            }
        }), hVar.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 i(h hVar, rm.a buildSerialDescriptor) {
        kotlin.jvm.internal.s.h(buildSerialDescriptor, "$this$buildSerialDescriptor");
        rm.a.b(buildSerialDescriptor, "type", qm.a.J(o0.f43602a).getDescriptor(), null, false, 12, null);
        rm.a.b(buildSerialDescriptor, AppMeasurementSdk.ConditionalUserProperty.VALUE, rm.l.e("kotlinx.serialization.Polymorphic<" + hVar.e().k() + '>', rm.m.a.f51419a, new rm.f[0], null, 8, null), null, false, 12, null);
        buildSerialDescriptor.h(hVar.f50258b);
        return g0.f38750a;
    }

    @Override // tm.b
    public zl.c e() {
        return this.f50257a;
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return (rm.f) this.f50259c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + e() + ')';
    }
}

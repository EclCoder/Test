package um;

import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class w0 implements vm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f54841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f54842b;

    public w0(boolean z10, String discriminator) {
        kotlin.jvm.internal.s.h(discriminator, "discriminator");
        this.f54841a = z10;
        this.f54842b = discriminator;
    }

    private final void d(rm.f fVar, zl.c cVar) {
        int iE = fVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            String strF = fVar.f(i10);
            if (kotlin.jvm.internal.s.c(strF, this.f54842b)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + cVar + " has property '" + strF + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    @Override // vm.d
    public void a(zl.c baseClass, zl.c actualClass, pm.d actualSerializer) {
        kotlin.jvm.internal.s.h(baseClass, "baseClass");
        kotlin.jvm.internal.s.h(actualClass, "actualClass");
        kotlin.jvm.internal.s.h(actualSerializer, "actualSerializer");
        rm.f descriptor = actualSerializer.getDescriptor();
        e(descriptor, actualClass);
        if (this.f54841a) {
            return;
        }
        d(descriptor, actualClass);
    }

    @Override // vm.d
    public void b(zl.c baseClass, Function1 defaultDeserializerProvider) {
        kotlin.jvm.internal.s.h(baseClass, "baseClass");
        kotlin.jvm.internal.s.h(defaultDeserializerProvider, "defaultDeserializerProvider");
    }

    @Override // vm.d
    public void c(zl.c baseClass, Function1 defaultSerializerProvider) {
        kotlin.jvm.internal.s.h(baseClass, "baseClass");
        kotlin.jvm.internal.s.h(defaultSerializerProvider, "defaultSerializerProvider");
    }

    private final void e(rm.f fVar, zl.c cVar) {
        rm.m mVarD = fVar.d();
        if (!(mVarD instanceof rm.d) && !kotlin.jvm.internal.s.c(mVarD, rm.m.a.f51419a)) {
            if (!this.f54841a) {
                if (!kotlin.jvm.internal.s.c(mVarD, rm.n.b.f51422a) && !kotlin.jvm.internal.s.c(mVarD, rm.n.c.f51423a) && !(mVarD instanceof rm.e) && !(mVarD instanceof rm.m.b)) {
                    return;
                }
                throw new IllegalArgumentException("Serializer for " + cVar.k() + KPtaxpyICj.PiROT + mVarD + " cannot be serialized polymorphically with class discriminator.");
            }
            return;
        }
        throw new IllegalArgumentException("Serializer for " + cVar.k() + " can't be registered as a subclass for polymorphic serialization because its kind " + mVarD + " is not concrete. To work with multiple hierarchies, register it as a base class.");
    }
}

package vm;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.s;
import pm.l;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f55675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f55676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f55677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f55678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f55679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f55680f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider, boolean z10) {
        super(null);
        s.h(class2ContextualFactory, "class2ContextualFactory");
        s.h(polyBase2Serializers, "polyBase2Serializers");
        s.h(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        s.h(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        s.h(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f55675a = class2ContextualFactory;
        this.f55676b = polyBase2Serializers;
        this.f55677c = polyBase2DefaultSerializerProvider;
        this.f55678d = polyBase2NamedSerializers;
        this.f55679e = polyBase2DefaultDeserializerProvider;
        this.f55680f = z10;
    }

    @Override // vm.b
    public void a(d collector) {
        s.h(collector, "collector");
        Iterator it = this.f55675a.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            android.support.v4.media.session.b.a(entry.getValue());
            throw new NoWhenBranchMatchedException();
        }
        for (Map.Entry entry2 : this.f55676b.entrySet()) {
            zl.c cVar = (zl.c) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                zl.c cVar2 = (zl.c) entry3.getKey();
                pm.d dVar = (pm.d) entry3.getValue();
                s.f(cVar, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                s.f(cVar2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                s.f(dVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.a(cVar, cVar2, dVar);
            }
        }
        for (Map.Entry entry4 : this.f55677c.entrySet()) {
            zl.c cVar3 = (zl.c) entry4.getKey();
            Function1 function1 = (Function1) entry4.getValue();
            s.f(cVar3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            s.f(function1, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            collector.c(cVar3, (Function1) p0.e(function1, 1));
        }
        for (Map.Entry entry5 : this.f55679e.entrySet()) {
            zl.c cVar4 = (zl.c) entry5.getKey();
            Function1 function2 = (Function1) entry5.getValue();
            s.f(cVar4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            s.f(function2, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            collector.b(cVar4, (Function1) p0.e(function2, 1));
        }
    }

    @Override // vm.b
    public pm.d b(zl.c kClass, List typeArgumentsSerializers) {
        s.h(kClass, "kClass");
        s.h(typeArgumentsSerializers, "typeArgumentsSerializers");
        android.support.v4.media.session.b.a(this.f55675a.get(kClass));
        return null;
    }

    @Override // vm.b
    public boolean d() {
        return this.f55680f;
    }

    @Override // vm.b
    public pm.c e(zl.c baseClass, String str) {
        s.h(baseClass, "baseClass");
        Map map = (Map) this.f55678d.get(baseClass);
        pm.d dVar = map != null ? (pm.d) map.get(str) : null;
        if (dVar == null) {
            dVar = null;
        }
        if (dVar != null) {
            return dVar;
        }
        Object obj = this.f55679e.get(baseClass);
        Function1 function1 = p0.k(obj, 1) ? (Function1) obj : null;
        if (function1 != null) {
            return (pm.c) function1.invoke(str);
        }
        return null;
    }

    @Override // vm.b
    public l f(zl.c baseClass, Object value) {
        s.h(baseClass, "baseClass");
        s.h(value, "value");
        if (!baseClass.a(value)) {
            return null;
        }
        Map map = (Map) this.f55676b.get(baseClass);
        pm.d dVar = map != null ? (pm.d) map.get(l0.b(value.getClass())) : null;
        if (dVar == null) {
            dVar = null;
        }
        if (dVar != null) {
            return dVar;
        }
        Object obj = this.f55677c.get(baseClass);
        Function1 function1 = p0.k(obj, 1) ? (Function1) obj : null;
        if (function1 != null) {
            return (l) function1.invoke(value);
        }
        return null;
    }
}

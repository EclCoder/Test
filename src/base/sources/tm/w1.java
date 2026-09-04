package tm;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class w1 extends x0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rm.f f53601c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(final pm.d keySerializer, final pm.d valueSerializer) {
        super(keySerializer, valueSerializer, null);
        kotlin.jvm.internal.s.h(keySerializer, "keySerializer");
        kotlin.jvm.internal.s.h(valueSerializer, "valueSerializer");
        this.f53601c = rm.l.c("kotlin.Pair", new rm.f[0], new Function1() { // from class: tm.v1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w1.g(keySerializer, valueSerializer, (rm.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 g(pm.d dVar, pm.d dVar2, rm.a buildClassSerialDescriptor) {
        kotlin.jvm.internal.s.h(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        rm.a.b(buildClassSerialDescriptor, "first", dVar.getDescriptor(), null, false, 12, null);
        rm.a.b(buildClassSerialDescriptor, "second", dVar2.getDescriptor(), null, false, 12, null);
        return fl.g0.f38750a;
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return this.f53601c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.x0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Object a(fl.q qVar) {
        kotlin.jvm.internal.s.h(qVar, "<this>");
        return qVar.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.x0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Object c(fl.q qVar) {
        kotlin.jvm.internal.s.h(qVar, "<this>");
        return qVar.i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.x0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public fl.q e(Object obj, Object obj2) {
        return fl.w.a(obj, obj2);
    }
}

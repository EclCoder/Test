package com.bykv.vk.openvk.preload.a;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class m<IN> implements b<IN> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b<IN> f11698a;

    public m(b<IN> bVar) {
        this.f11698a = bVar;
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object a(IN in2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final <O> O b(Class<? extends d<?, O>> cls) {
        return (O) this.f11698a.b(cls);
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final <I> I a(Class<? extends d<I, ?>> cls) {
        return (I) this.f11698a.a((Class) cls);
    }
}

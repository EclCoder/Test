package tm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class r1 implements pm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pm.d f53571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rm.f f53572b;

    public r1(pm.d serializer) {
        kotlin.jvm.internal.s.h(serializer, "serializer");
        this.f53571a = serializer;
        this.f53572b = new p2(serializer.getDescriptor());
    }

    @Override // pm.c
    public Object deserialize(sm.e decoder) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        return decoder.E() ? decoder.D(this.f53571a) : decoder.j();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && r1.class == obj.getClass() && kotlin.jvm.internal.s.c(this.f53571a, ((r1) obj).f53571a);
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return this.f53572b;
    }

    public int hashCode() {
        return this.f53571a.hashCode();
    }

    @Override // pm.l
    public void serialize(sm.f encoder, Object obj) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        if (obj == null) {
            encoder.s();
        } else {
            encoder.z();
            encoder.q(this.f53571a, obj);
        }
    }
}

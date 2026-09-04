package tm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pm.d f53570a;

        a(pm.d dVar) {
            this.f53570a = dVar;
        }

        @Override // tm.l0
        public pm.d[] childSerializers() {
            return new pm.d[]{this.f53570a};
        }

        @Override // pm.c
        public Object deserialize(sm.e decoder) {
            kotlin.jvm.internal.s.h(decoder, "decoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // pm.d, pm.l, pm.c
        public rm.f getDescriptor() {
            throw new IllegalStateException("unsupported");
        }

        @Override // pm.l
        public void serialize(sm.f encoder, Object obj) {
            kotlin.jvm.internal.s.h(encoder, "encoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // tm.l0
        public pm.d[] typeParametersSerializers() {
            return l0.a.a(this);
        }
    }

    public static final rm.f a(String name, pm.d primitiveSerializer) {
        kotlin.jvm.internal.s.h(name, "name");
        kotlin.jvm.internal.s.h(primitiveSerializer, "primitiveSerializer");
        return new q0(name, new a(primitiveSerializer));
    }
}

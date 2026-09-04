package kotlinx.serialization.json;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements pm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f43635a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final rm.f f43636b = a.f43637b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements rm.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f43637b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f43638c = "kotlinx.serialization.json.JsonArray";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ rm.f f43639a = qm.a.h(r.f43683a).getDescriptor();

        private a() {
        }

        @Override // rm.f
        public boolean b() {
            return this.f43639a.b();
        }

        @Override // rm.f
        public int c(String name) {
            kotlin.jvm.internal.s.h(name, "name");
            return this.f43639a.c(name);
        }

        @Override // rm.f
        public rm.m d() {
            return this.f43639a.d();
        }

        @Override // rm.f
        public int e() {
            return this.f43639a.e();
        }

        @Override // rm.f
        public String f(int i10) {
            return this.f43639a.f(i10);
        }

        @Override // rm.f
        public List g(int i10) {
            return this.f43639a.g(i10);
        }

        @Override // rm.f
        public List getAnnotations() {
            return this.f43639a.getAnnotations();
        }

        @Override // rm.f
        public rm.f h(int i10) {
            return this.f43639a.h(i10);
        }

        @Override // rm.f
        public String i() {
            return f43638c;
        }

        @Override // rm.f
        public boolean isInline() {
            return this.f43639a.isInline();
        }

        @Override // rm.f
        public boolean j(int i10) {
            return this.f43639a.j(i10);
        }
    }

    private d() {
    }

    @Override // pm.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c deserialize(sm.e decoder) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        s.g(decoder);
        return new c((List) qm.a.h(r.f43683a).deserialize(decoder));
    }

    @Override // pm.l
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(sm.f encoder, c value) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        kotlin.jvm.internal.s.h(value, "value");
        s.h(encoder);
        qm.a.h(r.f43683a).serialize(encoder, value);
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return f43636b;
    }
}

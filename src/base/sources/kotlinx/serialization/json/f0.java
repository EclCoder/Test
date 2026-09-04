package kotlinx.serialization.json;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 implements pm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f43659a = new f0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final rm.f f43660b = a.f43661b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements rm.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f43661b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f43662c = "kotlinx.serialization.json.JsonObject";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ rm.f f43663a = qm.a.k(qm.a.J(o0.f43602a), r.f43683a).getDescriptor();

        private a() {
        }

        @Override // rm.f
        public boolean b() {
            return this.f43663a.b();
        }

        @Override // rm.f
        public int c(String name) {
            kotlin.jvm.internal.s.h(name, "name");
            return this.f43663a.c(name);
        }

        @Override // rm.f
        public rm.m d() {
            return this.f43663a.d();
        }

        @Override // rm.f
        public int e() {
            return this.f43663a.e();
        }

        @Override // rm.f
        public String f(int i10) {
            return this.f43663a.f(i10);
        }

        @Override // rm.f
        public List g(int i10) {
            return this.f43663a.g(i10);
        }

        @Override // rm.f
        public List getAnnotations() {
            return this.f43663a.getAnnotations();
        }

        @Override // rm.f
        public rm.f h(int i10) {
            return this.f43663a.h(i10);
        }

        @Override // rm.f
        public String i() {
            return f43662c;
        }

        @Override // rm.f
        public boolean isInline() {
            return this.f43663a.isInline();
        }

        @Override // rm.f
        public boolean j(int i10) {
            return this.f43663a.j(i10);
        }
    }

    private f0() {
    }

    @Override // pm.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d0 deserialize(sm.e decoder) {
        kotlin.jvm.internal.s.h(decoder, "decoder");
        s.g(decoder);
        return new d0((Map) qm.a.k(qm.a.J(o0.f43602a), r.f43683a).deserialize(decoder));
    }

    @Override // pm.l
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(sm.f encoder, d0 value) {
        kotlin.jvm.internal.s.h(encoder, "encoder");
        kotlin.jvm.internal.s.h(value, "value");
        s.h(encoder);
        qm.a.k(qm.a.J(o0.f43602a), r.f43683a).serialize(encoder, value);
    }

    @Override // pm.d, pm.l, pm.c
    public rm.f getDescriptor() {
        return f43660b;
    }
}

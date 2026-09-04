package kotlinx.serialization.json;

import java.util.List;
import kotlin.jvm.internal.l0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class s {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements rm.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final fl.k f43685a;

        a(tl.a aVar) {
            this.f43685a = fl.l.b(aVar);
        }

        private final rm.f a() {
            return (rm.f) this.f43685a.getValue();
        }

        @Override // rm.f
        public boolean b() {
            return rm.f.a.c(this);
        }

        @Override // rm.f
        public int c(String name) {
            kotlin.jvm.internal.s.h(name, "name");
            return a().c(name);
        }

        @Override // rm.f
        public rm.m d() {
            return a().d();
        }

        @Override // rm.f
        public int e() {
            return a().e();
        }

        @Override // rm.f
        public String f(int i10) {
            return a().f(i10);
        }

        @Override // rm.f
        public List g(int i10) {
            return a().g(i10);
        }

        @Override // rm.f
        public List getAnnotations() {
            return rm.f.a.a(this);
        }

        @Override // rm.f
        public rm.f h(int i10) {
            return a().h(i10);
        }

        @Override // rm.f
        public String i() {
            return a().i();
        }

        @Override // rm.f
        public boolean isInline() {
            return rm.f.a.b(this);
        }

        @Override // rm.f
        public boolean j(int i10) {
            return a().j(i10);
        }
    }

    public static final h d(sm.e eVar) {
        kotlin.jvm.internal.s.h(eVar, "<this>");
        h hVar = eVar instanceof h ? (h) eVar : null;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + l0.b(eVar.getClass()));
    }

    public static final t e(sm.f fVar) {
        kotlin.jvm.internal.s.h(fVar, "<this>");
        t tVar = fVar instanceof t ? (t) fVar : null;
        if (tVar != null) {
            return tVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + l0.b(fVar.getClass()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rm.f f(tl.a aVar) {
        return new a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(sm.e eVar) {
        d(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(sm.f fVar) {
        e(fVar);
    }
}

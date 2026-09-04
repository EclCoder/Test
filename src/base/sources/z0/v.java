package z0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final tl.o f58472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final em.y f58473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final h0 f58474c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final kl.j f58475d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(tl.o transform, em.y ack, h0 h0Var, kl.j callerContext) {
            super(null);
            kotlin.jvm.internal.s.h(transform, "transform");
            kotlin.jvm.internal.s.h(ack, "ack");
            kotlin.jvm.internal.s.h(callerContext, "callerContext");
            this.f58472a = transform;
            this.f58473b = ack;
            this.f58474c = h0Var;
            this.f58475d = callerContext;
        }

        public final em.y a() {
            return this.f58473b;
        }

        public final kl.j b() {
            return this.f58475d;
        }

        public h0 c() {
            return this.f58474c;
        }

        public final tl.o d() {
            return this.f58472a;
        }
    }

    public /* synthetic */ v(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private v() {
    }
}

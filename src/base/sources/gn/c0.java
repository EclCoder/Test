package gn;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public enum c0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic"),
    HTTP_3("h3");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f39528a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ ml.a f39527k = ml.b.a(d());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f39518b = new a(null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c0 a(String protocol) throws IOException {
            kotlin.jvm.internal.s.h(protocol, "protocol");
            c0 c0Var = c0.HTTP_1_0;
            if (kotlin.jvm.internal.s.c(protocol, c0Var.f39528a)) {
                return c0Var;
            }
            c0 c0Var2 = c0.HTTP_1_1;
            if (kotlin.jvm.internal.s.c(protocol, c0Var2.f39528a)) {
                return c0Var2;
            }
            c0 c0Var3 = c0.H2_PRIOR_KNOWLEDGE;
            if (kotlin.jvm.internal.s.c(protocol, c0Var3.f39528a)) {
                return c0Var3;
            }
            c0 c0Var4 = c0.HTTP_2;
            if (kotlin.jvm.internal.s.c(protocol, c0Var4.f39528a)) {
                return c0Var4;
            }
            c0 c0Var5 = c0.SPDY_3;
            if (kotlin.jvm.internal.s.c(protocol, c0Var5.f39528a)) {
                return c0Var5;
            }
            c0 c0Var6 = c0.QUIC;
            if (kotlin.jvm.internal.s.c(protocol, c0Var6.f39528a)) {
                return c0Var6;
            }
            c0 c0Var7 = c0.HTTP_3;
            if (bm.r.N(protocol, c0Var7.f39528a, false, 2, null)) {
                return c0Var7;
            }
            throw new IOException("Unexpected protocol: " + protocol);
        }

        private a() {
        }
    }

    c0(String str) {
        this.f39528a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f39528a;
    }
}

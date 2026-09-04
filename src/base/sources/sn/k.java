package sn;

import gn.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class k extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f52465j = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Class f52466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Class f52467i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ j b(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.a(str);
        }

        public final j a(String packageName) {
            s.h(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(packageName + ".OpenSSLSocketImpl");
                s.f(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class<?> cls2 = Class.forName(packageName + ".OpenSSLSocketFactoryImpl");
                s.f(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class<?> cls3 = Class.forName(packageName + ".SSLParametersImpl");
                s.e(cls3);
                return new k(cls, cls2, cls3);
            } catch (Exception e10) {
                c cVar = c.f52445a;
                String name = b0.class.getName();
                s.g(name, "getName(...)");
                cVar.a(name, 5, "unable to load android socket classes", e10);
                return null;
            }
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Class sslSocketClass, Class sslSocketFactoryClass, Class paramClass) {
        super(sslSocketClass);
        s.h(sslSocketClass, "sslSocketClass");
        s.h(sslSocketFactoryClass, "sslSocketFactoryClass");
        s.h(paramClass, "paramClass");
        this.f52466h = sslSocketFactoryClass;
        this.f52467i = paramClass;
    }
}

package sn;

import bm.r;
import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class f implements j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f52449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final i.a f52450g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f52451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f52452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f52453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f52454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Method f52455e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: sn.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class C0804a implements i.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f52456a;

            C0804a(String str) {
                this.f52456a = str;
            }

            @Override // sn.i.a
            public boolean b(SSLSocket sslSocket) {
                s.h(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                s.g(name, "getName(...)");
                return r.N(name, this.f52456a + '.', false, 2, null);
            }

            @Override // sn.i.a
            public j c(SSLSocket sslSocket) {
                s.h(sslSocket, "sslSocket");
                return f.f52449f.b(sslSocket.getClass());
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final f b(Class cls) {
            Class superclass = cls;
            while (superclass != null && !s.c(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            s.e(superclass);
            return new f(superclass);
        }

        public final i.a c(String packageName) {
            s.h(packageName, "packageName");
            return new C0804a(packageName);
        }

        public final i.a d() {
            return f.f52450g;
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        f52449f = aVar;
        f52450g = aVar.c("com.google.android.gms.org.conscrypt");
    }

    @Override // sn.j
    public boolean a() {
        return okhttp3.internal.platform.b.f48985f.c();
    }

    @Override // sn.j
    public boolean b(SSLSocket sslSocket) {
        s.h(sslSocket, "sslSocket");
        return this.f52451a.isInstance(sslSocket);
    }

    @Override // sn.j
    public String c(SSLSocket sslSocket) {
        s.h(sslSocket, "sslSocket");
        if (!b(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f52454d.invoke(sslSocket, null);
            if (bArr != null) {
                return new String(bArr, bm.d.f9079b);
            }
            return null;
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && s.c(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // sn.j
    public void d(SSLSocket sslSocket, String str, List protocols) {
        s.h(sslSocket, "sslSocket");
        s.h(protocols, "protocols");
        if (b(sslSocket)) {
            try {
                this.f52452b.invoke(sslSocket, Boolean.TRUE);
                this.f52455e.invoke(sslSocket, okhttp3.internal.platform.c.f48992a.c(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    public f(Class sslSocketClass) throws NoSuchMethodException {
        s.h(sslSocketClass, "sslSocketClass");
        this.f52451a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        s.g(declaredMethod, "getDeclaredMethod(...)");
        this.f52452b = declaredMethod;
        this.f52453c = sslSocketClass.getMethod("setHostname", String.class);
        this.f52454d = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.f52455e = sslSocketClass.getMethod(mTFeqtajA.VcAwo, byte[].class);
    }
}

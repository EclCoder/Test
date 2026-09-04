package gk;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Logger f39291d = Logger.getLogger(b.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final gk.c f39292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f39293f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC0589b f39294a = new e(this, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final gk.c f39295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f39296c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends b implements Closeable {
    }

    /* JADX INFO: renamed from: gk.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0589b {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f39297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f39298b;

        c(String str) {
            this(str, null);
        }

        public Object a(b bVar) {
            Object objQ = bVar.q(this);
            return objQ == null ? this.f39298b : objQ;
        }

        public String toString() {
            return this.f39297a;
        }

        c(String str, Object obj) {
            this.f39297a = (String) b.i(str, "name");
            this.f39298b = obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final f f39299a;

        static {
            AtomicReference atomicReference = new AtomicReference();
            f39299a = a(atomicReference);
            Throwable th2 = (Throwable) atomicReference.get();
            if (th2 != null) {
                b.f39291d.log(Level.FINE, "Storage override doesn't exist. Using default", th2);
            }
        }

        private static f a(AtomicReference atomicReference) {
            try {
                return (f) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(f.class).getConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e10) {
                atomicReference.set(e10);
                return new gk.d();
            } catch (Exception e11) {
                throw new RuntimeException("Storage override failed to initialize", e11);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class e implements InterfaceC0589b {
        private e() {
        }

        /* synthetic */ e(b bVar, gk.a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class f {
        public abstract b a();

        public abstract void b(b bVar, b bVar2);

        public abstract b c(b bVar);
    }

    static {
        gk.c cVar = new gk.c();
        f39292e = cVar;
        f39293f = new b(null, cVar);
    }

    private b(b bVar, gk.c cVar) {
        h(bVar);
        this.f39295b = cVar;
        int i10 = bVar == null ? 0 : bVar.f39296c + 1;
        this.f39296c = i10;
        s(i10);
    }

    static a h(b bVar) {
        return null;
    }

    static Object i(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static b k() {
        b bVarA = r().a();
        return bVarA == null ? f39293f : bVarA;
    }

    public static c m(String str) {
        return new c(str);
    }

    static f r() {
        return d.f39299a;
    }

    private static void s(int i10) {
        if (i10 == 1000) {
            f39291d.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    public b d() {
        b bVarC = r().c(this);
        return bVarC == null ? f39293f : bVarC;
    }

    public void l(b bVar) {
        i(bVar, "toAttach");
        r().b(this, bVar);
    }

    Object q(c cVar) {
        return this.f39295b.a(cVar);
    }

    public b t(c cVar, Object obj) {
        return new b(this, this.f39295b.b(cVar, obj));
    }
}

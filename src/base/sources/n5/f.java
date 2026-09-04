package n5;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f46855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f46856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f[] f46857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e[] f46858e;

    public f(Throwable th2) {
        this(th2, Collections.newSetFromMap(new IdentityHashMap()));
    }

    public f a() {
        return this.f46855b;
    }

    public String b() {
        return this.f46856c;
    }

    public String c() {
        return this.f46854a;
    }

    public e[] d() {
        return this.f46858e;
    }

    public f[] e() {
        return this.f46857d;
    }

    public f(Throwable th2, Set set) {
        set.add(th2);
        this.f46854a = th2.getMessage();
        if (th2.getCause() == null || set.contains(th2.getCause())) {
            this.f46855b = null;
        } else {
            this.f46855b = new f(th2.getCause(), set);
        }
        this.f46856c = th2.getClass().getName();
        Throwable[] suppressed = th2.getSuppressed();
        LinkedList linkedList = new LinkedList();
        int length = suppressed.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!set.contains(suppressed[i10])) {
                linkedList.add(new f(suppressed[i10], set));
            }
        }
        this.f46857d = (f[]) linkedList.toArray(new f[0]);
        StackTraceElement[] stackTrace = th2.getStackTrace();
        this.f46858e = new e[stackTrace.length];
        int length2 = stackTrace.length;
        for (int i11 = 0; i11 < length2; i11++) {
            this.f46858e[i11] = new e(stackTrace[i11]);
        }
    }
}

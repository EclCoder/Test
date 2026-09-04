package c4;

import gl.r;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;
import y3.j;
import y3.p1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pm.d f9543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f9545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f9546d;

    /* JADX INFO: renamed from: c4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private enum EnumC0126a {
        PATH,
        QUERY;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ ml.a f9550d = ml.b.a(d());
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9551a;

        static {
            int[] iArr = new int[EnumC0126a.values().length];
            try {
                iArr[EnumC0126a.PATH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0126a.QUERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9551a = iArr;
        }
    }

    public a(pm.d serializer) {
        s.h(serializer, "serializer");
        this.f9545c = "";
        this.f9546d = "";
        this.f9543a = serializer;
        this.f9544b = serializer.getDescriptor().i();
    }

    private final void a(String str) {
        this.f9545c += '/' + str;
    }

    private final void b(String str, String str2) {
        this.f9546d += (this.f9546d.length() == 0 ? "?" : "&") + str + '=' + str2;
    }

    private final EnumC0126a e(int i10, p1 p1Var) {
        return ((p1Var instanceof j) || this.f9543a.getDescriptor().j(i10)) ? EnumC0126a.QUERY : EnumC0126a.PATH;
    }

    public final void c(int i10, String name, p1 type, List value) {
        s.h(name, "name");
        s.h(type, "type");
        s.h(value, "value");
        int i11 = b.f9551a[e(i10, type).ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator it = value.iterator();
            while (it.hasNext()) {
                b(name, (String) it.next());
            }
            return;
        }
        if (value.size() == 1) {
            a((String) r.b0(value));
            return;
        }
        throw new IllegalArgumentException(("Expected one value for argument " + name + ", found " + value.size() + "values instead.").toString());
    }

    public final String d() {
        return this.f9544b + this.f9545c + this.f9546d;
    }
}

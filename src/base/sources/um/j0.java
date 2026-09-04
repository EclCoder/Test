package um;

import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f54774a = new Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f54775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f54776c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f54777a = new a();

        private a() {
        }
    }

    public j0() {
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        this.f54775b = iArr;
        this.f54776c = -1;
    }

    private final void e() {
        int i10 = this.f54776c * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.f54774a, i10);
        kotlin.jvm.internal.s.g(objArrCopyOf, "copyOf(...)");
        this.f54774a = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf(this.f54775b, i10);
        kotlin.jvm.internal.s.g(iArrCopyOf, "copyOf(...)");
        this.f54775b = iArrCopyOf;
    }

    public final void b() {
        int i10 = this.f54776c;
        int[] iArr = this.f54775b;
        if (iArr[i10] == -2) {
            iArr[i10] = -1;
            this.f54776c = i10 - 1;
        }
        int i11 = this.f54776c;
        if (i11 != -1) {
            this.f54776c = i11 - 1;
        }
    }

    public final void c(rm.f sd2) {
        kotlin.jvm.internal.s.h(sd2, "sd");
        int i10 = this.f54776c + 1;
        this.f54776c = i10;
        if (i10 == this.f54774a.length) {
            e();
        }
        this.f54774a[i10] = sd2;
    }

    public final void d() {
        int[] iArr = this.f54775b;
        int i10 = this.f54776c;
        if (iArr[i10] == -2) {
            this.f54774a[i10] = a.f54777a;
        }
    }

    public final void f(Object obj) {
        int[] iArr = this.f54775b;
        int i10 = this.f54776c;
        if (iArr[i10] != -2) {
            int i11 = i10 + 1;
            this.f54776c = i11;
            if (i11 == this.f54774a.length) {
                e();
            }
        }
        Object[] objArr = this.f54774a;
        int i12 = this.f54776c;
        objArr[i12] = obj;
        this.f54775b[i12] = -2;
    }

    public final void g(int i10) {
        this.f54775b[this.f54776c] = i10;
    }

    public String toString() {
        return a();
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("$");
        int i10 = this.f54776c + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = this.f54774a[i11];
            if (obj instanceof rm.f) {
                rm.f fVar = (rm.f) obj;
                if (!kotlin.jvm.internal.s.c(fVar.d(), rm.n.b.f51422a)) {
                    int i12 = this.f54775b[i11];
                    if (i12 >= 0) {
                        sb2.append(".");
                        sb2.append(fVar.f(i12));
                    }
                } else if (this.f54775b[i11] != -1) {
                    sb2.append("[");
                    sb2.append(this.f54775b[i11]);
                    sb2.append("]");
                }
            } else if (obj != a.f54777a) {
                sb2.append("[");
                sb2.append("'");
                sb2.append(obj);
                sb2.append("'");
                sb2.append("]");
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.s.g(string, PvZsvNiPV.LUOtEiXCWpFpVe);
        return string;
    }
}

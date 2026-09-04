package yn;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xn.h0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f58131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f58132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f58133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f58134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f58135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f58136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f58137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f58138h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f58139i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f58140j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Long f58141k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Long f58142l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Long f58143m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Integer f58144n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Integer f58145o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Integer f58146p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f58147q;

    public o(h0 canonicalPath, boolean z10, String comment, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3) {
        kotlin.jvm.internal.s.h(canonicalPath, "canonicalPath");
        kotlin.jvm.internal.s.h(comment, "comment");
        this.f58131a = canonicalPath;
        this.f58132b = z10;
        this.f58133c = comment;
        this.f58134d = j10;
        this.f58135e = j11;
        this.f58136f = j12;
        this.f58137g = i10;
        this.f58138h = j13;
        this.f58139i = i11;
        this.f58140j = i12;
        this.f58141k = l10;
        this.f58142l = l11;
        this.f58143m = l12;
        this.f58144n = num;
        this.f58145o = num2;
        this.f58146p = num3;
        this.f58147q = new ArrayList();
    }

    public final o a(Integer num, Integer num2, Integer num3) {
        return new o(this.f58131a, this.f58132b, this.f58133c, this.f58134d, this.f58135e, this.f58136f, this.f58137g, this.f58138h, this.f58139i, this.f58140j, this.f58141k, this.f58142l, this.f58143m, num, num2, num3);
    }

    public final h0 b() {
        return this.f58131a;
    }

    public final List c() {
        return this.f58147q;
    }

    public final long d() {
        return this.f58135e;
    }

    public final int e() {
        return this.f58137g;
    }

    public final Long f() {
        Long l10 = this.f58143m;
        if (l10 != null) {
            return Long.valueOf(s.f(l10.longValue()));
        }
        Integer num = this.f58146p;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    public final Long g() {
        Long l10 = this.f58142l;
        if (l10 != null) {
            return Long.valueOf(s.f(l10.longValue()));
        }
        Integer num = this.f58145o;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    public final Long h() {
        Long l10 = this.f58141k;
        if (l10 != null) {
            return Long.valueOf(s.f(l10.longValue()));
        }
        Integer num = this.f58144n;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        int i10 = this.f58140j;
        if (i10 != -1) {
            return s.e(this.f58139i, i10);
        }
        return null;
    }

    public final long i() {
        return this.f58138h;
    }

    public final long j() {
        return this.f58136f;
    }

    public final boolean k() {
        return this.f58132b;
    }

    public /* synthetic */ o(h0 h0Var, boolean z10, String str, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(h0Var, (i13 & 2) != 0 ? false : z10, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? -1L : j10, (i13 & 16) != 0 ? -1L : j11, (i13 & 32) != 0 ? -1L : j12, (i13 & 64) != 0 ? -1 : i10, (i13 & 128) == 0 ? j13 : -1L, (i13 & 256) != 0 ? -1 : i11, (i13 & 512) == 0 ? i12 : -1, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : l10, (i13 & 2048) != 0 ? null : l11, (i13 & 4096) != 0 ? null : l12, (i13 & 8192) != 0 ? null : num, (i13 & 16384) != 0 ? null : num2, (i13 & 32768) != 0 ? null : num3);
    }
}

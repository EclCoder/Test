package dd;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f36670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f36672c;

    private q(Class cls, int i10, int i11) {
        this(a0.b(cls), i10, i11);
    }

    public static q a(Class cls) {
        return new q(cls, 0, 2);
    }

    private static String b(int i10) {
        if (i10 == 0) {
            return DevicePublicKeyStringDef.DIRECT;
        }
        if (i10 == 1) {
            return "provider";
        }
        if (i10 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i10);
    }

    public static q h(Class cls) {
        return new q(cls, 0, 1);
    }

    public static q i(a0 a0Var) {
        return new q(a0Var, 1, 0);
    }

    public static q j(Class cls) {
        return new q(cls, 1, 0);
    }

    public static q k(a0 a0Var) {
        return new q(a0Var, 1, 1);
    }

    public static q l(Class cls) {
        return new q(cls, 1, 1);
    }

    public static q m(Class cls) {
        return new q(cls, 2, 0);
    }

    public a0 c() {
        return this.f36670a;
    }

    public boolean d() {
        return this.f36672c == 2;
    }

    public boolean e() {
        return this.f36672c == 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f36670a.equals(qVar.f36670a) && this.f36671b == qVar.f36671b && this.f36672c == qVar.f36672c) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.f36671b == 1;
    }

    public boolean g() {
        return this.f36671b == 2;
    }

    public int hashCode() {
        return ((((this.f36670a.hashCode() ^ 1000003) * 1000003) ^ this.f36671b) * 1000003) ^ this.f36672c;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f36670a);
        sb2.append(", type=");
        int i10 = this.f36671b;
        if (i10 == 1) {
            str = "required";
        } else {
            str = i10 == 0 ? "optional" : "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        sb2.append(b(this.f36672c));
        sb2.append("}");
        return sb2.toString();
    }

    private q(a0 a0Var, int i10, int i11) {
        this.f36670a = (a0) z.c(a0Var, "Null dependency anInterface.");
        this.f36671b = i10;
        this.f36672c = i11;
    }
}

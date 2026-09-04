package x4;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e[] f56635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f56636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f56637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f56638d;

    public d(String str, e[] eVarArr) {
        this.f56636b = str;
        this.f56637c = null;
        this.f56635a = eVarArr;
        this.f56638d = 0;
    }

    private void a(int i10) {
        if (i10 == this.f56638d) {
            return;
        }
        throw new IllegalStateException("Wrong data accessor type detected. " + c(this.f56638d) + " expected, but got " + c(i10));
    }

    private String c(int i10) {
        if (i10 != 0) {
            return i10 != 1 ? "Unknown" : "ArrayBuffer";
        }
        return "String";
    }

    public String b() {
        a(0);
        return this.f56636b;
    }

    public d(byte[] bArr, e[] eVarArr) {
        Objects.requireNonNull(bArr);
        this.f56637c = bArr;
        this.f56636b = null;
        this.f56635a = eVarArr;
        this.f56638d = 1;
    }
}

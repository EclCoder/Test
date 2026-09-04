package ki;

import gl.j;
import java.util.Arrays;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f43396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f43397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f43398c;

    public b(byte[] header, byte[] bArr, byte[] data) {
        s.h(header, "header");
        s.h(data, "data");
        this.f43396a = header;
        this.f43397b = bArr;
        this.f43398c = data;
    }

    public final byte[] a() {
        return this.f43398c;
    }

    public final byte[] b() {
        byte[] bArr = this.f43396a;
        byte[] bArr2 = this.f43397b;
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return j.y(j.y(bArr, bArr2), this.f43398c);
    }

    public final byte[] c() {
        return this.f43396a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.c(this.f43396a, bVar.f43396a) && s.c(this.f43397b, bVar.f43397b) && s.c(this.f43398c, bVar.f43398c);
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.f43396a) * 31;
        byte[] bArr = this.f43397b;
        return ((iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31) + Arrays.hashCode(this.f43398c);
    }

    public String toString() {
        return "Obu(header=" + Arrays.toString(this.f43396a) + ", leb128=" + Arrays.toString(this.f43397b) + ", data=" + Arrays.toString(this.f43398c) + ")";
    }
}

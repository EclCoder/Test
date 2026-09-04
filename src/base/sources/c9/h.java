package c9;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a9.b f9665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f9666b;

    public h(a9.b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f9665a = bVar;
        this.f9666b = bArr;
    }

    public byte[] a() {
        return this.f9666b;
    }

    public a9.b b() {
        return this.f9665a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f9665a.equals(hVar.f9665a)) {
            return Arrays.equals(this.f9666b, hVar.f9666b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f9665a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f9666b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f9665a + ", bytes=[...]}";
    }
}

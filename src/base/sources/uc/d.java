package uc;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.Serializable;
import sc.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f54402a = "0123456789abcdef".toCharArray();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a extends d implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final byte[] f54403b;

        a(byte[] bArr) {
            this.f54403b = (byte[]) p.o(bArr);
        }

        @Override // uc.d
        public byte[] d() {
            return (byte[]) this.f54403b.clone();
        }

        @Override // uc.d
        public int g() {
            byte[] bArr = this.f54403b;
            p.x(bArr.length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", bArr.length);
            byte[] bArr2 = this.f54403b;
            return ((bArr2[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr2[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr2[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr2[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }

        @Override // uc.d
        public int h() {
            return this.f54403b.length * 8;
        }

        @Override // uc.d
        boolean i(d dVar) {
            if (this.f54403b.length != dVar.k().length) {
                return false;
            }
            boolean z10 = true;
            int i10 = 0;
            while (true) {
                byte[] bArr = this.f54403b;
                if (i10 >= bArr.length) {
                    return z10;
                }
                z10 &= bArr[i10] == dVar.k()[i10];
                i10++;
            }
        }

        @Override // uc.d
        byte[] k() {
            return this.f54403b;
        }
    }

    d() {
    }

    static d j(byte[] bArr) {
        return new a(bArr);
    }

    public abstract byte[] d();

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (h() == dVar.h() && i(dVar)) {
                return true;
            }
        }
        return false;
    }

    public abstract int g();

    public abstract int h();

    public final int hashCode() {
        if (h() >= 32) {
            return g();
        }
        byte[] bArrK = k();
        int i10 = bArrK[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        for (int i11 = 1; i11 < bArrK.length; i11++) {
            i10 |= (bArrK[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << (i11 * 8);
        }
        return i10;
    }

    abstract boolean i(d dVar);

    abstract byte[] k();

    public final String toString() {
        byte[] bArrK = k();
        StringBuilder sb2 = new StringBuilder(bArrK.length * 2);
        for (byte b10 : bArrK) {
            char[] cArr = f54402a;
            sb2.append(cArr[(b10 >> 4) & 15]);
            sb2.append(cArr[b10 & 15]);
        }
        return sb2.toString();
    }
}

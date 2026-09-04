package com.facebook.ads.redexgen.core;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1985dF extends InputStream {
    public static byte[] A04;
    public MessageDigest A00;
    public final C2194ge A01;
    public final InterfaceC1984dE A02;
    public final FileInputStream A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 43);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-52, -61, -76, -23, -8, -15};
    }

    public C1985dF(C2194ge c2194ge, FileInputStream fileInputStream, InterfaceC1984dE interfaceC1984dE) {
        this.A03 = fileInputStream;
        this.A02 = interfaceC1984dE;
        this.A01 = c2194ge;
        try {
            this.A00 = MessageDigest.getInstance(A00(0, 3, 84));
        } catch (NoSuchAlgorithmException unused) {
            this.A00 = null;
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.A03.available();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] b10 = new byte[1];
        return read(b10);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.A03.read(bArr, i10, i11);
        if (this.A00 != null) {
            try {
                if (i12 > 0) {
                    this.A00.update(bArr, i10, i12);
                } else if (i12 == -1) {
                    this.A02.A9s(C1706Xa.A05(this.A00.digest()));
                    this.A00 = null;
                }
            } catch (Exception e10) {
                this.A00 = null;
                this.A01.A08().ABz(A00(3, 3, 90), AbstractC1610Td.A13, new C1611Te(e10));
            }
        }
        return i12;
    }

    @Override // java.io.InputStream
    public final long skip(long j10) throws IOException {
        int actuallyRead = (int) j10;
        byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
        long j11 = 0;
        while (actuallyRead > 0) {
            int bytesToRead = read(bArr, 0, Math.min(actuallyRead, UserVerificationMethods.USER_VERIFY_ALL));
            if (bytesToRead <= 0) {
                break;
            }
            actuallyRead -= bytesToRead;
            j11 += (long) bytesToRead;
        }
        return j11;
    }
}

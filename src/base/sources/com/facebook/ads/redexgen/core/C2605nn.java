package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2605nn implements FL, InterfaceC1189Cp {
    public static String[] A0E = {"SSDELygzudefytBtRYlDWoyFfpg", "4SEnazR2Nu4dPKZqq", "4H9jqKlT7lQdtxWBQl9xa6akogWkCWsp", "Wknx73gM1GoPE2GN1snRYal1oMjUwY3P", "7txELYcTJwThSLRxJ5dUM1K4qPQ", "gA7GGJKubAjwOro28", "9KdodW4K4GXGszeM7wnefptXiT4TjY3", ""};
    public long A00;
    public C10185i A01;
    public InterfaceC1305Hd A02;
    public boolean A04;
    public final Uri A06;
    public final AnonymousClass48 A07;
    public final AG A08;
    public final DD A09;
    public final HA A0A;
    public volatile boolean A0C;
    public final /* synthetic */ C11219p A0D;
    public final HV A0B = new HV();
    public boolean A03 = true;
    public final long A05 = Cq.A00();

    public C2605nn(C11219p c11219p, Uri uri, InterfaceC2694pF interfaceC2694pF, DD dd2, HA ha2, AnonymousClass48 anonymousClass48) {
        this.A0D = c11219p;
        this.A06 = uri;
        this.A08 = new AG(interfaceC2694pF);
        this.A09 = dd2;
        this.A0A = ha2;
        this.A07 = anonymousClass48;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(long j10, long j11) {
        this.A0B.A00 = j10;
        this.A00 = j11;
        this.A03 = true;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.core.FL
    public final void A4r() {
        this.A0C = true;
    }

    @Override // com.facebook.ads.redexgen.core.FL
    public final void AAr() throws IOException {
        int iAHM = 0;
        while (iAHM == 0 && !this.A0C) {
            try {
                long j10 = this.A0B.A00;
                this.A01 = new C10185i(this.A06, j10, -1L, this.A0D.A0b);
                long jAGi = this.A08.AGi(this.A01);
                if (jAGi != -1) {
                    jAGi += j10;
                    this.A0D.A0G();
                }
                this.A0D.A09 = null;
                InterfaceC2694pF interfaceC2694pF = this.A08;
                if (this.A0D.A09 != null && this.A0D.A09.A01 != -1) {
                    final AG ag2 = this.A08;
                    final int i10 = this.A0D.A09.A01;
                    interfaceC2694pF = new InterfaceC2694pF(ag2, i10, this) { // from class: com.facebook.ads.redexgen.X.9r
                        public int A00;
                        public final int A01;
                        public final InterfaceC2694pF A02;
                        public final InterfaceC1189Cp A03;
                        public final byte[] A04;

                        {
                            AbstractC09823y.A07(i10 > 0);
                            this.A02 = ag2;
                            this.A01 = i10;
                            this.A03 = this;
                            this.A04 = new byte[1];
                            this.A00 = i10;
                        }

                        private boolean A00() throws IOException {
                            int bytesRead = this.A02.read(this.A04, 0, 1);
                            if (bytesRead == -1) {
                                return false;
                            }
                            int bytesRead2 = this.A04[0];
                            int metadataLength = (bytesRead2 & 255) << 4;
                            if (metadataLength == 0) {
                                return true;
                            }
                            int i11 = 0;
                            int i12 = metadataLength;
                            byte[] bArr = new byte[metadataLength];
                            while (i12 > 0) {
                                int bytesRead3 = this.A02.read(bArr, i11, i12);
                                if (bytesRead3 == -1) {
                                    return false;
                                }
                                i11 += bytesRead3;
                                i12 -= bytesRead3;
                            }
                            while (metadataLength > 0) {
                                int bytesRead4 = metadataLength - 1;
                                if (bArr[bytesRead4] != 0) {
                                    break;
                                }
                                metadataLength--;
                            }
                            if (metadataLength > 0) {
                                this.A03.AE5(new C10054v(bArr, metadataLength));
                            }
                            return true;
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC2694pF
                        public final void A43(InterfaceC10295t interfaceC10295t) {
                            AbstractC09823y.A01(interfaceC10295t);
                            this.A02.A43(interfaceC10295t);
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC2694pF
                        public final Map<String, List<String>> A8t() {
                            return this.A02.A8t();
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC2694pF
                        public final Uri A9P() {
                            return this.A02.A9P();
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC2694pF
                        public final long AGi(C10185i c10185i) {
                            throw new UnsupportedOperationException();
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC2694pF
                        public final void close() {
                            throw new UnsupportedOperationException();
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC09382c
                        public final int read(byte[] bArr, int i11, int i12) throws IOException {
                            if (this.A00 == 0) {
                                if (!A00()) {
                                    return -1;
                                }
                                this.A00 = this.A01;
                            }
                            int i13 = this.A02.read(bArr, i11, Math.min(this.A00, i12));
                            if (i13 != -1) {
                                int bytesRead = this.A00;
                                this.A00 = bytesRead - i13;
                            }
                            return i13;
                        }
                    };
                    this.A02 = this.A0D.A0Z();
                    this.A02.A6e(C11219p.A0g);
                }
                this.A09.AAB(interfaceC2694pF, this.A06, this.A08.A8t(), j10, jAGi, this.A0A);
                if (this.A0D.A09 != null) {
                    this.A09.A5y();
                }
                if (this.A03) {
                    this.A09.AJ6(j10, this.A00);
                    this.A03 = false;
                }
                while (iAHM == 0 && !this.A0C) {
                    try {
                        this.A07.A00();
                        iAHM = this.A09.AHM(this.A0B);
                        long position = this.A09.A7a();
                        if (position > this.A0D.A0M + j10) {
                            j10 = position;
                            this.A07.A02();
                            this.A0D.A0O.post(this.A0D.A0a);
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (iAHM == 1) {
                    iAHM = 0;
                } else {
                    long jA7a = this.A09.A7a();
                    String[] strArr = A0E;
                    if (strArr[2].charAt(24) != strArr[3].charAt(24)) {
                        throw new RuntimeException();
                    }
                    A0E[6] = "OKjnlHtv3KbBLefZQYMpPe9SdH47QI1";
                    if (jA7a != -1) {
                        this.A0B.A00 = this.A09.A7a();
                    }
                }
                AbstractC10135d.A00(this.A08);
            } catch (Throwable th2) {
                if (iAHM != 1 && this.A09.A7a() != -1) {
                    this.A0B.A00 = this.A09.A7a();
                }
                AbstractC10135d.A00(this.A08);
                throw th2;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1189Cp
    public final void AE5(C10054v c10054v) {
        long jMax;
        if (this.A04) {
            jMax = Math.max(this.A0D.A03(true), this.A00);
        } else {
            jMax = this.A00;
        }
        int iA07 = c10054v.A07();
        InterfaceC1305Hd interfaceC1305Hd = (InterfaceC1305Hd) AbstractC09823y.A01(this.A02);
        interfaceC1305Hd.AIr(c10054v, iA07);
        interfaceC1305Hd.AIu(jMax, 1, iA07, 0, null);
        this.A04 = true;
    }
}

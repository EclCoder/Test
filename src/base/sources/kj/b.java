package kj;

import fl.q;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f43421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ki.a f43422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f43423c;

    public b(byte[] sequenceObu) {
        s.h(sequenceObu, "sequenceObu");
        this.f43421a = sequenceObu;
        this.f43422b = new ki.a();
        this.f43423c = sequenceObu.length + 4;
    }

    private final q b(byte[] bArr, int i10) {
        int i11 = i10 / 8;
        int i12 = 7 - (i10 % 8);
        int i13 = 0;
        while ((bArr[i11] & (1 << i12)) == 0) {
            i13++;
            if (i12 == 0) {
                i11++;
                i12 = 7;
            } else {
                i12--;
            }
        }
        int i14 = i13 + 1;
        int i15 = 0;
        for (int i16 = 0; i16 < i14; i16++) {
            if (i12 == 0) {
                i11++;
                i12 = 7;
            } else {
                i12--;
            }
            i15 = (i15 << 1) | ((bArr[i11] >>> i12) & 1);
        }
        return new q(Integer.valueOf(i15), Integer.valueOf(i10 + i13 + 1));
    }

    public final int a() {
        return this.f43423c;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b2  */
    public final void c(byte[] buffer, int i10) {
        int iA;
        int i11;
        int i12;
        int iA2;
        int i13;
        char c10;
        int i14;
        int iA3;
        int i15;
        int i16;
        int iA4;
        int i17;
        char c11;
        int iA5;
        int iA6;
        int i18;
        int iA7;
        int i19;
        int iA8;
        int iA9;
        int i20;
        int iA10;
        int iA11;
        s.h(buffer, "buffer");
        byte[] bArrA = ((ki.b) this.f43422b.b(this.f43421a).get(0)).a();
        ji.b bVar = new ji.b(bArrA);
        int iA12 = bVar.a(0, 3);
        int i21 = 1;
        int iA13 = bVar.a(4, 1);
        int i22 = 5;
        if (iA13 == 1) {
            iA3 = bVar.a(5, 5);
            i15 = 0;
            i16 = 0;
            i13 = 10;
            c10 = '\n';
            i14 = 2;
            iA2 = 0;
        } else {
            if (bVar.a(5, 1) == 1) {
                int iIntValue = bVar.a(70, 1) == 1 ? 71 + ((Number) b(bArrA, 71).i()).intValue() : 71;
                iA = bVar.a(iIntValue, 1);
                i12 = iIntValue + 1;
                if (iA == 1) {
                    int iA14 = bVar.a(i12, 5);
                    i12 = iIntValue + 48;
                    i11 = iA14;
                } else {
                    i11 = 0;
                }
            } else {
                iA = 0;
                i11 = 0;
                i12 = 6;
            }
            iA2 = bVar.a(i12, 1);
            int iA15 = bVar.a(i12 + 1, 5);
            i13 = i12 + 6;
            if (iA15 >= 0) {
                int i23 = 0;
                c10 = '\n';
                int i24 = 0;
                i15 = 0;
                i16 = 0;
                while (true) {
                    i14 = 2;
                    int iA16 = bVar.a(i13 + 12, i22);
                    int i25 = i22;
                    int i26 = i13 + 17;
                    if (i23 == 0) {
                        i24 = iA16;
                    }
                    if (iA16 > 7) {
                        int iA17 = bVar.a(i26, 1);
                        i26 = i13 + 18;
                        if (i23 == 0) {
                            i15 = iA17;
                        }
                    }
                    if (iA == 1) {
                        int iA18 = bVar.a(i26, 1);
                        i26++;
                        if (iA18 == 1) {
                            i26 += ((i11 + 1) * 2) + 1;
                        }
                    }
                    if (iA2 == 1) {
                        i13 = i26 + 1;
                        if (bVar.a(i26, 1) == 1) {
                            int iA19 = bVar.a(i13, 4);
                            i26 += 5;
                            if (i23 == 0) {
                                i16 = iA19;
                            }
                            i13 = i26;
                        }
                    } else {
                        i13 = i26;
                    }
                    if (i23 == iA15) {
                        break;
                    }
                    i23++;
                    i22 = i25;
                }
                iA3 = i24;
            } else {
                c10 = '\n';
                i14 = 2;
                iA3 = 0;
                i15 = 0;
                i16 = 0;
            }
        }
        int iA20 = i13 + 8 + bVar.a(i13, 4) + 1 + bVar.a(i13 + 4, 4) + 1;
        if (iA13 != 1) {
            iA4 = bVar.a(iA20, 1);
            iA20++;
        } else {
            iA4 = 0;
        }
        if (iA4 == 1) {
            iA20 += 7;
        }
        int i27 = iA20 + 3;
        if (iA13 != 1) {
            int iA21 = bVar.a(iA20 + 7, 1);
            int i28 = iA20 + 8;
            if (iA21 == 1) {
                i28 = iA20 + 10;
            }
            int i29 = i28 + 1;
            if (bVar.a(i28, 1) != 1) {
                iA11 = bVar.a(i29, 1);
                i29 = i28 + 2;
            } else {
                iA11 = i14;
            }
            if (iA11 > 0) {
                i29 = bVar.a(i29, 1) != 1 ? i29 + 2 : i29 + 1;
            }
            i27 = iA21 == 1 ? i29 + 3 : i29;
        }
        int iA22 = bVar.a(i27 + 3, 1);
        int i30 = i27 + 4;
        int i31 = i14;
        if (iA12 == i31 && iA22 == 1) {
            int iA23 = bVar.a(i30, 1);
            int i32 = i27 + 5;
            if (iA23 == 1) {
                c10 = '\f';
            }
            i30 = i32;
            i17 = iA23;
            c11 = c10;
        } else if (iA12 <= i31) {
            if (iA22 != 1) {
                c10 = '\b';
            }
            c11 = c10;
            i17 = 0;
        } else {
            i17 = 0;
            c11 = 0;
        }
        if (iA12 == 1) {
            iA5 = 0;
        } else {
            iA5 = bVar.a(i30, 1);
            i30++;
        }
        int i33 = i30 + 1;
        if (bVar.a(i30, 1) == 1) {
            iA6 = bVar.a(i33, 8);
            int iA24 = bVar.a(i30 + 9, 8);
            iA7 = bVar.a(i30 + 17, 8);
            i33 = i30 + 25;
            i18 = iA24;
        } else {
            iA6 = 0;
            i18 = 0;
            iA7 = 0;
        }
        if (iA5 == 1) {
            i20 = 1;
            iA10 = 0;
        } else if (iA6 == 1 && i18 == 1 && iA7 == 1) {
            iA10 = 0;
            i21 = 0;
            i20 = 0;
        } else {
            int i34 = i33 + 1;
            if (iA12 == 0) {
                i20 = 1;
            } else if (iA12 != 1) {
                if (c11 == '\f') {
                    iA8 = bVar.a(i34, 1);
                    i19 = i33 + 2;
                    if (iA8 == 1) {
                        int i35 = i33 + 3;
                        iA9 = bVar.a(i19, 1);
                        i19 = i35;
                    }
                    if (iA8 == 1 || iA9 != 1) {
                        i20 = iA8;
                        i21 = iA9;
                    } else {
                        iA10 = bVar.a(i19, 1);
                        i20 = iA8;
                        i21 = iA9;
                    }
                } else {
                    i19 = i34;
                    iA8 = 1;
                }
                iA9 = 0;
                if (iA8 == 1) {
                }
                i20 = iA8;
                i21 = iA9;
            } else {
                iA10 = 0;
                i21 = 0;
                i20 = 0;
            }
            iA10 = 0;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(buffer, i10, this.f43423c);
        byteBufferWrap.put((byte) -127);
        byteBufferWrap.put((byte) (iA3 | (iA12 << 5)));
        byteBufferWrap.put((byte) ((i15 << 7) | (iA22 << 6) | (i17 << 5) | (iA5 << 4) | (i20 << 3) | (i21 << 2) | iA10));
        byteBufferWrap.put((byte) ((iA2 << 4) | i16));
        byteBufferWrap.put(this.f43421a);
    }
}

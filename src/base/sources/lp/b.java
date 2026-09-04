package lp;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import vp.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f45003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f45005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f45006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private lp.a f45007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private lp.a f45008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f45009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f45010h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f45011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f45012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f45013c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f45014d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float[][] f45015e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f45016f;

        a(int i10, int i11, int i12, int i13, float[][] fArr, boolean z10) {
            this.f45011a = i10;
            this.f45012b = i11;
            this.f45013c = i12;
            this.f45014d = i13;
            this.f45015e = fArr;
            this.f45016f = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f45011a == 0) {
                if (this.f45012b == -1) {
                    int i10 = this.f45013c;
                    while (i10 < b.this.f45003a) {
                        b.this.f45007e.r(this.f45015e[i10]);
                        i10 += this.f45014d;
                    }
                    return;
                }
                int i11 = this.f45013c;
                while (i11 < b.this.f45003a) {
                    b.this.f45007e.v(this.f45015e[i11], this.f45016f);
                    i11 += this.f45014d;
                }
                return;
            }
            if (this.f45012b == 1) {
                int i12 = this.f45013c;
                while (i12 < b.this.f45003a) {
                    b.this.f45007e.b0(this.f45015e[i12]);
                    i12 += this.f45014d;
                }
                return;
            }
            int i13 = this.f45013c;
            while (i13 < b.this.f45003a) {
                b.this.f45007e.f0(this.f45015e[i13], this.f45016f);
                i13 += this.f45014d;
            }
        }
    }

    /* JADX INFO: renamed from: lp.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class RunnableC0683b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f45018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f45019b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f45020c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f45021d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float[][] f45022e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f45023f;

        RunnableC0683b(int i10, int i11, int i12, int i13, float[][] fArr, boolean z10) {
            this.f45018a = i10;
            this.f45019b = i11;
            this.f45020c = i12;
            this.f45021d = i13;
            this.f45022e = fArr;
            this.f45023f = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            float[] fArr = new float[this.f45018a];
            int i10 = 0;
            if (this.f45019b == -1) {
                if (b.this.f45004b > this.f45020c * 4) {
                    int i11 = this.f45021d * 8;
                    while (i11 < b.this.f45004b) {
                        for (int i12 = 0; i12 < b.this.f45003a; i12++) {
                            int i13 = i12 * 2;
                            int i14 = (b.this.f45003a * 2) + i13;
                            int i15 = (b.this.f45003a * 2) + i14;
                            int i16 = (b.this.f45003a * 2) + i15;
                            float[] fArr2 = this.f45022e[i12];
                            fArr[i13] = fArr2[i11];
                            fArr[i13 + 1] = fArr2[i11 + 1];
                            fArr[i14] = fArr2[i11 + 2];
                            fArr[i14 + 1] = fArr2[i11 + 3];
                            fArr[i15] = fArr2[i11 + 4];
                            fArr[i15 + 1] = fArr2[i11 + 5];
                            fArr[i16] = fArr2[i11 + 6];
                            fArr[i16 + 1] = fArr2[i11 + 7];
                        }
                        b.this.f45008f.s(fArr, 0);
                        b.this.f45008f.s(fArr, b.this.f45003a * 2);
                        b.this.f45008f.s(fArr, b.this.f45003a * 4);
                        b.this.f45008f.s(fArr, b.this.f45003a * 6);
                        for (int i17 = 0; i17 < b.this.f45003a; i17++) {
                            int i18 = i17 * 2;
                            int i19 = (b.this.f45003a * 2) + i18;
                            int i20 = (b.this.f45003a * 2) + i19;
                            int i21 = (b.this.f45003a * 2) + i20;
                            float[] fArr3 = this.f45022e[i17];
                            fArr3[i11] = fArr[i18];
                            fArr3[i11 + 1] = fArr[i18 + 1];
                            fArr3[i11 + 2] = fArr[i19];
                            fArr3[i11 + 3] = fArr[i19 + 1];
                            fArr3[i11 + 4] = fArr[i20];
                            fArr3[i11 + 5] = fArr[i20 + 1];
                            fArr3[i11 + 6] = fArr[i21];
                            fArr3[i11 + 7] = fArr[i21 + 1];
                        }
                        i11 += this.f45020c * 8;
                    }
                    return;
                }
                if (b.this.f45004b != this.f45020c * 4) {
                    if (b.this.f45004b == this.f45020c * 2) {
                        for (int i22 = 0; i22 < b.this.f45003a; i22++) {
                            int i23 = i22 * 2;
                            float[] fArr4 = this.f45022e[i22];
                            int i24 = this.f45021d;
                            fArr[i23] = fArr4[i24 * 2];
                            fArr[i23 + 1] = fArr4[(i24 * 2) + 1];
                        }
                        b.this.f45008f.s(fArr, 0);
                        while (i10 < b.this.f45003a) {
                            int i25 = i10 * 2;
                            float[] fArr5 = this.f45022e[i10];
                            int i26 = this.f45021d;
                            fArr5[i26 * 2] = fArr[i25];
                            fArr5[(i26 * 2) + 1] = fArr[i25 + 1];
                            i10++;
                        }
                        return;
                    }
                    return;
                }
                for (int i27 = 0; i27 < b.this.f45003a; i27++) {
                    int i28 = i27 * 2;
                    int i29 = (b.this.f45003a * 2) + i28;
                    float[] fArr6 = this.f45022e[i27];
                    int i30 = this.f45021d;
                    fArr[i28] = fArr6[i30 * 4];
                    fArr[i28 + 1] = fArr6[(i30 * 4) + 1];
                    fArr[i29] = fArr6[(i30 * 4) + 2];
                    fArr[i29 + 1] = fArr6[(i30 * 4) + 3];
                }
                b.this.f45008f.s(fArr, 0);
                b.this.f45008f.s(fArr, b.this.f45003a * 2);
                while (i10 < b.this.f45003a) {
                    int i31 = i10 * 2;
                    int i32 = (b.this.f45003a * 2) + i31;
                    float[] fArr7 = this.f45022e[i10];
                    int i33 = this.f45021d;
                    fArr7[i33 * 4] = fArr[i31];
                    fArr7[(i33 * 4) + 1] = fArr[i31 + 1];
                    fArr7[(i33 * 4) + 2] = fArr[i32];
                    fArr7[(i33 * 4) + 3] = fArr[i32 + 1];
                    i10++;
                }
                return;
            }
            if (b.this.f45004b > this.f45020c * 4) {
                int i34 = this.f45021d * 8;
                while (i34 < b.this.f45004b) {
                    for (int i35 = 0; i35 < b.this.f45003a; i35++) {
                        int i36 = i35 * 2;
                        int i37 = (b.this.f45003a * 2) + i36;
                        int i38 = (b.this.f45003a * 2) + i37;
                        int i39 = (b.this.f45003a * 2) + i38;
                        float[] fArr8 = this.f45022e[i35];
                        fArr[i36] = fArr8[i34];
                        fArr[i36 + 1] = fArr8[i34 + 1];
                        fArr[i37] = fArr8[i34 + 2];
                        fArr[i37 + 1] = fArr8[i34 + 3];
                        fArr[i38] = fArr8[i34 + 4];
                        fArr[i38 + 1] = fArr8[i34 + 5];
                        fArr[i39] = fArr8[i34 + 6];
                        fArr[i39 + 1] = fArr8[i34 + 7];
                    }
                    b.this.f45008f.u(fArr, 0, this.f45023f);
                    b.this.f45008f.u(fArr, b.this.f45003a * 2, this.f45023f);
                    b.this.f45008f.u(fArr, b.this.f45003a * 4, this.f45023f);
                    b.this.f45008f.u(fArr, b.this.f45003a * 6, this.f45023f);
                    for (int i40 = 0; i40 < b.this.f45003a; i40++) {
                        int i41 = i40 * 2;
                        int i42 = (b.this.f45003a * 2) + i41;
                        int i43 = (b.this.f45003a * 2) + i42;
                        int i44 = (b.this.f45003a * 2) + i43;
                        float[] fArr9 = this.f45022e[i40];
                        fArr9[i34] = fArr[i41];
                        fArr9[i34 + 1] = fArr[i41 + 1];
                        fArr9[i34 + 2] = fArr[i42];
                        fArr9[i34 + 3] = fArr[i42 + 1];
                        fArr9[i34 + 4] = fArr[i43];
                        fArr9[i34 + 5] = fArr[i43 + 1];
                        fArr9[i34 + 6] = fArr[i44];
                        fArr9[i34 + 7] = fArr[i44 + 1];
                    }
                    i34 += this.f45020c * 8;
                }
                return;
            }
            if (b.this.f45004b != this.f45020c * 4) {
                if (b.this.f45004b == this.f45020c * 2) {
                    for (int i45 = 0; i45 < b.this.f45003a; i45++) {
                        int i46 = i45 * 2;
                        float[] fArr10 = this.f45022e[i45];
                        int i47 = this.f45021d;
                        fArr[i46] = fArr10[i47 * 2];
                        fArr[i46 + 1] = fArr10[(i47 * 2) + 1];
                    }
                    b.this.f45008f.u(fArr, 0, this.f45023f);
                    while (i10 < b.this.f45003a) {
                        int i48 = i10 * 2;
                        float[] fArr11 = this.f45022e[i10];
                        int i49 = this.f45021d;
                        fArr11[i49 * 2] = fArr[i48];
                        fArr11[(i49 * 2) + 1] = fArr[i48 + 1];
                        i10++;
                    }
                    return;
                }
                return;
            }
            for (int i50 = 0; i50 < b.this.f45003a; i50++) {
                int i51 = i50 * 2;
                int i52 = (b.this.f45003a * 2) + i51;
                float[] fArr12 = this.f45022e[i50];
                int i53 = this.f45021d;
                fArr[i51] = fArr12[i53 * 4];
                fArr[i51 + 1] = fArr12[(i53 * 4) + 1];
                fArr[i52] = fArr12[(i53 * 4) + 2];
                fArr[i52 + 1] = fArr12[(i53 * 4) + 3];
            }
            b.this.f45008f.u(fArr, 0, this.f45023f);
            b.this.f45008f.u(fArr, b.this.f45003a * 2, this.f45023f);
            while (i10 < b.this.f45003a) {
                int i54 = i10 * 2;
                int i55 = (b.this.f45003a * 2) + i54;
                float[] fArr13 = this.f45022e[i10];
                int i56 = this.f45021d;
                fArr13[i56 * 4] = fArr[i54];
                fArr13[(i56 * 4) + 1] = fArr[i54 + 1];
                fArr13[(i56 * 4) + 2] = fArr[i55];
                fArr13[(i56 * 4) + 3] = fArr[i55 + 1];
                i10++;
            }
        }
    }

    public b(long j10, long j11) {
        this.f45009g = false;
        this.f45010h = false;
        if (j10 <= 1 || j11 <= 1) {
            throw new IllegalArgumentException("rows and columns must be greater than 1");
        }
        this.f45003a = (int) j10;
        this.f45004b = (int) j11;
        this.f45005c = j10;
        this.f45006d = j11;
        if (j10 * j11 >= mp.a.d0()) {
            this.f45010h = true;
        }
        if (mp.a.e0(j10) && mp.a.e0(j11)) {
            this.f45009g = true;
        }
        mp.a.s0((2 * j10) * j11 > ((long) c.g()));
        lp.a aVar = new lp.a(j10);
        this.f45008f = aVar;
        if (j10 == j11) {
            this.f45007e = aVar;
        } else {
            this.f45007e = new lp.a(j11);
        }
    }

    private void e(int i10, float[][] fArr, boolean z10) {
        int i11 = this.f45003a * 8;
        int i12 = this.f45004b;
        if (i12 == 4) {
            i11 >>= 1;
        } else if (i12 < 4) {
            i11 >>= 2;
        }
        float[] fArr2 = new float[i11];
        if (i10 == -1) {
            if (i12 > 4) {
                for (int i13 = 0; i13 < this.f45004b; i13 += 8) {
                    int i14 = 0;
                    while (true) {
                        int i15 = this.f45003a;
                        if (i14 >= i15) {
                            break;
                        }
                        int i16 = i14 * 2;
                        int i17 = (i15 * 2) + i16;
                        int i18 = (i15 * 2) + i17;
                        int i19 = (i15 * 2) + i18;
                        float[] fArr3 = fArr[i14];
                        fArr2[i16] = fArr3[i13];
                        fArr2[i16 + 1] = fArr3[i13 + 1];
                        fArr2[i17] = fArr3[i13 + 2];
                        fArr2[i17 + 1] = fArr3[i13 + 3];
                        fArr2[i18] = fArr3[i13 + 4];
                        fArr2[i18 + 1] = fArr3[i13 + 5];
                        fArr2[i19] = fArr3[i13 + 6];
                        fArr2[i19 + 1] = fArr3[i13 + 7];
                        i14++;
                    }
                    this.f45008f.s(fArr2, 0);
                    this.f45008f.s(fArr2, this.f45003a * 2);
                    this.f45008f.s(fArr2, this.f45003a * 4);
                    this.f45008f.s(fArr2, this.f45003a * 6);
                    int i20 = 0;
                    while (true) {
                        int i21 = this.f45003a;
                        if (i20 < i21) {
                            int i22 = i20 * 2;
                            int i23 = (i21 * 2) + i22;
                            int i24 = (i21 * 2) + i23;
                            int i25 = (i21 * 2) + i24;
                            float[] fArr4 = fArr[i20];
                            fArr4[i13] = fArr2[i22];
                            fArr4[i13 + 1] = fArr2[i22 + 1];
                            fArr4[i13 + 2] = fArr2[i23];
                            fArr4[i13 + 3] = fArr2[i23 + 1];
                            fArr4[i13 + 4] = fArr2[i24];
                            fArr4[i13 + 5] = fArr2[i24 + 1];
                            fArr4[i13 + 6] = fArr2[i25];
                            fArr4[i13 + 7] = fArr2[i25 + 1];
                            i20++;
                        }
                    }
                }
                return;
            }
            if (i12 != 4) {
                if (i12 == 2) {
                    for (int i26 = 0; i26 < this.f45003a; i26++) {
                        int i27 = i26 * 2;
                        float[] fArr5 = fArr[i26];
                        fArr2[i27] = fArr5[0];
                        fArr2[i27 + 1] = fArr5[1];
                    }
                    this.f45008f.s(fArr2, 0);
                    for (int i28 = 0; i28 < this.f45003a; i28++) {
                        int i29 = i28 * 2;
                        float[] fArr6 = fArr[i28];
                        fArr6[0] = fArr2[i29];
                        fArr6[1] = fArr2[i29 + 1];
                    }
                    return;
                }
                return;
            }
            int i30 = 0;
            while (true) {
                int i31 = this.f45003a;
                if (i30 >= i31) {
                    break;
                }
                int i32 = i30 * 2;
                int i33 = (i31 * 2) + i32;
                float[] fArr7 = fArr[i30];
                fArr2[i32] = fArr7[0];
                fArr2[i32 + 1] = fArr7[1];
                fArr2[i33] = fArr7[2];
                fArr2[i33 + 1] = fArr7[3];
                i30++;
            }
            this.f45008f.s(fArr2, 0);
            this.f45008f.s(fArr2, this.f45003a * 2);
            int i34 = 0;
            while (true) {
                int i35 = this.f45003a;
                if (i34 >= i35) {
                    return;
                }
                int i36 = i34 * 2;
                int i37 = (i35 * 2) + i36;
                float[] fArr8 = fArr[i34];
                fArr8[0] = fArr2[i36];
                fArr8[1] = fArr2[i36 + 1];
                fArr8[2] = fArr2[i37];
                fArr8[3] = fArr2[i37 + 1];
                i34++;
            }
        } else {
            if (i12 > 4) {
                for (int i38 = 0; i38 < this.f45004b; i38 += 8) {
                    int i39 = 0;
                    while (true) {
                        int i40 = this.f45003a;
                        if (i39 >= i40) {
                            break;
                        }
                        int i41 = i39 * 2;
                        int i42 = (i40 * 2) + i41;
                        int i43 = (i40 * 2) + i42;
                        int i44 = (i40 * 2) + i43;
                        float[] fArr9 = fArr[i39];
                        fArr2[i41] = fArr9[i38];
                        fArr2[i41 + 1] = fArr9[i38 + 1];
                        fArr2[i42] = fArr9[i38 + 2];
                        fArr2[i42 + 1] = fArr9[i38 + 3];
                        fArr2[i43] = fArr9[i38 + 4];
                        fArr2[i43 + 1] = fArr9[i38 + 5];
                        fArr2[i44] = fArr9[i38 + 6];
                        fArr2[i44 + 1] = fArr9[i38 + 7];
                        i39++;
                    }
                    this.f45008f.u(fArr2, 0, z10);
                    this.f45008f.u(fArr2, this.f45003a * 2, z10);
                    this.f45008f.u(fArr2, this.f45003a * 4, z10);
                    this.f45008f.u(fArr2, this.f45003a * 6, z10);
                    int i45 = 0;
                    while (true) {
                        int i46 = this.f45003a;
                        if (i45 < i46) {
                            int i47 = i45 * 2;
                            int i48 = (i46 * 2) + i47;
                            int i49 = (i46 * 2) + i48;
                            int i50 = (i46 * 2) + i49;
                            float[] fArr10 = fArr[i45];
                            fArr10[i38] = fArr2[i47];
                            fArr10[i38 + 1] = fArr2[i47 + 1];
                            fArr10[i38 + 2] = fArr2[i48];
                            fArr10[i38 + 3] = fArr2[i48 + 1];
                            fArr10[i38 + 4] = fArr2[i49];
                            fArr10[i38 + 5] = fArr2[i49 + 1];
                            fArr10[i38 + 6] = fArr2[i50];
                            fArr10[i38 + 7] = fArr2[i50 + 1];
                            i45++;
                        }
                    }
                }
                return;
            }
            if (i12 != 4) {
                if (i12 == 2) {
                    for (int i51 = 0; i51 < this.f45003a; i51++) {
                        int i52 = i51 * 2;
                        float[] fArr11 = fArr[i51];
                        fArr2[i52] = fArr11[0];
                        fArr2[i52 + 1] = fArr11[1];
                    }
                    this.f45008f.u(fArr2, 0, z10);
                    for (int i53 = 0; i53 < this.f45003a; i53++) {
                        int i54 = i53 * 2;
                        float[] fArr12 = fArr[i53];
                        fArr12[0] = fArr2[i54];
                        fArr12[1] = fArr2[i54 + 1];
                    }
                    return;
                }
                return;
            }
            int i55 = 0;
            while (true) {
                int i56 = this.f45003a;
                if (i55 >= i56) {
                    break;
                }
                int i57 = i55 * 2;
                int i58 = (i56 * 2) + i57;
                float[] fArr13 = fArr[i55];
                fArr2[i57] = fArr13[0];
                fArr2[i57 + 1] = fArr13[1];
                fArr2[i58] = fArr13[2];
                fArr2[i58 + 1] = fArr13[3];
                i55++;
            }
            this.f45008f.u(fArr2, 0, z10);
            this.f45008f.u(fArr2, this.f45003a * 2, z10);
            int i59 = 0;
            while (true) {
                int i60 = this.f45003a;
                if (i59 >= i60) {
                    return;
                }
                int i61 = i59 * 2;
                int i62 = (i60 * 2) + i61;
                float[] fArr14 = fArr[i59];
                fArr14[0] = fArr2[i61];
                fArr14[1] = fArr2[i61 + 1];
                fArr14[2] = fArr2[i62];
                fArr14[3] = fArr2[i62 + 1];
                i59++;
            }
        }
    }

    private void f(int i10, float[][] fArr, boolean z10) {
        int iG = bo.a.g(this.f45004b / 2, vp.a.c());
        int i11 = this.f45003a * 8;
        int i12 = this.f45004b;
        if (i12 == 4) {
            i11 >>= 1;
        } else if (i12 < 4) {
            i11 >>= 2;
        }
        int i13 = i11;
        Future[] futureArr = new Future[iG];
        int i14 = 0;
        while (i14 < iG) {
            int i15 = i10;
            futureArr[i14] = vp.a.d(new RunnableC0683b(i13, i15, iG, i14, fArr, z10));
            i14++;
            i10 = i15;
        }
        try {
            vp.a.e(futureArr);
        } catch (InterruptedException e10) {
            Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e10);
        } catch (ExecutionException e11) {
            Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e11);
        }
    }

    private void g(int i10, float[][] fArr) {
        int i11 = this.f45003a >> 1;
        if (i10 >= 0) {
            for (int i12 = 1; i12 < i11; i12++) {
                float[] fArr2 = fArr[this.f45003a - i12];
                float[] fArr3 = fArr[i12];
                float f10 = (fArr3[0] - fArr2[0]) * 0.5f;
                fArr2[0] = f10;
                fArr3[0] = fArr3[0] - f10;
                float f11 = (fArr3[1] + fArr2[1]) * 0.5f;
                fArr2[1] = f11;
                fArr3[1] = fArr3[1] - f11;
            }
            return;
        }
        for (int i13 = 1; i13 < i11; i13++) {
            int i14 = this.f45003a - i13;
            float[] fArr4 = fArr[i13];
            float f12 = fArr4[0];
            float[] fArr5 = fArr[i14];
            float f13 = fArr5[0];
            fArr4[0] = f12 + f13;
            fArr5[0] = f12 - f13;
            float f14 = fArr5[1];
            float f15 = fArr4[1];
            fArr4[1] = f15 + f14;
            fArr5[1] = f14 - f15;
        }
    }

    private void j(int i10, int i11, float[][] fArr, boolean z10) {
        int iC = vp.a.c();
        int iC2 = this.f45003a;
        if (iC <= iC2) {
            iC2 = vp.a.c();
        }
        int i12 = iC2;
        Future[] futureArr = new Future[i12];
        int i13 = 0;
        while (i13 < i12) {
            int i14 = i10;
            futureArr[i13] = vp.a.d(new a(i14, i11, i13, i12, fArr, z10));
            i13++;
            i10 = i14;
        }
        try {
            vp.a.e(futureArr);
        } catch (InterruptedException e10) {
            Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e10);
        } catch (ExecutionException e11) {
            Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e11);
        }
    }

    public void h(float[][] fArr) {
        if (!this.f45009g) {
            throw new IllegalArgumentException("rows and columns must be power of two numbers");
        }
        if (vp.a.c() > 1 && this.f45010h) {
            j(1, 1, fArr, true);
            f(-1, fArr, true);
            g(1, fArr);
        } else {
            for (int i10 = 0; i10 < this.f45003a; i10++) {
                this.f45007e.b0(fArr[i10]);
            }
            e(-1, fArr, true);
            g(1, fArr);
        }
    }

    public void i(float[][] fArr, boolean z10) {
        if (!this.f45009g) {
            throw new IllegalArgumentException("rows and columns must be power of two numbers");
        }
        if (vp.a.c() > 1 && this.f45010h) {
            g(-1, fArr);
            f(1, fArr, z10);
            j(1, -1, fArr, z10);
        } else {
            g(-1, fArr);
            e(1, fArr, z10);
            for (int i10 = 0; i10 < this.f45003a; i10++) {
                this.f45007e.f0(fArr[i10], z10);
            }
        }
    }
}

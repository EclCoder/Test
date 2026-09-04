package db;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ob.c0;
import ob.r0;
import ob.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f36553h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f36554i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte[] f36555j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f36556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f36557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Canvas f36558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0552b f36559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f36560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f36561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Bitmap f36562g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f36564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f36565c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f36566d;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f36563a = i10;
            this.f36564b = iArr;
            this.f36565c = iArr2;
            this.f36566d = iArr3;
        }
    }

    /* JADX INFO: renamed from: db.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0552b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f36569c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f36570d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f36571e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f36572f;

        public C0552b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f36567a = i10;
            this.f36568b = i11;
            this.f36569c = i12;
            this.f36570d = i13;
            this.f36571e = i14;
            this.f36572f = i15;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f36574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f36575c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f36576d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f36573a = i10;
            this.f36574b = z10;
            this.f36575c = bArr;
            this.f36576d = bArr2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f36579c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray f36580d;

        public d(int i10, int i11, int i12, SparseArray sparseArray) {
            this.f36577a = i10;
            this.f36578b = i11;
            this.f36579c = i12;
            this.f36580d = sparseArray;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36582b;

        public e(int i10, int i11) {
            this.f36581a = i10;
            this.f36582b = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f36584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f36585c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f36586d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f36587e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f36588f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f36589g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f36590h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f36591i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f36592j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final SparseArray f36593k;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray sparseArray) {
            this.f36583a = i10;
            this.f36584b = z10;
            this.f36585c = i11;
            this.f36586d = i12;
            this.f36587e = i13;
            this.f36588f = i14;
            this.f36589g = i15;
            this.f36590h = i16;
            this.f36591i = i17;
            this.f36592j = i18;
            this.f36593k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray sparseArray = fVar.f36593k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f36593k.put(sparseArray.keyAt(i10), (g) sparseArray.valueAt(i10));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36595b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f36596c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f36597d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f36598e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f36599f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f36594a = i10;
            this.f36595b = i11;
            this.f36596c = i12;
            this.f36597d = i13;
            this.f36598e = i14;
            this.f36599f = i15;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36601b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray f36602c = new SparseArray();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray f36603d = new SparseArray();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray f36604e = new SparseArray();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final SparseArray f36605f = new SparseArray();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final SparseArray f36606g = new SparseArray();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public C0552b f36607h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public d f36608i;

        public h(int i10, int i11) {
            this.f36600a = i10;
            this.f36601b = i11;
        }

        public void a() {
            this.f36602c.clear();
            this.f36603d.clear();
            this.f36604e.clear();
            this.f36605f.clear();
            this.f36606g.clear();
            this.f36607h = null;
            this.f36608i = null;
        }
    }

    public b(int i10, int i11) {
        Paint paint = new Paint();
        this.f36556a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f36557b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f36558c = new Canvas();
        this.f36559d = new C0552b(719, 575, 0, 719, 0, 575);
        this.f36560e = new a(0, c(), d(), e());
        this.f36561f = new h(i10, i11);
    }

    private static byte[] a(int i10, int i11, c0 c0Var) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) c0Var.h(i11);
        }
        return bArr;
    }

    private static int[] c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = f(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                int i11 = i10 & 1;
                int i12 = Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
                int i13 = i11 != 0 ? 127 : 0;
                int i14 = (i10 & 2) != 0 ? 127 : 0;
                if ((i10 & 4) == 0) {
                    i12 = 0;
                }
                iArr[i10] = f(255, i13, i14, i12);
            }
        }
        return iArr;
    }

    private static int[] e() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = f(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & Sdk$SDKError.b.PRIVACY_URL_ERROR_VALUE;
                if (i11 == 0) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = f(Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 43 : 0) + Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int f(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static int g(c0 c0Var, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        int i12;
        int iH;
        int iH2;
        boolean z10 = false;
        while (true) {
            int iH3 = c0Var.h(2);
            if (iH3 != 0) {
                z10 = z10;
                i12 = 1;
            } else {
                if (c0Var.g()) {
                    iH = c0Var.h(3) + 3;
                    iH2 = c0Var.h(2);
                } else {
                    if (c0Var.g()) {
                        i12 = 1;
                    } else {
                        int iH4 = c0Var.h(2);
                        if (iH4 == 0) {
                            z10 = true;
                        } else if (iH4 == 1) {
                            i12 = 2;
                        } else if (iH4 == 2) {
                            iH = c0Var.h(4) + 12;
                            iH2 = c0Var.h(2);
                        } else if (iH4 != 3) {
                            z10 = z10;
                        } else {
                            iH = c0Var.h(8) + 29;
                            iH2 = c0Var.h(2);
                        }
                        iH3 = 0;
                        i12 = 0;
                    }
                    iH3 = 0;
                }
                z10 = z10;
                i12 = iH;
                iH3 = iH2;
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    iH3 = bArr[iH3];
                }
                paint.setColor(iArr[iH3]);
                canvas.drawRect(i10, i11, i10 + i12, 1 + i11, paint);
            }
            i10 += i12;
            if (z10) {
                return i10;
            }
            z10 = z10;
        }
    }

    private static int h(c0 c0Var, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        int i12;
        int iH;
        int iH2;
        boolean z10 = false;
        while (true) {
            int iH3 = c0Var.h(4);
            if (iH3 != 0) {
                z10 = z10;
                i12 = 1;
            } else if (c0Var.g()) {
                if (c0Var.g()) {
                    int iH4 = c0Var.h(2);
                    if (iH4 == 0) {
                        i12 = 1;
                        iH3 = 0;
                    } else if (iH4 == 1) {
                        iH3 = 0;
                        i12 = 2;
                        z10 = z10;
                    } else if (iH4 == 2) {
                        iH = c0Var.h(4) + 9;
                        iH2 = c0Var.h(4);
                    } else if (iH4 != 3) {
                        z10 = z10;
                        iH3 = 0;
                        i12 = 0;
                    } else {
                        iH = c0Var.h(8) + 25;
                        iH2 = c0Var.h(4);
                    }
                } else {
                    iH = c0Var.h(2) + 4;
                    iH2 = c0Var.h(4);
                }
                z10 = z10;
                i12 = iH;
                iH3 = iH2;
            } else {
                int iH5 = c0Var.h(3);
                if (iH5 != 0) {
                    i12 = iH5 + 2;
                    iH3 = 0;
                } else {
                    z10 = true;
                    iH3 = 0;
                    i12 = 0;
                }
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    iH3 = bArr[iH3];
                }
                paint.setColor(iArr[iH3]);
                canvas.drawRect(i10, i11, i10 + i12, 1 + i11, paint);
            }
            i10 += i12;
            if (z10) {
                return i10;
            }
            z10 = z10;
        }
    }

    private static int i(c0 c0Var, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int iH;
        boolean z11 = false;
        while (true) {
            int iH2 = c0Var.h(8);
            if (iH2 != 0) {
                z10 = z11;
                iH = 1;
            } else if (c0Var.g()) {
                z10 = z11;
                iH = c0Var.h(7);
                iH2 = c0Var.h(8);
            } else {
                int iH3 = c0Var.h(7);
                if (iH3 != 0) {
                    z10 = z11;
                    iH = iH3;
                    iH2 = 0;
                } else {
                    z10 = true;
                    iH2 = 0;
                    iH = 0;
                }
            }
            if (iH != 0 && paint != null) {
                if (bArr != null) {
                    iH2 = bArr[iH2];
                }
                paint.setColor(iArr[iH2]);
                canvas.drawRect(i10, i11, i10 + iH, 1 + i11, paint);
            }
            i10 += iH;
            if (z10) {
                return i10;
            }
            z11 = z10;
        }
    }

    private static void j(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr2;
        Paint paint2;
        Canvas canvas2;
        byte[] bArr2;
        byte[] bArr3;
        c0 c0Var = new c0(bArr);
        byte[] bArrA = null;
        byte[] bArrA2 = null;
        int iG = i11;
        int i13 = i12;
        byte[] bArrA3 = null;
        while (c0Var.b() != 0) {
            int iH = c0Var.h(8);
            if (iH != 240) {
                switch (iH) {
                    case 16:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        if (i10 != 3) {
                            if (i10 == 2) {
                                bArr3 = bArrA2 == null ? f36553h : bArrA2;
                            } else {
                                bArr2 = null;
                            }
                            iG = g(c0Var, iArr2, bArr2, iG, i13, paint2, canvas2);
                            c0Var.c();
                        } else {
                            bArr3 = bArrA3 == null ? f36554i : bArrA3;
                        }
                        bArr2 = bArr3;
                        iG = g(c0Var, iArr2, bArr2, iG, i13, paint2, canvas2);
                        c0Var.c();
                        break;
                    case 17:
                        iArr2 = iArr;
                        Paint paint3 = paint;
                        canvas2 = canvas;
                        paint2 = paint3;
                        iG = h(c0Var, iArr2, i10 == 3 ? bArrA == null ? f36555j : bArrA : null, iG, i13, paint2, canvas2);
                        c0Var.c();
                        break;
                    case 18:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        iG = i(c0Var, iArr2, null, iG, i13, paint2, canvas2);
                        break;
                    default:
                        switch (iH) {
                            case 32:
                                bArrA2 = a(4, 4, c0Var);
                                break;
                            case 33:
                                bArrA3 = a(4, 8, c0Var);
                                break;
                            case 34:
                                bArrA = a(16, 8, c0Var);
                                break;
                        }
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        break;
                }
            } else {
                iArr2 = iArr;
                paint2 = paint;
                canvas2 = canvas;
                i13 += 2;
                iG = i11;
            }
            iArr = iArr2;
            paint = paint2;
            canvas = canvas2;
        }
    }

    private static void k(c cVar, a aVar, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i10 == 3) {
            iArr = aVar.f36566d;
        } else {
            iArr = i10 == 2 ? aVar.f36565c : aVar.f36564b;
        }
        int[] iArr2 = iArr;
        j(cVar.f36575c, iArr2, i10, i11, i12, paint, canvas);
        j(cVar.f36576d, iArr2, i10, i11, i12 + 1, paint, canvas);
    }

    private static a l(c0 c0Var, int i10) {
        int[] iArr;
        int iH;
        int i11;
        int iH2;
        int iH3;
        int iH4;
        int i12 = 8;
        int iH5 = c0Var.h(8);
        c0Var.r(8);
        int i13 = 2;
        int i14 = i10 - 2;
        int[] iArrC = c();
        int[] iArrD = d();
        int[] iArrE = e();
        while (i14 > 0) {
            int iH6 = c0Var.h(i12);
            int iH7 = c0Var.h(i12);
            if ((iH7 & 128) != 0) {
                iArr = iArrC;
            } else {
                iArr = (iH7 & 64) != 0 ? iArrD : iArrE;
            }
            if ((iH7 & 1) != 0) {
                iH3 = c0Var.h(i12);
                iH4 = c0Var.h(i12);
                iH = c0Var.h(i12);
                iH2 = c0Var.h(i12);
                i11 = i14 - 6;
            } else {
                int iH8 = c0Var.h(6) << i13;
                int iH9 = c0Var.h(4) << 4;
                iH = c0Var.h(4) << 4;
                i11 = i14 - 4;
                iH2 = c0Var.h(i13) << 6;
                iH3 = iH8;
                iH4 = iH9;
            }
            if (iH3 == 0) {
                iH2 = 255;
                iH4 = 0;
                iH = 0;
            }
            double d10 = iH3;
            double d11 = iH4 - 128;
            double d12 = iH - 128;
            iArr[iH6] = f((byte) (255 - (iH2 & 255)), r0.q((int) (d10 + (1.402d * d11)), 0, 255), r0.q((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), r0.q((int) (d10 + (d12 * 1.772d)), 0, 255));
            i14 = i11;
            iH5 = iH5;
            i12 = 8;
            i13 = 2;
        }
        return new a(iH5, iArrC, iArrD, iArrE);
    }

    private static C0552b m(c0 c0Var) {
        int i10;
        int i11;
        int i12;
        int iH;
        c0Var.r(4);
        boolean zG = c0Var.g();
        c0Var.r(3);
        int iH2 = c0Var.h(16);
        int iH3 = c0Var.h(16);
        if (zG) {
            int iH4 = c0Var.h(16);
            int iH5 = c0Var.h(16);
            int iH6 = c0Var.h(16);
            iH = c0Var.h(16);
            i12 = iH5;
            i11 = iH6;
            i10 = iH4;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = iH2;
            iH = iH3;
        }
        return new C0552b(iH2, iH3, i10, i12, i11, iH);
    }

    private static c n(c0 c0Var) {
        byte[] bArr;
        int iH = c0Var.h(16);
        c0Var.r(4);
        int iH2 = c0Var.h(2);
        boolean zG = c0Var.g();
        c0Var.r(1);
        byte[] bArr2 = r0.f48430f;
        if (iH2 != 1) {
            if (iH2 == 0) {
                int iH3 = c0Var.h(16);
                int iH4 = c0Var.h(16);
                if (iH3 > 0) {
                    bArr2 = new byte[iH3];
                    c0Var.k(bArr2, 0, iH3);
                }
                if (iH4 > 0) {
                    bArr = new byte[iH4];
                    c0Var.k(bArr, 0, iH4);
                }
            }
            return new c(iH, zG, bArr2, bArr);
        }
        c0Var.r(c0Var.h(8) * 16);
        bArr = bArr2;
        return new c(iH, zG, bArr2, bArr);
    }

    private static d o(c0 c0Var, int i10) {
        int iH = c0Var.h(8);
        int iH2 = c0Var.h(4);
        int iH3 = c0Var.h(2);
        c0Var.r(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int iH4 = c0Var.h(8);
            c0Var.r(8);
            i11 -= 6;
            sparseArray.put(iH4, new e(c0Var.h(16), c0Var.h(16)));
        }
        return new d(iH, iH2, iH3, sparseArray);
    }

    private static f p(c0 c0Var, int i10) {
        int i11;
        int iH;
        int iH2;
        char c10;
        int iH3 = c0Var.h(8);
        int i12 = 4;
        c0Var.r(4);
        boolean zG = c0Var.g();
        c0Var.r(3);
        int i13 = 16;
        int iH4 = c0Var.h(16);
        int iH5 = c0Var.h(16);
        int iH6 = c0Var.h(3);
        int iH7 = c0Var.h(3);
        int i14 = 2;
        c0Var.r(2);
        int iH8 = c0Var.h(8);
        int iH9 = c0Var.h(8);
        int iH10 = c0Var.h(4);
        int iH11 = c0Var.h(2);
        c0Var.r(2);
        int i15 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i15 > 0) {
            int iH12 = c0Var.h(i13);
            int iH13 = c0Var.h(i14);
            int iH14 = c0Var.h(i14);
            int iH15 = c0Var.h(12);
            c0Var.r(i12);
            int iH16 = c0Var.h(12);
            int i16 = i15 - 6;
            if (iH13 != 1) {
                i11 = 2;
                if (iH13 != 2) {
                    iH2 = 0;
                    iH = 0;
                    i15 = i16;
                    c10 = '\b';
                }
                sparseArray.put(iH12, new g(iH13, iH14, iH15, iH16, iH2, iH));
                i13 = 16;
                i14 = i11;
                i12 = 4;
            } else {
                i11 = 2;
            }
            c10 = '\b';
            i15 -= 8;
            iH2 = c0Var.h(8);
            iH = c0Var.h(8);
            sparseArray.put(iH12, new g(iH13, iH14, iH15, iH16, iH2, iH));
            i13 = 16;
            i14 = i11;
            i12 = 4;
        }
        return new f(iH3, zG, iH4, iH5, iH6, iH7, iH8, iH9, iH10, iH11, sparseArray);
    }

    private static void q(c0 c0Var, h hVar) {
        f fVar;
        int iH = c0Var.h(8);
        int iH2 = c0Var.h(16);
        int iH3 = c0Var.h(16);
        int iD = c0Var.d() + iH3;
        if (iH3 * 8 > c0Var.b()) {
            u.i("DvbParser", "Data field length exceeds limit");
            c0Var.r(c0Var.b());
            return;
        }
        switch (iH) {
            case 16:
                if (iH2 == hVar.f36600a) {
                    d dVar = hVar.f36608i;
                    d dVarO = o(c0Var, iH3);
                    if (dVarO.f36579c != 0) {
                        hVar.f36608i = dVarO;
                        hVar.f36602c.clear();
                        hVar.f36603d.clear();
                        hVar.f36604e.clear();
                    } else if (dVar != null && dVar.f36578b != dVarO.f36578b) {
                        hVar.f36608i = dVarO;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f36608i;
                if (iH2 == hVar.f36600a && dVar2 != null) {
                    f fVarP = p(c0Var, iH3);
                    if (dVar2.f36579c == 0 && (fVar = (f) hVar.f36602c.get(fVarP.f36583a)) != null) {
                        fVarP.a(fVar);
                    }
                    hVar.f36602c.put(fVarP.f36583a, fVarP);
                }
                break;
            case 18:
                if (iH2 == hVar.f36600a) {
                    a aVarL = l(c0Var, iH3);
                    hVar.f36603d.put(aVarL.f36563a, aVarL);
                } else if (iH2 == hVar.f36601b) {
                    a aVarL2 = l(c0Var, iH3);
                    hVar.f36605f.put(aVarL2.f36563a, aVarL2);
                }
                break;
            case 19:
                if (iH2 == hVar.f36600a) {
                    c cVarN = n(c0Var);
                    hVar.f36604e.put(cVarN.f36573a, cVarN);
                } else if (iH2 == hVar.f36601b) {
                    c cVarN2 = n(c0Var);
                    hVar.f36606g.put(cVarN2.f36573a, cVarN2);
                }
                break;
            case 20:
                if (iH2 == hVar.f36600a) {
                    hVar.f36607h = m(c0Var);
                }
                break;
        }
        c0Var.s(iD - c0Var.d());
    }

    public List b(byte[] bArr, int i10) {
        int i11;
        c0 c0Var = new c0(bArr, i10);
        while (c0Var.b() >= 48 && c0Var.h(8) == 15) {
            q(c0Var, this.f36561f);
        }
        h hVar = this.f36561f;
        d dVar = hVar.f36608i;
        if (dVar == null) {
            return Collections.EMPTY_LIST;
        }
        C0552b c0552b = hVar.f36607h;
        if (c0552b == null) {
            c0552b = this.f36559d;
        }
        Bitmap bitmap = this.f36562g;
        if (bitmap == null || c0552b.f36567a + 1 != bitmap.getWidth() || c0552b.f36568b + 1 != this.f36562g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c0552b.f36567a + 1, c0552b.f36568b + 1, Bitmap.Config.ARGB_8888);
            this.f36562g = bitmapCreateBitmap;
            this.f36558c.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = dVar.f36580d;
        int i12 = 0;
        while (i12 < sparseArray.size()) {
            this.f36558c.save();
            e eVar = (e) sparseArray.valueAt(i12);
            f fVar = (f) this.f36561f.f36602c.get(sparseArray.keyAt(i12));
            int i13 = eVar.f36581a + c0552b.f36569c;
            int i14 = eVar.f36582b + c0552b.f36571e;
            this.f36558c.clipRect(i13, i14, Math.min(fVar.f36585c + i13, c0552b.f36570d), Math.min(fVar.f36586d + i14, c0552b.f36572f));
            a aVar = (a) this.f36561f.f36603d.get(fVar.f36589g);
            if (aVar == null && (aVar = (a) this.f36561f.f36605f.get(fVar.f36589g)) == null) {
                aVar = this.f36560e;
            }
            a aVar2 = aVar;
            SparseArray sparseArray2 = fVar.f36593k;
            int i15 = 0;
            while (i15 < sparseArray2.size()) {
                int iKeyAt = sparseArray2.keyAt(i15);
                g gVar = (g) sparseArray2.valueAt(i15);
                c cVar = (c) this.f36561f.f36604e.get(iKeyAt);
                if (cVar == null) {
                    cVar = (c) this.f36561f.f36606g.get(iKeyAt);
                }
                if (cVar != null) {
                    k(cVar, aVar2, fVar.f36588f, gVar.f36596c + i13, gVar.f36597d + i14, cVar.f36574b ? null : this.f36556a, this.f36558c);
                }
                i15++;
                sparseArray = sparseArray;
            }
            SparseArray sparseArray3 = sparseArray;
            if (fVar.f36584b) {
                int i16 = fVar.f36588f;
                if (i16 == 3) {
                    i11 = aVar2.f36566d[fVar.f36590h];
                } else {
                    i11 = i16 == 2 ? aVar2.f36565c[fVar.f36591i] : aVar2.f36564b[fVar.f36592j];
                }
                this.f36557b.setColor(i11);
                this.f36558c.drawRect(i13, i14, fVar.f36585c + i13, fVar.f36586d + i14, this.f36557b);
            }
            arrayList.add(new bb.b.C0112b().f(Bitmap.createBitmap(this.f36562g, i13, i14, fVar.f36585c, fVar.f36586d)).k(i13 / c0552b.f36567a).l(0).h(i14 / c0552b.f36568b, 0).i(0).n(fVar.f36585c / c0552b.f36567a).g(fVar.f36586d / c0552b.f36568b).a());
            this.f36558c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f36558c.restore();
            i12++;
            sparseArray = sparseArray3;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void r() {
        this.f36561f.a();
    }
}

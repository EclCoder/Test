package n3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.common.collect.c0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.List;
import l3.r;
import w1.n;
import w1.t;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a implements r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f46778h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f46779i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte[] f46780j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f46781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f46782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Canvas f46783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f46784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0721a f46785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f46786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Bitmap f46787g;

    /* JADX INFO: renamed from: n3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0721a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f46788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f46789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f46790c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f46791d;

        public C0721a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f46788a = i10;
            this.f46789b = iArr;
            this.f46790c = iArr2;
            this.f46791d = iArr3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f46792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f46793b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f46794c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f46795d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f46796e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f46797f;

        public b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f46792a = i10;
            this.f46793b = i11;
            this.f46794c = i12;
            this.f46795d = i13;
            this.f46796e = i14;
            this.f46797f = i15;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f46798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f46799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f46800c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f46801d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f46798a = i10;
            this.f46799b = z10;
            this.f46800c = bArr;
            this.f46801d = bArr2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f46802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f46803b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f46804c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray f46805d;

        public d(int i10, int i11, int i12, SparseArray sparseArray) {
            this.f46802a = i10;
            this.f46803b = i11;
            this.f46804c = i12;
            this.f46805d = sparseArray;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f46806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f46807b;

        public e(int i10, int i11) {
            this.f46806a = i10;
            this.f46807b = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f46808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f46809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f46810c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f46811d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f46812e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f46813f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f46814g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f46815h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f46816i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f46817j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final SparseArray f46818k;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray sparseArray) {
            this.f46808a = i10;
            this.f46809b = z10;
            this.f46810c = i11;
            this.f46811d = i12;
            this.f46812e = i13;
            this.f46813f = i14;
            this.f46814g = i15;
            this.f46815h = i16;
            this.f46816i = i17;
            this.f46817j = i18;
            this.f46818k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray sparseArray = fVar.f46818k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f46818k.put(sparseArray.keyAt(i10), (g) sparseArray.valueAt(i10));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f46819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f46820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f46821c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f46822d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f46823e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f46824f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f46819a = i10;
            this.f46820b = i11;
            this.f46821c = i12;
            this.f46822d = i13;
            this.f46823e = i14;
            this.f46824f = i15;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f46825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f46826b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray f46827c = new SparseArray();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray f46828d = new SparseArray();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray f46829e = new SparseArray();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final SparseArray f46830f = new SparseArray();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final SparseArray f46831g = new SparseArray();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public b f46832h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public d f46833i;

        public h(int i10, int i11) {
            this.f46825a = i10;
            this.f46826b = i11;
        }

        public void a() {
            this.f46827c.clear();
            this.f46828d.clear();
            this.f46829e.clear();
            this.f46830f.clear();
            this.f46831g.clear();
            this.f46832h = null;
            this.f46833i = null;
        }
    }

    public a(List list) {
        u uVar = new u((byte[]) list.get(0));
        int iM = uVar.M();
        int iM2 = uVar.M();
        Paint paint = new Paint();
        this.f46781a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f46782b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f46783c = new Canvas();
        this.f46784d = new b(719, 575, 0, 719, 0, 575);
        this.f46785e = new C0721a(0, e(), f(), g());
        this.f46786f = new h(iM, iM2);
    }

    private static byte[] d(int i10, int i11, t tVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) tVar.h(i11);
        }
        return bArr;
    }

    private static int[] e() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] f() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = h(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                int i11 = i10 & 1;
                int i12 = Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
                int i13 = i11 != 0 ? 127 : 0;
                int i14 = (i10 & 2) != 0 ? 127 : 0;
                if ((i10 & 4) == 0) {
                    i12 = 0;
                }
                iArr[i10] = h(255, i13, i14, i12);
            }
        }
        return iArr;
    }

    private static int[] g() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = h(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & Sdk$SDKError.b.PRIVACY_URL_ERROR_VALUE;
                if (i11 == 0) {
                    iArr[i10] = h(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = h(Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = h(255, ((i10 & 1) != 0 ? 43 : 0) + Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = h(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int h(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static int i(t tVar, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        int i12;
        int iH;
        int iH2;
        boolean z10 = false;
        while (true) {
            int iH3 = tVar.h(2);
            if (iH3 != 0) {
                z10 = z10;
                i12 = 1;
            } else {
                if (tVar.g()) {
                    iH = tVar.h(3) + 3;
                    iH2 = tVar.h(2);
                } else {
                    if (tVar.g()) {
                        i12 = 1;
                    } else {
                        int iH4 = tVar.h(2);
                        if (iH4 == 0) {
                            z10 = true;
                        } else if (iH4 == 1) {
                            i12 = 2;
                        } else if (iH4 == 2) {
                            iH = tVar.h(4) + 12;
                            iH2 = tVar.h(2);
                        } else if (iH4 != 3) {
                            z10 = z10;
                        } else {
                            iH = tVar.h(8) + 29;
                            iH2 = tVar.h(2);
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

    private static int j(t tVar, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        int i12;
        int iH;
        int iH2;
        boolean z10 = false;
        while (true) {
            int iH3 = tVar.h(4);
            if (iH3 != 0) {
                z10 = z10;
                i12 = 1;
            } else if (tVar.g()) {
                if (tVar.g()) {
                    int iH4 = tVar.h(2);
                    if (iH4 == 0) {
                        i12 = 1;
                        iH3 = 0;
                    } else if (iH4 == 1) {
                        iH3 = 0;
                        i12 = 2;
                        z10 = z10;
                    } else if (iH4 == 2) {
                        iH = tVar.h(4) + 9;
                        iH2 = tVar.h(4);
                    } else if (iH4 != 3) {
                        z10 = z10;
                        iH3 = 0;
                        i12 = 0;
                    } else {
                        iH = tVar.h(8) + 25;
                        iH2 = tVar.h(4);
                    }
                } else {
                    iH = tVar.h(2) + 4;
                    iH2 = tVar.h(4);
                }
                z10 = z10;
                i12 = iH;
                iH3 = iH2;
            } else {
                int iH5 = tVar.h(3);
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

    private static int k(t tVar, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int iH;
        boolean z11 = false;
        while (true) {
            int iH2 = tVar.h(8);
            if (iH2 != 0) {
                z10 = z11;
                iH = 1;
            } else if (tVar.g()) {
                z10 = z11;
                iH = tVar.h(7);
                iH2 = tVar.h(8);
            } else {
                int iH3 = tVar.h(7);
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

    private static void l(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr2;
        Paint paint2;
        Canvas canvas2;
        byte[] bArr2;
        byte[] bArr3;
        t tVar = new t(bArr);
        byte[] bArrD = null;
        byte[] bArrD2 = null;
        int i13 = i11;
        int i14 = i12;
        byte[] bArrD3 = null;
        while (tVar.b() != 0) {
            int iH = tVar.h(8);
            if (iH != 240) {
                switch (iH) {
                    case 16:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        if (i10 != 3) {
                            if (i10 == 2) {
                                bArr3 = bArrD2 == null ? f46778h : bArrD2;
                            } else {
                                bArr2 = null;
                            }
                            i13 = i(tVar, iArr2, bArr2, i13, i14, paint2, canvas2);
                            tVar.c();
                        } else {
                            bArr3 = bArrD3 == null ? f46779i : bArrD3;
                        }
                        bArr2 = bArr3;
                        i13 = i(tVar, iArr2, bArr2, i13, i14, paint2, canvas2);
                        tVar.c();
                        break;
                    case 17:
                        iArr2 = iArr;
                        Paint paint3 = paint;
                        canvas2 = canvas;
                        paint2 = paint3;
                        i13 = j(tVar, iArr2, i10 == 3 ? bArrD == null ? f46780j : bArrD : null, i13, i14, paint2, canvas2);
                        tVar.c();
                        break;
                    case 18:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        i13 = k(tVar, iArr2, null, i13, i14, paint2, canvas2);
                        break;
                    default:
                        switch (iH) {
                            case 32:
                                bArrD2 = d(4, 4, tVar);
                                break;
                            case 33:
                                bArrD3 = d(4, 8, tVar);
                                break;
                            case 34:
                                bArrD = d(16, 8, tVar);
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
                i14 += 2;
                i13 = i11;
            }
            iArr = iArr2;
            paint = paint2;
            canvas = canvas2;
        }
    }

    private static void m(c cVar, C0721a c0721a, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i10 == 3) {
            iArr = c0721a.f46791d;
        } else {
            iArr = i10 == 2 ? c0721a.f46790c : c0721a.f46789b;
        }
        int[] iArr2 = iArr;
        l(cVar.f46800c, iArr2, i10, i11, i12, paint, canvas);
        l(cVar.f46801d, iArr2, i10, i11, i12 + 1, paint, canvas);
    }

    private l3.e n(t tVar) {
        int i10;
        while (tVar.b() >= 48 && tVar.h(8) == 15) {
            t(tVar, this.f46786f);
        }
        h hVar = this.f46786f;
        d dVar = hVar.f46833i;
        if (dVar == null) {
            return new l3.e(c0.C(), C.TIME_UNSET, C.TIME_UNSET);
        }
        b bVar = hVar.f46832h;
        if (bVar == null) {
            bVar = this.f46784d;
        }
        Bitmap bitmap = this.f46787g;
        if (bitmap == null || bVar.f46792a + 1 != bitmap.getWidth() || bVar.f46793b + 1 != this.f46787g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bVar.f46792a + 1, bVar.f46793b + 1, Bitmap.Config.ARGB_8888);
            this.f46787g = bitmapCreateBitmap;
            this.f46783c.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = dVar.f46805d;
        int i11 = 0;
        while (i11 < sparseArray.size()) {
            this.f46783c.save();
            e eVar = (e) sparseArray.valueAt(i11);
            f fVar = (f) this.f46786f.f46827c.get(sparseArray.keyAt(i11));
            int i12 = eVar.f46806a + bVar.f46794c;
            int i13 = eVar.f46807b + bVar.f46796e;
            this.f46783c.clipRect(i12, i13, Math.min(fVar.f46810c + i12, bVar.f46795d), Math.min(fVar.f46811d + i13, bVar.f46797f));
            C0721a c0721a = (C0721a) this.f46786f.f46828d.get(fVar.f46814g);
            if (c0721a == null && (c0721a = (C0721a) this.f46786f.f46830f.get(fVar.f46814g)) == null) {
                c0721a = this.f46785e;
            }
            C0721a c0721a2 = c0721a;
            SparseArray sparseArray2 = fVar.f46818k;
            int i14 = 0;
            while (i14 < sparseArray2.size()) {
                int iKeyAt = sparseArray2.keyAt(i14);
                g gVar = (g) sparseArray2.valueAt(i14);
                c cVar = (c) this.f46786f.f46829e.get(iKeyAt);
                if (cVar == null) {
                    cVar = (c) this.f46786f.f46831g.get(iKeyAt);
                }
                if (cVar != null) {
                    m(cVar, c0721a2, fVar.f46813f, gVar.f46821c + i12, gVar.f46822d + i13, cVar.f46799b ? null : this.f46781a, this.f46783c);
                }
                i14++;
                sparseArray = sparseArray;
            }
            SparseArray sparseArray3 = sparseArray;
            if (fVar.f46809b) {
                int i15 = fVar.f46813f;
                if (i15 == 3) {
                    i10 = c0721a2.f46791d[fVar.f46815h];
                } else {
                    i10 = i15 == 2 ? c0721a2.f46790c[fVar.f46816i] : c0721a2.f46789b[fVar.f46817j];
                }
                this.f46782b.setColor(i10);
                this.f46783c.drawRect(i12, i13, fVar.f46810c + i12, fVar.f46811d + i13, this.f46782b);
            }
            arrayList.add(new v1.a.b().f(Bitmap.createBitmap(this.f46787g, i12, i13, fVar.f46810c, fVar.f46811d)).k(i12 / bVar.f46792a).l(0).h(i13 / bVar.f46793b, 0).i(0).n(fVar.f46810c / bVar.f46792a).g(fVar.f46811d / bVar.f46793b).a());
            this.f46783c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f46783c.restore();
            i11++;
            sparseArray = sparseArray3;
        }
        return new l3.e(arrayList, C.TIME_UNSET, C.TIME_UNSET);
    }

    private static C0721a o(t tVar, int i10) {
        int[] iArr;
        int iH;
        int i11;
        int iH2;
        int iH3;
        int iH4;
        int i12 = 8;
        int iH5 = tVar.h(8);
        tVar.r(8);
        int i13 = 2;
        int i14 = i10 - 2;
        int[] iArrE = e();
        int[] iArrF = f();
        int[] iArrG = g();
        while (i14 > 0) {
            int iH6 = tVar.h(i12);
            int iH7 = tVar.h(i12);
            if ((iH7 & 128) != 0) {
                iArr = iArrE;
            } else {
                iArr = (iH7 & 64) != 0 ? iArrF : iArrG;
            }
            if ((iH7 & 1) != 0) {
                iH3 = tVar.h(i12);
                iH4 = tVar.h(i12);
                iH = tVar.h(i12);
                iH2 = tVar.h(i12);
                i11 = i14 - 6;
            } else {
                int iH8 = tVar.h(6) << i13;
                int iH9 = tVar.h(4) << 4;
                iH = tVar.h(4) << 4;
                i11 = i14 - 4;
                iH2 = tVar.h(i13) << 6;
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
            iArr[iH6] = h((byte) (255 - (iH2 & 255)), w1.c0.o((int) (d10 + (1.402d * d11)), 0, 255), w1.c0.o((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), w1.c0.o((int) (d10 + (d12 * 1.772d)), 0, 255));
            i14 = i11;
            iH5 = iH5;
            i12 = 8;
            i13 = 2;
        }
        return new C0721a(iH5, iArrE, iArrF, iArrG);
    }

    private static b p(t tVar) {
        int i10;
        int i11;
        int i12;
        int iH;
        tVar.r(4);
        boolean zG = tVar.g();
        tVar.r(3);
        int iH2 = tVar.h(16);
        int iH3 = tVar.h(16);
        if (zG) {
            int iH4 = tVar.h(16);
            int iH5 = tVar.h(16);
            int iH6 = tVar.h(16);
            iH = tVar.h(16);
            i12 = iH5;
            i11 = iH6;
            i10 = iH4;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = iH2;
            iH = iH3;
        }
        return new b(iH2, iH3, i10, i12, i11, iH);
    }

    private static c q(t tVar) {
        byte[] bArr;
        int iH = tVar.h(16);
        tVar.r(4);
        int iH2 = tVar.h(2);
        boolean zG = tVar.g();
        tVar.r(1);
        byte[] bArr2 = w1.c0.f55774f;
        if (iH2 != 1) {
            if (iH2 == 0) {
                int iH3 = tVar.h(16);
                int iH4 = tVar.h(16);
                if (iH3 > 0) {
                    bArr2 = new byte[iH3];
                    tVar.k(bArr2, 0, iH3);
                }
                if (iH4 > 0) {
                    bArr = new byte[iH4];
                    tVar.k(bArr, 0, iH4);
                }
            }
            return new c(iH, zG, bArr2, bArr);
        }
        tVar.r(tVar.h(8) * 16);
        bArr = bArr2;
        return new c(iH, zG, bArr2, bArr);
    }

    private static d r(t tVar, int i10) {
        int iH = tVar.h(8);
        int iH2 = tVar.h(4);
        int iH3 = tVar.h(2);
        tVar.r(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int iH4 = tVar.h(8);
            tVar.r(8);
            i11 -= 6;
            sparseArray.put(iH4, new e(tVar.h(16), tVar.h(16)));
        }
        return new d(iH, iH2, iH3, sparseArray);
    }

    private static f s(t tVar, int i10) {
        int i11;
        int iH;
        int iH2;
        char c10;
        int iH3 = tVar.h(8);
        int i12 = 4;
        tVar.r(4);
        boolean zG = tVar.g();
        tVar.r(3);
        int i13 = 16;
        int iH4 = tVar.h(16);
        int iH5 = tVar.h(16);
        int iH6 = tVar.h(3);
        int iH7 = tVar.h(3);
        int i14 = 2;
        tVar.r(2);
        int iH8 = tVar.h(8);
        int iH9 = tVar.h(8);
        int iH10 = tVar.h(4);
        int iH11 = tVar.h(2);
        tVar.r(2);
        int i15 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i15 > 0) {
            int iH12 = tVar.h(i13);
            int iH13 = tVar.h(i14);
            int iH14 = tVar.h(i14);
            int iH15 = tVar.h(12);
            tVar.r(i12);
            int iH16 = tVar.h(12);
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
            iH2 = tVar.h(8);
            iH = tVar.h(8);
            sparseArray.put(iH12, new g(iH13, iH14, iH15, iH16, iH2, iH));
            i13 = 16;
            i14 = i11;
            i12 = 4;
        }
        return new f(iH3, zG, iH4, iH5, iH6, iH7, iH8, iH9, iH10, iH11, sparseArray);
    }

    private static void t(t tVar, h hVar) {
        f fVar;
        int iH = tVar.h(8);
        int iH2 = tVar.h(16);
        int iH3 = tVar.h(16);
        int iD = tVar.d() + iH3;
        if (iH3 * 8 > tVar.b()) {
            n.h("DvbParser", "Data field length exceeds limit");
            tVar.r(tVar.b());
            return;
        }
        switch (iH) {
            case 16:
                if (iH2 == hVar.f46825a) {
                    d dVar = hVar.f46833i;
                    d dVarR = r(tVar, iH3);
                    if (dVarR.f46804c != 0) {
                        hVar.f46833i = dVarR;
                        hVar.f46827c.clear();
                        hVar.f46828d.clear();
                        hVar.f46829e.clear();
                    } else if (dVar != null && dVar.f46803b != dVarR.f46803b) {
                        hVar.f46833i = dVarR;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f46833i;
                if (iH2 == hVar.f46825a && dVar2 != null) {
                    f fVarS = s(tVar, iH3);
                    if (dVar2.f46804c == 0 && (fVar = (f) hVar.f46827c.get(fVarS.f46808a)) != null) {
                        fVarS.a(fVar);
                    }
                    hVar.f46827c.put(fVarS.f46808a, fVarS);
                }
                break;
            case 18:
                if (iH2 == hVar.f46825a) {
                    C0721a c0721aO = o(tVar, iH3);
                    hVar.f46828d.put(c0721aO.f46788a, c0721aO);
                } else if (iH2 == hVar.f46826b) {
                    C0721a c0721aO2 = o(tVar, iH3);
                    hVar.f46830f.put(c0721aO2.f46788a, c0721aO2);
                }
                break;
            case 19:
                if (iH2 == hVar.f46825a) {
                    c cVarQ = q(tVar);
                    hVar.f46829e.put(cVarQ.f46798a, cVarQ);
                } else if (iH2 == hVar.f46826b) {
                    c cVarQ2 = q(tVar);
                    hVar.f46831g.put(cVarQ2.f46798a, cVarQ2);
                }
                break;
            case 20:
                if (iH2 == hVar.f46825a) {
                    hVar.f46832h = p(tVar);
                }
                break;
        }
        tVar.s(iD - tVar.d());
    }

    @Override // l3.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, w1.h hVar) {
        t tVar = new t(bArr, i11 + i10);
        tVar.p(i10);
        hVar.accept(n(tVar));
    }

    @Override // l3.r
    public int c() {
        return 2;
    }

    @Override // l3.r
    public void reset() {
        this.f46786f.a();
    }
}

package q5;

import android.graphics.Bitmap;
import android.util.Log;
import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class e implements a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f50395u = "e";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f50396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f50397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a.InterfaceC0775a f50398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ByteBuffer f50399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f50400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private short[] f50401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f50402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f50403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private byte[] f50404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f50405j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f50406k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c f50407l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Bitmap f50408m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f50409n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f50410o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f50411p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f50412q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f50413r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Boolean f50414s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Bitmap.Config f50415t;

    public e(a.InterfaceC0775a interfaceC0775a, c cVar, ByteBuffer byteBuffer, int i10) {
        this(interfaceC0775a);
        q(cVar, byteBuffer, i10);
    }

    private int i(int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = i10; i18 < this.f50411p + i10; i18++) {
            byte[] bArr = this.f50404i;
            if (i18 >= bArr.length || i18 >= i11) {
                break;
            }
            int i19 = this.f50396a[bArr[i18] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
            if (i19 != 0) {
                i13 += (i19 >> 24) & 255;
                i14 += (i19 >> 16) & 255;
                i15 += (i19 >> 8) & 255;
                i16 += i19 & 255;
                i17++;
            }
        }
        int i20 = i10 + i12;
        for (int i21 = i20; i21 < this.f50411p + i20; i21++) {
            byte[] bArr2 = this.f50404i;
            if (i21 >= bArr2.length || i21 >= i11) {
                break;
            }
            int i22 = this.f50396a[bArr2[i21] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
            if (i22 != 0) {
                i13 += (i22 >> 24) & 255;
                i14 += (i22 >> 16) & 255;
                i15 += (i22 >> 8) & 255;
                i16 += i22 & 255;
                i17++;
            }
        }
        if (i17 == 0) {
            return 0;
        }
        return ((i13 / i17) << 24) | ((i14 / i17) << 16) | ((i15 / i17) << 8) | (i16 / i17);
    }

    private void j(b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr = this.f50405j;
        int i14 = bVar.f50370d;
        int i15 = this.f50411p;
        int i16 = i14 / i15;
        int i17 = bVar.f50368b / i15;
        int i18 = bVar.f50369c / i15;
        int i19 = bVar.f50367a / i15;
        boolean z10 = this.f50406k == 0;
        int i20 = this.f50413r;
        int i21 = this.f50412q;
        byte[] bArr = this.f50404i;
        int[] iArr2 = this.f50396a;
        Boolean bool = this.f50414s;
        int i22 = 8;
        int i23 = 0;
        int i24 = 0;
        int i25 = 1;
        while (i24 < i16) {
            int[] iArr3 = iArr;
            if (bVar.f50371e) {
                if (i23 >= i16) {
                    int i26 = i25 + 1;
                    i10 = i16;
                    if (i26 == 2) {
                        i25 = i26;
                        i23 = 4;
                    } else if (i26 == 3) {
                        i25 = i26;
                        i22 = 4;
                        i23 = 2;
                    } else if (i26 != 4) {
                        i25 = i26;
                    } else {
                        i25 = i26;
                        i23 = 1;
                        i22 = 2;
                    }
                } else {
                    i10 = i16;
                }
                i11 = i23 + i22;
            } else {
                i10 = i16;
                i11 = i23;
                i23 = i24;
            }
            int i27 = i23 + i17;
            boolean z11 = i15 == 1;
            if (i27 < i21) {
                int i28 = i27 * i20;
                int i29 = i28 + i19;
                int i30 = i29 + i18;
                int i31 = i28 + i20;
                if (i31 < i30) {
                    i30 = i31;
                }
                i12 = i11;
                int i32 = i24 * i15 * bVar.f50369c;
                if (z11) {
                    int i33 = i29;
                    while (i33 < i30) {
                        int i34 = i33;
                        int i35 = iArr2[bArr[i32] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
                        if (i35 != 0) {
                            iArr3[i34] = i35;
                        } else if (z10 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i32 += i15;
                        i33 = i34 + 1;
                    }
                } else {
                    int i36 = ((i30 - i29) * i15) + i32;
                    i13 = i15;
                    int i37 = i29;
                    while (i37 < i30) {
                        int i38 = i30;
                        int i39 = i(i32, i36, bVar.f50369c);
                        if (i39 != 0) {
                            iArr3[i37] = i39;
                        } else if (z10 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i32 += i13;
                        i37++;
                        i30 = i38;
                    }
                }
                i24++;
                i15 = i13;
                iArr = iArr3;
                i16 = i10;
                i23 = i12;
            } else {
                i12 = i11;
            }
            i13 = i15;
            i24++;
            i15 = i13;
            iArr = iArr3;
            i16 = i10;
            i23 = i12;
        }
        if (this.f50414s == null) {
            this.f50414s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    private void k(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f50405j;
        int i10 = bVar2.f50370d;
        int i11 = bVar2.f50368b;
        int i12 = bVar2.f50369c;
        int i13 = bVar2.f50367a;
        boolean z10 = this.f50406k == 0;
        int i14 = this.f50413r;
        byte[] bArr = this.f50404i;
        int[] iArr2 = this.f50396a;
        int i15 = 0;
        byte b10 = -1;
        while (i15 < i10) {
            int i16 = (i15 + i11) * i14;
            int i17 = i16 + i13;
            int i18 = i17 + i12;
            int i19 = i16 + i14;
            if (i19 < i18) {
                i18 = i19;
            }
            int i20 = bVar2.f50369c * i15;
            int i21 = i17;
            while (i21 < i18) {
                byte b11 = bArr[i20];
                int[] iArr3 = iArr;
                int i22 = b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                if (i22 != b10) {
                    int i23 = iArr2[i22];
                    if (i23 != 0) {
                        iArr3[i21] = i23;
                    } else {
                        b10 = b11;
                    }
                }
                i20++;
                i21++;
                iArr = iArr3;
            }
            i15++;
            bVar2 = bVar;
        }
        Boolean bool = this.f50414s;
        this.f50414s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f50414s == null && z10 && b10 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15, types: [short] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    private void l(b bVar) {
        int i10;
        int i11;
        short s10;
        e eVar = this;
        if (bVar != null) {
            eVar.f50399d.position(bVar.f50376j);
        }
        if (bVar == null) {
            c cVar = eVar.f50407l;
            i10 = cVar.f50383f;
            i11 = cVar.f50384g;
        } else {
            i10 = bVar.f50369c;
            i11 = bVar.f50370d;
        }
        int i12 = i10 * i11;
        byte[] bArr = eVar.f50404i;
        if (bArr == null || bArr.length < i12) {
            eVar.f50404i = eVar.f50398c.b(i12);
        }
        byte[] bArr2 = eVar.f50404i;
        if (eVar.f50401f == null) {
            eVar.f50401f = new short[4096];
        }
        short[] sArr = eVar.f50401f;
        if (eVar.f50402g == null) {
            eVar.f50402g = new byte[4096];
        }
        byte[] bArr3 = eVar.f50402g;
        if (eVar.f50403h == null) {
            eVar.f50403h = new byte[4097];
        }
        byte[] bArr4 = eVar.f50403h;
        int iP = eVar.p();
        int i13 = 1 << iP;
        int i14 = i13 + 1;
        int i15 = i13 + 2;
        int i16 = iP + 1;
        int i17 = (1 << i16) - 1;
        byte b10 = 0;
        for (int i18 = 0; i18 < i13; i18++) {
            sArr[i18] = 0;
            bArr3[i18] = (byte) i18;
        }
        byte[] bArr5 = eVar.f50400e;
        int i19 = i16;
        int i20 = i15;
        int i21 = i17;
        int i22 = 0;
        int iO = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = -1;
        while (i22 < i12) {
            if (iO == 0) {
                iO = eVar.o();
                if (iO <= 0) {
                    eVar.f50410o = 3;
                    break;
                }
                i23 = b10;
            }
            i25 += (bArr5[i23] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i24;
            i23++;
            iO--;
            int i30 = i24 + 8;
            i20 = i20;
            int i31 = i19;
            int i32 = i29;
            short[] sArr2 = sArr;
            int i33 = i27;
            while (true) {
                bArr3 = bArr3;
                if (i30 < i31) {
                    i27 = i33;
                    break;
                }
                int i34 = i25 & i21;
                i25 >>= i31;
                i30 -= i31;
                if (i34 == i13) {
                    i31 = i16;
                    i20 = i15;
                    i21 = i17;
                    i32 = -1;
                } else {
                    if (i34 == i14) {
                        i27 = i33;
                        break;
                    }
                    byte[] bArr6 = bArr4;
                    if (i32 == -1) {
                        bArr2[i26] = bArr3[i34];
                        i26++;
                        i22++;
                        i32 = i34;
                        i33 = i32;
                        bArr4 = bArr6;
                    } else {
                        if (i34 >= i20) {
                            bArr6[i28] = (byte) i33;
                            i28++;
                            s10 = i32;
                        } else {
                            s10 = i34;
                        }
                        while (s10 >= i13) {
                            bArr6[i28] = bArr3[s10];
                            i28++;
                            s10 = sArr2[s10];
                        }
                        int i35 = bArr3[s10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        byte b11 = (byte) i35;
                        bArr2[i26] = b11;
                        while (true) {
                            i26++;
                            i22++;
                            if (i28 <= 0) {
                                break;
                            }
                            i28--;
                            bArr2[i26] = bArr6[i28];
                        }
                        if (i20 < 4096) {
                            sArr2[i20] = (short) i32;
                            bArr3[i20] = b11;
                            i20++;
                            if ((i20 & i21) == 0 && i20 < 4096) {
                                i31++;
                                i21 += i20;
                            }
                        }
                        i32 = i34;
                        bArr4 = bArr6;
                        i33 = i35;
                    }
                }
            }
            i24 = i30;
            sArr = sArr2;
            bArr3 = bArr3;
            b10 = 0;
            i29 = i32;
            i19 = i31;
            eVar = this;
        }
        Arrays.fill(bArr2, i26, i12, b10);
    }

    private Bitmap n() {
        Boolean bool = this.f50414s;
        Bitmap bitmapC = this.f50398c.c(this.f50413r, this.f50412q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f50415t);
        bitmapC.setHasAlpha(true);
        return bitmapC;
    }

    private int o() {
        int iP = p();
        if (iP <= 0) {
            return iP;
        }
        ByteBuffer byteBuffer = this.f50399d;
        byteBuffer.get(this.f50400e, 0, Math.min(iP, byteBuffer.remaining()));
        return iP;
    }

    private int p() {
        return this.f50399d.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    private Bitmap r(b bVar, b bVar2) {
        int i10;
        int i11;
        Bitmap bitmap;
        int[] iArr = this.f50405j;
        int i12 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f50408m;
            if (bitmap2 != null) {
                this.f50398c.a(bitmap2);
            }
            this.f50408m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f50373g == 3 && this.f50408m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i11 = bVar2.f50373g) > 0) {
            if (i11 == 2) {
                if (!bVar.f50372f) {
                    c cVar = this.f50407l;
                    int i13 = cVar.f50389l;
                    if (bVar.f50377k == null || cVar.f50387j != bVar.f50374h) {
                        i12 = i13;
                    }
                }
                int i14 = bVar2.f50370d;
                int i15 = this.f50411p;
                int i16 = i14 / i15;
                int i17 = bVar2.f50368b / i15;
                int i18 = bVar2.f50369c / i15;
                int i19 = bVar2.f50367a / i15;
                int i20 = this.f50413r;
                int i21 = (i17 * i20) + i19;
                int i22 = (i16 * i20) + i21;
                while (i21 < i22) {
                    int i23 = i21 + i18;
                    for (int i24 = i21; i24 < i23; i24++) {
                        iArr[i24] = i12;
                    }
                    i21 += this.f50413r;
                }
            } else if (i11 == 3 && (bitmap = this.f50408m) != null) {
                int i25 = this.f50413r;
                bitmap.getPixels(iArr, 0, i25, 0, 0, i25, this.f50412q);
            }
        }
        l(bVar);
        if (bVar.f50371e || this.f50411p != 1) {
            j(bVar);
        } else {
            k(bVar);
        }
        if (this.f50409n && ((i10 = bVar.f50373g) == 0 || i10 == 1)) {
            if (this.f50408m == null) {
                this.f50408m = n();
            }
            Bitmap bitmap3 = this.f50408m;
            int i26 = this.f50413r;
            bitmap3.setPixels(iArr, 0, i26, 0, 0, i26, this.f50412q);
        }
        Bitmap bitmapN = n();
        int i27 = this.f50413r;
        bitmapN.setPixels(iArr, 0, i27, 0, 0, i27, this.f50412q);
        return bitmapN;
    }

    @Override // q5.a
    public synchronized Bitmap a() {
        try {
            if (this.f50407l.f50380c <= 0 || this.f50406k < 0) {
                String str = f50395u;
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Unable to decode frame, frameCount=" + this.f50407l.f50380c + ", framePointer=" + this.f50406k);
                }
                this.f50410o = 1;
            }
            int i10 = this.f50410o;
            if (i10 != 1 && i10 != 2) {
                this.f50410o = 0;
                if (this.f50400e == null) {
                    this.f50400e = this.f50398c.b(255);
                }
                b bVar = (b) this.f50407l.f50382e.get(this.f50406k);
                int i11 = this.f50406k - 1;
                b bVar2 = i11 >= 0 ? (b) this.f50407l.f50382e.get(i11) : null;
                int[] iArr = bVar.f50377k;
                if (iArr == null) {
                    iArr = this.f50407l.f50378a;
                }
                this.f50396a = iArr;
                if (iArr == null) {
                    String str2 = f50395u;
                    if (Log.isLoggable(str2, 3)) {
                        Log.d(str2, "No valid color table found for frame #" + this.f50406k);
                    }
                    this.f50410o = 1;
                    return null;
                }
                if (bVar.f50372f) {
                    System.arraycopy(iArr, 0, this.f50397b, 0, iArr.length);
                    int[] iArr2 = this.f50397b;
                    this.f50396a = iArr2;
                    iArr2[bVar.f50374h] = 0;
                    if (bVar.f50373g == 2 && this.f50406k == 0) {
                        this.f50414s = Boolean.TRUE;
                    }
                }
                return r(bVar, bVar2);
            }
            String str3 = f50395u;
            if (Log.isLoggable(str3, 3)) {
                Log.d(str3, "Unable to decode frame, status=" + this.f50410o);
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // q5.a
    public void b() {
        this.f50406k = (this.f50406k + 1) % this.f50407l.f50380c;
    }

    @Override // q5.a
    public int c() {
        return this.f50407l.f50380c;
    }

    @Override // q5.a
    public void clear() {
        this.f50407l = null;
        byte[] bArr = this.f50404i;
        if (bArr != null) {
            this.f50398c.e(bArr);
        }
        int[] iArr = this.f50405j;
        if (iArr != null) {
            this.f50398c.f(iArr);
        }
        Bitmap bitmap = this.f50408m;
        if (bitmap != null) {
            this.f50398c.a(bitmap);
        }
        this.f50408m = null;
        this.f50399d = null;
        this.f50414s = null;
        byte[] bArr2 = this.f50400e;
        if (bArr2 != null) {
            this.f50398c.e(bArr2);
        }
    }

    @Override // q5.a
    public void d(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f50415t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // q5.a
    public int e() {
        int i10;
        if (this.f50407l.f50380c <= 0 || (i10 = this.f50406k) < 0) {
            return 0;
        }
        return m(i10);
    }

    @Override // q5.a
    public void f() {
        this.f50406k = -1;
    }

    @Override // q5.a
    public int g() {
        return this.f50406k;
    }

    @Override // q5.a
    public ByteBuffer getData() {
        return this.f50399d;
    }

    @Override // q5.a
    public int h() {
        return this.f50399d.limit() + this.f50404i.length + (this.f50405j.length * 4);
    }

    public int m(int i10) {
        if (i10 < 0) {
            return -1;
        }
        c cVar = this.f50407l;
        if (i10 < cVar.f50380c) {
            return ((b) cVar.f50382e.get(i10)).f50375i;
        }
        return -1;
    }

    public synchronized void q(c cVar, ByteBuffer byteBuffer, int i10) {
        try {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
            int iHighestOneBit = Integer.highestOneBit(i10);
            this.f50410o = 0;
            this.f50407l = cVar;
            this.f50406k = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f50399d = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f50399d.order(ByteOrder.LITTLE_ENDIAN);
            this.f50409n = false;
            Iterator it = cVar.f50382e.iterator();
            while (it.hasNext()) {
                if (((b) it.next()).f50373g == 3) {
                    this.f50409n = true;
                    break;
                }
            }
            this.f50411p = iHighestOneBit;
            int i11 = cVar.f50383f;
            this.f50413r = i11 / iHighestOneBit;
            int i12 = cVar.f50384g;
            this.f50412q = i12 / iHighestOneBit;
            this.f50404i = this.f50398c.b(i11 * i12);
            this.f50405j = this.f50398c.d(this.f50413r * this.f50412q);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public e(a.InterfaceC0775a interfaceC0775a) {
        this.f50397b = new int[256];
        this.f50415t = Bitmap.Config.ARGB_8888;
        this.f50398c = interfaceC0775a;
        this.f50407l = new c();
    }
}

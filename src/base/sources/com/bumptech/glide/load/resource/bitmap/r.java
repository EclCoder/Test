package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bytedance.sdk.component.hn.hnj.yiH.PAFNPq;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r5.f f11560f = r5.f.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", r5.b.f51089c);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r5.f f11561g = r5.f.e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final r5.f f11562h = l.f11555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r5.f f11563i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final r5.f f11564j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Set f11565k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final b f11566l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Set f11567m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Queue f11568n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u5.d f11569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DisplayMetrics f11570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u5.b f11571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f11572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z f11573e = z.b();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public interface b {
        void a(u5.d dVar, Bitmap bitmap);

        void b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f11563i = r5.f.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f11564j = r5.f.f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f11565k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f11566l = new a();
        f11567m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f11568n = m6.l.f(0);
    }

    public r(List list, DisplayMetrics displayMetrics, u5.d dVar, u5.b bVar) {
        this.f11572d = list;
        this.f11570b = (DisplayMetrics) m6.k.e(displayMetrics);
        this.f11569a = (u5.d) m6.k.e(dVar);
        this.f11571c = (u5.b) m6.k.e(bVar);
    }

    private static int a(double d10) {
        int iL = l(d10);
        int iX = x(((double) iL) * d10);
        return x((d10 / ((double) (iX / iL))) * ((double) iX));
    }

    private void b(a0 a0Var, r5.b bVar, boolean z10, boolean z11, BitmapFactory.Options options, int i10, int i11) {
        boolean zHasAlpha;
        if (this.f11573e.g(i10, i11, options, z10, z11)) {
            return;
        }
        if (bVar == r5.b.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            zHasAlpha = a0Var.e().hasAlpha();
        } catch (IOException e10) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e10);
            }
            zHasAlpha = false;
        }
        Bitmap.Config config = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    private static void c(ImageHeaderParser.ImageType imageType, a0 a0Var, b bVar, u5.d dVar, l lVar, int i10, int i11, int i12, int i13, int i14, BitmapFactory.Options options) {
        int i15;
        int i16;
        int i17;
        int iFloor;
        int iFloor2;
        if (i11 <= 0 || i12 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i13 + "x" + i14 + "]");
                return;
            }
            return;
        }
        if (r(i10)) {
            i16 = i11;
            i15 = i12;
        } else {
            i15 = i11;
            i16 = i12;
        }
        float fB = lVar.b(i15, i16, i13, i14);
        if (fB <= 0.0f) {
            throw new IllegalArgumentException(PAFNPq.zLK + fB + " from: " + lVar + ", source: [" + i11 + "x" + i12 + "], target: [" + i13 + "x" + i14 + "]");
        }
        l.g gVarA = lVar.a(i15, i16, i13, i14);
        if (gVarA == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f10 = i15;
        float f11 = i16;
        int i18 = i15;
        int i19 = i16;
        int iX = i18 / x(fB * f10);
        int iX2 = i19 / x(fB * f11);
        l.g gVar = l.g.MEMORY;
        int iMax = Math.max(1, Integer.highestOneBit(gVarA == gVar ? Math.max(iX, iX2) : Math.min(iX, iX2)));
        if (gVarA == gVar && iMax < 1.0f / fB) {
            iMax <<= 1;
        }
        options.inSampleSize = iMax;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(iMax, 8);
            i17 = 0;
            iFloor = (int) Math.ceil(f10 / fMin);
            iFloor2 = (int) Math.ceil(f11 / fMin);
            int i20 = iMax / 8;
            if (i20 > 0) {
                iFloor /= i20;
                iFloor2 /= i20;
            }
        } else {
            i17 = 0;
            if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
                float f12 = iMax;
                iFloor = (int) Math.floor(f10 / f12);
                iFloor2 = (int) Math.floor(f11 / f12);
            } else if (imageType.isWebp()) {
                float f13 = iMax;
                iFloor = Math.round(f10 / f13);
                iFloor2 = Math.round(f11 / f13);
            } else if (i18 % iMax == 0 && i19 % iMax == 0) {
                iFloor = i18 / iMax;
                iFloor2 = i19 / iMax;
            } else {
                int[] iArrM = m(a0Var, options, bVar, dVar);
                iFloor = iArrM[0];
                iFloor2 = iArrM[1];
            }
        }
        double dB = lVar.b(iFloor, iFloor2, i13, i14);
        options.inTargetDensity = a(dB);
        options.inDensity = l(dB);
        if (s(options)) {
            options.inScaled = true;
        } else {
            int i21 = i17;
            options.inTargetDensity = i21;
            options.inDensity = i21;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            Log.v("Downsampler", "Calculate scaling, source: [" + i11 + "x" + i12 + "], degreesToRotate: " + i10 + ", target: [" + i13 + "x" + i14 + "], power of two scaled: [" + iFloor + "x" + iFloor2 + "], exact scale factor: " + fB + ", power of 2 sample size: " + iMax + ", adjusted scale factor: " + dB + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
        }
    }

    private t5.c e(a0 a0Var, int i10, int i11, r5.g gVar, b bVar) {
        byte[] bArr = (byte[]) this.f11571c.c(C.DEFAULT_BUFFER_SEGMENT_SIZE, byte[].class);
        BitmapFactory.Options optionsK = k();
        optionsK.inTempStorage = bArr;
        r5.b bVar2 = (r5.b) gVar.c(f11560f);
        r5.h hVar = (r5.h) gVar.c(f11561g);
        l lVar = (l) gVar.c(l.f11555h);
        boolean zBooleanValue = ((Boolean) gVar.c(f11563i)).booleanValue();
        r5.f fVar = f11564j;
        try {
            return f.d(h(a0Var, optionsK, lVar, bVar2, hVar, gVar.c(fVar) != null && ((Boolean) gVar.c(fVar)).booleanValue(), i10, i11, zBooleanValue, bVar), this.f11569a);
        } finally {
            v(optionsK);
            this.f11571c.put(bArr);
        }
    }

    private Bitmap h(a0 a0Var, BitmapFactory.Options options, l lVar, r5.b bVar, r5.h hVar, boolean z10, int i10, int i11, boolean z11, b bVar2) {
        String str;
        ColorSpace colorSpace;
        long jB = m6.g.b();
        int[] iArrM = m(a0Var, options, bVar2, this.f11569a);
        int i12 = iArrM[0];
        int i13 = iArrM[1];
        String str2 = options.outMimeType;
        boolean z12 = (i12 == -1 || i13 == -1) ? false : z10;
        int iD = a0Var.d();
        int iG = h0.g(iD);
        boolean zJ = h0.j(iD);
        int i14 = i10;
        if (i14 == Integer.MIN_VALUE) {
            i14 = r(iG) ? i13 : i12;
        }
        if (i11 == -2147483648) {
            i11 = r(iG) ? i12 : i13;
        }
        ImageHeaderParser.ImageType imageTypeE = a0Var.e();
        c(imageTypeE, a0Var, bVar2, this.f11569a, lVar, iG, i12, i13, i14, i11, options);
        int i15 = i14;
        int i16 = i11;
        b(a0Var, bVar, z12, zJ, options, i15, i16);
        int i17 = Build.VERSION.SDK_INT;
        if (z(imageTypeE)) {
            if (i12 < 0 || i13 < 0 || !z11) {
                float f10 = s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                int i18 = options.inSampleSize;
                float f11 = i18;
                int iCeil = (int) Math.ceil(i12 / f11);
                int iCeil2 = (int) Math.ceil(i13 / f11);
                int iRound = Math.round(iCeil * f10);
                int iRound2 = Math.round(iCeil2 * f10);
                str = "Downsampler";
                if (Log.isLoggable(str, 2)) {
                    Log.v(str, "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i12 + "x" + i13 + "], sampleSize: " + i18 + ", targetDensity: " + options.inTargetDensity + ", density: " + options.inDensity + ", density multiplier: " + f10);
                }
                i15 = iRound;
                i16 = iRound2;
            } else {
                str = "Downsampler";
            }
            if (i15 > 0 && i16 > 0) {
                y(options, this.f11569a, i15, i16);
            }
        } else {
            str = "Downsampler";
        }
        if (hVar != null) {
            if (i17 >= 28) {
                options.inPreferredColorSpace = ColorSpace.get((hVar == r5.h.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else if (i17 >= 26) {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap bitmapI = i(a0Var, options, bVar2, this.f11569a);
        bVar2.a(this.f11569a, bitmapI);
        if (Log.isLoggable(str, 2)) {
            t(i12, i13, str2, options, bitmapI, i10, i11, jB);
        }
        if (bitmapI == null) {
            return null;
        }
        bitmapI.setDensity(this.f11570b.densityDpi);
        Bitmap bitmapK = h0.k(this.f11569a, bitmapI, iD);
        if (!bitmapI.equals(bitmapK)) {
            this.f11569a.d(bitmapI);
        }
        return bitmapK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap i(com.bumptech.glide.load.resource.bitmap.a0 r5, android.graphics.BitmapFactory.Options r6, com.bumptech.glide.load.resource.bitmap.r.b r7, u5.d r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.b()
            r5.c()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.resource.bitmap.h0.f()
            r4.lock()
            android.graphics.Bitmap r5 = r5.a(r6)     // Catch: java.lang.IllegalArgumentException -> L25 java.lang.Throwable -> L47
        L1d:
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.h0.f()
            r6.unlock()
            return r5
        L25:
            r4 = move-exception
            java.io.IOException r1 = u(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L47
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L36
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L47
        L36:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L46
            r8.d(r0)     // Catch: java.io.IOException -> L45 java.lang.Throwable -> L47
            r0 = 0
            r6.inBitmap = r0     // Catch: java.io.IOException -> L45 java.lang.Throwable -> L47
            android.graphics.Bitmap r5 = i(r5, r6, r7, r8)     // Catch: java.io.IOException -> L45 java.lang.Throwable -> L47
            goto L1d
        L45:
            throw r1     // Catch: java.lang.Throwable -> L47
        L46:
            throw r1     // Catch: java.lang.Throwable -> L47
        L47:
            r5 = move-exception
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.h0.f()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.r.i(com.bumptech.glide.load.resource.bitmap.a0, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.r$b, u5.d):android.graphics.Bitmap");
    }

    private static String j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    private static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options options;
        Queue queue = f11568n;
        synchronized (queue) {
            options = (BitmapFactory.Options) queue.poll();
        }
        if (options == null) {
            options = new BitmapFactory.Options();
            w(options);
        }
        return options;
    }

    private static int l(double d10) {
        if (d10 > 1.0d) {
            d10 = 1.0d / d10;
        }
        return (int) Math.round(d10 * 2.147483647E9d);
    }

    private static int[] m(a0 a0Var, BitmapFactory.Options options, b bVar, u5.d dVar) {
        options.inJustDecodeBounds = true;
        i(a0Var, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    private static boolean r(int i10) {
        return i10 == 90 || i10 == 270;
    }

    private static boolean s(BitmapFactory.Options options) {
        int i10;
        int i11 = options.inTargetDensity;
        return i11 > 0 && (i10 = options.inDensity) > 0 && i11 != i10;
    }

    private static void t(int i10, int i11, String str, BitmapFactory.Options options, Bitmap bitmap, int i12, int i13, long j10) {
        Log.v("Downsampler", "Decoded " + j(bitmap) + " from [" + i10 + "x" + i11 + "] " + str + " with inBitmap " + n(options) + " for [" + i12 + "x" + i13 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + m6.g.a(j10));
    }

    private static IOException u(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    private static void v(BitmapFactory.Options options) {
        w(options);
        Queue queue = f11568n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int x(double d10) {
        return (int) (d10 + 0.5d);
    }

    private static void y(BitmapFactory.Options options, u5.d dVar, int i10, int i11) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return;
        } else {
            config = options.outConfig;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = dVar.f(i10, i11, config);
    }

    private boolean z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    public t5.c d(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, r5.g gVar) {
        return e(new a0.c(parcelFileDescriptor, this.f11572d, this.f11571c), i10, i11, gVar, f11566l);
    }

    public t5.c f(InputStream inputStream, int i10, int i11, r5.g gVar, b bVar) {
        return e(new a0.b(inputStream, this.f11572d, this.f11571c), i10, i11, gVar, bVar);
    }

    public t5.c g(ByteBuffer byteBuffer, int i10, int i11, r5.g gVar) {
        return e(new a0.a(byteBuffer, this.f11572d, this.f11571c), i10, i11, gVar, f11566l);
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.c();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.r.b
        public void b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.r.b
        public void a(u5.d dVar, Bitmap bitmap) {
        }
    }
}

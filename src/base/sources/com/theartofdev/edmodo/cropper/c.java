package com.theartofdev.edmodo.cropper;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import re.xQrM.UoyZyZEcGYBpIg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Rect f35708a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final RectF f35709b = new RectF();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final RectF f35710c = new RectF();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final float[] f35711d = new float[6];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final float[] f35712e = new float[6];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f35713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static Pair f35714g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bitmap f35715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f35716b;

        a(Bitmap bitmap, int i10) {
            this.f35715a = bitmap;
            this.f35716b = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bitmap f35717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f35718b;

        b(Bitmap bitmap, int i10) {
            this.f35717a = bitmap;
            this.f35718b = i10;
        }
    }

    static b A(Bitmap bitmap, Context context, Uri uri) {
        androidx.exifinterface.media.a aVar = null;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                androidx.exifinterface.media.a aVar2 = new androidx.exifinterface.media.a(inputStreamOpenInputStream);
                try {
                    inputStreamOpenInputStream.close();
                } catch (Exception unused) {
                }
                aVar = aVar2;
            }
        } catch (Exception unused2) {
        }
        return aVar != null ? B(bitmap, aVar) : new b(bitmap, 0);
    }

    static b B(Bitmap bitmap, androidx.exifinterface.media.a aVar) {
        int i10;
        int iC = aVar.c("Orientation", 1);
        if (iC == 3) {
            i10 = 180;
        } else if (iC != 6) {
            i10 = iC != 8 ? 0 : 270;
        } else {
            i10 = 90;
        }
        return new b(bitmap, i10);
    }

    static void C(Context context, Bitmap bitmap, Uri uri, Bitmap.CompressFormat compressFormat, int i10) {
        OutputStream outputStreamOpenOutputStream = null;
        try {
            outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri);
            bitmap.compress(compressFormat, i10, outputStreamOpenOutputStream);
        } finally {
            c(outputStreamOpenOutputStream);
        }
    }

    static Uri D(Context context, Bitmap bitmap, Uri uri) {
        boolean z10 = true;
        try {
            if (uri == null) {
                uri = Uri.fromFile(File.createTempFile("aic_state_store_temp", ".jpg", context.getCacheDir()));
            } else if (new File(uri.getPath()).exists()) {
                z10 = false;
            }
            if (z10) {
                C(context, bitmap, uri, Bitmap.CompressFormat.JPEG, 95);
            }
            return uri;
        } catch (Exception e10) {
            Log.w("AIC", UoyZyZEcGYBpIg.jmAizWaK, e10);
            return null;
        }
    }

    private static int a(int i10, int i11) {
        if (f35713f == 0) {
            f35713f = o();
        }
        int i12 = 1;
        if (f35713f <= 0) {
            return 1;
        }
        while (true) {
            int i13 = i11 / i12;
            int i14 = f35713f;
            if (i13 <= i14 && i10 / i12 <= i14) {
                return i12;
            }
            i12 *= 2;
        }
    }

    private static int b(int i10, int i11, int i12, int i13) {
        int i14 = 1;
        if (i11 <= i13 && i10 <= i12) {
            return 1;
        }
        while ((i11 / 2) / i14 > i13 && (i10 / 2) / i14 > i12) {
            i14 *= 2;
        }
        return i14;
    }

    private static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    static a d(Context context, Uri uri, float[] fArr, int i10, int i11, int i12, boolean z10, int i13, int i14, int i15, int i16, boolean z11, boolean z12) {
        int i17 = 1;
        Context context2 = context;
        while (true) {
            try {
                return e(context2, uri, fArr, i10, i11, i12, z10, i13, i14, i15, i16, z11, z12, i17);
            } catch (OutOfMemoryError e10) {
                int i18 = i17 * 2;
                if (i18 > 16) {
                    throw new RuntimeException("Failed to handle OOM by sampling (" + i18 + "): " + uri + "\r\n" + e10.getMessage(), e10);
                }
                i17 = i18;
                context2 = context;
            }
        }
    }

    private static a e(Context context, Uri uri, float[] fArr, int i10, int i11, int i12, boolean z10, int i13, int i14, int i15, int i16, boolean z11, boolean z12, int i17) throws Throwable {
        int i18;
        Rect rectS = s(fArr, i11, i12, z10, i13, i14);
        int iWidth = i15 > 0 ? i15 : rectS.width();
        int iHeight = i16 > 0 ? i16 : rectS.height();
        Bitmap bitmap = null;
        try {
            a aVarM = m(context, uri, rectS, iWidth, iHeight, i17);
            bitmap = aVarM.f35715a;
            i18 = aVarM.f35716b;
        } catch (Exception unused) {
            i18 = 1;
        }
        int i19 = i18;
        Bitmap bitmap2 = bitmap;
        if (bitmap2 == null) {
            return f(context, uri, fArr, i10, z10, i13, i14, i17, rectS, iWidth, iHeight, z11, z12);
        }
        try {
            Bitmap bitmapZ = z(bitmap2, i10, z11, z12);
            if (i10 % 90 != 0) {
                bitmapZ = i(bitmapZ, fArr, rectS, i10, z10, i13, i14);
            }
            return new a(bitmapZ, i19);
        } catch (OutOfMemoryError e10) {
            if (bitmap2 == null) {
                throw e10;
            }
            bitmap2.recycle();
            throw e10;
        }
    }

    private static a f(Context context, Uri uri, float[] fArr, int i10, boolean z10, int i11, int i12, int i13, Rect rect, int i14, int i15, boolean z11, boolean z12) {
        Bitmap bitmapH = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int iB = b(rect.width(), rect.height(), i14, i15) * i13;
            options.inSampleSize = iB;
            Bitmap bitmapJ = j(context.getContentResolver(), uri, options);
            if (bitmapJ != null) {
                try {
                    int length = fArr.length;
                    float[] fArr2 = new float[length];
                    System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                    for (int i16 = 0; i16 < length; i16++) {
                        fArr2[i16] = fArr2[i16] / options.inSampleSize;
                    }
                    bitmapH = h(bitmapJ, fArr2, i10, z10, i11, i12, 1.0f, z11, z12);
                    if (bitmapH != bitmapJ) {
                        bitmapJ.recycle();
                    }
                } catch (Throwable th2) {
                    bitmapJ.recycle();
                    throw th2;
                }
            }
            return new a(bitmapH, iB);
        } catch (Exception e10) {
            throw new RuntimeException("Failed to load sampled bitmap: " + uri + "\r\n" + e10.getMessage(), e10);
        } catch (OutOfMemoryError e11) {
            if (0 == 0) {
                throw e11;
            }
            bitmapH.recycle();
            throw e11;
        }
    }

    static a g(Bitmap bitmap, float[] fArr, int i10, boolean z10, int i11, int i12, boolean z11, boolean z12) {
        int i13 = 1;
        do {
            try {
                return new a(h(bitmap, fArr, i10, z10, i11, i12, 1.0f / i13, z11, z12), i13);
            } catch (OutOfMemoryError e10) {
                i13 *= 2;
            }
        } while (i13 <= 8);
        throw e10;
    }

    private static Bitmap h(Bitmap bitmap, float[] fArr, int i10, boolean z10, int i11, int i12, float f10, boolean z11, boolean z12) {
        Rect rectS = s(fArr, bitmap.getWidth(), bitmap.getHeight(), z10, i11, i12);
        Matrix matrix = new Matrix();
        matrix.setRotate(i10, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
        matrix.postScale(z11 ? -f10 : f10, z12 ? -f10 : f10);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rectS.left, rectS.top, rectS.width(), rectS.height(), matrix, true);
        if (bitmapCreateBitmap == bitmap) {
            bitmapCreateBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        Bitmap bitmap2 = bitmapCreateBitmap;
        return i10 % 90 != 0 ? i(bitmap2, fArr, rectS, i10, z10, i11, i12) : bitmap2;
    }

    private static Bitmap i(Bitmap bitmap, float[] fArr, Rect rect, int i10, boolean z10, int i11, int i12) {
        int iAbs;
        int iAbs2;
        int iAbs3;
        if (i10 % 90 == 0) {
            return bitmap;
        }
        double radians = Math.toRadians(i10);
        int i13 = (i10 < 90 || (i10 > 180 && i10 < 270)) ? rect.left : rect.right;
        int iAbs4 = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= fArr.length) {
                iAbs = 0;
                iAbs2 = 0;
                iAbs3 = 0;
                break;
            }
            float f10 = fArr[i14];
            if (f10 >= i13 - 1 && f10 <= i13 + 1) {
                int i15 = i14 + 1;
                iAbs4 = (int) Math.abs(Math.sin(radians) * ((double) (rect.bottom - fArr[i15])));
                iAbs2 = (int) Math.abs(Math.cos(radians) * ((double) (fArr[i15] - rect.top)));
                iAbs3 = (int) Math.abs(((double) (fArr[i15] - rect.top)) / Math.sin(radians));
                iAbs = (int) Math.abs(((double) (rect.bottom - fArr[i15])) / Math.cos(radians));
                break;
            }
            i14 += 2;
        }
        rect.set(iAbs4, iAbs2, iAbs3 + iAbs4, iAbs + iAbs2);
        if (z10) {
            n(rect, i11, i12);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        if (bitmap != bitmapCreateBitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    private static Bitmap j(ContentResolver contentResolver, Uri uri, BitmapFactory.Options options) {
        do {
            InputStream inputStreamOpenInputStream = null;
            try {
                try {
                    inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, f35708a, options);
                    c(inputStreamOpenInputStream);
                    return bitmapDecodeStream;
                } catch (OutOfMemoryError unused) {
                    options.inSampleSize *= 2;
                    c(inputStreamOpenInputStream);
                }
            } catch (Throwable th2) {
                c(inputStreamOpenInputStream);
                throw th2;
            }
        } while (options.inSampleSize <= 512);
        throw new RuntimeException("Failed to decode image: " + uri);
    }

    private static BitmapFactory.Options k(ContentResolver contentResolver, Uri uri) throws Throwable {
        InputStream inputStreamOpenInputStream;
        try {
            inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStreamOpenInputStream, f35708a, options);
                options.inJustDecodeBounds = false;
                c(inputStreamOpenInputStream);
                return options;
            } catch (Throwable th2) {
                th = th2;
                c(inputStreamOpenInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpenInputStream = null;
        }
    }

    static a l(Context context, Uri uri, int i10, int i11) throws Throwable {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            BitmapFactory.Options optionsK = k(contentResolver, uri);
            int i12 = optionsK.outWidth;
            if (i12 == -1 && optionsK.outHeight == -1) {
                throw new RuntimeException("File is not a picture");
            }
            optionsK.inSampleSize = Math.max(b(i12, optionsK.outHeight, i10, i11), a(optionsK.outWidth, optionsK.outHeight));
            return new a(j(contentResolver, uri, optionsK), optionsK.inSampleSize);
        } catch (Exception e10) {
            throw new RuntimeException("Failed to load sampled bitmap: " + uri + "\r\n" + e10.getMessage(), e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    private static a m(Context context, Uri uri, Rect rect, int i10, int i11, int i12) throws Throwable {
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        int i13;
        InputStream inputStream = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i12 * b(rect.width(), rect.height(), i10, i11);
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream, false);
                do {
                    try {
                        try {
                            a aVar = new a(bitmapRegionDecoderNewInstance.decodeRegion(rect, options), options.inSampleSize);
                            c(inputStreamOpenInputStream);
                            bitmapRegionDecoderNewInstance.recycle();
                            return aVar;
                        } catch (OutOfMemoryError unused) {
                            i13 = options.inSampleSize * 2;
                            options.inSampleSize = i13;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        inputStream = inputStreamOpenInputStream;
                        try {
                            throw new RuntimeException("Failed to load sampled bitmap: " + uri + "\r\n" + e.getMessage(), e);
                        } catch (Throwable th2) {
                            th = th2;
                            c(inputStream);
                            if (bitmapRegionDecoderNewInstance != null) {
                                bitmapRegionDecoderNewInstance.recycle();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = inputStreamOpenInputStream;
                        c(inputStream);
                        if (bitmapRegionDecoderNewInstance != null) {
                            bitmapRegionDecoderNewInstance.recycle();
                        }
                        throw th;
                    }
                } while (i13 <= 512);
                c(inputStreamOpenInputStream);
                if (bitmapRegionDecoderNewInstance != null) {
                    bitmapRegionDecoderNewInstance.recycle();
                }
                return new a(null, 1);
            } catch (Exception e11) {
                e = e11;
                bitmapRegionDecoderNewInstance = null;
            } catch (Throwable th4) {
                th = th4;
                bitmapRegionDecoderNewInstance = null;
            }
        } catch (Exception e12) {
            e = e12;
            bitmapRegionDecoderNewInstance = null;
        } catch (Throwable th5) {
            th = th5;
            bitmapRegionDecoderNewInstance = null;
        }
    }

    private static void n(Rect rect, int i10, int i11) {
        if (i10 != i11 || rect.width() == rect.height()) {
            return;
        }
        if (rect.height() > rect.width()) {
            rect.bottom -= rect.height() - rect.width();
        } else {
            rect.right -= rect.width() - rect.height();
        }
    }

    private static int o() {
        try {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
            int[] iArr = new int[1];
            egl10.eglGetConfigs(eGLDisplayEglGetDisplay, null, 0, iArr);
            int i10 = iArr[0];
            EGLConfig[] eGLConfigArr = new EGLConfig[i10];
            egl10.eglGetConfigs(eGLDisplayEglGetDisplay, eGLConfigArr, i10, iArr);
            int[] iArr2 = new int[1];
            int i11 = 0;
            for (int i12 = 0; i12 < iArr[0]; i12++) {
                egl10.eglGetConfigAttrib(eGLDisplayEglGetDisplay, eGLConfigArr[i12], 12332, iArr2);
                int i13 = iArr2[0];
                if (i11 < i13) {
                    i11 = i13;
                }
            }
            egl10.eglTerminate(eGLDisplayEglGetDisplay);
            return Math.max(i11, 2048);
        } catch (Exception unused) {
            return 2048;
        }
    }

    static float p(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    static float q(float[] fArr) {
        return (v(fArr) + u(fArr)) / 2.0f;
    }

    static float r(float[] fArr) {
        return (p(fArr) + w(fArr)) / 2.0f;
    }

    static Rect s(float[] fArr, int i10, int i11, boolean z10, int i12, int i13) {
        Rect rect = new Rect(Math.round(Math.max(0.0f, u(fArr))), Math.round(Math.max(0.0f, w(fArr))), Math.round(Math.min(i10, v(fArr))), Math.round(Math.min(i11, p(fArr))));
        if (z10) {
            n(rect, i12, i13);
        }
        return rect;
    }

    static float t(float[] fArr) {
        return p(fArr) - w(fArr);
    }

    static float u(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    static float v(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    static float w(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    static float x(float[] fArr) {
        return v(fArr) - u(fArr);
    }

    static Bitmap y(Bitmap bitmap, int i10, int i11, CropImageView.j jVar) {
        Bitmap bitmapCreateScaledBitmap;
        if (i10 > 0 && i11 > 0) {
            try {
                CropImageView.j jVar2 = CropImageView.j.RESIZE_FIT;
                if (jVar == jVar2 || jVar == CropImageView.j.RESIZE_INSIDE || jVar == CropImageView.j.RESIZE_EXACT) {
                    if (jVar == CropImageView.j.RESIZE_EXACT) {
                        bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, false);
                    } else {
                        float width = bitmap.getWidth();
                        float height = bitmap.getHeight();
                        float fMax = Math.max(width / i10, height / i11);
                        bitmapCreateScaledBitmap = (fMax > 1.0f || jVar == jVar2) ? Bitmap.createScaledBitmap(bitmap, (int) (width / fMax), (int) (height / fMax), false) : null;
                    }
                    if (bitmapCreateScaledBitmap != null) {
                        if (bitmapCreateScaledBitmap != bitmap) {
                            bitmap.recycle();
                        }
                        return bitmapCreateScaledBitmap;
                    }
                }
            } catch (Exception e10) {
                Log.w("AIC", "Failed to resize cropped image, return bitmap before resize", e10);
            }
        }
        return bitmap;
    }

    private static Bitmap z(Bitmap bitmap, int i10, boolean z10, boolean z11) {
        if (i10 <= 0 && !z10 && !z11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i10);
        matrix.postScale(z10 ? -1.0f : 1.0f, z11 ? -1.0f : 1.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        if (bitmapCreateBitmap != bitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }
}

package androidx.media3.common.util;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class GlUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f4680a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f4681b = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f4682c = {12445, 13120, 12344, 12344};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f4683d = {12445, 13632, 12344, 12344};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f4684e = {12344};

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class GlException extends Exception {
        public GlException(String str) {
            super(str);
        }
    }

    public static void a() throws GlException {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb2.append("glError: ");
            sb2.append(strGluErrorString);
            z10 = true;
        }
        if (z10) {
            throw new GlException(sb2.toString());
        }
    }

    public static void b(boolean z10, String str) throws GlException {
        if (!z10) {
            throw new GlException(str);
        }
    }

    private static boolean c(String str) {
        String strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static boolean d(Context context) {
        int i10 = c0.f55769a;
        if (i10 < 24) {
            return false;
        }
        if (i10 < 26 && ("samsung".equals(c0.f55771c) || "XT1650".equals(c0.f55772d))) {
            return false;
        }
        if (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return c("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean e() {
        return c("EGL_KHR_surfaceless_context");
    }
}

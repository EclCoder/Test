package m6;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f45288a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f45289b = new char[64];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile Handler f45290c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45291a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f45291a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45291a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45291a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45291a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45291a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static void a() {
        if (!r()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean b(i6.a aVar, i6.a aVar2) {
        if (aVar == null) {
            return aVar2 == null;
        }
        return aVar.G(aVar2);
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private static String e(byte[] bArr, char[] cArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i12 = i10 * 2;
            char[] cArr2 = f45288a;
            cArr[i12] = cArr2[i11 >>> 4];
            cArr[i12 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static Queue f(int i10) {
        return new ArrayDeque(i10);
    }

    public static int g(int i10, int i11, Bitmap.Config config) {
        return i10 * i11 * i(config);
    }

    public static int h(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int i(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i10 = a.f45291a[config.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2 && i10 != 3) {
                return i10 != 4 ? 4 : 8;
            }
        }
        return i11;
    }

    public static List j(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private static Handler k() {
        if (f45290c == null) {
            synchronized (l.class) {
                try {
                    if (f45290c == null) {
                        f45290c = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f45290c;
    }

    public static int l(float f10) {
        return m(f10, 17);
    }

    public static int m(float f10, int i10) {
        return n(Float.floatToIntBits(f10), i10);
    }

    public static int n(int i10, int i11) {
        return (i11 * 31) + i10;
    }

    public static int o(Object obj, int i10) {
        return n(obj == null ? 0 : obj.hashCode(), i10);
    }

    public static int p(boolean z10, int i10) {
        return n(z10 ? 1 : 0, i10);
    }

    public static boolean q() {
        return !r();
    }

    public static boolean r() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean s(int i10) {
        return i10 > 0 || i10 == Integer.MIN_VALUE;
    }

    public static boolean t(int i10, int i11) {
        return s(i10) && s(i11);
    }

    public static void u(Runnable runnable) {
        k().postAtFrontOfQueue(runnable);
    }

    public static void v(Runnable runnable) {
        k().post(runnable);
    }

    public static void w(Runnable runnable) {
        k().removeCallbacks(runnable);
    }

    public static String x(byte[] bArr) {
        String strE;
        char[] cArr = f45289b;
        synchronized (cArr) {
            strE = e(bArr, cArr);
        }
        return strE;
    }
}

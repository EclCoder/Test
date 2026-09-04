package e0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class k extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Class f37012b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Constructor f37013c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f37014d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f37015e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f37016f = false;

    k() {
    }

    private static boolean i(Object obj, String str, int i10, boolean z10) throws NoSuchMethodException {
        l();
        try {
            return ((Boolean) f37014d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Typeface j(Object obj) throws NoSuchMethodException {
        l();
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f37012b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f37015e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private File k(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void l() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f37016f) {
            return;
        }
        f37016f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f37013c = constructor;
        f37012b = cls;
        f37014d = method2;
        f37015e = method;
    }

    private static Object m() throws NoSuchMethodException {
        l();
        try {
            return f37013c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // e0.q
    public Typeface a(Context context, d0.e.b bVar, Resources resources, int i10) throws NoSuchMethodException {
        Object objM = m();
        for (d0.e.c cVar : bVar.a()) {
            File fileE = r.e(context);
            if (fileE == null) {
                return null;
            }
            try {
                if (!r.c(fileE, resources, cVar.b())) {
                    return null;
                }
                if (!i(objM, fileE.getPath(), cVar.e(), cVar.f())) {
                    return null;
                }
                fileE.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileE.delete();
            }
        }
        return j(objM);
    }

    @Override // e0.q
    public Typeface b(Context context, CancellationSignal cancellationSignal, k0.i.b[] bVarArr, int i10) {
        Typeface typefaceD;
        if (bVarArr.length < 1) {
            return null;
        }
        k0.i.b bVarH = h(bVarArr, i10);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarH.d(), CampaignEx.JSON_KEY_AD_R, cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                File fileK = k(parcelFileDescriptorOpenFileDescriptor);
                if (fileK == null || !fileK.canRead()) {
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        typefaceD = super.d(context, fileInputStream);
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } else {
                    typefaceD = Typeface.createFromFile(fileK);
                }
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceD;
            } catch (Throwable th4) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (IOException unused) {
            return null;
        }
    }
}

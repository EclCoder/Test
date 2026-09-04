package e0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.collection.u;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class l extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f37017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Constructor f37018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Method f37019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Method f37020e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            method2 = null;
        }
        f37018c = constructor;
        f37017b = cls;
        f37019d = method2;
        f37020e = method;
    }

    l() {
    }

    private static boolean i(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f37019d.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface j(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f37017b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f37020e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean k() {
        Method method = f37019d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object l() {
        try {
            return f37018c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // e0.q
    public Typeface a(Context context, d0.e.b bVar, Resources resources, int i10) {
        Object objL = l();
        if (objL == null) {
            return null;
        }
        for (d0.e.c cVar : bVar.a()) {
            ByteBuffer byteBufferB = r.b(context, resources, cVar.b());
            if (byteBufferB == null || !i(objL, byteBufferB, cVar.c(), cVar.e(), cVar.f())) {
                return null;
            }
        }
        return j(objL);
    }

    @Override // e0.q
    public Typeface b(Context context, CancellationSignal cancellationSignal, k0.i.b[] bVarArr, int i10) {
        Object objL = l();
        if (objL == null) {
            return null;
        }
        u uVar = new u();
        for (k0.i.b bVar : bVarArr) {
            Uri uriD = bVar.d();
            ByteBuffer byteBufferF = (ByteBuffer) uVar.get(uriD);
            if (byteBufferF == null) {
                byteBufferF = r.f(context, cancellationSignal, uriD);
                uVar.put(uriD, byteBufferF);
            }
            if (byteBufferF == null || !i(objL, byteBufferF, bVar.c(), bVar.f(), bVar.g())) {
                return null;
            }
        }
        Typeface typefaceJ = j(objL);
        if (typefaceJ == null) {
            return null;
        }
        return Typeface.create(typefaceJ, i10);
    }
}

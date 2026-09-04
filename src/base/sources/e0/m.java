package e0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class m extends k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final Class f37021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final Constructor f37022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final Method f37023i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final Method f37024j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final Method f37025k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected final Method f37026l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final Method f37027m;

    public m() {
        Class clsW;
        Constructor constructorX;
        Method methodT;
        Method methodU;
        Method methodY;
        Method methodS;
        Method methodV;
        try {
            clsW = w();
            constructorX = x(clsW);
            methodT = t(clsW);
            methodU = u(clsW);
            methodY = y(clsW);
            methodS = s(clsW);
            methodV = v(clsW);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e10.getClass().getName(), e10);
            clsW = null;
            constructorX = null;
            methodT = null;
            methodU = null;
            methodY = null;
            methodS = null;
            methodV = null;
        }
        this.f37021g = clsW;
        this.f37022h = constructorX;
        this.f37023i = methodT;
        this.f37024j = methodU;
        this.f37025k = methodY;
        this.f37026l = methodS;
        this.f37027m = methodV;
    }

    private Object m() {
        try {
            return this.f37022h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void n(Object obj) {
        try {
            this.f37026l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean o(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f37023i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean p(Object obj, ByteBuffer byteBuffer, int i10, int i11, int i12) {
        try {
            return ((Boolean) this.f37024j.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Integer.valueOf(i12))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean q(Object obj) {
        try {
            return ((Boolean) this.f37025k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean r() {
        if (this.f37023i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f37023i != null;
    }

    @Override // e0.k, e0.q
    public Typeface a(Context context, d0.e.b bVar, Resources resources, int i10) {
        if (!r()) {
            return super.a(context, bVar, resources, i10);
        }
        Object objM = m();
        if (objM == null) {
            return null;
        }
        d0.e.c[] cVarArrA = bVar.a();
        int length = cVarArrA.length;
        int i11 = 0;
        while (i11 < length) {
            d0.e.c cVar = cVarArrA[i11];
            Context context2 = context;
            if (!o(context2, objM, cVar.a(), cVar.c(), cVar.e(), cVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.d()))) {
                n(objM);
                return null;
            }
            i11++;
            context = context2;
        }
        if (q(objM)) {
            return j(objM);
        }
        return null;
    }

    @Override // e0.k, e0.q
    public Typeface b(Context context, CancellationSignal cancellationSignal, k0.i.b[] bVarArr, int i10) {
        Typeface typefaceJ;
        Object obj;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!r()) {
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
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(bVarH.f()).setItalic(bVarH.g()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th2) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map mapH = r.h(context, bVarArr, cancellationSignal);
        Object objM = m();
        if (objM == null) {
            return null;
        }
        int length = bVarArr.length;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < length) {
            k0.i.b bVar = bVarArr[i11];
            ByteBuffer byteBuffer = (ByteBuffer) mapH.get(bVar.d());
            if (byteBuffer == null) {
                obj = objM;
            } else {
                boolean zP = p(objM, byteBuffer, bVar.c(), bVar.f(), bVar.g() ? 1 : 0);
                obj = objM;
                if (!zP) {
                    n(obj);
                    return null;
                }
                z10 = true;
            }
            i11++;
            objM = obj;
            z10 = z10;
        }
        Object obj2 = objM;
        if (!z10) {
            n(obj2);
            return null;
        }
        if (q(obj2) && (typefaceJ = j(obj2)) != null) {
            return Typeface.create(typefaceJ, i10);
        }
        return null;
    }

    @Override // e0.q
    public /* bridge */ /* synthetic */ Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i10) {
        return super.c(context, cancellationSignal, list, i10);
    }

    @Override // e0.q
    public Typeface e(Context context, Resources resources, int i10, String str, int i11) {
        if (!r()) {
            return super.e(context, resources, i10, str, i11);
        }
        Object objM = m();
        if (objM == null) {
            return null;
        }
        if (!o(context, objM, str, 0, -1, -1, null)) {
            n(objM);
            return null;
        }
        if (q(objM)) {
            return j(objM);
        }
        return null;
    }

    protected Typeface j(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f37021g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f37027m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method s(Class cls) {
        return cls.getMethod("abortCreation", null);
    }

    protected Method t(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    protected Method u(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method v(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class w() {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor x(Class cls) {
        return cls.getConstructor(null);
    }

    protected Method y(Class cls) {
        return cls.getMethod("freeze", null);
    }
}

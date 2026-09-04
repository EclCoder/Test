package d0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f36065a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f36066b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f36067c = new Object();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ColorStateList f36068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Configuration f36069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f36070c;

        a(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f36068a = colorStateList;
            this.f36069b = configuration;
            this.f36070c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Resources f36071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Resources.Theme f36072b;

        b(Resources resources, Resources.Theme theme) {
            this.f36071a = resources;
            this.f36072b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.f36071a.equals(bVar.f36071a) && m0.b.a(this.f36072b, bVar.f36072b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return m0.b.b(this.f36071a, this.f36072b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static abstract class c {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(final int i10, Handler handler) {
            e(handler).post(new Runnable() { // from class: d0.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36078a.f(i10);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: d0.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36076a.g(typeface);
                }
            });
        }

        public abstract void f(int i10);

        public abstract void g(Typeface typeface);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static final class d {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final Object f36073a = new Object();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static Method f36074b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static boolean f36075c;

            /* JADX WARN: Code duplicated, block: B:31:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            static void a(Resources.Theme theme) {
                Method method;
                synchronized (f36073a) {
                    if (f36075c) {
                        method = f36074b;
                        if (method != null) {
                            method.invoke(theme, null);
                        }
                    } else {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            f36074b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e10) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e10);
                        }
                        f36075c = true;
                        method = f36074b;
                        if (method != null) {
                            try {
                                method.invoke(theme, null);
                            } catch (IllegalAccessException | InvocationTargetException e11) {
                                Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e11);
                                f36074b = null;
                            }
                        }
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    private static void a(b bVar, int i10, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f36067c) {
            try {
                WeakHashMap weakHashMap = f36066b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(bVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(bVar, sparseArray);
                }
                sparseArray.append(i10, new a(colorStateList, bVar.f36071a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.f36070c == r5.hashCode()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.res.ColorStateList b(d0.h.b r5, int r6) {
        /*
            java.lang.Object r0 = d0.h.f36067c
            monitor-enter(r0)
            java.util.WeakHashMap r1 = d0.h.f36066b     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            d0.h$a r2 = (d0.h.a) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.f36069b     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.f36071a     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.f36072b     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.f36070c     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.f36070c     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.f36068a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.h.b(d0.h$b, int):android.content.res.ColorStateList");
    }

    public static Typeface c(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i10, new TypedValue(), 0, null, null, false, true);
    }

    public static ColorStateList d(Resources resources, int i10, Resources.Theme theme) {
        b bVar = new b(resources, theme);
        ColorStateList colorStateListB = b(bVar, i10);
        if (colorStateListB != null) {
            return colorStateListB;
        }
        ColorStateList colorStateListK = k(resources, i10, theme);
        if (colorStateListK == null) {
            return resources.getColorStateList(i10, theme);
        }
        a(bVar, i10, colorStateListK, theme);
        return colorStateListK;
    }

    public static Drawable e(Resources resources, int i10, Resources.Theme theme) {
        return resources.getDrawable(i10, theme);
    }

    public static Drawable f(Resources resources, int i10, int i11, Resources.Theme theme) {
        return resources.getDrawableForDensity(i10, i11, theme);
    }

    public static Typeface g(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i10, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface h(Context context, int i10, TypedValue typedValue, int i11, c cVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i10, typedValue, i11, cVar, null, true, false);
    }

    public static void i(Context context, int i10, c cVar, Handler handler) {
        m0.g.g(cVar);
        if (context.isRestricted()) {
            cVar.c(-4, handler);
        } else {
            m(context, i10, new TypedValue(), 0, cVar, handler, false, false);
        }
    }

    private static TypedValue j() {
        ThreadLocal threadLocal = f36065a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList k(Resources resources, int i10, Resources.Theme theme) {
        if (l(resources, i10)) {
            return null;
        }
        try {
            return d0.c.a(resources, resources.getXml(i10), theme);
        } catch (Exception e10) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            return null;
        }
    }

    private static boolean l(Resources resources, int i10) {
        TypedValue typedValueJ = j();
        resources.getValue(i10, typedValueJ, true);
        int i11 = typedValueJ.type;
        return i11 >= 28 && i11 <= 31;
    }

    private static Typeface m(Context context, int i10, TypedValue typedValue, int i11, c cVar, Handler handler, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        Typeface typefaceN = n(context, resources, typedValue, i10, i11, cVar, handler, z10, z11);
        if (typefaceN != null || cVar != null || z11) {
            return typefaceN;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b4  */
    private static Typeface n(Context context, Resources resources, TypedValue typedValue, int i10, int i11, c cVar, Handler handler, boolean z10, boolean z11) {
        String str = dOIDCKnIR.vPZO;
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i10) + "\" (" + Integer.toHexString(i10) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            if (cVar != null) {
                cVar.c(-3, handler);
            }
            return null;
        }
        Typeface typefaceG = e0.j.g(resources, i10, string, typedValue.assetCookie, i11);
        if (typefaceG != null) {
            if (cVar != null) {
                cVar.d(typefaceG, handler);
            }
            return typefaceG;
        }
        if (z11) {
            return null;
        }
        try {
            if (!string.toLowerCase().endsWith(".xml")) {
                Typeface typefaceE = e0.j.e(context, resources, i10, string, typedValue.assetCookie, i11);
                if (cVar != null) {
                    if (typefaceE != null) {
                        cVar.d(typefaceE, handler);
                        return typefaceE;
                    }
                    cVar.c(-3, handler);
                }
                return typefaceE;
            }
            e.a aVarB = e.b(resources.getXml(i10), resources);
            if (aVarB == null) {
                Log.e(str, "Failed to find font-family tag");
                if (cVar != null) {
                    cVar.c(-3, handler);
                }
                return null;
            }
            try {
                return e0.j.d(context, aVarB, resources, i10, string, typedValue.assetCookie, i11, cVar, handler, z10);
            } catch (IOException e10) {
                e = e10;
                string = string;
                Log.e(str, "Failed to read xml resource " + string, e);
                if (cVar != null) {
                    cVar.c(-3, handler);
                }
                return null;
            } catch (XmlPullParserException e11) {
                e = e11;
                string = string;
                Log.e(str, "Failed to parse xml resource " + string, e);
                if (cVar != null) {
                    cVar.c(-3, handler);
                }
                return null;
            }
        } catch (IOException e12) {
            e = e12;
        } catch (XmlPullParserException e13) {
            e = e13;
        }
    }
}

package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Field f828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class f830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Field f832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Field f834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f835h;

    static void a(Resources resources) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        b(resources);
    }

    private static void b(Resources resources) {
        Object obj;
        if (!f835h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f834g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
            }
            f835h = true;
        }
        Field field = f834g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e11) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f829b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f828a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e12) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
            }
            f829b = true;
        }
        Field field2 = f828a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e13) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
            }
        }
        if (obj2 != null) {
            c(obj2);
        }
    }

    private static void c(Object obj) {
        LongSparseArray longSparseArray;
        if (!f831d) {
            try {
                f830c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f831d = true;
        }
        Class cls = f830c;
        if (cls == null) {
            return;
        }
        if (!f833f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f832e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f833f = true;
        }
        Field field = f832e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}

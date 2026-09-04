package z;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: z.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class C0885a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f58195a;

        static {
            int[] iArr = new int[androidx.constraintlayout.widget.a.EnumC0023a.values().length];
            f58195a = iArr;
            try {
                iArr[androidx.constraintlayout.widget.a.EnumC0023a.INT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58195a[androidx.constraintlayout.widget.a.EnumC0023a.FLOAT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58195a[androidx.constraintlayout.widget.a.EnumC0023a.COLOR_DRAWABLE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f58195a[androidx.constraintlayout.widget.a.EnumC0023a.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f58195a[androidx.constraintlayout.widget.a.EnumC0023a.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f58195a[androidx.constraintlayout.widget.a.EnumC0023a.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f58195a[androidx.constraintlayout.widget.a.EnumC0023a.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static int a(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    public static void b(androidx.constraintlayout.widget.a aVar, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + aVar.c();
        try {
            int i10 = C0885a.f58195a[aVar.d().ordinal()];
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            boolean z10 = true;
            switch (i10) {
                case 1:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int iA = (a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iA);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + aVar.c());
                case 6:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    if (fArr[0] <= 0.5f) {
                        z10 = false;
                    }
                    method2.invoke(view, Boolean.valueOf(z10));
                    return;
                case 7:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e10) {
            Log.e("CustomSupport", "Cannot access method " + str + " on View \"" + androidx.constraintlayout.motion.widget.a.d(view) + "\"", e10);
        } catch (NoSuchMethodException e11) {
            Log.e("CustomSupport", "No method " + str + " on View \"" + androidx.constraintlayout.motion.widget.a.d(view) + "\"", e11);
        } catch (InvocationTargetException e12) {
            Log.e("CustomSupport", "Cannot invoke method " + str + " on View \"" + androidx.constraintlayout.motion.widget.a.d(view) + "\"", e12);
        }
    }
}

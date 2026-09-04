package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f1750a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f1751b = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Rect f1752c = new Rect();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final boolean f1753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Method f1754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Field f1755c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Field f1756d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Field f1757e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Field f1758f;

        /* JADX WARN: Code duplicated, block: B:25:0x004a  */
        /* JADX WARN: Code duplicated, block: B:26:0x0057  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z10;
            try {
                Class<?> cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", null);
                try {
                    field = cls.getField(TtmlNode.LEFT);
                    try {
                        field2 = cls.getField("top");
                        try {
                            field3 = cls.getField(TtmlNode.RIGHT);
                            try {
                                field4 = cls.getField("bottom");
                                z10 = true;
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                                field4 = null;
                                z10 = false;
                            }
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                            field3 = null;
                        }
                    } catch (ClassNotFoundException unused3) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z10 = false;
                        if (z10) {
                            f1754b = method;
                            f1755c = field;
                            f1756d = field2;
                            f1757e = field3;
                            f1758f = field4;
                            f1753a = true;
                            return;
                        }
                        f1754b = null;
                        f1755c = null;
                        f1756d = null;
                        f1757e = null;
                        f1758f = null;
                        f1753a = false;
                    } catch (NoSuchFieldException unused4) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z10 = false;
                        if (z10) {
                            f1754b = method;
                            f1755c = field;
                            f1756d = field2;
                            f1757e = field3;
                            f1758f = field4;
                            f1753a = true;
                            return;
                        }
                        f1754b = null;
                        f1755c = null;
                        f1756d = null;
                        f1757e = null;
                        f1758f = null;
                        f1753a = false;
                    } catch (NoSuchMethodException unused5) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z10 = false;
                        if (z10) {
                            f1754b = method;
                            f1755c = field;
                            f1756d = field2;
                            f1757e = field3;
                            f1758f = field4;
                            f1753a = true;
                            return;
                        }
                        f1754b = null;
                        f1755c = null;
                        f1756d = null;
                        f1757e = null;
                        f1758f = null;
                        f1753a = false;
                    }
                } catch (ClassNotFoundException unused6) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                        f1754b = method;
                        f1755c = field;
                        f1756d = field2;
                        f1757e = field3;
                        f1758f = field4;
                        f1753a = true;
                        return;
                    }
                    f1754b = null;
                    f1755c = null;
                    f1756d = null;
                    f1757e = null;
                    f1758f = null;
                    f1753a = false;
                } catch (NoSuchFieldException unused7) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                        f1754b = method;
                        f1755c = field;
                        f1756d = field2;
                        f1757e = field3;
                        f1758f = field4;
                        f1753a = true;
                        return;
                    }
                    f1754b = null;
                    f1755c = null;
                    f1756d = null;
                    f1757e = null;
                    f1758f = null;
                    f1753a = false;
                } catch (NoSuchMethodException unused8) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                        f1754b = method;
                        f1755c = field;
                        f1756d = field2;
                        f1757e = field3;
                        f1758f = field4;
                        f1753a = true;
                        return;
                    }
                    f1754b = null;
                    f1755c = null;
                    f1756d = null;
                    f1757e = null;
                    f1758f = null;
                    f1753a = false;
                }
            } catch (ClassNotFoundException unused9) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused10) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused11) {
                method = null;
                field = null;
            }
            if (z10) {
                f1754b = method;
                f1755c = field;
                f1756d = field2;
                f1757e = field3;
                f1758f = field4;
                f1753a = true;
                return;
            }
            f1754b = null;
            f1755c = null;
            f1756d = null;
            f1757e = null;
            f1758f = null;
            f1753a = false;
        }

        static Rect a(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f1753a) {
                try {
                    Object objInvoke = f1754b.invoke(drawable, null);
                    if (objInvoke != null) {
                        return new Rect(f1755c.getInt(objInvoke), f1756d.getInt(objInvoke), f1757e.getInt(objInvoke), f1758f.getInt(objInvoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return y.f1752c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b {
        static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static boolean a(Drawable drawable) {
        return true;
    }

    static void b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || i10 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        c(drawable);
    }

    private static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1750a);
        } else {
            drawable.setState(f1751b);
        }
        drawable.setState(state);
    }

    public static Rect d(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return a.a(f0.a.q(drawable));
        }
        Insets insetsA = b.a(drawable);
        return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
    }

    public static PorterDuff.Mode e(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}

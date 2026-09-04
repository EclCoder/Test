package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c0 f7356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Property f7357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Property f7358c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(b0.b(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            b0.e(view, f10.floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f7356a = new g0();
        } else {
            f7356a = new f0();
        }
        f7357b = new a(Float.class, "translationAlpha");
        f7358c = new b(Rect.class, "clipBounds");
    }

    static void a(View view) {
        f7356a.a(view);
    }

    static float b(View view) {
        return f7356a.b(view);
    }

    static void c(View view) {
        f7356a.c(view);
    }

    static void d(View view, int i10, int i11, int i12, int i13) {
        f7356a.d(view, i10, i11, i12, i13);
    }

    static void e(View view, float f10) {
        f7356a.e(view, f10);
    }

    static void f(View view, int i10) {
        f7356a.f(view, i10);
    }

    static void g(View view, Matrix matrix) {
        f7356a.g(view, matrix);
    }

    static void h(View view, Matrix matrix) {
        f7356a.h(view, matrix);
    }
}

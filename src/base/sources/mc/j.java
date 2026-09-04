package mc;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class j {
    static e a(int i10) {
        if (i10 != 0) {
            return i10 != 1 ? b() : new f();
        }
        return new n();
    }

    static e b() {
        return new n();
    }

    static g c() {
        return new g();
    }

    public static void d(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof i) {
            ((i) background).k0(f10);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof i) {
            f(view, (i) background);
        }
    }

    public static void f(View view, i iVar) {
        if (iVar.b0()) {
            iVar.q0(c0.k(view));
        }
    }
}

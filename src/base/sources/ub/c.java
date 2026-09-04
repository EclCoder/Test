package ub;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c {
    public static void a(a aVar, View view) {
        b(aVar, view, null);
    }

    public static void b(a aVar, View view, FrameLayout frameLayout) {
        f(aVar, view, frameLayout);
        if (aVar.k() != null) {
            aVar.k().setForeground(aVar);
        } else {
            view.getOverlay().add(aVar);
        }
    }

    public static SparseArray c(Context context, s sVar) {
        SparseArray sparseArray = new SparseArray(sVar.size());
        for (int i10 = 0; i10 < sVar.size(); i10++) {
            int iKeyAt = sVar.keyAt(i10);
            b.a aVar = (b.a) sVar.valueAt(i10);
            sparseArray.put(iKeyAt, aVar != null ? a.f(context, aVar) : null);
        }
        return sparseArray;
    }

    public static s d(SparseArray sparseArray) {
        s sVar = new s();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            a aVar = (a) sparseArray.valueAt(i10);
            sVar.put(iKeyAt, aVar != null ? aVar.u() : null);
        }
        return sVar;
    }

    public static void e(a aVar, View view) {
        if (aVar == null) {
            return;
        }
        if (aVar.k() != null) {
            aVar.k().setForeground(null);
        } else {
            view.getOverlay().remove(aVar);
        }
    }

    public static void f(a aVar, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.Q(view, frameLayout);
    }

    public static void g(Rect rect, float f10, float f11, float f12, float f13) {
        rect.set((int) (f10 - f12), (int) (f11 - f13), (int) (f10 + f12), (int) (f11 + f13));
    }
}

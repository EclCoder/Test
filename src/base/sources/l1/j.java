package l1;

import gl.j0;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final float a(androidx.collection.h xValues, androidx.collection.h yValues, float f10) {
        kotlin.jvm.internal.s.h(xValues, "xValues");
        kotlin.jvm.internal.s.h(yValues, "yValues");
        if (0.0f > f10 || f10 > 1.0f) {
            throw new IllegalArgumentException(("Invalid progress: " + f10).toString());
        }
        Iterator it = yl.g.m(0, xValues.f1910b).iterator();
        while (it.hasNext()) {
            int iNextInt = ((j0) it).nextInt();
            int i10 = iNextInt + 1;
            if (b(f10, xValues.b(iNextInt), xValues.b(i10 % xValues.c()))) {
                int iC = i10 % xValues.c();
                float fJ = y.j(xValues.b(iC) - xValues.b(iNextInt), 1.0f);
                return y.j(yValues.b(iNextInt) + (y.j(yValues.b(iC) - yValues.b(iNextInt), 1.0f) * (fJ < 0.001f ? 0.5f : y.j(f10 - xValues.b(iNextInt), 1.0f) / fJ)), 1.0f);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final boolean b(float f10, float f11, float f12) {
        if (f12 >= f11) {
            return f11 <= f10 && f10 <= f12;
        }
        return f10 >= f11 || f10 <= f12;
    }

    public static final void c(androidx.collection.h p10) {
        int i10;
        kotlin.jvm.internal.s.h(p10, "p");
        Boolean boolValueOf = Boolean.TRUE;
        float[] fArr = p10.f1909a;
        int i11 = p10.f1910b;
        int i12 = 0;
        while (true) {
            boolean z10 = true;
            if (i12 >= i11) {
                break;
            }
            float f10 = fArr[i12];
            if (!boolValueOf.booleanValue() || 0.0f > f10 || f10 > 1.0f) {
                z10 = false;
            }
            boolValueOf = Boolean.valueOf(z10);
            i12++;
        }
        if (!boolValueOf.booleanValue()) {
            throw new IllegalArgumentException(("FloatMapping - Progress outside of range: " + androidx.collection.h.e(p10, null, null, null, 0, null, 31, null)).toString());
        }
        Iterable iterableM = yl.g.m(1, p10.c());
        if ((iterableM instanceof Collection) && ((Collection) iterableM).isEmpty()) {
            i10 = 0;
        } else {
            Iterator it = iterableM.iterator();
            i10 = 0;
            while (it.hasNext()) {
                int iNextInt = ((j0) it).nextInt();
                if (p10.b(iNextInt) < p10.b(iNextInt - 1) && (i10 = i10 + 1) < 0) {
                    gl.r.t();
                }
            }
        }
        if (i10 <= 1) {
            return;
        }
        throw new IllegalArgumentException(("FloatMapping - Progress wraps more than once: " + androidx.collection.h.e(p10, null, null, null, 0, null, 31, null)).toString());
    }
}

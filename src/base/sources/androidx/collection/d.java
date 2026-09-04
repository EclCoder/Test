package androidx.collection;

import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final void a(b bVar, int i10) {
        kotlin.jvm.internal.s.h(bVar, "<this>");
        bVar.m(new int[i10]);
        bVar.k(new Object[i10]);
    }

    public static final int b(b bVar, int i10) {
        kotlin.jvm.internal.s.h(bVar, "<this>");
        try {
            return s.a.a(bVar.d(), bVar.g(), i10);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final int c(b bVar, Object obj, int i10) {
        kotlin.jvm.internal.s.h(bVar, "<this>");
        int iG = bVar.g();
        if (iG == 0) {
            return -1;
        }
        int iB = b(bVar, i10);
        if (iB < 0 || kotlin.jvm.internal.s.c(obj, bVar.b()[iB])) {
            return iB;
        }
        int i11 = iB + 1;
        while (i11 < iG && bVar.d()[i11] == i10) {
            if (kotlin.jvm.internal.s.c(obj, bVar.b()[i11])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iB - 1; i12 >= 0 && bVar.d()[i12] == i10; i12--) {
            if (kotlin.jvm.internal.s.c(obj, bVar.b()[i12])) {
                return i12;
            }
        }
        return ~i11;
    }

    public static final int d(b bVar) {
        kotlin.jvm.internal.s.h(bVar, "<this>");
        return c(bVar, null, 0);
    }
}

package ki;

import fl.q;
import gl.j;
import gl.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.s;
import yl.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private final byte[] c(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        byte b10 = bArr[i10];
        arrayList.add(Byte.valueOf(b10));
        if (((b10 >>> 2) & 1) == 1) {
            arrayList.add(Byte.valueOf(bArr[i10 + 1]));
        }
        return r.D0(arrayList);
    }

    private final q d(byte[] bArr, int i10) {
        byte b10;
        long j10 = 0;
        int i11 = 0;
        do {
            b10 = bArr[i10 + i11];
            j10 |= (((long) b10) & 127) << (i11 * 7);
            i11++;
        } while ((b10 & 128) != 0);
        return new q(Long.valueOf(j10), Integer.valueOf(i11));
    }

    public final c a(byte b10) {
        Object next;
        int i10 = (b10 & 120) >>> 3;
        Iterator<E> it = c.g().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((c) next).h() != i10);
        c cVar = (c) next;
        return cVar == null ? c.RESERVED : cVar;
    }

    public final List b(byte[] av1Data) {
        s.h(av1Data, "av1Data");
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (length < av1Data.length) {
            byte[] bArrC = c(av1Data, length);
            int length2 = length + bArrC.length;
            q qVarD = d(av1Data, length2);
            byte[] bArrP0 = j.p0(av1Data, g.m(length2, ((Number) qVarD.i()).intValue() + length2));
            int length3 = length2 + bArrP0.length;
            byte[] bArrP1 = j.p0(av1Data, g.m(length3, ((int) ((Number) qVarD.h()).longValue()) + length3));
            length = length3 + bArrP1.length;
            arrayList.add(new b(bArrC, bArrP0, bArrP1));
        }
        return arrayList;
    }
}

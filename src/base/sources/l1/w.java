package l1;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import gl.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static final u a(u.a aVar) {
        kotlin.jvm.internal.s.h(aVar, "<this>");
        return d(aVar, 0, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public static final u b(u.a aVar, int i10) {
        kotlin.jvm.internal.s.h(aVar, "<this>");
        return d(aVar, i10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public static final u c(u.a aVar, int i10, float f10, float f11, float f12) {
        kotlin.jvm.internal.s.h(aVar, "<this>");
        if (i10 >= 3) {
            return v.d(i10, f10 / ((float) Math.cos(y.g() / i10)), f11, f12, new c(f10, 0.0f, 2, null), null, 32, null);
        }
        throw new IllegalArgumentException("Circle must have at least three vertices");
    }

    public static /* synthetic */ u d(u.a aVar, int i10, float f10, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8;
        }
        if ((i11 & 2) != 0) {
            f10 = 1.0f;
        }
        if ((i11 & 4) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 8) != 0) {
            f12 = 0.0f;
        }
        return c(aVar, i10, f10, f11, f12);
    }

    public static final u e(u.a aVar, float f10, float f11, c rounding, List list, float f12, float f13) {
        kotlin.jvm.internal.s.h(aVar, "<this>");
        kotlin.jvm.internal.s.h(rounding, "rounding");
        float f14 = 2;
        float f15 = f10 / f14;
        float f16 = f12 - f15;
        float f17 = f11 / f14;
        float f18 = f13 - f17;
        float f19 = f15 + f12;
        float f20 = f17 + f13;
        return v.c(new float[]{f19, f20, f16, f20, f16, f18, f19, f18}, rounding, list, f12, f13);
    }

    public static final u f(u.a aVar, int i10, float f10, float f11, c rounding) {
        kotlin.jvm.internal.s.h(aVar, "<this>");
        kotlin.jvm.internal.s.h(rounding, "rounding");
        return h(aVar, i10, f10, f11, rounding, null, null, 0.0f, 0.0f, PsExtractor.VIDEO_STREAM_MASK, null);
    }

    public static final u g(u.a aVar, int i10, float f10, float f11, c rounding, c cVar, List list, float f12, float f13) {
        kotlin.jvm.internal.s.h(aVar, "<this>");
        kotlin.jvm.internal.s.h(rounding, "rounding");
        if (f10 <= 0.0f || f11 <= 0.0f) {
            throw new IllegalArgumentException("Star radii must both be greater than 0");
        }
        if (f11 >= f10) {
            throw new IllegalArgumentException("innerRadius must be less than radius");
        }
        if (list == null && cVar != null) {
            yl.f fVarM = yl.g.m(0, i10);
            list = new ArrayList();
            Iterator it = fVarM.iterator();
            while (it.hasNext()) {
                ((j0) it).nextInt();
                gl.r.z(list, gl.r.o(rounding, cVar));
            }
        }
        return v.c(i(i10, f10, f11, f12, f13), rounding, list, f12, f13);
    }

    public static /* synthetic */ u h(u.a aVar, int i10, float f10, float f11, c cVar, c cVar2, List list, float f12, float f13, int i11, Object obj) {
        return g(aVar, i10, (i11 & 2) != 0 ? 1.0f : f10, (i11 & 4) != 0 ? 0.5f : f11, (i11 & 8) != 0 ? c.f43737d : cVar, (i11 & 16) != 0 ? null : cVar2, (i11 & 32) == 0 ? list : null, (i11 & 64) != 0 ? 0.0f : f12, (i11 & 128) != 0 ? 0.0f : f13);
    }

    private static final float[] i(int i10, float f10, float f11, float f12, float f13) {
        float[] fArr = new float[i10 * 4];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            float f14 = i10;
            long jL = y.l(f10, (y.g() / f14) * 2 * i12, 0L, 4, null);
            fArr[i11] = p.g(jL) + f12;
            fArr[i11 + 1] = p.h(jL) + f13;
            long jL2 = y.l(f11, (y.g() / f14) * ((i12 * 2) + 1), 0L, 4, null);
            int i13 = i11 + 3;
            fArr[i11 + 2] = p.g(jL2) + f12;
            i11 += 4;
            fArr[i13] = p.h(jL2) + f13;
        }
        return fArr;
    }
}

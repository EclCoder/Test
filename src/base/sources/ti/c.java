package ti;

import fl.q;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c {
    public static q a(boolean z10, boolean z11) {
        return new q(Float.valueOf(z10 ? -1.0f : 1.0f), Float.valueOf(z11 ? -1.0f : 1.0f));
    }

    public static si.b b(a aVar, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 0;
        if (aVar == a.NONE) {
            return new si.b(0, 0, i10, i11);
        }
        float f10 = i12 / i13;
        float f11 = i10 / i11;
        if (aVar == a.Adjust) {
            if (f10 > f11) {
                i14 = (i13 * i10) / i12;
                i15 = (i14 - i11) / (-2);
                i11 = i14;
            } else {
                i16 = (i12 * i11) / i13;
                i17 = (i16 - i10) / (-2);
                i18 = i17;
                i15 = 0;
                i10 = i16;
            }
        } else if (f10 > f11) {
            i16 = (i12 * i11) / i13;
            i17 = (i16 - i10) / (-2);
            i18 = i17;
            i15 = 0;
            i10 = i16;
        } else {
            i14 = (i13 * i10) / i12;
            i15 = (i14 - i11) / (-2);
            i11 = i14;
        }
        return new si.b(i18, i15, i10, i11);
    }

    public static si.b c(int i10, int i11, boolean z10) {
        float f10 = i10;
        float f11 = i11;
        float f12 = f10 / f11;
        if (f12 >= 1.0f) {
            if (!z10) {
                return new si.b(0, 0, i10, i11);
            }
            int i12 = (int) (f11 / f12);
            return new si.b((i10 - i12) / 2, 0, i12, i11);
        }
        if (z10) {
            return new si.b(0, 0, i10, i11);
        }
        int i13 = (int) (f10 * f12);
        return new si.b(0, (i11 - i13) / 2, i10, i13);
    }
}

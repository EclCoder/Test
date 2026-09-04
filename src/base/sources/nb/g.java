package nb;

import com.google.common.collect.e0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g {
    public static String b(lb.r rVar) {
        ob.a.a(rVar != null);
        int iK = ob.y.k(rVar.getSelectedFormat().f18868l);
        if (iK == -1) {
            iK = ob.y.k(rVar.getSelectedFormat().f18867k);
        }
        if (iK == 1) {
            return "a";
        }
        if (iK == 2) {
            return "v";
        }
        return null;
    }

    public abstract e0 a();

    public abstract g c(long j10);

    public abstract g d(String str);
}

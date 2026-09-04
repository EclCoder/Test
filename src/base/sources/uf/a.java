package uf;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a implements c {
    @Override // uf.c
    public int a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 25) {
            return 2005;
        }
        return i10 > 25 ? 2038 : 2002;
    }
}

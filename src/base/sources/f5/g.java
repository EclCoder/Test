package f5;

import android.content.Context;
import android.os.Build;
import androidx.work.m;
import i5.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class g extends c {
    public g(Context context, k5.a aVar) {
        super(g5.g.c(context, aVar).d());
    }

    @Override // f5.c
    boolean b(p pVar) {
        if (pVar.f41049j.b() != m.UNMETERED) {
            return Build.VERSION.SDK_INT >= 30 && pVar.f41049j.b() == m.TEMPORARILY_UNMETERED;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f5.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(e5.b bVar) {
        return !bVar.a() || bVar.b();
    }
}

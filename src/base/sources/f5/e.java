package f5;

import android.content.Context;
import android.os.Build;
import androidx.work.l;
import androidx.work.m;
import i5.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class e extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f38248e = l.f("NetworkMeteredCtrlr");

    public e(Context context, k5.a aVar) {
        super(g5.g.c(context, aVar).d());
    }

    @Override // f5.c
    boolean b(p pVar) {
        return pVar.f41049j.b() == m.METERED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f5.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(e5.b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            return (bVar.a() && bVar.b()) ? false : true;
        }
        l.c().a(f38248e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !bVar.a();
    }
}

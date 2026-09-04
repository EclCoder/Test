package f5;

import android.content.Context;
import androidx.work.l;
import androidx.work.m;
import i5.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class f extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f38249e = l.f("NetworkNotRoamingCtrlr");

    public f(Context context, k5.a aVar) {
        super(g5.g.c(context, aVar).d());
    }

    @Override // f5.c
    boolean b(p pVar) {
        return pVar.f41049j.b() == m.NOT_ROAMING;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f5.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(e5.b bVar) {
        return (bVar.a() && bVar.c()) ? false : true;
    }
}

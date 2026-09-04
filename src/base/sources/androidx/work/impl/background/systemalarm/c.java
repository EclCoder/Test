package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.l;
import i5.p;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f7878e = l.f("ConstraintsCmdHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f7881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e5.d f7882d;

    c(Context context, int i10, e eVar) {
        this.f7879a = context;
        this.f7880b = i10;
        this.f7881c = eVar;
        this.f7882d = new e5.d(context, eVar.f(), null);
    }

    void a() {
        List<p> listC = this.f7881c.g().o().B().c();
        ConstraintProxy.a(this.f7879a, listC);
        this.f7882d.d(listC);
        ArrayList arrayList = new ArrayList(listC.size());
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (p pVar : listC) {
            String str = pVar.f41040a;
            if (jCurrentTimeMillis >= pVar.a() && (!pVar.b() || this.f7882d.c(str))) {
                arrayList.add(pVar);
            }
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str2 = ((p) obj).f41040a;
            Intent intentB = b.b(this.f7879a, str2);
            l.c().a(f7878e, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            e eVar = this.f7881c;
            eVar.k(new e.b(eVar, intentB, this.f7880b));
        }
        this.f7882d.e();
    }
}

package b5;

import android.text.TextUtils;
import androidx.work.l;
import androidx.work.o;
import androidx.work.t;
import androidx.work.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class g extends t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f8425j = l.f("WorkContinuationImpl");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f8426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.work.f f8428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f8429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f8430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f8431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f8432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private o f8434i;

    public g(i iVar, List list) {
        this(iVar, null, androidx.work.f.KEEP, list, null);
    }

    private static boolean i(g gVar, Set set) {
        set.addAll(gVar.c());
        Set setL = l(gVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (setL.contains((String) it.next())) {
                return true;
            }
        }
        List listE = gVar.e();
        if (listE != null && !listE.isEmpty()) {
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                if (i((g) it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.c());
        return false;
    }

    public static Set l(g gVar) {
        HashSet hashSet = new HashSet();
        List listE = gVar.e();
        if (listE != null && !listE.isEmpty()) {
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((g) it.next()).c());
            }
        }
        return hashSet;
    }

    public o a() {
        if (this.f8433h) {
            l.c().h(f8425j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f8430e)), new Throwable[0]);
        } else {
            j5.b bVar = new j5.b(this);
            this.f8426a.p().b(bVar);
            this.f8434i = bVar.d();
        }
        return this.f8434i;
    }

    public androidx.work.f b() {
        return this.f8428c;
    }

    public List c() {
        return this.f8430e;
    }

    public String d() {
        return this.f8427b;
    }

    public List e() {
        return this.f8432g;
    }

    public List f() {
        return this.f8429d;
    }

    public i g() {
        return this.f8426a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.f8433h;
    }

    public void k() {
        this.f8433h = true;
    }

    public g(i iVar, String str, androidx.work.f fVar, List list, List list2) {
        this.f8426a = iVar;
        this.f8427b = str;
        this.f8428c = fVar;
        this.f8429d = list;
        this.f8432g = list2;
        this.f8430e = new ArrayList(list.size());
        this.f8431f = new ArrayList();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f8431f.addAll(((g) it.next()).f8431f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            String strA = ((w) list.get(i10)).a();
            this.f8430e.add(strA);
            this.f8431f.add(strA);
        }
    }
}

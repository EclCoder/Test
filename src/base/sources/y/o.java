package y;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static int f57110g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f57112b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f57114d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList f57111a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f57113c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList f57115e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f57116f = -1;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference f57117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f57118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f57119c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f57120d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f57121e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f57122f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f57123g;

        a(x.e eVar, u.d dVar, int i10) {
            this.f57117a = new WeakReference(eVar);
            this.f57118b = dVar.y(eVar.Q);
            this.f57119c = dVar.y(eVar.R);
            this.f57120d = dVar.y(eVar.S);
            this.f57121e = dVar.y(eVar.T);
            this.f57122f = dVar.y(eVar.U);
            this.f57123g = i10;
        }
    }

    public o(int i10) {
        int i11 = f57110g;
        f57110g = i11 + 1;
        this.f57112b = i11;
        this.f57114d = i10;
    }

    private String e() {
        int i10 = this.f57114d;
        if (i10 == 0) {
            return "Horizontal";
        }
        if (i10 == 1) {
            return "Vertical";
        }
        return i10 == 2 ? "Both" : "Unknown";
    }

    private int j(u.d dVar, ArrayList arrayList, int i10) {
        int iY;
        int iY2;
        x.f fVar = (x.f) ((x.e) arrayList.get(0)).M();
        dVar.E();
        fVar.g(dVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((x.e) arrayList.get(i11)).g(dVar, false);
        }
        if (i10 == 0 && fVar.f56495g1 > 0) {
            x.b.b(fVar, dVar, arrayList, 0);
        }
        if (i10 == 1 && fVar.f56496h1 > 0) {
            x.b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.A();
        } catch (Exception e10) {
            System.err.println(e10.toString() + "\n" + Arrays.toString(e10.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f57115e = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f57115e.add(new a((x.e) arrayList.get(i12), dVar, i10));
        }
        if (i10 == 0) {
            iY = dVar.y(fVar.Q);
            iY2 = dVar.y(fVar.S);
            dVar.E();
        } else {
            iY = dVar.y(fVar.R);
            iY2 = dVar.y(fVar.T);
            dVar.E();
        }
        return iY2 - iY;
    }

    public boolean a(x.e eVar) {
        if (this.f57111a.contains(eVar)) {
            return false;
        }
        this.f57111a.add(eVar);
        return true;
    }

    public void b(ArrayList arrayList) {
        int size = this.f57111a.size();
        if (this.f57116f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = (o) arrayList.get(i10);
                if (this.f57116f == oVar.f57112b) {
                    g(this.f57114d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f57112b;
    }

    public int d() {
        return this.f57114d;
    }

    public int f(u.d dVar, int i10) {
        if (this.f57111a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f57111a, i10);
    }

    public void g(int i10, o oVar) {
        ArrayList arrayList = this.f57111a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            x.e eVar = (x.e) obj;
            oVar.a(eVar);
            if (i10 == 0) {
                eVar.S0 = oVar.c();
            } else {
                eVar.T0 = oVar.c();
            }
        }
        this.f57116f = oVar.f57112b;
    }

    public void h(boolean z10) {
        this.f57113c = z10;
    }

    public void i(int i10) {
        this.f57114d = i10;
    }

    public String toString() {
        String str = e() + " [" + this.f57112b + "] <";
        ArrayList arrayList = this.f57111a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            str = str + " " + ((x.e) obj).v();
        }
        return str + " >";
    }
}

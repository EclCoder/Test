package j5;

import androidx.work.impl.WorkDatabase;
import androidx.work.u;
import i5.q;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b5.c f42005a = new b5.c();

    /* JADX INFO: renamed from: j5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0635a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b5.i f42006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ UUID f42007c;

        C0635a(b5.i iVar, UUID uuid) {
            this.f42006b = iVar;
            this.f42007c = uuid;
        }

        @Override // j5.a
        void h() {
            WorkDatabase workDatabaseO = this.f42006b.o();
            workDatabaseO.c();
            try {
                a(this.f42006b, this.f42007c.toString());
                workDatabaseO.r();
                workDatabaseO.g();
                g(this.f42006b);
            } catch (Throwable th2) {
                workDatabaseO.g();
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b5.i f42008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f42009c;

        b(b5.i iVar, String str) {
            this.f42008b = iVar;
            this.f42009c = str;
        }

        @Override // j5.a
        void h() {
            WorkDatabase workDatabaseO = this.f42008b.o();
            workDatabaseO.c();
            try {
                Iterator it = workDatabaseO.B().h(this.f42009c).iterator();
                while (it.hasNext()) {
                    a(this.f42008b, (String) it.next());
                }
                workDatabaseO.r();
                workDatabaseO.g();
                g(this.f42008b);
            } catch (Throwable th2) {
                workDatabaseO.g();
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b5.i f42010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f42011c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f42012d;

        c(b5.i iVar, String str, boolean z10) {
            this.f42010b = iVar;
            this.f42011c = str;
            this.f42012d = z10;
        }

        @Override // j5.a
        void h() {
            WorkDatabase workDatabaseO = this.f42010b.o();
            workDatabaseO.c();
            try {
                Iterator it = workDatabaseO.B().e(this.f42011c).iterator();
                while (it.hasNext()) {
                    a(this.f42010b, (String) it.next());
                }
                workDatabaseO.r();
                workDatabaseO.g();
                if (this.f42012d) {
                    g(this.f42010b);
                }
            } catch (Throwable th2) {
                workDatabaseO.g();
                throw th2;
            }
        }
    }

    public static a b(UUID uuid, b5.i iVar) {
        return new C0635a(iVar, uuid);
    }

    public static a c(String str, b5.i iVar, boolean z10) {
        return new c(iVar, str, z10);
    }

    public static a d(String str, b5.i iVar) {
        return new b(iVar, str);
    }

    private void f(WorkDatabase workDatabase, String str) {
        q qVarB = workDatabase.B();
        i5.b bVarT = workDatabase.t();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            u uVarF = qVarB.f(str2);
            if (uVarF != u.SUCCEEDED && uVarF != u.FAILED) {
                qVarB.a(u.CANCELLED, str2);
            }
            linkedList.addAll(bVarT.a(str2));
        }
    }

    void a(b5.i iVar, String str) {
        f(iVar.o(), str);
        iVar.m().l(str);
        Iterator it = iVar.n().iterator();
        while (it.hasNext()) {
            ((b5.e) it.next()).a(str);
        }
    }

    public androidx.work.o e() {
        return this.f42005a;
    }

    void g(b5.i iVar) {
        b5.f.b(iVar.i(), iVar.o(), iVar.n());
    }

    abstract void h();

    @Override // java.lang.Runnable
    public void run() {
        try {
            h();
            this.f42005a.a(androidx.work.o.f7998a);
        } catch (Throwable th2) {
            this.f42005a.a(new androidx.work.o.b.a(th2));
        }
    }
}

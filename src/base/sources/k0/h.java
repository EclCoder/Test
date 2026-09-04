package k0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import androidx.collection.n;
import androidx.collection.u;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final n f42792a = new n(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExecutorService f42793b = j.a("fonts-androidx", 10, 10000);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Object f42794c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final u f42795d = new u();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f42797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0.e f42798c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f42799d;

        a(String str, Context context, k0.e eVar, int i10) {
            this.f42796a = str;
            this.f42797b = context;
            this.f42798c = eVar;
            this.f42799d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return h.c(this.f42796a, this.f42797b, g.a(new Object[]{this.f42798c}), this.f42799d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements m0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k0.a f42800a;

        b(k0.a aVar) {
            this.f42800a = aVar;
        }

        @Override // m0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f42800a.b(eVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f42802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f42803c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f42804d;

        c(String str, Context context, List list, int i10) {
            this.f42801a = str;
            this.f42802b = context;
            this.f42803c = list;
            this.f42804d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return h.c(this.f42801a, this.f42802b, this.f42803c, this.f42804d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements m0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42805a;

        d(String str) {
            this.f42805a = str;
        }

        @Override // m0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (h.f42794c) {
                try {
                    u uVar = h.f42795d;
                    ArrayList arrayList = (ArrayList) uVar.get(this.f42805a);
                    if (arrayList == null) {
                        return;
                    }
                    uVar.remove(this.f42805a);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ((m0.a) arrayList.get(i10)).accept(eVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static String a(List list, int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb2.append(((k0.e) list.get(i11)).d());
            sb2.append("-");
            sb2.append(i10);
            if (i11 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    private static int b(i.a aVar) {
        int i10 = 1;
        if (aVar.e() != 0) {
            return aVar.e() != 1 ? -3 : -2;
        }
        i.b[] bVarArrC = aVar.c();
        if (bVarArrC != null && bVarArrC.length != 0) {
            i10 = 0;
            for (i.b bVar : bVarArrC) {
                int iA = bVar.a();
                if (iA != 0) {
                    if (iA < 0) {
                        return -3;
                    }
                    return iA;
                }
            }
        }
        return i10;
    }

    static e c(String str, Context context, List list, int i10) {
        s4.a.a("getFontSync");
        try {
            n nVar = f42792a;
            Typeface typeface = (Typeface) nVar.get(str);
            if (typeface != null) {
                e eVar = new e(typeface);
                s4.a.b();
                return eVar;
            }
            try {
                i.a aVarE = k0.d.e(context, list, null);
                int iB = b(aVarE);
                if (iB != 0) {
                    e eVar2 = new e(iB);
                    s4.a.b();
                    return eVar2;
                }
                Typeface typefaceB = (!aVarE.f() || Build.VERSION.SDK_INT < 29) ? e0.j.b(context, null, aVarE.c(), i10) : e0.j.c(context, null, aVarE.d(), i10);
                if (typefaceB == null) {
                    e eVar3 = new e(-3);
                    s4.a.b();
                    return eVar3;
                }
                nVar.put(str, typefaceB);
                e eVar4 = new e(typefaceB);
                s4.a.b();
                return eVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                e eVar5 = new e(-1);
                s4.a.b();
                return eVar5;
            }
        } catch (Throwable th2) {
            s4.a.b();
            throw th2;
        }
    }

    static Typeface d(Context context, List list, int i10, Executor executor, k0.a aVar) {
        String strA = a(list, i10);
        Typeface typeface = (Typeface) f42792a.get(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f42794c) {
            try {
                u uVar = f42795d;
                ArrayList arrayList = (ArrayList) uVar.get(strA);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                uVar.put(strA, arrayList2);
                c cVar = new c(strA, context, list, i10);
                if (executor == null) {
                    executor = f42793b;
                }
                j.c(executor, cVar, new d(strA));
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static Typeface e(Context context, k0.e eVar, k0.a aVar, int i10, int i11) {
        String strA = a(g.a(new Object[]{eVar}), i10);
        Typeface typeface = (Typeface) f42792a.get(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        if (i11 == -1) {
            e eVarC = c(strA, context, g.a(new Object[]{eVar}), i10);
            aVar.b(eVarC);
            return eVarC.f42806a;
        }
        try {
            e eVar2 = (e) j.d(f42793b, new a(strA, context, eVar, i10), i11);
            aVar.b(eVar2);
            return eVar2.f42806a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Typeface f42806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f42807b;

        e(int i10) {
            this.f42806a = null;
            this.f42807b = i10;
        }

        boolean a() {
            return this.f42807b == 0;
        }

        e(Typeface typeface) {
            this.f42806a = typeface;
            this.f42807b = 0;
        }
    }
}

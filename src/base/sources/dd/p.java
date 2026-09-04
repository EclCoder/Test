package dd;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class p {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final dd.c f36665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f36666b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set f36667c = new HashSet();

        b(dd.c cVar) {
            this.f36665a = cVar;
        }

        void a(b bVar) {
            this.f36666b.add(bVar);
        }

        void b(b bVar) {
            this.f36667c.add(bVar);
        }

        dd.c c() {
            return this.f36665a;
        }

        Set d() {
            return this.f36666b;
        }

        boolean e() {
            return this.f36666b.isEmpty();
        }

        boolean f() {
            return this.f36667c.isEmpty();
        }

        void g(b bVar) {
            this.f36667c.remove(bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a0 f36668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f36669b;

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f36668a.equals(this.f36668a) && cVar.f36669b == this.f36669b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((this.f36668a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f36669b).hashCode();
        }

        private c(a0 a0Var, boolean z10) {
            this.f36668a = a0Var;
            this.f36669b = z10;
        }
    }

    static void a(List list) {
        Set<b> setC = c(list);
        Set setB = b(setC);
        int i10 = 0;
        while (!setB.isEmpty()) {
            b bVar = (b) setB.iterator().next();
            setB.remove(bVar);
            i10++;
            for (b bVar2 : bVar.d()) {
                bVar2.g(bVar);
                if (bVar2.f()) {
                    setB.add(bVar2);
                }
            }
        }
        if (i10 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 : setC) {
            if (!bVar3.f() && !bVar3.e()) {
                arrayList.add(bVar3.c());
            }
        }
        throw new DependencyCycleException(arrayList);
    }

    private static Set b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set c(List list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (q qVar : bVar.c().g()) {
                            if (qVar.e() && (set = (Set) map.get(new c(qVar.c(), qVar.g()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            dd.c cVar = (dd.c) it.next();
            b bVar3 = new b(cVar);
            for (a0 a0Var : cVar.j()) {
                c cVar2 = new c(a0Var, !cVar.p());
                if (!map.containsKey(cVar2)) {
                    map.put(cVar2, new HashSet());
                }
                Set set2 = (Set) map.get(cVar2);
                if (!set2.isEmpty() && !cVar2.f36669b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", a0Var));
                }
                set2.add(bVar3);
            }
        }
    }
}

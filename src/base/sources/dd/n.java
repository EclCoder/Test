package dd;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class n implements d, vd.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ce.b f36651i = new ce.b() { // from class: dd.j
        @Override // ce.b
        public final Object get() {
            return Collections.EMPTY_SET;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f36652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f36653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f36654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f36655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Set f36656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s f36657f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference f36658g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i f36659h;

    public static /* synthetic */ Object j(n nVar, c cVar) {
        nVar.getClass();
        return cVar.h().a(new b0(cVar, nVar));
    }

    public static b m(Executor executor) {
        return new b(executor);
    }

    private void n(List list) {
        int i10;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f36655d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((ce.b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f36659h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator it2 = list.iterator();
            while (true) {
                i10 = 0;
                if (!it2.hasNext()) {
                    break;
                }
                Object[] array = ((c) it2.next()).j().toArray();
                int length = array.length;
                while (i10 < length) {
                    Object obj = array[i10];
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.f36656e.contains(obj.toString())) {
                            it2.remove();
                            break;
                        }
                        this.f36656e.add(obj.toString());
                    }
                    i10++;
                }
            }
            if (this.f36652a.isEmpty()) {
                p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f36652a.keySet());
                arrayList2.addAll(list);
                p.a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final c cVar = (c) it3.next();
                this.f36652a.put(cVar, new t(new ce.b() { // from class: dd.k
                    @Override // ce.b
                    public final Object get() {
                        return n.j(this.f36645a, cVar);
                    }
                }));
            }
            arrayList.addAll(t(list));
            arrayList.addAll(u());
            s();
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((Runnable) obj2).run();
        }
        r();
    }

    private void o(Map map, boolean z10) {
        for (Map.Entry entry : map.entrySet()) {
            c cVar = (c) entry.getKey();
            ce.b bVar = (ce.b) entry.getValue();
            if (cVar.n() || (cVar.o() && z10)) {
                bVar.get();
            }
        }
        this.f36657f.c();
    }

    private static List q(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    private void r() {
        Boolean bool = (Boolean) this.f36658g.get();
        if (bool != null) {
            o(this.f36652a, bool.booleanValue());
        }
    }

    private void s() {
        for (c cVar : this.f36652a.keySet()) {
            for (q qVar : cVar.g()) {
                if (qVar.g() && !this.f36654c.containsKey(qVar.c())) {
                    this.f36654c.put(qVar.c(), u.b(Collections.EMPTY_SET));
                } else if (this.f36653b.containsKey(qVar.c())) {
                    continue;
                } else {
                    if (qVar.f()) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", cVar, qVar.c()));
                    }
                    if (!qVar.g()) {
                        this.f36653b.put(qVar.c(), y.e());
                    }
                }
            }
        }
    }

    private List t(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.p()) {
                final ce.b bVar = (ce.b) this.f36652a.get(cVar);
                for (a0 a0Var : cVar.j()) {
                    if (this.f36653b.containsKey(a0Var)) {
                        final y yVar = (y) ((ce.b) this.f36653b.get(a0Var));
                        arrayList.add(new Runnable() { // from class: dd.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                yVar.g(bVar);
                            }
                        });
                    } else {
                        this.f36653b.put(a0Var, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private List u() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f36652a.entrySet()) {
            c cVar = (c) entry.getKey();
            if (!cVar.p()) {
                ce.b bVar = (ce.b) entry.getValue();
                for (a0 a0Var : cVar.j()) {
                    if (!map.containsKey(a0Var)) {
                        map.put(a0Var, new HashSet());
                    }
                    ((Set) map.get(a0Var)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f36654c.containsKey(entry2.getKey())) {
                final u uVar = (u) this.f36654c.get(entry2.getKey());
                for (final ce.b bVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: dd.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            uVar.a(bVar2);
                        }
                    });
                }
            } else {
                this.f36654c.put((a0) entry2.getKey(), u.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // dd.d
    public ce.a c(a0 a0Var) {
        ce.b bVarH = h(a0Var);
        if (bVarH == null) {
            return y.e();
        }
        return bVarH instanceof y ? (y) bVarH : y.f(bVarH);
    }

    @Override // dd.d
    public synchronized ce.b d(a0 a0Var) {
        u uVar = (u) this.f36654c.get(a0Var);
        if (uVar != null) {
            return uVar;
        }
        return f36651i;
    }

    @Override // dd.d
    public synchronized ce.b h(a0 a0Var) {
        z.c(a0Var, "Null interface requested.");
        return (ce.b) this.f36653b.get(a0Var);
    }

    public void p(boolean z10) {
        HashMap map;
        if (androidx.lifecycle.b.a(this.f36658g, null, Boolean.valueOf(z10))) {
            synchronized (this) {
                map = new HashMap(this.f36652a);
            }
            o(map, z10);
        }
    }

    private n(Executor executor, Iterable iterable, Collection collection, i iVar) {
        this.f36652a = new HashMap();
        this.f36653b = new HashMap();
        this.f36654c = new HashMap();
        this.f36656e = new HashSet();
        this.f36658g = new AtomicReference();
        s sVar = new s(executor);
        this.f36657f = sVar;
        this.f36659h = iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.q(sVar, s.class, ae.d.class, ae.c.class));
        arrayList.add(c.q(this, vd.a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        this.f36655d = q(iterable);
        n(arrayList);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f36660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f36661b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f36662c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private i f36663d = i.f36644a;

        b(Executor executor) {
            this.f36660a = executor;
        }

        public b b(c cVar) {
            this.f36662c.add(cVar);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f36661b.add(new ce.b() { // from class: dd.o
                @Override // ce.b
                public final Object get() {
                    return n.b.a(componentRegistrar);
                }
            });
            return this;
        }

        public b d(Collection collection) {
            this.f36661b.addAll(collection);
            return this;
        }

        public n e() {
            return new n(this.f36660a, this.f36661b, this.f36662c, this.f36663d);
        }

        public b f(i iVar) {
            this.f36663d = iVar;
            return this;
        }

        public static /* synthetic */ ComponentRegistrar a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }
    }
}

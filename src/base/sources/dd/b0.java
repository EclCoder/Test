package dd;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b0 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f36617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f36618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f36619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f36620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f36621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f36622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d f36623g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a implements ae.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f36624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ae.c f36625b;

        public a(Set set, ae.c cVar) {
            this.f36624a = set;
            this.f36625b = cVar;
        }
    }

    b0(c cVar, d dVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q qVar : cVar.g()) {
            if (qVar.e()) {
                if (qVar.g()) {
                    hashSet4.add(qVar.c());
                } else {
                    hashSet.add(qVar.c());
                }
            } else if (qVar.d()) {
                hashSet3.add(qVar.c());
            } else if (qVar.g()) {
                hashSet5.add(qVar.c());
            } else {
                hashSet2.add(qVar.c());
            }
        }
        if (!cVar.k().isEmpty()) {
            hashSet.add(a0.b(ae.c.class));
        }
        this.f36617a = Collections.unmodifiableSet(hashSet);
        this.f36618b = Collections.unmodifiableSet(hashSet2);
        this.f36619c = Collections.unmodifiableSet(hashSet3);
        this.f36620d = Collections.unmodifiableSet(hashSet4);
        this.f36621e = Collections.unmodifiableSet(hashSet5);
        this.f36622f = cVar.k();
        this.f36623g = dVar;
    }

    @Override // dd.d
    public Object a(Class cls) {
        if (!this.f36617a.contains(a0.b(cls))) {
            throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object objA = this.f36623g.a(cls);
        return !cls.equals(ae.c.class) ? objA : new a(this.f36622f, (ae.c) objA);
    }

    @Override // dd.d
    public ce.a c(a0 a0Var) {
        if (this.f36619c.contains(a0Var)) {
            return this.f36623g.c(a0Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", a0Var));
    }

    @Override // dd.d
    public ce.b d(a0 a0Var) {
        if (this.f36621e.contains(a0Var)) {
            return this.f36623g.d(a0Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", a0Var));
    }

    @Override // dd.d
    public Object e(a0 a0Var) {
        if (this.f36617a.contains(a0Var)) {
            return this.f36623g.e(a0Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", a0Var));
    }

    @Override // dd.d
    public ce.b f(Class cls) {
        return h(a0.b(cls));
    }

    @Override // dd.d
    public Set g(a0 a0Var) {
        if (this.f36620d.contains(a0Var)) {
            return this.f36623g.g(a0Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", a0Var));
    }

    @Override // dd.d
    public ce.b h(a0 a0Var) {
        if (this.f36618b.contains(a0Var)) {
            return this.f36623g.h(a0Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", a0Var));
    }

    @Override // dd.d
    public ce.a i(Class cls) {
        return c(a0.b(cls));
    }
}

package kl;

import fl.g0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.s;
import tl.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements j, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f43525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j.b f43526b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0660a f43527b = new C0660a(null);
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j[] f43528a;

        /* JADX INFO: renamed from: kl.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class C0660a {
            public /* synthetic */ C0660a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0660a() {
            }
        }

        public a(j[] elements) {
            s.h(elements, "elements");
            this.f43528a = elements;
        }

        private final Object readResolve() {
            j[] jVarArr = this.f43528a;
            j jVarPlus = k.f43531a;
            for (j jVar : jVarArr) {
                jVarPlus = jVarPlus.plus(jVar);
            }
            return jVarPlus;
        }
    }

    public e(j left, j.b element) {
        s.h(left, "left");
        s.h(element, "element");
        this.f43525a = left;
        this.f43526b = element;
    }

    private final boolean e(j.b bVar) {
        return s.c(get(bVar.getKey()), bVar);
    }

    private final boolean g(e eVar) {
        while (e(eVar.f43526b)) {
            j jVar = eVar.f43525a;
            if (!(jVar instanceof e)) {
                s.f(jVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return e((j.b) jVar);
            }
            eVar = (e) jVar;
        }
        return false;
    }

    private final int i() {
        int i10 = 2;
        e eVar = this;
        while (true) {
            j jVar = eVar.f43525a;
            eVar = jVar instanceof e ? (e) jVar : null;
            if (eVar == null) {
                return i10;
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String m(String acc, j.b element) {
        s.h(acc, "acc");
        s.h(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 n(j[] jVarArr, i0 i0Var, g0 g0Var, j.b element) {
        s.h(g0Var, "<unused var>");
        s.h(element, "element");
        int i10 = i0Var.f43593a;
        i0Var.f43593a = i10 + 1;
        jVarArr[i10] = element;
        return g0.f38750a;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int i10 = i();
        final j[] jVarArr = new j[i10];
        final i0 i0Var = new i0();
        fold(g0.f38750a, new o() { // from class: kl.c
            @Override // tl.o
            public final Object invoke(Object obj, Object obj2) {
                return e.n(jVarArr, i0Var, (g0) obj, (j.b) obj2);
            }
        });
        if (i0Var.f43593a == i10) {
            return new a(jVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.i() == i() && eVar.g(this);
    }

    @Override // kl.j
    public Object fold(Object obj, o operation) {
        s.h(operation, "operation");
        return operation.invoke(this.f43525a.fold(obj, operation), this.f43526b);
    }

    @Override // kl.j
    public j.b get(j.c key) {
        s.h(key, "key");
        e eVar = this;
        while (true) {
            j.b bVar = eVar.f43526b.get(key);
            if (bVar != null) {
                return bVar;
            }
            j jVar = eVar.f43525a;
            if (!(jVar instanceof e)) {
                return jVar.get(key);
            }
            eVar = (e) jVar;
        }
    }

    public int hashCode() {
        return this.f43525a.hashCode() + this.f43526b.hashCode();
    }

    @Override // kl.j
    public j minusKey(j.c key) {
        s.h(key, "key");
        if (this.f43526b.get(key) != null) {
            return this.f43525a;
        }
        j jVarMinusKey = this.f43525a.minusKey(key);
        if (jVarMinusKey == this.f43525a) {
            return this;
        }
        return jVarMinusKey == k.f43531a ? this.f43526b : new e(jVarMinusKey, this.f43526b);
    }

    @Override // kl.j
    public /* bridge */ j plus(j jVar) {
        return j.a.b(this, jVar);
    }

    public String toString() {
        return '[' + ((String) fold("", new o() { // from class: kl.d
            @Override // tl.o
            public final Object invoke(Object obj, Object obj2) {
                return e.m((String) obj, (j.b) obj2);
            }
        })) + ']';
    }
}

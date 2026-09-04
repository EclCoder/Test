package com.squareup.moshi;

import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final List f35553e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f35554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f35555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ThreadLocal f35556c = new ThreadLocal();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f35557d = new LinkedHashMap();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List f35558a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f35559b = 0;

        public r a() {
            return new r(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Type f35560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f35561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Object f35562c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        f f35563d;

        b(Type type, String str, Object obj) {
            this.f35560a = type;
            this.f35561b = str;
            this.f35562c = obj;
        }

        @Override // com.squareup.moshi.f
        public Object fromJson(i iVar) {
            f fVar = this.f35563d;
            if (fVar != null) {
                return fVar.fromJson(iVar);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        @Override // com.squareup.moshi.f
        public void toJson(o oVar, Object obj) {
            f fVar = this.f35563d;
            if (fVar == null) {
                throw new IllegalStateException("JsonAdapter isn't ready");
            }
            fVar.toJson(oVar, obj);
        }

        public String toString() {
            f fVar = this.f35563d;
            return fVar != null ? fVar.toString() : super.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List f35564a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Deque f35565b = new ArrayDeque();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f35566c;

        c() {
        }

        void a(f fVar) {
            ((b) this.f35565b.getLast()).f35563d = fVar;
        }

        IllegalArgumentException b(IllegalArgumentException illegalArgumentException) {
            if (!this.f35566c) {
                this.f35566c = true;
                if (this.f35565b.size() != 1 || ((b) this.f35565b.getFirst()).f35561b != null) {
                    StringBuilder sb2 = new StringBuilder(illegalArgumentException.getMessage());
                    Iterator itDescendingIterator = this.f35565b.descendingIterator();
                    while (itDescendingIterator.hasNext()) {
                        b bVar = (b) itDescendingIterator.next();
                        sb2.append("\nfor ");
                        sb2.append(bVar.f35560a);
                        if (bVar.f35561b != null) {
                            sb2.append(' ');
                            sb2.append(bVar.f35561b);
                        }
                    }
                    return new IllegalArgumentException(sb2.toString(), illegalArgumentException);
                }
            }
            return illegalArgumentException;
        }

        void c(boolean z10) {
            this.f35565b.removeLast();
            if (this.f35565b.isEmpty()) {
                r.this.f35556c.remove();
                if (z10) {
                    synchronized (r.this.f35557d) {
                        try {
                            int size = this.f35564a.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                b bVar = (b) this.f35564a.get(i10);
                                f fVar = (f) r.this.f35557d.put(bVar.f35562c, bVar.f35563d);
                                if (fVar != null) {
                                    bVar.f35563d = fVar;
                                    r.this.f35557d.put(bVar.f35562c, fVar);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }

        f d(Type type, String str, Object obj) {
            int size = this.f35564a.size();
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = (b) this.f35564a.get(i10);
                if (bVar.f35562c.equals(obj)) {
                    this.f35565b.add(bVar);
                    f fVar = bVar.f35563d;
                    return fVar != null ? fVar : bVar;
                }
            }
            b bVar2 = new b(type, str, obj);
            this.f35564a.add(bVar2);
            this.f35565b.add(bVar2);
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f35553e = arrayList;
        arrayList.add(t.f35569a);
        arrayList.add(d.f35458b);
        arrayList.add(q.f35550c);
        arrayList.add(com.squareup.moshi.a.f35438c);
        arrayList.add(s.f35568a);
        arrayList.add(com.squareup.moshi.c.f35451d);
    }

    r(a aVar) {
        int size = aVar.f35558a.size();
        List list = f35553e;
        ArrayList arrayList = new ArrayList(size + list.size());
        arrayList.addAll(aVar.f35558a);
        arrayList.addAll(list);
        this.f35554a = Collections.unmodifiableList(arrayList);
        this.f35555b = aVar.f35559b;
    }

    private Object g(Type type, Set set) {
        return set.isEmpty() ? type : Arrays.asList(type, set);
    }

    public f c(Class cls) {
        return e(cls, vj.c.f55651a);
    }

    public f d(Type type) {
        return e(type, vj.c.f55651a);
    }

    public f e(Type type, Set set) {
        return f(type, set, null);
    }

    public f f(Type type, Set set, String str) {
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeO = vj.c.o(vj.c.a(type));
        Object objG = g(typeO, set);
        synchronized (this.f35557d) {
            try {
                f fVar = (f) this.f35557d.get(objG);
                if (fVar != null) {
                    return fVar;
                }
                c cVar = (c) this.f35556c.get();
                if (cVar == null) {
                    cVar = new c();
                    this.f35556c.set(cVar);
                }
                f fVarD = cVar.d(typeO, str, objG);
                try {
                    if (fVarD != null) {
                        cVar.c(false);
                        return fVarD;
                    }
                    try {
                        int size = this.f35554a.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            f fVarA = ((f.e) this.f35554a.get(i10)).a(typeO, set, this);
                            if (fVarA != null) {
                                cVar.a(fVarA);
                                cVar.c(true);
                                return fVarA;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + vj.c.t(typeO, set));
                    } catch (IllegalArgumentException e10) {
                        throw cVar.b(e10);
                    }
                } catch (Throwable th2) {
                    cVar.c(false);
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}

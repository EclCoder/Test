package u5;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class i implements u5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f54146a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f54147b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f54148c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f54149d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f54150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f54151f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f54152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f54153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Class f54154c;

        a(b bVar) {
            this.f54152a = bVar;
        }

        @Override // u5.m
        public void a() {
            this.f54152a.c(this);
        }

        void b(int i10, Class cls) {
            this.f54153b = i10;
            this.f54154c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f54153b == aVar.f54153b && this.f54154c == aVar.f54154c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f54153b * 31;
            Class cls = this.f54154c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f54153b + "array=" + this.f54154c + '}';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b extends c {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u5.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        a e(int i10, Class cls) {
            a aVar = (a) b();
            aVar.b(i10, cls);
            return aVar;
        }
    }

    public i(int i10) {
        this.f54150e = i10;
    }

    private void e(int i10, Class cls) {
        NavigableMap navigableMapL = l(cls);
        Integer num = (Integer) navigableMapL.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapL.remove(Integer.valueOf(i10));
                return;
            } else {
                navigableMapL.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    private void f() {
        g(this.f54150e);
    }

    private void g(int i10) {
        while (this.f54151f > i10) {
            Object objF = this.f54146a.f();
            m6.k.e(objF);
            u5.a aVarH = h(objF);
            this.f54151f -= aVarH.b(objF) * aVarH.a();
            e(aVarH.b(objF), objF.getClass());
            if (Log.isLoggable(aVarH.getTag(), 2)) {
                Log.v(aVarH.getTag(), "evicted: " + aVarH.b(objF));
            }
        }
    }

    private u5.a h(Object obj) {
        return i(obj.getClass());
    }

    private u5.a i(Class cls) {
        u5.a fVar;
        u5.a aVar = (u5.a) this.f54149d.get(cls);
        if (aVar != null) {
            return aVar;
        }
        if (cls.equals(int[].class)) {
            fVar = new h();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            fVar = new f();
        }
        this.f54149d.put(cls, fVar);
        return fVar;
    }

    private Object j(a aVar) {
        return this.f54146a.a(aVar);
    }

    private Object k(a aVar, Class cls) {
        u5.a aVarI = i(cls);
        Object objJ = j(aVar);
        if (objJ != null) {
            this.f54151f -= aVarI.b(objJ) * aVarI.a();
            e(aVarI.b(objJ), cls);
        }
        if (objJ != null) {
            return objJ;
        }
        if (Log.isLoggable(aVarI.getTag(), 2)) {
            Log.v(aVarI.getTag(), "Allocated " + aVar.f54153b + " bytes");
        }
        return aVarI.newArray(aVar.f54153b);
    }

    private NavigableMap l(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f54148c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f54148c.put(cls, treeMap);
        return treeMap;
    }

    private boolean m() {
        int i10 = this.f54151f;
        return i10 == 0 || this.f54150e / i10 >= 2;
    }

    private boolean n(int i10) {
        return i10 <= this.f54150e / 2;
    }

    private boolean o(int i10, Integer num) {
        if (num != null) {
            return m() || num.intValue() <= i10 * 8;
        }
        return false;
    }

    @Override // u5.b
    public synchronized void a(int i10) {
        try {
            if (i10 >= 40) {
                b();
            } else if (i10 >= 20 || i10 == 15) {
                g(this.f54150e / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // u5.b
    public synchronized void b() {
        g(0);
    }

    @Override // u5.b
    public synchronized Object c(int i10, Class cls) {
        Integer num;
        try {
            num = (Integer) l(cls).ceilingKey(Integer.valueOf(i10));
        } catch (Throwable th2) {
            throw th2;
        }
        return k(o(i10, num) ? this.f54147b.e(num.intValue(), cls) : this.f54147b.e(i10, cls), cls);
    }

    @Override // u5.b
    public synchronized Object d(int i10, Class cls) {
        return k(this.f54147b.e(i10, cls), cls);
    }

    @Override // u5.b
    public synchronized void put(Object obj) {
        Class<?> cls = obj.getClass();
        u5.a aVarI = i(cls);
        int iB = aVarI.b(obj);
        int iA = aVarI.a() * iB;
        if (n(iA)) {
            a aVarE = this.f54147b.e(iB, cls);
            this.f54146a.d(aVarE, obj);
            NavigableMap navigableMapL = l(cls);
            Integer num = (Integer) navigableMapL.get(Integer.valueOf(aVarE.f54153b));
            Integer numValueOf = Integer.valueOf(aVarE.f54153b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapL.put(numValueOf, Integer.valueOf(iIntValue));
            this.f54151f += iA;
            f();
        }
    }
}

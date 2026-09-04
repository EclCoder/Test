package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected volatile p4.b f7146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Executor f7147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Executor f7148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p4.c f7149d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f7151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f7152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected List f7153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ReentrantReadWriteLock f7154i = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ThreadLocal f7155j = new ThreadLocal();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map f7156k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f7150e = e();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f7157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f7158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f7159c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ArrayList f7160d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Executor f7161e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Executor f7162f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private p4.c.InterfaceC0762c f7163g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f7164h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f7166j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f7168l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Set f7170n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Set f7171o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private String f7172p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private File f7173q;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private c f7165i = c.AUTOMATIC;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f7167k = true;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final d f7169m = new d();

        a(Context context, Class cls, String str) {
            this.f7159c = context;
            this.f7157a = cls;
            this.f7158b = str;
        }

        public a a(b bVar) {
            if (this.f7160d == null) {
                this.f7160d = new ArrayList();
            }
            this.f7160d.add(bVar);
            return this;
        }

        public a b(l4.a... aVarArr) {
            if (this.f7171o == null) {
                this.f7171o = new HashSet();
            }
            for (l4.a aVar : aVarArr) {
                this.f7171o.add(Integer.valueOf(aVar.f43895a));
                this.f7171o.add(Integer.valueOf(aVar.f43896b));
            }
            this.f7169m.b(aVarArr);
            return this;
        }

        public a c() {
            this.f7164h = true;
            return this;
        }

        public h d() {
            Executor executor;
            if (this.f7159c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            }
            if (this.f7157a == null) {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            Executor executor2 = this.f7161e;
            if (executor2 == null && this.f7162f == null) {
                Executor executorF = n.c.f();
                this.f7162f = executorF;
                this.f7161e = executorF;
            } else if (executor2 != null && this.f7162f == null) {
                this.f7162f = executor2;
            } else if (executor2 == null && (executor = this.f7162f) != null) {
                this.f7161e = executor;
            }
            Set<Integer> set = this.f7171o;
            if (set != null && this.f7170n != null) {
                for (Integer num : set) {
                    if (this.f7170n.contains(num)) {
                        throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + num);
                    }
                }
            }
            if (this.f7163g == null) {
                this.f7163g = new q4.c();
            }
            String str = this.f7172p;
            if (str != null || this.f7173q != null) {
                if (this.f7158b == null) {
                    throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                }
                if (str != null && this.f7173q != null) {
                    throw new IllegalArgumentException("Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations.");
                }
                this.f7163g = new k(str, this.f7173q, this.f7163g);
            }
            Context context = this.f7159c;
            androidx.room.a aVar = new androidx.room.a(context, this.f7158b, this.f7163g, this.f7169m, this.f7160d, this.f7164h, this.f7165i.b(context), this.f7161e, this.f7162f, this.f7166j, this.f7167k, this.f7168l, this.f7170n, this.f7172p, this.f7173q);
            h hVar = (h) g.b(this.f7157a, "_Impl");
            hVar.l(aVar);
            return hVar;
        }

        public a e() {
            this.f7167k = false;
            this.f7168l = true;
            return this;
        }

        public a f(p4.c.InterfaceC0762c interfaceC0762c) {
            this.f7163g = interfaceC0762c;
            return this;
        }

        public a g(Executor executor) {
            this.f7161e = executor;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean a(ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }

        c b(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            return (activityManager == null || a(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HashMap f7178a = new HashMap();

        private void a(l4.a aVar) {
            int i10 = aVar.f43895a;
            int i11 = aVar.f43896b;
            TreeMap treeMap = (TreeMap) this.f7178a.get(Integer.valueOf(i10));
            if (treeMap == null) {
                treeMap = new TreeMap();
                this.f7178a.put(Integer.valueOf(i10), treeMap);
            }
            l4.a aVar2 = (l4.a) treeMap.get(Integer.valueOf(i11));
            if (aVar2 != null) {
                Log.w("ROOM", "Overriding migration " + aVar2 + " with " + aVar);
            }
            treeMap.put(Integer.valueOf(i11), aVar);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0019  */
        /* JADX WARN: Code duplicated, block: B:11:0x001e  */
        /* JADX WARN: Code duplicated, block: B:15:0x002c  */
        /* JADX WARN: Code duplicated, block: B:26:0x0050 A[LOOP:0: B:2:0x0000->B:26:0x0050, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:30:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:31:0x004f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:32:0x003d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:34:0x004a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:36:0x0038 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:9:0x0017 A[DONT_INVERT] */
        private List d(List list, boolean z10, int i10, int i11) {
            TreeMap treeMap;
            Set setKeySet;
            Iterator it;
            int iIntValue;
            boolean z11;
            while (true) {
                if (z10) {
                    if (i10 >= i11) {
                        break;
                    }
                    treeMap = (TreeMap) this.f7178a.get(Integer.valueOf(i10));
                    if (treeMap == null) {
                        return null;
                    }
                    if (z10) {
                        setKeySet = treeMap.descendingKeySet();
                    } else {
                        setKeySet = treeMap.keySet();
                    }
                    it = setKeySet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            iIntValue = i10;
                            z11 = false;
                            break;
                        }
                        Integer num = (Integer) it.next();
                        iIntValue = num.intValue();
                        if (!z10) {
                            if (iIntValue >= i11 && iIntValue < i10) {
                                list.add(treeMap.get(num));
                                z11 = true;
                                break;
                            }
                        } else if (iIntValue <= i11 && iIntValue > i10) {
                            list.add(treeMap.get(num));
                            z11 = true;
                            break;
                        }
                    }
                    if (!z11) {
                        return null;
                    }
                    i10 = iIntValue;
                } else {
                    if (i10 <= i11) {
                        break;
                    }
                    treeMap = (TreeMap) this.f7178a.get(Integer.valueOf(i10));
                    if (treeMap == null) {
                        return null;
                    }
                    if (z10) {
                        setKeySet = treeMap.descendingKeySet();
                    } else {
                        setKeySet = treeMap.keySet();
                    }
                    it = setKeySet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            iIntValue = i10;
                            z11 = false;
                            break;
                        }
                        Integer num2 = (Integer) it.next();
                        iIntValue = num2.intValue();
                        if (!z10) {
                            if (iIntValue <= i11) {
                                continue;
                            }
                        } else if (iIntValue >= i11) {
                            continue;
                        }
                    }
                    if (!z11) {
                        return null;
                    }
                    i10 = iIntValue;
                }
            }
            return list;
        }

        public void b(l4.a... aVarArr) {
            for (l4.a aVar : aVarArr) {
                a(aVar);
            }
        }

        public List c(int i10, int i11) {
            if (i10 == i11) {
                return Collections.EMPTY_LIST;
            }
            return d(new ArrayList(), i11 > i10, i10, i11);
        }
    }

    private static boolean n() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void a() {
        if (!this.f7151f && n()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void b() {
        if (!k() && this.f7155j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void c() {
        a();
        p4.b writableDatabase = this.f7149d.getWritableDatabase();
        this.f7150e.m(writableDatabase);
        writableDatabase.x();
    }

    public p4.f d(String str) {
        a();
        b();
        return this.f7149d.getWritableDatabase().j0(str);
    }

    protected abstract e e();

    protected abstract p4.c f(androidx.room.a aVar);

    public void g() {
        this.f7149d.getWritableDatabase().P();
        if (k()) {
            return;
        }
        this.f7150e.f();
    }

    Lock h() {
        return this.f7154i.readLock();
    }

    public p4.c i() {
        return this.f7149d;
    }

    public Executor j() {
        return this.f7147b;
    }

    public boolean k() {
        return this.f7149d.getWritableDatabase().J0();
    }

    public void l(androidx.room.a aVar) {
        p4.c cVarF = f(aVar);
        this.f7149d = cVarF;
        if (cVarF instanceof j) {
            ((j) cVarF).c(aVar);
        }
        boolean z10 = aVar.f7088g == c.WRITE_AHEAD_LOGGING;
        this.f7149d.setWriteAheadLoggingEnabled(z10);
        this.f7153h = aVar.f7086e;
        this.f7147b = aVar.f7089h;
        this.f7148c = new l(aVar.f7090i);
        this.f7151f = aVar.f7087f;
        this.f7152g = z10;
        if (aVar.f7091j) {
            this.f7150e.i(aVar.f7083b, aVar.f7084c);
        }
    }

    protected void m(p4.b bVar) {
        this.f7150e.d(bVar);
    }

    public boolean o() {
        p4.b bVar = this.f7146a;
        return bVar != null && bVar.isOpen();
    }

    public Cursor p(p4.e eVar) {
        return q(eVar, null);
    }

    public Cursor q(p4.e eVar, CancellationSignal cancellationSignal) {
        a();
        b();
        return cancellationSignal != null ? this.f7149d.getWritableDatabase().O(eVar, cancellationSignal) : this.f7149d.getWritableDatabase().H(eVar);
    }

    public void r() {
        this.f7149d.getWritableDatabase().L();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class b {
        public void a(p4.b bVar) {
        }

        public void b(p4.b bVar) {
        }

        public void c(p4.b bVar) {
        }
    }
}

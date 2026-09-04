package androidx.room;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.api.client.http.HttpMethods;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f7101m = {"UPDATE", HttpMethods.DELETE, "INSERT"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String[] f7103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f7104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final h f7105d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    volatile p4.f f7108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f7109h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.room.d f7110i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private f f7112k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    AtomicBoolean f7106e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f7107f = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final o.a f7111j = new o.a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Runnable f7113l = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final HashMap f7102a = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        private Set a() {
            HashSet hashSet = new HashSet();
            Cursor cursorP = e.this.f7105d.p(new p4.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (cursorP.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(cursorP.getInt(0)));
                } catch (Throwable th2) {
                    cursorP.close();
                    throw th2;
                }
            }
            cursorP.close();
            if (!hashSet.isEmpty()) {
                e.this.f7108g.E();
            }
            return hashSet;
        }

        @Override // java.lang.Runnable
        public void run() {
            Lock lockH = e.this.f7105d.h();
            Set setA = null;
            try {
                try {
                    lockH.lock();
                    if (!e.this.c()) {
                        lockH.unlock();
                        return;
                    }
                    if (!e.this.f7106e.compareAndSet(true, false)) {
                        lockH.unlock();
                        return;
                    }
                    if (e.this.f7105d.k()) {
                        lockH.unlock();
                        return;
                    }
                    h hVar = e.this.f7105d;
                    if (hVar.f7152g) {
                        p4.b writableDatabase = hVar.i().getWritableDatabase();
                        writableDatabase.x();
                        try {
                            setA = a();
                            writableDatabase.L();
                            writableDatabase.P();
                        } catch (Throwable th2) {
                            writableDatabase.P();
                            throw th2;
                        }
                    } else {
                        setA = a();
                    }
                    lockH.unlock();
                    if (setA == null || setA.isEmpty()) {
                        return;
                    }
                    synchronized (e.this.f7111j) {
                        try {
                            Iterator it = e.this.f7111j.iterator();
                            while (it.hasNext()) {
                                ((d) ((Map.Entry) it.next()).getValue()).a(setA);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    lockH.unlock();
                    throw th4;
                }
            } catch (SQLiteException e10) {
                e = e10;
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            } catch (IllegalStateException e11) {
                e = e11;
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long[] f7115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean[] f7116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int[] f7117c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f7118d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f7119e;

        b(int i10) {
            long[] jArr = new long[i10];
            this.f7115a = jArr;
            boolean[] zArr = new boolean[i10];
            this.f7116b = zArr;
            this.f7117c = new int[i10];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        int[] a() {
            synchronized (this) {
                try {
                    if (this.f7118d && !this.f7119e) {
                        int length = this.f7115a.length;
                        int i10 = 0;
                        while (true) {
                            int i11 = 1;
                            if (i10 >= length) {
                                this.f7119e = true;
                                this.f7118d = false;
                                return this.f7117c;
                            }
                            boolean z10 = this.f7115a[i10] > 0;
                            boolean[] zArr = this.f7116b;
                            if (z10 != zArr[i10]) {
                                int[] iArr = this.f7117c;
                                if (!z10) {
                                    i11 = 2;
                                }
                                iArr[i10] = i11;
                            } else {
                                this.f7117c[i10] = 0;
                            }
                            zArr[i10] = z10;
                            i10++;
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        boolean b(int... iArr) {
            boolean z10;
            synchronized (this) {
                try {
                    z10 = false;
                    for (int i10 : iArr) {
                        long[] jArr = this.f7115a;
                        long j10 = jArr[i10];
                        jArr[i10] = 1 + j10;
                        if (j10 == 0) {
                            z10 = true;
                            this.f7118d = true;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z10;
        }

        boolean c(int... iArr) {
            boolean z10;
            synchronized (this) {
                try {
                    z10 = false;
                    for (int i10 : iArr) {
                        long[] jArr = this.f7115a;
                        long j10 = jArr[i10];
                        jArr[i10] = j10 - 1;
                        if (j10 == 1) {
                            z10 = true;
                            this.f7118d = true;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z10;
        }

        void d() {
            synchronized (this) {
                this.f7119e = false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String[] f7120a;

        public c(String[] strArr) {
            this.f7120a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        abstract boolean a();

        public abstract void b(Set set);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f7121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f7122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final c f7123c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Set f7124d;

        d(c cVar, int[] iArr, String[] strArr) {
            this.f7123c = cVar;
            this.f7121a = iArr;
            this.f7122b = strArr;
            if (iArr.length != 1) {
                this.f7124d = null;
                return;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(strArr[0]);
            this.f7124d = Collections.unmodifiableSet(hashSet);
        }

        void a(Set set) {
            int length = this.f7121a.length;
            Set hashSet = null;
            for (int i10 = 0; i10 < length; i10++) {
                if (set.contains(Integer.valueOf(this.f7121a[i10]))) {
                    if (length == 1) {
                        hashSet = this.f7124d;
                    } else {
                        if (hashSet == null) {
                            hashSet = new HashSet(length);
                        }
                        hashSet.add(this.f7122b[i10]);
                    }
                }
            }
            if (hashSet != null) {
                this.f7123c.b(hashSet);
            }
        }

        void b(String[] strArr) {
            Set set = null;
            if (this.f7122b.length == 1) {
                for (String str : strArr) {
                    if (str.equalsIgnoreCase(this.f7122b[0])) {
                        set = this.f7124d;
                        break;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str2 : strArr) {
                    for (String str3 : this.f7122b) {
                        if (str3.equalsIgnoreCase(str2)) {
                            hashSet.add(str3);
                            break;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f7123c.b(set);
            }
        }
    }

    public e(h hVar, Map map, Map map2, String... strArr) {
        this.f7105d = hVar;
        this.f7109h = new b(strArr.length);
        this.f7104c = map2;
        this.f7110i = new androidx.room.d(hVar);
        int length = strArr.length;
        this.f7103b = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f7102a.put(lowerCase, Integer.valueOf(i10));
            String str2 = (String) map.get(strArr[i10]);
            if (str2 != null) {
                this.f7103b[i10] = str2.toLowerCase(locale);
            } else {
                this.f7103b[i10] = lowerCase;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.f7102a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap map3 = this.f7102a;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }

    private static void b(StringBuilder sb2, String str, String str2) {
        sb2.append("`");
        sb2.append("room_table_modification_trigger_");
        sb2.append(str);
        sb2.append("_");
        sb2.append(str2);
        sb2.append("`");
    }

    private String[] h(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f7104c.containsKey(lowerCase)) {
                hashSet.addAll((Collection) this.f7104c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private void j(p4.b bVar, int i10) {
        bVar.B("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f7103b[i10];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f7101m) {
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            b(sb2, str, str2);
            sb2.append(" AFTER ");
            sb2.append(str2);
            sb2.append(" ON `");
            sb2.append(str);
            sb2.append("` BEGIN UPDATE ");
            sb2.append("room_table_modification_log");
            sb2.append(" SET ");
            sb2.append("invalidated");
            sb2.append(" = 1");
            sb2.append(" WHERE ");
            sb2.append("table_id");
            sb2.append(" = ");
            sb2.append(i10);
            sb2.append(" AND ");
            sb2.append("invalidated");
            sb2.append(" = 0");
            sb2.append("; END");
            bVar.B(sb2.toString());
        }
    }

    private void k(p4.b bVar, int i10) {
        String str = this.f7103b[i10];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f7101m) {
            sb2.setLength(0);
            sb2.append("DROP TRIGGER IF EXISTS ");
            b(sb2, str, str2);
            bVar.B(sb2.toString());
        }
    }

    public void a(c cVar) {
        d dVar;
        String[] strArrH = h(cVar.f7120a);
        int[] iArr = new int[strArrH.length];
        int length = strArrH.length;
        for (int i10 = 0; i10 < length; i10++) {
            Integer num = (Integer) this.f7102a.get(strArrH[i10].toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + strArrH[i10]);
            }
            iArr[i10] = num.intValue();
        }
        d dVar2 = new d(cVar, iArr, strArrH);
        synchronized (this.f7111j) {
            dVar = (d) this.f7111j.e(cVar, dVar2);
        }
        if (dVar == null && this.f7109h.b(iArr)) {
            l();
        }
    }

    boolean c() {
        if (!this.f7105d.o()) {
            return false;
        }
        if (!this.f7107f) {
            this.f7105d.i().getWritableDatabase();
        }
        if (this.f7107f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    void d(p4.b bVar) {
        synchronized (this) {
            try {
                if (this.f7107f) {
                    Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                    return;
                }
                bVar.B("PRAGMA temp_store = MEMORY;");
                bVar.B("PRAGMA recursive_triggers='ON';");
                bVar.B("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                m(bVar);
                this.f7108g = bVar.j0("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
                this.f7107f = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(String... strArr) {
        synchronized (this.f7111j) {
            try {
                for (Map.Entry entry : this.f7111j) {
                    if (!((c) entry.getKey()).a()) {
                        ((d) entry.getValue()).b(strArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void f() {
        if (this.f7106e.compareAndSet(false, true)) {
            this.f7105d.j().execute(this.f7113l);
        }
    }

    public void g(c cVar) {
        d dVar;
        synchronized (this.f7111j) {
            dVar = (d) this.f7111j.f(cVar);
        }
        if (dVar == null || !this.f7109h.c(dVar.f7121a)) {
            return;
        }
        l();
    }

    void i(Context context, String str) {
        this.f7112k = new f(context, str, this, this.f7105d.j());
    }

    void l() {
        if (this.f7105d.o()) {
            m(this.f7105d.i().getWritableDatabase());
        }
    }

    void m(p4.b bVar) {
        if (bVar.J0()) {
            return;
        }
        while (true) {
            try {
                Lock lockH = this.f7105d.h();
                lockH.lock();
                try {
                    int[] iArrA = this.f7109h.a();
                    if (iArrA == null) {
                        lockH.unlock();
                        return;
                    }
                    int length = iArrA.length;
                    bVar.x();
                    for (int i10 = 0; i10 < length; i10++) {
                        try {
                            int i11 = iArrA[i10];
                            if (i11 == 1) {
                                j(bVar, i10);
                            } else if (i11 == 2) {
                                k(bVar, i10);
                            }
                        } catch (Throwable th2) {
                            bVar.P();
                            throw th2;
                        }
                    }
                    bVar.L();
                    bVar.P();
                    this.f7109h.d();
                    lockH.unlock();
                } catch (Throwable th3) {
                    lockH.unlock();
                    throw th3;
                }
            } catch (SQLiteException | IllegalStateException e10) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                return;
            }
        }
    }
}

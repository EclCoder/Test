package k9;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class m0 implements k9.d, l9.a, k9.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a9.b f43050f = a9.b.b("proto");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0 f43051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m9.a f43052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m9.a f43053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f43054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final el.a f43055e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface b {
        Object apply(Object obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f43056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f43057b;

        private c(String str, String str2) {
            this.f43056a = str;
            this.f43057b = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface d {
        Object a();
    }

    m0(m9.a aVar, m9.a aVar2, e eVar, v0 v0Var, el.a aVar3) {
        this.f43051a = v0Var;
        this.f43052b = aVar;
        this.f43053c = aVar2;
        this.f43054d = eVar;
        this.f43055e = aVar3;
    }

    public static /* synthetic */ Long F0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    public static /* synthetic */ Object K0(Throwable th2) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th2);
    }

    public static /* synthetic */ Object N0(String str, f9.c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) v1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())}), new b() { // from class: k9.y
            @Override // k9.m0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())});
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("log_source", str);
        contentValues.put("reason", Integer.valueOf(bVar.getNumber()));
        contentValues.put("events_dropped_count", Long.valueOf(j10));
        sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        return null;
    }

    public static /* synthetic */ Object T0(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j10 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j10));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j10), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    public static /* synthetic */ Integer U0(final m0 m0Var, long j10, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        String[] strArr = {String.valueOf(j10)};
        v1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: k9.s
            @Override // k9.m0.b
            public final Object apply(Object obj) {
                return m0.q(this.f43071a, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public static /* synthetic */ Object V0(m0 m0Var, List list, c9.p pVar, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            c9.i.a aVarO = c9.i.a().n(cursor.getString(1)).i(cursor.getLong(2)).o(cursor.getLong(3));
            if (z10) {
                aVarO.h(new c9.h(t1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                aVarO.h(new c9.h(t1(cursor.getString(4)), m0Var.r1(j10)));
            }
            if (!cursor.isNull(6)) {
                aVarO.g(Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                aVarO.l(Integer.valueOf(cursor.getInt(8)));
            }
            if (!cursor.isNull(9)) {
                aVarO.m(cursor.getString(9));
            }
            if (!cursor.isNull(10)) {
                aVarO.j(cursor.getBlob(10));
            }
            if (!cursor.isNull(11)) {
                aVarO.k(cursor.getBlob(11));
            }
            list.add(k.a(j10, pVar, aVarO.d()));
        }
        return null;
    }

    public static /* synthetic */ Object W0(m0 m0Var, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + m0Var.f43052b.a()).execute();
        return null;
    }

    public static /* synthetic */ f9.a X0(final m0 m0Var, String str, final Map map, final f9.a.C0576a c0576a, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        return (f9.a) v1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: k9.a0
            @Override // k9.m0.b
            public final Object apply(Object obj) {
                return m0.g0(this.f43025a, map, c0576a, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Long Y0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static /* synthetic */ f9.f Z0(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (f9.f) v1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: k9.d0
            @Override // k9.m0.b
            public final Object apply(Object obj) {
                return m0.c(j10, (Cursor) obj);
            }
        });
    }

    private f9.c.b a1(int i10) {
        f9.c.b bVar = f9.c.b.REASON_UNKNOWN;
        if (i10 == bVar.getNumber()) {
            return bVar;
        }
        f9.c.b bVar2 = f9.c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.getNumber()) {
            return bVar2;
        }
        f9.c.b bVar3 = f9.c.b.CACHE_FULL;
        if (i10 == bVar3.getNumber()) {
            return bVar3;
        }
        f9.c.b bVar4 = f9.c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.getNumber()) {
            return bVar4;
        }
        f9.c.b bVar5 = f9.c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.getNumber()) {
            return bVar5;
        }
        f9.c.b bVar6 = f9.c.b.INVALID_PAYLOD;
        if (i10 == bVar6.getNumber()) {
            return bVar6;
        }
        f9.c.b bVar7 = f9.c.b.SERVER_ERROR;
        if (i10 == bVar7.getNumber()) {
            return bVar7;
        }
        g9.a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    private void b1(final SQLiteDatabase sQLiteDatabase) {
        s1(new d() { // from class: k9.l
            @Override // k9.m0.d
            public final Object a() {
                return m0.p0(sQLiteDatabase);
            }
        }, new b() { // from class: k9.w
            @Override // k9.m0.b
            public final Object apply(Object obj) {
                return m0.K0((Throwable) obj);
            }
        });
    }

    public static /* synthetic */ f9.f c(long j10, Cursor cursor) {
        cursor.moveToNext();
        return f9.f.c().c(cursor.getLong(0)).b(j10).a();
    }

    public static /* synthetic */ byte[] c0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            byte[] bArr2 = (byte[]) arrayList.get(i10);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    private long c1(SQLiteDatabase sQLiteDatabase, c9.p pVar) {
        Long lJ1 = j1(sQLiteDatabase, pVar);
        if (lJ1 != null) {
            return lJ1.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", pVar.b());
        contentValues.put("priority", Integer.valueOf(n9.a.a(pVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (pVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(pVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    public static /* synthetic */ List d0(SQLiteDatabase sQLiteDatabase) {
        return (List) v1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: k9.k0
            @Override // k9.m0.b
            public final Object apply(Object obj) {
                return m0.k((Cursor) obj);
            }
        });
    }

    private f9.b f1() {
        return f9.b.b().b(f9.e.c().b(d1()).c(e.f43033a.f()).a()).a();
    }

    public static /* synthetic */ f9.a g0(m0 m0Var, Map map, f9.a.C0576a c0576a, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            f9.c.b bVarA1 = m0Var.a1(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(f9.c.c().c(bVarA1).b(j10).a());
        }
        m0Var.q1(c0576a, map);
        return c0576a.e(m0Var.i1()).d(m0Var.f1()).c((String) m0Var.f43055e.get()).b();
    }

    private long g1() {
        return e1().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long h1() {
        return e1().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private f9.f i1() {
        final long jA = this.f43052b.a();
        return (f9.f) k1(new b() { // from class: k9.c0
            @Override // k9.m0.b
            public final Object apply(Object obj) {
                return m0.Z0(jA, (SQLiteDatabase) obj);
            }
        });
    }

    public static /* synthetic */ List j(m0 m0Var, c9.p pVar, SQLiteDatabase sQLiteDatabase) {
        List listN1 = m0Var.n1(sQLiteDatabase, pVar, m0Var.f43054d.d());
        for (a9.e eVar : a9.e.values()) {
            if (eVar != pVar.d()) {
                int iD = m0Var.f43054d.d() - listN1.size();
                if (iD <= 0) {
                    break;
                }
                listN1.addAll(m0Var.n1(sQLiteDatabase, pVar.f(eVar), iD));
            }
        }
        return m0Var.m1(listN1, m0Var.o1(sQLiteDatabase, listN1));
    }

    private Long j1(SQLiteDatabase sQLiteDatabase, c9.p pVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(pVar.b(), String.valueOf(n9.a.a(pVar.d()))));
        if (pVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(pVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) v1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: k9.n
            @Override // k9.m0.b
            public final Object apply(Object obj) {
                return m0.F0((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ List k(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(c9.p.a().b(cursor.getString(1)).d(n9.a.b(cursor.getInt(2))).c(p1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public static /* synthetic */ Object l(m0 m0Var, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            m0Var.i(cursor.getInt(0), f9.c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    private boolean l1() {
        return g1() * h1() >= this.f43054d.f();
    }

    public static /* synthetic */ SQLiteDatabase m(Throwable th2) {
        throw new SynchronizationException("Timed out while trying to open db.", th2);
    }

    public static /* synthetic */ Long m0(m0 m0Var, c9.i iVar, c9.p pVar, SQLiteDatabase sQLiteDatabase) {
        if (m0Var.l1()) {
            m0Var.i(1L, f9.c.b.CACHE_FULL, iVar.n());
            return -1L;
        }
        long jC1 = m0Var.c1(sQLiteDatabase, pVar);
        int iE = m0Var.f43054d.e();
        byte[] bArrA = iVar.e().a();
        boolean z10 = bArrA.length <= iE;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jC1));
        contentValues.put("transport_name", iVar.n());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.o()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? bArrA : new byte[0]);
        contentValues.put("product_id", iVar.l());
        contentValues.put("pseudonymous_id", iVar.m());
        contentValues.put("experiment_ids_clear_blob", iVar.g());
        contentValues.put("experiment_ids_encrypted_blob", iVar.h());
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z10) {
            int iCeil = (int) Math.ceil(((double) bArrA.length) / ((double) iE));
            for (int i10 = 1; i10 <= iCeil; i10++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, (i10 - 1) * iE, Math.min(i10 * iE, bArrA.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : iVar.k().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    private List m1(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            k kVar = (k) listIterator.next();
            if (map.containsKey(Long.valueOf(kVar.c()))) {
                c9.i.a aVarP = kVar.b().p();
                for (c cVar : (Set) map.get(Long.valueOf(kVar.c()))) {
                    aVarP.c(cVar.f43056a, cVar.f43057b);
                }
                listIterator.set(k.a(kVar.c(), kVar.d(), aVarP.d()));
            }
        }
        return list;
    }

    private List n1(SQLiteDatabase sQLiteDatabase, final c9.p pVar, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long lJ1 = j1(sQLiteDatabase, pVar);
        if (lJ1 == null) {
            return arrayList;
        }
        v1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lJ1.toString()}, null, null, null, String.valueOf(i10)), new b() { // from class: k9.x
            @Override // k9.m0.b
            public final Object apply(Object obj) {
                return m0.V0(this.f43092a, arrayList, pVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    private Map o1(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(((k) list.get(i10)).c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        v1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", AppMeasurementSdk.ConditionalUserProperty.VALUE}, sb2.toString(), null, null, null, null), new b() { // from class: k9.z
            @Override // k9.m0.b
            public final Object apply(Object obj) {
                return m0.T0(map, (Cursor) obj);
            }
        });
        return map;
    }

    public static /* synthetic */ Object p0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    private static byte[] p1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static /* synthetic */ Object q(m0 m0Var, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            m0Var.i(cursor.getInt(0), f9.c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    private void q1(f9.a.C0576a c0576a, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            c0576a.a(f9.d.c().c((String) entry.getKey()).b((List) entry.getValue()).a());
        }
    }

    public static /* synthetic */ Object r(final m0 m0Var, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        v1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: k9.v
            @Override // k9.m0.b
            public final Object apply(Object obj) {
                return m0.l(this.f43076a, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    private byte[] r1(long j10) {
        return (byte[]) v1(e1().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new b() { // from class: k9.b0
            @Override // k9.m0.b
            public final Object apply(Object obj) {
                return m0.c0((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Boolean s(m0 m0Var, c9.p pVar, SQLiteDatabase sQLiteDatabase) {
        Long lJ1 = m0Var.j1(sQLiteDatabase, pVar);
        return lJ1 == null ? Boolean.FALSE : (Boolean) v1(m0Var.e1().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lJ1.toString()}), new b() { // from class: k9.u
            @Override // k9.m0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    private Object s1(d dVar, b bVar) {
        long jA = this.f43053c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f43053c.a() >= ((long) this.f43054d.b()) + jA) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public static /* synthetic */ Object t(long j10, c9.p pVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(n9.a.a(pVar.d()))}) < 1) {
            contentValues.put("backend_name", pVar.b());
            contentValues.put("priority", Integer.valueOf(n9.a.a(pVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    private static a9.b t1(String str) {
        return str == null ? f43050f : a9.b.b(str);
    }

    private static String u1(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((k) it.next()).c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    static Object v1(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // k9.d
    public void F(final c9.p pVar, final long j10) {
        k1(new b() { // from class: k9.p
            @Override // k9.m0.b
            public final Object apply(Object obj) {
                return m0.t(j10, pVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // k9.d
    public Iterable G() {
        return (Iterable) k1(new b() { // from class: k9.g0
            @Override // k9.m0.b
            public final Object apply(Object obj) {
                return m0.d0((SQLiteDatabase) obj);
            }
        });
    }

    @Override // k9.d
    public k M0(final c9.p pVar, final c9.i iVar) {
        g9.a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", pVar.d(), iVar.n(), pVar.b());
        long jLongValue = ((Long) k1(new b() { // from class: k9.i0
            @Override // k9.m0.b
            public final Object apply(Object obj) {
                return m0.m0(this.f43038a, iVar, pVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return k.a(jLongValue, pVar, iVar);
    }

    @Override // k9.d
    public Iterable T(final c9.p pVar) {
        return (Iterable) k1(new b() { // from class: k9.m
            @Override // k9.m0.b
            public final Object apply(Object obj) {
                return m0.j(this.f43048a, pVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // k9.d
    public void Y(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + u1(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            k1(new b() { // from class: k9.l0
                @Override // k9.m0.b
                public final Object apply(Object obj) {
                    return m0.r(this.f43045a, str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override // l9.a
    public Object a(l9.a.InterfaceC0670a interfaceC0670a) {
        SQLiteDatabase sQLiteDatabaseE1 = e1();
        b1(sQLiteDatabaseE1);
        try {
            Object objExecute = interfaceC0670a.execute();
            sQLiteDatabaseE1.setTransactionSuccessful();
            return objExecute;
        } finally {
            sQLiteDatabaseE1.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f43051a.close();
    }

    @Override // k9.c
    public void d() {
        k1(new b() { // from class: k9.q
            @Override // k9.m0.b
            public final Object apply(Object obj) {
                return m0.W0(this.f43067a, (SQLiteDatabase) obj);
            }
        });
    }

    long d1() {
        return g1() * h1();
    }

    SQLiteDatabase e1() {
        final v0 v0Var = this.f43051a;
        Objects.requireNonNull(v0Var);
        return (SQLiteDatabase) s1(new d() { // from class: k9.e0
            @Override // k9.m0.d
            public final Object a() {
                return v0Var.getWritableDatabase();
            }
        }, new b() { // from class: k9.f0
            @Override // k9.m0.b
            public final Object apply(Object obj) {
                return m0.m((Throwable) obj);
            }
        });
    }

    @Override // k9.c
    public f9.a h() {
        final f9.a.C0576a c0576aE = f9.a.e();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (f9.a) k1(new b() { // from class: k9.t
            @Override // k9.m0.b
            public final Object apply(Object obj) {
                return m0.X0(this.f43072a, str, map, c0576aE, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // k9.c
    public void i(final long j10, final f9.c.b bVar, final String str) {
        k1(new b() { // from class: k9.r
            @Override // k9.m0.b
            public final Object apply(Object obj) {
                return m0.N0(str, bVar, j10, (SQLiteDatabase) obj);
            }
        });
    }

    Object k1(b bVar) {
        SQLiteDatabase sQLiteDatabaseE1 = e1();
        sQLiteDatabaseE1.beginTransaction();
        try {
            Object objApply = bVar.apply(sQLiteDatabaseE1);
            sQLiteDatabaseE1.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseE1.endTransaction();
        }
    }

    @Override // k9.d
    public boolean r0(final c9.p pVar) {
        return ((Boolean) k1(new b() { // from class: k9.o
            @Override // k9.m0.b
            public final Object apply(Object obj) {
                return m0.s(this.f43063a, pVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // k9.d
    public long t0(c9.p pVar) {
        return ((Long) v1(e1().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(n9.a.a(pVar.d()))}), new b() { // from class: k9.h0
            @Override // k9.m0.b
            public final Object apply(Object obj) {
                return m0.Y0((Cursor) obj);
            }
        })).longValue();
    }

    @Override // k9.d
    public int y() {
        final long jA = this.f43052b.a() - this.f43054d.c();
        return ((Integer) k1(new b() { // from class: k9.j0
            @Override // k9.m0.b
            public final Object apply(Object obj) {
                return m0.U0(this.f43042a, jA, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // k9.d
    public void z(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            e1().compileStatement("DELETE FROM events WHERE _id in " + u1(iterable)).execute();
        }
    }
}

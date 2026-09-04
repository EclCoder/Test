package k9;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.hecorat.screenrecorder.free.models.Ke.Lykgign;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class v0 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f43077c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static int f43078d = 7;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f43079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f43080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f43081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f43082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f43083i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a f43084j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f43085k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final List f43086l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f43087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f43088b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: k9.o0
            @Override // k9.v0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                v0.a(sQLiteDatabase);
            }
        };
        f43079e = aVar;
        a aVar2 = new a() { // from class: k9.p0
            @Override // k9.v0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                v0.j(sQLiteDatabase);
            }
        };
        f43080f = aVar2;
        a aVar3 = new a() { // from class: k9.q0
            @Override // k9.v0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f43081g = aVar3;
        a aVar4 = new a() { // from class: k9.r0
            @Override // k9.v0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                v0.k(sQLiteDatabase);
            }
        };
        f43082h = aVar4;
        a aVar5 = new a() { // from class: k9.s0
            @Override // k9.v0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                v0.h(sQLiteDatabase);
            }
        };
        f43083i = aVar5;
        a aVar6 = new a() { // from class: k9.t0
            @Override // k9.v0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
            }
        };
        f43084j = aVar6;
        a aVar7 = new a() { // from class: k9.u0
            @Override // k9.v0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                v0.c(sQLiteDatabase);
            }
        };
        f43085k = aVar7;
        f43086l = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    v0(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f43088b = false;
        this.f43087a = i10;
    }

    public static /* synthetic */ void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    public static /* synthetic */ void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
    }

    public static /* synthetic */ void h(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f43077c);
    }

    public static /* synthetic */ void j(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    public static /* synthetic */ void k(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    private void l(SQLiteDatabase sQLiteDatabase) {
        if (this.f43088b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    private void m(SQLiteDatabase sQLiteDatabase, int i10) {
        l(sQLiteDatabase);
        q(sQLiteDatabase, 0, i10);
    }

    private void q(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List list = f43086l;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                ((a) f43086l.get(i10)).a(sQLiteDatabase);
                i10++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i10 + " to " + i11 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f43088b = true;
        sQLiteDatabase.rawQuery(Lykgign.YTsnbt, new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m(sQLiteDatabase, this.f43087a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        m(sQLiteDatabase, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        l(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        l(sQLiteDatabase);
        q(sQLiteDatabase, i10, i11);
    }
}

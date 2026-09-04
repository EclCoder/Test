package n7;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.h0;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f46906g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Long f46907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f46908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private UUID f46909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f46910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Long f46911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p f46912f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a() {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(h0.m()).edit();
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
            editorEdit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionId");
            editorEdit.apply();
            p.f46916c.a();
        }

        public final n b() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(h0.m());
            long j10 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
            long j11 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
            String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
            if (j10 == 0 || j11 == 0 || string == null) {
                return null;
            }
            n nVar = new n(Long.valueOf(j10), Long.valueOf(j11), null, 4, null);
            nVar.f46910d = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
            nVar.l(p.f46916c.b());
            nVar.i(Long.valueOf(System.currentTimeMillis()));
            UUID uuidFromString = UUID.fromString(string);
            s.g(uuidFromString, "fromString(sessionIDStr)");
            nVar.j(uuidFromString);
            return nVar;
        }

        private a() {
        }
    }

    public n(Long l10, Long l11, UUID sessionId) {
        s.h(sessionId, "sessionId");
        this.f46907a = l10;
        this.f46908b = l11;
        this.f46909c = sessionId;
    }

    public final Long b() {
        Long l10 = this.f46911e;
        if (l10 == null) {
            return 0L;
        }
        return l10;
    }

    public final int c() {
        return this.f46910d;
    }

    public final UUID d() {
        return this.f46909c;
    }

    public final Long e() {
        return this.f46908b;
    }

    public final long f() {
        Long l10;
        if (this.f46907a == null || (l10 = this.f46908b) == null) {
            return 0L;
        }
        if (l10 != null) {
            return l10.longValue() - this.f46907a.longValue();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final p g() {
        return this.f46912f;
    }

    public final void h() {
        this.f46910d++;
    }

    public final void i(Long l10) {
        this.f46911e = l10;
    }

    public final void j(UUID uuid) {
        s.h(uuid, "<set-?>");
        this.f46909c = uuid;
    }

    public final void k(Long l10) {
        this.f46908b = l10;
    }

    public final void l(p pVar) {
        this.f46912f = pVar;
    }

    public final void m() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(h0.m()).edit();
        Long l10 = this.f46907a;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l10 != null ? l10.longValue() : 0L);
        Long l11 = this.f46908b;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l11 != null ? l11.longValue() : 0L);
        editorEdit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f46910d);
        editorEdit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f46909c.toString());
        editorEdit.apply();
        p pVar = this.f46912f;
        if (pVar == null || pVar == null) {
            return;
        }
        pVar.a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ n(Long l10, Long l11, UUID uuid, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 4) != 0) {
            uuid = UUID.randomUUID();
            s.g(uuid, "randomUUID()");
        }
        this(l10, l11, uuid);
    }
}

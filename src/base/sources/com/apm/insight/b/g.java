package com.apm.insight.b;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.apm.insight.runtime.p;
import com.google.api.client.http.HttpStatusCodes;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f10550r = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f10551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f10553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f10554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f f10556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f10557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f10558h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f10559i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f10560j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f10561k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f10562l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.apm.insight.b.e f10563m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f10564n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f10565o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final p f10566p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile boolean f10567q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Runnable f10568s;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f10577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f10578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f10579c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f10580d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10581e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        StackTraceElement[] f10582f;

        private a() {
        }

        /* synthetic */ a(byte b10) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        a f10583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10584b;

        final void a(a aVar) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class d {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f10585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f10586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f10587c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f10588d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10589e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f10590f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f10591g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        String f10592h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f10593i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f10594j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private d f10595k;

        public final JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, g.a(this.f10592h));
                jSONObject.put("cpuDuration", this.f10591g);
                jSONObject.put("duration", this.f10590f);
                jSONObject.put("type", this.f10588d);
                jSONObject.put("count", this.f10589e);
                jSONObject.put("messageCount", this.f10589e);
                jSONObject.put("lastDuration", this.f10586b - this.f10587c);
                jSONObject.put("start", this.f10585a);
                jSONObject.put(TtmlNode.END, this.f10586b);
                jSONObject.put("block_uuid", (Object) null);
                jSONObject.put("sblock_uuid", (Object) null);
                jSONObject.put("belong_frame", false);
                return jSONObject;
            } catch (JSONException e10) {
                e10.printStackTrace();
                return jSONObject;
            }
        }

        final void b() {
            this.f10588d = -1;
            this.f10589e = -1;
            this.f10590f = -1L;
            this.f10592h = null;
            this.f10594j = null;
            this.f10595k = null;
            this.f10593i = null;
        }
    }

    public g() {
        this((byte) 0);
    }

    static /* synthetic */ b c() {
        return null;
    }

    static /* synthetic */ p e() {
        return null;
    }

    private g(byte b10) {
        this.f10552b = 0;
        this.f10553c = 0;
        this.f10554d = 100;
        this.f10555e = 200;
        this.f10557g = -1L;
        this.f10558h = -1L;
        this.f10559i = -1;
        this.f10560j = -1L;
        this.f10564n = false;
        this.f10565o = false;
        this.f10567q = false;
        this.f10568s = new Runnable() { // from class: com.apm.insight.b.g.2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f10571b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f10570a = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f10572c = -1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f10573d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f10574e = 0;

            @Override // java.lang.Runnable
            public final void run() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (g.c().f10583a != null) {
                    throw null;
                }
                a aVar = new a((byte) 0);
                if (this.f10572c == g.this.f10553c) {
                    this.f10573d++;
                } else {
                    this.f10573d = 0;
                    this.f10574e = 0;
                    this.f10571b = jUptimeMillis;
                }
                this.f10572c = g.this.f10553c;
                int i10 = this.f10573d;
                if (i10 > 0 && i10 - this.f10574e >= g.f10550r && this.f10570a != 0 && jUptimeMillis - this.f10571b > 700 && g.this.f10567q) {
                    aVar.f10582f = Looper.getMainLooper().getThread().getStackTrace();
                    this.f10574e = this.f10573d;
                }
                aVar.f10580d = g.this.f10567q;
                aVar.f10579c = (jUptimeMillis - this.f10570a) - 300;
                aVar.f10577a = jUptimeMillis;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                this.f10570a = jUptimeMillis2;
                aVar.f10578b = jUptimeMillis2 - jUptimeMillis;
                aVar.f10581e = g.this.f10553c;
                g.e().a(g.this.f10568s, 300L);
                g.c().a(aVar);
            }
        };
        this.f10551a = new c() { // from class: com.apm.insight.b.g.1
        };
        this.f10566p = null;
    }

    static /* synthetic */ int d(g gVar) {
        int i10 = gVar.f10552b;
        gVar.f10552b = i10 + 1;
        return i10;
    }

    public final JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        try {
            int i10 = 0;
            for (e eVar : this.f10556f.a()) {
                if (eVar != null) {
                    i10++;
                    jSONArray.put(eVar.a().put("id", i10));
                }
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    public final void a() {
        if (this.f10564n) {
            return;
        }
        this.f10564n = true;
        this.f10554d = 100;
        this.f10555e = HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES;
        this.f10556f = new f(100);
        this.f10563m = new com.apm.insight.b.e() { // from class: com.apm.insight.b.g.3
            @Override // com.apm.insight.b.e
            public final boolean a() {
                return true;
            }

            @Override // com.apm.insight.b.e
            public final void b(String str) {
                super.b(str);
                g.d(g.this);
                g.a(g.this, false, com.apm.insight.b.e.f10544a);
                g gVar = g.this;
                gVar.f10561k = gVar.f10562l;
                g.this.f10562l = "no message running";
                g.this.f10567q = false;
            }

            @Override // com.apm.insight.b.e
            public final void a(String str) {
                g.this.f10567q = true;
                g.this.f10562l = str;
                super.a(str);
                g.a(g.this, true, com.apm.insight.b.e.f10544a);
            }
        };
        h.a();
        h.a(this.f10563m);
        j.a(j.a());
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f10596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private e f10598c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<e> f10599d = new ArrayList();

        f(int i10) {
            this.f10596a = i10;
        }

        final e a(int i10) {
            e eVar = this.f10598c;
            if (eVar != null) {
                eVar.f10588d = i10;
                this.f10598c = null;
                return eVar;
            }
            e eVar2 = new e();
            eVar2.f10588d = i10;
            return eVar2;
        }

        final void a(e eVar) {
            int size = this.f10599d.size();
            int i10 = this.f10596a;
            if (size < i10) {
                this.f10599d.add(eVar);
                this.f10597b = this.f10599d.size();
                return;
            }
            int i11 = this.f10597b % i10;
            this.f10597b = i11;
            e eVar2 = this.f10599d.set(i11, eVar);
            eVar2.b();
            this.f10598c = eVar2;
            this.f10597b++;
        }

        final List<e> a() {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            if (this.f10599d.size() == this.f10596a) {
                for (int i11 = this.f10597b; i11 < this.f10599d.size(); i11++) {
                    arrayList.add(this.f10599d.get(i11));
                }
                while (i10 < this.f10597b - 1) {
                    arrayList.add(this.f10599d.get(i10));
                    i10++;
                }
            } else {
                while (i10 < this.f10599d.size()) {
                    arrayList.add(this.f10599d.get(i10));
                    i10++;
                }
            }
            return arrayList;
        }
    }

    private void a(int i10, long j10, String str) {
        a(i10, j10, str, true);
    }

    private void a(int i10, long j10, String str, boolean z10) {
        this.f10565o = true;
        e eVarA = this.f10556f.a(i10);
        eVarA.f10590f = j10 - this.f10557g;
        if (z10) {
            long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            eVarA.f10591g = jCurrentThreadTimeMillis - this.f10560j;
            this.f10560j = jCurrentThreadTimeMillis;
        } else {
            eVarA.f10591g = -1L;
        }
        eVarA.f10589e = this.f10552b;
        eVarA.f10592h = str;
        eVarA.f10593i = this.f10561k;
        eVarA.f10585a = this.f10557g;
        eVarA.f10586b = j10;
        eVarA.f10587c = this.f10558h;
        this.f10556f.a(eVarA);
        this.f10552b = 0;
        this.f10557g = j10;
    }

    public final e a(long j10) {
        e eVar = new e();
        eVar.f10592h = this.f10562l;
        eVar.f10593i = this.f10561k;
        eVar.f10590f = j10 - this.f10558h;
        eVar.f10591g = 0 - this.f10560j;
        eVar.f10589e = this.f10552b;
        return eVar;
    }

    public static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "unknown message";
        }
        try {
            String[] strArrSplit = str.split(":");
            String str3 = strArrSplit.length == 2 ? strArrSplit[1] : "";
            if (str.contains("{") && str.contains("}")) {
                str2 = str.split("\\{")[0];
                try {
                    str = str2 + str.split("\\}")[1];
                } catch (Throwable unused) {
                    return str2;
                }
            } else {
                str2 = str;
            }
            if (str.contains("@")) {
                String[] strArrSplit2 = str.split("@");
                if (strArrSplit2.length > 1) {
                    str = strArrSplit2[0];
                }
            }
            if (str.contains("(") && str.contains(")") && !str.endsWith(" null")) {
                String[] strArrSplit3 = str.split("\\(");
                if (strArrSplit3.length > 1) {
                    str = strArrSplit3[1];
                }
                str = str.replace(")", "");
            }
            if (str.startsWith(" ")) {
                str = str.replace(" ", "");
            }
            return str + str3;
        } catch (Throwable unused2) {
            return str;
        }
    }

    static /* synthetic */ void a(g gVar, boolean z10, long j10) {
        int i10 = gVar.f10553c + 1;
        gVar.f10553c = i10;
        gVar.f10553c = i10 & 65535;
        gVar.f10565o = false;
        if (gVar.f10557g < 0) {
            gVar.f10557g = j10;
        }
        if (gVar.f10558h < 0) {
            gVar.f10558h = j10;
        }
        if (gVar.f10559i < 0) {
            gVar.f10559i = Process.myTid();
            gVar.f10560j = SystemClock.currentThreadTimeMillis();
        }
        long j11 = j10 - gVar.f10557g;
        int i11 = gVar.f10555e;
        if (j11 > i11) {
            long j12 = gVar.f10558h;
            if (j10 - j12 <= i11) {
                gVar.a(9, j10, gVar.f10562l);
            } else if (z10) {
                if (gVar.f10552b == 0) {
                    gVar.a(1, j10, "no message running");
                } else {
                    gVar.a(9, j12, gVar.f10561k);
                    gVar.a(1, j10, "no message running", false);
                }
            } else if (gVar.f10552b == 0) {
                gVar.a(8, j10, gVar.f10562l, true);
            } else {
                gVar.a(9, j12, gVar.f10561k, false);
                gVar.a(8, j10, gVar.f10562l, true);
            }
        }
        gVar.f10558h = j10;
    }
}

package jn;

import bm.r;
import com.google.api.client.http.HttpStatusCodes;
import com.mbridge.msdk.foundation.download.Command;
import gn.d0;
import gn.f0;
import gn.x;
import hn.m;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f42699c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f42700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f0 f42701b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:24:0x003b  */
        public final boolean a(f0 response, d0 request) {
            s.h(response, "response");
            s.h(request, "request");
            int iM = response.m();
            if (iM != 200 && iM != 410 && iM != 414 && iM != 501 && iM != 203 && iM != 204) {
                if (iM == 307) {
                    if (f0.c0(response, "Expires", null, 2, null) == null && response.h().e() == -1 && !response.h().d() && !response.h().c()) {
                        return false;
                    }
                } else if (iM != 308 && iM != 404 && iM != 405) {
                    switch (iM) {
                        case HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES /* 300 */:
                        case 301:
                            break;
                        case 302:
                            if (f0.c0(response, "Expires", null, 2, null) == null) {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                }
            }
            return (response.h().j() || request.b().j()) ? false : true;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f42702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d0 f42703b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f0 f42704c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Date f42705d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f42706e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Date f42707f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f42708g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Date f42709h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f42710i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f42711j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f42712k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f42713l;

        public b(long j10, d0 request, f0 f0Var) {
            s.h(request, "request");
            this.f42702a = j10;
            this.f42703b = request;
            this.f42704c = f0Var;
            this.f42713l = -1;
            if (f0Var != null) {
                this.f42710i = f0Var.V0();
                this.f42711j = f0Var.T0();
                x xVarD0 = f0Var.d0();
                int size = xVarD0.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String strD = xVarD0.d(i10);
                    String strH = xVarD0.h(i10);
                    if (r.A(strD, "Date", true)) {
                        this.f42705d = mn.c.a(strH);
                        this.f42706e = strH;
                    } else if (r.A(strD, "Expires", true)) {
                        this.f42709h = mn.c.a(strH);
                    } else if (r.A(strD, "Last-Modified", true)) {
                        this.f42707f = mn.c.a(strH);
                        this.f42708g = strH;
                    } else if (r.A(strD, Command.HTTP_HEADER_ETAG, true)) {
                        this.f42712k = strH;
                    } else if (r.A(strD, "Age", true)) {
                        this.f42713l = m.D(strH, -1);
                    }
                }
            }
        }

        private final long a() {
            Date date = this.f42705d;
            long jMax = date != null ? Math.max(0L, this.f42711j - date.getTime()) : 0L;
            int i10 = this.f42713l;
            if (i10 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i10));
            }
            return jMax + Math.max(0L, this.f42711j - this.f42710i) + Math.max(0L, this.f42702a - this.f42711j);
        }

        private final d c() {
            String str;
            if (this.f42704c == null) {
                return new d(this.f42703b, null);
            }
            if (this.f42703b.h() && this.f42704c.r() == null) {
                return new d(this.f42703b, null);
            }
            if (!d.f42699c.a(this.f42704c, this.f42703b)) {
                return new d(this.f42703b, null);
            }
            gn.d dVarB = this.f42703b.b();
            if (dVarB.i() || e(this.f42703b)) {
                return new d(this.f42703b, null);
            }
            gn.d dVarH = this.f42704c.h();
            long jA = a();
            long jD = d();
            if (dVarB.e() != -1) {
                jD = Math.min(jD, TimeUnit.SECONDS.toMillis(dVarB.e()));
            }
            long millis = 0;
            long millis2 = dVarB.g() != -1 ? TimeUnit.SECONDS.toMillis(dVarB.g()) : 0L;
            if (!dVarH.h() && dVarB.f() != -1) {
                millis = TimeUnit.SECONDS.toMillis(dVarB.f());
            }
            if (!dVarH.i()) {
                long j10 = millis2 + jA;
                if (j10 < millis + jD) {
                    f0.a aVarF0 = this.f42704c.F0();
                    if (j10 >= jD) {
                        aVarF0.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (jA > com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS && f()) {
                        aVarF0.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new d(null, aVarF0.c());
                }
            }
            String str2 = this.f42712k;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.f42707f != null) {
                    str2 = this.f42708g;
                } else {
                    if (this.f42705d == null) {
                        return new d(this.f42703b, null);
                    }
                    str2 = this.f42706e;
                }
                str = "If-Modified-Since";
            }
            x.a aVarF = this.f42703b.f().f();
            s.e(str2);
            aVarF.c(str, str2);
            return new d(this.f42703b.j().o(aVarF.d()).b(), this.f42704c);
        }

        private final long d() {
            f0 f0Var = this.f42704c;
            s.e(f0Var);
            gn.d dVarH = f0Var.h();
            if (dVarH.e() != -1) {
                return TimeUnit.SECONDS.toMillis(dVarH.e());
            }
            Date date = this.f42709h;
            if (date != null) {
                Date date2 = this.f42705d;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f42711j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f42707f != null && this.f42704c.U0().m().m() == null) {
                Date date3 = this.f42705d;
                long time2 = date3 != null ? date3.getTime() : this.f42710i;
                Date date4 = this.f42707f;
                s.e(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / ((long) 10);
                }
            }
            return 0L;
        }

        private final boolean e(d0 d0Var) {
            return (d0Var.e("If-Modified-Since") == null && d0Var.e("If-None-Match") == null) ? false : true;
        }

        private final boolean f() {
            f0 f0Var = this.f42704c;
            s.e(f0Var);
            return f0Var.h().e() == -1 && this.f42709h == null;
        }

        public final d b() {
            d dVarC = c();
            return (dVarC.b() == null || !this.f42703b.b().l()) ? dVarC : new d(null, null);
        }
    }

    public d(d0 d0Var, f0 f0Var) {
        this.f42700a = d0Var;
        this.f42701b = f0Var;
    }

    public final f0 a() {
        return this.f42701b;
    }

    public final d0 b() {
        return this.f42700a;
    }
}

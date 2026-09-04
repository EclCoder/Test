package i5;

import android.database.Cursor;
import com.google.ads.mediation.admob.Mvp.IAoPeRfJn;
import java.util.ArrayList;
import java.util.List;
import v7.XOSD.qnwOeeQSSWa;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class r implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.h f41060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k4.a f41061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k4.d f41062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k4.d f41063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k4.d f41064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k4.d f41065f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k4.d f41066g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final k4.d f41067h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k4.d f41068i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final k4.d f41069j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class a extends k4.a {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // k4.d
        public String d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // k4.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(p4.f fVar, p pVar) throws Throwable {
            String str = pVar.f41040a;
            if (str == null) {
                fVar.E0(1);
            } else {
                fVar.h0(1, str);
            }
            fVar.s0(2, v.j(pVar.f41041b));
            String str2 = pVar.f41042c;
            if (str2 == null) {
                fVar.E0(3);
            } else {
                fVar.h0(3, str2);
            }
            String str3 = pVar.f41043d;
            if (str3 == null) {
                fVar.E0(4);
            } else {
                fVar.h0(4, str3);
            }
            byte[] bArrK = androidx.work.e.k(pVar.f41044e);
            if (bArrK == null) {
                fVar.E0(5);
            } else {
                fVar.u0(5, bArrK);
            }
            byte[] bArrK2 = androidx.work.e.k(pVar.f41045f);
            if (bArrK2 == null) {
                fVar.E0(6);
            } else {
                fVar.u0(6, bArrK2);
            }
            fVar.s0(7, pVar.f41046g);
            fVar.s0(8, pVar.f41047h);
            fVar.s0(9, pVar.f41048i);
            fVar.s0(10, pVar.f41050k);
            fVar.s0(11, v.a(pVar.f41051l));
            fVar.s0(12, pVar.f41052m);
            fVar.s0(13, pVar.f41053n);
            fVar.s0(14, pVar.f41054o);
            fVar.s0(15, pVar.f41055p);
            fVar.s0(16, pVar.f41056q ? 1L : 0L);
            fVar.s0(17, v.i(pVar.f41057r));
            androidx.work.c cVar = pVar.f41049j;
            if (cVar == null) {
                fVar.E0(18);
                fVar.E0(19);
                fVar.E0(20);
                fVar.E0(21);
                fVar.E0(22);
                fVar.E0(23);
                fVar.E0(24);
                fVar.E0(25);
                return;
            }
            fVar.s0(18, v.h(cVar.b()));
            fVar.s0(19, cVar.g() ? 1L : 0L);
            fVar.s0(20, cVar.h() ? 1L : 0L);
            fVar.s0(21, cVar.f() ? 1L : 0L);
            fVar.s0(22, cVar.i() ? 1L : 0L);
            fVar.s0(23, cVar.c());
            fVar.s0(24, cVar.d());
            byte[] bArrC = v.c(cVar.a());
            if (bArrC == null) {
                fVar.E0(25);
            } else {
                fVar.u0(25, bArrC);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class b extends k4.d {
        b(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // k4.d
        public String d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class c extends k4.d {
        c(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // k4.d
        public String d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class d extends k4.d {
        d(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // k4.d
        public String d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class e extends k4.d {
        e(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // k4.d
        public String d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class f extends k4.d {
        f(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // k4.d
        public String d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class g extends k4.d {
        g(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // k4.d
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class h extends k4.d {
        h(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // k4.d
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class i extends k4.d {
        i(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // k4.d
        public String d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public r(androidx.room.h hVar) {
        this.f41060a = hVar;
        this.f41061b = new a(hVar);
        this.f41062c = new b(hVar);
        this.f41063d = new c(hVar);
        this.f41064e = new d(hVar);
        this.f41065f = new e(hVar);
        this.f41066g = new f(hVar);
        this.f41067h = new g(hVar);
        this.f41068i = new h(hVar);
        this.f41069j = new i(hVar);
    }

    @Override // i5.q
    public int a(androidx.work.u uVar, String... strArr) {
        this.f41060a.b();
        StringBuilder sbB = m4.e.b();
        sbB.append("UPDATE workspec SET state=");
        sbB.append("?");
        sbB.append(" WHERE id IN (");
        m4.e.a(sbB, strArr.length);
        sbB.append(")");
        p4.f fVarD = this.f41060a.d(sbB.toString());
        fVarD.s0(1, v.j(uVar));
        int i10 = 2;
        for (String str : strArr) {
            if (str == null) {
                fVarD.E0(i10);
            } else {
                fVarD.h0(i10, str);
            }
            i10++;
        }
        this.f41060a.c();
        try {
            int iE = fVarD.E();
            this.f41060a.r();
            return iE;
        } finally {
            this.f41060a.g();
        }
    }

    @Override // i5.q
    public List b(long j10) throws Throwable {
        k4.c cVar;
        k4.c cVarC = k4.c.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        cVarC.s0(1, j10);
        this.f41060a.b();
        Cursor cursorB = m4.c.b(this.f41060a, cVarC, false, null);
        try {
            int iB = m4.b.b(cursorB, "required_network_type");
            int iB2 = m4.b.b(cursorB, "requires_charging");
            int iB3 = m4.b.b(cursorB, "requires_device_idle");
            int iB4 = m4.b.b(cursorB, "requires_battery_not_low");
            int iB5 = m4.b.b(cursorB, "requires_storage_not_low");
            int iB6 = m4.b.b(cursorB, "trigger_content_update_delay");
            int iB7 = m4.b.b(cursorB, "trigger_max_content_delay");
            int iB8 = m4.b.b(cursorB, "content_uri_triggers");
            int iB9 = m4.b.b(cursorB, "id");
            int iB10 = m4.b.b(cursorB, "state");
            int iB11 = m4.b.b(cursorB, "worker_class_name");
            int iB12 = m4.b.b(cursorB, "input_merger_class_name");
            int iB13 = m4.b.b(cursorB, "input");
            int iB14 = m4.b.b(cursorB, "output");
            cVar = cVarC;
            try {
                int iB15 = m4.b.b(cursorB, "initial_delay");
                int iB16 = m4.b.b(cursorB, "interval_duration");
                int iB17 = m4.b.b(cursorB, "flex_duration");
                int iB18 = m4.b.b(cursorB, "run_attempt_count");
                int iB19 = m4.b.b(cursorB, "backoff_policy");
                int iB20 = m4.b.b(cursorB, "backoff_delay_duration");
                int iB21 = m4.b.b(cursorB, "period_start_time");
                int iB22 = m4.b.b(cursorB, "minimum_retention_duration");
                int iB23 = m4.b.b(cursorB, "schedule_requested_at");
                int iB24 = m4.b.b(cursorB, "run_in_foreground");
                int iB25 = m4.b.b(cursorB, "out_of_quota_policy");
                int i10 = iB14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(iB9);
                    int i11 = iB9;
                    String string2 = cursorB.getString(iB11);
                    int i12 = iB11;
                    androidx.work.c cVar2 = new androidx.work.c();
                    int i13 = iB;
                    cVar2.k(v.e(cursorB.getInt(iB)));
                    cVar2.m(cursorB.getInt(iB2) != 0);
                    cVar2.n(cursorB.getInt(iB3) != 0);
                    cVar2.l(cursorB.getInt(iB4) != 0);
                    cVar2.o(cursorB.getInt(iB5) != 0);
                    int i14 = iB2;
                    int i15 = iB3;
                    cVar2.p(cursorB.getLong(iB6));
                    cVar2.q(cursorB.getLong(iB7));
                    cVar2.j(v.b(cursorB.getBlob(iB8)));
                    p pVar = new p(string, string2);
                    pVar.f41041b = v.g(cursorB.getInt(iB10));
                    pVar.f41043d = cursorB.getString(iB12);
                    pVar.f41044e = androidx.work.e.g(cursorB.getBlob(iB13));
                    int i16 = i10;
                    pVar.f41045f = androidx.work.e.g(cursorB.getBlob(i16));
                    int i17 = iB15;
                    i10 = i16;
                    pVar.f41046g = cursorB.getLong(i17);
                    int i18 = iB12;
                    int i19 = iB16;
                    pVar.f41047h = cursorB.getLong(i19);
                    int i20 = iB4;
                    int i21 = iB17;
                    pVar.f41048i = cursorB.getLong(i21);
                    int i22 = iB18;
                    pVar.f41050k = cursorB.getInt(i22);
                    int i23 = iB19;
                    pVar.f41051l = v.d(cursorB.getInt(i23));
                    iB17 = i21;
                    int i24 = iB20;
                    pVar.f41052m = cursorB.getLong(i24);
                    int i25 = iB21;
                    pVar.f41053n = cursorB.getLong(i25);
                    iB21 = i25;
                    int i26 = iB22;
                    pVar.f41054o = cursorB.getLong(i26);
                    int i27 = iB23;
                    pVar.f41055p = cursorB.getLong(i27);
                    int i28 = iB24;
                    pVar.f41056q = cursorB.getInt(i28) != 0;
                    int i29 = iB25;
                    pVar.f41057r = v.f(cursorB.getInt(i29));
                    pVar.f41049j = cVar2;
                    arrayList.add(pVar);
                    iB20 = i24;
                    iB4 = i20;
                    iB19 = i23;
                    iB2 = i14;
                    iB25 = i29;
                    iB12 = i18;
                    iB15 = i17;
                    iB16 = i19;
                    iB18 = i22;
                    iB23 = i27;
                    iB9 = i11;
                    iB11 = i12;
                    iB = i13;
                    iB24 = i28;
                    iB22 = i26;
                    iB3 = i15;
                }
                cursorB.close();
                cVar.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorB.close();
                cVar.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cVar = cVarC;
        }
    }

    @Override // i5.q
    public void d(p pVar) {
        this.f41060a.b();
        this.f41060a.c();
        try {
            this.f41061b.h(pVar);
            this.f41060a.r();
        } finally {
            this.f41060a.g();
        }
    }

    @Override // i5.q
    public void delete(String str) {
        this.f41060a.b();
        p4.f fVarA = this.f41062c.a();
        if (str == null) {
            fVarA.E0(1);
        } else {
            fVarA.h0(1, str);
        }
        this.f41060a.c();
        try {
            fVarA.E();
            this.f41060a.r();
        } finally {
            this.f41060a.g();
            this.f41062c.f(fVarA);
        }
    }

    @Override // i5.q
    public List e(String str) {
        k4.c cVarC = k4.c.c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            cVarC.E0(1);
        } else {
            cVarC.h0(1, str);
        }
        this.f41060a.b();
        Cursor cursorB = m4.c.b(this.f41060a, cVarC, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.getString(0));
            }
            cursorB.close();
            cVarC.release();
            return arrayList;
        } catch (Throwable th2) {
            cursorB.close();
            cVarC.release();
            throw th2;
        }
    }

    @Override // i5.q
    public androidx.work.u f(String str) {
        k4.c cVarC = k4.c.c("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            cVarC.E0(1);
        } else {
            cVarC.h0(1, str);
        }
        this.f41060a.b();
        Cursor cursorB = m4.c.b(this.f41060a, cVarC, false, null);
        try {
            return cursorB.moveToFirst() ? v.g(cursorB.getInt(0)) : null;
        } finally {
            cursorB.close();
            cVarC.release();
        }
    }

    @Override // i5.q
    public List h(String str) {
        k4.c cVarC = k4.c.c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            cVarC.E0(1);
        } else {
            cVarC.h0(1, str);
        }
        this.f41060a.b();
        Cursor cursorB = m4.c.b(this.f41060a, cVarC, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.getString(0));
            }
            cursorB.close();
            cVarC.release();
            return arrayList;
        } catch (Throwable th2) {
            cursorB.close();
            cVarC.release();
            throw th2;
        }
    }

    @Override // i5.q
    public List i(String str) {
        k4.c cVarC = k4.c.c("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            cVarC.E0(1);
        } else {
            cVarC.h0(1, str);
        }
        this.f41060a.b();
        Cursor cursorB = m4.c.b(this.f41060a, cVarC, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(androidx.work.e.g(cursorB.getBlob(0)));
            }
            cursorB.close();
            cVarC.release();
            return arrayList;
        } catch (Throwable th2) {
            cursorB.close();
            cVarC.release();
            throw th2;
        }
    }

    @Override // i5.q
    public List j(int i10) throws Throwable {
        k4.c cVar;
        k4.c cVarC = k4.c.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        cVarC.s0(1, i10);
        this.f41060a.b();
        Cursor cursorB = m4.c.b(this.f41060a, cVarC, false, null);
        try {
            int iB = m4.b.b(cursorB, "required_network_type");
            int iB2 = m4.b.b(cursorB, "requires_charging");
            int iB3 = m4.b.b(cursorB, "requires_device_idle");
            int iB4 = m4.b.b(cursorB, "requires_battery_not_low");
            int iB5 = m4.b.b(cursorB, "requires_storage_not_low");
            int iB6 = m4.b.b(cursorB, "trigger_content_update_delay");
            int iB7 = m4.b.b(cursorB, "trigger_max_content_delay");
            int iB8 = m4.b.b(cursorB, "content_uri_triggers");
            int iB9 = m4.b.b(cursorB, "id");
            int iB10 = m4.b.b(cursorB, "state");
            int iB11 = m4.b.b(cursorB, "worker_class_name");
            int iB12 = m4.b.b(cursorB, "input_merger_class_name");
            int iB13 = m4.b.b(cursorB, "input");
            int iB14 = m4.b.b(cursorB, "output");
            cVar = cVarC;
            try {
                int iB15 = m4.b.b(cursorB, "initial_delay");
                int iB16 = m4.b.b(cursorB, "interval_duration");
                int iB17 = m4.b.b(cursorB, "flex_duration");
                int iB18 = m4.b.b(cursorB, "run_attempt_count");
                int iB19 = m4.b.b(cursorB, "backoff_policy");
                int iB20 = m4.b.b(cursorB, "backoff_delay_duration");
                int iB21 = m4.b.b(cursorB, "period_start_time");
                int iB22 = m4.b.b(cursorB, "minimum_retention_duration");
                int iB23 = m4.b.b(cursorB, "schedule_requested_at");
                int iB24 = m4.b.b(cursorB, "run_in_foreground");
                int iB25 = m4.b.b(cursorB, "out_of_quota_policy");
                int i11 = iB14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(iB9);
                    int i12 = iB9;
                    String string2 = cursorB.getString(iB11);
                    int i13 = iB11;
                    androidx.work.c cVar2 = new androidx.work.c();
                    int i14 = iB;
                    cVar2.k(v.e(cursorB.getInt(iB)));
                    cVar2.m(cursorB.getInt(iB2) != 0);
                    cVar2.n(cursorB.getInt(iB3) != 0);
                    cVar2.l(cursorB.getInt(iB4) != 0);
                    cVar2.o(cursorB.getInt(iB5) != 0);
                    int i15 = iB2;
                    int i16 = iB3;
                    cVar2.p(cursorB.getLong(iB6));
                    cVar2.q(cursorB.getLong(iB7));
                    cVar2.j(v.b(cursorB.getBlob(iB8)));
                    p pVar = new p(string, string2);
                    pVar.f41041b = v.g(cursorB.getInt(iB10));
                    pVar.f41043d = cursorB.getString(iB12);
                    pVar.f41044e = androidx.work.e.g(cursorB.getBlob(iB13));
                    int i17 = i11;
                    pVar.f41045f = androidx.work.e.g(cursorB.getBlob(i17));
                    i11 = i17;
                    int i18 = iB15;
                    pVar.f41046g = cursorB.getLong(i18);
                    int i19 = iB12;
                    int i20 = iB16;
                    pVar.f41047h = cursorB.getLong(i20);
                    int i21 = iB4;
                    int i22 = iB17;
                    pVar.f41048i = cursorB.getLong(i22);
                    int i23 = iB18;
                    pVar.f41050k = cursorB.getInt(i23);
                    int i24 = iB19;
                    pVar.f41051l = v.d(cursorB.getInt(i24));
                    iB17 = i22;
                    int i25 = iB20;
                    pVar.f41052m = cursorB.getLong(i25);
                    int i26 = iB21;
                    pVar.f41053n = cursorB.getLong(i26);
                    iB21 = i26;
                    int i27 = iB22;
                    pVar.f41054o = cursorB.getLong(i27);
                    int i28 = iB23;
                    pVar.f41055p = cursorB.getLong(i28);
                    int i29 = iB24;
                    pVar.f41056q = cursorB.getInt(i29) != 0;
                    int i30 = iB25;
                    pVar.f41057r = v.f(cursorB.getInt(i30));
                    pVar.f41049j = cVar2;
                    arrayList.add(pVar);
                    iB20 = i25;
                    iB4 = i21;
                    iB19 = i24;
                    iB25 = i30;
                    iB2 = i15;
                    iB12 = i19;
                    iB15 = i18;
                    iB16 = i20;
                    iB18 = i23;
                    iB23 = i28;
                    iB9 = i12;
                    iB11 = i13;
                    iB = i14;
                    iB24 = i29;
                    iB22 = i27;
                    iB3 = i16;
                }
                cursorB.close();
                cVar.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorB.close();
                cVar.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cVar = cVarC;
        }
    }

    @Override // i5.q
    public int k() {
        this.f41060a.b();
        p4.f fVarA = this.f41068i.a();
        this.f41060a.c();
        try {
            int iE = fVarA.E();
            this.f41060a.r();
            return iE;
        } finally {
            this.f41060a.g();
            this.f41068i.f(fVarA);
        }
    }

    @Override // i5.q
    public int l(String str, long j10) {
        this.f41060a.b();
        p4.f fVarA = this.f41067h.a();
        fVarA.s0(1, j10);
        if (str == null) {
            fVarA.E0(2);
        } else {
            fVarA.h0(2, str);
        }
        this.f41060a.c();
        try {
            int iE = fVarA.E();
            this.f41060a.r();
            return iE;
        } finally {
            this.f41060a.g();
            this.f41067h.f(fVarA);
        }
    }

    @Override // i5.q
    public List m(String str) {
        k4.c cVarC = k4.c.c("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            cVarC.E0(1);
        } else {
            cVarC.h0(1, str);
        }
        this.f41060a.b();
        Cursor cursorB = m4.c.b(this.f41060a, cVarC, false, null);
        try {
            int iB = m4.b.b(cursorB, "id");
            int iB2 = m4.b.b(cursorB, "state");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                p.b bVar = new p.b();
                bVar.f41058a = cursorB.getString(iB);
                bVar.f41059b = v.g(cursorB.getInt(iB2));
                arrayList.add(bVar);
            }
            cursorB.close();
            cVarC.release();
            return arrayList;
        } catch (Throwable th2) {
            cursorB.close();
            cVarC.release();
            throw th2;
        }
    }

    @Override // i5.q
    public List n(int i10) throws Throwable {
        k4.c cVar;
        k4.c cVarC = k4.c.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        cVarC.s0(1, i10);
        this.f41060a.b();
        Cursor cursorB = m4.c.b(this.f41060a, cVarC, false, null);
        try {
            int iB = m4.b.b(cursorB, "required_network_type");
            int iB2 = m4.b.b(cursorB, "requires_charging");
            int iB3 = m4.b.b(cursorB, "requires_device_idle");
            int iB4 = m4.b.b(cursorB, "requires_battery_not_low");
            int iB5 = m4.b.b(cursorB, "requires_storage_not_low");
            int iB6 = m4.b.b(cursorB, "trigger_content_update_delay");
            int iB7 = m4.b.b(cursorB, "trigger_max_content_delay");
            int iB8 = m4.b.b(cursorB, "content_uri_triggers");
            int iB9 = m4.b.b(cursorB, "id");
            int iB10 = m4.b.b(cursorB, "state");
            int iB11 = m4.b.b(cursorB, "worker_class_name");
            int iB12 = m4.b.b(cursorB, "input_merger_class_name");
            int iB13 = m4.b.b(cursorB, "input");
            int iB14 = m4.b.b(cursorB, "output");
            cVar = cVarC;
            try {
                int iB15 = m4.b.b(cursorB, "initial_delay");
                int iB16 = m4.b.b(cursorB, "interval_duration");
                int iB17 = m4.b.b(cursorB, "flex_duration");
                int iB18 = m4.b.b(cursorB, "run_attempt_count");
                int iB19 = m4.b.b(cursorB, "backoff_policy");
                int iB20 = m4.b.b(cursorB, "backoff_delay_duration");
                int iB21 = m4.b.b(cursorB, "period_start_time");
                int iB22 = m4.b.b(cursorB, "minimum_retention_duration");
                int iB23 = m4.b.b(cursorB, "schedule_requested_at");
                int iB24 = m4.b.b(cursorB, "run_in_foreground");
                int iB25 = m4.b.b(cursorB, "out_of_quota_policy");
                int i11 = iB14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(iB9);
                    int i12 = iB9;
                    String string2 = cursorB.getString(iB11);
                    int i13 = iB11;
                    androidx.work.c cVar2 = new androidx.work.c();
                    int i14 = iB;
                    cVar2.k(v.e(cursorB.getInt(iB)));
                    cVar2.m(cursorB.getInt(iB2) != 0);
                    cVar2.n(cursorB.getInt(iB3) != 0);
                    cVar2.l(cursorB.getInt(iB4) != 0);
                    cVar2.o(cursorB.getInt(iB5) != 0);
                    int i15 = iB2;
                    int i16 = iB3;
                    cVar2.p(cursorB.getLong(iB6));
                    cVar2.q(cursorB.getLong(iB7));
                    cVar2.j(v.b(cursorB.getBlob(iB8)));
                    p pVar = new p(string, string2);
                    pVar.f41041b = v.g(cursorB.getInt(iB10));
                    pVar.f41043d = cursorB.getString(iB12);
                    pVar.f41044e = androidx.work.e.g(cursorB.getBlob(iB13));
                    int i17 = i11;
                    pVar.f41045f = androidx.work.e.g(cursorB.getBlob(i17));
                    i11 = i17;
                    int i18 = iB15;
                    pVar.f41046g = cursorB.getLong(i18);
                    int i19 = iB12;
                    int i20 = iB16;
                    pVar.f41047h = cursorB.getLong(i20);
                    int i21 = iB4;
                    int i22 = iB17;
                    pVar.f41048i = cursorB.getLong(i22);
                    int i23 = iB18;
                    pVar.f41050k = cursorB.getInt(i23);
                    int i24 = iB19;
                    pVar.f41051l = v.d(cursorB.getInt(i24));
                    iB17 = i22;
                    int i25 = iB20;
                    pVar.f41052m = cursorB.getLong(i25);
                    int i26 = iB21;
                    pVar.f41053n = cursorB.getLong(i26);
                    iB21 = i26;
                    int i27 = iB22;
                    pVar.f41054o = cursorB.getLong(i27);
                    int i28 = iB23;
                    pVar.f41055p = cursorB.getLong(i28);
                    int i29 = iB24;
                    pVar.f41056q = cursorB.getInt(i29) != 0;
                    int i30 = iB25;
                    pVar.f41057r = v.f(cursorB.getInt(i30));
                    pVar.f41049j = cVar2;
                    arrayList.add(pVar);
                    iB20 = i25;
                    iB4 = i21;
                    iB19 = i24;
                    iB25 = i30;
                    iB2 = i15;
                    iB12 = i19;
                    iB15 = i18;
                    iB16 = i20;
                    iB18 = i23;
                    iB23 = i28;
                    iB9 = i12;
                    iB11 = i13;
                    iB = i14;
                    iB24 = i29;
                    iB22 = i27;
                    iB3 = i16;
                }
                cursorB.close();
                cVar.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorB.close();
                cVar.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cVar = cVarC;
        }
    }

    @Override // i5.q
    public void o(String str, androidx.work.e eVar) throws Throwable {
        this.f41060a.b();
        p4.f fVarA = this.f41063d.a();
        byte[] bArrK = androidx.work.e.k(eVar);
        if (bArrK == null) {
            fVarA.E0(1);
        } else {
            fVarA.u0(1, bArrK);
        }
        if (str == null) {
            fVarA.E0(2);
        } else {
            fVarA.h0(2, str);
        }
        this.f41060a.c();
        try {
            fVarA.E();
            this.f41060a.r();
        } finally {
            this.f41060a.g();
            this.f41063d.f(fVarA);
        }
    }

    @Override // i5.q
    public List p() throws Throwable {
        k4.c cVar;
        k4.c cVarC = k4.c.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f41060a.b();
        Cursor cursorB = m4.c.b(this.f41060a, cVarC, false, null);
        try {
            int iB = m4.b.b(cursorB, "required_network_type");
            int iB2 = m4.b.b(cursorB, "requires_charging");
            int iB3 = m4.b.b(cursorB, "requires_device_idle");
            int iB4 = m4.b.b(cursorB, "requires_battery_not_low");
            int iB5 = m4.b.b(cursorB, "requires_storage_not_low");
            int iB6 = m4.b.b(cursorB, "trigger_content_update_delay");
            int iB7 = m4.b.b(cursorB, "trigger_max_content_delay");
            int iB8 = m4.b.b(cursorB, "content_uri_triggers");
            int iB9 = m4.b.b(cursorB, "id");
            int iB10 = m4.b.b(cursorB, "state");
            int iB11 = m4.b.b(cursorB, "worker_class_name");
            int iB12 = m4.b.b(cursorB, "input_merger_class_name");
            int iB13 = m4.b.b(cursorB, "input");
            int iB14 = m4.b.b(cursorB, "output");
            cVar = cVarC;
            try {
                int iB15 = m4.b.b(cursorB, "initial_delay");
                int iB16 = m4.b.b(cursorB, "interval_duration");
                int iB17 = m4.b.b(cursorB, "flex_duration");
                int iB18 = m4.b.b(cursorB, "run_attempt_count");
                int iB19 = m4.b.b(cursorB, "backoff_policy");
                int iB20 = m4.b.b(cursorB, "backoff_delay_duration");
                int iB21 = m4.b.b(cursorB, "period_start_time");
                int iB22 = m4.b.b(cursorB, "minimum_retention_duration");
                int iB23 = m4.b.b(cursorB, "schedule_requested_at");
                int iB24 = m4.b.b(cursorB, "run_in_foreground");
                int iB25 = m4.b.b(cursorB, "out_of_quota_policy");
                int i10 = iB14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(iB9);
                    int i11 = iB9;
                    String string2 = cursorB.getString(iB11);
                    int i12 = iB11;
                    androidx.work.c cVar2 = new androidx.work.c();
                    int i13 = iB;
                    cVar2.k(v.e(cursorB.getInt(iB)));
                    cVar2.m(cursorB.getInt(iB2) != 0);
                    cVar2.n(cursorB.getInt(iB3) != 0);
                    cVar2.l(cursorB.getInt(iB4) != 0);
                    cVar2.o(cursorB.getInt(iB5) != 0);
                    int i14 = iB2;
                    int i15 = iB3;
                    cVar2.p(cursorB.getLong(iB6));
                    cVar2.q(cursorB.getLong(iB7));
                    cVar2.j(v.b(cursorB.getBlob(iB8)));
                    p pVar = new p(string, string2);
                    pVar.f41041b = v.g(cursorB.getInt(iB10));
                    pVar.f41043d = cursorB.getString(iB12);
                    pVar.f41044e = androidx.work.e.g(cursorB.getBlob(iB13));
                    int i16 = i10;
                    pVar.f41045f = androidx.work.e.g(cursorB.getBlob(i16));
                    i10 = i16;
                    int i17 = iB15;
                    pVar.f41046g = cursorB.getLong(i17);
                    int i18 = iB13;
                    int i19 = iB16;
                    pVar.f41047h = cursorB.getLong(i19);
                    int i20 = iB4;
                    int i21 = iB17;
                    pVar.f41048i = cursorB.getLong(i21);
                    int i22 = iB18;
                    pVar.f41050k = cursorB.getInt(i22);
                    int i23 = iB19;
                    pVar.f41051l = v.d(cursorB.getInt(i23));
                    iB17 = i21;
                    int i24 = iB20;
                    pVar.f41052m = cursorB.getLong(i24);
                    int i25 = iB21;
                    pVar.f41053n = cursorB.getLong(i25);
                    iB21 = i25;
                    int i26 = iB22;
                    pVar.f41054o = cursorB.getLong(i26);
                    int i27 = iB23;
                    pVar.f41055p = cursorB.getLong(i27);
                    int i28 = iB24;
                    pVar.f41056q = cursorB.getInt(i28) != 0;
                    int i29 = iB25;
                    pVar.f41057r = v.f(cursorB.getInt(i29));
                    pVar.f41049j = cVar2;
                    arrayList.add(pVar);
                    iB20 = i24;
                    iB4 = i20;
                    iB19 = i23;
                    iB25 = i29;
                    iB2 = i14;
                    iB13 = i18;
                    iB15 = i17;
                    iB16 = i19;
                    iB18 = i22;
                    iB23 = i27;
                    iB9 = i11;
                    iB11 = i12;
                    iB = i13;
                    iB24 = i28;
                    iB22 = i26;
                    iB3 = i15;
                }
                cursorB.close();
                cVar.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorB.close();
                cVar.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cVar = cVarC;
        }
    }

    @Override // i5.q
    public boolean q() {
        boolean z10 = false;
        k4.c cVarC = k4.c.c("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f41060a.b();
        Cursor cursorB = m4.c.b(this.f41060a, cVarC, false, null);
        try {
            if (cursorB.moveToFirst() && cursorB.getInt(0) != 0) {
                z10 = true;
            }
            return z10;
        } finally {
            cursorB.close();
            cVarC.release();
        }
    }

    @Override // i5.q
    public int r(String str) {
        this.f41060a.b();
        p4.f fVarA = this.f41066g.a();
        if (str == null) {
            fVarA.E0(1);
        } else {
            fVarA.h0(1, str);
        }
        this.f41060a.c();
        try {
            int iE = fVarA.E();
            this.f41060a.r();
            return iE;
        } finally {
            this.f41060a.g();
            this.f41066g.f(fVarA);
        }
    }

    @Override // i5.q
    public int s(String str) {
        this.f41060a.b();
        p4.f fVarA = this.f41065f.a();
        if (str == null) {
            fVarA.E0(1);
        } else {
            fVarA.h0(1, str);
        }
        this.f41060a.c();
        try {
            int iE = fVarA.E();
            this.f41060a.r();
            return iE;
        } finally {
            this.f41060a.g();
            this.f41065f.f(fVarA);
        }
    }

    @Override // i5.q
    public void t(String str, long j10) {
        this.f41060a.b();
        p4.f fVarA = this.f41064e.a();
        fVarA.s0(1, j10);
        if (str == null) {
            fVarA.E0(2);
        } else {
            fVarA.h0(2, str);
        }
        this.f41060a.c();
        try {
            fVarA.E();
            this.f41060a.r();
        } finally {
            this.f41060a.g();
            this.f41064e.f(fVarA);
        }
    }

    @Override // i5.q
    public List c() throws Throwable {
        k4.c cVar;
        k4.c cVarC = k4.c.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f41060a.b();
        Cursor cursorB = m4.c.b(this.f41060a, cVarC, false, null);
        try {
            int iB = m4.b.b(cursorB, "required_network_type");
            int iB2 = m4.b.b(cursorB, qnwOeeQSSWa.aSIMZilfkTDd);
            int iB3 = m4.b.b(cursorB, "requires_device_idle");
            int iB4 = m4.b.b(cursorB, "requires_battery_not_low");
            int iB5 = m4.b.b(cursorB, "requires_storage_not_low");
            int iB6 = m4.b.b(cursorB, "trigger_content_update_delay");
            int iB7 = m4.b.b(cursorB, "trigger_max_content_delay");
            int iB8 = m4.b.b(cursorB, "content_uri_triggers");
            int iB9 = m4.b.b(cursorB, "id");
            int iB10 = m4.b.b(cursorB, "state");
            int iB11 = m4.b.b(cursorB, "worker_class_name");
            int iB12 = m4.b.b(cursorB, "input_merger_class_name");
            int iB13 = m4.b.b(cursorB, "input");
            int iB14 = m4.b.b(cursorB, "output");
            cVar = cVarC;
            try {
                int iB15 = m4.b.b(cursorB, "initial_delay");
                int iB16 = m4.b.b(cursorB, "interval_duration");
                int iB17 = m4.b.b(cursorB, "flex_duration");
                int iB18 = m4.b.b(cursorB, "run_attempt_count");
                int iB19 = m4.b.b(cursorB, "backoff_policy");
                int iB20 = m4.b.b(cursorB, "backoff_delay_duration");
                int iB21 = m4.b.b(cursorB, "period_start_time");
                int iB22 = m4.b.b(cursorB, "minimum_retention_duration");
                int iB23 = m4.b.b(cursorB, "schedule_requested_at");
                int iB24 = m4.b.b(cursorB, "run_in_foreground");
                int iB25 = m4.b.b(cursorB, "out_of_quota_policy");
                int i10 = iB14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(iB9);
                    int i11 = iB9;
                    String string2 = cursorB.getString(iB11);
                    int i12 = iB11;
                    androidx.work.c cVar2 = new androidx.work.c();
                    int i13 = iB;
                    cVar2.k(v.e(cursorB.getInt(iB)));
                    cVar2.m(cursorB.getInt(iB2) != 0);
                    cVar2.n(cursorB.getInt(iB3) != 0);
                    cVar2.l(cursorB.getInt(iB4) != 0);
                    cVar2.o(cursorB.getInt(iB5) != 0);
                    int i14 = iB2;
                    int i15 = iB3;
                    cVar2.p(cursorB.getLong(iB6));
                    cVar2.q(cursorB.getLong(iB7));
                    cVar2.j(v.b(cursorB.getBlob(iB8)));
                    p pVar = new p(string, string2);
                    pVar.f41041b = v.g(cursorB.getInt(iB10));
                    pVar.f41043d = cursorB.getString(iB12);
                    pVar.f41044e = androidx.work.e.g(cursorB.getBlob(iB13));
                    int i16 = i10;
                    pVar.f41045f = androidx.work.e.g(cursorB.getBlob(i16));
                    i10 = i16;
                    int i17 = iB15;
                    pVar.f41046g = cursorB.getLong(i17);
                    int i18 = iB13;
                    int i19 = iB16;
                    pVar.f41047h = cursorB.getLong(i19);
                    int i20 = iB4;
                    int i21 = iB17;
                    pVar.f41048i = cursorB.getLong(i21);
                    int i22 = iB18;
                    pVar.f41050k = cursorB.getInt(i22);
                    int i23 = iB19;
                    pVar.f41051l = v.d(cursorB.getInt(i23));
                    iB17 = i21;
                    int i24 = iB20;
                    pVar.f41052m = cursorB.getLong(i24);
                    int i25 = iB21;
                    pVar.f41053n = cursorB.getLong(i25);
                    iB21 = i25;
                    int i26 = iB22;
                    pVar.f41054o = cursorB.getLong(i26);
                    int i27 = iB23;
                    pVar.f41055p = cursorB.getLong(i27);
                    int i28 = iB24;
                    pVar.f41056q = cursorB.getInt(i28) != 0;
                    int i29 = iB25;
                    pVar.f41057r = v.f(cursorB.getInt(i29));
                    pVar.f41049j = cVar2;
                    arrayList.add(pVar);
                    iB20 = i24;
                    iB4 = i20;
                    iB19 = i23;
                    iB25 = i29;
                    iB2 = i14;
                    iB13 = i18;
                    iB15 = i17;
                    iB16 = i19;
                    iB18 = i22;
                    iB23 = i27;
                    iB9 = i11;
                    iB11 = i12;
                    iB = i13;
                    iB24 = i28;
                    iB22 = i26;
                    iB3 = i15;
                }
                cursorB.close();
                cVar.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorB.close();
                cVar.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cVar = cVarC;
        }
    }

    @Override // i5.q
    public p g(String str) throws Throwable {
        k4.c cVar;
        p pVar;
        k4.c cVarC = k4.c.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            cVarC.E0(1);
        } else {
            cVarC.h0(1, str);
        }
        this.f41060a.b();
        Cursor cursorB = m4.c.b(this.f41060a, cVarC, false, null);
        try {
            int iB = m4.b.b(cursorB, "required_network_type");
            int iB2 = m4.b.b(cursorB, "requires_charging");
            int iB3 = m4.b.b(cursorB, "requires_device_idle");
            int iB4 = m4.b.b(cursorB, "requires_battery_not_low");
            int iB5 = m4.b.b(cursorB, "requires_storage_not_low");
            int iB6 = m4.b.b(cursorB, "trigger_content_update_delay");
            int iB7 = m4.b.b(cursorB, "trigger_max_content_delay");
            int iB8 = m4.b.b(cursorB, "content_uri_triggers");
            int iB9 = m4.b.b(cursorB, IAoPeRfJn.iqAAAYDlpM);
            int iB10 = m4.b.b(cursorB, "state");
            int iB11 = m4.b.b(cursorB, "worker_class_name");
            int iB12 = m4.b.b(cursorB, "input_merger_class_name");
            int iB13 = m4.b.b(cursorB, "input");
            int iB14 = m4.b.b(cursorB, "output");
            cVar = cVarC;
            try {
                int iB15 = m4.b.b(cursorB, "initial_delay");
                int iB16 = m4.b.b(cursorB, "interval_duration");
                int iB17 = m4.b.b(cursorB, "flex_duration");
                int iB18 = m4.b.b(cursorB, "run_attempt_count");
                int iB19 = m4.b.b(cursorB, "backoff_policy");
                int iB20 = m4.b.b(cursorB, "backoff_delay_duration");
                int iB21 = m4.b.b(cursorB, "period_start_time");
                int iB22 = m4.b.b(cursorB, "minimum_retention_duration");
                int iB23 = m4.b.b(cursorB, "schedule_requested_at");
                int iB24 = m4.b.b(cursorB, "run_in_foreground");
                int iB25 = m4.b.b(cursorB, "out_of_quota_policy");
                if (cursorB.moveToFirst()) {
                    String string = cursorB.getString(iB9);
                    String string2 = cursorB.getString(iB11);
                    androidx.work.c cVar2 = new androidx.work.c();
                    cVar2.k(v.e(cursorB.getInt(iB)));
                    cVar2.m(cursorB.getInt(iB2) != 0);
                    cVar2.n(cursorB.getInt(iB3) != 0);
                    cVar2.l(cursorB.getInt(iB4) != 0);
                    cVar2.o(cursorB.getInt(iB5) != 0);
                    cVar2.p(cursorB.getLong(iB6));
                    cVar2.q(cursorB.getLong(iB7));
                    cVar2.j(v.b(cursorB.getBlob(iB8)));
                    p pVar2 = new p(string, string2);
                    pVar2.f41041b = v.g(cursorB.getInt(iB10));
                    pVar2.f41043d = cursorB.getString(iB12);
                    pVar2.f41044e = androidx.work.e.g(cursorB.getBlob(iB13));
                    pVar2.f41045f = androidx.work.e.g(cursorB.getBlob(iB14));
                    pVar2.f41046g = cursorB.getLong(iB15);
                    pVar2.f41047h = cursorB.getLong(iB16);
                    pVar2.f41048i = cursorB.getLong(iB17);
                    pVar2.f41050k = cursorB.getInt(iB18);
                    pVar2.f41051l = v.d(cursorB.getInt(iB19));
                    pVar2.f41052m = cursorB.getLong(iB20);
                    pVar2.f41053n = cursorB.getLong(iB21);
                    pVar2.f41054o = cursorB.getLong(iB22);
                    pVar2.f41055p = cursorB.getLong(iB23);
                    pVar2.f41056q = cursorB.getInt(iB24) != 0;
                    pVar2.f41057r = v.f(cursorB.getInt(iB25));
                    pVar2.f41049j = cVar2;
                    pVar = pVar2;
                } else {
                    pVar = null;
                }
                cursorB.close();
                cVar.release();
                return pVar;
            } catch (Throwable th2) {
                th = th2;
                cursorB.close();
                cVar.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cVar = cVarC;
        }
    }
}

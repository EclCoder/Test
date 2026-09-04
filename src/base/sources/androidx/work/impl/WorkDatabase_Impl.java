package androidx.work.impl;

import androidx.core.app.NotificationCompat;
import androidx.room.i;
import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import i5.b;
import i5.e;
import i5.h;
import i5.k;
import i5.l;
import i5.n;
import i5.o;
import i5.q;
import i5.r;
import i5.t;
import i5.u;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import m4.c;
import m4.f;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile q f7846m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile b f7847n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile t f7848o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile h f7849p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile k f7850q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile n f7851r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile e f7852s;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    class a extends i.a {
        a(int i10) {
            super(i10);
        }

        @Override // androidx.room.i.a
        public void a(p4.b bVar) {
            bVar.B("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.B("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            bVar.B("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            bVar.B("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            bVar.B("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            bVar.B("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            bVar.B("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.B("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            bVar.B("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.B("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.B("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            bVar.B("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.B("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            bVar.B("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.B("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // androidx.room.i.a
        public void b(p4.b bVar) {
            bVar.B("DROP TABLE IF EXISTS `Dependency`");
            bVar.B("DROP TABLE IF EXISTS `WorkSpec`");
            bVar.B("DROP TABLE IF EXISTS `WorkTag`");
            bVar.B("DROP TABLE IF EXISTS `SystemIdInfo`");
            bVar.B("DROP TABLE IF EXISTS `WorkName`");
            bVar.B("DROP TABLE IF EXISTS `WorkProgress`");
            bVar.B("DROP TABLE IF EXISTS `Preference`");
            if (((androidx.room.h) WorkDatabase_Impl.this).f7153h != null) {
                int size = ((androidx.room.h) WorkDatabase_Impl.this).f7153h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((androidx.room.h.b) ((androidx.room.h) WorkDatabase_Impl.this).f7153h.get(i10)).b(bVar);
                }
            }
        }

        @Override // androidx.room.i.a
        protected void c(p4.b bVar) {
            if (((androidx.room.h) WorkDatabase_Impl.this).f7153h != null) {
                int size = ((androidx.room.h) WorkDatabase_Impl.this).f7153h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((androidx.room.h.b) ((androidx.room.h) WorkDatabase_Impl.this).f7153h.get(i10)).a(bVar);
                }
            }
        }

        @Override // androidx.room.i.a
        public void d(p4.b bVar) {
            ((androidx.room.h) WorkDatabase_Impl.this).f7146a = bVar;
            bVar.B("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.m(bVar);
            if (((androidx.room.h) WorkDatabase_Impl.this).f7153h != null) {
                int size = ((androidx.room.h) WorkDatabase_Impl.this).f7153h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((androidx.room.h.b) ((androidx.room.h) WorkDatabase_Impl.this).f7153h.get(i10)).c(bVar);
                }
            }
        }

        @Override // androidx.room.i.a
        public void e(p4.b bVar) {
        }

        @Override // androidx.room.i.a
        public void f(p4.b bVar) {
            c.a(bVar);
        }

        @Override // androidx.room.i.a
        protected i.b g(p4.b bVar) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 1, null, 1));
            map.put("prerequisite_id", new f.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new f.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
            hashSet2.add(new f.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
            f fVar = new f("Dependency", map, hashSet, hashSet2);
            f fVarA = f.a(bVar, "Dependency");
            if (!fVar.equals(fVarA)) {
                return new i.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + fVar + "\n Found:\n" + fVarA);
            }
            HashMap map2 = new HashMap(25);
            map2.put("id", new f.a("id", "TEXT", true, 1, null, 1));
            map2.put("state", new f.a("state", "INTEGER", true, 0, null, 1));
            map2.put("worker_class_name", new f.a("worker_class_name", "TEXT", true, 0, null, 1));
            map2.put("input_merger_class_name", new f.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            map2.put("input", new f.a("input", "BLOB", true, 0, null, 1));
            map2.put("output", new f.a("output", "BLOB", true, 0, null, 1));
            map2.put("initial_delay", new f.a("initial_delay", "INTEGER", true, 0, null, 1));
            map2.put("interval_duration", new f.a("interval_duration", "INTEGER", true, 0, null, 1));
            map2.put(dOIDCKnIR.uaUTkcei, new f.a("flex_duration", "INTEGER", true, 0, null, 1));
            map2.put("run_attempt_count", new f.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            map2.put("backoff_policy", new f.a("backoff_policy", "INTEGER", true, 0, null, 1));
            map2.put("backoff_delay_duration", new f.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            map2.put("period_start_time", new f.a("period_start_time", "INTEGER", true, 0, null, 1));
            map2.put("minimum_retention_duration", new f.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            map2.put("schedule_requested_at", new f.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            map2.put("run_in_foreground", new f.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            map2.put("out_of_quota_policy", new f.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            map2.put("required_network_type", new f.a("required_network_type", "INTEGER", false, 0, null, 1));
            map2.put("requires_charging", new f.a("requires_charging", "INTEGER", true, 0, null, 1));
            map2.put("requires_device_idle", new f.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            map2.put("requires_battery_not_low", new f.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            map2.put("requires_storage_not_low", new f.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            map2.put("trigger_content_update_delay", new f.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            map2.put("trigger_max_content_delay", new f.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            map2.put("content_uri_triggers", new f.a("content_uri_triggers", "BLOB", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new f.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
            hashSet4.add(new f.d("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
            f fVar2 = new f("WorkSpec", map2, hashSet3, hashSet4);
            f fVarA2 = f.a(bVar, "WorkSpec");
            if (!fVar2.equals(fVarA2)) {
                return new i.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + fVar2 + "\n Found:\n" + fVarA2);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new f.a("tag", "TEXT", true, 1, null, 1));
            map3.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new f.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
            f fVar3 = new f("WorkTag", map3, hashSet5, hashSet6);
            f fVarA3 = f.a(bVar, "WorkTag");
            if (!fVar3.equals(fVarA3)) {
                return new i.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + fVar3 + "\n Found:\n" + fVarA3);
            }
            HashMap map4 = new HashMap(2);
            map4.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 1, null, 1));
            map4.put("system_id", new f.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            f fVar4 = new f("SystemIdInfo", map4, hashSet7, new HashSet(0));
            f fVarA4 = f.a(bVar, "SystemIdInfo");
            if (!fVar4.equals(fVarA4)) {
                return new i.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + fVar4 + "\n Found:\n" + fVarA4);
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new f.a("name", "TEXT", true, 1, null, 1));
            map5.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new f.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
            f fVar5 = new f("WorkName", map5, hashSet8, hashSet9);
            f fVarA5 = f.a(bVar, "WorkName");
            if (!fVar5.equals(fVarA5)) {
                return new i.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + fVar5 + "\n Found:\n" + fVarA5);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 1, null, 1));
            map6.put(NotificationCompat.CATEGORY_PROGRESS, new f.a(NotificationCompat.CATEGORY_PROGRESS, "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            f fVar6 = new f("WorkProgress", map6, hashSet10, new HashSet(0));
            f fVarA6 = f.a(bVar, "WorkProgress");
            if (!fVar6.equals(fVarA6)) {
                return new i.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + fVar6 + "\n Found:\n" + fVarA6);
            }
            HashMap map7 = new HashMap(2);
            map7.put("key", new f.a("key", "TEXT", true, 1, null, 1));
            map7.put("long_value", new f.a("long_value", "INTEGER", false, 0, null, 1));
            f fVar7 = new f("Preference", map7, new HashSet(0), new HashSet(0));
            f fVarA7 = f.a(bVar, "Preference");
            if (fVar7.equals(fVarA7)) {
                return new i.b(true, null);
            }
            return new i.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + fVar7 + "\n Found:\n" + fVarA7);
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    public n A() {
        n nVar;
        if (this.f7851r != null) {
            return this.f7851r;
        }
        synchronized (this) {
            try {
                if (this.f7851r == null) {
                    this.f7851r = new o(this);
                }
                nVar = this.f7851r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public q B() {
        q qVar;
        if (this.f7846m != null) {
            return this.f7846m;
        }
        synchronized (this) {
            try {
                if (this.f7846m == null) {
                    this.f7846m = new r(this);
                }
                qVar = this.f7846m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public t C() {
        t tVar;
        if (this.f7848o != null) {
            return this.f7848o;
        }
        synchronized (this) {
            try {
                if (this.f7848o == null) {
                    this.f7848o = new u(this);
                }
                tVar = this.f7848o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVar;
    }

    @Override // androidx.room.h
    protected androidx.room.e e() {
        return new androidx.room.e(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.h
    protected p4.c f(androidx.room.a aVar) {
        return aVar.f7082a.a(p4.c.b.a(aVar.f7083b).c(aVar.f7084c).b(new i(aVar, new a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6")).a());
    }

    @Override // androidx.work.impl.WorkDatabase
    public b t() {
        b bVar;
        if (this.f7847n != null) {
            return this.f7847n;
        }
        synchronized (this) {
            try {
                if (this.f7847n == null) {
                    this.f7847n = new i5.c(this);
                }
                bVar = this.f7847n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public e x() {
        e eVar;
        if (this.f7852s != null) {
            return this.f7852s;
        }
        synchronized (this) {
            try {
                if (this.f7852s == null) {
                    this.f7852s = new i5.f(this);
                }
                eVar = this.f7852s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public h y() {
        h hVar;
        if (this.f7849p != null) {
            return this.f7849p;
        }
        synchronized (this) {
            try {
                if (this.f7849p == null) {
                    this.f7849p = new i5.i(this);
                }
                hVar = this.f7849p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public k z() {
        k kVar;
        if (this.f7850q != null) {
            return this.f7850q;
        }
        synchronized (this) {
            try {
                if (this.f7850q == null) {
                    this.f7850q = new l(this);
                }
                kVar = this.f7850q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }
}

package androidx.work.impl;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static l4.a f7854a = new C0102a(1, 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static l4.a f7855b = new b(3, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static l4.a f7856c = new c(4, 5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static l4.a f7857d = new d(6, 7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static l4.a f7858e = new e(7, 8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static l4.a f7859f = new f(8, 9);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static l4.a f7860g = new g(11, 12);

    /* JADX INFO: renamed from: androidx.work.impl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0102a extends l4.a {
        C0102a(int i10, int i11) {
            super(i10, i11);
        }

        @Override // l4.a
        public void a(p4.b bVar) {
            bVar.B("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.B("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            bVar.B("DROP TABLE IF EXISTS alarmInfo");
            bVar.B("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends l4.a {
        b(int i10, int i11) {
            super(i10, i11);
        }

        @Override // l4.a
        public void a(p4.b bVar) {
            bVar.B("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends l4.a {
        c(int i10, int i11) {
            super(i10, i11);
        }

        @Override // l4.a
        public void a(p4.b bVar) {
            bVar.B("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            bVar.B("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d extends l4.a {
        d(int i10, int i11) {
            super(i10, i11);
        }

        @Override // l4.a
        public void a(p4.b bVar) {
            bVar.B("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e extends l4.a {
        e(int i10, int i11) {
            super(i10, i11);
        }

        @Override // l4.a
        public void a(p4.b bVar) {
            bVar.B("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f extends l4.a {
        f(int i10, int i11) {
            super(i10, i11);
        }

        @Override // l4.a
        public void a(p4.b bVar) {
            bVar.B("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g extends l4.a {
        g(int i10, int i11) {
            super(i10, i11);
        }

        @Override // l4.a
        public void a(p4.b bVar) {
            bVar.B("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class h extends l4.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Context f7861c;

        public h(Context context, int i10, int i11) {
            super(i10, i11);
            this.f7861c = context;
        }

        @Override // l4.a
        public void a(p4.b bVar) {
            if (this.f43896b >= 10) {
                bVar.M("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f7861c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class i extends l4.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Context f7862c;

        public i(Context context) {
            super(9, 10);
            this.f7862c = context;
        }

        @Override // l4.a
        public void a(p4.b bVar) {
            bVar.B("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            j5.f.b(this.f7862c, bVar);
            j5.d.a(this.f7862c, bVar);
        }
    }
}

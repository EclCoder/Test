package j5;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WorkDatabase f42016a;

    public d(WorkDatabase workDatabase) {
        this.f42016a = workDatabase;
    }

    public static void a(Context context, p4.b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i10 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i11 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            bVar.x();
            try {
                bVar.M("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                bVar.M("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                sharedPreferences.edit().clear().apply();
                bVar.L();
            } finally {
                bVar.P();
            }
        }
    }

    private int c(String str) {
        this.f42016a.c();
        try {
            Long lA = this.f42016a.x().a(str);
            int i10 = 0;
            int iIntValue = lA != null ? lA.intValue() : 0;
            if (iIntValue != Integer.MAX_VALUE) {
                i10 = iIntValue + 1;
            }
            e(str, i10);
            this.f42016a.r();
            return iIntValue;
        } finally {
            this.f42016a.g();
        }
    }

    private void e(String str, int i10) {
        this.f42016a.x().b(new i5.d(str, i10));
    }

    public int b() {
        int iC;
        synchronized (d.class) {
            iC = c("next_alarm_manager_id");
        }
        return iC;
    }

    public int d(int i10, int i11) {
        synchronized (d.class) {
            int iC = c("next_job_scheduler_id");
            if (iC < i10 || iC > i11) {
                e("next_job_scheduler_id", i10 + 1);
            } else {
                i10 = iC;
            }
        }
        return i10;
    }
}

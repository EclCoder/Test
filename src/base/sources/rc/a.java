package rc;

import android.content.Context;
import com.google.android.gms.internal.consent_sdk.zzct;
import com.google.android.gms.internal.consent_sdk.zzdb;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f51259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f51260b;

    /* JADX INFO: renamed from: rc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class C0791a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f51262b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f51264d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f51261a = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f51263c = 0;

        public C0791a(Context context) {
            this.f51262b = context.getApplicationContext();
        }

        public a a() {
            boolean z10 = true;
            if (!zzdb.zza(true) && !this.f51261a.contains(zzct.zza(this.f51262b)) && !this.f51264d) {
                z10 = false;
            }
            return new a(z10, this, null);
        }
    }

    /* synthetic */ a(boolean z10, C0791a c0791a, g gVar) {
        this.f51259a = z10;
        this.f51260b = c0791a.f51263c;
    }

    public int a() {
        return this.f51260b;
    }

    public boolean b() {
        return this.f51259a;
    }
}

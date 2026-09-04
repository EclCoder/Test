package rc;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzbq;
import com.google.android.gms.internal.consent_sdk.zzcz;
import java.util.Objects;
import rc.b;
import rc.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void onConsentFormLoadFailure(e eVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void onConsentFormLoadSuccess(rc.b bVar);
    }

    public static c a(Context context) {
        return zza.zza(context).zzb();
    }

    public static void b(final Activity activity, final rc.b.a aVar) {
        zza zzaVarZza = zza.zza(activity);
        if (zzaVarZza.zzb().canRequestAds()) {
            aVar.a(null);
            return;
        }
        zzaVarZza.zzd().zzc();
        zzbq zzbqVarZzc = zzaVarZza.zzc();
        zzcz.zza();
        b bVar = new b() { // from class: com.google.android.gms.internal.consent_sdk.zzbo
            @Override // rc.f.b
            public final void onConsentFormLoadSuccess(b bVar2) {
                bVar2.show(activity, aVar);
            }
        };
        Objects.requireNonNull(aVar);
        zzbqVarZzc.zzb(bVar, new a() { // from class: com.google.android.gms.internal.consent_sdk.zzbp
            @Override // rc.f.a
            public final void onConsentFormLoadFailure(e eVar) {
                aVar.a(eVar);
            }
        }, true);
    }

    public static void c(Activity activity, rc.b.a aVar) {
        zza.zza(activity).zzc().zze(activity, aVar);
    }
}

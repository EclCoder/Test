package com.google.android.gms.internal.measurement;

import com.bytedance.sdk.component.adexpress.hnj.qor.FCv.giNWGaNAgVQoO;
import com.google.common.io.BaseEncoding;
import java.io.File;
import sc.x;
import sc.y;
import uc.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzmz {
    private final BaseEncoding zza = BaseEncoding.b();
    private final x zzb;
    private final x zzc;

    public final File zza() {
        String str = (String) this.zzb.get();
        String str2 = (String) this.zzc.get();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length() + 3);
        sb2.append(str);
        sb2.append("/");
        sb2.append(str2);
        sb2.append(".pb");
        return new File(sb2.toString());
    }

    final /* synthetic */ String zzb(zzacr zzacrVar) {
        return this.zza.f(zzacrVar.zzm());
    }

    final /* synthetic */ String zzc(String str, String str2) {
        return this.zza.f(g.a().d().a(str.getBytes()).c((byte) 0).a("".getBytes()).b().d());
    }

    public zzmz(final zzacr zzacrVar, final String str, String str2) {
        this.zzb = y.a(new x() { // from class: com.google.android.gms.internal.measurement.zzmy
            @Override // sc.x
            public final /* synthetic */ Object get() {
                return this.zza.zzb(zzacrVar);
            }
        });
        final String str3 = giNWGaNAgVQoO.JjBNlDeiTwmz;
        this.zzc = y.a(new x(str, str3) { // from class: com.google.android.gms.internal.measurement.zzmx
            private final /* synthetic */ String zzb;
            private final /* synthetic */ String zzc = "";

            @Override // sc.x
            public final /* synthetic */ Object get() {
                return this.zza.zzc(this.zzb, this.zzc);
            }
        });
    }
}

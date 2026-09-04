package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.zzat;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zzi extends RelativeLayout {
    final zzat zza;
    boolean zzb;

    public zzi(Context context, String str, String str2, String str3) {
        super(context);
        zzat zzatVar = new zzat(context, str);
        this.zza = zzatVar;
        zzatVar.zzd(str2);
        zzatVar.zzc(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.zzb) {
            return false;
        }
        this.zza.zza(motionEvent);
        return false;
    }
}

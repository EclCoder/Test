package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzcgh {
    private final WeakReference zza;

    public zzcgh(View view) {
        this.zza = new WeakReference(view);
    }

    protected abstract void zza(ViewTreeObserver viewTreeObserver);

    protected abstract void zzb(ViewTreeObserver viewTreeObserver);

    public final void zzc() {
        ViewTreeObserver viewTreeObserverZze = zze();
        if (viewTreeObserverZze != null) {
            zza(viewTreeObserverZze);
        }
    }

    public final void zzd() {
        ViewTreeObserver viewTreeObserverZze = zze();
        if (viewTreeObserverZze != null) {
            zzb(viewTreeObserverZze);
        }
    }

    protected final ViewTreeObserver zze() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.zza.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }
}

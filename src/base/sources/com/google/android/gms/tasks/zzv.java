package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzv extends LifecycleCallback {
    private final List zza;

    private zzv(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.zza = new ArrayList();
        this.mLifecycleFragment.addCallback("TaskOnStopCallback", this);
    }

    public static zzv zza(Activity activity) {
        zzv zzvVar;
        LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
        synchronized (fragment) {
            try {
                zzvVar = (zzv) fragment.getCallbackOrNull("TaskOnStopCallback", zzv.class);
                if (zzvVar == null) {
                    zzvVar = new zzv(fragment);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzvVar;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        List list = this.zza;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzq zzqVar = (zzq) ((WeakReference) it.next()).get();
                    if (zzqVar != null) {
                        zzqVar.zzb();
                    }
                }
                list.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzb(zzq zzqVar) {
        List list = this.zza;
        synchronized (list) {
            list.add(new WeakReference(zzqVar));
        }
    }
}

package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class zzaz extends AdListener {
    private final Object zza = new Object();
    private AdListener zzb;

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        synchronized (this.zza) {
            try {
                AdListener adListener = this.zzb;
                if (adListener != null) {
                    adListener.onAdClicked();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        synchronized (this.zza) {
            try {
                AdListener adListener = this.zzb;
                if (adListener != null) {
                    adListener.onAdClosed();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        synchronized (this.zza) {
            try {
                AdListener adListener = this.zzb;
                if (adListener != null) {
                    adListener.onAdFailedToLoad(loadAdError);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        synchronized (this.zza) {
            try {
                AdListener adListener = this.zzb;
                if (adListener != null) {
                    adListener.onAdImpression();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        synchronized (this.zza) {
            try {
                AdListener adListener = this.zzb;
                if (adListener != null) {
                    adListener.onAdLoaded();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        synchronized (this.zza) {
            try {
                AdListener adListener = this.zzb;
                if (adListener != null) {
                    adListener.onAdOpened();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zza(AdListener adListener) {
        synchronized (this.zza) {
            this.zzb = adListener;
        }
    }
}

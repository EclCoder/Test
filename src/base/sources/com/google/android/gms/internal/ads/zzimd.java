package com.google.android.gms.internal.ads;

import com.coremedia.iso.boxes.MovieHeaderBox;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzimd extends zzimb implements zzaup {
    private int zzg;

    protected zzimd(String str) {
        super(MovieHeaderBox.TYPE);
    }

    public final int zzg() {
        if (!this.zzb) {
            zzf();
        }
        return this.zzg;
    }

    protected final long zzh(ByteBuffer byteBuffer) {
        this.zzg = zzauo.zzc(byteBuffer.get());
        zzauo.zzb(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}

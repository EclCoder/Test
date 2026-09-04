package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.google.ads.mediation.admob.Mvp.IAoPeRfJn;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class ParcelFileDescriptorRewinder implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InternalRewinder f11233a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static final class InternalRewinder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ParcelFileDescriptor f11234a;

        InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f11234a = parcelFileDescriptor;
        }

        ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.f11234a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f11234a;
            } catch (ErrnoException e10) {
                throw new IOException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public static final class a implements e.a {
        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e b(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f11233a = new InternalRewinder(parcelFileDescriptor);
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.e
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor a() {
        return this.f11233a.rewind();
    }

    public static boolean c() {
        return !IAoPeRfJn.OiOpwJMfaFc.equals(Build.FINGERPRINT);
    }
}
